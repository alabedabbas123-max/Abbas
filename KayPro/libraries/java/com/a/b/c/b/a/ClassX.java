package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.ClassY;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.ab;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassX extends Abstractr {

    public static final Abstractr f2012a = new ClassX();

    private ClassX() {
    }

    private static int m4243d(ClassX c1197x) {
        int i = 0;
        int iD_ = c1197x.m5476d_();
        if (iD_ > 5) {
            return -1;
        }
        int i2 = 0;
        while (i2 < iD_) {
            ClassU c1194uM4916b = c1197x.m4916b(i2);
            int iM4898k = c1194uM4916b.m4898k() + i;
            if (!m4421b((c1194uM4916b.m4894g() + c1194uM4916b.m4898k()) - 1)) {
                return -1;
            }
            i2++;
            i = iM4898k;
        }
        if (i > 5) {
            i = -1;
        }
        return i;
    }

    private static ClassX m4244e(ClassX c1197x) {
        int i = 0;
        int iM4243d = m4243d(c1197x);
        int iD_ = c1197x.m5476d_();
        if (iM4243d == iD_) {
            return c1197x;
        }
        ClassX c1197x2 = new ClassX(iM4243d);
        for (int i2 = 0; i2 < iD_; i2++) {
            ClassU c1194uM4916b = c1197x.m4916b(i2);
            c1197x2.m4915a(i, c1194uM4916b);
            if (c1194uM4916b.m4898k() == 2) {
                c1197x2.m4915a(i + 1, ClassU.m4876a(c1194uM4916b.m4894g() + 1, ClassC.f3258i));
                i += 2;
            } else {
                i++;
            }
        }
        c1197x2.mo3944c_();
        return c1197x2;
    }

    @Override
    public int mo4234a() {
        return 4;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return String.valueOf(m4405a(m4244e(abstractC1044l.m4381l()))) + ", " + abstractC1044l.mo4356f();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassY c1057y = (ClassY) abstractC1044l;
        short sM4460b = (short) c1057y.m4460b(0);
        short sM4460b2 = (short) c1057y.m4460b(1);
        ClassX c1197xM4244e = m4244e(abstractC1044l.m4381l());
        int iD_ = c1197xM4244e.m5476d_();
        m4416a(interfaceC1303a, m4410a(abstractC1044l, m4419b(iD_ > 4 ? c1197xM4244e.m4916b(4).m4894g() : 0, iD_)), sM4460b, m4409a(iD_ > 0 ? c1197xM4244e.m4916b(0).m4894g() : 0, iD_ > 1 ? c1197xM4244e.m4916b(1).m4894g() : 0, iD_ > 2 ? c1197xM4244e.m4916b(2).m4894g() : 0, iD_ > 3 ? c1197xM4244e.m4916b(3).m4894g() : 0), sM4460b2);
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
        if (c1057y.m4461c() == 2) {
            return m4428f(c1057y.m4460b(0)) && m4428f(c1057y.m4460b(1)) && (c1057y.m4458a(0) instanceof ClassZ) && (c1057y.m4458a(1) instanceof ab) && m4243d(c1057y.m4381l()) >= 0;
        }
        return false;
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        int iD_ = c1197xM4381l.m5476d_();
        BitSet bitSet = new BitSet(iD_);
        for (int i = 0; i < iD_; i++) {
            ClassU c1194uM4916b = c1197xM4381l.m4916b(i);
            bitSet.set(i, m4421b((c1194uM4916b.m4898k() + c1194uM4916b.m4894g()) - 1));
        }
        return bitSet;
    }
}
