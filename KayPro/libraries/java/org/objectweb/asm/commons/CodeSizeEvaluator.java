package org.objectweb.asm.commons;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class CodeSizeEvaluator extends MethodVisitor implements Opcodes {
    private int maxSize;
    private int minSize;

    protected CodeSizeEvaluator(int i, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }

    public CodeSizeEvaluator(MethodVisitor methodVisitor) {
        this(Opcodes.ASM5, methodVisitor);
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (i == 185) {
            this.minSize += 5;
            this.maxSize += 5;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getMinSize() {
        return this.minSize;
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.minSize += 3;
        this.maxSize += 3;
        if (this.f6563mv != null) {
            this.f6563mv.visitFieldInsn(i, str, str2, str3);
        }
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.minSize += 6;
            this.maxSize += 6;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitIincInsn(i, i2);
        }
    }

    @Override
    public void visitInsn(int i) {
        this.minSize++;
        this.maxSize++;
        if (this.f6563mv != null) {
            this.f6563mv.visitInsn(i);
        }
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        if (i == 17) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitIntInsn(i, i2);
        }
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.minSize += 5;
        this.maxSize += 5;
        if (this.f6563mv != null) {
            this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.minSize += 3;
        if (i == 167 || i == 168) {
            this.maxSize += 5;
        } else {
            this.maxSize += 8;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitJumpInsn(i, label);
        }
    }

    @Override
    public void visitLdcInsn(Object obj) {
        if ((obj instanceof Long) || (obj instanceof Double)) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 3;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitLdcInsn(obj);
        }
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.minSize += (iArr.length * 8) + 9;
        this.maxSize += (iArr.length * 8) + 12;
        if (this.f6563mv != null) {
            this.f6563mv.visitLookupSwitchInsn(label, iArr, labelArr);
        }
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
        this.minSize += 4;
        this.maxSize += 4;
        if (this.f6563mv != null) {
            this.f6563mv.visitMultiANewArrayInsn(str, i);
        }
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.minSize += (labelArr.length * 4) + 13;
        this.maxSize += (labelArr.length * 4) + 16;
        if (this.f6563mv != null) {
            this.f6563mv.visitTableSwitchInsn(i, i2, label, labelArr);
        }
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.minSize += 3;
        this.maxSize += 3;
        if (this.f6563mv != null) {
            this.f6563mv.visitTypeInsn(i, str);
        }
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        if (i2 < 4 && i != 169) {
            this.minSize++;
            this.maxSize++;
        } else if (i2 >= 256) {
            this.minSize += 4;
            this.maxSize += 4;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitVarInsn(i, i2);
        }
    }
}
