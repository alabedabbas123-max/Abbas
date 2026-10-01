package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.b.ClassW;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.c.Abstracta;

public class ClassY extends Abstracta {

    protected int f6255a;

    protected boolean f6256b = false;

    public ClassY(Abstracta abstractC2115a) {
        this.f6255a = abstractC2115a.m8333d();
    }

    @Override
    public void mo7815a(ClassW c1987w) {
        this.f6256b = (((ClassB) c1987w).m8306g().m8333d() == this.f6255a) | this.f6256b;
    }

    public boolean m8677a() {
        return this.f6256b;
    }
}
