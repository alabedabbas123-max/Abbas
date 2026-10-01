package com.a.b.e.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;

public final class ClassR extends Abstractf {
    public ClassR(aa c1167aa, ad c1170ad, ClassU c1194u, ClassX c1197x, Abstracta abstractC1200a) {
        super(c1167aa, c1170ad, c1194u, c1197x, abstractC1200a);
        if (c1167aa.m4740d() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
        }
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ClassR(m4840f(), m4841g(), c1194u, c1197x, m4833g_());
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4300a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return ClassB.f3210a;
    }
}
