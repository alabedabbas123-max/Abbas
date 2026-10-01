package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassI;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassJ;
import com.a.b.e.c.ClassZ;
import com.a.b.g.Interfacea;

public final class ClassW extends Abstractr {

    public static final Abstractr f2011a = new ClassW();

    private ClassW() {
    }

    @Override
    public int mo4234a() {
        return 3;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(m4420b(abstractC1044l.m4381l())) + ", " + abstractC1044l.mo4356f();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        m4415a(interfaceC1303a, m4410a(abstractC1044l, c1197xM4381l.m4920e()), (short) ((ClassI) abstractC1044l).m4354d(), (short) (c1197xM4381l.m5476d_() == 0 ? 0 : c1197xM4381l.m4916b(0).m4894g()));
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return z ? abstractC1044l.mo4357g() : "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        if (!(abstractC1044l instanceof ClassI)) {
            return false;
        }
        ClassI c1041i = (ClassI) abstractC1044l;
        int iM4354d = c1041i.m4354d();
        Abstracta abstractC1200aM4353c = c1041i.m4353c();
        if (!m4428f(iM4354d)) {
            return false;
        }
        if (!(abstractC1200aM4353c instanceof ClassZ) && !(abstractC1200aM4353c instanceof ae) && !(abstractC1200aM4353c instanceof ClassJ)) {
            return false;
        }
        ClassX c1197xL = c1041i.m4381l();
        c1197xL.m5476d_();
        return c1197xL.m5476d_() == 0 || (m4423c(c1197xL) && m4428f(c1197xL.m4916b(0).m4894g()) && m4425d(c1197xL.m4920e()));
    }
}
