package com.a.b.a.a;

import com.a.b.a.b.ClassH;
import com.a.b.a.b.ClassK;
import com.a.b.a.e.Interfaceb;
import com.a.b.g.ClassU;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;

public final class ClassC extends Abstractu {

    private final int f1739a;

    private final int f1740b;

    private final ClassK f1741c;

    private final ClassH f1742d;

    private final Interfaceb f1743e;

    public ClassC(int i, int i2, ClassK c0939k, ClassH c0936h, Interfaceb interfaceC0967b) {
        super(AttCode.ATTRIBUTE_NAME);
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        if (c0939k == null) {
            throw new NullPointerException("code == null");
        }
        try {
            if (c0936h.m5516b_()) {
                throw new ClassU("catches.isMutable()");
            }
            try {
                if (interfaceC0967b.m4188b_()) {
                    throw new ClassU("attributes.isMutable()");
                }
                this.f1739a = i;
                this.f1740b = i2;
                this.f1741c = c0939k;
                this.f1742d = c0936h;
                this.f1743e = interfaceC0967b;
            } catch (NullPointerException e) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException e2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override
    public int mo3765a() {
        return this.f1741c.m3993c() + 10 + this.f1742d.m3970a() + this.f1743e.mo4187b();
    }

    public int m3768b() {
        return this.f1739a;
    }

    public int m3769c() {
        return this.f1740b;
    }

    public ClassK m3770d() {
        return this.f1741c;
    }

    public ClassH m3771e() {
        return this.f1742d;
    }

    public Interfaceb m3772f() {
        return this.f1743e;
    }
}
