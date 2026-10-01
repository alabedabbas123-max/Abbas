package org.c.a.a.b.a.a;

public class ClassW {

    protected int f5538a;

    protected int f5539b;

    protected int f5540c;

    protected int f5541d;

    protected int f5542e;

    public ClassW(int i, int i2, int i3, int i4, int i5) {
        this.f5538a = i;
        this.f5539b = i2;
        this.f5540c = i3;
        this.f5541d = i4;
        this.f5542e = i5;
    }

    public int m7654a() {
        return this.f5539b;
    }

    public int m7655b() {
        return this.f5540c;
    }

    public int m7656c() {
        return this.f5541d;
    }

    public int m7657d() {
        return this.f5542e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassW c1858w = (ClassW) obj;
        return this.f5539b == c1858w.f5539b && this.f5540c == c1858w.f5540c;
    }

    public int hashCode() {
        return (this.f5539b * 31) + this.f5540c;
    }

    public String toString() {
        return "CodeException{index=" + this.f5538a + ", startPc=" + this.f5539b + ", endPc=" + this.f5540c + ", handlerPc=" + this.f5541d + ", catchType=" + this.f5542e + "}";
    }
}
