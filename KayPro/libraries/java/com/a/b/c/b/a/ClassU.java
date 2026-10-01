package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.aj;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassU extends Abstractr {

    public static final Abstractr f2009a = new ClassU();

    private ClassU() {
    }

    @Override
    public int mo4234a() {
        return 3;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        return String.valueOf(c1197xM4381l.m4916b(0).m4900m()) + ", " + c1197xM4381l.m4916b(1).m4900m();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4415a(interfaceC1303a, m4410a(abstractC1044l, 0), (short) c1197xM4381l.m4916b(0).m4894g(), (short) c1197xM4381l.m4916b(1).m4894g());
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        return (abstractC1044l instanceof aj) && c1197xM4381l.m5476d_() == 2 && m4428f(c1197xM4381l.m4916b(0).m4894g()) && m4428f(c1197xM4381l.m4916b(1).m4894g());
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, m4428f(c1197xM4381l.m4916b(0).m4894g()));
        bitSet.set(1, m4428f(c1197xM4381l.m4916b(1).m4894g()));
        return bitSet;
    }
}
