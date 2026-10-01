package com.google.googlejavaformat.java;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.java.javac.parser.Tokens;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;

final class ModifierOrderer {
    ModifierOrderer() {
    }

    private static Modifier getModifier(Tokens.TokenKind kind) {
        if (kind == null) {
            return null;
        }
        switch (C05451.f274x87071fad[kind.ordinal()]) {
            case 1:
                return Modifier.PUBLIC;
            case 2:
                return Modifier.PROTECTED;
            case 3:
                return Modifier.PRIVATE;
            case 4:
                return Modifier.ABSTRACT;
            case 5:
                return Modifier.STATIC;
            case 6:
                return Modifier.FINAL;
            case 7:
                return Modifier.TRANSIENT;
            case 8:
                return Modifier.VOLATILE;
            case 9:
                return Modifier.SYNCHRONIZED;
            case 10:
                return Modifier.NATIVE;
            case 11:
                return Modifier.STRICTFP;
            default:
                return null;
        }
    }

    static class C05451 {

        static final int[] f274x87071fad;

        static {
            int[] iArr = new int[Tokens.TokenKind.values().length];
            f274x87071fad = iArr;
            try {
                iArr[Tokens.TokenKind.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.PROTECTED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.STATIC.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.FINAL.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.TRANSIENT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.VOLATILE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.SYNCHRONIZED.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.NATIVE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f274x87071fad[Tokens.TokenKind.STRICTFP.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    static JavaInput reorderModifiers(String text) throws FormatterException {
        return reorderModifiers(new JavaInput(text), Collections.singleton(Range.closedOpen(0, Integer.valueOf(text.length()))));
    }

    static JavaInput reorderModifiers(JavaInput javaInput, Collection<Range<Integer>> characterRanges) throws FormatterException {
        Modifier mod;
        Input.Token token;
        Modifier mod2;
        if (javaInput.getTokens().isEmpty()) {
            return javaInput;
        }
        RangeSet<Integer> tokenRanges = javaInput.characterRangesToTokenRanges(characterRanges);
        Iterator<? extends Input.Token> it = javaInput.getTokens().iterator();
        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        while (it.hasNext()) {
            Input.Token token2 = it.next();
            if (tokenRanges.contains(Integer.valueOf(token2.getTok().getIndex())) && (mod = asModifier(token2)) != null) {
                List<Input.Token> modifierTokens = new ArrayList<>();
                ArrayList arrayList = new ArrayList();
                int begin = token2.getTok().getPosition();
                arrayList.add(mod);
                modifierTokens.add(token2);
                int end = -1;
                while (it.hasNext() && (mod2 = asModifier((token = it.next()))) != null) {
                    arrayList.add(mod2);
                    modifierTokens.add(token);
                    end = token.getTok().getPosition() + token.getTok().length();
                }
                if (!Ordering.natural().isOrdered(arrayList)) {
                    Collections.sort(arrayList);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (i > 0) {
                            addTrivia(replacement, modifierTokens.get(i).getToksBefore());
                        }
                        replacement.append(((Modifier) arrayList.get(i)).toString());
                        if (i < modifierTokens.size() - 1) {
                            addTrivia(replacement, modifierTokens.get(i).getToksAfter());
                        }
                    }
                    replacements.mo205put(Range.closedOpen(Integer.valueOf(begin), Integer.valueOf(end)), replacement.toString());
                }
            }
        }
        return applyReplacements(javaInput, replacements);
    }

    private static void addTrivia(StringBuilder replacement, ImmutableList<? extends Input.InterfaceC0532Tok> toks) {
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = toks.iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            replacement.append(tok.getText());
        }
    }

    private static Modifier asModifier(Input.Token token) {
        return getModifier(((JavaInput.C0540Tok) token.getTok()).kind());
    }

    private static JavaInput applyReplacements(JavaInput javaInput, TreeRangeMap<Integer, String> replacementMap) throws FormatterException {
        Map<Range<K>, String> mapAsDescendingMapOfRanges = replacementMap.asDescendingMapOfRanges();
        if (mapAsDescendingMapOfRanges.isEmpty()) {
            return javaInput;
        }
        StringBuilder sb = new StringBuilder(javaInput.getText());
        for (Map.Entry<Range<Integer>, String> entry : mapAsDescendingMapOfRanges.entrySet()) {
            Range<Integer> range = entry.getKey();
            sb.replace(((Integer) range.lowerEndpoint()).intValue(), ((Integer) range.upperEndpoint()).intValue(), entry.getValue());
        }
        return new JavaInput(sb.toString());
    }
}
