package javax.lang.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum SourceVersion {
    RELEASE_0,
    RELEASE_1,
    RELEASE_2,
    RELEASE_3,
    RELEASE_4,
    RELEASE_5,
    RELEASE_6,
    RELEASE_7;

    private static final Set<String> keywords;
    private static final SourceVersion latestSupported = getLatestSupported();

    static {
        Set<String> s = new HashSet<>();
        String[] kws = {"abstract", "continue", "for", "new", "switch", "assert", "default", "if", "package", "synchronized", "boolean", "do", "goto", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while", "null", "true", "false"};
        for (String kw : kws) {
            s.add(kw);
        }
        keywords = Collections.unmodifiableSet(s);
    }

    public static SourceVersion latest() {
        return RELEASE_7;
    }

    private static SourceVersion getLatestSupported() {
        try {
            String specVersion = System.getProperty("java.specification.version");
            if ("1.7".equals(specVersion)) {
                return RELEASE_7;
            }
            if ("1.6".equals(specVersion)) {
                return RELEASE_6;
            }
            return RELEASE_5;
        } catch (SecurityException e) {
        }
    }

    public static SourceVersion latestSupported() {
        return latestSupported;
    }

    public static boolean isIdentifier(CharSequence name) {
        String id = name.toString();
        if (id.length() == 0) {
            return false;
        }
        int cp = id.codePointAt(0);
        if (!Character.isJavaIdentifierStart(cp)) {
            return false;
        }
        int i = Character.charCount(cp);
        while (i < id.length()) {
            int cp2 = id.codePointAt(i);
            if (!Character.isJavaIdentifierPart(cp2)) {
                return false;
            }
            i += Character.charCount(cp2);
        }
        return true;
    }

    public static boolean isName(CharSequence name) {
        String id = name.toString();
        for (String s : id.split("\\.", -1)) {
            if (!isIdentifier(s) || isKeyword(s)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isKeyword(CharSequence s) {
        String keywordOrLiteral = s.toString();
        return keywords.contains(keywordOrLiteral);
    }
}
