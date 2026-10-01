package com.a.b.g;

import java.io.FilterWriter;
import java.io.Writer;

public final class ClassL extends FilterWriter {

    private final String f3491a;

    private final int f3492b;

    private final int f3493c;

    private int f3494d;

    private boolean f3495e;

    private int f3496f;

    public ClassL(Writer writer, int i) {
        this(writer, i, "");
    }

    public ClassL(Writer writer, int i, String str) {
        super(writer);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        if (str == null) {
            throw new NullPointerException("prefix == null");
        }
        this.f3492b = i != 0 ? i : Integer.MAX_VALUE;
        this.f3493c = i >> 1;
        this.f3491a = str.length() == 0 ? null : str;
        m5492a();
    }

    private void m5492a() {
        this.f3494d = 0;
        this.f3495e = this.f3493c != 0;
        this.f3496f = 0;
    }

    @Override
    public void write(int i) {
        synchronized (this.lock) {
            if (this.f3495e) {
                if (i == 32) {
                    this.f3496f++;
                    if (this.f3496f >= this.f3493c) {
                        this.f3496f = this.f3493c;
                        this.f3495e = false;
                    }
                } else {
                    this.f3495e = false;
                }
            }
            if (this.f3494d == this.f3492b && i != 10) {
                this.out.write(10);
                this.f3494d = 0;
            }
            if (this.f3494d == 0) {
                if (this.f3491a != null) {
                    this.out.write(this.f3491a);
                }
                if (!this.f3495e) {
                    for (int i2 = 0; i2 < this.f3496f; i2++) {
                        this.out.write(32);
                    }
                    this.f3494d = this.f3496f;
                }
            }
            this.out.write(i);
            if (i == 10) {
                m5492a();
            } else {
                this.f3494d++;
            }
        }
    }

    @Override
    public void write(String str, int i, int i2) {
        synchronized (this.lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }

    @Override
    public void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }
}
