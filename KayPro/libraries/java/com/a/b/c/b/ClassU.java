package com.a.b.c.b;

import com.a.b.e.b.ClassU;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;

public class ClassU implements Comparable {

    private final int f2323a;

    private final Enumt f2324b;

    private final ClassU f2325c;

    private final ae f2326d;

    public ClassU(int i, Enumt enumC1052t, ClassU c1194u) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC1052t == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c1194u.m4896i() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f2323a = i;
            this.f2324b = enumC1052t;
            this.f2325c = c1194u;
            this.f2326d = ae.m4964b(c1194u.mo3825a());
        } catch (NullPointerException e) {
            throw new NullPointerException("spec == null");
        }
    }

    public int m4433a() {
        return this.f2323a;
    }

    @Override
    public int compareTo(ClassU c1053u) {
        if (this.f2323a < c1053u.f2323a) {
            return -1;
        }
        if (this.f2323a > c1053u.f2323a) {
            return 1;
        }
        boolean zM4439c = m4439c();
        if (zM4439c != c1053u.m4439c()) {
            return !zM4439c ? -1 : 1;
        }
        return this.f2325c.compareTo(c1053u.f2325c);
    }

    public ClassU m4435a(Enumt enumC1052t) {
        return enumC1052t == this.f2324b ? this : new ClassU(this.f2323a, enumC1052t, this.f2325c);
    }

    public boolean m4436a(ClassU c1194u) {
        return this.f2325c.m4889a(c1194u);
    }

    public Enumt m4437b() {
        return this.f2324b;
    }

    public boolean m4438b(ClassU c1053u) {
        return m4436a(c1053u.f2325c);
    }

    public boolean m4439c() {
        return this.f2324b == Enumt.START;
    }

    public ad m4440d() {
        return this.f2325c.m4896i().m4860a();
    }

    public ad m4441e() {
        return this.f2325c.m4896i().m4861b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassU) && compareTo((ClassU) obj) == 0;
    }

    public ae m4442f() {
        return this.f2326d;
    }

    public int m4443g() {
        return this.f2325c.m4894g();
    }

    public ClassU m4444h() {
        return this.f2325c;
    }

    public String toString() {
        return String.valueOf(Integer.toHexString(this.f2323a)) + " " + this.f2324b + " " + this.f2325c;
    }
}
