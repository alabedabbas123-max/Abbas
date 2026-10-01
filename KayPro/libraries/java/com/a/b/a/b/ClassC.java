package com.a.b.a.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ab;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassW;
import com.a.b.e.c.ClassY;
import com.a.b.g.ClassJ;

public class ClassC extends ClassJ {
    public ClassC(int i) {
        super(i);
    }

    public Abstracta m3954a(int i) {
        return (Abstracta) m5477e(i);
    }

    public void m3955a(int i, Abstracta abstractC1200a) {
        if ((abstractC1200a instanceof ad) || (abstractC1200a instanceof ae) || (abstractC1200a instanceof ClassP) || (abstractC1200a instanceof ClassW) || (abstractC1200a instanceof ClassO) || (abstractC1200a instanceof ClassL) || (abstractC1200a instanceof ClassY) || (abstractC1200a instanceof ab)) {
            m5474a(i, (Object) abstractC1200a);
        } else {
            throw new IllegalArgumentException("bad type for bootstrap argument: " + abstractC1200a.getClass());
        }
    }
}
