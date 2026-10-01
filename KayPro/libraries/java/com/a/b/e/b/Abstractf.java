package com.a.b.e.b;

import com.a.b.e.c.Abstracta;

public abstract class Abstractf extends Abstractj {

    private final Abstracta f3062a;

    public Abstractf(aa c1167aa, ad c1170ad, ClassU c1194u, ClassX c1197x, Abstracta abstractC1200a) {
        super(c1167aa, c1170ad, c1194u, c1197x);
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        this.f3062a = abstractC1200a;
    }

    @Override
    public String mo4804a() {
        return this.f3062a.mo3828d();
    }

    @Override
    public boolean mo4806a(Abstractj abstractC1183j) {
        return super.mo4806a(abstractC1183j) && this.f3062a.equals(((Abstractf) abstractC1183j).m4833g_());
    }

    public Abstracta m4833g_() {
        return this.f3062a;
    }
}
