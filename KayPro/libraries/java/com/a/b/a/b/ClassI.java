package com.a.b.a.b;

import com.a.b.e.c.ae;

public class ClassI {

    private final int f1865a;

    private final int f1866b;

    private final int f1867c;

    private final ae f1868d;

    public ClassI(int i, int i2, int i3, ae c1205ae) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f1865a = i;
        this.f1866b = i2;
        this.f1867c = i3;
        this.f1868d = c1205ae;
    }

    public int m3977a() {
        return this.f1865a;
    }

    public boolean m3978a(int i) {
        return i >= this.f1865a && i < this.f1866b;
    }

    public int m3979b() {
        return this.f1866b;
    }

    public int m3980c() {
        return this.f1867c;
    }

    public ae m3981d() {
        return this.f1868d != null ? this.f1868d : ae.f3130a;
    }
}
