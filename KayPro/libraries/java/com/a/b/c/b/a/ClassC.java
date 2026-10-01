package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassC extends Abstractr {

    public static final Abstractr f1991a = new ClassC();

    private ClassC() {
    }

    @Override
    public int mo4234a() {
        return 1;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(abstractC1044l.m4381l().m4916b(0).m4900m()) + ", " + m4406a((Abstractv) ((ClassI) abstractC1044l).m4353c());
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        m4411a(interfaceC1303a, m4410a(abstractC1044l, m4419b(abstractC1044l.m4381l().m4916b(0).m4894g(), ((Abstractv) ((ClassI) abstractC1044l).m4353c()).mo5016j() & 15)));
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4407a((Abstractv) ((ClassI) abstractC1044l).m4353c(), 4);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if (!(abstractC1044l instanceof ClassI) || c1197xM4381l.m5476d_() != 1 || !m4421b(c1197xM4381l.m4916b(0).m4894g())) {
            return false;
        }
        Abstracta abstractC1200aM4353c = ((ClassI) abstractC1044l).m4353c();
        if (!(abstractC1200aM4353c instanceof Abstractv)) {
            return false;
        }
        Abstractv abstractC1229v = (Abstractv) abstractC1200aM4353c;
        return abstractC1229v.mo5015i() && m4418a(abstractC1229v.mo5016j());
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m4421b(c1197xM4381l.m4916b(0).m4894g()));
        return bitSet;
    }
}
