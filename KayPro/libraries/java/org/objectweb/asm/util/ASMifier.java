package org.objectweb.asm.util;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class ASMifier extends Printer {
    static Class class$org$objectweb$asm$util$ASMifier = class$("org.objectweb.asm.util.ASMifier");

    protected final int f6693id;
    protected Map labelNames;
    protected final String name;

    public ASMifier() {
        this(Opcodes.ASM5, "cw", 0);
        if (getClass() != class$org$objectweb$asm$util$ASMifier) {
            throw new IllegalStateException();
        }
    }

    protected ASMifier(int i, String str, int i2) {
        super(i);
        this.name = str;
        this.f6693id = i2;
    }

    static void appendConstant(StringBuffer stringBuffer, Object obj) {
        int i = 0;
        if (obj == null) {
            stringBuffer.append("null");
            return;
        }
        if (obj instanceof String) {
            appendString(stringBuffer, (String) obj);
            return;
        }
        if (obj instanceof Type) {
            stringBuffer.append("Type.getType(\"");
            stringBuffer.append(((Type) obj).getDescriptor());
            stringBuffer.append("\")");
            return;
        }
        if (obj instanceof Handle) {
            stringBuffer.append("new Handle(");
            Handle handle = (Handle) obj;
            stringBuffer.append("Opcodes.").append(HANDLE_TAG[handle.getTag()]).append(", \"");
            stringBuffer.append(handle.getOwner()).append("\", \"");
            stringBuffer.append(handle.getName()).append("\", \"");
            stringBuffer.append(handle.getDesc()).append("\")");
            return;
        }
        if (obj instanceof Byte) {
            stringBuffer.append("new Byte((byte)").append(obj).append(')');
            return;
        }
        if (obj instanceof Boolean) {
            stringBuffer.append(((Boolean) obj).booleanValue() ? "Boolean.TRUE" : "Boolean.FALSE");
            return;
        }
        if (obj instanceof Short) {
            stringBuffer.append("new Short((short)").append(obj).append(')');
            return;
        }
        if (obj instanceof Character) {
            stringBuffer.append("new Character((char)").append((int) ((Character) obj).charValue()).append(')');
            return;
        }
        if (obj instanceof Integer) {
            stringBuffer.append("new Integer(").append(obj).append(')');
            return;
        }
        if (obj instanceof Float) {
            stringBuffer.append("new Float(\"").append(obj).append("\")");
            return;
        }
        if (obj instanceof Long) {
            stringBuffer.append("new Long(").append(obj).append("L)");
            return;
        }
        if (obj instanceof Double) {
            stringBuffer.append("new Double(\"").append(obj).append("\")");
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer.append("new byte[] {");
            while (i < bArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append((int) bArr[i]);
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            stringBuffer.append("new boolean[] {");
            while (i < zArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append(zArr[i]);
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            stringBuffer.append("new short[] {");
            while (i < sArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append("(short)").append((int) sArr[i]);
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            stringBuffer.append("new char[] {");
            while (i < cArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append("(char)").append((int) cArr[i]);
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            stringBuffer.append("new int[] {");
            while (i < iArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append(iArr[i]);
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            stringBuffer.append("new long[] {");
            while (i < jArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append(jArr[i]).append('L');
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            stringBuffer.append("new float[] {");
            while (i < fArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append(fArr[i]).append('f');
                i++;
            }
            stringBuffer.append('}');
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            stringBuffer.append("new double[] {");
            while (i < dArr.length) {
                stringBuffer.append(i == 0 ? "" : ",").append(dArr[i]).append('d');
                i++;
            }
            stringBuffer.append('}');
        }
    }

    private void appendFrameTypes(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                this.f6699buf.append(", ");
            }
            if (objArr[i2] instanceof String) {
                appendConstant(objArr[i2]);
            } else if (objArr[i2] instanceof Integer) {
                switch (((Integer) objArr[i2]).intValue()) {
                    case 0:
                        this.f6699buf.append("Opcodes.TOP");
                        break;
                    case 1:
                        this.f6699buf.append("Opcodes.INTEGER");
                        break;
                    case 2:
                        this.f6699buf.append("Opcodes.FLOAT");
                        break;
                    case 3:
                        this.f6699buf.append("Opcodes.DOUBLE");
                        break;
                    case 4:
                        this.f6699buf.append("Opcodes.LONG");
                        break;
                    case 5:
                        this.f6699buf.append("Opcodes.NULL");
                        break;
                    case 6:
                        this.f6699buf.append("Opcodes.UNINITIALIZED_THIS");
                        break;
                }
            } else {
                appendLabel((Label) objArr[i2]);
            }
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private void declareFrameTypes(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof Label) {
                declareLabel((Label) objArr[i2]);
            }
        }
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitMethodInsn(").append(OPCODES[i]).append(", ");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        this.f6699buf.append(z ? "true" : "false");
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    public static void main(String[] strArr) throws Exception {
        int i = 2;
        char c = 1;
        boolean z = strArr.length >= 1 && strArr.length <= 2;
        if (!z || !"-debug".equals(strArr[0])) {
            c = 0;
        } else if (strArr.length != 2) {
            z = false;
            i = 0;
        } else {
            i = 0;
        }
        if (z) {
            ((strArr[c].endsWith(".class") || strArr[c].indexOf(92) > -1 || strArr[c].indexOf(47) > -1) ? new ClassReader(new FileInputStream(strArr[c])) : new ClassReader(strArr[c])).accept(new TraceClassVisitor(null, new ASMifier(), new PrintWriter(System.out)), i);
        } else {
            System.err.println("Prints the ASM code to generate the given class.");
            System.err.println("Usage: ASMifier [-debug] <fully qualified class name or class file name>");
        }
    }

    void appendAccess(int i) {
        boolean z = false;
        boolean z2 = true;
        if ((i & 1) != 0) {
            this.f6699buf.append("ACC_PUBLIC");
            z2 = false;
        }
        if ((i & 2) != 0) {
            this.f6699buf.append("ACC_PRIVATE");
            z2 = false;
        }
        if ((i & 4) != 0) {
            this.f6699buf.append("ACC_PROTECTED");
            z2 = false;
        }
        if ((i & 16) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_FINAL");
            z2 = false;
        }
        if ((i & 8) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_STATIC");
            z2 = false;
        }
        if ((i & 32) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            if ((i & 262144) == 0) {
                this.f6699buf.append("ACC_SYNCHRONIZED");
            } else {
                this.f6699buf.append("ACC_SUPER");
            }
            z2 = false;
        }
        if ((i & 64) != 0 && (i & 524288) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_VOLATILE");
            z2 = false;
        }
        if ((i & 64) != 0 && (i & 262144) == 0 && (i & 524288) == 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_BRIDGE");
            z2 = false;
        }
        if ((i & 128) != 0 && (i & 262144) == 0 && (i & 524288) == 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_VARARGS");
            z2 = false;
        }
        if ((i & 128) != 0 && (i & 524288) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_TRANSIENT");
            z2 = false;
        }
        if ((i & 256) != 0 && (i & 262144) == 0 && (i & 524288) == 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_NATIVE");
            z2 = false;
        }
        if ((i & 16384) != 0 && ((i & 262144) != 0 || (i & 524288) != 0 || (i & 1048576) != 0)) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_ENUM");
            z2 = false;
        }
        if ((i & 8192) != 0 && ((i & 262144) != 0 || (i & 1048576) != 0)) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_ANNOTATION");
            z2 = false;
        }
        if ((i & 1024) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_ABSTRACT");
            z2 = false;
        }
        if ((i & 512) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_INTERFACE");
            z2 = false;
        }
        if ((i & 2048) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_STRICT");
            z2 = false;
        }
        if ((i & 4096) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_SYNTHETIC");
            z2 = false;
        }
        if ((131072 & i) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_DEPRECATED");
            z2 = false;
        }
        if ((32768 & i) != 0) {
            if (!z2) {
                this.f6699buf.append(" + ");
            }
            this.f6699buf.append("ACC_MANDATED");
        } else {
            z = z2;
        }
        if (z) {
            this.f6699buf.append('0');
        }
    }

    protected void appendConstant(Object obj) {
        appendConstant(this.f6699buf, obj);
    }

    protected void appendLabel(Label label) {
        this.f6699buf.append((String) this.labelNames.get(label));
    }

    protected ASMifier createASMifier(String str, int i) {
        return new ASMifier(Opcodes.ASM5, str, i);
    }

    protected void declareLabel(Label label) {
        if (this.labelNames == null) {
            this.labelNames = new HashMap();
        }
        if (((String) this.labelNames.get(label)) == null) {
            String string = new StringBuffer().append("l").append(this.labelNames.size()).toString();
            this.labelNames.put(label, string);
            this.f6699buf.append("Label ").append(string).append(" = new Label();\n");
        }
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            this.text.add(new StringBuffer().append("package asm.").append(str.substring(0, iLastIndexOf).replace('/', FilenameUtils.EXTENSION_SEPARATOR)).append(";\n").toString());
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        this.text.add("import java.util.*;\n");
        this.text.add("import org.objectweb.asm.*;\n");
        this.text.add(new StringBuffer().append("public class ").append(strSubstring).append("Dump implements Opcodes {\n\n").toString());
        this.text.add("public static byte[] dump () throws Exception {\n\n");
        this.text.add("ClassWriter cw = new ClassWriter(0);\n");
        this.text.add("FieldVisitor fv;\n");
        this.text.add("MethodVisitor mv;\n");
        this.text.add("AnnotationVisitor av0;\n\n");
        this.f6699buf.setLength(0);
        this.f6699buf.append("cw.visit(");
        switch (i) {
            case 46:
                this.f6699buf.append("V1_2");
                break;
            case 47:
                this.f6699buf.append("V1_3");
                break;
            case 48:
                this.f6699buf.append("V1_4");
                break;
            case 49:
                this.f6699buf.append("V1_5");
                break;
            case 50:
                this.f6699buf.append("V1_6");
                break;
            case 51:
                this.f6699buf.append("V1_7");
                break;
            case Opcodes.V1_1:
                this.f6699buf.append("V1_1");
                break;
            default:
                this.f6699buf.append(i);
                break;
        }
        this.f6699buf.append(", ");
        appendAccess(262144 | i2);
        this.f6699buf.append(", ");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        if (strArr == null || strArr.length <= 0) {
            this.f6699buf.append("null");
        } else {
            this.f6699buf.append("new String[] {");
            int i3 = 0;
            while (i3 < strArr.length) {
                this.f6699buf.append(i3 == 0 ? " " : ", ");
                appendConstant(strArr[i3]);
                i3++;
            }
            this.f6699buf.append(" }");
        }
        this.f6699buf.append(");\n\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visit(String str, Object obj) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("av").append(this.f6693id).append(".visit(");
        appendConstant(this.f6699buf, str);
        this.f6699buf.append(", ");
        appendConstant(this.f6699buf, obj);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitAnnotation(String str, String str2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n");
        this.f6699buf.append("AnnotationVisitor av").append(this.f6693id + 1).append(" = av");
        this.f6699buf.append(this.f6693id).append(".visitAnnotation(");
        appendConstant(this.f6699buf, str);
        this.f6699buf.append(", ");
        appendConstant(this.f6699buf, str2);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", this.f6693id + 1);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    public ASMifier visitAnnotation(String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n").append("av0 = ").append(this.name).append(".visitAnnotation(");
        appendConstant(str);
        this.f6699buf.append(", ").append(z).append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitAnnotation(String str, String str2) {
        return visitAnnotation(str, str2);
    }

    @Override
    public ASMifier visitAnnotationDefault() {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n").append("av0 = ").append(this.name).append(".visitAnnotationDefault();\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitAnnotationDefault() {
        return visitAnnotationDefault();
    }

    @Override
    public void visitAnnotationEnd() {
        this.f6699buf.setLength(0);
        this.f6699buf.append("av").append(this.f6693id).append(".visitEnd();\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitArray(String str) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n");
        this.f6699buf.append("AnnotationVisitor av").append(this.f6693id + 1).append(" = av");
        this.f6699buf.append(this.f6693id).append(".visitArray(");
        appendConstant(this.f6699buf, str);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", this.f6693id + 1);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitArray(String str) {
        return visitArray(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void visitAttribute(Attribute attribute) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("// ATTRIBUTE ").append(attribute.type).append('\n');
        if (attribute instanceof ASMifiable) {
            if (this.labelNames == null) {
                this.labelNames = new HashMap();
            }
            this.f6699buf.append("{\n");
            ((ASMifiable) attribute).asmify(this.f6699buf, "attr", this.labelNames);
            this.f6699buf.append(this.name).append(".visitAttribute(attr);\n");
            this.f6699buf.append("}\n");
        }
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitClassAnnotation(String str, boolean z) {
        return visitAnnotation(str, z);
    }

    @Override
    public Printer visitClassAnnotation(String str, boolean z) {
        return visitClassAnnotation(str, z);
    }

    @Override
    public void visitClassAttribute(Attribute attribute) {
        visitAttribute(attribute);
    }

    @Override
    public void visitClassEnd() {
        this.text.add("cw.visitEnd();\n\n");
        this.text.add("return cw.toByteArray();\n");
        this.text.add("}\n");
        this.text.add("}\n");
    }

    @Override
    public ASMifier visitClassTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public Printer visitClassTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitClassTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitCode() {
        this.text.add(new StringBuffer().append(this.name).append(".visitCode();\n").toString());
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("av").append(this.f6693id).append(".visitEnum(");
        appendConstant(this.f6699buf, str);
        this.f6699buf.append(", ");
        appendConstant(this.f6699buf, str2);
        this.f6699buf.append(", ");
        appendConstant(this.f6699buf, str3);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitField(int i, String str, String str2, String str3, Object obj) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n");
        this.f6699buf.append("fv = cw.visitField(");
        appendAccess(524288 | i);
        this.f6699buf.append(", ");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        appendConstant(obj);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("fv", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitField(int i, String str, String str2, String str3, Object obj) {
        return visitField(i, str, str2, str3, obj);
    }

    @Override
    public ASMifier visitFieldAnnotation(String str, boolean z) {
        return visitAnnotation(str, z);
    }

    @Override
    public Printer visitFieldAnnotation(String str, boolean z) {
        return visitFieldAnnotation(str, z);
    }

    @Override
    public void visitFieldAttribute(Attribute attribute) {
        visitAttribute(attribute);
    }

    @Override
    public void visitFieldEnd() {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitEnd();\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitFieldInsn(").append(OPCODES[i]).append(", ");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitFieldTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public Printer visitFieldTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitFieldTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        this.f6699buf.setLength(0);
        switch (i) {
            case -1:
            case 0:
                declareFrameTypes(i2, objArr);
                declareFrameTypes(i3, objArr2);
                if (i == -1) {
                    this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_NEW, ");
                } else {
                    this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_FULL, ");
                }
                this.f6699buf.append(i2).append(", new Object[] {");
                appendFrameTypes(i2, objArr);
                this.f6699buf.append("}, ").append(i3).append(", new Object[] {");
                appendFrameTypes(i3, objArr2);
                this.f6699buf.append('}');
                break;
            case 1:
                declareFrameTypes(i2, objArr);
                this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_APPEND,").append(i2).append(", new Object[] {");
                appendFrameTypes(i2, objArr);
                this.f6699buf.append("}, 0, null");
                break;
            case 2:
                this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_CHOP,").append(i2).append(", null, 0, null");
                break;
            case 3:
                this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
                break;
            case 4:
                declareFrameTypes(1, objArr2);
                this.f6699buf.append(this.name).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
                appendFrameTypes(1, objArr2);
                this.f6699buf.append('}');
                break;
        }
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitIincInsn(").append(i).append(", ").append(i2).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("cw.visitInnerClass(");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        appendAccess(1048576 | i);
        this.f6699buf.append(");\n\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInsn(int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitInsn(").append(OPCODES[i]).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation("visitInsnAnnotation", i, typePath, str, z);
    }

    @Override
    public Printer visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitInsnAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitIntInsn(").append(OPCODES[i]).append(", ").append(i == 188 ? TYPES[i2] : Integer.toString(i2)).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitInvokeDynamicInsn(");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(handle);
        this.f6699buf.append(", new Object[]{");
        for (int i = 0; i < objArr.length; i++) {
            appendConstant(objArr[i]);
            if (i != objArr.length - 1) {
                this.f6699buf.append(", ");
            }
        }
        this.f6699buf.append("});\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.f6699buf.setLength(0);
        declareLabel(label);
        this.f6699buf.append(this.name).append(".visitJumpInsn(").append(OPCODES[i]).append(", ");
        appendLabel(label);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLabel(Label label) {
        this.f6699buf.setLength(0);
        declareLabel(label);
        this.f6699buf.append(this.name).append(".visitLabel(");
        appendLabel(label);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitLdcInsn(");
        appendConstant(obj);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitLineNumber(").append(i).append(", ");
        appendLabel(label);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitLocalVariable(");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        appendLabel(label);
        this.f6699buf.append(", ");
        appendLabel(label2);
        this.f6699buf.append(", ").append(i).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n").append("av0 = ").append(this.name).append(".visitLocalVariableAnnotation(");
        this.f6699buf.append(i);
        this.f6699buf.append(", TypePath.fromString(\"").append(typePath).append("\"), ");
        this.f6699buf.append("new Label[] {");
        int i2 = 0;
        while (i2 < labelArr.length) {
            this.f6699buf.append(i2 == 0 ? " " : ", ");
            appendLabel(labelArr[i2]);
            i2++;
        }
        this.f6699buf.append(" }, new Label[] {");
        int i3 = 0;
        while (i3 < labelArr2.length) {
            this.f6699buf.append(i3 == 0 ? " " : ", ");
            appendLabel(labelArr2[i3]);
            i3++;
        }
        this.f6699buf.append(" }, new int[] {");
        int i4 = 0;
        while (i4 < iArr.length) {
            this.f6699buf.append(i4 == 0 ? " " : ", ").append(iArr[i4]);
            i4++;
        }
        this.f6699buf.append(" }, ");
        appendConstant(str);
        this.f6699buf.append(", ").append(z).append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        int i = 0;
        this.f6699buf.setLength(0);
        for (Label label2 : labelArr) {
            declareLabel(label2);
        }
        declareLabel(label);
        this.f6699buf.append(this.name).append(".visitLookupSwitchInsn(");
        appendLabel(label);
        this.f6699buf.append(", new int[] {");
        int i2 = 0;
        while (i2 < iArr.length) {
            this.f6699buf.append(i2 == 0 ? " " : ", ").append(iArr[i2]);
            i2++;
        }
        this.f6699buf.append(" }, new Label[] {");
        while (i < labelArr.length) {
            this.f6699buf.append(i == 0 ? " " : ", ");
            appendLabel(labelArr[i]);
            i++;
        }
        this.f6699buf.append(" });\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitMaxs(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitMaxs(").append(i).append(", ").append(i2).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n");
        this.f6699buf.append("mv = cw.visitMethod(");
        appendAccess(i);
        this.f6699buf.append(", ");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(", ");
        if (strArr == null || strArr.length <= 0) {
            this.f6699buf.append("null");
        } else {
            this.f6699buf.append("new String[] {");
            int i2 = 0;
            while (i2 < strArr.length) {
                this.f6699buf.append(i2 == 0 ? " " : ", ");
                appendConstant(strArr[i2]);
                i2++;
            }
            this.f6699buf.append(" }");
        }
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("mv", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return visitMethod(i, str, str2, str3, strArr);
    }

    @Override
    public ASMifier visitMethodAnnotation(String str, boolean z) {
        return visitAnnotation(str, z);
    }

    @Override
    public Printer visitMethodAnnotation(String str, boolean z) {
        return visitMethodAnnotation(str, z);
    }

    @Override
    public void visitMethodAttribute(Attribute attribute) {
        visitAttribute(attribute);
    }

    @Override
    public void visitMethodEnd() {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitEnd();\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6698api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
        } else {
            doVisitMethodInsn(i, str, str2, str3, i == 185);
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6698api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            doVisitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override
    public ASMifier visitMethodTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public Printer visitMethodTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitMethodTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitMultiANewArrayInsn(");
        appendConstant(str);
        this.f6699buf.append(", ").append(i).append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("cw.visitOuterClass(");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(", ");
        appendConstant(str3);
        this.f6699buf.append(");\n\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitParameter(String str, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitParameter(");
        appendString(this.f6699buf, str);
        this.f6699buf.append(", ");
        appendAccess(i);
        this.text.add(this.f6699buf.append(");\n").toString());
    }

    @Override
    public ASMifier visitParameterAnnotation(int i, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n").append("av0 = ").append(this.name).append(".visitParameterAnnotation(").append(i).append(", ");
        appendConstant(str);
        this.f6699buf.append(", ").append(z).append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public Printer visitParameterAnnotation(int i, String str, boolean z) {
        return visitParameterAnnotation(i, str, z);
    }

    @Override
    public void visitSource(String str, String str2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("cw.visitSource(");
        appendConstant(str);
        this.f6699buf.append(", ");
        appendConstant(str2);
        this.f6699buf.append(");\n\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        int i3 = 0;
        this.f6699buf.setLength(0);
        for (Label label2 : labelArr) {
            declareLabel(label2);
        }
        declareLabel(label);
        this.f6699buf.append(this.name).append(".visitTableSwitchInsn(").append(i).append(", ").append(i2).append(", ");
        appendLabel(label);
        this.f6699buf.append(", new Label[] {");
        while (i3 < labelArr.length) {
            this.f6699buf.append(i3 == 0 ? " " : ", ");
            appendLabel(labelArr[i3]);
            i3++;
        }
        this.f6699buf.append(" });\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public ASMifier visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation("visitTryCatchAnnotation", i, typePath, str, z);
    }

    @Override
    public Printer visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTryCatchAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f6699buf.setLength(0);
        declareLabel(label);
        declareLabel(label2);
        declareLabel(label3);
        this.f6699buf.append(this.name).append(".visitTryCatchBlock(");
        appendLabel(label);
        this.f6699buf.append(", ");
        appendLabel(label2);
        this.f6699buf.append(", ");
        appendLabel(label3);
        this.f6699buf.append(", ");
        appendConstant(str);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    public ASMifier visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation("visitTypeAnnotation", i, typePath, str, z);
    }

    public ASMifier visitTypeAnnotation(String str, int i, TypePath typePath, String str2, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append("{\n").append("av0 = ").append(this.name).append(".").append(str).append("(");
        this.f6699buf.append(i);
        this.f6699buf.append(", TypePath.fromString(\"").append(typePath).append("\"), ");
        appendConstant(str2);
        this.f6699buf.append(", ").append(z).append(");\n");
        this.text.add(this.f6699buf.toString());
        ASMifier aSMifierCreateASMifier = createASMifier("av", 0);
        this.text.add(aSMifierCreateASMifier.getText());
        this.text.add("}\n");
        return aSMifierCreateASMifier;
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitTypeInsn(").append(OPCODES[i]).append(", ");
        appendConstant(str);
        this.f6699buf.append(");\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.name).append(".visitVarInsn(").append(OPCODES[i]).append(", ").append(i2).append(");\n");
        this.text.add(this.f6699buf.toString());
    }
}
