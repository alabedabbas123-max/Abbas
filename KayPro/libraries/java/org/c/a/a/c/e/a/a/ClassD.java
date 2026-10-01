package org.c.a.a.c.e.a.a;

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
import org.c.a.a.b.f.Interfaceq;

public class ClassD implements Interfaceq {

    static final boolean f6411b;

    final ClassA f6412a;

    static {
        f6411b = !ClassA.class.desiredAssertionStatus();
    }

    protected ClassD(ClassA c2238a) {
        this.f6412a = c2238a;
    }

    @Override
    public void mo8172a(ClassB c2068b) {
        this.f6412a.f6407n.add(c2068b);
    }

    @Override
    public void mo8173a(ClassC c2069c) {
        this.f6412a.f6407n.add(c2069c);
    }

    @Override
    public void mo8174a(ClassD c2070d) {
        this.f6412a.f6407n.add(c2070d);
    }

    @Override
    public void mo8175a(ClassE c2071e) {
        if (!f6411b && c2071e == ClassE.f5890a) {
            throw new AssertionError("Unexpected EndBlockToken.END_BLOCK at this step. Uses 'JavaFragmentFactory.addEnd***(fragments)' instead");
        }
        this.f6412a.f6407n.add(c2071e);
    }

    @Override
    public void mo8176a(ClassF c2072f) {
        this.f6412a.f6407n.add(c2072f);
    }

    @Override
    public void mo8177a(ClassG c2073g) {
        this.f6412a.f6407n.add(c2073g);
    }

    @Override
    public void mo7711a(ClassH c2074h) {
        if (!f6411b && c2074h.m8195a() != 0) {
            throw new AssertionError("LineNumberToken cannot have a known line number. Uses 'LineNumberTokensFragment' instead");
        }
    }

    @Override
    public void mo7750a(ClassI c2075i) {
        this.f6412a.f6407n.add(c2075i);
    }

    @Override
    public void mo8178a(ClassJ c2076j) {
        this.f6412a.f6407n.add(c2076j);
    }

    @Override
    public void mo8179a(ClassK c2077k) {
        this.f6412a.f6407n.add(c2077k);
    }

    @Override
    public void mo8180a(ClassL c2078l) {
        if (!f6411b && c2078l == ClassL.f5910a) {
            throw new AssertionError("Unexpected StartBlockToken.START_BLOCK at this step. Uses 'JavaFragmentFactory.addStart***(fragments)' instead");
        }
        this.f6412a.f6407n.add(c2078l);
    }

    @Override
    public void mo8181a(ClassM c2079m) {
        this.f6412a.f6407n.add(c2079m);
    }

    @Override
    public void mo8182a(ClassN c2080n) {
        this.f6412a.f6407n.add(c2080n);
    }

    @Override
    public void mo8183a(ClassO c2081o) {
        this.f6412a.f6407n.add(c2081o);
    }
}
