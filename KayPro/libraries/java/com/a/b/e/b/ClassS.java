package com.a.b.e.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassP;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.e.d.Interfacee;

public final class ClassS extends Abstractj {
    public ClassS(aa c1167aa, ad c1170ad, ClassU c1194u, ClassU c1194u2) {
        this(c1167aa, c1170ad, c1194u, ClassX.m4909a(c1194u2));
    }

    public ClassS(aa c1167aa, ad c1170ad, ClassU c1194u, ClassX c1197x) {
        super(c1167aa, c1170ad, c1194u, c1197x);
        switch (c1167aa.m4740d()) {
            case 5:
            case 6:
                throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
            default:
                if (c1194u != null && c1167aa.m4740d() != 1) {
                    throw new IllegalArgumentException("can't mix branchingness with result");
                }
                return;
        }
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ClassS(m4840f(), m4841g(), c1194u, c1197x);
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4305a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return ClassB.f3210a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public Abstractj mo4846l() {
        Abstracta abstractC1200aM5001a;
        int i;
        ClassX c1197xJ = m4844j();
        int iD_ = c1197xJ.m5476d_();
        if (iD_ == 0) {
            return this;
        }
        Interfaced interfaceC1237dM4895h = c1197xJ.m4916b(iD_ - 1).m4895h();
        if (!interfaceC1237dM4895h.mo3830f()) {
            Interfaced interfaceC1237dM4895h2 = c1197xJ.m4916b(0).m4895h();
            if (iD_ != 2 || !interfaceC1237dM4895h2.mo3830f()) {
                return this;
            }
            Abstracta abstractC1200a = (Abstracta) interfaceC1237dM4895h2;
            ClassX c1197xM4921f = c1197xJ.m4921f();
            return new ClassR(ac.m4749a(m4840f().m4737a(), m4842h(), c1197xM4921f, abstractC1200a), m4841g(), m4842h(), c1197xM4921f, abstractC1200a);
        }
        Abstracta abstractC1200a2 = (Abstracta) interfaceC1237dM4895h;
        ClassX c1197xM4922g = c1197xJ.m4922g();
        try {
            int iM4737a = m4840f().m4737a();
            if (iM4737a == 15 && (abstractC1200a2 instanceof ClassP)) {
                abstractC1200aM5001a = ClassP.m5001a(-((ClassP) abstractC1200a2).m5002i_());
                i = 14;
            } else {
                abstractC1200aM5001a = abstractC1200a2;
                i = iM4737a;
            }
            return new ClassR(ac.m4749a(i, m4842h(), c1197xM4922g, abstractC1200aM5001a), m4841g(), m4842h(), c1197xM4922g, abstractC1200aM5001a);
        } catch (IllegalArgumentException e) {
            return this;
        }
    }
}
