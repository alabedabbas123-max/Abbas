#!/usr/bin/env python3
"""
Textual repairs for JADX output that are independent of control flow.

Run this *before* ``decompiler_repair.py``.

Fixes
  1. jadx numeric annotations      ``101(0x65, float:1.42E-43)``   -> ``101``
  2. unknown ``??`` register types ``?? r0 = f();``                -> ``java.lang.Object r0 = f();``
  3. decompiled enums             ``abstract enum A extends java.lang.Enum<A>``
                                   -> ``abstract class A extends EnumBase``
     and their constant bodies    ``enum B extends A``             -> ``class B extends A``
     plus ``java.lang.Enum.valueOf(A.class, s)`` -> ``EnumBase.valueOf(A.values(), s)``
  4. static initialiser blocks inside an ``interface`` (illegal) are folded
     back into the field initialisers they assign.
  5. duplicated ``extends`` clauses on interfaces.
"""

from __future__ import annotations

import argparse
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from _scan_lib import mask  # noqa: E402

ENUM_BASE = 'com.almlkaide.kaypro.internal.EnumBase'

NUM_ANNOT = re.compile(r'(?<![\w.])(-?\d+)\(\s*0x[0-9a-fA-F]+\s*(?:,[^()]*)?\)')
QQ_TYPE = re.compile(r'(?<![\w?])\?\?(\s+[A-Za-z_$][\w$]*\s*[=;])')
ENUM_BASE_DECL = re.compile(
    r'\benum\s+(?P<name>\w+)\s+extends\s+java\.lang\.Enum\s*<[^<>]*(?:<[^<>]*>)?[^<>]*>')
ENUM_CONST_DECL = re.compile(r'\benum\s+(?P<name>\w+)\s+extends\s+(?P<sup>[\w$.]+)')
ENUM_VALUEOF = re.compile(
    r'java\.lang\.Enum\.valueOf\s*\(\s*([\w$.]+)\.class\s*,\s*')


def fix_numeric(src):
    return NUM_ANNOT.sub(r'\1', src)


def fix_qq(src):
    return QQ_TYPE.sub(r'java.lang.Object\1', src)


def fix_enums(src):
    changed = False

    def base_sub(m):
        nonlocal changed
        changed = True
        return 'class %s extends %s' % (m.group('name'), ENUM_BASE)

    new = ENUM_BASE_DECL.sub(base_sub, src)

    def const_sub(m):
        nonlocal changed
        changed = True
        return 'class %s extends %s' % (m.group('name'), m.group('sup'))

    new = ENUM_CONST_DECL.sub(const_sub, new)
    if changed:
        # `abstract enum` became `abstract class` which is fine, but a class may
        # not be declared `final abstract`; jadx never emits that pair, so the
        # only cleanup needed is the Enum.valueOf helper.
        new = ENUM_VALUEOF.sub(lambda m: '%s.valueOf(%s.values(), ' % (ENUM_BASE, m.group(1)), new)
    return new


def iter_type_bodies(src):
    """Yield (kind, open_idx, close_idx) for every class/interface/enum body."""
    m = mask(src)
    stack = []
    for i, c in enumerate(m):
        if c == '{':
            stack.append(i)
        elif c == '}' and stack:
            o = stack.pop()
            head = m[max(0, o - 300):o]
            km = None
            for mm in re.finditer(r'\b(class|interface|enum|@interface)\s+\w', head):
                km = mm
            if km and '(' not in head[km.end():]:
                yield km.group(1), o, i


def fix_interface_static_blocks(src):
    """Interfaces cannot declare static initialisers; fold them into fields."""
    for _ in range(4):
        bodies = [b for b in iter_type_bodies(src) if b[0] == 'interface']
        edited = False
        for _kind, o, c in sorted(bodies, reverse=True):
            body = src[o + 1:c]
            mbody = mask(body)
            sm = re.search(r'(^[ \t]*static\s*\{)', mbody, re.M)
            if not sm:
                continue
            start = sm.start(1)
            depth = 0
            end = None
            for i in range(body.index('{', start), len(body)):
                if mbody[i] == '{':
                    depth += 1
                elif mbody[i] == '}':
                    depth -= 1
                    if depth == 0:
                        end = i + 1
                        break
            if end is None:
                continue
            inner = body[body.index('{', start) + 1:end - 1]
            assigns = {}
            ok = True
            for stmt in [s.strip() for s in re.split(r';\s*\n', inner) if s.strip()]:
                am = re.match(r'^([A-Za-z_$][\w$]*)\s*=\s*(.+?);?$', stmt, re.S)
                if am and '=' not in am.group(2)[:1]:
                    assigns[am.group(1)] = am.group(2).strip().rstrip(';')
                else:
                    ok = False
                    break
            newbody = body[:start] + body[end:]
            if ok and assigns:
                def repl(fm):
                    name = fm.group('name')
                    if name in assigns:
                        return '%s %s = %s;' % (fm.group('type'), name, assigns.pop(name))
                    return fm.group(0)
                newbody = re.sub(
                    r'(?P<type>(?:public\s+|static\s+|final\s+)*[\w$.<>\[\]]+)\s+'
                    r'(?P<name>[A-Za-z_$][\w$]*)\s*=\s*null\s*;',
                    repl, newbody)
            src = src[:o + 1] + newbody + src[c:]
            edited = True
            break
        if not edited:
            break
    return src


DUP_EXTENDS = re.compile(
    r'(\binterface\s+\w+\s*(?:<[^{]*?>)?\s*extends\s+[^{]*?)\sextends\s+([\w$.]+)\s*\{')


def fix_dup_extends(src):
    return DUP_EXTENDS.sub(lambda m: '%s, %s {' % (m.group(1).rstrip(), m.group(2)), src)


PIPELINE = [
    ('numeric', fix_numeric),
    ('qq', fix_qq),
    ('enum', fix_enums),
    ('iface_static', fix_interface_static_blocks),
    ('dup_extends', fix_dup_extends),
]


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
    stats = {k: 0 for k, _ in PIPELINE}
    changed = 0
    for p in files:
        src = open(p, encoding='utf-8', errors='surrogateescape').read()
        orig = src
        for name, fn in PIPELINE:
            try:
                new = fn(src)
            except Exception as e:  # noqa: BLE001
                print(f'ERROR {name} {p}: {e}', file=sys.stderr)
                continue
            if new != src:
                stats[name] += 1
                src = new
        if src != orig:
            changed += 1
            if not args.dry_run:
                open(p, 'w', encoding='utf-8', errors='surrogateescape').write(src)
    stats['files_changed'] = changed
    print(json.dumps(stats, indent=2))


if __name__ == '__main__':
    main()
