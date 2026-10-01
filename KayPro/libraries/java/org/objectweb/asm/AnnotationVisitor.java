package org.objectweb.asm;

public abstract class AnnotationVisitor {

    protected final int f6427api;

    protected AnnotationVisitor f6428av;

    public AnnotationVisitor(int i) {
        this(i, null);
    }

    public AnnotationVisitor(int i, AnnotationVisitor annotationVisitor) {
        if (i != 262144 && i != 327680) {
            throw new IllegalArgumentException();
        }
        this.f6427api = i;
        this.f6428av = annotationVisitor;
    }

    public void visit(String str, Object obj) {
        if (this.f6428av != null) {
            this.f6428av.visit(str, obj);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, String str2) {
        if (this.f6428av != null) {
            return this.f6428av.visitAnnotation(str, str2);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String str) {
        if (this.f6428av != null) {
            return this.f6428av.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        if (this.f6428av != null) {
            this.f6428av.visitEnd();
        }
    }

    public void visitEnum(String str, String str2, String str3) {
        if (this.f6428av != null) {
            this.f6428av.visitEnum(str, str2, str3);
        }
    }
}
