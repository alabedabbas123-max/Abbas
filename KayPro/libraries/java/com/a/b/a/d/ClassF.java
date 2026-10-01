package com.a.b.a.d;

import com.a.b.a.e.Interfacej;
import com.a.b.e.c.ae;
import com.a.b.e.c.af;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassE;

class ClassF implements Interfacee {

    private final ClassE f1936a;

    private final int f1937b;

    private final af f1938c;

    public ClassF(ClassE c1307e, int i, int i2, af c1206af, Interfacej interfaceC0975j) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        ClassE c1307eM5438a = c1307e.m5438a(i, (i2 * 2) + i);
        this.f1936a = c1307eM5438a;
        this.f1937b = i2;
        this.f1938c = c1206af;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            try {
                ae c1205ae = (ae) c1206af.mo4971a(c1307eM5438a.m5446f(i4));
                if (interfaceC0975j != null) {
                    interfaceC0975j.m4195a(c1307eM5438a, i4, 2, "  " + c1205ae);
                }
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override
    public ClassC mo4145a(int i) {
        return ((ae) this.f1938c.mo4971a(this.f1936a.m5446f(i * 2))).m4966i();
    }

    @Override
    public Interfacee mo4146a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public boolean mo4147b_() {
        return false;
    }

    @Override
    public int mo4148d_() {
        return this.f1937b;
    }
}
