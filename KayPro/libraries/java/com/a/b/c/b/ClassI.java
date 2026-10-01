package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.g.ClassK;

public final class ClassI extends Abstractp {

    private final Abstracta f2068a;

    private int f2069b;

    private int f2070c;

    public ClassI(ClassN c1046n, ad c1170ad, ClassX c1197x, Abstracta abstractC1200a) {
        super(c1046n, c1170ad, c1197x);
        if (abstractC1200a == null) {
            throw new NullPointerException("constant == null");
        }
        this.f2068a = abstractC1200a;
        this.f2069b = -1;
        this.f2070c = -1;
    }

    @Override
    public Abstractl mo4312a(ClassN c1046n) {
        ClassI c1041i = new ClassI(c1046n, m4380k(), m4381l(), this.f2068a);
        if (this.f2069b >= 0) {
            c1041i.m4351a(this.f2069b);
        }
        if (this.f2070c >= 0) {
            c1041i.m4352b(this.f2070c);
        }
        return c1041i;
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        ClassI c1041i = new ClassI(m4379j(), m4380k(), c1197x, this.f2068a);
        if (this.f2069b >= 0) {
            c1041i.m4351a(this.f2069b);
        }
        if (this.f2070c >= 0) {
            c1041i.m4352b(this.f2070c);
        }
        return c1041i;
    }

    public void m4351a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f2069b >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f2069b = i;
    }

    @Override
    protected String mo4233b() {
        return this.f2068a.mo3828d();
    }

    public void m4352b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f2070c >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f2070c = i;
    }

    public Abstracta m4353c() {
        return this.f2068a;
    }

    public int m4354d() {
        if (this.f2069b < 0) {
            throw new IllegalStateException("index not yet set for " + this.f2068a);
        }
        return this.f2069b;
    }

    public boolean m4355e() {
        return this.f2069b >= 0;
    }

    @Override
    public String mo4356f() {
        return this.f2068a instanceof ad ? ((ad) this.f2068a).m4957i() : this.f2068a.mo3828d();
    }

    @Override
    public String mo4357g() {
        if (!m4355e()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(m4353c().mo4943h());
        sb.append('@');
        if (this.f2069b < 65536) {
            sb.append(ClassK.m5485c(this.f2069b));
        } else {
            sb.append(ClassK.m5480a(this.f2069b));
        }
        return sb.toString();
    }
}
