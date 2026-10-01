package org.c.a.a.c.d.c;

import org.c.a.a.b.b.Abstracta;
import org.c.a.a.b.b.Abstractc;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.b.b.Abstracth;
import org.c.a.a.b.b.ClassB;
import org.c.a.a.b.b.ClassG;
import org.c.a.a.b.b.ClassI;
import org.c.a.a.b.b.Interfacef;
import org.c.a.a.d.ClassC;

public class ClassD implements Interfacef {

    protected ClassC f6389a = new ClassC();

    protected ClassC f6390b = new ClassC();

    protected int f6391c;

    protected ClassG f6392d;

    protected int f6393e;

    public void m8829a() {
        this.f6391c = 0;
        this.f6392d = null;
        this.f6393e = 0;
    }

    @Override
    public void mo7700a(Abstracta abstractC1878a) {
    }

    @Override
    public void mo7701a(ClassB c1879b) {
        if (this.f6393e != 1) {
            this.f6392d = (ClassG) this.f6390b.remove(this.f6390b.size() - 1);
            this.f6391c = ((ClassI) this.f6389a.m8845e()).m7708h();
        }
        this.f6393e = 0;
    }

    @Override
    public void mo7702a(Abstractc abstractC1880c) {
    }

    @Override
    public void mo7703a(Abstractd abstractC1881d) {
    }

    @Override
    public void mo7704a(ClassG c1884g) {
        this.f6392d = c1884g;
    }

    @Override
    public void mo7705a(Abstracth abstractC1885h) {
    }

    @Override
    public void mo7706a(ClassI c1886i) {
        if (this.f6392d != null) {
            if (this.f6391c == 2 && c1886i.m7708h() == 2) {
                this.f6392d.m7707a(1);
            } else {
                this.f6392d.m7707a(2);
            }
        }
        if (this.f6393e != 0) {
            this.f6389a.add(c1886i);
            this.f6390b.add(this.f6392d);
            this.f6392d = null;
        }
        this.f6391c = c1886i.m7708h();
        this.f6393e = 1;
    }
}
