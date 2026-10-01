package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ac extends Abstractt {

    public static final ac f3126a = m4952a((short) 0);

    private ac(short s) {
        super(s);
    }

    public static ac m4951a(int i) {
        short s = (short) i;
        if (s != i) {
            throw new IllegalArgumentException("bogus short value: " + i);
        }
        return m4952a(s);
    }

    public static ac m4952a(short s) {
        return new ac(s);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3257h;
    }

    @Override
    public String mo3828d() {
        return Integer.toString(mo5016j());
    }

    @Override
    public String mo4943h() {
        return "short";
    }

    public String toString() {
        int iJ = mo5016j();
        return "short{0x" + ClassK.m5485c(iJ) + " / " + iJ + '}';
    }
}
