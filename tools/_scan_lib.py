"""Shared lexer helpers for working with decompiler output."""
import re

def mask(src):
    """Return a copy of src where string/char literals and comments are
    replaced by spaces (newlines preserved) so brace scanning is safe."""
    out = list(src)
    i, n = 0, len(src)
    while i < n:
        c = src[i]
        if c == '"' or c == "'":
            q = c; j = i + 1
            while j < n:
                if src[j] == '\\': j += 2; continue
                if src[j] == q: j += 1; break
                if src[j] == '\n': break
                j += 1
            for k in range(i, min(j, n)):
                if src[k] != '\n': out[k] = ' '
            i = j; continue
        if c == '/' and i + 1 < n and src[i+1] == '/':
            j = src.find('\n', i)
            j = n if j < 0 else j
            for k in range(i, j): out[k] = ' '
            i = j; continue
        if c == '/' and i + 1 < n and src[i+1] == '*':
            j = src.find('*/', i + 2)
            j = n if j < 0 else j + 2
            for k in range(i, j):
                if src[k] != '\n': out[k] = ' '
            i = j; continue
        i += 1
    return ''.join(out)

LABEL_RE = re.compile(r'^[ \t]*L\d+:[ \t]*$', re.M)

def enclosing_block(m, pos):
    """Given masked text m and a position, return (open_idx, close_idx) of the
    innermost { } block containing pos."""
    depth = 0; stack = []
    for i, c in enumerate(m):
        if c == '{':
            stack.append(i)
        elif c == '}':
            if stack:
                o = stack.pop()
                if o < pos < i:
                    return o, i
    return None
