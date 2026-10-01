package com.a.b.g;

import java.io.InputStream;

public class ClassG extends InputStream {

    final ClassE f3477a;

    private int f3478b = 0;

    private int f3479c = 0;

    public ClassG(ClassE c1307e) {
        this.f3477a = c1307e;
    }

    @Override
    public int available() {
        return this.f3477a.f3475c - this.f3478b;
    }

    @Override
    public void mark(int i) {
        this.f3479c = this.f3478b;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if (this.f3478b >= this.f3477a.f3475c) {
            return -1;
        }
        int iM5435h = this.f3477a.m5435h(this.f3478b);
        this.f3478b++;
        return iM5435h;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        int i3 = this.f3477a.f3475c - this.f3478b;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f3477a.f3473a, this.f3478b + this.f3477a.f3474b, bArr, i, i2);
        this.f3478b += i2;
        return i2;
    }

    @Override
    public void reset() {
        this.f3478b = this.f3479c;
    }
}
