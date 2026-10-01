package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.aj;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public final class ClassE extends Abstractr {

    public static final Abstractr f1993a = new ClassE();

    private ClassE() {
    }

    @Override
    public int mo4234a() {
        return 1;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        int iD_ = c1197xM4381l.m5476d_();
        return String.valueOf(c1197xM4381l.m4916b(iD_ - 2).m4900m()) + ", " + c1197xM4381l.m4916b(iD_ - 1).m4900m();
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        int iD_ = c1197xM4381l.m5476d_();
        m4411a(interfaceC1303a, m4410a(abstractC1044l, m4419b(c1197xM4381l.m4916b(iD_ - 2).m4894g(), c1197xM4381l.m4916b(iD_ - 1).m4894g())));
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return "";
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        ClassU c1194uM4916b;
        ClassU c1194uM4916b2;
        if (!(abstractC1044l instanceof aj)) {
            return false;
        }
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        switch (c1197xM4381l.m5476d_()) {
            case 2:
                c1194uM4916b = c1197xM4381l.m4916b(0);
                c1194uM4916b2 = c1197xM4381l.m4916b(1);
                break;
            case 3:
                c1194uM4916b = c1197xM4381l.m4916b(1);
                c1194uM4916b2 = c1197xM4381l.m4916b(2);
                if (c1194uM4916b.m4894g() != c1197xM4381l.m4916b(0).m4894g()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return m4421b(c1194uM4916b.m4894g()) && m4421b(c1194uM4916b2.m4894g());
    }

    @Override
    public BitSet mo4240c(Abstractl abstractC1044l) {
        ClassX c1197xM4381l = abstractC1044l.m4381l();
        BitSet bitSet = new BitSet(2);
        int iM4894g = c1197xM4381l.m4916b(0).m4894g();
        int iM4894g2 = c1197xM4381l.m4916b(1).m4894g();
        switch (c1197xM4381l.m5476d_()) {
            case 2:
                bitSet.set(0, m4421b(iM4894g));
                bitSet.set(1, m4421b(iM4894g2));
                return bitSet;
            case 3:
                if (iM4894g != iM4894g2) {
                    bitSet.set(0, false);
                    bitSet.set(1, false);
                } else {
                    boolean zB = m4421b(iM4894g2);
                    bitSet.set(0, zB);
                    bitSet.set(1, zB);
                }
                bitSet.set(2, m4421b(c1197xM4381l.m4916b(2).m4894g()));
                return bitSet;
            default:
                throw new AssertionError();
        }
    }
}
