package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class LocalVariablesSorter extends MethodVisitor {
    private static final Type OBJECT_TYPE;

    static Class f6668xcb2e0697;
    private boolean changed;
    protected final int firstLocal;
    private int[] mapping;
    private Object[] newLocals;
    protected int nextLocal;

    static {
        _clinit_();
        OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected LocalVariablesSorter(int i, int i2, String str, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.mapping = new int[40];
        this.newLocals = new Object[20];
        Type[] argumentTypes = Type.getArgumentTypes(str);
        this.nextLocal = (i2 & 8) == 0 ? 1 : 0;
        for (Type type : argumentTypes) {
            this.nextLocal += type.getSize();
        }
        this.firstLocal = this.nextLocal;
    }

    public LocalVariablesSorter(int i, String str, MethodVisitor methodVisitor) {
        this(Opcodes.ASM5, i, str, methodVisitor);
        if (getClass() != f6668xcb2e0697) {
            throw new IllegalStateException();
        }
    }

    private static void _clinit_() {
        f6668xcb2e0697 = class$("org.objectweb.asm.commons.LocalVariablesSorter");
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private int remap(int i, Type type) {
        int iNewLocalMapping;
        if (type.getSize() + i <= this.firstLocal) {
            return i;
        }
        int size = ((i * 2) + type.getSize()) - 1;
        int length = this.mapping.length;
        if (size >= length) {
            int[] iArr = new int[Math.max(length * 2, size + 1)];
            System.arraycopy(this.mapping, 0, iArr, 0, length);
            this.mapping = iArr;
        }
        int i2 = this.mapping[size];
        if (i2 == 0) {
            iNewLocalMapping = newLocalMapping(type);
            setLocalType(iNewLocalMapping, type);
            this.mapping[size] = iNewLocalMapping + 1;
        } else {
            iNewLocalMapping = i2 - 1;
        }
        if (iNewLocalMapping != i) {
            this.changed = true;
        }
        return iNewLocalMapping;
    }

    private void setFrameLocal(int i, Object obj) {
        int length = this.newLocals.length;
        if (i >= length) {
            Object[] objArr = new Object[Math.max(length * 2, i + 1)];
            System.arraycopy(this.newLocals, 0, objArr, 0, length);
            this.newLocals = objArr;
        }
        this.newLocals[i] = obj;
    }

    public int newLocal(Type type) {
        Object descriptor;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                descriptor = Opcodes.INTEGER;
                break;
            case 6:
                descriptor = Opcodes.FLOAT;
                break;
            case 7:
                descriptor = Opcodes.LONG;
                break;
            case 8:
                descriptor = Opcodes.DOUBLE;
                break;
            case 9:
                descriptor = type.getDescriptor();
                break;
            default:
                descriptor = type.getInternalName();
                break;
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        setFrameLocal(iNewLocalMapping, descriptor);
        this.changed = true;
        return iNewLocalMapping;
    }

    protected int newLocalMapping(Type type) {
        int i = this.nextLocal;
        this.nextLocal += type.getSize();
        return i;
    }

    protected void setLocalType(int i, Type type) {
    }

    protected void updateNewLocals(Object[] objArr) {
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4 = 0;
        if (i != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        if (!this.changed) {
            this.f6563mv.visitFrame(i, i2, objArr, i3, objArr2);
            return;
        }
        Object[] objArr3 = new Object[this.newLocals.length];
        System.arraycopy(this.newLocals, 0, objArr3, 0, objArr3.length);
        updateNewLocals(this.newLocals);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            Object obj = objArr[i5];
            int i7 = (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? 2 : 1;
            if (obj != Opcodes.f6639TOP) {
                Type objectType = OBJECT_TYPE;
                if (obj == Opcodes.INTEGER) {
                    objectType = Type.INT_TYPE;
                } else if (obj == Opcodes.FLOAT) {
                    objectType = Type.FLOAT_TYPE;
                } else if (obj == Opcodes.LONG) {
                    objectType = Type.LONG_TYPE;
                } else if (obj == Opcodes.DOUBLE) {
                    objectType = Type.DOUBLE_TYPE;
                } else if (obj instanceof String) {
                    objectType = Type.getObjectType((String) obj);
                }
                setFrameLocal(remap(i6, objectType), obj);
            }
            i5++;
            i6 += i7;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i4;
            if (i10 >= this.newLocals.length) {
                this.f6563mv.visitFrame(i, i9, this.newLocals, i3, objArr2);
                this.newLocals = objArr3;
                return;
            }
            i4 = i10 + 1;
            Object obj2 = this.newLocals[i10];
            if (obj2 == null || obj2 == Opcodes.f6639TOP) {
                this.newLocals[i8] = Opcodes.f6639TOP;
            } else {
                this.newLocals[i8] = obj2;
                i9 = i8 + 1;
                if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                    i4++;
                }
            }
            i8++;
        }
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        this.f6563mv.visitIincInsn(remap(i, Type.INT_TYPE), i2);
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.f6563mv.visitLocalVariable(str, str2, str3, label, label2, remap(i, Type.getType(str2)));
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        Type type = Type.getType(str);
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            iArr2[i2] = remap(iArr[i2], type);
        }
        return this.f6563mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override
    public void visitMaxs(int i, int i2) {
        this.f6563mv.visitMaxs(i, this.nextLocal);
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        Type type;
        switch (i) {
            case 21:
            case 54:
                type = Type.INT_TYPE;
                break;
            case 22:
            case 55:
                type = Type.LONG_TYPE;
                break;
            case 23:
            case 56:
                type = Type.FLOAT_TYPE;
                break;
            case 24:
            case 57:
                type = Type.DOUBLE_TYPE;
                break;
            default:
                type = OBJECT_TYPE;
                break;
        }
        this.f6563mv.visitVarInsn(i, remap(i2, type));
    }
}
