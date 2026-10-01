package com.a.b.g;

import java.util.Arrays;

public final class ClassE {

    private final byte[] f3473a;

    private final int f3474b;

    private final int f3475c;

    public ClassE(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassE(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f3473a = bArr;
        this.f3474b = i;
        this.f3475c = i2 - i;
    }

    private void m5431b(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f3475c) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + this.f3475c);
        }
    }

    private int m5434g(int i) {
        return this.f3473a[this.f3474b + i];
    }

    public int m5435h(int i) {
        return this.f3473a[this.f3474b + i] & 255;
    }

    public int m5436a() {
        return this.f3475c;
    }

    public int m5437a(int i) {
        m5431b(i, i + 1);
        return m5434g(i);
    }

    public ClassE m5438a(int i, int i2) {
        m5431b(i, i2);
        return new ClassE(Arrays.copyOfRange(this.f3473a, i, i2));
    }

    public void m5439a(byte[] bArr, int i) {
        if (bArr.length - i < this.f3475c) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f3473a, this.f3474b, bArr, i, this.f3475c);
    }

    public int m5440b(int i) {
        m5431b(i, i + 2);
        return (m5434g(i) << 8) | m5435h(i + 1);
    }

    public ClassF m5441b() {
        return new ClassF(m5443c());
    }

    public int m5442c(int i) {
        m5431b(i, i + 4);
        return (m5434g(i) << 24) | (m5435h(i + 1) << 16) | (m5435h(i + 2) << 8) | m5435h(i + 3);
    }

    public ClassG m5443c() {
        return new ClassG(this);
    }

    public long m5444d(int i) {
        m5431b(i, i + 8);
        return (((long) ((((m5434g(i) << 24) | (m5435h(i + 1) << 16)) | (m5435h(i + 2) << 8)) | m5435h(i + 3))) << 32) | (((long) ((m5434g(i + 4) << 24) | (m5435h(i + 5) << 16) | (m5435h(i + 6) << 8) | m5435h(i + 7))) & 4294967295L);
    }

    public int m5445e(int i) {
        m5431b(i, i + 1);
        return m5435h(i);
    }

    public int m5446f(int i) {
        m5431b(i, i + 2);
        return (m5435h(i) << 8) | m5435h(i + 1);
    }
}
