package com.a.b.c.b.a;

import com.a.b.c.b.Abstractl;
import com.a.b.c.b.Abstractr;
import com.a.b.c.b.am;
import com.a.b.g.Interfacea;

public final class ClassA extends Abstractr {

    public static final Abstractr f1988a = new ClassA();

    private ClassA() {
    }

    @Override
    public int mo4234a() {
        return 1;
    }

    @Override
    public String mo4235a(Abstractl abstractC1044l) {
        return m4424d(abstractC1044l);
    }

    @Override
    public void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l) {
        m4411a(interfaceC1303a, m4410a(abstractC1044l, ((am) abstractC1044l).m4327e() & 255));
    }

    @Override
    public boolean mo4237a(am c1031am) {
        int iM4327e = c1031am.m4327e();
        return iM4327e != 0 && m4422c(iM4327e);
    }

    @Override
    public String mo4238b(Abstractl abstractC1044l, boolean z) {
        return m4426e(abstractC1044l);
    }

    @Override
    public boolean mo4239b(Abstractl abstractC1044l) {
        if (!(abstractC1044l instanceof am) || abstractC1044l.m4381l().m5476d_() != 0) {
            return false;
        }
        am c1031am = (am) abstractC1044l;
        if (c1031am.m4328q()) {
            return mo4237a(c1031am);
        }
        return true;
    }
}
