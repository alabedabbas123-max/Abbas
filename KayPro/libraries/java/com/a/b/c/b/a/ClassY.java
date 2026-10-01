package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassY;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.ab;
import com.a.b.e.c.ClassZ;
import com.a.b.g.Interfacea;

public final class ClassY extends Abstractr {

    public static final Abstractr f2013a = new ClassY();

    private ClassY() {
    }

    @Override
    public int mo4234a() {
        return 4;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(m4420b(abstractC1044l.m4381l())) + ", " + abstractC1044l.mo4356f();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassY c1057y = (ClassY) abstractC1044l;
        short sM4460b = (short) c1057y.m4460b(0);
        short sM4460b2 = (short) c1057y.m4460b(1);
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4416a(interfaceC1303a, m4410a(abstractC1044l, c1197xM4381l.m4920e()), sM4460b, c1197xM4381l.m5476d_() > 0 ? (short) c1197xM4381l.m4916b(0).m4894g() : (short) 0, sM4460b2);
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return z ? abstractC1044l.mo4357g() : "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        if (!(abstractC1044l instanceof ClassY)) {
            return false;
        }
        ClassY c1057y = (ClassY) abstractC1044l;
        int iM4460b = c1057y.m4460b(0);
        int iM4460b2 = c1057y.m4460b(1);
        if (!m4428f(iM4460b) || !m4428f(iM4460b2) || !(c1057y.m4458a(0) instanceof ClassZ) || !(c1057y.m4458a(1) instanceof ab)) {
            return false;
        }
        ClassX c1197xL = c1057y.m4381l();
        int iD_ = c1197xL.m5476d_();
        if (iD_ == 0) {
            return true;
        }
        return m4425d(c1197xL.m4920e()) && m4428f(iD_) && m4428f(c1197xL.m4916b(0).m4894g()) && m4423c(c1197xL);
    }
}
