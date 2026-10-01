package com.a.b.a.b;

import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;

public final class aa implements Interfaced {

    private final int f1779a;

    public aa(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f1779a = i;
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3260k;
    }

    @Override
    public Interfaced mo3826b() {
        return this;
    }

    @Override
    public int mo3827c() {
        return ClassC.f3260k.mo3827c();
    }

    @Override
    public String mo3828d() {
        return toString();
    }

    @Override
    public int mo3829e() {
        return ClassC.f3260k.mo3829e();
    }

    public boolean equals(Object obj) {
        return (obj instanceof aa) && this.f1779a == ((aa) obj).f1779a;
    }

    @Override
    public boolean mo3830f() {
        return false;
    }

    public int m3831g() {
        return this.f1779a;
    }

    public int hashCode() {
        return this.f1779a;
    }

    public String toString() {
        return "<addr:" + ClassK.m5485c(this.f1779a) + ">";
    }
}
