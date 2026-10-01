package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassK extends Abstractt {

    public static final ClassK f3163a = m4995a((char) 0);

    private ClassK(char c) {
        super(c);
    }

    public static ClassK m4995a(char c) {
        return new ClassK(c);
    }

    public static ClassK m4996a(int i) {
        char c = (char) i;
        if (c != i) {
            throw new IllegalArgumentException("bogus char value: " + i);
        }
        return m4995a(c);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3252c;
    }

    @Override
    public String mo3828d() {
        return Integer.toString(mo5016j());
    }

    @Override
    public String mo4943h() {
        return "char";
    }

    public String toString() {
        int iJ = mo5016j();
        return "char{0x" + ClassK.m5485c(iJ) + " / " + iJ + '}';
    }
}
