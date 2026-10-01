#!/usr/bin/env python3
"""
Change the application id in an apktool-decoded AndroidManifest.xml.

    rewrite_manifest_package.py <AndroidManifest.xml> <old.pkg> <new.pkg>

The application id and the Java package names of the classes inside an APK are
independent, so renaming the former must leave every class reference pointing
at the old names. Three groups of attributes need different treatment:

*class references*  ``android:name`` on application/activity/activity-alias/
    service/receiver/provider/instrumentation, plus ``android:backupAgent``,
    ``android:targetActivity`` and ``android:process``. A value written as
    ``.Foo`` or ``Foo`` resolves against the manifest package, so it has to be
    made absolute against the *old* id before the rename -- and then protected
    from it.

*namespaced identifiers*  the ``package`` attribute itself, custom permission
    names, provider authorities, task affinities. These have to follow the new
    id or the app cannot be installed next to the original.

*everything else*  intent actions, categories, metadata keys and resource
    references are left untouched: the DEX still emits the old strings, so
    rewriting one side only would break the match.

Prints the authorities it rewrote, one per line, prefixed with ``authority:``
so the caller can mirror them into the smali.
"""

from __future__ import annotations

import re
import sys

SENTINEL = '\u0001'

CLASS_ELEMENTS = {
    'application', 'activity', 'activity-alias', 'service', 'receiver',
    'provider', 'instrumentation',
}
PERMISSION_ELEMENTS = {
    'permission', 'uses-permission', 'uses-permission-sdk-23',
    'permission-group', 'permission-tree',
}
CLASS_ATTRS = ('android:backupAgent', 'android:targetActivity',
               'android:appComponentFactory', 'android:zygotePreloadName')
ID_ATTRS = ('android:authorities', 'android:taskAffinity', 'android:process',
            'android:permission', 'android:readPermission',
            'android:writePermission', 'android:targetPackage',
            'android:sharedUserId')

TAG_RE = re.compile(r'<([A-Za-z-]+)((?:\s+[^<>]*?)?)(/?)>', re.S)
ATTR_RE = re.compile(r'([\w:.-]+)\s*=\s*"([^"]*)"')


def absolutise(value: str, old: str) -> str:
    if value.startswith('.'):
        return old + value
    if '.' not in value:
        return old + '.' + value
    return value


def rewrite(src: str, old: str, new: str):
    authorities = []

    def fix_tag(m):
        tag, attrs, close = m.group(1), m.group(2), m.group(3)

        def fix_attr(a):
            name, value = a.group(1), a.group(2)
            if tag in CLASS_ELEMENTS and name == 'android:name':
                # a class reference: pin it to the old package and shield it
                return '%s="%s%s"' % (name, SENTINEL, absolutise(value, old))
            if name in CLASS_ATTRS:
                return '%s="%s%s"' % (name, SENTINEL, absolutise(value, old))
            if name == 'android:process' and value.startswith(':'):
                return a.group(0)          # private process, relative by design
            if tag in PERMISSION_ELEMENTS and name == 'android:name':
                return '%s="%s"' % (name, rename_id(value))
            if name in ID_ATTRS:
                if name == 'android:authorities':
                    for part in value.split(';'):
                        renamed = rename_id(part)
                        if renamed != part:
                            authorities.append((part, renamed))
                return '%s="%s"' % (name, ';'.join(rename_id(p) for p in value.split(';'))
                                    if name == 'android:authorities' else rename_id(value))
            return a.group(0)

        return '<%s%s%s>' % (tag, ATTR_RE.sub(fix_attr, attrs), close)

    def rename_id(value: str) -> str:
        if value == old:
            return new
        if value.startswith(old + '.'):
            return new + value[len(old):]
        return value

    src = TAG_RE.sub(fix_tag, src)
    # the manifest package attribute itself
    src = re.sub(r'(<manifest\b[^>]*?\bpackage=")%s(")' % re.escape(old),
                 lambda m: m.group(1) + new + m.group(2), src, flags=re.S)
    # restore the shielded class references
    src = src.replace(SENTINEL, '')
    return src, authorities


def main():
    if len(sys.argv) != 4:
        print(__doc__.strip(), file=sys.stderr)
        return 2
    path, old, new = sys.argv[1], sys.argv[2], sys.argv[3]
    src = open(path, encoding='utf-8').read()
    out, authorities = rewrite(src, old, new)
    open(path, 'w', encoding='utf-8').write(out)
    for before, after in authorities:
        print('authority:%s:%s' % (before, after))
    print('manifest: %s -> %s' % (old, new), file=sys.stderr)
    return 0


if __name__ == '__main__':
    sys.exit(main())
