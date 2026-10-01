package com.a.b.a.b;

import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import com.a.b.g.Interfacep;

public final class ClassF implements Interfacep {

    private final int f1859a;

    private final int f1860b;

    private final int f1861c;

    private final ClassN f1862d;

    private final ClassH f1863e;

    public ClassF(int i, int i2, int i3, ClassN c1316n, ClassH c0936h) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c1316n == null) {
            throw new NullPointerException("targets == null");
        }
        int iM5496b = c1316n.m5496b();
        for (int i4 = 0; i4 < iM5496b; i4++) {
            if (c1316n.m5497b(i4) < 0) {
                throw new IllegalArgumentException("successors[" + i4 + "] == " + c1316n.m5497b(i4));
            }
        }
        if (c0936h == null) {
            throw new NullPointerException("catches == null");
        }
        this.f1859a = i;
        this.f1860b = i2;
        this.f1861c = i3;
        this.f1862d = c1316n;
        this.f1863e = c0936h;
    }

    @Override
    public int mo3961a() {
        return this.f1859a;
    }

    public int m3962b() {
        return this.f1860b;
    }

    public int m3963c() {
        return this.f1861c;
    }

    public ClassN m3964d() {
        return this.f1862d;
    }

    public ClassH m3965e() {
        return this.f1863e;
    }

    public String toString() {
        return String.valueOf('{') + ClassK.m5485c(this.f1859a) + ": " + ClassK.m5485c(this.f1860b) + ".." + ClassK.m5485c(this.f1861c) + '}';
    }
}
