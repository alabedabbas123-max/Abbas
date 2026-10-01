package com.a.b.c.b;

import com.a.b.d.ClassB;
import com.a.b.d.ClassD;

public final class ClassN {

    private final int f2083a;

    private final int f2084b;

    private final int f2085c;

    private final Abstractr f2086d;

    private final boolean f2087e;

    public ClassN(int i, int i2, int i3, Abstractr abstractC1050r, boolean z) {
        if (!ClassD.m4706a(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!ClassD.m4706a(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!ClassD.m4706a(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC1050r == null) {
            throw new NullPointerException("format == null");
        }
        this.f2083a = i;
        this.f2084b = i2;
        this.f2085c = i3;
        this.f2086d = abstractC1050r;
        this.f2087e = z;
    }

    public int m4393a() {
        return this.f2083a;
    }

    public int m4394b() {
        return this.f2084b;
    }

    public Abstractr m4395c() {
        return this.f2086d;
    }

    public boolean m4396d() {
        return this.f2087e;
    }

    public String m4397e() {
        return ClassB.m4703b(this.f2083a);
    }

    public int m4398f() {
        return this.f2085c;
    }

    public ClassN m4399g() {
        switch (this.f2083a) {
            case 50:
                return ClassO.f2141aa;
            case 51:
                return ClassO.f2113Z;
            case 52:
                return ClassO.f2143ac;
            case 53:
                return ClassO.f2142ab;
            case 54:
                return ClassO.f2145ae;
            case 55:
                return ClassO.f2144ad;
            case 56:
                return ClassO.f2147ag;
            case 57:
                return ClassO.f2146af;
            case 58:
                return ClassO.f2149ai;
            case 59:
                return ClassO.f2148ah;
            case 60:
                return ClassO.f2151ak;
            case 61:
                return ClassO.f2150aj;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }

    public String toString() {
        return m4397e();
    }
}
