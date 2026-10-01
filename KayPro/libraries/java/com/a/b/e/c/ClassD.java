package com.a.b.e.c;

public class ClassD extends Abstracta {

    private final ClassE f3155a;

    public ClassD(ClassE c1212e) {
        if (c1212e == null) {
            throw new NullPointerException("list == null");
        }
        c1212e.m5519m();
        this.f3155a = c1212e;
    }

    public ClassE m4977a() {
        return this.f3155a;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return this.f3155a.compareTo(((ClassD) abstractC1200a).f3155a);
    }

    @Override
    public String mo3828d() {
        return this.f3155a.m5475b("{", ", ", "}");
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassD) {
            return this.f3155a.equals(((ClassD) obj).f3155a);
        }
        return false;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "array";
    }

    public int hashCode() {
        return this.f3155a.hashCode();
    }

    public String toString() {
        return this.f3155a.m5473a("array{", ", ", "}");
    }
}
