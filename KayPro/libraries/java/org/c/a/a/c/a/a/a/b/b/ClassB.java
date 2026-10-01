package org.c.a.a.c.a.a.a.b.b;

import org.c.a.a.b.d.b.ClassW;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.a.c.Interfaceg;

public class ClassB extends ClassW implements Interfaceg {

    protected Abstracta f6026d;

    public ClassB(int i, Abstracta abstractC2115a) {
        super(i, null, null);
        this.f6026d = abstractC2115a;
        abstractC2115a.m8323a(this);
    }

    @Override
    public void mo8304a(Abstracta abstractC2115a) {
        this.f6026d = abstractC2115a;
    }

    @Override
    public String mo8033d() {
        return this.f6026d.mo8337g();
    }

    @Override
    public Interfacel mo7963f() {
        return this.f6026d.mo8370k();
    }

    public Abstracta m8306g() {
        return this.f6026d;
    }

    @Override
    public String toString() {
        return "ClassFileLocalVariableReferenceExpression{type=" + this.f6026d.mo8370k() + ", name=" + this.f6026d.mo8337g() + "}";
    }
}
