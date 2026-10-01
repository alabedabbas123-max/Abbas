package org.objectweb.asm.util;

import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.SimpleVerifier;

public class CheckClassAdapter extends ClassVisitor {
    static Class class$org$objectweb$asm$util$CheckClassAdapter = class$("org.objectweb.asm.util.CheckClassAdapter");
    private boolean checkDataFlow;

    private boolean f6695end;
    private Map labels;
    private boolean outer;
    private boolean source;
    private boolean start;
    private int version;

    protected CheckClassAdapter(int i, ClassVisitor classVisitor, boolean z) {
        super(i, classVisitor);
        this.labels = new HashMap();
        this.checkDataFlow = z;
    }

    public CheckClassAdapter(ClassVisitor classVisitor) {
        this(classVisitor, true);
    }

    public CheckClassAdapter(ClassVisitor classVisitor, boolean z) {
        this(Opcodes.ASM5, classVisitor, z);
        if (getClass() != class$org$objectweb$asm$util$CheckClassAdapter) {
            throw new IllegalStateException();
        }
    }

    static void checkAccess(int i, int i2) {
        if (((i2 ^ (-1)) & i) != 0) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid access flags: ").append(i).toString());
        }
        int i3 = (i & 1) == 0 ? 0 : 1;
        if (((i & 4) == 0 ? 0 : 1) + ((i & 2) == 0 ? 0 : 1) + i3 > 1) {
            throw new IllegalArgumentException(new StringBuffer().append("public private and protected are mutually exclusive: ").append(i).toString());
        }
        if (((i & 1024) != 0 ? 1 : 0) + ((i & 16) == 0 ? 0 : 1) > 1) {
            throw new IllegalArgumentException(new StringBuffer().append("final and abstract are mutually exclusive: ").append(i).toString());
        }
    }

    private static int checkChar(char c, String str, int i) {
        if (getChar(str, i) == c) {
            return i + 1;
        }
        throw new IllegalArgumentException(new StringBuffer().append(str).append(": '").append(c).append("' expected at index ").append(i).toString());
    }

    public static void checkClassSignature(String str) {
        int iCheckClassTypeSignature = checkClassTypeSignature(str, getChar(str, 0) == '<' ? checkFormalTypeParameters(str, 0) : 0);
        while (getChar(str, iCheckClassTypeSignature) == 'L') {
            iCheckClassTypeSignature = checkClassTypeSignature(str, iCheckClassTypeSignature);
        }
        if (iCheckClassTypeSignature != str.length()) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(": error at index ").append(iCheckClassTypeSignature).toString());
        }
    }

    private static int checkClassTypeSignature(String str, int i) {
        int iCheckIdentifier = checkIdentifier(str, checkChar('L', str, i));
        while (getChar(str, iCheckIdentifier) == '/') {
            iCheckIdentifier = checkIdentifier(str, iCheckIdentifier + 1);
        }
        if (getChar(str, iCheckIdentifier) == '<') {
            iCheckIdentifier = checkTypeArguments(str, iCheckIdentifier);
        }
        while (getChar(str, iCheckIdentifier) == '.') {
            iCheckIdentifier = checkIdentifier(str, iCheckIdentifier + 1);
            if (getChar(str, iCheckIdentifier) == '<') {
                iCheckIdentifier = checkTypeArguments(str, iCheckIdentifier);
            }
        }
        return checkChar(';', str, iCheckIdentifier);
    }

    public static void checkFieldSignature(String str) {
        int iCheckFieldTypeSignature = checkFieldTypeSignature(str, 0);
        if (iCheckFieldTypeSignature != str.length()) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(": error at index ").append(iCheckFieldTypeSignature).toString());
        }
    }

    private static int checkFieldTypeSignature(String str, int i) {
        switch (getChar(str, i)) {
            case 'L':
                return checkClassTypeSignature(str, i);
            case '[':
                return checkTypeSignature(str, i + 1);
            default:
                return checkTypeVariableSignature(str, i);
        }
    }

    private static int checkFormalTypeParameter(String str, int i) {
        int iCheckChar = checkChar(':', str, checkIdentifier(str, i));
        if ("L[T".indexOf(getChar(str, iCheckChar)) != -1) {
            iCheckChar = checkFieldTypeSignature(str, iCheckChar);
        }
        while (getChar(str, iCheckChar) == ':') {
            iCheckChar = checkFieldTypeSignature(str, iCheckChar + 1);
        }
        return iCheckChar;
    }

    private static int checkFormalTypeParameters(String str, int i) {
        int iCheckFormalTypeParameter = checkFormalTypeParameter(str, checkChar('<', str, i));
        while (getChar(str, iCheckFormalTypeParameter) != '>') {
            iCheckFormalTypeParameter = checkFormalTypeParameter(str, iCheckFormalTypeParameter);
        }
        return iCheckFormalTypeParameter + 1;
    }

    private static int checkIdentifier(String str, int i) {
        if (!Character.isJavaIdentifierStart(getChar(str, i))) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(": identifier expected at index ").append(i).toString());
        }
        int i2 = i + 1;
        while (Character.isJavaIdentifierPart(getChar(str, i2))) {
            i2++;
        }
        return i2;
    }

    public static void checkMethodSignature(String str) {
        int iCheckChar = checkChar('(', str, getChar(str, 0) == '<' ? checkFormalTypeParameters(str, 0) : 0);
        while ("ZCBSIFJDL[T".indexOf(getChar(str, iCheckChar)) != -1) {
            iCheckChar = checkTypeSignature(str, iCheckChar);
        }
        int iCheckChar2 = checkChar(')', str, iCheckChar);
        int iCheckTypeSignature = getChar(str, iCheckChar2) == 'V' ? iCheckChar2 + 1 : checkTypeSignature(str, iCheckChar2);
        while (getChar(str, iCheckTypeSignature) == '^') {
            int i = iCheckTypeSignature + 1;
            iCheckTypeSignature = getChar(str, i) == 'L' ? checkClassTypeSignature(str, i) : checkTypeVariableSignature(str, i);
        }
        if (iCheckTypeSignature != str.length()) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(": error at index ").append(iCheckTypeSignature).toString());
        }
    }

    private void checkState() {
        if (!this.start) {
            throw new IllegalStateException("Cannot visit member before visit has been called.");
        }
        if (this.f6695end) {
            throw new IllegalStateException("Cannot visit member after visitEnd has been called.");
        }
    }

    private static int checkTypeArgument(String str, int i) {
        char c = getChar(str, i);
        if (c == '*') {
            return i + 1;
        }
        if (c == '+' || c == '-') {
            i++;
        }
        return checkFieldTypeSignature(str, i);
    }

    private static int checkTypeArguments(String str, int i) {
        int iCheckTypeArgument = checkTypeArgument(str, checkChar('<', str, i));
        while (getChar(str, iCheckTypeArgument) != '>') {
            iCheckTypeArgument = checkTypeArgument(str, iCheckTypeArgument);
        }
        return iCheckTypeArgument + 1;
    }

    static void checkTypeRefAndPath(int i, TypePath typePath) {
        int i2;
        switch (i >>> 24) {
            case 0:
            case 1:
            case 22:
                i2 = -65536;
                break;
            case 16:
            case 17:
            case 18:
            case 23:
            case 66:
                i2 = -256;
                break;
            case 19:
            case 20:
            case 21:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
                i2 = -16777216;
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                i2 = -16776961;
                break;
            default:
                throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i >>> 24)).toString());
        }
        if (((i2 ^ (-1)) & i) != 0) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference 0x").append(Integer.toHexString(i)).toString());
        }
        if (typePath != null) {
            for (int i3 = 0; i3 < typePath.getLength(); i3++) {
                int step = typePath.getStep(i3);
                if (step != 0 && step != 1 && step != 3 && step != 2) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid type path step ").append(i3).append(" in ").append(typePath).toString());
                }
                if (step != 3 && typePath.getStepArgument(i3) != 0) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid type path step argument for step ").append(i3).append(" in ").append(typePath).toString());
                }
            }
        }
    }

    private static int checkTypeSignature(String str, int i) {
        switch (getChar(str, i)) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'Z':
                return i + 1;
            default:
                return checkFieldTypeSignature(str, i);
        }
    }

    private static int checkTypeVariableSignature(String str, int i) {
        return checkChar(';', str, checkIdentifier(str, checkChar('T', str, i)));
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static char getChar(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    private static String getShortName(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        int length = str.length();
        if (str.charAt(length - 1) == ';') {
            length--;
        }
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1, length);
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length == 1) {
            verify(strArr[0].endsWith(".class") ? new ClassReader(new FileInputStream(strArr[0])) : new ClassReader(strArr[0]), false, new PrintWriter(System.err));
        } else {
            System.err.println("Verifies the given class.");
            System.err.println("Usage: CheckClassAdapter <fully qualified class name or class file name>");
        }
    }

    static void printAnalyzerResult(MethodNode methodNode, Analyzer analyzer, PrintWriter printWriter) {
        Frame[] frames = analyzer.getFrames();
        Textifier textifier = new Textifier();
        TraceMethodVisitor traceMethodVisitor = new TraceMethodVisitor(textifier);
        printWriter.println(new StringBuffer().append(methodNode.name).append(methodNode.desc).toString());
        for (int i = 0; i < methodNode.instructions.size(); i++) {
            methodNode.instructions.m9027get(i).accept(traceMethodVisitor);
            StringBuffer stringBuffer = new StringBuffer();
            Frame frame = frames[i];
            if (frame == null) {
                stringBuffer.append('?');
            } else {
                for (int i2 = 0; i2 < frame.getLocals(); i2++) {
                    stringBuffer.append(getShortName(((BasicValue) frame.getLocal(i2)).toString())).append(' ');
                }
                stringBuffer.append(" : ");
                for (int i3 = 0; i3 < frame.getStackSize(); i3++) {
                    stringBuffer.append(getShortName(((BasicValue) frame.getStack(i3)).toString())).append(' ');
                }
            }
            while (stringBuffer.length() < methodNode.maxStack + methodNode.maxLocals + 1) {
                stringBuffer.append(' ');
            }
            printWriter.print(Integer.toString(100000 + i).substring(1));
            printWriter.print(new StringBuffer().append(" ").append((Object) stringBuffer).append(" : ").append(textifier.text.get(textifier.text.size() - 1)).toString());
        }
        for (int i4 = 0; i4 < methodNode.tryCatchBlocks.size(); i4++) {
            ((TryCatchBlockNode) methodNode.tryCatchBlocks.get(i4)).accept(traceMethodVisitor);
            printWriter.print(new StringBuffer().append(" ").append(textifier.text.get(textifier.text.size() - 1)).toString());
        }
        printWriter.println();
    }

    public static void verify(ClassReader classReader, ClassLoader classLoader, boolean z, PrintWriter printWriter) {
        ClassNode classNode = new ClassNode();
        classReader.accept(new CheckClassAdapter(classNode, false), 2);
        Type objectType = classNode.superName == null ? null : Type.getObjectType(classNode.superName);
        List list = classNode.methods;
        ArrayList arrayList = new ArrayList();
        Iterator it = classNode.interfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(Type.getObjectType((String) it.next()));
        }
        for (int i = 0; i < list.size(); i++) {
            MethodNode methodNode = (MethodNode) list.get(i);
            SimpleVerifier simpleVerifier = new SimpleVerifier(Type.getObjectType(classNode.name), objectType, arrayList, (classNode.access & 512) != 0);
            Analyzer analyzer = new Analyzer(simpleVerifier);
            if (classLoader != null) {
                simpleVerifier.setClassLoader(classLoader);
            }
            try {
                analyzer.analyze(classNode.name, methodNode);
                if (z) {
                    printAnalyzerResult(methodNode, analyzer, printWriter);
                }
            } catch (Exception e) {
                e.printStackTrace(printWriter);
            }
        }
        printWriter.flush();
    }

    public static void verify(ClassReader classReader, boolean z, PrintWriter printWriter) {
        verify(classReader, null, z, printWriter);
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (this.start) {
            throw new IllegalStateException("visit must be called only once");
        }
        this.start = true;
        checkState();
        checkAccess(i2, 423473);
        if (str == null || !str.endsWith("package-info")) {
            CheckMethodAdapter.checkInternalName(str, "class name");
        }
        if (!"java/lang/Object".equals(str)) {
            CheckMethodAdapter.checkInternalName(str3, "super class name");
        } else if (str3 != null) {
            throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
        }
        if (str2 != null) {
            checkClassSignature(str2);
        }
        if ((i2 & 512) != 0 && !"java/lang/Object".equals(str3)) {
            throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
        }
        if (strArr != null) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                CheckMethodAdapter.checkInternalName(strArr[i3], new StringBuffer().append("interface name at index ").append(i3).toString());
            }
        }
        this.version = i;
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        checkState();
        CheckMethodAdapter.checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitAnnotation(str, z));
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        checkState();
        if (attribute == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.visitAttribute(attribute);
    }

    @Override
    public void visitEnd() {
        checkState();
        this.f6695end = true;
        super.visitEnd();
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        checkState();
        checkAccess(i, 413919);
        CheckMethodAdapter.checkUnqualifiedName(this.version, str, "field name");
        CheckMethodAdapter.checkDesc(str2, false);
        if (str3 != null) {
            checkFieldSignature(str3);
        }
        if (obj != null) {
            CheckMethodAdapter.checkConstant(obj);
        }
        return new CheckFieldAdapter(super.visitField(i, str, str2, str3, obj));
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        checkState();
        CheckMethodAdapter.checkInternalName(str, "class name");
        if (str2 != null) {
            CheckMethodAdapter.checkInternalName(str2, "outer class name");
        }
        if (str3 != null) {
            int i2 = 0;
            while (i2 < str3.length() && Character.isDigit(str3.charAt(i2))) {
                i2++;
            }
            if (i2 == 0 || i2 < str3.length()) {
                CheckMethodAdapter.checkIdentifier(str3, i2, -1, "inner class name");
            }
        }
        checkAccess(i, AccessFlags.INNER_CLASS_FLAGS);
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        checkState();
        checkAccess(i, 400895);
        if (!"<init>".equals(str) && !"<clinit>".equals(str)) {
            CheckMethodAdapter.checkMethodIdentifier(this.version, str, "method name");
        }
        CheckMethodAdapter.checkMethodDesc(str2);
        if (str3 != null) {
            checkMethodSignature(str3);
        }
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                CheckMethodAdapter.checkInternalName(strArr[i2], new StringBuffer().append("exception name at index ").append(i2).toString());
            }
        }
        CheckMethodAdapter checkMethodAdapter = this.checkDataFlow ? new CheckMethodAdapter(i, str, str2, super.visitMethod(i, str, str2, str3, strArr), this.labels) : new CheckMethodAdapter(super.visitMethod(i, str, str2, str3, strArr), this.labels);
        checkMethodAdapter.version = this.version;
        return checkMethodAdapter;
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        checkState();
        if (this.outer) {
            throw new IllegalStateException("visitOuterClass can be called only once.");
        }
        this.outer = true;
        if (str == null) {
            throw new IllegalArgumentException("Illegal outer class owner");
        }
        if (str3 != null) {
            CheckMethodAdapter.checkMethodDesc(str3);
        }
        super.visitOuterClass(str, str2, str3);
    }

    @Override
    public void visitSource(String str, String str2) {
        checkState();
        if (this.source) {
            throw new IllegalStateException("visitSource can be called only once.");
        }
        this.source = true;
        super.visitSource(str, str2);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        checkState();
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 17 && i2 != 16) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i2)).toString());
        }
        checkTypeRefAndPath(i, typePath);
        CheckMethodAdapter.checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitTypeAnnotation(i, typePath, str, z));
    }
}
