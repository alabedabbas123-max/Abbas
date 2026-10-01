package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public final class TraceFieldVisitor extends FieldVisitor {

    public final Printer f6704p;

    public TraceFieldVisitor(FieldVisitor fieldVisitor, Printer printer) {
        super(Opcodes.ASM5, fieldVisitor);
        this.f6704p = printer;
    }

    public TraceFieldVisitor(Printer printer) {
        this(null, printer);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6511fv == null ? null : this.f6511fv.visitAnnotation(str, z), this.f6704p.visitFieldAnnotation(str, z));
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        this.f6704p.visitFieldAttribute(attribute);
        super.visitAttribute(attribute);
    }

    @Override
    public void visitEnd() {
        this.f6704p.visitFieldEnd();
        super.visitEnd();
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6511fv == null ? null : this.f6511fv.visitTypeAnnotation(i, typePath, str, z), this.f6704p.visitFieldTypeAnnotation(i, typePath, str, z));
    }
}
