package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassM extends Abstractr {

    public static final Abstractr f2001a = new ClassM();

    private ClassM() {
    }

    @Override
    public int mo4234a() {
        return 2;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        return String.valueOf(c1197xM4381l.m4916b(0).m4900m()) + ", " + c1197xM4381l.m4916b(1).m4900m() + ", " + m4406a((Abstractv) ((ClassI) abstractC1044l).m4353c());
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4414a(interfaceC1303a, m4410a(abstractC1044l, m4419b(c1197xM4381l.m4916b(0).m4894g(), c1197xM4381l.m4916b(1).m4894g())), (short) ((Abstractv) ((ClassI) abstractC1044l).m4353c()).mo5016j());
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4407a((Abstractv) ((ClassI) abstractC1044l).m4353c(), 16);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if (!(abstractC1044l instanceof ClassI) || c1197xM4381l.m5476d_() != 2 || !m4421b(c1197xM4381l.m4916b(0).m4894g()) || !m4421b(c1197xM4381l.m4916b(1).m4894g())) {
            return false;
        }
        Abstracta abstractC1200aM4353c = ((ClassI) abstractC1044l).m4353c();
        if (!(abstractC1200aM4353c instanceof Abstractv)) {
            return false;
        }
        Abstractv abstractC1229v = (Abstractv) abstractC1200aM4353c;
        return abstractC1229v.mo5015i() && m4427e(abstractC1229v.mo5016j());
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
