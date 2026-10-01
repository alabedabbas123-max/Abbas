package com.a.b.c.b;

public class ClassG implements Comparable {

    private final int f2064a;

    private final int f2065b;

    private final ClassD f2066c;

    public ClassG(int i, int i2, ClassD c1036d) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c1036d.m5516b_()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f2064a = i;
        this.f2065b = i2;
        this.f2066c = c1036d;
    }

    public int m4346a() {
        return this.f2064a;
    }

    @Override
    public int compareTo(ClassG c1039g) {
        if (this.f2064a < c1039g.f2064a) {
            return -1;
        }
        if (this.f2064a > c1039g.f2064a) {
            return 1;
        }
        if (this.f2065b < c1039g.f2065b) {
            return -1;
        }
        if (this.f2065b > c1039g.f2065b) {
            return 1;
        }
        return this.f2066c.compareTo(c1039g.f2066c);
    }

    public int m4348b() {
        return this.f2065b;
    }

    public ClassD m4349c() {
        return this.f2066c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassG) && compareTo((ClassG) obj) == 0;
    }

    public int hashCode() {
        return (((this.f2064a * 31) + this.f2065b) * 31) + this.f2066c.hashCode();
    }
}
