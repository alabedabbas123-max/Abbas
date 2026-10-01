package com.a.b.a.b;

import com.a.b.a.a.ClassC;
import com.a.b.a.a.ClassI;
import com.a.b.a.a.ClassJ;
import com.a.b.a.a.ClassK;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfacec;
import com.a.b.a.e.Interfaceg;
import com.a.b.e.b.ad;
import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.d.ClassA;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;

public final class ClassO implements Interfaceg {

    private final Interfaceg f1879a;

    private final Interfacec f1880b;

    private final ClassC f1881c;

    private final ClassR f1882d;

    private final ClassT f1883e;

    /* JADX WARN: Code duplicated, block: B:20:0x0084 A[PHI: r1
      0x0084: PHI (r1v3 com.a.b.a.b.t) = (r1v2 com.a.b.a.b.t), (r1v4 com.a.b.a.b.t) binds: [B:7:0x0030, B:13:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    public ClassO(Interfaceg interfaceC0972g, Interfacec interfaceC0968c, boolean z, boolean z2) {
        ClassR c0946r;
        ClassT c0948tM4049b;
        this.f1879a = interfaceC0972g;
        this.f1880b = interfaceC0968c;
        this.f1881c = (ClassC) interfaceC0972g.mo4003h().mo4186a(AttCode.ATTRIBUTE_NAME);
        Interfaceb interfaceC0967bM3772f = this.f1881c.m3772f();
        ClassR c0946r2 = ClassR.f1890a;
        if (z) {
            c0946r = c0946r2;
            ClassI c0895i = (ClassI) interfaceC0967bM3772f.mo4186a(AttLineNumberTable.ATTRIBUTE_NAME);
            while (c0895i != null) {
                ClassR c0946rM4041a = ClassR.m4041a(c0946r, c0895i.m3778b());
                c0895i = (ClassI) interfaceC0967bM3772f.mo4185a(c0895i);
                c0946r = c0946rM4041a;
            }
        } else {
            c0946r = c0946r2;
        }
        this.f1882d = c0946r;
        ClassT c0948tM4048a = ClassT.f1893a;
        if (z2) {
            for (ClassJ c0896j = (ClassJ) interfaceC0967bM3772f.mo4186a(AttLocalVariableTable.ATTRIBUTE_NAME); c0896j != null; c0896j = (ClassJ) interfaceC0967bM3772f.mo4185a(c0896j)) {
                c0948tM4048a = ClassT.m4048a(c0948tM4048a, c0896j.m3784b());
            }
            ClassT c0948tM4048a2 = ClassT.f1893a;
            for (ClassK c0897k = (ClassK) interfaceC0967bM3772f.mo4186a(AttLocalVariableTypeTable.ATTRIBUTE_NAME); c0897k != null; c0897k = (ClassK) interfaceC0967bM3772f.mo4185a(c0897k)) {
                c0948tM4048a2 = ClassT.m4048a(c0948tM4048a2, c0897k.m3784b());
            }
            if (c0948tM4048a2.m5476d_() != 0) {
                c0948tM4049b = ClassT.m4049b(c0948tM4048a, c0948tM4048a2);
            } else {
                c0948tM4049b = c0948tM4048a;
            }
        } else {
            c0948tM4049b = c0948tM4048a;
        }
        this.f1883e = c0948tM4049b;
    }

    public ad m3995a(int i) {
        return new ad(m3996a(), i, this.f1882d.m4045b(i));
    }

    public ad m3996a() {
        return this.f1880b.mo4141m();
    }

    public final boolean m3997b() {
        return ((this.f1880b.mo4132d() & 512) == 0 || mo3999d().m4948f()) ? false : true;
    }

    public final boolean m3998c() {
        return (mo4002g() & 8) != 0;
    }

    @Override
    public aa mo3999d() {
        return this.f1879a.mo3999d();
    }

    @Override
    public ad mo4000e() {
        return this.f1879a.mo4000e();
    }

    @Override
    public ad mo4001f() {
        return this.f1879a.mo4001f();
    }

    @Override
    public int mo4002g() {
        return this.f1879a.mo4002g();
    }

    @Override
    public Interfaceb mo4003h() {
        return this.f1879a.mo4003h();
    }

    @Override
    public ae mo4004i() {
        return this.f1879a.mo4004i();
    }

    @Override
    public ClassA mo4005j() {
        return this.f1879a.mo4005j();
    }

    public int m4006k() {
        return this.f1881c.m3768b();
    }

    public int m4007l() {
        return this.f1881c.m3769c();
    }

    public ClassK m4008m() {
        return this.f1881c.m3770d();
    }

    public ClassH m4009n() {
        return this.f1881c.m3771e();
    }

    public ClassT m4010o() {
        return this.f1883e;
    }
}
