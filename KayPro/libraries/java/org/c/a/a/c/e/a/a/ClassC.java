package org.c.a.a.c.e.a.a;

import org.c.a.a.b.f.Abstracta;
import org.c.a.a.b.f.ClassB;
import org.c.a.a.b.f.ClassC;
import org.c.a.a.b.f.ClassD;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassF;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassH;
import org.c.a.a.b.f.ClassI;
import org.c.a.a.b.f.ClassJ;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassM;
import org.c.a.a.b.f.ClassN;
import org.c.a.a.b.f.ClassO;

public class ClassC extends Abstracta {

    static final boolean f6408c;

    public int f6409a;

    final ClassA f6410b;

    static {
        f6408c = !ClassA.class.desiredAssertionStatus();
    }

    protected ClassC(ClassA c2238a) {
        this.f6410b = c2238a;
    }

    public void m8834a(int i) {
        this.f6409a = i;
    }

    @Override
    public void mo8172a(ClassB c2068b) {
        this.f6410b.f6407n.add(c2068b);
    }

    @Override
    public void mo8173a(ClassC c2069c) {
        this.f6410b.f6407n.add(c2069c);
    }

    @Override
    public void mo8174a(ClassD c2070d) {
        this.f6410b.f6407n.add(c2070d);
    }

    @Override
    public void mo8175a(ClassE c2071e) {
        if (!f6408c && c2071e == ClassE.f5890a) {
            throw new AssertionError("Unexpected EndBlockToken.END_BLOCK at this step. Uses 'JavaFragmentFactory.addEnd***(fragments)' instead");
        }
        this.f6410b.f6407n.add(c2071e);
    }

    @Override
    public void mo8176a(ClassF c2072f) {
        this.f6410b.f6407n.add(c2072f);
    }

    @Override
    public void mo8177a(ClassG c2073g) {
        this.f6410b.f6407n.add(c2073g);
    }

    @Override
    public void mo7711a(ClassH c2074h) {
        int iM8195a = c2074h.m8195a();
        if (iM8195a != 0) {
            if (this.f6409a != 0) {
                switch (iM8195a - this.f6409a) {
                    case 0:
                        break;
                    case 1:
                        this.f6410b.f6407n.add(ClassI.f5905a);
                        break;
                    case 2:
                        this.f6410b.f6407n.add(ClassI.f5906b);
                        break;
                    default:
                        this.f6410b.f6407n.add(new ClassI(iM8195a - this.f6409a));
                        break;
                }
            }
            this.f6409a = c2074h.m8195a();
            this.f6410b.f6407n.add(c2074h);
        }
    }

    @Override
    public void mo8178a(ClassJ c2076j) {
        this.f6410b.f6407n.add(c2076j);
    }

    @Override
    public void mo8179a(ClassK c2077k) {
        this.f6410b.f6407n.add(c2077k);
    }

    @Override
    public void mo8180a(ClassL c2078l) {
        if (!f6408c && c2078l == ClassL.f5910a) {
            throw new AssertionError("Unexpected StartBlockToken.START_BLOCK at this step. Uses 'JavaFragmentFactory.addStart***(fragments)' instead");
        }
        this.f6410b.f6407n.add(c2078l);
    }

    @Override
    public void mo8181a(ClassM c2079m) {
        this.f6410b.f6407n.add(c2079m);
    }

    @Override
    public void mo8182a(ClassN c2080n) {
        this.f6410b.f6407n.add(c2080n);
    }

    @Override
    public void mo8183a(ClassO c2081o) {
        this.f6410b.f6407n.add(c2081o);
    }
}
