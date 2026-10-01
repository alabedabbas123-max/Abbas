package com.a.b.a.b;

public class ClassS {

    private final int f1891a;

    private final int f1892b;

    public ClassS(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f1891a = i;
        this.f1892b = i2;
    }

    public int m4046a() {
        return this.f1891a;
    }

    public int m4047b() {
        return this.f1892b;
    }
}
