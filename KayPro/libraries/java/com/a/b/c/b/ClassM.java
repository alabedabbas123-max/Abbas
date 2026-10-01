package com.a.b.c.b;

import com.a.a.a.ClassB;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ab;
import com.a.b.e.c.ClassJ;
import com.a.b.g.ClassJ;
import com.a.b.g.Interfacea;
import java.util.ArrayList;

public final class ClassM extends ClassJ {

    private final int f2082a;

    public ClassM(int i, int i2) {
        super(i);
        this.f2082a = i2;
    }

    public static ClassM m4386a(ArrayList arrayList, int i) {
        int size = arrayList.size();
        ClassM c1045m = new ClassM(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c1045m.m4388a(i2, (Abstractl) arrayList.get(i2));
        }
        c1045m.mo3944c_();
        return c1045m;
    }

    public Abstractl m4387a(int i) {
        return (Abstractl) m5477e(i);
    }

    public void m4388a(int i, Abstractl abstractC1044l) {
        m5474a(i, (Object) abstractC1044l);
    }

    public void m4389a(Interfacea interfaceC1303a) {
        int iG = interfaceC1303a.mo5462g();
        int iD_ = m5476d_();
        if (interfaceC1303a.mo5405a()) {
            boolean zMo5406b = interfaceC1303a.mo5406b();
            for (int i = 0; i < iD_; i++) {
                Abstractl abstractC1044l = (Abstractl) m5477e(i);
                int iMo4229a = abstractC1044l.mo4229a() * 2;
                String strM4372a = (iMo4229a != 0 || zMo5406b) ? abstractC1044l.m4372a("  ", interfaceC1303a.mo5408d(), true) : null;
                if (strM4372a != null) {
                    interfaceC1303a.mo5403a(iMo4229a, strM4372a);
                } else if (iMo4229a != 0) {
                    interfaceC1303a.mo5403a(iMo4229a, "");
                }
            }
        }
        for (int i2 = 0; i2 < iD_; i2++) {
            Abstractl abstractC1044l2 = (Abstractl) m5477e(i2);
            try {
                abstractC1044l2.mo4232a(interfaceC1303a);
            } catch (RuntimeException e) {
                throw ClassB.m3756a(e, "...while writing " + abstractC1044l2);
            }
        }
        int iG2 = (interfaceC1303a.mo5462g() - iG) / 2;
        if (iG2 != m4390e()) {
            throw new RuntimeException("write length mismatch; expected " + m4390e() + " but actually wrote " + iG2);
        }
    }

    public int m4390e() {
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return 0;
        }
        return m4387a(iD_ - 1).m4385p();
    }

    public int m4391f() {
        return this.f2082a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    public int m4392g() {
        int iM5055e;
        int iD_ = m5476d_();
        int i = 0;
        int i2 = 0;
        while (i < iD_) {
            Abstractl abstractC1044l = (Abstractl) m5477e(i);
            if (abstractC1044l instanceof ClassI) {
                Abstracta abstractC1200aM4353c = ((ClassI) abstractC1044l).m4353c();
                if (abstractC1200aM4353c instanceof Abstractf) {
                    iM5055e = ((Abstractf) abstractC1200aM4353c).m4982b(abstractC1044l.m4379j().m4394b() == 113);
                } else {
                    iM5055e = abstractC1200aM4353c instanceof ClassJ ? ((ClassJ) abstractC1200aM4353c).m4992a().m5042c().m5055e() : 0;
                }
            } else {
                if (!(abstractC1044l instanceof ClassY)) {
                    iM5055e = i2;
                } else {
                    if (abstractC1044l.m4379j().m4394b() != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM5055e = ((ab) ((ClassY) abstractC1044l).m4458a(1)).m4950i().m5042c().m5055e() + 1;
                }
                i++;
                i2 = iM5055e;
            }
            if (iM5055e <= i2) {
                iM5055e = i2;
            }
            i++;
            i2 = iM5055e;
        }
        return i2;
    }
}
