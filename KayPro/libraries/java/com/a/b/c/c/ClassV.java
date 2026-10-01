package com.a.b.c.c;

import com.a.b.e.c.ClassD;
import com.a.b.g.ClassH;
import com.a.b.g.Interfacea;

public final class ClassV extends Abstractat {

    private final ClassD f2524a;

    private byte[] f2525b;

    public ClassV(ClassD c1211d) {
        super(1, -1);
        if (c1211d == null) {
            throw new NullPointerException("array == null");
        }
        this.f2524a = c1211d;
        this.f2525b = null;
    }

    @Override
    protected int mo4468a(Abstractat abstractC1079at) {
        return this.f2524a.compareTo(((ClassV) abstractC1079at).f2524a);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        ClassH c1310h = new ClassH();
        new bi(abstractC1083ax.m4540f(), c1310h).m4578a(this.f2524a, false);
        this.f2525b = c1310h.m5461f();
        m4520a(this.f2525b.length);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        bi.m4573a(c1113t, this.f2524a);
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        if (!interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5453a(this.f2525b);
        } else {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " encoded array");
            new bi(c1113t, interfaceC1303a).m4578a(this.f2524a, true);
        }
    }

    @Override
    public String mo4474b() {
        return this.f2524a.mo3828d();
    }

    public int hashCode() {
        return this.f2524a.hashCode();
    }
}
