package org.c.a.a.b.d.a;

import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.e.Interfacel;

public class ClassQ extends Abstractaa {

    protected Interfaced f5665a;

    protected int f5666b;

    protected Interfacel f5667c;

    protected Interfaced f5668d;

    public ClassQ(Interfaced interfaceC1994d, int i, Interfacel interfaceC2052l, Interfaced interfaceC1928d) {
        this.f5666b = i;
        this.f5665a = interfaceC1994d;
        this.f5667c = interfaceC2052l;
        this.f5668d = interfaceC1928d;
        interfaceC1928d.mo7899a(this);
    }

    public int m7922a() {
        return this.f5666b;
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7777a(this);
    }

    public Interfaced m7923b() {
        return this.f5665a;
    }

    public Interfacel m7924c() {
        return this.f5667c;
    }

    public Interfaced m7925d() {
        return this.f5668d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassQ)) {
            return false;
        }
        ClassQ c1941q = (ClassQ) obj;
        if (this.f5666b != c1941q.f5666b) {
            return false;
        }
        if (this.f5665a == null ? c1941q.f5665a != null : !this.f5665a.equals(c1941q.f5665a)) {
            return false;
        }
        return this.f5668d.equals(c1941q.f5668d) && this.f5667c.equals(c1941q.f5667c);
    }

    public int hashCode() {
        return (((((this.f5665a != null ? this.f5665a.hashCode() : 0) + (this.f5666b * 31)) * 31) + this.f5667c.hashCode()) * 31) + this.f5668d.hashCode();
    }

    public String toString() {
        return "FieldDeclaration{" + this.f5667c + " " + this.f5668d + "}";
    }
}
