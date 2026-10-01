package com.a.b.c.c;

import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassI;
import com.a.b.g.ClassH;
import com.a.b.g.Interfacea;

public final class ClassI extends Abstractat {

    private final ClassI f2450a;

    private byte[] f2451b;

    public ClassI(ClassI c1216i) {
        super(1, m4600a(c1216i));
        this.f2450a = c1216i;
    }

    private static int m4600a(ClassI c1216i) {
        return -1;
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        ClassH c1310h = new ClassH();
        new bi(abstractC1083ax.m4540f(), c1310h).m4578a((ClassD) this.f2450a, true);
        this.f2451b = c1310h.m5461f();
        m4520a(this.f2451b.length);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        bi.m4573a(c1113t, this.f2450a);
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        if (!interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5453a(this.f2451b);
        } else {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " call site");
            new bi(c1113t, interfaceC1303a).m4578a((ClassD) this.f2450a, true);
        }
    }

    @Override
    public String mo4474b() {
        return this.f2450a.mo3828d();
    }

    public String toString() {
        return this.f2450a.toString();
    }
}
