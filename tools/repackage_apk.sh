#!/usr/bin/env bash
#
# Re-identify an existing APK under a new application id, without recompiling.
#
#   tools/repackage_apk.sh <input.apk> [new.package.id] [output.apk]
#
# Why this exists
# ---------------
# KayPro's sources are a *lossy* JADX decompilation: 10 of the components the
# manifest declares (MainActivity, PreferencesActivity, the Run*Activity family,
# ExternalGitService, ...) have no source file in the archive at all, so the
# project can never be recompiled. See docs/ENGINE_RECOVERY.md.
#
# Changing an app's identity does not actually require recompiling it. The
# application id lives in one place -- the `package` attribute of the binary
# manifest -- and is independent of the Java package names of the classes
# inside. apktool can rewrite that attribute and reassemble the same DEX
# unchanged, which keeps the app's behaviour exactly as shipped.
#
# What gets rewritten
#   * the manifest `package` attribute
#   * custom permissions, provider authorities, task affinities
#   * relative component names ("./Foo"), expanded against the OLD id first so
#     they keep pointing at the classes that are actually in the DEX
#   * string literals in the DEX that are exactly the old id (getPackageName()
#     comparisons) or an authority that moved
#
# Requirements: java, apktool.jar (APKTOOL env var), zipalign + apksigner
# (Android build-tools), python3.

set -euo pipefail

HERE=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

IN_APK=${1:?usage: repackage_apk.sh <input.apk> [new.package] [output.apk]}
NEW_PKG=${2:-com.almlkaide.kaypro}
OUT_APK=${3:-}

APKTOOL=${APKTOOL:-apktool.jar}
WORK=${WORK:-$(mktemp -d)}
BUILD_TOOLS=${BUILD_TOOLS:-}

log() { printf '\n==> %s\n' "$*"; }

[ -f "$IN_APK" ] || { echo "input APK not found: $IN_APK" >&2; exit 1; }

if [ -z "$BUILD_TOOLS" ]; then
    BUILD_TOOLS=$(ls -d "${ANDROID_HOME:-/usr/local/lib/android/sdk}"/build-tools/* 2>/dev/null \
                  | sort -V | tail -1 || true)
fi
ZIPALIGN="$BUILD_TOOLS/zipalign"
APKSIGNER="$BUILD_TOOLS/apksigner"

log "decoding $IN_APK"
rm -rf "$WORK/src"
java -jar "$APKTOOL" d -f -o "$WORK/src" "$IN_APK"

MANIFEST="$WORK/src/AndroidManifest.xml"
OLD_PKG=$(sed -n 's/.*[^a-zA-Z]package="\([^"]*\)".*/\1/p' "$MANIFEST" | head -1)
[ -n "$OLD_PKG" ] || { echo "could not read the package attribute" >&2; exit 1; }
log "application id: $OLD_PKG  ->  $NEW_PKG"

if [ "$OLD_PKG" = "$NEW_PKG" ]; then
    log "already using the requested application id; repacking unchanged"
    AUTHORITIES=""
else
    log "rewriting the manifest"
    AUTHORITIES=$(python3 "$HERE/rewrite_manifest_package.py" "$MANIFEST" "$OLD_PKG" "$NEW_PKG")
    echo "$AUTHORITIES"

    # getPackageName() comparisons and the like store the id as a plain string.
    log "rewriting the application id inside the DEX"
    COUNT=0
    while IFS= read -r f; do
        sed -i "s/\"$OLD_PKG\"/\"$NEW_PKG\"/g" "$f"
        COUNT=$((COUNT + 1))
    done < <(grep -rlF "\"$OLD_PKG\"" "$WORK/src"/smali* 2>/dev/null || true)
    echo "    $COUNT smali files updated"

    # Authorities are frequently hard-coded rather than derived at runtime; keep
    # them in step with the manifest so ContentProvider lookups still resolve.
    if [ -n "$AUTHORITIES" ]; then
        while IFS= read -r line; do
            [ -n "$line" ] || continue
            before=$(echo "$line" | cut -d: -f2)
            after=$(echo "$line" | cut -d: -f3)
            n=0
            while IFS= read -r f; do
                sed -i "s/\"$before\"/\"$after\"/g" "$f"
                n=$((n + 1))
            done < <(grep -rlF "\"$before\"" "$WORK/src"/smali* "$WORK/src/res" 2>/dev/null || true)
            echo "    authority $before -> $after ($n files)"
        done <<< "$AUTHORITIES"
    fi
fi

log "reassembling"
UNSIGNED="$WORK/unsigned.apk"
java -jar "$APKTOOL" b "$WORK/src" -o "$UNSIGNED"

log "aligning"
ALIGNED="$WORK/aligned.apk"
"$ZIPALIGN" -p -f 4 "$UNSIGNED" "$ALIGNED"

KEYSTORE=${KEYSTORE:-$WORK/debug.keystore}
if [ ! -f "$KEYSTORE" ]; then
    log "generating a debug signing key"
    keytool -genkeypair -v -keystore "$KEYSTORE" -storepass android \
        -keypass android -alias androiddebugkey -keyalg RSA -keysize 2048 \
        -validity 10950 -dname "CN=Android Debug,O=Android,C=US" >/dev/null
fi

[ -n "$OUT_APK" ] || OUT_APK="$(dirname "$IN_APK")/$(basename "$IN_APK" .apk)-$NEW_PKG.apk"
mkdir -p "$(dirname "$OUT_APK")"

log "signing -> $OUT_APK"
"$APKSIGNER" sign --ks "$KEYSTORE" --ks-pass pass:android \
    --key-pass pass:android --out "$OUT_APK" "$ALIGNED"
"$APKSIGNER" verify --print-certs "$OUT_APK" | head -4

log "done"
ls -l "$OUT_APK"
