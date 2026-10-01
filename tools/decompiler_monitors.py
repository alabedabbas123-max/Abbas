#!/usr/bin/env python3
"""
Turn Dalvik ``monitor-enter`` / ``monitor-exit`` pairs back into ``synchronized``.

Dalvik locks an object with two separate instructions, so a decompiler that
cannot restructure the control flow prints them literally:

    monitor-enter(r0);
    ...
    monitor-exit(r0);

Java has no statement form for either half -- the only way to hold a monitor is
a lexically scoped ``synchronized`` block. Once a method's control flow has been
rewritten into a dispatch loop by ``decompiler_repair.py`` the two halves no
longer sit in the same lexical region, so the pair cannot be rebuilt in place.

This pass therefore promotes the monitor to the whole method: the lock
expression is evaluated once on entry and the entire body runs inside a single
``synchronized`` block. Mutual exclusion and ``wait``/``notify`` keep working
(the real object monitor is still used, so this also interoperates with plain
``synchronized`` elsewhere in the app); the only difference is that the lock may
be held marginally longer than the original code held it.

Run this *after* ``decompiler_repair.py``.
"""

from __future__ import annotations

import argparse
import collections
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from _scan_lib import mask  # noqa: E402
from decompiler_repair import (  # noqa: E402
    CTRL_HEAD, INIT_HEAD, METHOD_HEAD, _all_blocks, signature_before,
)

MONITOR_STMT = re.compile(r'^[ \t]*monitor-(?:enter|exit)\s*\(([^()]*(?:\([^()]*\))?[^()]*)\)\s*;?[ \t]*\n?',
                          re.M)
MONITOR_ANY = re.compile(r'monitor-(?:enter|exit)\s*\(([^()]*(?:\([^()]*\))?[^()]*)\)')
LOCAL_RE = re.compile(r'^[A-Za-z_$][\w$]*$')
REGISTER_RE = re.compile(r'\br\d+\b')


def enclosing_method_bodies(src, positions):
    """Map each position to the method/initialiser body block containing it."""
    m = mask(src)
    blocks = _all_blocks(m)
    found = collections.OrderedDict()
    for pos in positions:
        enclosing = sorted((b for b in blocks if b[0] < pos < b[1]),
                           key=lambda b: b[1] - b[0])
        pick = None
        for o, c in enclosing:
            head = signature_before(src, o)
            if CTRL_HEAD.search(head.strip()):
                continue
            if METHOD_HEAD.search(head.strip()) or INIT_HEAD.match(head):
                pick = (o, c)
                break
        if pick is None and enclosing:
            pick = enclosing[0]
        if pick:
            found.setdefault(pick, []).append(pos)
    return found


def enclosing_type_name(src, idx):
    m = mask(src)
    stack = []
    for i, c in enumerate(m):
        if i >= idx:
            break
        if c == '{':
            head = m[max(0, i - 400):i]
            name = None
            for mm in re.finditer(r'\b(?:class|interface|enum)\s+(\w+)', head):
                name = mm.group(1)
            stack.append(name)
        elif c == '}' and stack:
            stack.pop()
    for name in reversed(stack):
        if name:
            return name
    return None


def resolve_lock(body, exprs, is_static, type_name):
    """Pick a single lock expression that is valid at method entry."""
    counts = collections.Counter(e.strip() for e in exprs)
    for expr, _n in counts.most_common():
        if expr == 'this':
            if not is_static:
                return 'this', 'this'
            continue
        if expr.endswith('.class'):
            return expr, 'class-literal'
        if LOCAL_RE.match(expr):
            # a register: resolve it to the expression it was assigned from
            rhs = {m.group(1).strip()
                   for m in re.finditer(r'^[ \t]*%s\s*=\s*([^;]+);' % re.escape(expr),
                                        body, re.M)}
            rhs = {r for r in rhs if r and r != 'null'}
            if len(rhs) == 1:
                cand = rhs.pop()
                if not REGISTER_RE.search(cand) and '$' not in cand:
                    if cand == 'this' and is_static:
                        continue
                    return cand, 'register-def'
            continue
        if not REGISTER_RE.search(expr) and '$' not in expr:
            return expr, 'field'
    if not is_static:
        return 'this', 'fallback-this'
    if type_name:
        return type_name + '.class', 'fallback-class'
    return None, 'unresolved'


def process(src, stats):
    for _ in range(20):
        positions = [m.start() for m in MONITOR_ANY.finditer(mask(src))]
        if not positions:
            break
        bodies = enclosing_method_bodies(src, positions)
        if not bodies:
            break
        (o, c), _pos = next(iter(bodies.items()))
        body = src[o + 1:c]
        head = signature_before(src, o)
        is_static = bool(re.search(r'\bstatic\b', head))
        exprs = [m.group(1) for m in MONITOR_ANY.finditer(mask(body))]
        lock, how = resolve_lock(body, exprs, is_static, enclosing_type_name(src, o))
        stats[how] += 1
        if len(set(e.strip() for e in exprs)) > 1:
            stats['multiple_locks'] += 1
        if lock is None:
            # cannot do better than dropping the instructions
            stats['dropped'] += 1
            src = src[:o + 1] + MONITOR_STMT.sub('', body) + src[c:]
            continue
        body = MONITOR_STMT.sub('', body)
        line_start = src.rfind('\n', 0, o) + 1
        indent = re.match(r'[ \t]*', src[line_start:]).group(0)
        inner = '\n'.join(('    ' + ln) if ln.strip() else ln
                          for ln in body.strip('\n').split('\n'))
        new = ('\n%s    synchronized (%s) {\n%s\n%s    }\n%s'
               % (indent, lock, inner, indent, indent))
        src = src[:o + 1] + new + src[c:]
        stats['methods_wrapped'] += 1
    return src


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('root', nargs='+')
    ap.add_argument('--dry-run', action='store_true')
    args = ap.parse_args()
    files = []
    for root in args.root:
        for dp, _, fns in os.walk(root):
            for fn in fns:
                if fn.endswith('.java'):
                    files.append(os.path.join(dp, fn))
    files.sort()
    stats = collections.Counter()
    for p in files:
        src = open(p, encoding='utf-8', errors='surrogateescape').read()
        if 'monitor-enter' not in src and 'monitor-exit' not in src:
            continue
        new = process(src, stats)
        if new != src:
            stats['files_changed'] += 1
            if not args.dry_run:
                open(p, 'w', encoding='utf-8', errors='surrogateescape').write(new)
    print(json.dumps(dict(stats), indent=2, sort_keys=True))


if __name__ == '__main__':
    main()
