package com.a.b.c.c;

import java.util.Comparator;

class ClassB implements Comparator {
    private ClassB() {
    }

    ClassB(ClassB c1086b) {
        this();
    }

    @Override
    public int compare(ClassA c1059a, ClassA c1059a2) {
        int iG = c1059a.f2340c.m4489g();
        int iG2 = c1059a2.f2340c.m4489g();
        if (iG < iG2) {
            return -1;
        }
        return iG > iG2 ? 1 : 0;
    }
}
