package org.objectweb.asm.commons;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class InstructionAdapter extends MethodVisitor {
    public static final Type OBJECT_TYPE;

    static Class f6666xe496d541;

    static {
        _clinit_();
        OBJECT_TYPE = Type.getType("Ljava/lang/Object;");
    }

    protected InstructionAdapter(int i, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }

    public InstructionAdapter(MethodVisitor methodVisitor) {
        this(Opcodes.ASM5, methodVisitor);
        if (getClass() != f6666xe496d541) {
            throw new IllegalStateException();
        }
    }

    private static void _clinit_() {
        f6666xe496d541 = class$("org.objectweb.asm.commons.InstructionAdapter");
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        switch (i) {
            case 182:
                invokevirtual(str, str2, str3, z);
                return;
            case 183:
                invokespecial(str, str2, str3, z);
                return;
            case 184:
                invokestatic(str, str2, str3, z);
                return;
            case 185:
                invokeinterface(str, str2, str3);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void aconst(Object obj) {
        if (obj == null) {
            this.f6563mv.visitInsn(1);
        } else {
            this.f6563mv.visitLdcInsn(obj);
        }
    }

    public void m9003add(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(96));
    }

    public void aload(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(46));
    }

    public void m9004and(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(126));
    }

    public void anew(Type type) {
        this.f6563mv.visitTypeInsn(187, type.getInternalName());
    }

    public void areturn(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(172));
    }

    public void arraylength() {
        this.f6563mv.visitInsn(190);
    }

    public void astore(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(79));
    }

    public void athrow() {
        this.f6563mv.visitInsn(191);
    }

    public void cast(Type type, Type type2) {
        if (type != type2) {
            if (type == Type.DOUBLE_TYPE) {
                if (type2 == Type.FLOAT_TYPE) {
                    this.f6563mv.visitInsn(144);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    this.f6563mv.visitInsn(143);
                    return;
                } else {
                    this.f6563mv.visitInsn(142);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == Type.FLOAT_TYPE) {
                if (type2 == Type.DOUBLE_TYPE) {
                    this.f6563mv.visitInsn(141);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    this.f6563mv.visitInsn(140);
                    return;
                } else {
                    this.f6563mv.visitInsn(139);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == Type.LONG_TYPE) {
                if (type2 == Type.DOUBLE_TYPE) {
                    this.f6563mv.visitInsn(138);
                    return;
                } else if (type2 == Type.FLOAT_TYPE) {
                    this.f6563mv.visitInsn(137);
                    return;
                } else {
                    this.f6563mv.visitInsn(136);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type2 == Type.BYTE_TYPE) {
                this.f6563mv.visitInsn(145);
                return;
            }
            if (type2 == Type.CHAR_TYPE) {
                this.f6563mv.visitInsn(146);
                return;
            }
            if (type2 == Type.DOUBLE_TYPE) {
                this.f6563mv.visitInsn(135);
                return;
            }
            if (type2 == Type.FLOAT_TYPE) {
                this.f6563mv.visitInsn(134);
            } else if (type2 == Type.LONG_TYPE) {
                this.f6563mv.visitInsn(133);
            } else if (type2 == Type.SHORT_TYPE) {
                this.f6563mv.visitInsn(147);
            }
        }
    }

    public void checkcast(Type type) {
        this.f6563mv.visitTypeInsn(192, type.getInternalName());
    }

    public void cmpg(Type type) {
        this.f6563mv.visitInsn(type == Type.FLOAT_TYPE ? 150 : 152);
    }

    public void cmpl(Type type) {
        this.f6563mv.visitInsn(type == Type.FLOAT_TYPE ? 149 : 151);
    }

    public void dconst(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        if (jDoubleToLongBits == 0 || jDoubleToLongBits == 4607182418800017408L) {
            this.f6563mv.visitInsn(((int) d) + 14);
        } else {
            this.f6563mv.visitLdcInsn(new Double(d));
        }
    }

    public void m9005div(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(108));
    }

    public void m9006dup() {
        this.f6563mv.visitInsn(89);
    }

    public void dup2() {
        this.f6563mv.visitInsn(92);
    }

    public void dup2X1() {
        this.f6563mv.visitInsn(93);
    }

    public void dup2X2() {
        this.f6563mv.visitInsn(94);
    }

    public void dupX1() {
        this.f6563mv.visitInsn(90);
    }

    public void dupX2() {
        this.f6563mv.visitInsn(91);
    }

    public void fconst(float f) {
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (iFloatToIntBits == 0 || iFloatToIntBits == 1065353216 || iFloatToIntBits == 1073741824) {
            this.f6563mv.visitInsn(((int) f) + 11);
        } else {
            this.f6563mv.visitLdcInsn(new Float(f));
        }
    }

    public void getfield(String str, String str2, String str3) {
        this.f6563mv.visitFieldInsn(180, str, str2, str3);
    }

    public void getstatic(String str, String str2, String str3) {
        this.f6563mv.visitFieldInsn(178, str, str2, str3);
    }

    public void goTo(Label label) {
        this.f6563mv.visitJumpInsn(167, label);
    }

    public void hconst(Handle handle) {
        this.f6563mv.visitLdcInsn(handle);
    }

    public void iconst(int i) {
        if (i >= -1 && i <= 5) {
            this.f6563mv.visitInsn(i + 3);
            return;
        }
        if (i >= -128 && i <= 127) {
            this.f6563mv.visitIntInsn(16, i);
        } else if (i < -32768 || i > 32767) {
            this.f6563mv.visitLdcInsn(new Integer(i));
        } else {
            this.f6563mv.visitIntInsn(17, i);
        }
    }

    public void ifacmpeq(Label label) {
        this.f6563mv.visitJumpInsn(165, label);
    }

    public void ifacmpne(Label label) {
        this.f6563mv.visitJumpInsn(166, label);
    }

    public void ifeq(Label label) {
        this.f6563mv.visitJumpInsn(153, label);
    }

    public void ifge(Label label) {
        this.f6563mv.visitJumpInsn(156, label);
    }

    public void ifgt(Label label) {
        this.f6563mv.visitJumpInsn(157, label);
    }

    public void ificmpeq(Label label) {
        this.f6563mv.visitJumpInsn(159, label);
    }

    public void ificmpge(Label label) {
        this.f6563mv.visitJumpInsn(162, label);
    }

    public void ificmpgt(Label label) {
        this.f6563mv.visitJumpInsn(163, label);
    }

    public void ificmple(Label label) {
        this.f6563mv.visitJumpInsn(164, label);
    }

    public void ificmplt(Label label) {
        this.f6563mv.visitJumpInsn(161, label);
    }

    public void ificmpne(Label label) {
        this.f6563mv.visitJumpInsn(160, label);
    }

    public void ifle(Label label) {
        this.f6563mv.visitJumpInsn(158, label);
    }

    public void iflt(Label label) {
        this.f6563mv.visitJumpInsn(155, label);
    }

    public void ifne(Label label) {
        this.f6563mv.visitJumpInsn(154, label);
    }

    public void ifnonnull(Label label) {
        this.f6563mv.visitJumpInsn(199, label);
    }

    public void ifnull(Label label) {
        this.f6563mv.visitJumpInsn(198, label);
    }

    public void iinc(int i, int i2) {
        this.f6563mv.visitIincInsn(i, i2);
    }

    public void instanceOf(Type type) {
        this.f6563mv.visitTypeInsn(193, type.getInternalName());
    }

    public void invokedynamic(String str, String str2, Handle handle, Object[] objArr) {
        this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void invokeinterface(String str, String str2, String str3) {
        this.f6563mv.visitMethodInsn(185, str, str2, str3, true);
    }

    public void invokespecial(String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            invokespecial(str, str2, str3, false);
        } else {
            this.f6563mv.visitMethodInsn(183, str, str2, str3, false);
        }
    }

    public void invokespecial(String str, String str2, String str3, boolean z) {
        if (this.f6562api >= 327680) {
            this.f6563mv.visitMethodInsn(183, str, str2, str3, z);
        } else {
            if (z) {
                throw new IllegalArgumentException("INVOKESPECIAL on interfaces require ASM 5");
            }
            invokespecial(str, str2, str3);
        }
    }

    public void invokestatic(String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            invokestatic(str, str2, str3, false);
        } else {
            this.f6563mv.visitMethodInsn(184, str, str2, str3, false);
        }
    }

    public void invokestatic(String str, String str2, String str3, boolean z) {
        if (this.f6562api >= 327680) {
            this.f6563mv.visitMethodInsn(184, str, str2, str3, z);
        } else {
            if (z) {
                throw new IllegalArgumentException("INVOKESTATIC on interfaces require ASM 5");
            }
            invokestatic(str, str2, str3);
        }
    }

    public void invokevirtual(String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            invokevirtual(str, str2, str3, false);
        } else {
            this.f6563mv.visitMethodInsn(182, str, str2, str3);
        }
    }

    public void invokevirtual(String str, String str2, String str3, boolean z) {
        if (this.f6562api >= 327680) {
            this.f6563mv.visitMethodInsn(182, str, str2, str3, z);
        } else {
            if (z) {
                throw new IllegalArgumentException("INVOKEVIRTUAL on interfaces require ASM 5");
            }
            invokevirtual(str, str2, str3);
        }
    }

    public void m9007jsr(Label label) {
        this.f6563mv.visitJumpInsn(168, label);
    }

    public void lcmp() {
        this.f6563mv.visitInsn(148);
    }

    public void lconst(long j) {
        if (j == 0 || j == 1) {
            this.f6563mv.visitInsn(((int) j) + 9);
        } else {
            this.f6563mv.visitLdcInsn(new Long(j));
        }
    }

    public void load(int i, Type type) {
        this.f6563mv.visitVarInsn(type.getOpcode(21), i);
    }

    public void lookupswitch(Label label, int[] iArr, Label[] labelArr) {
        this.f6563mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    public void mark(Label label) {
        this.f6563mv.visitLabel(label);
    }

    public void monitorenter() {
        this.f6563mv.visitInsn(194);
    }

    public void monitorexit() {
        this.f6563mv.visitInsn(195);
    }

    public void m9008mul(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(104));
    }

    public void multianewarray(String str, int i) {
        this.f6563mv.visitMultiANewArrayInsn(str, i);
    }

    public void m9009neg(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(116));
    }

    public void newarray(Type type) {
        int i;
        switch (type.getSort()) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 8;
                break;
            case 4:
                i = 9;
                break;
            case 5:
                i = 10;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 11;
                break;
            case 8:
                i = 7;
                break;
            default:
                this.f6563mv.visitTypeInsn(189, type.getInternalName());
                return;
        }
        this.f6563mv.visitIntInsn(188, i);
    }

    public void m9010nop() {
        this.f6563mv.visitInsn(0);
    }

    public void m9011or(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(128));
    }

    public void m9012pop() {
        this.f6563mv.visitInsn(87);
    }

    public void pop2() {
        this.f6563mv.visitInsn(88);
    }

    public void putfield(String str, String str2, String str3) {
        this.f6563mv.visitFieldInsn(181, str, str2, str3);
    }

    public void putstatic(String str, String str2, String str3) {
        this.f6563mv.visitFieldInsn(179, str, str2, str3);
    }

    public void m9013rem(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(112));
    }

    public void m9014ret(int i) {
        this.f6563mv.visitVarInsn(169, i);
    }

    public void m9015shl(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(120));
    }

    public void m9016shr(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(122));
    }

    public void store(int i, Type type) {
        this.f6563mv.visitVarInsn(type.getOpcode(54), i);
    }

    public void m9017sub(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(100));
    }

    public void swap() {
        this.f6563mv.visitInsn(95);
    }

    public void tableswitch(int i, int i2, Label label, Label... labelArr) {
        this.f6563mv.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    public void tconst(Type type) {
        this.f6563mv.visitLdcInsn(type);
    }

    public void ushr(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(124));
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        switch (i) {
            case 178:
                getstatic(str, str2, str3);
                return;
            case 179:
                putstatic(str, str2, str3);
                return;
            case 180:
                getfield(str, str2, str3);
                return;
            case 181:
                putfield(str, str2, str3);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        iinc(i, i2);
    }

    @Override
    public void visitInsn(int i) {
        switch (i) {
            case 0:
                m9010nop();
                return;
            case 1:
                aconst(null);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                iconst(i - 3);
                return;
            case 9:
            case 10:
                lconst(i - 9);
                return;
            case 11:
            case 12:
            case 13:
                fconst(i - 11);
                return;
            case 14:
            case 15:
                dconst(i - 14);
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 132:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 192:
            case 193:
            default:
                throw new IllegalArgumentException();
            case 46:
                aload(Type.INT_TYPE);
                return;
            case 47:
                aload(Type.LONG_TYPE);
                return;
            case 48:
                aload(Type.FLOAT_TYPE);
                return;
            case 49:
                aload(Type.DOUBLE_TYPE);
                return;
            case 50:
                aload(OBJECT_TYPE);
                return;
            case 51:
                aload(Type.BYTE_TYPE);
                return;
            case 52:
                aload(Type.CHAR_TYPE);
                return;
            case 53:
                aload(Type.SHORT_TYPE);
                return;
            case 79:
                astore(Type.INT_TYPE);
                return;
            case 80:
                astore(Type.LONG_TYPE);
                return;
            case 81:
                astore(Type.FLOAT_TYPE);
                return;
            case 82:
                astore(Type.DOUBLE_TYPE);
                return;
            case 83:
                astore(OBJECT_TYPE);
                return;
            case 84:
                astore(Type.BYTE_TYPE);
                return;
            case 85:
                astore(Type.CHAR_TYPE);
                return;
            case 86:
                astore(Type.SHORT_TYPE);
                return;
            case 87:
                m9012pop();
                return;
            case 88:
                pop2();
                return;
            case 89:
                m9006dup();
                return;
            case 90:
                dupX1();
                return;
            case 91:
                dupX2();
                return;
            case 92:
                dup2();
                return;
            case 93:
                dup2X1();
                return;
            case 94:
                dup2X2();
                return;
            case 95:
                swap();
                return;
            case 96:
                m9003add(Type.INT_TYPE);
                return;
            case 97:
                m9003add(Type.LONG_TYPE);
                return;
            case 98:
                m9003add(Type.FLOAT_TYPE);
                return;
            case 99:
                m9003add(Type.DOUBLE_TYPE);
                return;
            case 100:
                m9017sub(Type.INT_TYPE);
                return;
            case 101:
                m9017sub(Type.LONG_TYPE);
                return;
            case 102:
                m9017sub(Type.FLOAT_TYPE);
                return;
            case 103:
                m9017sub(Type.DOUBLE_TYPE);
                return;
            case 104:
                m9008mul(Type.INT_TYPE);
                return;
            case 105:
                m9008mul(Type.LONG_TYPE);
                return;
            case 106:
                m9008mul(Type.FLOAT_TYPE);
                return;
            case 107:
                m9008mul(Type.DOUBLE_TYPE);
                return;
            case 108:
                m9005div(Type.INT_TYPE);
                return;
            case 109:
                m9005div(Type.LONG_TYPE);
                return;
            case 110:
                m9005div(Type.FLOAT_TYPE);
                return;
            case 111:
                m9005div(Type.DOUBLE_TYPE);
                return;
            case 112:
                m9013rem(Type.INT_TYPE);
                return;
            case 113:
                m9013rem(Type.LONG_TYPE);
                return;
            case 114:
                m9013rem(Type.FLOAT_TYPE);
                return;
            case 115:
                m9013rem(Type.DOUBLE_TYPE);
                return;
            case 116:
                m9009neg(Type.INT_TYPE);
                return;
            case 117:
                m9009neg(Type.LONG_TYPE);
                return;
            case 118:
                m9009neg(Type.FLOAT_TYPE);
                return;
            case 119:
                m9009neg(Type.DOUBLE_TYPE);
                return;
            case 120:
                m9015shl(Type.INT_TYPE);
                return;
            case 121:
                m9015shl(Type.LONG_TYPE);
                return;
            case 122:
                m9016shr(Type.INT_TYPE);
                return;
            case 123:
                m9016shr(Type.LONG_TYPE);
                return;
            case 124:
                ushr(Type.INT_TYPE);
                return;
            case 125:
                ushr(Type.LONG_TYPE);
                return;
            case 126:
                m9004and(Type.INT_TYPE);
                return;
            case 127:
                m9004and(Type.LONG_TYPE);
                return;
            case 128:
                m9011or(Type.INT_TYPE);
                return;
            case 129:
                m9011or(Type.LONG_TYPE);
                return;
            case 130:
                m9018xor(Type.INT_TYPE);
                return;
            case 131:
                m9018xor(Type.LONG_TYPE);
                return;
            case 133:
                cast(Type.INT_TYPE, Type.LONG_TYPE);
                return;
            case 134:
                cast(Type.INT_TYPE, Type.FLOAT_TYPE);
                return;
            case 135:
                cast(Type.INT_TYPE, Type.DOUBLE_TYPE);
                return;
            case 136:
                cast(Type.LONG_TYPE, Type.INT_TYPE);
                return;
            case 137:
                cast(Type.LONG_TYPE, Type.FLOAT_TYPE);
                return;
            case 138:
                cast(Type.LONG_TYPE, Type.DOUBLE_TYPE);
                return;
            case 139:
                cast(Type.FLOAT_TYPE, Type.INT_TYPE);
                return;
            case 140:
                cast(Type.FLOAT_TYPE, Type.LONG_TYPE);
                return;
            case 141:
                cast(Type.FLOAT_TYPE, Type.DOUBLE_TYPE);
                return;
            case 142:
                cast(Type.DOUBLE_TYPE, Type.INT_TYPE);
                return;
            case 143:
                cast(Type.DOUBLE_TYPE, Type.LONG_TYPE);
                return;
            case 144:
                cast(Type.DOUBLE_TYPE, Type.FLOAT_TYPE);
                return;
            case 145:
                cast(Type.INT_TYPE, Type.BYTE_TYPE);
                return;
            case 146:
                cast(Type.INT_TYPE, Type.CHAR_TYPE);
                return;
            case 147:
                cast(Type.INT_TYPE, Type.SHORT_TYPE);
                return;
            case 148:
                lcmp();
                return;
            case 149:
                cmpl(Type.FLOAT_TYPE);
                return;
            case 150:
                cmpg(Type.FLOAT_TYPE);
                return;
            case 151:
                cmpl(Type.DOUBLE_TYPE);
                return;
            case 152:
                cmpg(Type.DOUBLE_TYPE);
                return;
            case 172:
                areturn(Type.INT_TYPE);
                return;
            case 173:
                areturn(Type.LONG_TYPE);
                return;
            case 174:
                areturn(Type.FLOAT_TYPE);
                return;
            case 175:
                areturn(Type.DOUBLE_TYPE);
                return;
            case 176:
                areturn(OBJECT_TYPE);
                return;
            case 177:
                areturn(Type.VOID_TYPE);
                return;
            case 190:
                arraylength();
                return;
            case 191:
                athrow();
                return;
            case 194:
                monitorenter();
                return;
            case 195:
                monitorexit();
                return;
        }
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        switch (i) {
            case 16:
                iconst(i2);
                return;
            case 17:
                iconst(i2);
                return;
            case 188:
                switch (i2) {
                    case 4:
                        newarray(Type.BOOLEAN_TYPE);
                        return;
                    case 5:
                        newarray(Type.CHAR_TYPE);
                        return;
                    case 6:
                        newarray(Type.FLOAT_TYPE);
                        return;
                    case 7:
                        newarray(Type.DOUBLE_TYPE);
                        return;
                    case 8:
                        newarray(Type.BYTE_TYPE);
                        return;
                    case 9:
                        newarray(Type.SHORT_TYPE);
                        return;
                    case 10:
                        newarray(Type.INT_TYPE);
                        return;
                    case 11:
                        newarray(Type.LONG_TYPE);
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        invokedynamic(str, str2, handle, objArr);
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        switch (i) {
            case 153:
                ifeq(label);
                return;
            case 154:
                ifne(label);
                return;
            case 155:
                iflt(label);
                return;
            case 156:
                ifge(label);
                return;
            case 157:
                ifgt(label);
                return;
            case 158:
                ifle(label);
                return;
            case 159:
                ificmpeq(label);
                return;
            case 160:
                ificmpne(label);
                return;
            case 161:
                ificmplt(label);
                return;
            case 162:
                ificmpge(label);
                return;
            case 163:
                ificmpgt(label);
                return;
            case 164:
                ificmple(label);
                return;
            case 165:
                ifacmpeq(label);
                return;
            case 166:
                ifacmpne(label);
                return;
            case 167:
                goTo(label);
                return;
            case 168:
                m9007jsr(label);
                return;
            case 198:
                ifnull(label);
                return;
            case 199:
                ifnonnull(label);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void visitLabel(Label label) {
        mark(label);
    }

    @Override
    public void visitLdcInsn(Object obj) {
        if (obj instanceof Integer) {
            iconst(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Byte) {
            iconst(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof Character) {
            iconst(((Character) obj).charValue());
            return;
        }
        if (obj instanceof Short) {
            iconst(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            iconst(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof Float) {
            fconst(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            lconst(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            dconst(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            aconst(obj);
        } else if (obj instanceof Type) {
            tconst((Type) obj);
        } else {
            if (!(obj instanceof Handle)) {
                throw new IllegalArgumentException();
            }
            hconst((Handle) obj);
        }
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        lookupswitch(label, iArr, labelArr);
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
        } else {
            doVisitMethodInsn(i, str, str2, str3, i == 185);
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6562api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            doVisitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        multianewarray(str, i);
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        tableswitch(i, i2, label, labelArr);
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        Type objectType = Type.getObjectType(str);
        switch (i) {
            case 187:
                anew(objectType);
                return;
            case 188:
            case 190:
            case 191:
            default:
                throw new IllegalArgumentException();
            case 189:
                newarray(objectType);
                return;
            case 192:
                checkcast(objectType);
                return;
            case 193:
                instanceOf(objectType);
                return;
        }
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        switch (i) {
            case 21:
                load(i2, Type.INT_TYPE);
                return;
            case 22:
                load(i2, Type.LONG_TYPE);
                return;
            case 23:
                load(i2, Type.FLOAT_TYPE);
                return;
            case 24:
                load(i2, Type.DOUBLE_TYPE);
                return;
            case 25:
                load(i2, OBJECT_TYPE);
                return;
            case 54:
                store(i2, Type.INT_TYPE);
                return;
            case 55:
                store(i2, Type.LONG_TYPE);
                return;
            case 56:
                store(i2, Type.FLOAT_TYPE);
                return;
            case 57:
                store(i2, Type.DOUBLE_TYPE);
                return;
            case 58:
                store(i2, OBJECT_TYPE);
                return;
            case 169:
                m9014ret(i2);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void m9018xor(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(130));
    }
}
