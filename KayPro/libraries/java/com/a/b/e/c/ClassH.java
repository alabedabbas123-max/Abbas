package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassH extends Abstractt {

    public static final ClassH f3160a = m4989a((byte) 0);

    private ClassH(byte b) {
        super(b);
    }

    public static ClassH m4989a(byte b) {
        return new ClassH(b);
    }

    public static ClassH m4990a(int i) {
        byte b = (byte) i;
        if (b != i) {
            throw new IllegalArgumentException("bogus byte value: " + i);
        }
        return m4989a(b);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3251b;
    }

    @Override
    public String mo3828d() {
        return Integer.toString(mo5016j());
    }

    @Override
    public String mo4943h() {
        return "byte";
    }

    public String toString() {
        int iJ = mo5016j();
        return "byte{0x" + ClassK.m5487e(iJ) + " / " + iJ + '}';
    }
}
