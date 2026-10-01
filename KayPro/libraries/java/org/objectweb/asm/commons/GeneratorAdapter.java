package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class GeneratorAdapter extends LocalVariablesSorter {

    public static final int f6649ADD = 96;

    public static final int f6650AND = 126;
    private static final Type BOOLEAN_TYPE;
    private static final Method BOOLEAN_VALUE;
    private static final Type BYTE_TYPE;
    private static final Type CHARACTER_TYPE;
    private static final Method CHAR_VALUE;
    private static final String CLDESC = "Ljava/lang/Class;";

    public static final int f6651DIV = 108;
    private static final Type DOUBLE_TYPE;
    private static final Method DOUBLE_VALUE;

    public static final int f6652EQ = 153;
    private static final Type FLOAT_TYPE;
    private static final Method FLOAT_VALUE;

    public static final int f6653GE = 156;

    public static final int f6654GT = 157;
    private static final Type INTEGER_TYPE;
    private static final Method INT_VALUE;

    public static final int f6655LE = 158;
    private static final Type LONG_TYPE;
    private static final Method LONG_VALUE;

    public static final int f6656LT = 155;

    public static final int f6657MUL = 104;

    public static final int f6658NE = 154;

    public static final int f6659NEG = 116;
    private static final Type NUMBER_TYPE;
    private static final Type OBJECT_TYPE;

    public static final int f6660OR = 128;

    public static final int f6661REM = 112;

    public static final int f6662SHL = 120;
    private static final Type SHORT_TYPE;

    public static final int f6663SHR = 122;

    public static final int f6664SUB = 100;
    public static final int USHR = 124;

    public static final int f6665XOR = 130;
    static Class class$org$objectweb$asm$commons$GeneratorAdapter;
    private final int access;
    private final Type[] argumentTypes;
    private final List localTypes;
    private final Type returnType;

    static {
        _clinit_();
        BYTE_TYPE = Type.getObjectType("java/lang/Byte");
        BOOLEAN_TYPE = Type.getObjectType("java/lang/Boolean");
        SHORT_TYPE = Type.getObjectType("java/lang/Short");
        CHARACTER_TYPE = Type.getObjectType("java/lang/Character");
        INTEGER_TYPE = Type.getObjectType("java/lang/Integer");
        FLOAT_TYPE = Type.getObjectType("java/lang/Float");
        LONG_TYPE = Type.getObjectType("java/lang/Long");
        DOUBLE_TYPE = Type.getObjectType("java/lang/Double");
        NUMBER_TYPE = Type.getObjectType("java/lang/Number");
        OBJECT_TYPE = Type.getObjectType("java/lang/Object");
        BOOLEAN_VALUE = Method.getMethod("boolean booleanValue()");
        CHAR_VALUE = Method.getMethod("char charValue()");
        INT_VALUE = Method.getMethod("int intValue()");
        FLOAT_VALUE = Method.getMethod("float floatValue()");
        LONG_VALUE = Method.getMethod("long longValue()");
        DOUBLE_VALUE = Method.getMethod("double doubleValue()");
    }

    protected GeneratorAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2) {
        super(i, i2, str2, methodVisitor);
        this.localTypes = new ArrayList();
        this.access = i2;
        this.returnType = Type.getReturnType(str2);
        this.argumentTypes = Type.getArgumentTypes(str2);
    }

    public GeneratorAdapter(int i, Method method, String str, Type[] typeArr, ClassVisitor classVisitor) {
        this(i, method, classVisitor.visitMethod(i, method.getName(), method.getDescriptor(), str, getInternalNames(typeArr)));
    }

    public GeneratorAdapter(int i, Method method, MethodVisitor methodVisitor) {
        this(methodVisitor, i, null, method.getDescriptor());
    }

    public GeneratorAdapter(MethodVisitor methodVisitor, int i, String str, String str2) {
        this(Opcodes.ASM5, methodVisitor, i, str, str2);
        if (getClass() != class$org$objectweb$asm$commons$GeneratorAdapter) {
            throw new IllegalStateException();
        }
    }

    private static void _clinit_() {
        class$org$objectweb$asm$commons$GeneratorAdapter = class$("org.objectweb.asm.commons.GeneratorAdapter");
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private void fieldInsn(int i, Type type, String str, Type type2) {
        this.f6563mv.visitFieldInsn(i, type.getInternalName(), str, type2.getDescriptor());
    }

    private int getArgIndex(int i) {
        int size = (this.access & 8) == 0 ? 1 : 0;
        for (int i2 = 0; i2 < i; i2++) {
            size += this.argumentTypes[i2].getSize();
        }
        return size;
    }

    private static Type getBoxedType(Type type) {
        switch (type.getSort()) {
            case 1:
                return BOOLEAN_TYPE;
            case 2:
                return CHARACTER_TYPE;
            case 3:
                return BYTE_TYPE;
            case 4:
                return SHORT_TYPE;
            case 5:
                return INTEGER_TYPE;
            case 6:
                return FLOAT_TYPE;
            case 7:
                return LONG_TYPE;
            case 8:
                return DOUBLE_TYPE;
            default:
                return type;
        }
    }

    private static String[] getInternalNames(Type[] typeArr) {
        if (typeArr == null) {
            return null;
        }
        String[] strArr = new String[typeArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = typeArr[i].getInternalName();
        }
        return strArr;
    }

    private void invokeInsn(int i, Type type, Method method, boolean z) {
        this.f6563mv.visitMethodInsn(i, type.getSort() == 9 ? type.getDescriptor() : type.getInternalName(), method.getName(), method.getDescriptor(), z);
    }

    private void loadInsn(Type type, int i) {
        this.f6563mv.visitVarInsn(type.getOpcode(21), i);
    }

    private void storeInsn(Type type, int i) {
        this.f6563mv.visitVarInsn(type.getOpcode(54), i);
    }

    private void typeInsn(int i, Type type) {
        this.f6563mv.visitTypeInsn(i, type.getInternalName());
    }

    public void arrayLength() {
        this.f6563mv.visitInsn(190);
    }

    public void arrayLoad(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(46));
    }

    public void arrayStore(Type type) {
        this.f6563mv.visitInsn(type.getOpcode(79));
    }

    public void m8998box(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
            return;
        }
        Type boxedType = getBoxedType(type);
        newInstance(boxedType);
        if (type.getSize() == 2) {
            dupX2();
            dupX2();
            m9001pop();
        } else {
            dupX1();
            swap();
        }
        invokeConstructor(boxedType, new Method("<init>", Type.VOID_TYPE, new Type[]{type}));
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

    public void catchException(Label label, Label label2, Type type) {
        Label label3 = new Label();
        if (type == null) {
            this.f6563mv.visitTryCatchBlock(label, label2, label3, null);
        } else {
            this.f6563mv.visitTryCatchBlock(label, label2, label3, type.getInternalName());
        }
        mark(label3);
    }

    public void checkCast(Type type) {
        if (type.equals(OBJECT_TYPE)) {
            return;
        }
        typeInsn(192, type);
    }

    public void m8999dup() {
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

    public void endMethod() {
        if ((this.access & 1024) == 0) {
            this.f6563mv.visitMaxs(0, 0);
        }
        this.f6563mv.visitEnd();
    }

    public void getField(Type type, String str, Type type2) {
        fieldInsn(180, type, str, type2);
    }

    public Type getLocalType(int i) {
        return (Type) this.localTypes.get(i - this.firstLocal);
    }

    public void getStatic(Type type, String str, Type type2) {
        fieldInsn(178, type, str, type2);
    }

    public void goTo(Label label) {
        this.f6563mv.visitJumpInsn(167, label);
    }

    public void ifCmp(Type type, int i, Label label) {
        switch (type.getSort()) {
            case 6:
                this.f6563mv.visitInsn((i == 156 || i == 157) ? 149 : 150);
                break;
            case 7:
                this.f6563mv.visitInsn(148);
                break;
            case 8:
                this.f6563mv.visitInsn((i == 156 || i == 157) ? 151 : 152);
                break;
            case 9:
            case 10:
                switch (i) {
                    case 153:
                        this.f6563mv.visitJumpInsn(165, label);
                        return;
                    case 154:
                        this.f6563mv.visitJumpInsn(166, label);
                        return;
                    default:
                        throw new IllegalArgumentException(new StringBuffer().append("Bad comparison for type ").append(type).toString());
                }
            default:
                int i2 = -1;
                switch (i) {
                    case 153:
                        i2 = 159;
                        break;
                    case 154:
                        i2 = 160;
                        break;
                    case 155:
                        i2 = 161;
                        break;
                    case 156:
                        i2 = 162;
                        break;
                    case 157:
                        i2 = 163;
                        break;
                    case 158:
                        i2 = 164;
                        break;
                }
                this.f6563mv.visitJumpInsn(i2, label);
                return;
        }
        this.f6563mv.visitJumpInsn(i, label);
    }

    public void ifICmp(int i, Label label) {
        ifCmp(Type.INT_TYPE, i, label);
    }

    public void ifNonNull(Label label) {
        this.f6563mv.visitJumpInsn(199, label);
    }

    public void ifNull(Label label) {
        this.f6563mv.visitJumpInsn(198, label);
    }

    public void ifZCmp(int i, Label label) {
        this.f6563mv.visitJumpInsn(i, label);
    }

    public void iinc(int i, int i2) {
        this.f6563mv.visitIincInsn(i, i2);
    }

    public void instanceOf(Type type) {
        typeInsn(193, type);
    }

    public void invokeConstructor(Type type, Method method) {
        invokeInsn(183, type, method, false);
    }

    public void invokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void invokeInterface(Type type, Method method) {
        invokeInsn(185, type, method, true);
    }

    public void invokeStatic(Type type, Method method) {
        invokeInsn(184, type, method, false);
    }

    public void invokeVirtual(Type type, Method method) {
        invokeInsn(182, type, method, false);
    }

    public void loadArg(int i) {
        loadInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public void loadArgArray() {
        push(this.argumentTypes.length);
        newArray(OBJECT_TYPE);
        for (int i = 0; i < this.argumentTypes.length; i++) {
            m8999dup();
            push(i);
            loadArg(i);
            m8998box(this.argumentTypes[i]);
            arrayStore(OBJECT_TYPE);
        }
    }

    public void loadArgs() {
        loadArgs(0, this.argumentTypes.length);
    }

    public void loadArgs(int i, int i2) {
        int argIndex = getArgIndex(i);
        for (int i3 = 0; i3 < i2; i3++) {
            Type type = this.argumentTypes[i + i3];
            loadInsn(type, argIndex);
            argIndex += type.getSize();
        }
    }

    public void loadLocal(int i) {
        loadInsn(getLocalType(i), i);
    }

    public void loadLocal(int i, Type type) {
        setLocalType(i, type);
        loadInsn(type, i);
    }

    public void loadThis() {
        if ((this.access & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.f6563mv.visitVarInsn(25, 0);
    }

    public Label mark() {
        Label label = new Label();
        this.f6563mv.visitLabel(label);
        return label;
    }

    public void mark(Label label) {
        this.f6563mv.visitLabel(label);
    }

    public void math(int i, Type type) {
        this.f6563mv.visitInsn(type.getOpcode(i));
    }

    public void monitorEnter() {
        this.f6563mv.visitInsn(194);
    }

    public void monitorExit() {
        this.f6563mv.visitInsn(195);
    }

    public void newArray(Type type) {
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
                typeInsn(189, type);
                return;
        }
        this.f6563mv.visitIntInsn(188, i);
    }

    public void newInstance(Type type) {
        typeInsn(187, type);
    }

    public Label newLabel() {
        return new Label();
    }

    public void m9000not() {
        this.f6563mv.visitInsn(4);
        this.f6563mv.visitInsn(130);
    }

    public void m9001pop() {
        this.f6563mv.visitInsn(87);
    }

    public void pop2() {
        this.f6563mv.visitInsn(88);
    }

    public void push(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        if (jDoubleToLongBits == 0 || jDoubleToLongBits == 4607182418800017408L) {
            this.f6563mv.visitInsn(((int) d) + 14);
        } else {
            this.f6563mv.visitLdcInsn(new Double(d));
        }
    }

    public void push(float f) {
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (iFloatToIntBits == 0 || iFloatToIntBits == 1065353216 || iFloatToIntBits == 1073741824) {
            this.f6563mv.visitInsn(((int) f) + 11);
        } else {
            this.f6563mv.visitLdcInsn(new Float(f));
        }
    }

    public void push(int i) {
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

    public void push(long j) {
        if (j == 0 || j == 1) {
            this.f6563mv.visitInsn(((int) j) + 9);
        } else {
            this.f6563mv.visitLdcInsn(new Long(j));
        }
    }

    public void push(String str) {
        if (str == null) {
            this.f6563mv.visitInsn(1);
        } else {
            this.f6563mv.visitLdcInsn(str);
        }
    }

    public void push(Handle handle) {
        this.f6563mv.visitLdcInsn(handle);
    }

    public void push(Type type) {
        if (type == null) {
            this.f6563mv.visitInsn(1);
        }
        switch (type.getSort()) {
            case 1:
                this.f6563mv.visitFieldInsn(178, "java/lang/Boolean", "TYPE", CLDESC);
                break;
            case 2:
                this.f6563mv.visitFieldInsn(178, "java/lang/Character", "TYPE", CLDESC);
                break;
            case 3:
                this.f6563mv.visitFieldInsn(178, "java/lang/Byte", "TYPE", CLDESC);
                break;
            case 4:
                this.f6563mv.visitFieldInsn(178, "java/lang/Short", "TYPE", CLDESC);
                break;
            case 5:
                this.f6563mv.visitFieldInsn(178, "java/lang/Integer", "TYPE", CLDESC);
                break;
            case 6:
                this.f6563mv.visitFieldInsn(178, "java/lang/Float", "TYPE", CLDESC);
                break;
            case 7:
                this.f6563mv.visitFieldInsn(178, "java/lang/Long", "TYPE", CLDESC);
                break;
            case 8:
                this.f6563mv.visitFieldInsn(178, "java/lang/Double", "TYPE", CLDESC);
                break;
            default:
                this.f6563mv.visitLdcInsn(type);
                break;
        }
    }

    public void push(boolean z) {
        push(z ? 1 : 0);
    }

    public void putField(Type type, String str, Type type2) {
        fieldInsn(181, type, str, type2);
    }

    public void putStatic(Type type, String str, Type type2) {
        fieldInsn(179, type, str, type2);
    }

    public void m9002ret(int i) {
        this.f6563mv.visitVarInsn(169, i);
    }

    public void returnValue() {
        this.f6563mv.visitInsn(this.returnType.getOpcode(172));
    }

    @Override
    protected void setLocalType(int i, Type type) {
        int i2 = i - this.firstLocal;
        while (this.localTypes.size() < i2 + 1) {
            this.localTypes.add(null);
        }
        this.localTypes.set(i2, type);
    }

    public void storeArg(int i) {
        storeInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public void storeLocal(int i) {
        storeInsn(getLocalType(i), i);
    }

    public void storeLocal(int i, Type type) {
        setLocalType(i, type);
        storeInsn(type, i);
    }

    public void swap() {
        this.f6563mv.visitInsn(95);
    }

    public void swap(Type type, Type type2) {
        if (type2.getSize() == 1) {
            if (type.getSize() == 1) {
                swap();
                return;
            } else {
                dupX2();
                m9001pop();
                return;
            }
        }
        if (type.getSize() == 1) {
            dup2X1();
            pop2();
        } else {
            dup2X2();
            pop2();
        }
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator) {
        tableSwitch(iArr, tableSwitchGenerator, (iArr.length == 0 ? 0.0f : ((float) iArr.length) / ((float) ((iArr[iArr.length + (-1)] - iArr[0]) + 1))) >= 0.5f);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator, boolean z) {
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] < iArr[i - 1]) {
                throw new IllegalArgumentException("keys must be sorted ascending");
            }
        }
        Label labelNewLabel = newLabel();
        Label labelNewLabel2 = newLabel();
        if (iArr.length > 0) {
            int length = iArr.length;
            int i2 = iArr[0];
            int i3 = iArr[length - 1];
            int i4 = (i3 - i2) + 1;
            if (z) {
                Label[] labelArr = new Label[i4];
                Arrays.fill(labelArr, labelNewLabel);
                for (int i5 : iArr) {
                    labelArr[i5 - i2] = newLabel();
                }
                this.f6563mv.visitTableSwitchInsn(i2, i3, labelNewLabel, labelArr);
                for (int i6 = 0; i6 < i4; i6++) {
                    Label label = labelArr[i6];
                    if (label != labelNewLabel) {
                        mark(label);
                        tableSwitchGenerator.generateCase(i6 + i2, labelNewLabel2);
                    }
                }
            } else {
                Label[] labelArr2 = new Label[length];
                for (int i7 = 0; i7 < length; i7++) {
                    labelArr2[i7] = newLabel();
                }
                this.f6563mv.visitLookupSwitchInsn(labelNewLabel, iArr, labelArr2);
                for (int i8 = 0; i8 < length; i8++) {
                    mark(labelArr2[i8]);
                    tableSwitchGenerator.generateCase(iArr[i8], labelNewLabel2);
                }
            }
        }
        mark(labelNewLabel);
        tableSwitchGenerator.generateDefault();
        mark(labelNewLabel2);
    }

    public void throwException() {
        this.f6563mv.visitInsn(191);
    }

    public void throwException(Type type, String str) {
        newInstance(type);
        m8999dup();
        push(str);
        invokeConstructor(type, Method.getMethod("void <init> (String)"));
        throwException();
    }

    public void unbox(Type type) {
        Type type2 = NUMBER_TYPE;
        Method method = null;
        switch (type.getSort()) {
            case 0:
                return;
            case 1:
                type2 = BOOLEAN_TYPE;
                method = BOOLEAN_VALUE;
                break;
            case 2:
                type2 = CHARACTER_TYPE;
                method = CHAR_VALUE;
                break;
            case 3:
            case 4:
            case 5:
                method = INT_VALUE;
                break;
            case 6:
                method = FLOAT_VALUE;
                break;
            case 7:
                method = LONG_VALUE;
                break;
            case 8:
                method = DOUBLE_VALUE;
                break;
        }
        if (method == null) {
            checkCast(type);
        } else {
            checkCast(type2);
            invokeVirtual(type2, method);
        }
    }

    public void valueOf(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
        } else {
            Type boxedType = getBoxedType(type);
            invokeStatic(boxedType, new Method("valueOf", boxedType, new Type[]{type}));
        }
    }
}
