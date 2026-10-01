package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public final class TraceMethodVisitor extends MethodVisitor {

    public final Printer f6705p;

    public TraceMethodVisitor(MethodVisitor methodVisitor, Printer printer) {
        super(Opcodes.ASM5, methodVisitor);
        this.f6705p = printer;
    }

    public TraceMethodVisitor(Printer printer) {
        this(null, printer);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitAnnotation(str, z), this.f6705p.visitMethodAnnotation(str, z));
    }

    @Override
    public AnnotationVisitor visitAnnotationDefault() {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitAnnotationDefault(), this.f6705p.visitAnnotationDefault());
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        this.f6705p.visitMethodAttribute(attribute);
        super.visitAttribute(attribute);
    }

    @Override
    public void visitCode() {
        this.f6705p.visitCode();
        super.visitCode();
    }

    @Override
    public void visitEnd() {
        this.f6705p.visitMethodEnd();
        super.visitEnd();
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.f6705p.visitFieldInsn(i, str, str2, str3);
        super.visitFieldInsn(i, str, str2, str3);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        this.f6705p.visitFrame(i, i2, objArr, i3, objArr2);
        super.visitFrame(i, i2, objArr, i3, objArr2);
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        this.f6705p.visitIincInsn(i, i2);
        super.visitIincInsn(i, i2);
    }

    @Override
    public void visitInsn(int i) {
        this.f6705p.visitInsn(i);
        super.visitInsn(i);
    }

    @Override
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitInsnAnnotation(i, typePath, str, z), this.f6705p.visitInsnAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.f6705p.visitIntInsn(i, i2);
        super.visitIntInsn(i, i2);
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.f6705p.visitInvokeDynamicInsn(str, str2, handle, objArr);
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.f6705p.visitJumpInsn(i, label);
        super.visitJumpInsn(i, label);
    }

    @Override
    public void visitLabel(Label label) {
        this.f6705p.visitLabel(label);
        super.visitLabel(label);
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.f6705p.visitLdcInsn(obj);
        super.visitLdcInsn(obj);
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        this.f6705p.visitLineNumber(i, label);
        super.visitLineNumber(i, label);
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.f6705p.visitLocalVariable(str, str2, str3, label, label2, i);
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z), this.f6705p.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z));
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.f6705p.visitLookupSwitchInsn(label, iArr, labelArr);
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override
    public void visitMaxs(int i, int i2) {
        this.f6705p.visitMaxs(i, i2);
        super.visitMaxs(i, i2);
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
            return;
        }
        this.f6705p.visitMethodInsn(i, str, str2, str3);
        if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3);
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6562api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        this.f6705p.visitMethodInsn(i, str, str2, str3, z);
        if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        this.f6705p.visitMultiANewArrayInsn(str, i);
        super.visitMultiANewArrayInsn(str, i);
    }

    @Override
    public void visitParameter(String str, int i) {
        this.f6705p.visitParameter(str, i);
        super.visitParameter(str, i);
    }

    @Override
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitParameterAnnotation(i, str, z), this.f6705p.visitParameterAnnotation(i, str, z));
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.f6705p.visitTableSwitchInsn(i, i2, label, labelArr);
        super.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitTryCatchAnnotation(i, typePath, str, z), this.f6705p.visitTryCatchAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f6705p.visitTryCatchBlock(label, label2, label3, str);
        super.visitTryCatchBlock(label, label2, label3, str);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6563mv == null ? null : this.f6563mv.visitTypeAnnotation(i, typePath, str, z), this.f6705p.visitMethodTypeAnnotation(i, typePath, str, z));
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.f6705p.visitTypeInsn(i, str);
        super.visitTypeInsn(i, str);
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        this.f6705p.visitVarInsn(i, i2);
        super.visitVarInsn(i, i2);
    }
}
