package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstractu;
import com.a.b.e.c.Abstractv;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassZ extends Abstractr {

    public static final Abstractr f2014a = new ClassZ();

    private ClassZ() {
    }

    @Override
    public int mo4234a() {
        return 5;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(abstractC1044l.m4381l().m4916b(0).m4900m()) + ", " + m4406a((Abstractv) ((ClassI) abstractC1044l).m4353c());
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4413a(interfaceC1303a, m4410a(abstractC1044l, c1197xM4381l.m4916b(0).m4894g()), ((Abstractu) ((ClassI) abstractC1044l).m4353c()).mo5017k());
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4407a((Abstractv) ((ClassI) abstractC1044l).m4353c(), 64);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if ((abstractC1044l instanceof ClassI) && c1197xM4381l.m5476d_() == 1 && m4425d(c1197xM4381l.m4916b(0).m4894g())) {
            return ((ClassI) abstractC1044l).m4353c() instanceof Abstractu;
        }
        return false;
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m4425d(c1197xM4381l.m4916b(0).m4894g()));
        return bitSet;
    }
}
