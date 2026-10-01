package com.a.b.e.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import java.util.ArrayList;

public final class ClassI extends Abstractj {

    private final ArrayList f3082a;

    private final Abstracta f3083b;

    public ClassI(aa c1167aa, ad c1170ad, ClassX c1197x, ArrayList arrayList, Abstracta abstractC1200a) {
        super(c1167aa, c1170ad, null, c1197x);
        if (c1167aa.m4740d() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
        }
        this.f3082a = arrayList;
        this.f3083b = abstractC1200a;
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ClassI(m4840f(), m4841g(), c1197x, this.f3082a, this.f3083b);
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4309a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return ClassB.f3210a;
    }

    public ArrayList m4835c() {
        return this.f3082a;
    }

    public Abstracta m4836e() {
        return this.f3083b;
    }
}
