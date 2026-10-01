package org.objectweb.asm;

public abstract class MethodVisitor {

    protected final int f6562api;

    protected MethodVisitor f6563mv;

    public MethodVisitor(int i) {
        this(i, null);
    }

    public MethodVisitor(int i, MethodVisitor methodVisitor) {
        if (i != 262144 && i != 327680) {
            throw new IllegalArgumentException();
        }
        this.f6562api = i;
        this.f6563mv = methodVisitor;
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        if (this.f6563mv != null) {
            return this.f6563mv.visitAnnotation(str, z);
        }
        return null;
    }

    public AnnotationVisitor visitAnnotationDefault() {
        if (this.f6563mv != null) {
            return this.f6563mv.visitAnnotationDefault();
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        if (this.f6563mv != null) {
            this.f6563mv.visitAttribute(attribute);
        }
    }

    public void visitCode() {
        if (this.f6563mv != null) {
            this.f6563mv.visitCode();
        }
    }

    public void visitEnd() {
        if (this.f6563mv != null) {
            this.f6563mv.visitEnd();
        }
    }

    public void visitFieldInsn(int i, String str, String str2, String str3) {
        if (this.f6563mv != null) {
            this.f6563mv.visitFieldInsn(i, str, str2, str3);
        }
    }

    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitFrame(i, i2, objArr, i3, objArr2);
        }
    }

    public void visitIincInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitIincInsn(i, i2);
        }
    }

    public void visitInsn(int i) {
        if (this.f6563mv != null) {
            this.f6563mv.visitInsn(i);
        }
    }

    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.f6562api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6563mv != null) {
            return this.f6563mv.visitInsnAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitIntInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitIntInsn(i, i2);
        }
    }

    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    public void visitJumpInsn(int i, Label label) {
        if (this.f6563mv != null) {
            this.f6563mv.visitJumpInsn(i, label);
        }
    }

    public void visitLabel(Label label) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLabel(label);
        }
    }

    public void visitLdcInsn(Object obj) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLdcInsn(obj);
        }
    }

    public void visitLineNumber(int i, Label label) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLineNumber(i, label);
        }
    }

    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLocalVariable(str, str2, str3, label, label2, i);
        }
    }

    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        if (this.f6562api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6563mv != null) {
            return this.f6563mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z);
        }
        return null;
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    public void visitMaxs(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitMaxs(i, i2);
        }
    }

    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            visitMethodInsn(i, str, str2, str3, i == 185);
        } else if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3);
        }
    }

    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6562api < 327680) {
            if (z != (i == 185)) {
                throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
            }
            visitMethodInsn(i, str, str2, str3);
        } else if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    public void visitMultiANewArrayInsn(String str, int i) {
        if (this.f6563mv != null) {
            this.f6563mv.visitMultiANewArrayInsn(str, i);
        }
    }

    public void visitParameter(String str, int i) {
        if (this.f6562api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitParameter(str, i);
        }
    }

    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        if (this.f6563mv != null) {
            return this.f6563mv.visitParameterAnnotation(i, str, z);
        }
        return null;
    }

    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitTableSwitchInsn(i, i2, label, labelArr);
        }
    }

    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.f6562api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6563mv != null) {
            return this.f6563mv.visitTryCatchAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        if (this.f6563mv != null) {
            this.f6563mv.visitTryCatchBlock(label, label2, label3, str);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.f6562api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6563mv != null) {
            return this.f6563mv.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitTypeInsn(int i, String str) {
        if (this.f6563mv != null) {
            this.f6563mv.visitTypeInsn(i, str);
        }
    }

    public void visitVarInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitVarInsn(i, i2);
        }
    }
}
