package org.objectweb.asm.util;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.TypePath;

public abstract class Printer {
    public static final String[] HANDLE_TAG;
    public static final String[] OPCODES;
    public static final String[] TYPES;

    protected final int f6698api;

    protected final StringBuffer f6699buf = new StringBuffer();
    public final List text = new ArrayList();

    static {
        int i = 0;
        _clinit_();
        OPCODES = new String[200];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf = "NOP,ACONST_NULL,ICONST_M1,ICONST_0,ICONST_1,ICONST_2,ICONST_3,ICONST_4,ICONST_5,LCONST_0,LCONST_1,FCONST_0,FCONST_1,FCONST_2,DCONST_0,DCONST_1,BIPUSH,SIPUSH,LDC,,,ILOAD,LLOAD,FLOAD,DLOAD,ALOAD,,,,,,,,,,,,,,,,,,,,,IALOAD,LALOAD,FALOAD,DALOAD,AALOAD,BALOAD,CALOAD,SALOAD,ISTORE,LSTORE,FSTORE,DSTORE,ASTORE,,,,,,,,,,,,,,,,,,,,,IASTORE,LASTORE,FASTORE,DASTORE,AASTORE,BASTORE,CASTORE,SASTORE,POP,POP2,DUP,DUP_X1,DUP_X2,DUP2,DUP2_X1,DUP2_X2,SWAP,IADD,LADD,FADD,DADD,ISUB,LSUB,FSUB,DSUB,IMUL,LMUL,FMUL,DMUL,IDIV,LDIV,FDIV,DDIV,IREM,LREM,FREM,DREM,INEG,LNEG,FNEG,DNEG,ISHL,LSHL,ISHR,LSHR,IUSHR,LUSHR,IAND,LAND,IOR,LOR,IXOR,LXOR,IINC,I2L,I2F,I2D,L2I,L2F,L2D,F2I,F2L,F2D,D2I,D2L,D2F,I2B,I2C,I2S,LCMP,FCMPL,FCMPG,DCMPL,DCMPG,IFEQ,IFNE,IFLT,IFGE,IFGT,IFLE,IF_ICMPEQ,IF_ICMPNE,IF_ICMPLT,IF_ICMPGE,IF_ICMPGT,IF_ICMPLE,IF_ACMPEQ,IF_ACMPNE,GOTO,JSR,RET,TABLESWITCH,LOOKUPSWITCH,IRETURN,LRETURN,FRETURN,DRETURN,ARETURN,RETURN,GETSTATIC,PUTSTATIC,GETFIELD,PUTFIELD,INVOKEVIRTUAL,INVOKESPECIAL,INVOKESTATIC,INVOKEINTERFACE,INVOKEDYNAMIC,NEW,NEWARRAY,ANEWARRAY,ARRAYLENGTH,ATHROW,CHECKCAST,INSTANCEOF,MONITORENTER,MONITOREXIT,,MULTIANEWARRAY,IFNULL,IFNONNULL,".indexOf(44, i2);
            if (iIndexOf <= 0) {
                break;
            }
            int i4 = i3 + 1;
            OPCODES[i3] = i2 + 1 == iIndexOf ? null : "NOP,ACONST_NULL,ICONST_M1,ICONST_0,ICONST_1,ICONST_2,ICONST_3,ICONST_4,ICONST_5,LCONST_0,LCONST_1,FCONST_0,FCONST_1,FCONST_2,DCONST_0,DCONST_1,BIPUSH,SIPUSH,LDC,,,ILOAD,LLOAD,FLOAD,DLOAD,ALOAD,,,,,,,,,,,,,,,,,,,,,IALOAD,LALOAD,FALOAD,DALOAD,AALOAD,BALOAD,CALOAD,SALOAD,ISTORE,LSTORE,FSTORE,DSTORE,ASTORE,,,,,,,,,,,,,,,,,,,,,IASTORE,LASTORE,FASTORE,DASTORE,AASTORE,BASTORE,CASTORE,SASTORE,POP,POP2,DUP,DUP_X1,DUP_X2,DUP2,DUP2_X1,DUP2_X2,SWAP,IADD,LADD,FADD,DADD,ISUB,LSUB,FSUB,DSUB,IMUL,LMUL,FMUL,DMUL,IDIV,LDIV,FDIV,DDIV,IREM,LREM,FREM,DREM,INEG,LNEG,FNEG,DNEG,ISHL,LSHL,ISHR,LSHR,IUSHR,LUSHR,IAND,LAND,IOR,LOR,IXOR,LXOR,IINC,I2L,I2F,I2D,L2I,L2F,L2D,F2I,F2L,F2D,D2I,D2L,D2F,I2B,I2C,I2S,LCMP,FCMPL,FCMPG,DCMPL,DCMPG,IFEQ,IFNE,IFLT,IFGE,IFGT,IFLE,IF_ICMPEQ,IF_ICMPNE,IF_ICMPLT,IF_ICMPGE,IF_ICMPGT,IF_ICMPLE,IF_ACMPEQ,IF_ACMPNE,GOTO,JSR,RET,TABLESWITCH,LOOKUPSWITCH,IRETURN,LRETURN,FRETURN,DRETURN,ARETURN,RETURN,GETSTATIC,PUTSTATIC,GETFIELD,PUTFIELD,INVOKEVIRTUAL,INVOKESPECIAL,INVOKESTATIC,INVOKEINTERFACE,INVOKEDYNAMIC,NEW,NEWARRAY,ANEWARRAY,ARRAYLENGTH,ATHROW,CHECKCAST,INSTANCEOF,MONITORENTER,MONITOREXIT,,MULTIANEWARRAY,IFNULL,IFNONNULL,".substring(i2, iIndexOf);
            i2 = iIndexOf + 1;
            i3 = i4;
        }
        TYPES = new String[12];
        int i5 = 4;
        int i6 = 0;
        while (true) {
            int iIndexOf2 = "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,".indexOf(44, i6);
            if (iIndexOf2 <= 0) {
                break;
            }
            TYPES[i5] = "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,".substring(i6, iIndexOf2);
            i6 = iIndexOf2 + 1;
            i5++;
        }
        HANDLE_TAG = new String[10];
        int i7 = 1;
        while (true) {
            int iIndexOf3 = "H_GETFIELD,H_GETSTATIC,H_PUTFIELD,H_PUTSTATIC,H_INVOKEVIRTUAL,H_INVOKESTATIC,H_INVOKESPECIAL,H_NEWINVOKESPECIAL,H_INVOKEINTERFACE,".indexOf(44, i);
            if (iIndexOf3 <= 0) {
                return;
            }
            HANDLE_TAG[i7] = "H_GETFIELD,H_GETSTATIC,H_PUTFIELD,H_PUTSTATIC,H_INVOKEVIRTUAL,H_INVOKESTATIC,H_INVOKESPECIAL,H_NEWINVOKESPECIAL,H_INVOKEINTERFACE,".substring(i, iIndexOf3);
            i = iIndexOf3 + 1;
            i7++;
        }
    }

    protected Printer(int i) {
        this.f6698api = i;
    }

    static void _clinit_() {
    }

    public static void appendString(StringBuffer stringBuffer, String str) {
        stringBuffer.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                stringBuffer.append("\\n");
            } else if (cCharAt == '\r') {
                stringBuffer.append("\\r");
            } else if (cCharAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (cCharAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (cCharAt < ' ' || cCharAt > 127) {
                stringBuffer.append("\\u");
                if (cCharAt < 16) {
                    stringBuffer.append("000");
                } else if (cCharAt < 256) {
                    stringBuffer.append("00");
                } else if (cCharAt < 4096) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(cCharAt, 16));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        stringBuffer.append('\"');
    }

    static void printList(PrintWriter printWriter, List list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            Object obj = list.get(i2);
            if (obj instanceof List) {
                printList(printWriter, (List) obj);
            } else {
                printWriter.print(obj.toString());
            }
            i = i2 + 1;
        }
    }

    public List getText() {
        return this.text;
    }

    public void print(PrintWriter printWriter) {
        printList(printWriter, this.text);
    }

    public abstract void visit(int i, int i2, String str, String str2, String str3, String[] strArr);

    public abstract void visit(String str, Object obj);

    public abstract Printer visitAnnotation(String str, String str2);

    public abstract Printer visitAnnotationDefault();

    public abstract void visitAnnotationEnd();

    public abstract Printer visitArray(String str);

    public abstract Printer visitClassAnnotation(String str, boolean z);

    public abstract void visitClassAttribute(Attribute attribute);

    public abstract void visitClassEnd();

    public Printer visitClassTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitCode();

    public abstract void visitEnum(String str, String str2, String str3);

    public abstract Printer visitField(int i, String str, String str2, String str3, Object obj);

    public abstract Printer visitFieldAnnotation(String str, boolean z);

    public abstract void visitFieldAttribute(Attribute attribute);

    public abstract void visitFieldEnd();

    public abstract void visitFieldInsn(int i, String str, String str2, String str3);

    public Printer visitFieldTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2);

    public abstract void visitIincInsn(int i, int i2);

    public abstract void visitInnerClass(String str, String str2, String str3, int i);

    public abstract void visitInsn(int i);

    public Printer visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitIntInsn(int i, int i2);

    public abstract void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr);

    public abstract void visitJumpInsn(int i, Label label);

    public abstract void visitLabel(Label label);

    public abstract void visitLdcInsn(Object obj);

    public abstract void visitLineNumber(int i, Label label);

    public abstract void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i);

    public Printer visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr);

    public abstract void visitMaxs(int i, int i2);

    public abstract Printer visitMethod(int i, String str, String str2, String str3, String[] strArr);

    public abstract Printer visitMethodAnnotation(String str, boolean z);

    public abstract void visitMethodAttribute(Attribute attribute);

    public abstract void visitMethodEnd();

    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6698api < 327680) {
            throw new RuntimeException("Must be overriden");
        }
        visitMethodInsn(i, str, str2, str3, i == 185);
    }

    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6698api >= 327680) {
            throw new RuntimeException("Must be overriden");
        }
        if (z != (i == 185)) {
            throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
        }
        visitMethodInsn(i, str, str2, str3);
    }

    public Printer visitMethodTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitMultiANewArrayInsn(String str, int i);

    public abstract void visitOuterClass(String str, String str2, String str3);

    public void visitParameter(String str, int i) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract Printer visitParameterAnnotation(int i, String str, boolean z);

    public abstract void visitSource(String str, String str2);

    public abstract void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr);

    public Printer visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        throw new RuntimeException("Must be overriden");
    }

    public abstract void visitTryCatchBlock(Label label, Label label2, Label label3, String str);

    public abstract void visitTypeInsn(int i, String str);

    public abstract void visitVarInsn(int i, int i2);
}
