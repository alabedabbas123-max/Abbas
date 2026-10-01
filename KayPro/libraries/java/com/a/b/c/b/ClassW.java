package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.ClassZ;
import com.a.b.f.Abstractag;

public final class ClassW extends Abstractao {

    private final ClassZ f2332a;

    public ClassW(ad c1170ad, ClassZ c1199z) {
        super(c1170ad);
        if (c1199z == null) {
            throw new NullPointerException("locals == null");
        }
        this.f2332a = c1199z;
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassW(m4380k(), this.f2332a);
    }

    @Override
    public Abstractl mo4371a(Abstractag abstractC1261ag) {
        return new ClassW(m4380k(), abstractC1261ag.m5185a(this.f2332a));
    }

    @Override
    protected String mo4231a(boolean z) {
        int iM4937d = this.f2332a.m4937d();
        int iM4933b = this.f2332a.m4933b();
        StringBuilder sb = new StringBuilder((iM4937d * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < iM4933b; i++) {
            ClassU c1194uM4928a = this.f2332a.m4928a(i);
            if (c1194uM4928a != null) {
                sb.append("\n  ");
                sb.append(ClassX.m4456a(c1194uM4928a));
            }
        }
        return sb.toString();
    }

    @Override
    protected String mo4233b() {
        return this.f2332a.toString();
    }

    public ClassZ m4455c() {
        return this.f2332a;
    }

    @Override
    public Abstractl mo4329d(int i) {
        return new ClassW(m4380k(), this.f2332a.m4935b(i));
    }
}
