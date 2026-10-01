package com.a.b.a.b;

import com.a.b.g.ClassN;
import com.a.b.g.ClassT;

public final class ao extends ClassT {

    private final ClassN f1845a;

    private final ClassN f1846b;

    private int f1847c;

    public ao(int i) {
        super(true);
        this.f1845a = new ClassN(i);
        this.f1846b = new ClassN(i + 1);
        this.f1847c = i;
    }

    public int m3938a() {
        return this.f1847c;
    }

    public int m3939a(int i) {
        return this.f1845a.m5497b(i);
    }

    public void m3940a(int i, int i2) {
        m5518l();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f1845a.m5499c(i);
        this.f1846b.m5499c(i2);
    }

    public int m3941b() {
        return this.f1846b.m5497b(this.f1847c);
    }

    public int m3942b(int i) {
        return this.f1846b.m5497b(i);
    }

    public void m3943c(int i) {
        m5518l();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        if (this.f1846b.m5496b() != this.f1847c) {
            throw new RuntimeException("non-default elements not all set");
        }
        this.f1846b.m5499c(i);
    }

    @Override
    public void mo3944c_() {
        this.f1845a.mo3944c_();
        this.f1846b.mo3944c_();
        super.mo3944c_();
    }

    public ClassN m3945d() {
        return this.f1846b;
    }

    public ClassN m3946e() {
        return this.f1845a;
    }

    public void m3947f() {
        int i = 0;
        m5518l();
        int i2 = this.f1847c;
        if (i2 != this.f1846b.m5496b() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iM5497b = this.f1846b.m5497b(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM5497b2 = this.f1846b.m5497b(i3);
            if (iM5497b2 != iM5497b) {
                if (i3 != i) {
                    this.f1846b.m5498b(i, iM5497b2);
                    this.f1845a.m5498b(i, this.f1845a.m5497b(i3));
                }
                i++;
            }
        }
        if (i != i2) {
            this.f1845a.m5504e(i);
            this.f1846b.m5498b(i, iM5497b);
            this.f1846b.m5504e(i + 1);
            this.f1847c = i;
        }
    }
}
