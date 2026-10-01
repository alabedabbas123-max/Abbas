package com.a.b.f;

import com.a.b.e.c.Abstracta;
import java.util.Comparator;
import java.util.HashMap;

class ClassC implements Comparator {

    final ClassB f3402a;

    private final HashMap f3403b;

    ClassC(ClassB c1278b, HashMap map) {
        this.f3402a = c1278b;
        this.f3403b = map;
    }

    @Override
    public int compare(Abstracta abstractC1200a, Abstracta abstractC1200a2) {
        int iIntValue = ((Integer) this.f3403b.get(abstractC1200a2)).intValue() - ((Integer) this.f3403b.get(abstractC1200a)).intValue();
        return iIntValue == 0 ? abstractC1200a.compareTo(abstractC1200a2) : iIntValue;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }
}
