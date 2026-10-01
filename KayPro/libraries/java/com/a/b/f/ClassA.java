package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.g.ClassN;

public class ClassA extends Abstractag {

    private final ClassN f3283a;

    private int f3284b;

    public ClassA(int i) {
        this.f3283a = new ClassN(i);
    }

    @Override
    public int mo5078a() {
        return this.f3284b;
    }

    public int m5079a(int i) {
        if (i >= this.f3283a.m5496b()) {
            return -1;
        }
        return this.f3283a.m5497b(i);
    }

    @Override
    public ClassU mo5080a(ClassU c1194u) {
        int iM5497b;
        if (c1194u == null) {
            return null;
        }
        try {
            iM5497b = this.f3283a.m5497b(c1194u.m4894g());
        } catch (IndexOutOfBoundsException e) {
            iM5497b = -1;
        }
        if (iM5497b < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c1194u.m4890b(iM5497b);
    }

    public void mo5081a(int i, int i2, int i3) {
        if (i >= this.f3283a.m5496b()) {
            for (int iM5496b = i - this.f3283a.m5496b(); iM5496b >= 0; iM5496b--) {
                this.f3283a.m5499c(-1);
            }
        }
        this.f3283a.m5498b(i, i2);
        if (this.f3284b < i2 + i3) {
            this.f3284b = i2 + i3;
        }
    }
}
