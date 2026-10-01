package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.aj;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassD extends Abstractr {

    public static final Abstractr f1992a = new ClassD();

    private ClassD() {
    }

    @Override
    public int mo4234a() {
        return 1;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return abstractC1044l.m4381l().m4916b(0).m4900m();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        m4411a(interfaceC1303a, m4410a(abstractC1044l, abstractC1044l.m4381l().m4916b(0).m4894g()));
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        return (abstractC1044l instanceof aj) && c1197xM4381l.m5476d_() == 1 && m4425d(c1197xM4381l.m4916b(0).m4894g());
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m4425d(c1197xM4381l.m4916b(0).m4894g()));
        return bitSet;
    }
}
