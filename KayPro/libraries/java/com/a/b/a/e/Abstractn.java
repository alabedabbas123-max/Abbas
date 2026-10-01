package com.a.b.a.e;

import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;

public abstract class Abstractn implements Interfacef {

    private final ae f1948a;

    private final int f1949b;

    private final aa f1950c;

    private final Interfaceb f1951d;

    public Abstractn(ae c1205ae, int i, aa c1201aa, Interfaceb interfaceC0967b) {
        if (c1205ae == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c1201aa == null) {
            throw new NullPointerException("nat == null");
        }
        if (interfaceC0967b == null) {
            throw new NullPointerException("attributes == null");
        }
        this.f1948a = c1205ae;
        this.f1949b = i;
        this.f1950c = c1201aa;
        this.f1951d = interfaceC0967b;
    }

    @Override
    public final aa mo3999d() {
        return this.f1950c;
    }

    @Override
    public final ad mo4000e() {
        return this.f1950c.m4944a();
    }

    @Override
    public final ad mo4001f() {
        return this.f1950c.m4945b();
    }

    @Override
    public final int mo4002g() {
        return this.f1949b;
    }

    @Override
    public final Interfaceb mo4003h() {
        return this.f1951d;
    }

    @Override
    public final ae mo4004i() {
        return this.f1948a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f1950c.mo3828d());
        sb.append('}');
        return sb.toString();
    }
}
