package com.a.b.a.d;

import com.a.b.a.e.ClassI;
import com.a.b.a.e.ClassK;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfacef;
import com.a.b.a.e.Interfacej;
import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.Interfaceb;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import org.apache.commons.io.IOUtils;

abstract class Abstracth {

    private final ClassE f1940a;

    private final ae f1941b;

    private final int f1942c;

    private final ClassB f1943d;

    private int f1944e;

    private Interfacej f1945f;

    public Abstracth(ClassE c0960e, ae c1205ae, int i, ClassB c0957b) {
        if (c0960e == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c0957b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f1940a = c0960e;
        this.f1941b = c1205ae;
        this.f1942c = i;
        this.f1943d = c0957b;
        this.f1944e = -1;
    }

    private void m4154a() {
        int iMo4153c = mo4153c();
        int iM4158f = m4158f();
        int iM4112a = this.f1942c + 2;
        ClassE c1307eM4130b = this.f1940a.m4130b();
        Interfaceb interfaceC1209bM4135g = this.f1940a.m4135g();
        if (this.f1945f != null) {
            this.f1945f.m4195a(c1307eM4130b, this.f1942c, 2, String.valueOf(mo4152b()) + "s_count: " + ClassK.m5485c(iM4158f));
        }
        for (int i = 0; i < iM4158f; i++) {
            try {
                int iM5446f = c1307eM4130b.m5446f(iM4112a);
                int iM5446f2 = c1307eM4130b.m5446f(iM4112a + 2);
                int iM5446f3 = c1307eM4130b.m5446f(iM4112a + 4);
                ad c1204ad = (ad) interfaceC1209bM4135g.mo4971a(iM5446f2);
                ad c1204ad2 = (ad) interfaceC1209bM4135g.mo4971a(iM5446f3);
                if (this.f1945f != null) {
                    this.f1945f.m4196a(c1307eM4130b, iM4112a, c1204ad.m4958j(), c1204ad2.m4958j());
                    this.f1945f.m4195a(c1307eM4130b, iM4112a, 0, IOUtils.LINE_SEPARATOR_UNIX + mo4152b() + "s[" + i + "]:\n");
                    this.f1945f.m4194a(1);
                    this.f1945f.m4195a(c1307eM4130b, iM4112a, 2, "access_flags: " + mo4151a(iM5446f));
                    this.f1945f.m4195a(c1307eM4130b, iM4112a + 2, 2, "name: " + c1204ad.mo3828d());
                    this.f1945f.m4195a(c1307eM4130b, iM4112a + 4, 2, "descriptor: " + c1204ad2.mo3828d());
                }
                ClassC c0958c = new ClassC(this.f1940a, iMo4153c, iM4112a + 6, this.f1943d);
                c0958c.m4113a(this.f1945f);
                iM4112a = c0958c.m4112a();
                ClassK c0976kM4114b = c0958c.m4114b();
                c0976kM4114b.mo3944c_();
                Interfacef interfaceC0971fMo4149a = mo4149a(i, iM5446f, new aa(c1204ad, c1204ad2), c0976kM4114b);
                if (this.f1945f != null) {
                    this.f1945f.m4194a(-1);
                    this.f1945f.m4195a(c1307eM4130b, iM4112a, 0, "end " + mo4152b() + "s[" + i + "]\n");
                    this.f1945f.m4197a(c1307eM4130b, iM4112a, c1204ad.m4958j(), c1204ad2.m4958j(), interfaceC0971fMo4149a);
                }
            } catch (ClassI e) {
                e.m3757a("...while parsing " + mo4152b() + "s[" + i + "]");
                throw e;
            } catch (RuntimeException e2) {
                ClassI c0974i = new ClassI(e2);
                c0974i.m3757a("...while parsing " + mo4152b() + "s[" + i + "]");
                throw c0974i;
            }
        }
        this.f1944e = iM4112a;
    }

    protected abstract Interfacef mo4149a(int i, int i2, aa c1201aa, Interfaceb interfaceC0967b);

    protected abstract String mo4151a(int i);

    public final void m4155a(Interfacej interfaceC0975j) {
        this.f1945f = interfaceC0975j;
    }

    protected abstract String mo4152b();

    protected abstract int mo4153c();

    public int m4156d() {
        m4157e();
        return this.f1944e;
    }

    protected final void m4157e() {
        if (this.f1944e < 0) {
            m4154a();
        }
    }

    protected final int m4158f() {
        return this.f1940a.m4130b().m5446f(this.f1942c);
    }

    protected final ae m4159g() {
        return this.f1941b;
    }
}
