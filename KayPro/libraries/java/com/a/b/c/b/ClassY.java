package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.g.ClassK;

public final class ClassY extends Abstractp {

    private final Abstracta[] f2334a;

    private final int[] f2335b;

    private int f2336c;

    public ClassY(ClassN c1046n, ad c1170ad, ClassX c1197x, Abstracta[] abstractC1200aArr) {
        super(c1046n, c1170ad, c1197x);
        if (abstractC1200aArr == null) {
            throw new NullPointerException("constants == null");
        }
        this.f2334a = abstractC1200aArr;
        this.f2335b = new int[abstractC1200aArr.length];
        for (int i = 0; i < this.f2335b.length; i++) {
            if (abstractC1200aArr[i] == null) {
                throw new NullPointerException("constants[i] == null");
            }
            this.f2335b[i] = -1;
        }
        this.f2336c = -1;
    }

    private ClassY(ClassN c1046n, ad c1170ad, ClassX c1197x, Abstracta[] abstractC1200aArr, int[] iArr, int i) {
        super(c1046n, c1170ad, c1197x);
        this.f2334a = abstractC1200aArr;
        this.f2335b = iArr;
        this.f2336c = i;
    }

    @Override
    public Abstractl mo4312a(ClassN c1046n) {
        return new ClassY(c1046n, m4380k(), m4381l(), this.f2334a, this.f2335b, this.f2336c);
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassY(m4379j(), m4380k(), c1197x, this.f2334a, this.f2335b, this.f2336c);
    }

    public Abstracta m4458a(int i) {
        return this.f2334a[i];
    }

    public void m4459a(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (m4463e(i)) {
            throw new IllegalStateException("index already set");
        }
        this.f2335b[i] = i2;
    }

    public int m4460b(int i) {
        if (m4463e(i)) {
            return this.f2335b[i];
        }
        throw new IllegalStateException("index not yet set for constant " + i + " value = " + this.f2334a[i]);
    }

    @Override
    protected String mo4233b() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f2334a.length; i++) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.f2334a[i].mo3828d());
        }
        return sb.toString();
    }

    public int m4461c() {
        return this.f2334a.length;
    }

    public boolean m4462d() {
        return this.f2336c != -1;
    }

    public boolean m4463e(int i) {
        return this.f2335b[i] != -1;
    }

    @Override
    public String mo4356f() {
        return mo4233b();
    }

    public void m4464f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (m4462d()) {
            throw new IllegalStateException("class index already set");
        }
        this.f2336c = i;
    }

    @Override
    public String mo4357g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f2334a.length; i++) {
            if (!m4463e(i)) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4458a(i).mo4943h());
            sb.append('@');
            int iM4460b = m4460b(i);
            if (iM4460b < 65536) {
                sb.append(ClassK.m5485c(iM4460b));
            } else {
                sb.append(ClassK.m5480a(iM4460b));
            }
        }
        return sb.toString();
    }
}
