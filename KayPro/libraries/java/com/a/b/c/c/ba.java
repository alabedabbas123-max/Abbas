package com.a.b.c.c;

import com.a.a.ClassE;
import com.a.b.e.c.ad;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ba extends Abstractat {

    private final ad f2418a;

    public ba(ad c1204ad) {
        super(1, m4554a(c1204ad));
        this.f2418a = c1204ad;
    }

    private static int m4554a(ad c1204ad) {
        return ClassE.m3762a(c1204ad.m4961m()) + c1204ad.m4960l() + 1;
    }

    @Override
    protected int mo4468a(Abstractat abstractC1079at) {
        return this.f2418a.compareTo(((ba) abstractC1079at).f2418a);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_STRING_DATA_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
    }

    @Override
    public void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        ClassE c1307eM4959k = this.f2418a.m4959k();
        int iM4961m = this.f2418a.m4961m();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(ClassE.m3762a(iM4961m), "utf16_size: " + ClassK.m5480a(iM4961m));
            interfaceC1303a.mo5403a(c1307eM4959k.m5436a() + 1, this.f2418a.m4957i());
        }
        interfaceC1303a.mo5458e(iM4961m);
        interfaceC1303a.mo5451a(c1307eM4959k);
        interfaceC1303a.mo3755a(0);
    }

    @Override
    public String mo4474b() {
        return this.f2418a.m4957i();
    }
}
