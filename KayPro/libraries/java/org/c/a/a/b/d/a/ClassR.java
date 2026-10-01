package org.c.a.a.b.d.a;

import org.c.a.a.d.ClassC;

public class ClassR implements Interfaced {

    protected ClassQ f5669a;

    protected String f5670b;

    protected int f5671c;

    protected Interfaceaj f5672d;

    public ClassR(String str, Interfaceaj interfaceC1925aj) {
        this.f5670b = str;
        this.f5672d = interfaceC1925aj;
    }

    public void m7926a(Interfaceaj interfaceC1925aj) {
        this.f5672d = interfaceC1925aj;
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7778a(this);
    }

    @Override
    public void mo7899a(ClassQ c1941q) {
        this.f5669a = c1941q;
    }

    @Override
    public ClassR mo7865h() {
        return this;
    }

    public ClassQ m7928d() {
        return this.f5669a;
    }

    public String m7929e() {
        return this.f5670b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassR)) {
            return false;
        }
        ClassR c1942r = (ClassR) obj;
        if (this.f5671c == c1942r.f5671c && this.f5670b.equals(c1942r.f5670b)) {
            if (this.f5672d != null) {
                if (this.f5672d.equals(c1942r.f5672d)) {
                    return true;
                }
            } else if (c1942r.f5672d == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int m7930f() {
        return this.f5671c;
    }

    public Interfaceaj m7931g() {
        return this.f5672d;
    }

    public int hashCode() {
        return (this.f5672d != null ? this.f5672d.hashCode() : 0) + (((this.f5670b.hashCode() * 31) + this.f5671c) * 31);
    }

    @Override
    public boolean mo7867j_() {
        return false;
    }

    @Override
    public ClassC mo7868l_() {
        return null;
    }

    @Override
    public int size() {
        return 1;
    }

    public String toString() {
        return "FieldDeclarator{" + this.f5670b + "}";
    }
}
