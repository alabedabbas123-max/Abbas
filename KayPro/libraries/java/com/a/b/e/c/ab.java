package com.a.b.e.c;

import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassC;

public final class ab extends Abstractag {

    private final ClassA f3125a;

    public ab(ClassA c1234a) {
        this.f3125a = c1234a;
    }

    public static ab m4949a(ad c1204ad) {
        return new ab(ClassA.m5036b(c1204ad.m4958j()));
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3265p;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return this.f3125a.compareTo(((ab) abstractC1200a).m4950i());
    }

    @Override
    public String mo3828d() {
        return this.f3125a.m5040a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ab) {
            return m4950i().equals(((ab) obj).m4950i());
        }
        return false;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "proto";
    }

    public int hashCode() {
        return this.f3125a.hashCode();
    }

    public ClassA m4950i() {
        return this.f3125a;
    }

    public final String toString() {
        return String.valueOf(mo4943h()) + "{" + mo3828d() + '}';
    }
}
