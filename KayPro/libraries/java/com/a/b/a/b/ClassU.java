package com.a.b.a.b;

import com.a.b.e.b.ClassO;
import com.a.b.e.c.ad;
import com.a.b.e.d.ClassC;

public class ClassU {

    private final int f1894a;

    private final int f1895b;

    private final ad f1896c;

    private final ad f1897d;

    private final ad f1898e;

    private final int f1899f;

    public ClassU(int i, int i2, ad c1204ad, ad c1204ad2, ad c1204ad3, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c1204ad == null) {
            throw new NullPointerException("name == null");
        }
        if (c1204ad2 == null && c1204ad3 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f1894a = i;
        this.f1895b = i2;
        this.f1896c = c1204ad;
        this.f1897d = c1204ad2;
        this.f1898e = c1204ad3;
        this.f1899f = i3;
    }

    public ad m4056c() {
        return this.f1898e;
    }

    public ClassU m4057a(ad c1204ad) {
        return new ClassU(this.f1894a, this.f1895b, this.f1896c, this.f1897d, c1204ad, this.f1899f);
    }

    public ClassO m4058a() {
        return ClassO.m4857a(this.f1896c, this.f1898e);
    }

    public boolean m4059a(int i, int i2) {
        return i2 == this.f1899f && i >= this.f1894a && i < this.f1894a + this.f1895b;
    }

    public boolean m4060a(ClassU c0949u) {
        return this.f1894a == c0949u.f1894a && this.f1895b == c0949u.f1895b && this.f1899f == c0949u.f1899f && this.f1896c.equals(c0949u.f1896c);
    }

    public ClassC m4061b() {
        return ClassC.m5056a(this.f1897d.m4958j());
    }
}
