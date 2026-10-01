package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassN;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassL extends Abstractr {

    public static final Abstractr f2000a = new ClassL();

    private ClassL() {
    }

    @Override
    public int mo4234a() {
        return 2;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        return String.valueOf(c1197xM4381l.m4916b(0).m4900m()) + ", " + c1197xM4381l.m4916b(1).m4900m() + ", " + abstractC1044l.mo4356f();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4414a(interfaceC1303a, m4410a(abstractC1044l, m4419b(c1197xM4381l.m4916b(0).m4894g(), c1197xM4381l.m4916b(1).m4894g())), (short) ((ClassI) abstractC1044l).m4354d());
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return z ? abstractC1044l.mo4357g() : "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if (!(abstractC1044l instanceof ClassI) || c1197xM4381l.m5476d_() != 2 || !m4421b(c1197xM4381l.m4916b(0).m4894g()) || !m4421b(c1197xM4381l.m4916b(1).m4894g())) {
            return false;
        }
        ClassI c1041i = (ClassI) abstractC1044l;
        if (!m4428f(c1041i.m4354d())) {
            return false;
        }
        Abstracta abstractC1200aM4353c = c1041i.m4353c();
        return (abstractC1200aM4353c instanceof ae) || (abstractC1200aM4353c instanceof ClassN);
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, m4421b(c1197xM4381l.m4916b(0).m4894g()));
        bitSet.set(1, m4421b(c1197xM4381l.m4916b(1).m4894g()));
        return bitSet;
    }
}
