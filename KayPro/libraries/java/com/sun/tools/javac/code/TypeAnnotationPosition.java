package com.sun.tools.javac.code;

import com.sun.tools.javac.util.List;
import sun.misc.FloatConsts;

public class TypeAnnotationPosition {
    public TargetType type = TargetType.UNKNOWN;
    public List<Integer> location = List.m507nil();

    public int f345pos = -1;
    public boolean isValidOffset = false;
    public int offset = -1;
    public int[] lvarOffset = null;
    public int[] lvarLength = null;
    public int[] lvarIndex = null;
    public int bound_index = FloatConsts.SIGN_BIT_MASK;
    public int parameter_index = FloatConsts.SIGN_BIT_MASK;
    public int type_index = FloatConsts.SIGN_BIT_MASK;
    public TypeAnnotationPosition wildcard_position = null;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.type);
        switch (C05871.$SwitchMap$com$sun$tools$javac$code$TargetType[this.type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                sb.append(", offset = ");
                sb.append(this.offset);
                break;
            case 9:
            case 10:
                sb.append(", {");
                for (int i = 0; i < this.lvarOffset.length; i++) {
                    if (i != 0) {
                        sb.append("; ");
                    }
                    sb.append(", start_pc = ");
                    sb.append(this.lvarOffset[i]);
                    sb.append(", length = ");
                    sb.append(this.lvarLength[i]);
                    sb.append(", index = ");
                    sb.append(this.lvarIndex[i]);
                }
                sb.append("}");
                break;
            case 12:
            case 13:
                sb.append(", param_index = ");
                sb.append(this.parameter_index);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                sb.append(", param_index = ");
                sb.append(this.parameter_index);
                sb.append(", bound_index = ");
                sb.append(this.bound_index);
                break;
            case 18:
            case 19:
                sb.append(", wild_card = ");
                sb.append(this.wildcard_position);
                break;
            case 20:
            case 21:
                sb.append(", type_index = ");
                sb.append(this.type_index);
                break;
            case 22:
                sb.append(", type_index = ");
                sb.append(this.type_index);
                break;
            case 23:
            case 24:
                sb.append(", offset = ");
                sb.append(this.offset);
                break;
            case 25:
                sb.append(", param_index = ");
                sb.append(this.parameter_index);
                break;
            case 26:
            case 27:
                sb.append(", offset = ");
                sb.append(this.offset);
                sb.append(", type_index = ");
                sb.append(this.type_index);
                break;
        }
        if (this.type.hasLocation()) {
            sb.append(", location = (");
            sb.append(this.location);
            sb.append(")");
        }
        sb.append(", pos = ");
        sb.append(this.f345pos);
        sb.append(']');
        return sb.toString();
    }

    static class C05871 {
        static final int[] $SwitchMap$com$sun$tools$javac$code$TargetType;

        static {
            int[] iArr = new int[TargetType.values().length];
            $SwitchMap$com$sun$tools$javac$code$TargetType = iArr;
            try {
                iArr[TargetType.TYPECAST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.TYPECAST_GENERIC_OR_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.INSTANCEOF.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.INSTANCEOF_GENERIC_OR_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.NEW_GENERIC_OR_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.NEW_TYPE_ARGUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.NEW_TYPE_ARGUMENT_GENERIC_OR_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.LOCAL_VARIABLE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.LOCAL_VARIABLE_GENERIC_OR_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_RECEIVER.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_TYPE_PARAMETER.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_TYPE_PARAMETER.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_TYPE_PARAMETER_BOUND.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_TYPE_PARAMETER_BOUND_GENERIC_OR_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_TYPE_PARAMETER_BOUND.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_TYPE_PARAMETER_BOUND_GENERIC_OR_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.WILDCARD_BOUND.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.WILDCARD_BOUND_GENERIC_OR_ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_EXTENDS.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_EXTENDS_GENERIC_OR_ARRAY.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.THROWS.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_LITERAL.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.CLASS_LITERAL_GENERIC_OR_ARRAY.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_PARAMETER_GENERIC_OR_ARRAY.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_TYPE_ARGUMENT.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_TYPE_ARGUMENT_GENERIC_OR_ARRAY.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.METHOD_RETURN_GENERIC_OR_ARRAY.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.FIELD_GENERIC_OR_ARRAY.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$TargetType[TargetType.UNKNOWN.ordinal()] = 30;
            } catch (NoSuchFieldError e30) {
            }
        }
    }

    public boolean emitToClassfile() {
        if (this.type == TargetType.WILDCARD_BOUND || this.type == TargetType.WILDCARD_BOUND_GENERIC_OR_ARRAY) {
            return this.wildcard_position.isValidOffset;
        }
        return !this.type.isLocal() || this.isValidOffset;
    }
}
