package org.c.a.a.c.a.a.a.b.a;

import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.Interfaced;
import org.c.a.a.b.d.e.Interfacef;
import org.c.a.a.b.d.e.Interfacel;

public class ClassD extends ClassK implements Interfacee {

    protected ClassB f6007h;

    protected ClassA f6008i;

    protected ClassD f6009j;

    protected List f6010k;

    protected int f6011l;

    public ClassD(ClassB c2094b, ClassA c1821a, ClassD c1877d, Interfaced interfaceC1994d, Interfacef interfaceC2046f, List list, Interfaced interfaceC2044d, int i) {
        super(interfaceC1994d, c1877d.m7683a(), interfaceC2046f, null, interfaceC2044d, c1877d.m7686c(), null);
        this.f6007h = c2094b;
        this.f6008i = c1821a;
        this.f6011l = i;
        this.f6010k = list;
        this.f6009j = c1877d;
    }

    @Override
    public void mo8287a(int i) {
        this.f5650b = i;
    }

    @Override
    public void mo8288a(Interfacee interfaceC1929e) {
        this.f5652d = interfaceC1929e;
    }

    @Override
    public void mo8289a(Interfaceb interfaceC2016b) {
        this.f5655g = interfaceC2016b;
    }

    public void m8290b(int i) {
        this.f6011l = i;
    }

    @Override
    public ClassB mo8291j() {
        return this.f6007h;
    }

    @Override
    public ClassA mo8292k() {
        return this.f6008i;
    }

    @Override
    public Interfacel mo8293o_() {
        return null;
    }

    @Override
    public int mo8269q_() {
        return this.f6011l;
    }

    @Override
    public ClassD mo8294r_() {
        return this.f6009j;
    }

    @Override
    public List mo8295s_() {
        return this.f6010k;
    }

    @Override
    public String toString() {
        return "ClassFileConstructorDeclaration{" + this.f6008i.m7586d() + ' ' + this.f5654f + ", firstLineNumber=" + this.f6011l + "}";
    }
}
