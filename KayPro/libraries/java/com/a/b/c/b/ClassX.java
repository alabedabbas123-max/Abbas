package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.Abstractag;

public final class ClassX extends Abstractao {

    private final ClassU f2333a;

    public ClassX(ad c1170ad, ClassU c1194u) {
        super(c1170ad);
        if (c1194u == null) {
            throw new NullPointerException("local == null");
        }
        this.f2333a = c1194u;
    }

    public static String m4456a(ClassU c1194u) {
        return String.valueOf(c1194u.m4900m()) + ' ' + c1194u.m4896i().toString() + ": " + c1194u.m4895h().mo3828d();
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassX(m4380k(), this.f2333a);
    }

    @Override
    public Abstractl mo4371a(Abstractag abstractC1261ag) {
        return new ClassX(m4380k(), abstractC1261ag.mo5080a(this.f2333a));
    }

    @Override
    protected String mo4231a(boolean z) {
        return "local-start " + m4456a(this.f2333a);
    }

    @Override
    protected String mo4233b() {
        return this.f2333a.toString();
    }

    public ClassU m4457c() {
        return this.f2333a;
    }

    @Override
    public Abstractl mo4329d(int i) {
        return new ClassX(m4380k(), this.f2333a.m4893c(i));
    }
}
