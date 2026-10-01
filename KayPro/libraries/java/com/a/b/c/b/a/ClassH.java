package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassH extends Abstractr {

    public static final Abstractr f1996a = new ClassH();

    private ClassH() {
    }

    @Override
    public int mo4234a() {
        return 2;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(abstractC1044l.m4381l().m4916b(0).m4900m()) + ", " + m4406a((Abstractv) ((ClassI) abstractC1044l).m4353c());
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        Abstractv abstractC1229v = (Abstractv) ((ClassI) abstractC1044l).m4353c();
        m4414a(interfaceC1303a, m4410a(abstractC1044l, c1197xM4381l.m4916b(0).m4894g()), c1197xM4381l.m4916b(0).m4898k() == 1 ? (short) (abstractC1229v.mo5016j() >>> 16) : (short) (abstractC1229v.mo5017k() >>> 48));
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4407a((Abstractv) ((ClassI) abstractC1044l).m4353c(), abstractC1044l.m4381l().m4916b(0).m4898k() == 1 ? 32 : 64);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        if (!(abstractC1044l instanceof ClassI) || c1197xM4381l.m5476d_() != 1 || !m4425d(c1197xM4381l.m4916b(0).m4894g())) {
            return false;
        }
        Abstracta abstractC1200aM4353c = ((ClassI) abstractC1044l).m4353c();
        if (!(abstractC1200aM4353c instanceof Abstractv)) {
            return false;
        }
        Abstractv abstractC1229v = (Abstractv) abstractC1200aM4353c;
        if (c1197xM4381l.m4916b(0).m4898k() == 1) {
            return (abstractC1229v.mo5016j() & 65535) == 0;
        }
        return (abstractC1229v.mo5017k() & 281474976710655L) == 0;
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m4425d(c1197xM4381l.m4916b(0).m4894g()));
        return bitSet;
    }
}
