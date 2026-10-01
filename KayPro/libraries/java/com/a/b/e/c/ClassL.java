package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassL extends Abstractu {

    public static final ClassL f3164a = new ClassL(Double.doubleToLongBits(0.0d));

    public static final ClassL f3165b = new ClassL(Double.doubleToLongBits(1.0d));

    private ClassL(long j) {
        super(j);
    }

    public static ClassL m4997a(long j) {
        return new ClassL(j);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3253d;
    }

    @Override
    public String mo3828d() {
        return Double.toString(Double.longBitsToDouble(mo5017k()));
    }

    @Override
    public String mo4943h() {
        return "double";
    }

    public String toString() {
        long jK = mo5017k();
        return "double{0x" + ClassK.m5481a(jK) + " / " + Double.longBitsToDouble(jK) + '}';
    }
}
