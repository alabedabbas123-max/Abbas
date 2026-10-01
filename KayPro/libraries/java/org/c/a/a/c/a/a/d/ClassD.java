package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.e.Abstracta;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.a.c.ClassE;
import org.c.a.a.c.a.a.a.c.ClassJ;
import org.c.a.a.c.a.a.a.c.ClassK;
import org.c.a.a.c.a.a.a.c.Interfacei;
import org.c.a.a.c.a.a.c.ClassW;

public class ClassD extends Abstracta implements Interfacei {

    protected ClassW f6199a;

    protected int f6200b;

    protected int f6201c;

    protected Abstracta f6202d;

    public ClassD(ClassW c2168w) {
        this.f6199a = c2168w;
    }

    public Abstracta m8651a() {
        return this.f6202d;
    }

    public void m8652a(int i, int i2) {
        this.f6200b = i;
        this.f6201c = i2;
    }

    @Override
    public void mo8129a(ClassG c2047g) {
        this.f6202d = new ClassE(this.f6200b, this.f6201c, c2047g);
    }

    @Override
    public void mo8130a(ClassH c2048h) {
        this.f6202d = new ClassJ(this.f6199a, this.f6200b, this.f6201c, c2048h);
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        this.f6202d = new ClassJ(this.f6199a, this.f6200b, this.f6201c, c2049i);
    }

    @Override
    public void mo8132a(ClassK c2051k) {
        if (c2051k.mo8145d() == 0) {
            this.f6202d = new ClassK(this.f6200b, this.f6201c, c2051k);
        } else {
            this.f6202d = new ClassJ(this.f6199a, this.f6200b, this.f6201c, c2051k);
        }
    }

    @Override
    public void mo8378a(ClassE c2119e) {
        this.f6202d = new ClassE(this.f6200b, this.f6201c, c2119e.mo8370k());
    }

    @Override
    public void mo8379a(ClassJ c2124j) {
        this.f6202d = new ClassJ(this.f6199a, this.f6200b, this.f6201c, c2124j);
    }

    @Override
    public void mo8380a(ClassK c2125k) {
        if (c2125k.m8338h() == 0) {
            this.f6202d = new ClassK(this.f6200b, this.f6201c, c2125k);
        } else {
            this.f6202d = new ClassJ(this.f6199a, this.f6200b, this.f6201c, c2125k.mo8370k());
        }
    }
}
