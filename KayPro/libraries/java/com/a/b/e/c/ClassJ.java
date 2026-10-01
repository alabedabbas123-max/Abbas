package com.a.b.e.c;

import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassC;

public class ClassJ extends Abstracta {

    private final ClassR f3161a;

    private final int f3162b;

    ClassJ(ClassR c1225r, int i) {
        if (c1225r == null) {
            throw new NullPointerException("invokeDynamic == null");
        }
        this.f3161a = c1225r;
        this.f3162b = i;
    }

    public ClassA m4992a() {
        return this.f3161a.m5011f();
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        ClassJ c1217j = (ClassJ) abstractC1200a;
        int iA = this.f3161a.compareTo(c1217j.f3161a);
        return iA != 0 ? iA : this.f3162b - c1217j.f3162b;
    }

    public ClassC m4993b() {
        return this.f3161a.m5012i();
    }

    public ClassI m4994c() {
        return this.f3161a.m5014k();
    }

    @Override
    public String mo3828d() {
        return m4994c().mo3828d();
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "CallSiteRef";
    }

    public String toString() {
        return m4994c().toString();
    }
}
