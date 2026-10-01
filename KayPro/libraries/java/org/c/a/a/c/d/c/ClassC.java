package org.c.a.a.c.d.c;

import org.c.a.a.b.b.Abstracta;
import org.c.a.a.b.b.Abstractc;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.b.b.Abstracth;
import org.c.a.a.b.b.ClassB;
import org.c.a.a.b.b.ClassG;
import org.c.a.a.b.b.ClassI;
import org.c.a.a.b.b.Interfacef;
import org.c.a.a.c.d.a.ClassA;
import org.c.a.a.d.ClassC;

public class ClassC implements Interfacef {

    protected ClassC f6386a = new ClassC();

    protected ClassC f6387b = new ClassC();

    protected ClassA f6388c = null;

    public ClassC m8828a() {
        this.f6386a.add(new ClassA(this.f6387b, null, this.f6388c));
        return this.f6386a;
    }

    @Override
    public void mo7700a(Abstracta abstractC1878a) {
        this.f6387b.add(abstractC1878a);
    }

    @Override
    public void mo7701a(ClassB c1879b) {
        this.f6387b.add(c1879b);
    }

    @Override
    public void mo7702a(Abstractc abstractC1880c) {
        ClassC c2247c = this.f6386a;
        ClassA c2226a = new ClassA(this.f6387b, abstractC1880c, this.f6388c);
        this.f6388c = c2226a;
        c2247c.add(c2226a);
        this.f6387b = new ClassC();
    }

    @Override
    public void mo7703a(Abstractd abstractC1881d) {
        this.f6387b.add(abstractC1881d);
    }

    @Override
    public void mo7704a(ClassG c1884g) {
        this.f6387b.add(c1884g);
    }

    @Override
    public void mo7705a(Abstracth abstractC1885h) {
        this.f6387b.add(abstractC1885h);
    }

    @Override
    public void mo7706a(ClassI c1886i) {
        this.f6387b.add(c1886i);
    }
}
