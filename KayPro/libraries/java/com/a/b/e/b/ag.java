package com.a.b.e.b;

import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;

public final class ag extends Abstractj {

    private final Interfacee f3055a;

    public ag(aa c1167aa, ad c1170ad, ClassX c1197x, Interfacee interfaceC1238e) {
        super(c1167aa, c1170ad, null, c1197x);
        if (c1167aa.m4740d() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f3055a = interfaceC1238e;
    }

    public static String m4809a(Interfacee interfaceC1238e) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        for (int i = 0; i < iMo4148d_; i++) {
            sb.append(" ");
            sb.append(interfaceC1238e.mo4145a(i).mo3828d());
        }
        return sb.toString();
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ag(m4840f(), m4841g(), c1197x, this.f3055a);
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        return new ag(m4840f(), m4841g(), m4844j(), this.f3055a.mo4146a(c1236c));
    }

    @Override
    public String mo4804a() {
        return m4809a(this.f3055a);
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4303a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return this.f3055a;
    }
}
