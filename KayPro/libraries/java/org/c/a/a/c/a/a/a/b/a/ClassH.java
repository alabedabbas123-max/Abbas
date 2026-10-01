package org.c.a.a.c.a.a.a.b.a;

import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.Interfaced;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.e.Interfacel;

public class ClassH extends ClassQ implements Interfacek {

    protected int f6014e;

    public ClassH(Interfaced interfaceC1994d, int i, Interfacel interfaceC2052l, Interfaced interfaceC1928d) {
        super(interfaceC1994d, i, interfaceC2052l, interfaceC1928d);
    }

    public void m8301a(int i) {
        this.f5666b = i;
    }

    public void m8302a(Interfaced interfaceC1928d) {
        this.f5668d = interfaceC1928d;
    }

    public void m8303b(int i) {
        this.f6014e = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassH) && super.equals(obj) && this.f6014e == ((ClassH) obj).f6014e;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * 31) + this.f6014e;
    }

    @Override
    public int mo8269q_() {
        return this.f6014e;
    }

    @Override
    public String toString() {
        return "ClassFileFieldDeclaration{" + this.f5667c + " " + this.f5668d + ", firstLineNumber=" + this.f6014e + "}";
    }
}
