package com.a.b.a.d;

import com.a.b.a.e.ClassO;
import com.a.b.a.e.ClassP;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfacef;
import com.a.b.a.e.Interfaceg;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.aa;
import com.a.b.e.c.ae;

final class ClassI extends Abstracth {

    private final ClassP f1946a;

    public ClassI(ClassE c0960e, ae c1205ae, int i, ClassB c0957b) {
        super(c0960e, c1205ae, i, c0957b);
        this.f1946a = new ClassP(m4158f());
    }

    @Override
    protected Interfacef mo4149a(int i, int i2, aa c1201aa, Interfaceb interfaceC0967b) {
        ClassO c0980o = new ClassO(m4159g(), i2, c1201aa, interfaceC0967b);
        this.f1946a.m4201a(i, (Interfaceg) c0980o);
        return c0980o;
    }

    public ClassP m4160a() {
        m4157e();
        return this.f1946a;
    }

    @Override
    protected String mo4151a(int i) {
        return ClassA.m4730d(i);
    }

    @Override
    protected String mo4152b() {
        return "method";
    }

    @Override
    protected int mo4153c() {
        return 2;
    }
}
