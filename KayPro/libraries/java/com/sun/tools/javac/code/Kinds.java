package com.sun.tools.javac.code;

import com.sun.tools.javac.api.Formattable;
import com.sun.tools.javac.api.Messages;
import java.util.EnumSet;
import java.util.Locale;
import javax.lang.model.element.ElementKind;

public class Kinds {
    public static final int ABSENT_MTH = 71;
    public static final int ABSENT_TYP = 72;
    public static final int ABSENT_VAR = 68;
    public static final int AMBIGUOUS = 65;
    public static final int AllKinds = 31;

    public static final int f326ERR = 31;
    public static final int ERRONEOUS = 64;
    public static final int HIDDEN = 66;

    public static final int f327MTH = 16;

    public static final int f328NIL = 0;

    public static final int f329PCK = 1;
    public static final int STATICERR = 67;

    public static final int f330TYP = 2;

    public static final int f331VAL = 12;

    public static final int f332VAR = 4;
    public static final int WRONG_MTH = 70;
    public static final int WRONG_MTHS = 69;

    private Kinds() {
    }

    public enum KindName implements Formattable {
        ANNOTATION("kindname.annotation"),
        CONSTRUCTOR("kindname.constructor"),
        INTERFACE("kindname.interface"),
        ENUM("kindname.enum"),
        STATIC("kindname.static"),
        TYPEVAR("kindname.type.variable"),
        BOUND("kindname.type.variable.bound"),
        VAR("kindname.variable"),
        VAL("kindname.value"),
        METHOD("kindname.method"),
        CLASS("kindname.class"),
        STATIC_INIT("kindname.static.init"),
        INSTANCE_INIT("kindname.instance.init"),
        PACKAGE("kindname.package");

        private String name;

        KindName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public String getKind() {
            return "Kindname";
        }

        @Override
        public String toString(Locale locale, Messages messages) {
            String s = toString();
            return messages.getLocalizedString(locale, "compiler.misc." + s, new Object[0]);
        }
    }

    public static KindName kindName(int kind) {
        if (kind == 1) {
            return KindName.PACKAGE;
        }
        if (kind == 2) {
            return KindName.CLASS;
        }
        if (kind == 4) {
            return KindName.VAR;
        }
        if (kind == 12) {
            return KindName.VAL;
        }
        if (kind == 16) {
            return KindName.METHOD;
        }
        throw new AssertionError("Unexpected kind: " + kind);
    }

    static class C05691 {
        static final int[] $SwitchMap$javax$lang$model$element$ElementKind;

        static {
            int[] iArr = new int[ElementKind.values().length];
            $SwitchMap$javax$lang$model$element$ElementKind = iArr;
            try {
                iArr[ElementKind.PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.ANNOTATION_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.INTERFACE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.TYPE_PARAMETER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.ENUM_CONSTANT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.FIELD.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.PARAMETER.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.LOCAL_VARIABLE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.EXCEPTION_PARAMETER.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.RESOURCE_VARIABLE.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.CONSTRUCTOR.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.METHOD.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.STATIC_INIT.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.INSTANCE_INIT.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
        }
    }

    public static KindName kindName(Symbol sym) {
        switch (C05691.$SwitchMap$javax$lang$model$element$ElementKind[sym.getKind().ordinal()]) {
            case 1:
                return KindName.PACKAGE;
            case 2:
                return KindName.ENUM;
            case 3:
            case 4:
                return KindName.CLASS;
            case 5:
                return KindName.INTERFACE;
            case 6:
                return KindName.TYPEVAR;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return KindName.VAR;
            case 13:
                return KindName.CONSTRUCTOR;
            case 14:
                return KindName.METHOD;
            case 15:
                return KindName.STATIC_INIT;
            case 16:
                return KindName.INSTANCE_INIT;
            default:
                if (sym.kind == 12) {
                    return KindName.VAL;
                }
                throw new AssertionError("Unexpected kind: " + sym.getKind());
        }
    }

    public static EnumSet<KindName> kindNames(int kind) {
        EnumSet<KindName> kinds = EnumSet.noneOf(KindName.class);
        if ((kind & 12) != 0) {
            kinds.add((kind & 12) == 4 ? KindName.VAR : KindName.VAL);
        }
        if ((kind & 16) != 0) {
            kinds.add(KindName.METHOD);
        }
        if ((kind & 2) != 0) {
            kinds.add(KindName.CLASS);
        }
        if ((kind & 1) != 0) {
            kinds.add(KindName.PACKAGE);
        }
        return kinds;
    }

    public static KindName typeKindName(Type t) {
        if (t.f344tag == 14 || (t.f344tag == 10 && (t.tsym.flags() & 16777216) != 0)) {
            return KindName.BOUND;
        }
        if (t.f344tag == 13) {
            return KindName.PACKAGE;
        }
        if ((t.tsym.flags_field & 8192) != 0) {
            return KindName.ANNOTATION;
        }
        if ((t.tsym.flags_field & 512) != 0) {
            return KindName.INTERFACE;
        }
        return KindName.CLASS;
    }

    public static KindName absentKind(int kind) {
        switch (kind) {
            case 68:
                return KindName.VAR;
            case 69:
            case 70:
            case 71:
                return KindName.METHOD;
            case 72:
                return KindName.CLASS;
            default:
                throw new AssertionError("Unexpected kind: " + kind);
        }
    }
}
