package com.a.b.e.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;

public final class af extends Abstractf {

    private final Interfacee f3054a;

    public af(aa c1167aa, ad c1170ad, ClassX c1197x, Interfacee interfaceC1238e, Abstracta abstractC1200a) {
        super(c1167aa, c1170ad, null, c1197x, abstractC1200a);
        if (c1167aa.m4740d() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f3054a = interfaceC1238e;
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new af(m4840f(), m4841g(), c1197x, this.f3054a, m4833g_());
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        return new af(m4840f(), m4841g(), m4844j(), this.f3054a.mo4146a(c1236c), m4833g_());
    }

    @Override
    public String mo4804a() {
        Abstracta abstractC1200aG_ = m4833g_();
        return String.valueOf(abstractC1200aG_ instanceof ad ? ((ad) abstractC1200aG_).m4957i() : abstractC1200aG_.mo3828d()) + " " + ag.m4809a(this.f3054a);
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4302a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return this.f3054a;
    }
}
