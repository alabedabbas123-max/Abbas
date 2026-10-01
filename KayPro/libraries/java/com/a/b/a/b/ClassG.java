package com.a.b.a.b;

import com.a.b.g.ClassK;
import com.a.b.g.ClassQ;
import com.a.b.g.Interfacep;

public final class ClassG extends ClassQ {
    public ClassG(int i) {
        super(i);
    }

    public ClassF m3966a(int i) {
        return (ClassF) m5477e(i);
    }

    public void m3967a(int i, ClassF c0934f) {
        super.m5513a(i, (Interfacep) c0934f);
    }

    public ClassF m3968b(int i) {
        int iC = m5514c(i);
        if (iC < 0) {
            throw new IllegalArgumentException("no such label: " + ClassK.m5485c(i));
        }
        return m3966a(iC);
    }
}
