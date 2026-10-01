package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.am;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassJ extends Abstractr {

    public static final Abstractr f1998a = new ClassJ();

    private ClassJ() {
    }

    @Override
    public int mo4234a() {
        return 2;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(abstractC1044l.m4381l().m4916b(0).m4900m()) + ", " + m4424d(abstractC1044l);
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        m4414a(interfaceC1303a, m4410a(abstractC1044l, abstractC1044l.m4381l().m4916b(0).m4894g()), (short) ((am) abstractC1044l).m4327e());
    }

    @Override
    public boolean mo4237a(am c1031am) {
        int iM4327e = c1031am.m4327e();
        return iM4327e != 0 && m4427e(iM4327e);
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4426e(abstractC1044l);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if (!(abstractC1044l instanceof am) || c1197xM4381l.m5476d_() != 1 || !m4425d(c1197xM4381l.m4916b(0).m4894g())) {
            return false;
        }
        am c1031am = (am) abstractC1044l;
        if (c1031am.m4328q()) {
            return mo4237a(c1031am);
        }
        return true;
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m4425d(c1197xM4381l.m4916b(0).m4894g()));
        return bitSet;
    }
}
