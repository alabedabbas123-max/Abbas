package org.c.a.a.b.d.c;

import org.c.a.a.b.d.e.ClassI;

public class ClassB implements Interfaced {

    protected ClassI f5759a;

    protected Interfaceg f5760b;

    protected Interfacef f5761c;

    public ClassB(ClassI c2049i) {
        this.f5759a = c2049i;
    }

    public ClassB(ClassI c2049i, Interfacef interfaceC1996f) {
        this.f5759a = c2049i;
        this.f5761c = interfaceC1996f;
    }

    public ClassB(ClassI c2049i, Interfaceg interfaceC1997g) {
        this.f5759a = c2049i;
        this.f5760b = interfaceC1997g;
    }

    protected ClassB(ClassI c2049i, Interfaceg interfaceC1997g, Interfacef interfaceC1996f) {
        this.f5759a = c2049i;
        this.f5760b = interfaceC1997g;
        this.f5761c = interfaceC1996f;
    }

    @Override
    public void mo8042a(Interfaceo interfaceC2005o) {
        interfaceC2005o.mo7821a(this);
    }

    public ClassI m8044d() {
        return this.f5759a;
    }

    public Interfaceg m8045e() {
        return this.f5760b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassB)) {
            return false;
        }
        ClassB c1992b = (ClassB) obj;
        if (this.f5760b == null ? c1992b.f5760b != null : !this.f5760b.equals(c1992b.f5760b)) {
            return false;
        }
        if (this.f5761c == null ? c1992b.f5761c != null : !this.f5761c.equals(c1992b.f5761c)) {
            return false;
        }
        return this.f5759a.equals(c1992b.f5759a);
    }

    public Interfacef m8046f() {
        return this.f5761c;
    }

    public int hashCode() {
        return (((this.f5760b != null ? this.f5760b.hashCode() : 0) + (this.f5759a.hashCode() * 31)) * 31) + (this.f5761c != null ? this.f5761c.hashCode() : 0);
    }
}
