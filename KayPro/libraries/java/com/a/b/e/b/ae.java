package com.a.b.e.b;

import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassN;

public final class ae extends Abstractj {

    private final ClassN f3053a;

    public ae(aa c1167aa, ad c1170ad, ClassU c1194u, ClassX c1197x, ClassN c1316n) {
        super(c1167aa, c1170ad, c1194u, c1197x);
        if (c1167aa.m4740d() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c1316n == null) {
            throw new NullPointerException("cases == null");
        }
        this.f3053a = c1316n;
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ae(m4840f(), m4841g(), c1194u, c1197x, this.f3053a);
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public String mo4804a() {
        return this.f3053a.toString();
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4301a(this);
    }

    @Override
    public boolean mo4806a(Abstractj abstractC1183j) {
        return false;
    }

    @Override
    public Interfacee mo4807b() {
        return ClassB.f3210a;
    }

    public ClassN m4808c() {
        return this.f3053a;
    }
}
