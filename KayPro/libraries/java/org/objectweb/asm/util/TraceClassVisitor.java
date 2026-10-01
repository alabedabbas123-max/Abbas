package org.objectweb.asm.util;

import java.io.PrintWriter;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public final class TraceClassVisitor extends ClassVisitor {

    public final Printer f6702p;

    private final PrintWriter f6703pw;

    public TraceClassVisitor(PrintWriter printWriter) {
        this(null, printWriter);
    }

    public TraceClassVisitor(ClassVisitor classVisitor, PrintWriter printWriter) {
        this(classVisitor, new Textifier(), printWriter);
    }

    public TraceClassVisitor(ClassVisitor classVisitor, Printer printer, PrintWriter printWriter) {
        super(Opcodes.ASM5, classVisitor);
        this.f6703pw = printWriter;
        this.f6702p = printer;
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f6702p.visit(i, i2, str, str2, str3, strArr);
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6446cv == null ? null : this.f6446cv.visitAnnotation(str, z), this.f6702p.visitClassAnnotation(str, z));
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        this.f6702p.visitClassAttribute(attribute);
        super.visitAttribute(attribute);
    }

    @Override
    public void visitEnd() {
        this.f6702p.visitClassEnd();
        if (this.f6703pw != null) {
            this.f6702p.print(this.f6703pw);
            this.f6703pw.flush();
        }
        super.visitEnd();
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return new TraceFieldVisitor(this.f6446cv == null ? null : this.f6446cv.visitField(i, str, str2, str3, obj), this.f6702p.visitField(i, str, str2, str3, obj));
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.f6702p.visitInnerClass(str, str2, str3, i);
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return new TraceMethodVisitor(this.f6446cv == null ? null : this.f6446cv.visitMethod(i, str, str2, str3, strArr), this.f6702p.visitMethod(i, str, str2, str3, strArr));
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        this.f6702p.visitOuterClass(str, str2, str3);
        super.visitOuterClass(str, str2, str3);
    }

    @Override
    public void visitSource(String str, String str2) {
        this.f6702p.visitSource(str, str2);
        super.visitSource(str, str2);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new TraceAnnotationVisitor(this.f6446cv == null ? null : this.f6446cv.visitTypeAnnotation(i, typePath, str, z), this.f6702p.visitClassTypeAnnotation(i, typePath, str, z));
    }
}
