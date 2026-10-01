package org.objectweb.asm;

public abstract class FieldVisitor {

    protected final int f6510api;

    protected FieldVisitor f6511fv;

    public FieldVisitor(int i) {
        this(i, null);
    }

    public FieldVisitor(int i, FieldVisitor fieldVisitor) {
        if (i != 262144 && i != 327680) {
            throw new IllegalArgumentException();
        }
        this.f6510api = i;
        this.f6511fv = fieldVisitor;
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        if (this.f6511fv != null) {
            return this.f6511fv.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        if (this.f6511fv != null) {
            this.f6511fv.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        if (this.f6511fv != null) {
            this.f6511fv.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.f6510api < 327680) {
            throw new RuntimeException();
        }
        if (this.f6511fv != null) {
            return this.f6511fv.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }
}
