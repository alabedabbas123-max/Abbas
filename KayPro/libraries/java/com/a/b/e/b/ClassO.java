package com.a.b.e.b;

import com.a.b.e.c.ad;

public class ClassO implements Comparable {

    private final ad f3095a;

    private final ad f3096b;

    private ClassO(ad c1204ad, ad c1204ad2) {
        this.f3095a = c1204ad;
        this.f3096b = c1204ad2;
    }

    public static ClassO m4857a(ad c1204ad, ad c1204ad2) {
        if (c1204ad == null && c1204ad2 == null) {
            return null;
        }
        return new ClassO(c1204ad, c1204ad2);
    }

    private static int m4858b(ad c1204ad, ad c1204ad2) {
        if (c1204ad == c1204ad2) {
            return 0;
        }
        if (c1204ad == null) {
            return -1;
        }
        if (c1204ad2 == null) {
            return 1;
        }
        return c1204ad.compareTo(c1204ad2);
    }

    @Override
    public int compareTo(ClassO c1188o) {
        int iM4858b = m4858b(this.f3095a, c1188o.f3095a);
        return iM4858b != 0 ? iM4858b : m4858b(this.f3096b, c1188o.f3096b);
    }

    public ad m4860a() {
        return this.f3095a;
    }

    public ad m4861b() {
        return this.f3096b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassO) && compareTo((ClassO) obj) == 0;
    }

    public int hashCode() {
        return ((this.f3095a == null ? 0 : this.f3095a.hashCode()) * 31) + (this.f3096b != null ? this.f3096b.hashCode() : 0);
    }

    public String toString() {
        if (this.f3095a != null && this.f3096b == null) {
            return this.f3095a.m4957i();
        }
        if (this.f3095a == null && this.f3096b == null) {
            return "";
        }
        return "[" + (this.f3095a == null ? "" : this.f3095a.m4957i()) + "|" + (this.f3096b == null ? "" : this.f3096b.m4957i());
    }
}
