package com.google.googlejavaformat.java;

import com.google.common.base.Verify;
import java.util.List;

public final class TypeNameClassifier {
    private TypeNameClassifier() {
    }

    static int typePrefixLength(List<String> nameParts) {
        TyParseState state = TyParseState.START;
        int typeLength = -1;
        for (int i = 0; i < nameParts.size() && (state = state.next(JavaCaseFormat.from(nameParts.get(i)))) != TyParseState.REJECT; i++) {
            if (state.isSingleUnit()) {
                typeLength = i;
            }
        }
        return typeLength;
    }

    private enum TyParseState {
        START(0 == true ? 1 : 0) {
            @Override
            public TyParseState next(JavaCaseFormat n) {
                int i = C05481.f276x8ffd66cf[n.ordinal()];
                if (i == 1) {
                    return TyParseState.AMBIGUOUS;
                }
                if (i == 2) {
                    return TyParseState.REJECT;
                }
                if (i == 3) {
                    return TyParseState.START;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                throw new AssertionError();
            }
        },
        TYPE(1 == true ? 1 : 0) {
            @Override
            public TyParseState next(JavaCaseFormat n) {
                int i = C05481.f276x8ffd66cf[n.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return TyParseState.FIRST_STATIC_MEMBER;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                throw new AssertionError();
            }
        },
        FIRST_STATIC_MEMBER(1 == true ? 1 : 0) {
            @Override
            public TyParseState next(JavaCaseFormat n) {
                return TyParseState.REJECT;
            }
        },
        REJECT(0 == true ? 1 : 0) {
            @Override
            public TyParseState next(JavaCaseFormat n) {
                return TyParseState.REJECT;
            }
        },
        AMBIGUOUS(0 == true ? 1 : 0) {
            @Override
            public TyParseState next(JavaCaseFormat n) {
                int i = C05481.f276x8ffd66cf[n.ordinal()];
                if (i == 1) {
                    return AMBIGUOUS;
                }
                if (i == 2 || i == 3) {
                    return TyParseState.REJECT;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                throw new AssertionError();
            }
        };

        private final boolean isSingleUnit;

        public abstract TyParseState next(JavaCaseFormat javaCaseFormat);

        TyParseState(boolean x2, C05481 x3) {
            this(x2);
        }

        TyParseState(boolean isSingleUnit) {
            this.isSingleUnit = isSingleUnit;
        }

        public boolean isSingleUnit() {
            return this.isSingleUnit;
        }
    }

    static class C05481 {

        static final int[] f276x8ffd66cf;

        static {
            int[] iArr = new int[JavaCaseFormat.values().length];
            f276x8ffd66cf = iArr;
            try {
                iArr[JavaCaseFormat.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f276x8ffd66cf[JavaCaseFormat.LOWER_CAMEL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f276x8ffd66cf[JavaCaseFormat.LOWERCASE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f276x8ffd66cf[JavaCaseFormat.UPPER_CAMEL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public enum JavaCaseFormat {
        UPPERCASE,
        LOWERCASE,
        UPPER_CAMEL,
        LOWER_CAMEL;

        static JavaCaseFormat from(String name) {
            Verify.verify(!name.isEmpty());
            boolean firstUppercase = false;
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean first = true;
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (first) {
                        firstUppercase = Character.isUpperCase(c);
                        first = false;
                    }
                    hasUppercase |= Character.isUpperCase(c);
                    hasLowercase |= Character.isLowerCase(c);
                }
            }
            if (firstUppercase) {
                return hasLowercase ? UPPER_CAMEL : UPPERCASE;
            }
            return hasUppercase ? LOWER_CAMEL : LOWERCASE;
        }
    }
}
