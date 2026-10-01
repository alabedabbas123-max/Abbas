package org.objectweb.asm.util;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;

public class Textifier extends Printer {
    public static final int CLASS_DECLARATION = 7;
    public static final int CLASS_SIGNATURE = 5;
    public static final int FIELD_DESCRIPTOR = 1;
    public static final int FIELD_SIGNATURE = 2;
    public static final int HANDLE_DESCRIPTOR = 9;
    public static final int INTERNAL_NAME = 0;
    public static final int METHOD_DESCRIPTOR = 3;
    public static final int METHOD_SIGNATURE = 4;
    public static final int PARAMETERS_DECLARATION = 8;
    public static final int TYPE_DECLARATION = 6;
    static Class class$org$objectweb$asm$util$Textifier = class$("org.objectweb.asm.util.Textifier");
    private int access;
    protected Map labelNames;
    protected String ltab;

    protected String f6700tab;
    protected String tab2;
    protected String tab3;
    private int valueNumber;

    public Textifier() {
        this(Opcodes.ASM5);
        if (getClass() != class$org$objectweb$asm$util$Textifier) {
            throw new IllegalStateException();
        }
    }

    protected Textifier(int i) {
        super(i);
        this.f6700tab = "  ";
        this.tab2 = "    ";
        this.tab3 = "      ";
        this.ltab = "   ";
        this.valueNumber = 0;
    }

    private void appendAccess(int i) {
        if ((i & 1) != 0) {
            this.f6699buf.append("public ");
        }
        if ((i & 2) != 0) {
            this.f6699buf.append("private ");
        }
        if ((i & 4) != 0) {
            this.f6699buf.append("protected ");
        }
        if ((i & 16) != 0) {
            this.f6699buf.append("final ");
        }
        if ((i & 8) != 0) {
            this.f6699buf.append("static ");
        }
        if ((i & 32) != 0) {
            this.f6699buf.append("synchronized ");
        }
        if ((i & 64) != 0) {
            this.f6699buf.append("volatile ");
        }
        if ((i & 128) != 0) {
            this.f6699buf.append("transient ");
        }
        if ((i & 1024) != 0) {
            this.f6699buf.append("abstract ");
        }
        if ((i & 2048) != 0) {
            this.f6699buf.append("strictfp ");
        }
        if ((i & 4096) != 0) {
            this.f6699buf.append("synthetic ");
        }
        if ((32768 & i) != 0) {
            this.f6699buf.append("mandated ");
        }
        if ((i & 16384) != 0) {
            this.f6699buf.append("enum ");
        }
    }

    private void appendComa(int i) {
        if (i != 0) {
            this.f6699buf.append(", ");
        }
    }

    private void appendFrameTypes(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                this.f6699buf.append(' ');
            }
            if (objArr[i2] instanceof String) {
                String str = (String) objArr[i2];
                if (str.startsWith("[")) {
                    appendDescriptor(1, str);
                } else {
                    appendDescriptor(0, str);
                }
            } else if (objArr[i2] instanceof Integer) {
                switch (((Integer) objArr[i2]).intValue()) {
                    case 0:
                        appendDescriptor(1, "T");
                        break;
                    case 1:
                        appendDescriptor(1, "I");
                        break;
                    case 2:
                        appendDescriptor(1, "F");
                        break;
                    case 3:
                        appendDescriptor(1, "D");
                        break;
                    case 4:
                        appendDescriptor(1, "J");
                        break;
                    case 5:
                        appendDescriptor(1, "N");
                        break;
                    case 6:
                        appendDescriptor(1, "U");
                        break;
                }
            } else {
                appendLabel((Label) objArr[i2]);
            }
        }
    }

    private void appendTypeReference(int i) {
        TypeReference typeReference = new TypeReference(i);
        switch (typeReference.getSort()) {
            case 0:
                this.f6699buf.append("CLASS_TYPE_PARAMETER ").append(typeReference.getTypeParameterIndex());
                break;
            case 1:
                this.f6699buf.append("METHOD_TYPE_PARAMETER ").append(typeReference.getTypeParameterIndex());
                break;
            case 16:
                this.f6699buf.append("CLASS_EXTENDS ").append(typeReference.getSuperTypeIndex());
                break;
            case 17:
                this.f6699buf.append("CLASS_TYPE_PARAMETER_BOUND ").append(typeReference.getTypeParameterIndex()).append(", ").append(typeReference.getTypeParameterBoundIndex());
                break;
            case 18:
                this.f6699buf.append("METHOD_TYPE_PARAMETER_BOUND ").append(typeReference.getTypeParameterIndex()).append(", ").append(typeReference.getTypeParameterBoundIndex());
                break;
            case 19:
                this.f6699buf.append("FIELD");
                break;
            case 20:
                this.f6699buf.append("METHOD_RETURN");
                break;
            case 21:
                this.f6699buf.append("METHOD_RECEIVER");
                break;
            case 22:
                this.f6699buf.append("METHOD_FORMAL_PARAMETER ").append(typeReference.getFormalParameterIndex());
                break;
            case 23:
                this.f6699buf.append("THROWS ").append(typeReference.getExceptionIndex());
                break;
            case 64:
                this.f6699buf.append("LOCAL_VARIABLE");
                break;
            case 65:
                this.f6699buf.append("RESOURCE_VARIABLE");
                break;
            case 66:
                this.f6699buf.append("EXCEPTION_PARAMETER ").append(typeReference.getTryCatchBlockIndex());
                break;
            case 67:
                this.f6699buf.append("INSTANCEOF");
                break;
            case 68:
                this.f6699buf.append("NEW");
                break;
            case 69:
                this.f6699buf.append("CONSTRUCTOR_REFERENCE");
                break;
            case 70:
                this.f6699buf.append("METHOD_REFERENCE");
                break;
            case 71:
                this.f6699buf.append("CAST ").append(typeReference.getTypeArgumentIndex());
                break;
            case 72:
                this.f6699buf.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
                break;
            case 73:
                this.f6699buf.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
                break;
            case 74:
                this.f6699buf.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
                break;
            case 75:
                this.f6699buf.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
                break;
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ');
        appendDescriptor(0, str);
        this.f6699buf.append(FilenameUtils.EXTENSION_SEPARATOR).append(str2).append(' ');
        appendDescriptor(3, str3);
        this.f6699buf.append('\n');
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
            ((strArr[c].endsWith(".class") || strArr[c].indexOf(92) > -1 || strArr[c].indexOf(47) > -1) ? new ClassReader(new FileInputStream(strArr[c])) : new ClassReader(strArr[c])).accept(new TraceClassVisitor(new PrintWriter(System.out)), i);
        } else {
            System.err.println("Prints a disassembled view of the given class.");
            System.err.println("Usage: Textifier [-debug] <fully qualified class name or class file name>");
        }
    }

    private void visitBoolean(boolean z) {
        this.f6699buf.append(z);
    }

    private void visitByte(byte b) {
        this.f6699buf.append("(byte)").append((int) b);
    }

    private void visitChar(char c) {
        this.f6699buf.append("(char)").append((int) c);
    }

    private void visitDouble(double d) {
        this.f6699buf.append(d).append('D');
    }

    private void visitFloat(float f) {
        this.f6699buf.append(f).append('F');
    }

    private void visitInt(int i) {
        this.f6699buf.append(i);
    }

    private void visitLong(long j) {
        this.f6699buf.append(j).append('L');
    }

    private void visitShort(short s) {
        this.f6699buf.append("(short)").append((int) s);
    }

    private void visitString(String str) {
        appendString(this.f6699buf, str);
    }

    private void visitType(Type type) {
        this.f6699buf.append(type.getClassName()).append(".class");
    }

    protected void appendDescriptor(int i, String str) {
        if (i != 5 && i != 2 && i != 4) {
            this.f6699buf.append(str);
        } else if (str != null) {
            this.f6699buf.append("// signature ").append(str).append('\n');
        }
    }

    protected void appendHandle(Handle handle) {
        boolean z = true;
        int tag = handle.getTag();
        this.f6699buf.append("// handle kind 0x").append(Integer.toHexString(tag)).append(" : ");
        switch (tag) {
            case 1:
                this.f6699buf.append("GETFIELD");
                z = false;
                break;
            case 2:
                this.f6699buf.append("GETSTATIC");
                z = false;
                break;
            case 3:
                this.f6699buf.append("PUTFIELD");
                z = false;
                break;
            case 4:
                this.f6699buf.append("PUTSTATIC");
                z = false;
                break;
            case 5:
                this.f6699buf.append("INVOKEVIRTUAL");
                break;
            case 6:
                this.f6699buf.append("INVOKESTATIC");
                break;
            case 7:
                this.f6699buf.append("INVOKESPECIAL");
                break;
            case 8:
                this.f6699buf.append("NEWINVOKESPECIAL");
                break;
            case 9:
                this.f6699buf.append("INVOKEINTERFACE");
                break;
            default:
                z = false;
                break;
        }
        this.f6699buf.append('\n');
        this.f6699buf.append(this.tab3);
        appendDescriptor(0, handle.getOwner());
        this.f6699buf.append(FilenameUtils.EXTENSION_SEPARATOR);
        this.f6699buf.append(handle.getName());
        if (!z) {
            this.f6699buf.append('(');
        }
        appendDescriptor(9, handle.getDesc());
        if (z) {
            return;
        }
        this.f6699buf.append(')');
    }

    protected void appendLabel(Label label) {
        if (this.labelNames == null) {
            this.labelNames = new HashMap();
        }
        String string = (String) this.labelNames.get(label);
        if (string == null) {
            string = new StringBuffer().append("L").append(this.labelNames.size()).toString();
            this.labelNames.put(label, string);
        }
        this.f6699buf.append(string);
    }

    protected Textifier createTextifier() {
        return new Textifier();
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.access = i2;
        this.f6699buf.setLength(0);
        this.f6699buf.append("// class version ").append(65535 & i).append(FilenameUtils.EXTENSION_SEPARATOR).append(i >>> 16).append(" (").append(i).append(")\n");
        if ((131072 & i2) != 0) {
            this.f6699buf.append("// DEPRECATED\n");
        }
        this.f6699buf.append("// access flags 0x").append(Integer.toHexString(i2).toUpperCase()).append('\n');
        appendDescriptor(5, str2);
        if (str2 != null) {
            TraceSignatureVisitor traceSignatureVisitor = new TraceSignatureVisitor(i2);
            new SignatureReader(str2).accept(traceSignatureVisitor);
            this.f6699buf.append("// declaration: ").append(str).append(traceSignatureVisitor.getDeclaration()).append('\n');
        }
        appendAccess(i2 & (-33));
        if ((i2 & 8192) != 0) {
            this.f6699buf.append("@interface ");
        } else if ((i2 & 512) != 0) {
            this.f6699buf.append("interface ");
        } else if ((i2 & 16384) == 0) {
            this.f6699buf.append("class ");
        }
        appendDescriptor(0, str);
        if (str3 != null && !"java/lang/Object".equals(str3)) {
            this.f6699buf.append(" extends ");
            appendDescriptor(0, str3);
            this.f6699buf.append(' ');
        }
        if (strArr != null && strArr.length > 0) {
            this.f6699buf.append(" implements ");
            for (String str4 : strArr) {
                appendDescriptor(0, str4);
                this.f6699buf.append(' ');
            }
        }
        this.f6699buf.append(" {\n\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visit(String str, Object obj) {
        int i = 0;
        this.f6699buf.setLength(0);
        int i2 = this.valueNumber;
        this.valueNumber = i2 + 1;
        appendComa(i2);
        if (str != null) {
            this.f6699buf.append(str).append(SignatureVisitor.INSTANCEOF);
        }
        if (obj instanceof String) {
            visitString((String) obj);
        } else if (obj instanceof Type) {
            visitType((Type) obj);
        } else if (obj instanceof Byte) {
            visitByte(((Byte) obj).byteValue());
        } else if (obj instanceof Boolean) {
            visitBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Short) {
            visitShort(((Short) obj).shortValue());
        } else if (obj instanceof Character) {
            visitChar(((Character) obj).charValue());
        } else if (obj instanceof Integer) {
            visitInt(((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            visitFloat(((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            visitLong(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            visitDouble(((Double) obj).doubleValue());
        } else if (obj.getClass().isArray()) {
            this.f6699buf.append('{');
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                while (i < bArr.length) {
                    appendComa(i);
                    visitByte(bArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                while (i < zArr.length) {
                    appendComa(i);
                    visitBoolean(zArr[i]);
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                while (i < sArr.length) {
                    appendComa(i);
                    visitShort(sArr[i]);
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                while (i < cArr.length) {
                    appendComa(i);
                    visitChar(cArr[i]);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                while (i < iArr.length) {
                    appendComa(i);
                    visitInt(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                while (i < jArr.length) {
                    appendComa(i);
                    visitLong(jArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                while (i < fArr.length) {
                    appendComa(i);
                    visitFloat(fArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                while (i < dArr.length) {
                    appendComa(i);
                    visitDouble(dArr[i]);
                    i++;
                }
            }
            this.f6699buf.append('}');
        }
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitAnnotation(String str, String str2) {
        return visitAnnotation(str, str2);
    }

    @Override
    public Textifier visitAnnotation(String str, String str2) {
        this.f6699buf.setLength(0);
        int i = this.valueNumber;
        this.valueNumber = i + 1;
        appendComa(i);
        if (str != null) {
            this.f6699buf.append(str).append(SignatureVisitor.INSTANCEOF);
        }
        this.f6699buf.append('@');
        appendDescriptor(1, str2);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.text.add(")");
        return textifierCreateTextifier;
    }

    public Textifier visitAnnotation(String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append('@');
        appendDescriptor(1, str);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.text.add(z ? ")\n" : ") // invisible\n");
        return textifierCreateTextifier;
    }

    @Override
    public Printer visitAnnotationDefault() {
        return visitAnnotationDefault();
    }

    @Override
    public Textifier visitAnnotationDefault() {
        this.text.add(new StringBuffer().append(this.tab2).append("default=").toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.text.add(IOUtils.LINE_SEPARATOR_UNIX);
        return textifierCreateTextifier;
    }

    @Override
    public void visitAnnotationEnd() {
    }

    @Override
    public Printer visitArray(String str) {
        return visitArray(str);
    }

    @Override
    public Textifier visitArray(String str) {
        this.f6699buf.setLength(0);
        int i = this.valueNumber;
        this.valueNumber = i + 1;
        appendComa(i);
        if (str != null) {
            this.f6699buf.append(str).append(SignatureVisitor.INSTANCEOF);
        }
        this.f6699buf.append('{');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.text.add("}");
        return textifierCreateTextifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void visitAttribute(Attribute attribute) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append("ATTRIBUTE ");
        appendDescriptor(-1, attribute.type);
        if (attribute instanceof Textifiable) {
            ((Textifiable) attribute).textify(this.f6699buf, null);
        } else {
            this.f6699buf.append(" : unknown\n");
        }
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitClassAnnotation(String str, boolean z) {
        return visitClassAnnotation(str, z);
    }

    @Override
    public Textifier visitClassAnnotation(String str, boolean z) {
        this.text.add(IOUtils.LINE_SEPARATOR_UNIX);
        return visitAnnotation(str, z);
    }

    @Override
    public void visitClassAttribute(Attribute attribute) {
        this.text.add(IOUtils.LINE_SEPARATOR_UNIX);
        visitAttribute(attribute);
    }

    @Override
    public void visitClassEnd() {
        this.text.add("}\n");
    }

    @Override
    public Printer visitClassTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        this.text.add(IOUtils.LINE_SEPARATOR_UNIX);
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitCode() {
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        int i = this.valueNumber;
        this.valueNumber = i + 1;
        appendComa(i);
        if (str != null) {
            this.f6699buf.append(str).append(SignatureVisitor.INSTANCEOF);
        }
        appendDescriptor(1, str2);
        this.f6699buf.append(FilenameUtils.EXTENSION_SEPARATOR).append(str3);
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitField(int i, String str, String str2, String str3, Object obj) {
        return visitField(i, str, str2, str3, obj);
    }

    @Override
    public Textifier visitField(int i, String str, String str2, String str3, Object obj) {
        this.f6699buf.setLength(0);
        this.f6699buf.append('\n');
        if ((131072 & i) != 0) {
            this.f6699buf.append(this.f6700tab).append("// DEPRECATED\n");
        }
        this.f6699buf.append(this.f6700tab).append("// access flags 0x").append(Integer.toHexString(i).toUpperCase()).append('\n');
        if (str3 != null) {
            this.f6699buf.append(this.f6700tab);
            appendDescriptor(2, str3);
            TraceSignatureVisitor traceSignatureVisitor = new TraceSignatureVisitor(0);
            new SignatureReader(str3).acceptType(traceSignatureVisitor);
            this.f6699buf.append(this.f6700tab).append("// declaration: ").append(traceSignatureVisitor.getDeclaration()).append('\n');
        }
        this.f6699buf.append(this.f6700tab);
        appendAccess(i);
        appendDescriptor(1, str2);
        this.f6699buf.append(' ').append(str);
        if (obj != null) {
            this.f6699buf.append(" = ");
            if (obj instanceof String) {
                this.f6699buf.append('\"').append(obj).append('\"');
            } else {
                this.f6699buf.append(obj);
            }
        }
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        return textifierCreateTextifier;
    }

    @Override
    public Printer visitFieldAnnotation(String str, boolean z) {
        return visitFieldAnnotation(str, z);
    }

    @Override
    public Textifier visitFieldAnnotation(String str, boolean z) {
        return visitAnnotation(str, z);
    }

    @Override
    public void visitFieldAttribute(Attribute attribute) {
        visitAttribute(attribute);
    }

    @Override
    public void visitFieldEnd() {
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ');
        appendDescriptor(0, str);
        this.f6699buf.append(FilenameUtils.EXTENSION_SEPARATOR).append(str2).append(" : ");
        appendDescriptor(1, str3);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitFieldTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.ltab);
        this.f6699buf.append("FRAME ");
        switch (i) {
            case -1:
            case 0:
                this.f6699buf.append("FULL [");
                appendFrameTypes(i2, objArr);
                this.f6699buf.append("] [");
                appendFrameTypes(i3, objArr2);
                this.f6699buf.append(']');
                break;
            case 1:
                this.f6699buf.append("APPEND [");
                appendFrameTypes(i2, objArr);
                this.f6699buf.append(']');
                break;
            case 2:
                this.f6699buf.append("CHOP ").append(i2);
                break;
            case 3:
                this.f6699buf.append("SAME");
                break;
            case 4:
                this.f6699buf.append("SAME1 ");
                appendFrameTypes(1, objArr2);
                break;
        }
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("IINC ").append(i).append(' ').append(i2).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append("// access flags 0x");
        this.f6699buf.append(Integer.toHexString(i & (-33)).toUpperCase()).append('\n');
        this.f6699buf.append(this.f6700tab);
        appendAccess(i);
        this.f6699buf.append("INNERCLASS ");
        appendDescriptor(0, str);
        this.f6699buf.append(' ');
        appendDescriptor(0, str2);
        this.f6699buf.append(' ');
        appendDescriptor(0, str3);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInsn(int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ').append(i == 188 ? TYPES[i2] : Integer.toString(i2)).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        int i = 0;
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("INVOKEDYNAMIC").append(' ');
        this.f6699buf.append(str);
        appendDescriptor(3, str2);
        this.f6699buf.append(" [");
        this.f6699buf.append('\n');
        this.f6699buf.append(this.tab3);
        appendHandle(handle);
        this.f6699buf.append('\n');
        this.f6699buf.append(this.tab3).append("// arguments:");
        if (objArr.length == 0) {
            this.f6699buf.append(" none");
        } else {
            this.f6699buf.append('\n');
            while (true) {
                int i2 = i;
                if (i2 >= objArr.length) {
                    break;
                }
                this.f6699buf.append(this.tab3);
                Object obj = objArr[i2];
                if (obj instanceof String) {
                    Printer.appendString(this.f6699buf, (String) obj);
                } else if (obj instanceof Type) {
                    Type type = (Type) obj;
                    if (type.getSort() == 11) {
                        appendDescriptor(3, type.getDescriptor());
                    } else {
                        this.f6699buf.append(type.getDescriptor()).append(".class");
                    }
                } else if (obj instanceof Handle) {
                    appendHandle((Handle) obj);
                } else {
                    this.f6699buf.append(obj);
                }
                this.f6699buf.append(", \n");
                i = i2 + 1;
            }
            this.f6699buf.setLength(this.f6699buf.length() - 3);
        }
        this.f6699buf.append('\n');
        this.f6699buf.append(this.tab2).append("]\n");
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ');
        appendLabel(label);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLabel(Label label) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.ltab);
        appendLabel(label);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("LDC ");
        if (obj instanceof String) {
            Printer.appendString(this.f6699buf, (String) obj);
        } else if (obj instanceof Type) {
            this.f6699buf.append(((Type) obj).getDescriptor()).append(".class");
        } else {
            this.f6699buf.append(obj);
        }
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("LINENUMBER ").append(i).append(' ');
        appendLabel(label);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("LOCALVARIABLE ").append(str).append(' ');
        appendDescriptor(1, str2);
        this.f6699buf.append(' ');
        appendLabel(label);
        this.f6699buf.append(' ');
        appendLabel(label2);
        this.f6699buf.append(' ').append(i).append('\n');
        if (str3 != null) {
            this.f6699buf.append(this.tab2);
            appendDescriptor(2, str3);
            TraceSignatureVisitor traceSignatureVisitor = new TraceSignatureVisitor(0);
            new SignatureReader(str3).acceptType(traceSignatureVisitor);
            this.f6699buf.append(this.tab2).append("// declaration: ").append(traceSignatureVisitor.getDeclaration()).append('\n');
        }
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("LOCALVARIABLE @");
        appendDescriptor(1, str);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.f6699buf.setLength(0);
        this.f6699buf.append(") : ");
        appendTypeReference(i);
        this.f6699buf.append(", ").append(typePath);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.f6699buf.append(" [ ");
            appendLabel(labelArr[i2]);
            this.f6699buf.append(" - ");
            appendLabel(labelArr2[i2]);
            this.f6699buf.append(" - ").append(iArr[i2]).append(" ]");
        }
        this.f6699buf.append(z ? IOUtils.LINE_SEPARATOR_UNIX : " // invisible\n");
        this.text.add(this.f6699buf.toString());
        return textifierCreateTextifier;
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("LOOKUPSWITCH\n");
        for (int i = 0; i < labelArr.length; i++) {
            this.f6699buf.append(this.tab3).append(iArr[i]).append(": ");
            appendLabel(labelArr[i]);
            this.f6699buf.append('\n');
        }
        this.f6699buf.append(this.tab3).append("default: ");
        appendLabel(label);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitMaxs(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("MAXSTACK = ").append(i).append('\n');
        this.text.add(this.f6699buf.toString());
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("MAXLOCALS = ").append(i2).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return visitMethod(i, str, str2, str3, strArr);
    }

    @Override
    public Textifier visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        this.f6699buf.setLength(0);
        this.f6699buf.append('\n');
        if ((131072 & i) != 0) {
            this.f6699buf.append(this.f6700tab).append("// DEPRECATED\n");
        }
        this.f6699buf.append(this.f6700tab).append("// access flags 0x").append(Integer.toHexString(i).toUpperCase()).append('\n');
        if (str3 != null) {
            this.f6699buf.append(this.f6700tab);
            appendDescriptor(4, str3);
            TraceSignatureVisitor traceSignatureVisitor = new TraceSignatureVisitor(0);
            new SignatureReader(str3).accept(traceSignatureVisitor);
            String declaration = traceSignatureVisitor.getDeclaration();
            String returnType = traceSignatureVisitor.getReturnType();
            String exceptions = traceSignatureVisitor.getExceptions();
            this.f6699buf.append(this.f6700tab).append("// declaration: ").append(returnType).append(' ').append(str).append(declaration);
            if (exceptions != null) {
                this.f6699buf.append(" throws ").append(exceptions);
            }
            this.f6699buf.append('\n');
        }
        this.f6699buf.append(this.f6700tab);
        appendAccess(i & (-65));
        if ((i & 256) != 0) {
            this.f6699buf.append("native ");
        }
        if ((i & 128) != 0) {
            this.f6699buf.append("varargs ");
        }
        if ((i & 64) != 0) {
            this.f6699buf.append("bridge ");
        }
        if ((this.access & 512) != 0 && (i & 1024) == 0 && (i & 8) == 0) {
            this.f6699buf.append("default ");
        }
        this.f6699buf.append(str);
        appendDescriptor(3, str2);
        if (strArr != null && strArr.length > 0) {
            this.f6699buf.append(" throws ");
            for (String str4 : strArr) {
                appendDescriptor(0, str4);
                this.f6699buf.append(' ');
            }
        }
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        return textifierCreateTextifier;
    }

    @Override
    public Printer visitMethodAnnotation(String str, boolean z) {
        return visitMethodAnnotation(str, z);
    }

    @Override
    public Textifier visitMethodAnnotation(String str, boolean z) {
        return visitAnnotation(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitMethodAttribute(Attribute attribute) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append("ATTRIBUTE ");
        appendDescriptor(-1, attribute.type);
        if (attribute instanceof Textifiable) {
            ((Textifiable) attribute).textify(this.f6699buf, this.labelNames);
        } else {
            this.f6699buf.append(" : unknown\n");
        }
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitMethodEnd() {
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
    public Printer visitMethodTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return visitTypeAnnotation(i, typePath, str, z);
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("MULTIANEWARRAY ");
        appendDescriptor(1, str);
        this.f6699buf.append(' ').append(i).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append("OUTERCLASS ");
        appendDescriptor(0, str);
        this.f6699buf.append(' ');
        if (str2 != null) {
            this.f6699buf.append(str2).append(' ');
        }
        appendDescriptor(3, str3);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitParameter(String str, int i) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("// parameter ");
        appendAccess(i);
        StringBuffer stringBufferAppend = this.f6699buf.append(' ');
        if (str == null) {
            str = "<no name>";
        }
        stringBufferAppend.append(str).append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitParameterAnnotation(int i, String str, boolean z) {
        return visitParameterAnnotation(i, str, z);
    }

    @Override
    public Textifier visitParameterAnnotation(int i, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append('@');
        appendDescriptor(1, str);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.text.add(z ? ") // parameter " : ") // invisible, parameter ");
        this.text.add(new Integer(i));
        this.text.add(IOUtils.LINE_SEPARATOR_UNIX);
        return textifierCreateTextifier;
    }

    @Override
    public void visitSource(String str, String str2) {
        this.f6699buf.setLength(0);
        if (str != null) {
            this.f6699buf.append(this.f6700tab).append("// compiled from: ").append(str).append('\n');
        }
        if (str2 != null) {
            this.f6699buf.append(this.f6700tab).append("// debug info: ").append(str2).append('\n');
        }
        if (this.f6699buf.length() > 0) {
            this.text.add(this.f6699buf.toString());
        }
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("TABLESWITCH\n");
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            this.f6699buf.append(this.tab3).append(i + i3).append(": ");
            appendLabel(labelArr[i3]);
            this.f6699buf.append('\n');
        }
        this.f6699buf.append(this.tab3).append("default: ");
        appendLabel(label);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public Printer visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("TRYCATCHBLOCK @");
        appendDescriptor(1, str);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.f6699buf.setLength(0);
        this.f6699buf.append(") : ");
        appendTypeReference(i);
        this.f6699buf.append(", ").append(typePath);
        this.f6699buf.append(z ? IOUtils.LINE_SEPARATOR_UNIX : " // invisible\n");
        this.text.add(this.f6699buf.toString());
        return textifierCreateTextifier;
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append("TRYCATCHBLOCK ");
        appendLabel(label);
        this.f6699buf.append(' ');
        appendLabel(label2);
        this.f6699buf.append(' ');
        appendLabel(label3);
        this.f6699buf.append(' ');
        appendDescriptor(0, str);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    public Textifier visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.f6700tab).append('@');
        appendDescriptor(1, str);
        this.f6699buf.append('(');
        this.text.add(this.f6699buf.toString());
        Textifier textifierCreateTextifier = createTextifier();
        this.text.add(textifierCreateTextifier.getText());
        this.f6699buf.setLength(0);
        this.f6699buf.append(") : ");
        appendTypeReference(i);
        this.f6699buf.append(", ").append(typePath);
        this.f6699buf.append(z ? IOUtils.LINE_SEPARATOR_UNIX : " // invisible\n");
        this.text.add(this.f6699buf.toString());
        return textifierCreateTextifier;
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ');
        appendDescriptor(0, str);
        this.f6699buf.append('\n');
        this.text.add(this.f6699buf.toString());
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        this.f6699buf.setLength(0);
        this.f6699buf.append(this.tab2).append(OPCODES[i]).append(' ').append(i2).append('\n');
        this.text.add(this.f6699buf.toString());
    }
}
