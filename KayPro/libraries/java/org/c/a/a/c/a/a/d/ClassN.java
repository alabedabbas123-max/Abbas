package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ClassT;
import org.c.a.a.b.d.a.ClassW;
import org.c.a.a.b.d.a.ClassX;
import org.c.a.a.b.d.d.ClassO;

public class ClassN extends Abstracta {

    protected boolean f6228a;

    final ClassL f6229b;

    protected ClassN(ClassL c2190l) {
        this.f6229b = c2190l;
    }

    @Override
    public void mo7780a(ClassT c1944t) {
        if (this.f6229b.f6220b.containsKey(c1944t.mo7939i())) {
            c1944t.m7933a(true);
            c1944t.mo7932a((String) this.f6229b.f6220b.get(c1944t.mo7939i()));
        }
    }

    @Override
    public void mo7783a(ClassW c1947w) {
        this.f6228a = false;
        c1947w.m7946e().mo7869a(this);
        if (this.f6228a) {
            c1947w.m7943a(true);
        }
    }

    @Override
    public void mo7784a(ClassX c1948x) {
        if (this.f6229b.f6220b.containsKey(c1948x.m7950d())) {
            this.f6228a = true;
            c1948x.m7948a((String) this.f6229b.f6220b.get(c1948x.m7950d()));
        }
    }

    @Override
    public void mo7852a(ClassO c2029o) {
        this.f6228a = false;
        c2029o.m7946e().mo7869a(this);
        if (this.f6228a) {
            c2029o.m7943a(true);
        }
    }
}
