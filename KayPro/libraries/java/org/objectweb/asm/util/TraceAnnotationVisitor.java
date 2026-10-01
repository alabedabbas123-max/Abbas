package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

public final class TraceAnnotationVisitor extends AnnotationVisitor {

    private final Printer f6701p;

    public TraceAnnotationVisitor(AnnotationVisitor annotationVisitor, Printer printer) {
        super(Opcodes.ASM5, annotationVisitor);
        this.f6701p = printer;
    }

    public TraceAnnotationVisitor(Printer printer) {
        this(null, printer);
    }

    @Override
    public void visit(String str, Object obj) {
        this.f6701p.visit(str, obj);
        super.visit(str, obj);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        return new TraceAnnotationVisitor(this.f6428av == null ? null : this.f6428av.visitAnnotation(str, str2), this.f6701p.visitAnnotation(str, str2));
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        return new TraceAnnotationVisitor(this.f6428av == null ? null : this.f6428av.visitArray(str), this.f6701p.visitArray(str));
    }

    @Override
    public void visitEnd() {
        this.f6701p.visitAnnotationEnd();
        super.visitEnd();
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        this.f6701p.visitEnum(str, str2, str3);
        super.visitEnum(str, str2, str3);
    }
}
