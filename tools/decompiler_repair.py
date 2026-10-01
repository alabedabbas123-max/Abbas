#!/usr/bin/env python3
"""
Repair JADX fall-back output so it becomes valid, semantics-preserving Java.

The recovered engine sources under ``libraries/java`` were produced by a DEX
decompiler that gave up on structuring the control flow of ~1.9k files.  For
those methods it emitted raw Dalvik-ish pseudo Java:

    public boolean equals(Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        ...
    }

``goto`` is a reserved-but-unused Java keyword and ``move-exception`` is a
Dalvik instruction, so javac rejects every such file.

This tool rewrites each affected method body into the canonical structured
equivalent of a flow graph: a dispatch loop over basic blocks.

    int $pc0 = <entry>;
    $sw0: while (true) {
        switch ($pc0) {
            case 0: { ...; $pc0 = 5; continue $sw0; }
            case 5: { ... }
            default: throw new IllegalStateException();
        }
    }

That transformation is exactly what the JVM/Dalvik does at runtime, so it
preserves behaviour instead of guessing at the original source shape.

Handled constructs
  * ``Lnn:`` basic-block labels and ``goto Lnn;`` (incl. inside switch cases)
  * ``x = move-exception;`` exception-handler entry
  * ``// Catch: <Type> -> Lnn ...`` trailing annotations -> real try/catch
  * local declarations crossing block boundaries -> hoisted to method scope
  * entry-block detection when the decompiler emitted a handler block first
"""

from __future__ import annotations

import argparse
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from _scan_lib import mask  # noqa: E402

SUPPORT_CLASS = 'com.almlkaide.kaypro.internal.DecompileSupport'

LABEL_LINE = re.compile(r'^[ \t]*L(\d+):[ \t]*$')
GOTO_RE = re.compile(r'\bgoto\s+L(\d+)\s*;?')
MOVE_EXC = re.compile(r'^(\s*)([A-Za-z_$][\w$]*)\s*=\s*move-exception\s*;?\s*$')
CATCH_CMT = re.compile(r'//\s*Catch:\s*(.+?)\s*$')
CATCH_PAIR = re.compile(r'([A-Za-z_$][\w$.]*)\s*->\s*L(\d+)')

KEYWORDS = {
    'return', 'throw', 'new', 'if', 'else', 'while', 'do', 'for', 'switch',
    'case', 'default', 'break', 'continue', 'synchronized', 'try', 'catch',
    'finally', 'assert', 'instanceof', 'goto', 'super', 'this', 'package',
    'import', 'null', 'true', 'false',
}

DECL_RE = re.compile(
    r'''^\s*(?:final\s+)?
        (?P<type>
            (?:[A-Za-z_$][\w$]*)(?:\s*\.\s*[A-Za-z_$][\w$]*)*
            (?:\s*<[^<>;()]*(?:<[^<>;()]*>)?[^<>;()]*>)?
            (?:\s*\[\s*\])*
        )
        \s+
        (?P<name>[A-Za-z_$][\w$]*)
        \s*(?P<tail>=[^=]|;)
    ''',
    re.X,
)

PRIM_DEFAULT = {
    'boolean': 'false', 'char': '0', 'byte': '0', 'short': '0',
    'int': '0', 'long': '0L', 'float': '0.0f', 'double': '0.0d',
}


def default_value(type_text: str) -> str:
    t = re.sub(r'\s+', '', type_text)
    if t.endswith(']'):
        return 'null'
    return PRIM_DEFAULT.get(t, 'null')


# --------------------------------------------------------------------------
# statement splitting
# --------------------------------------------------------------------------

CONTINUATION = ('else', 'catch', 'finally')
BLOCK_STARTERS = ('switch', 'try', 'if', 'while', 'for', 'do', 'synchronized')


class Item:
    __slots__ = ('kind', 'label', 'lines', 'catch')

    def __init__(self, kind, label=None, lines=None, catch=None):
        self.kind = kind          # 'label' | 'stmt'
        self.label = label        # int, for labels
        self.lines = lines or []  # raw source lines
        self.catch = catch        # [(type, target_label), ...] or None

    @property
    def text(self):
        return '\n'.join(self.lines)

    def stripped(self):
        return self.text.strip()


def split_items(body: str):
    """Split a method body into labels and top-level statements."""
    raw_lines = body.split('\n')
    masked_lines = mask(body).split('\n')
    items = []
    buf, buf_catch = [], None
    depth = paren = 0
    i = 0
    n = len(raw_lines)

    def flush():
        nonlocal buf, buf_catch
        if buf:
            items.append(Item('stmt', lines=buf, catch=buf_catch))
        buf, buf_catch = [], None

    while i < n:
        raw, msk = raw_lines[i], masked_lines[i]
        if not buf and not raw.strip():
            i += 1
            continue
        if not buf:
            lm = LABEL_LINE.match(raw)
            if lm:
                items.append(Item('label', label=int(lm.group(1))))
                i += 1
                continue
        cm = CATCH_CMT.search(raw)
        if cm:
            pairs = CATCH_PAIR.findall(cm.group(1))
            if pairs:
                buf_catch = [(t, int(l)) for t, l in pairs]
            raw = raw[:cm.start()].rstrip()
            msk = msk[:cm.start()].rstrip()
        buf.append(raw)
        depth += msk.count('{') - msk.count('}')
        paren += msk.count('(') - msk.count(')')
        stripped = msk.rstrip()
        complete = depth <= 0 and paren <= 0 and stripped.endswith((';', '}'))
        if complete and stripped.endswith('}'):
            nxt = ''
            for j in range(i + 1, n):
                if masked_lines[j].strip():
                    nxt = masked_lines[j].strip()
                    break
            first = buf[0].strip().split('(')[0].split()[0] if buf[0].strip() else ''
            if nxt.startswith(CONTINUATION):
                complete = False
            elif first == 'do' and nxt.startswith('while'):
                complete = False
        if complete:
            flush()
            depth = paren = 0
        i += 1
    flush()
    return items


# --------------------------------------------------------------------------
# body transformation
# --------------------------------------------------------------------------

class Unsupported(Exception):
    pass


def is_terminal(stmt_text: str) -> bool:
    s = stmt_text.strip()
    if re.match(r'^(return|throw)\b', s):
        return True
    if re.match(r'^goto\s+L\d+\s*;?$', s):
        return True
    if s.startswith('switch') and re.search(r'^\s*default\s*:', s, re.M):
        return True
    return False


def transform_body(body: str, indent: str, uid: int, void: bool, stats: dict):
    items = split_items(body)
    has_label = any(it.kind == 'label' for it in items)
    has_goto = any(it.kind == 'stmt' and GOTO_RE.search(it.text) for it in items)
    if not has_label and not has_goto:
        return None

    pc, sw, ex = f'$pc{uid}', f'$sw{uid}', f'$ex{uid}'

    # ---- group into blocks -------------------------------------------------
    blocks = []          # list of (label_or_None, [Item,...])
    cur_label, cur = None, []
    for it in items:
        if it.kind == 'label':
            blocks.append((cur_label, cur))
            cur_label, cur = it.label, []
        else:
            cur.append(it)
    blocks.append((cur_label, cur))
    if blocks[0][0] is None and not blocks[0][1]:
        blocks.pop(0)
        prologue = False
    else:
        prologue = blocks[0][0] is None
    if not blocks:
        return None

    ENTRY_ID = -1
    # jadx sometimes emits a jump to a label it never printed; such a target is
    # always the implicit end of the method, so materialise it as an empty block.
    known = {lbl for lbl, _ in blocks if lbl is not None}
    wanted = set()
    for _lbl, stmts in blocks:
        for it in stmts:
            for g in GOTO_RE.finditer(it.text):
                wanted.add(int(g.group(1)))
            if it.catch:
                for _t, tgt in it.catch:
                    wanted.add(tgt)
    for missing in sorted(wanted - known):
        blocks.append((missing, []))
    ids = [ENTRY_ID if lbl is None else lbl for lbl, _ in blocks]
    if len(set(ids)) != len(ids):
        raise Unsupported('duplicate block labels')

    # ---- handler blocks ----------------------------------------------------
    # A block is an exception handler entry when some statement names it as a
    # catch target, or when it opens with the Dalvik `move-exception`.  Such a
    # block is only ever reached by a thrown exception, never by falling off
    # the end of the preceding block -- jadx hoists them ahead of the code they
    # protect, so they must be skipped when wiring up fall-through edges.
    handlers = set()
    for _lbl, stmts in blocks:
        for it in stmts:
            if it.catch:
                for _t, tgt in it.catch:
                    handlers.add(tgt)
    for lbl, stmts in blocks:
        if lbl is not None and stmts and MOVE_EXC.match(stmts[0].text):
            handlers.add(lbl)

    def fallthrough(idx):
        """Next block reached by falling off the end of blocks[idx]."""
        for j in range(idx + 1, len(blocks)):
            if ids[j] not in handlers:
                return ids[j]
        return None

    # ---- edges -------------------------------------------------------------
    incoming = set()
    for lbl, stmts in blocks:
        for it in stmts:
            for g in GOTO_RE.finditer(it.text):
                incoming.add(int(g.group(1)))
            if it.catch:
                for _t, tgt in it.catch:
                    incoming.add(tgt)
    for idx in range(len(blocks)):
        stmts = blocks[idx][1]
        if not stmts or not is_terminal(stmts[-1].text):
            tgt = fallthrough(idx)
            if tgt is not None:
                incoming.add(tgt)

    if prologue:
        entry = ENTRY_ID
    else:
        roots = [i for i in ids if i not in incoming and i not in handlers]
        if len(roots) == 1:
            entry = roots[0]
        else:
            # Labels are bytecode offsets, so the lowest non-handler label is
            # the method entry.
            candidates = sorted(i for i in ids if i not in handlers)
            entry = candidates[0] if candidates else ids[0]
            if len(roots) != 1:
                stats['ambiguous_entry'] += 1

    # ---- exception variables ----------------------------------------------
    exc_vars = set()
    for _, stmts in blocks:
        for it in stmts:
            m = MOVE_EXC.match(it.text)
            if m:
                exc_vars.add(m.group(2))

    # ---- hoist declarations -------------------------------------------------
    hoisted = {}        # name -> type
    conflicts = set()
    for _, stmts in blocks:
        for it in stmts:
            s = it.stripped()
            if MOVE_EXC.match(it.text):
                continue
            m = DECL_RE.match(s)
            if not m:
                continue
            first = m.group('type').split('.')[0].split('<')[0].split('[')[0].strip()
            if first in KEYWORDS or m.group('name') in KEYWORDS:
                continue
            name, typ = m.group('name'), m.group('type').strip()
            if name in hoisted and re.sub(r'\s+', '', hoisted[name]) != re.sub(r'\s+', '', typ):
                conflicts.add(name)
            hoisted.setdefault(name, typ)
    if conflicts:
        raise Unsupported('conflicting declaration types: ' + ','.join(sorted(conflicts)))

    # ---- rewrite statements ---------------------------------------------------
    def rewrite(stmt: Item) -> str:
        s = stmt.text
        m = MOVE_EXC.match(s)
        if m:
            return f'{m.group(2)} = {ex};'
        body_s = s
        decl = DECL_RE.match(body_s.strip())
        if decl:
            first = decl.group('type').split('.')[0].split('<')[0].split('[')[0].strip()
            name = decl.group('name')
            if first not in KEYWORDS and name in hoisted:
                stripped = body_s.strip()
                if decl.group('tail') == ';':
                    return ''
                body_s = stripped[decl.start('name') - (len(stripped) - len(stripped.lstrip())):] \
                    if False else name + stripped[decl.end('name'):]
        am = re.match(r'^(\s*)([A-Za-z_$][\w$]*)(\s*=\s*)\{', body_s)
        if am and am.group(2) in hoisted:
            typ = hoisted[am.group(2)]
            if typ.rstrip().endswith(']'):
                body_s = '%s%s%snew %s%s' % (am.group(1), am.group(2), am.group(3),
                                             typ, body_s[am.end() - 1:])
        body_s = GOTO_RE.sub(lambda g: '{ %s = %s; continue %s; }' % (pc, g.group(1), sw), body_s)
        for v in exc_vars:
            body_s = re.sub(r'^(\s*)throw\s+%s\s*;' % re.escape(v),
                            r'\1throw %s.rethrow(%s);' % (SUPPORT_CLASS, v),
                            body_s, flags=re.M)
        return body_s

    # ---- emit ----------------------------------------------------------------
    i3 = indent + '    '
    i4 = i3 + '    '
    i5 = i4 + '    '
    out = []
    for name, typ in hoisted.items():
        out.append(f'{i3}{typ} {name} = {default_value(typ)};')
    for v in sorted(exc_vars):
        out.append(f'{i3}java.lang.Throwable {v} = null;')
    out.append(f'{i3}java.lang.Throwable {ex} = null;')
    out.append(f'{i3}int {pc} = {entry};')
    out.append(f'{i3}{sw}: while (true) {{')
    out.append(f'{i4}switch ({pc}) {{')

    for idx, (lbl, stmts) in enumerate(blocks):
        cid = ENTRY_ID if lbl is None else lbl
        out.append(f'{i5}case {cid}: {{')
        # group consecutive statements sharing a catch annotation
        k = 0
        while k < len(stmts):
            it = stmts[k]
            if it.catch:
                key = it.catch
                grp = [it]
                k += 1
                while k < len(stmts) and stmts[k].catch == key:
                    grp.append(stmts[k])
                    k += 1
                out.append(f'{i5}    try {{')
                for g in grp:
                    t = rewrite(g)
                    if t.strip():
                        out.append(reindent(t, i5 + '        '))
                out.append(f'{i5}    }} catch (java.lang.Throwable $t) {{')
                out.append(f'{i5}        {ex} = $t;')
                seen = set()
                catch_all = None
                for typ, tgt in key:
                    if (typ, tgt) in seen:
                        continue
                    seen.add((typ, tgt))
                    if typ in ('java.lang.Throwable', 'Throwable') and catch_all is None:
                        catch_all = tgt
                        continue
                    out.append(f'{i5}        if ($t instanceof {typ}) {{ {pc} = {tgt}; '
                               f'continue {sw}; }}')
                if catch_all is not None:
                    out.append(f'{i5}        {pc} = {catch_all}; continue {sw};')
                else:
                    out.append(f'{i5}        throw {SUPPORT_CLASS}.rethrow($t);')
                out.append(f'{i5}    }}')
            else:
                t = rewrite(it)
                if t.strip():
                    out.append(reindent(t, i5 + '    '))
                k += 1
        # fall-through
        last_real = stmts[-1].text if stmts else ''
        if not stmts or not is_terminal(last_real):
            nxt = fallthrough(idx)
            if nxt is not None:
                out.append(f'{i5}    {pc} = {nxt}; continue {sw};')
            elif void:
                out.append(f'{i5}    return;')
            else:
                out.append(f'{i5}    throw new java.lang.IllegalStateException();')
        out.append(f'{i5}}}')

    out.append(f'{i5}default: throw new java.lang.IllegalStateException();')
    out.append(f'{i4}}}')
    out.append(f'{i3}}}')
    return '\n' + '\n'.join(out) + '\n' + indent


def reindent(text: str, indent: str) -> str:
    lines = text.split('\n')
    base = None
    for ln in lines:
        if ln.strip():
            lead = len(ln) - len(ln.lstrip())
            base = lead if base is None else min(base, lead)
    base = base or 0
    return '\n'.join(indent + ln[base:] if ln.strip() else '' for ln in lines)


# --------------------------------------------------------------------------
# file level
# --------------------------------------------------------------------------

SIG_RE = re.compile(r'([^;{}]*)$')


CTRL_HEAD = re.compile(r'\b(switch|catch|if|else|while|for|do|synchronized|try|finally)\s*$|'
                      r'\b(switch|catch|if|while|for|synchronized)\s*\([^;]*$')
METHOD_HEAD = re.compile(r'\)\s*(?:throws\s+[\w$.,\s]+)?\s*$')
INIT_HEAD = re.compile(r'^\s*(static)?\s*$')


def _all_blocks(m):
    stack, blocks = [], []
    for i, c in enumerate(m):
        if c == '{':
            stack.append(i)
        elif c == '}' and stack:
            blocks.append((stack.pop(), i))
    blocks.sort(key=lambda b: b[1] - b[0])
    return blocks


def method_bodies_with_jumps(src: str):
    """Blocks that are method/constructor/initialiser bodies containing jumps."""
    m = mask(src)
    marks = [mm.start() for mm in re.finditer(r'^[ \t]*L\d+:[ \t]*$', m, re.M)]
    marks += [mm.start() for mm in re.finditer(r'\bgoto\s+L\d+', m)]
    if not marks:
        return []
    blocks = _all_blocks(m)
    chosen = []
    for pos in sorted(set(marks)):
        enclosing = [b for b in blocks if b[0] < pos < b[1]]
        enclosing.sort(key=lambda b: b[1] - b[0])
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
        if pick and pick not in chosen:
            chosen.append(pick)
    result = []
    for o, c in chosen:
        if not any(oo < o and c < cc for oo, cc in chosen):
            result.append((o, c))
    result.sort()
    return result


def is_void_signature(sig: str) -> bool:
    head = re.sub(r'@[\w$.]+(\([^()]*\))?', ' ', sig)
    head = head.split('(')[0].strip()
    if not head:
        return True            # static / instance initialiser
    words = [w for w in re.split(r'\s+', head)
             if w not in ('public', 'protected', 'private', 'static', 'final',
                          'synchronized', 'native', 'strictfp', 'abstract', 'default')]
    if not words:
        return True
    if len(words) == 1:
        return True            # constructor
    return words[-2] == 'void'


def signature_before(src: str, open_idx: int):
    head = src[:open_idx]
    cut = max(head.rfind(';'), head.rfind('{'), head.rfind('}'))
    return head[cut + 1:]


def repair_source(src: str, stats: dict):
    uid = 0
    for _ in range(6):
        spans = method_bodies_with_jumps(src)
        if not spans:
            break
        edits = []
        for o, c in spans:
            body = src[o + 1:c]
            line_start = src.rfind('\n', 0, o) + 1
            indent = re.match(r'[ \t]*', src[line_start:]).group(0)
            sig = signature_before(src, o)
            void = is_void_signature(sig)
            try:
                new = transform_body(body, indent, uid, void, stats)
            except Unsupported as e:
                stats['unsupported'] += 1
                stats.setdefault('unsupported_reasons', []).append(str(e))
                new = None
            if new is not None:
                edits.append((o + 1, c, new))
                uid += 1
        if not edits:
            break
        for a, b, new in sorted(edits, reverse=True):
            src = src[:a] + new + src[b:]
    return src


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('root', nargs='+')
    ap.add_argument('--limit', type=int, default=0)
    ap.add_argument('--dry-run', action='store_true')
    ap.add_argument('--list', help='json file with explicit file list')
    args = ap.parse_args()

    files = []
    if args.list:
        files = json.load(open(args.list))
    else:
        for root in args.root:
            for dp, _, fns in os.walk(root):
                for fn in fns:
                    if fn.endswith('.java'):
                        files.append(os.path.join(dp, fn))
    files.sort()

    stats = {'changed': 0, 'unsupported': 0, 'ambiguous_entry': 0, 'errors': 0}
    done = 0
    for p in files:
        src = open(p, encoding='utf-8', errors='surrogateescape').read()
        if not re.search(r'^[ \t]*L\d+:[ \t]*$', src, re.M) and 'goto L' not in src:
            continue
        src = re.sub(r'\bgoto\s+(L\d+)\s*$', r'goto \1;', src, flags=re.M)
        src = re.sub(r'=\s*move-exception\s*$', '= move-exception;', src, flags=re.M)
        try:
            new = repair_source(src, stats)
        except Exception as e:  # noqa: BLE001
            stats['errors'] += 1
            print(f'ERROR {p}: {type(e).__name__}: {e}', file=sys.stderr)
            continue
        if new != src:
            stats['changed'] += 1
            if not args.dry_run:
                open(p, 'w', encoding='utf-8', errors='surrogateescape').write(new)
        done += 1
        if args.limit and done >= args.limit:
            break
    reasons = stats.pop('unsupported_reasons', [])
    print(json.dumps(stats, indent=2))
    if reasons:
        from collections import Counter
        print('top unsupported reasons:')
        for r, n in Counter(r.split(':')[0] for r in reasons).most_common(10):
            print(f'  {n:5}  {r}')


if __name__ == '__main__':
    main()
