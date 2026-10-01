package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;

public final class am extends Abstractp {

    private ClassH f2056a;

    public am(ClassN c1046n, ad c1170ad, ClassX c1197x, ClassH c1040h) {
        super(c1046n, c1170ad, c1197x);
        if (c1040h == null) {
            throw new NullPointerException("target == null");
        }
        this.f2056a = c1040h;
    }

    public am m4324a(ClassH c1040h) {
        return new am(m4379j().m4399g(), m4380k(), m4381l(), c1040h);
    }

    @Override
    public Abstractl mo4312a(ClassN c1046n) {
        return new am(c1046n, m4380k(), m4381l(), this.f2056a);
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new am(m4379j(), m4380k(), c1197x, this.f2056a);
    }

    @Override
    protected String mo4233b() {
        return this.f2056a == null ? "????" : this.f2056a.m4384o();
    }

    public ClassH m4325c() {
        return this.f2056a;
    }

    public int m4326d() {
        return this.f2056a.m4378i();
    }

    public int m4327e() {
        return this.f2056a.m4378i() - m4378i();
    }

    public boolean m4328q() {
        return m4377h() && this.f2056a.m4377h();
    }
}
