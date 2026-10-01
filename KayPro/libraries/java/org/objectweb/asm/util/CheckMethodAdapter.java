package org.objectweb.asm.util;

import com.baidu.mobstat.Config;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.BasicVerifier;

public class CheckMethodAdapter extends MethodVisitor {
    private static final int[] TYPE;
    static Class class$org$objectweb$asm$Label;
    static Class class$org$objectweb$asm$util$CheckMethodAdapter;
    private static Field labelStatusField;
    private int access;
    private int compressedFrames;
    private boolean endCode;
    private boolean endMethod;
    private int expandedFrames;
    private List handlers;
    private int insnCount;
    private final Map labels;
    private int lastFrame;
    private boolean startCode;
    private Set usedLabels;
    public int version;

    static {
        _clinit_();
        TYPE = new int["BBBBBBBBBBBBBBBBCCIAADDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBDDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBJBBBBBBBBBBBBBBBBBBBBHHHHHHHHHHHHHHHHDKLBBBBBBFFFFGGGGAECEBBEEBBAMHHAA".length()];
        for (int i = 0; i < TYPE.length; i++) {
            TYPE[i] = ("BBBBBBBBBBBBBBBBCCIAADDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBDDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBJBBBBBBBBBBBBBBBBBBBBHHHHHHHHHHHHHHHHDKLBBBBBBFFFFGGGGAECEBBEEBBAMHHAA".charAt(i) - 'A') - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckMethodAdapter(int i, String str, String str2, MethodVisitor methodVisitor, Map map) {
        this(new MethodNode(Opcodes.ASM5, i, str, str2, null, 0 == true ? 1 : 0, methodVisitor) {
            final MethodVisitor val$cmv;

            {
                this.val$cmv = methodVisitor;
            }

            @Override
            public void visitEnd() {
                Analyzer analyzer = new Analyzer(new BasicVerifier());
                try {
                    analyzer.analyze("dummy", this);
                    accept(this.val$cmv);
                } catch (Exception e) {
                    if ((e instanceof IndexOutOfBoundsException) && this.maxLocals == 0 && this.maxStack == 0) {
                        throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values.");
                    }
                    e.printStackTrace();
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
                    CheckClassAdapter.printAnalyzerResult(this, analyzer, printWriter);
                    printWriter.close();
                    throw new RuntimeException(new StringBuffer().append(e.getMessage()).append(' ').append(stringWriter.toString()).toString());
                }
            }
        }, map);
        this.access = i;
    }

    protected CheckMethodAdapter(int i, MethodVisitor methodVisitor, Map map) {
        super(i, methodVisitor);
        this.lastFrame = -1;
        this.labels = map;
        this.usedLabels = new HashSet();
        this.handlers = new ArrayList();
    }

    public CheckMethodAdapter(MethodVisitor methodVisitor) {
        this(methodVisitor, new HashMap());
    }

    public CheckMethodAdapter(MethodVisitor methodVisitor, Map map) {
        this(Opcodes.ASM5, methodVisitor, map);
        if (getClass() != class$org$objectweb$asm$util$CheckMethodAdapter) {
            throw new IllegalStateException();
        }
    }

    private static void _clinit_() {
        class$org$objectweb$asm$util$CheckMethodAdapter = class$("org.objectweb.asm.util.CheckMethodAdapter");
        class$org$objectweb$asm$Label = class$("org.objectweb.asm.Label");
    }

    static void checkConstant(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String)) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid constant: ").append(obj).toString());
        }
    }

    static int checkDesc(String str, int i, boolean z) {
        if (str == null || i >= str.length()) {
            throw new IllegalArgumentException("Invalid type descriptor (must not be null or empty)");
        }
        switch (str.charAt(i)) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'Z':
                return i + 1;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
                throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
            case 'L':
                int iIndexOf = str.indexOf(59, i);
                if (iIndexOf == -1 || iIndexOf - i < 2) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
                }
                try {
                    checkInternalName(str, i + 1, iIndexOf, null);
                    return iIndexOf + 1;
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
                }
            case 'V':
                if (z) {
                    return i + 1;
                }
                throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
            case '[':
                int i2 = i + 1;
                while (i2 < str.length() && str.charAt(i2) == '[') {
                    i2++;
                }
                if (i2 < str.length()) {
                    return checkDesc(str, i2, false);
                }
                throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
        }
    }

    static void checkDesc(String str, boolean z) {
        if (checkDesc(str, 0, z) != str.length()) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
        }
    }

    static void checkIdentifier(String str, int i, int i2, String str2) {
        if (str == null || (i2 != -1 ? i2 <= i : str.length() <= i)) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must not be null or empty)").toString());
        }
        if (!Character.isJavaIdentifierStart(str.charAt(i))) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a valid Java identifier): ").append(str).toString());
        }
        if (i2 == -1) {
            i2 = str.length();
        }
        for (int i3 = i + 1; i3 < i2; i3++) {
            if (!Character.isJavaIdentifierPart(str.charAt(i3))) {
                throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a valid Java identifier): ").append(str).toString());
            }
        }
    }

    static void checkIdentifier(String str, String str2) {
        checkIdentifier(str, 0, -1, str2);
    }

    static void checkInternalName(String str, int i, int i2, String str2) {
        int iIndexOf;
        if (i2 == -1) {
            i2 = str.length();
        }
        do {
            try {
                iIndexOf = str.indexOf(47, i + 1);
                if (iIndexOf == -1 || iIndexOf > i2) {
                    iIndexOf = i2;
                }
                checkIdentifier(str, i, iIndexOf, null);
                i = iIndexOf + 1;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a fully qualified class name in internal form): ").append(str).toString());
            }
        } while (iIndexOf != i2);
    }

    static void checkInternalName(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must not be null or empty)").toString());
        }
        if (str.charAt(0) == '[') {
            checkDesc(str, false);
        } else {
            checkInternalName(str, 0, -1, str2);
        }
    }

    static void checkMethodDesc(String str) {
        int iCheckDesc;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)");
        }
        if (str.charAt(0) != '(' || str.length() < 3) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
        }
        if (str.charAt(1) != ')') {
            iCheckDesc = 1;
            do {
                if (str.charAt(iCheckDesc) != 'V') {
                    iCheckDesc = checkDesc(str, iCheckDesc, false);
                    if (iCheckDesc >= str.length()) {
                        break;
                    }
                } else {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
                }
            } while (str.charAt(iCheckDesc) != ')');
        } else {
            iCheckDesc = 1;
        }
        if (checkDesc(str, iCheckDesc + 1, true) != str.length()) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor: ").append(str).toString());
        }
    }

    static void checkMethodIdentifier(int i, String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must not be null or empty)").toString());
        }
        if ((65535 & i) >= 49) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (".;[/<>".indexOf(str.charAt(i2)) != -1) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a valid unqualified name): ").append(str).toString());
                }
            }
            return;
        }
        if (!Character.isJavaIdentifierStart(str.charAt(0))) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a '<init>', '<clinit>' or a valid Java identifier): ").append(str).toString());
        }
        for (int i3 = 1; i3 < str.length(); i3++) {
            if (!Character.isJavaIdentifierPart(str.charAt(i3))) {
                throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be '<init>' or '<clinit>' or a valid Java identifier): ").append(str).toString());
            }
        }
    }

    private static void checkNonDebugLabel(Label label) {
        int iIntValue;
        Field labelStatusField2 = getLabelStatusField();
        if (labelStatusField2 == null) {
            iIntValue = 0;
        } else {
            try {
                iIntValue = ((Integer) labelStatusField2.get(label)).intValue();
            } catch (IllegalAccessException e) {
                throw new Error("Internal error");
            }
        }
        if ((iIntValue & 1) != 0) {
            throw new IllegalArgumentException("Labels used for debug info cannot be reused for control flow");
        }
    }

    static void checkOpcode(int i, int i2) {
        if (i < 0 || i > 199 || TYPE[i] != i2) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid opcode: ").append(i).toString());
        }
    }

    static void checkSignedByte(int i, String str) {
        if (i < -128 || i > 127) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(" (must be a signed byte): ").append(i).toString());
        }
    }

    static void checkSignedShort(int i, String str) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(" (must be a signed short): ").append(i).toString());
        }
    }

    static void checkUnqualifiedName(int i, String str, String str2) {
        if ((65535 & i) < 49) {
            checkIdentifier(str, str2);
            return;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (".;[/".indexOf(str.charAt(i2)) != -1) {
                throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str2).append(" (must be a valid unqualified name): ").append(str).toString());
            }
        }
    }

    static void checkUnsignedShort(int i, String str) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(new StringBuffer().append(str).append(" (must be an unsigned short): ").append(i).toString());
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
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 5);
        if (i != 183 || !"<init>".equals(str2)) {
            checkMethodIdentifier(this.version, str2, "name");
        }
        checkInternalName(str, "owner");
        checkMethodDesc(str3);
        if (i == 182 && z) {
            throw new IllegalArgumentException("INVOKEVIRTUAL can't be used with interfaces");
        }
        if (i == 185 && !z) {
            throw new IllegalArgumentException("INVOKEINTERFACE can't be used with classes");
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        }
        this.insnCount++;
    }

    private static Field getLabelField(String str) {
        try {
            Field declaredField = class$org$objectweb$asm$Label.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    private static Field getLabelStatusField() {
        if (labelStatusField == null) {
            labelStatusField = getLabelField(Config.APP_VERSION_CODE);
            if (labelStatusField == null) {
                labelStatusField = getLabelField("status");
            }
        }
        return labelStatusField;
    }

    void checkEndCode() {
        if (this.endCode) {
            throw new IllegalStateException("Cannot visit instructions after visitMaxs has been called.");
        }
    }

    void checkEndMethod() {
        if (this.endMethod) {
            throw new IllegalStateException("Cannot visit elements after visitEnd has been called.");
        }
    }

    void checkFrameValue(Object obj) {
        if (obj == Opcodes.f6639TOP || obj == Opcodes.INTEGER || obj == Opcodes.FLOAT || obj == Opcodes.LONG || obj == Opcodes.DOUBLE || obj == Opcodes.NULL || obj == Opcodes.UNINITIALIZED_THIS) {
            return;
        }
        if (obj instanceof String) {
            checkInternalName((String) obj, "Invalid stack frame value");
        } else {
            if (!(obj instanceof Label)) {
                throw new IllegalArgumentException(new StringBuffer().append("Invalid stack frame value: ").append(obj).toString());
            }
            this.usedLabels.add((Label) obj);
        }
    }

    void checkLDCConstant(Object obj) {
        if (!(obj instanceof Type)) {
            if (!(obj instanceof Handle)) {
                checkConstant(obj);
                return;
            } else {
                if ((this.version & 65535) < 51) {
                    throw new IllegalArgumentException("ldc of a handle requires at least version 1.7");
                }
                int tag = ((Handle) obj).getTag();
                if (tag < 1 || tag > 9) {
                    throw new IllegalArgumentException(new StringBuffer().append("invalid handle tag ").append(tag).toString());
                }
                return;
            }
        }
        int sort = ((Type) obj).getSort();
        if (sort != 10 && sort != 9 && sort != 11) {
            throw new IllegalArgumentException("Illegal LDC constant value");
        }
        if (sort != 11 && (this.version & 65535) < 49) {
            throw new IllegalArgumentException("ldc of a constant class requires at least version 1.5");
        }
        if (sort == 11 && (this.version & 65535) < 51) {
            throw new IllegalArgumentException("ldc of a method type requires at least version 1.7");
        }
    }

    void checkLabel(Label label, boolean z, String str) {
        if (label == null) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str).append(" (must not be null)").toString());
        }
        if (z && this.labels.get(label) == null) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid ").append(str).append(" (must be visited first)").toString());
        }
    }

    void checkStartCode() {
        if (!this.startCode) {
            throw new IllegalStateException("Cannot visit instructions before visitCode has been called.");
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        checkEndMethod();
        checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitAnnotation(str, z));
    }

    @Override
    public AnnotationVisitor visitAnnotationDefault() {
        checkEndMethod();
        return new CheckAnnotationAdapter(super.visitAnnotationDefault(), false);
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        checkEndMethod();
        if (attribute == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.visitAttribute(attribute);
    }

    @Override
    public void visitCode() {
        if ((this.access & 1024) != 0) {
            throw new RuntimeException("Abstract methods cannot have code");
        }
        this.startCode = true;
        super.visitCode();
    }

    @Override
    public void visitEnd() {
        checkEndMethod();
        this.endMethod = true;
        super.visitEnd();
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 4);
        checkInternalName(str, "owner");
        checkUnqualifiedName(this.version, str2, "name");
        checkDesc(str3, false);
        super.visitFieldInsn(i, str, str2, str3);
        this.insnCount++;
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        int i5;
        if (this.insnCount == this.lastFrame) {
            throw new IllegalStateException("At most one frame can be visited at a given code location.");
        }
        this.lastFrame = this.insnCount;
        switch (i) {
            case -1:
            case 0:
                i4 = Integer.MAX_VALUE;
                i5 = Integer.MAX_VALUE;
                break;
            case 1:
            case 2:
                i4 = 0;
                i5 = 3;
                break;
            case 3:
                i4 = 0;
                i5 = 0;
                break;
            case 4:
                i4 = 1;
                i5 = 0;
                break;
            default:
                throw new IllegalArgumentException(new StringBuffer().append("Invalid frame type ").append(i).toString());
        }
        if (i2 > i5) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid nLocal=").append(i2).append(" for frame type ").append(i).toString());
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid nStack=").append(i3).append(" for frame type ").append(i).toString());
        }
        if (i != 2) {
            if (i2 > 0 && (objArr == null || objArr.length < i2)) {
                throw new IllegalArgumentException("Array local[] is shorter than nLocal");
            }
            for (int i6 = 0; i6 < i2; i6++) {
                checkFrameValue(objArr[i6]);
            }
        }
        if (i3 > 0 && (objArr2 == null || objArr2.length < i3)) {
            throw new IllegalArgumentException("Array stack[] is shorter than nStack");
        }
        for (int i7 = 0; i7 < i3; i7++) {
            checkFrameValue(objArr2[i7]);
        }
        if (i == -1) {
            this.expandedFrames++;
        } else {
            this.compressedFrames++;
        }
        if (this.expandedFrames > 0 && this.compressedFrames > 0) {
            throw new RuntimeException("Expanded and compressed frames must not be mixed.");
        }
        super.visitFrame(i, i2, objArr, i3, objArr2);
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        checkStartCode();
        checkEndCode();
        checkUnsignedShort(i, "Invalid variable index");
        checkSignedShort(i2, "Invalid increment");
        super.visitIincInsn(i, i2);
        this.insnCount++;
    }

    @Override
    public void visitInsn(int i) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 0);
        super.visitInsn(i);
        this.insnCount++;
    }

    @Override
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        checkStartCode();
        checkEndCode();
        int i2 = i >>> 24;
        if (i2 != 67 && i2 != 68 && i2 != 69 && i2 != 70 && i2 != 71 && i2 != 72 && i2 != 73 && i2 != 74 && i2 != 75) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i2)).toString());
        }
        CheckClassAdapter.checkTypeRefAndPath(i, typePath);
        checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitInsnAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 1);
        switch (i) {
            case 16:
                checkSignedByte(i2, "Invalid operand");
                break;
            case 17:
                checkSignedShort(i2, "Invalid operand");
                break;
            default:
                if (i2 < 4 || i2 > 11) {
                    throw new IllegalArgumentException(new StringBuffer().append("Invalid operand (must be an array type code T_...): ").append(i2).toString());
                }
                break;
        }
        super.visitIntInsn(i, i2);
        this.insnCount++;
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        checkStartCode();
        checkEndCode();
        checkMethodIdentifier(this.version, str, "name");
        checkMethodDesc(str2);
        if (handle.getTag() != 6 && handle.getTag() != 8) {
            throw new IllegalArgumentException(new StringBuffer().append("invalid handle tag ").append(handle.getTag()).toString());
        }
        for (Object obj : objArr) {
            checkLDCConstant(obj);
        }
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        this.insnCount++;
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 6);
        checkLabel(label, false, "label");
        checkNonDebugLabel(label);
        super.visitJumpInsn(i, label);
        this.usedLabels.add(label);
        this.insnCount++;
    }

    @Override
    public void visitLabel(Label label) {
        checkStartCode();
        checkEndCode();
        checkLabel(label, false, "label");
        if (this.labels.get(label) != null) {
            throw new IllegalArgumentException("Already visited label");
        }
        this.labels.put(label, new Integer(this.insnCount));
        super.visitLabel(label);
    }

    @Override
    public void visitLdcInsn(Object obj) {
        checkStartCode();
        checkEndCode();
        checkLDCConstant(obj);
        super.visitLdcInsn(obj);
        this.insnCount++;
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        checkStartCode();
        checkEndCode();
        checkUnsignedShort(i, "Invalid line number");
        checkLabel(label, true, "start label");
        super.visitLineNumber(i, label);
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        checkStartCode();
        checkEndCode();
        checkUnqualifiedName(this.version, str, "name");
        checkDesc(str2, false);
        checkLabel(label, true, "start label");
        checkLabel(label2, true, "end label");
        checkUnsignedShort(i, "Invalid variable index");
        if (((Integer) this.labels.get(label2)).intValue() < ((Integer) this.labels.get(label)).intValue()) {
            throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
        }
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        int i2 = 0;
        checkStartCode();
        checkEndCode();
        int i3 = i >>> 24;
        if (i3 != 64 && i3 != 65) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i3)).toString());
        }
        CheckClassAdapter.checkTypeRefAndPath(i, typePath);
        checkDesc(str, false);
        if (labelArr == null || labelArr2 == null || iArr == null || labelArr2.length != labelArr.length || iArr.length != labelArr.length) {
            throw new IllegalArgumentException("Invalid start, end and index arrays (must be non null and of identical length");
        }
        while (true) {
            int i4 = i2;
            if (i4 >= labelArr.length) {
                return super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z);
            }
            checkLabel(labelArr[i4], true, "start label");
            checkLabel(labelArr2[i4], true, "end label");
            checkUnsignedShort(iArr[i4], "Invalid variable index");
            if (((Integer) this.labels.get(labelArr2[i4])).intValue() < ((Integer) this.labels.get(labelArr[i4])).intValue()) {
                throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
            }
            i2 = i4 + 1;
        }
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        checkEndCode();
        checkStartCode();
        checkLabel(label, false, "default label");
        checkNonDebugLabel(label);
        if (iArr == null || labelArr == null || iArr.length != labelArr.length) {
            throw new IllegalArgumentException("There must be the same number of keys and labels");
        }
        for (int i = 0; i < labelArr.length; i++) {
            checkLabel(labelArr[i], false, new StringBuffer().append("label at index ").append(i).toString());
            checkNonDebugLabel(labelArr[i]);
        }
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        this.usedLabels.add(label);
        for (Label label2 : labelArr) {
            this.usedLabels.add(label2);
        }
        this.insnCount++;
    }

    @Override
    public void visitMaxs(int i, int i2) {
        checkStartCode();
        checkEndCode();
        this.endCode = true;
        Iterator it = this.usedLabels.iterator();
        while (it.hasNext()) {
            if (this.labels.get((Label) it.next()) == null) {
                throw new IllegalStateException("Undefined label used");
            }
        }
        int i3 = 0;
        while (i3 < this.handlers.size()) {
            int i4 = i3 + 1;
            Integer num = (Integer) this.labels.get(this.handlers.get(i3));
            int i5 = i4 + 1;
            Integer num2 = (Integer) this.labels.get(this.handlers.get(i4));
            if (num == null || num2 == null) {
                throw new IllegalStateException("Undefined try catch block labels");
            }
            if (num2.intValue() <= num.intValue()) {
                throw new IllegalStateException("Emty try catch block handler range");
            }
            i3 = i5;
        }
        checkUnsignedShort(i, "Invalid max stack");
        checkUnsignedShort(i2, "Invalid max locals");
        super.visitMaxs(i, i2);
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
        checkStartCode();
        checkEndCode();
        checkDesc(str, false);
        if (str.charAt(0) != '[') {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid descriptor (must be an array type descriptor): ").append(str).toString());
        }
        if (i < 1) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid dimensions (must be greater than 0): ").append(i).toString());
        }
        if (i > str.lastIndexOf(91) + 1) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid dimensions (must not be greater than dims(desc)): ").append(i).toString());
        }
        super.visitMultiANewArrayInsn(str, i);
        this.insnCount++;
    }

    @Override
    public void visitParameter(String str, int i) {
        if (str != null) {
            checkUnqualifiedName(this.version, str, "name");
        }
        CheckClassAdapter.checkAccess(i, 36880);
        super.visitParameter(str, i);
    }

    @Override
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        checkEndMethod();
        checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitParameterAnnotation(i, str, z));
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        checkStartCode();
        checkEndCode();
        if (i2 < i) {
            throw new IllegalArgumentException(new StringBuffer().append("Max = ").append(i2).append(" must be greater than or equal to min = ").append(i).toString());
        }
        checkLabel(label, false, "default label");
        checkNonDebugLabel(label);
        if (labelArr == null || labelArr.length != (i2 - i) + 1) {
            throw new IllegalArgumentException("There must be max - min + 1 labels");
        }
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            checkLabel(labelArr[i3], false, new StringBuffer().append("label at index ").append(i3).toString());
            checkNonDebugLabel(labelArr[i3]);
        }
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        for (Label label2 : labelArr) {
            this.usedLabels.add(label2);
        }
        this.insnCount++;
    }

    @Override
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        checkStartCode();
        checkEndCode();
        int i2 = i >>> 24;
        if (i2 != 66) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i2)).toString());
        }
        CheckClassAdapter.checkTypeRefAndPath(i, typePath);
        checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitTryCatchAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        checkStartCode();
        checkEndCode();
        checkLabel(label, false, "start label");
        checkLabel(label2, false, "end label");
        checkLabel(label3, false, "handler label");
        checkNonDebugLabel(label);
        checkNonDebugLabel(label2);
        checkNonDebugLabel(label3);
        if (this.labels.get(label) != null || this.labels.get(label2) != null || this.labels.get(label3) != null) {
            throw new IllegalStateException("Try catch blocks must be visited before their labels");
        }
        if (str != null) {
            checkInternalName(str, "type");
        }
        super.visitTryCatchBlock(label, label2, label3, str);
        this.handlers.add(label);
        this.handlers.add(label2);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        checkEndMethod();
        int i2 = i >>> 24;
        if (i2 != 1 && i2 != 18 && i2 != 20 && i2 != 21 && i2 != 22 && i2 != 23) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i2)).toString());
        }
        CheckClassAdapter.checkTypeRefAndPath(i, typePath);
        checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitTypeAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 3);
        checkInternalName(str, "type");
        if (i == 187 && str.charAt(0) == '[') {
            throw new IllegalArgumentException(new StringBuffer().append("NEW cannot be used to create arrays: ").append(str).toString());
        }
        super.visitTypeInsn(i, str);
        this.insnCount++;
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        checkStartCode();
        checkEndCode();
        checkOpcode(i, 2);
        checkUnsignedShort(i2, "Invalid variable index");
        super.visitVarInsn(i, i2);
        this.insnCount++;
    }
}
