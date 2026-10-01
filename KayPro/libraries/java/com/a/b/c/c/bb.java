package com.a.b.c.c;

import com.a.b.e.c.ad;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class bb extends Abstractaf implements Comparable {

    private final ad f2419a;

    private ba f2420b;

    public bb(ad c1204ad) {
        if (c1204ad == null) {
            throw new NullPointerException("value == null");
        }
        this.f2419a = c1204ad;
        this.f2420b = null;
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_STRING_ID_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        if (this.f2420b == null) {
            aq c1076aqM4673c = c1113t.m4673c();
            this.f2420b = new ba(this.f2419a);
            c1076aqM4673c.m4511a((Abstractat) this.f2420b);
        }
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iE = this.f2420b.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + this.f2419a.m4956a(100));
            interfaceC1303a.mo5403a(4, "  string_data_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iE);
    }

    public ad m4555c() {
        return this.f2419a;
    }

    @Override
    public int compareTo(Object obj) {
        return this.f2419a.compareTo(((bb) obj).f2419a);
    }

    @Override
    public int mo4484e_() {
        return 4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bb) {
            return this.f2419a.equals(((bb) obj).f2419a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2419a.hashCode();
    }
}
