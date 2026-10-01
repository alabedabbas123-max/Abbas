package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;

public final class CstAnnotation extends Constant {
    private final Annotation annotation;

    public CstAnnotation(Annotation annotation) {
        if (annotation == null) {
            throw new NullPointerException("annotation == null");
        }
        annotation.throwIfMutable();
        this.annotation = annotation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CstAnnotation) {
            return this.annotation.equals(((CstAnnotation) obj).annotation);
        }
        return false;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override
    protected int compareTo0(Constant constant) {
        return this.annotation.compareTo2(((CstAnnotation) constant).annotation);
    }

    public String toString() {
        return this.annotation.toString();
    }

    @Override
    public String typeName() {
        return "annotation";
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String toHuman() {
        return this.annotation.toString();
    }

    public Annotation getAnnotation() {
        return this.annotation;
    }
}
