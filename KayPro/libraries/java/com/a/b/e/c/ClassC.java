package com.a.b.e.c;

import com.a.b.e.a.ClassA;

public final class ClassC extends Abstracta {

    private final ClassA f3154a;

    public ClassC(ClassA c1161a) {
        if (c1161a == null) {
            throw new NullPointerException("annotation == null");
        }
        c1161a.m5519m();
        this.f3154a = c1161a;
    }

    public ClassA m4976a() {
        return this.f3154a;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return this.f3154a.compareTo(((ClassC) abstractC1200a).f3154a);
    }

    @Override
    public String mo3828d() {
        return this.f3154a.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassC) {
            return this.f3154a.equals(((ClassC) obj).f3154a);
        }
        return false;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "annotation";
    }

    public int hashCode() {
        return this.f3154a.hashCode();
    }

    public String toString() {
        return this.f3154a.toString();
    }
}
