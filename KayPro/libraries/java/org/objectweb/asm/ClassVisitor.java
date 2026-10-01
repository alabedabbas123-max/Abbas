package org.objectweb.asm;

public abstract class ClassVisitor {

    protected final int f6445api;

    protected ClassVisitor f6446cv;

    public ClassVisitor(int i) {
        this(i, null);
    }

    public ClassVisitor(int i, ClassVisitor classVisitor) {
        if (i != 262144 && i != 327680) {
            throw new IllegalArgumentException();
        }
        this.f6445api = i;
        this.f6446cv = classVisitor;
    }

    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (this.f6446cv != null) {
            this.f6446cv.visit(i, i2, str, str2, str3, strArr);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        if (this.f6446cv != null) {
            return this.f6446cv.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        if (this.f6446cv != null) {
            this.f6446cv.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        if (this.f6446cv != null) {
            this.f6446cv.visitEnd();
        }
    }

    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        if (this.f6446cv != null) {
            return this.f6446cv.visitField(i, str, str2, str3, obj);
        }
        return null;
    }

    public void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.f6446cv != null) {
            this.f6446cv.visitInnerClass(str, str2, str3, i);
        }
    }

    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if (this.f6446cv != null) {
            return this.f6446cv.visitMethod(i, str, str2, str3, strArr);
        }
        return null;
    }

    public void visitOuterClass(String str, String str2, String str3) {
        if (this.f6446cv != null) {
            this.f6446cv.visitOuterClass(str, str2, str3);
        }
    }

    public void visitSource(String str, String str2) {
        if (this.f6446cv != null) {
            this.f6446cv.visitSource(str, str2);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.f6445api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6446cv != null) {
            return this.f6446cv.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }
}
