package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassO extends Abstractt {

    public static final ClassO f3167a = m5000a(Float.floatToIntBits(0.0f));

    public static final ClassO f3168b = m5000a(Float.floatToIntBits(1.0f));

    public static final ClassO f3169c = m5000a(Float.floatToIntBits(2.0f));

    private ClassO(int i) {
        super(i);
    }

    public static ClassO m5000a(int i) {
        return new ClassO(i);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3254e;
    }

    @Override
    public String mo3828d() {
        return Float.toString(Float.intBitsToFloat(mo5016j()));
    }

    @Override
    public String mo4943h() {
        return "float";
    }

    public String toString() {
        int iJ = mo5016j();
        return "float{0x" + ClassK.m5480a(iJ) + " / " + Float.intBitsToFloat(iJ) + '}';
    }
}
