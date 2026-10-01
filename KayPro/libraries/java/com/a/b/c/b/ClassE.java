package com.a.b.c.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ae;

public class ClassE implements Comparable {

    private final ae f2061a;

    private final int f2062b;

    public ClassE(ae c1205ae, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        if (c1205ae == null) {
            throw new NullPointerException("exceptionType == null");
        }
        this.f2062b = i;
        this.f2061a = c1205ae;
    }

    @Override
    public int compareTo(ClassE c1037e) {
        if (this.f2062b < c1037e.f2062b) {
            return -1;
        }
        if (this.f2062b > c1037e.f2062b) {
            return 1;
        }
        return this.f2061a.compareTo((Abstracta) c1037e.f2061a);
    }

    public ae m4341a() {
        return this.f2061a;
    }

    public int m4342b() {
        return this.f2062b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassE) && compareTo((ClassE) obj) == 0;
    }

    public int hashCode() {
        return (this.f2062b * 31) + this.f2061a.hashCode();
    }
}
