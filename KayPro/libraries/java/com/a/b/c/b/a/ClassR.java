package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassN;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassR extends Abstractr {

    public static final Abstractr f2006a = new ClassR();

    private ClassR() {
    }

    @Override
    public int mo4234a() {
        return 3;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(abstractC1044l.m4381l().m4916b(0).m4900m()) + ", " + abstractC1044l.mo4356f();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4412a(interfaceC1303a, m4410a(abstractC1044l, c1197xM4381l.m4916b(0).m4894g()), ((ClassI) abstractC1044l).m4354d());
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return z ? abstractC1044l.mo4357g() : "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassU c1194uM4916b;
        if (!(abstractC1044l instanceof ClassI)) {
            return false;
        }
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        switch (c1197xM4381l.m5476d_()) {
            case 1:
                c1194uM4916b = c1197xM4381l.m4916b(0);
                break;
            case 2:
                c1194uM4916b = c1197xM4381l.m4916b(0);
                if (c1194uM4916b.m4894g() != c1197xM4381l.m4916b(1).m4894g()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        if (!m4425d(c1194uM4916b.m4894g())) {
            return false;
        }
        Abstracta abstractC1200aM4353c = ((ClassI) abstractC1044l).m4353c();
        return (abstractC1200aM4353c instanceof ae) || (abstractC1200aM4353c instanceof ClassN) || (abstractC1200aM4353c instanceof ad);
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        int iD_ = c1197xM4381l.m5476d_();
        BitSet bitSet = new BitSet(iD_);
        boolean zD = m4425d(c1197xM4381l.m4916b(0).m4894g());
        if (iD_ == 1) {
            bitSet.set(0, zD);
        } else if (c1197xM4381l.m4916b(0).m4894g() == c1197xM4381l.m4916b(1).m4894g()) {
            bitSet.set(0, zD);
            bitSet.set(1, zD);
        }
        return bitSet;
    }
}
