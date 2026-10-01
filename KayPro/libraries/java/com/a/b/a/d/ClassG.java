package com.a.b.a.d;

import com.a.b.a.e.ClassL;
import com.a.b.a.e.ClassM;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfaced;
import com.a.b.a.e.Interfacef;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.aa;
import com.a.b.e.c.ae;

final class ClassG extends Abstracth {

    private final ClassM f1939a;

    public ClassG(ClassE c0960e, ae c1205ae, int i, ClassB c0957b) {
        super(c0960e, c1205ae, i, c0957b);
        this.f1939a = new ClassM(m4158f());
    }

    @Override
    protected Interfacef mo4149a(int i, int i2, aa c1201aa, Interfaceb interfaceC0967b) {
        ClassL c0977l = new ClassL(m4159g(), i2, c1201aa, interfaceC0967b);
        this.f1939a.m4200a(i, (Interfaced) c0977l);
        return c0977l;
    }

    public ClassM m4150a() {
        m4157e();
        return this.f1939a;
    }

    @Override
    protected String mo4151a(int i) {
        return ClassA.m4729c(i);
    }

    @Override
    protected String mo4152b() {
        return "field";
    }

    @Override
    protected int mo4153c() {
        return 1;
    }
}
