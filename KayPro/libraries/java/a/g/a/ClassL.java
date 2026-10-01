package a.g.a;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;

class ClassL extends w implements d {

    final ClassJ f816a;

    private ClassL(ClassJ c0337j) {
        this.f816a = c0337j;
    }

    public void m2131a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        int iB = this.f816a.f800a.m2206j(i).m1639b();
        for (int iMo349a = iB - abstractC0048c.mo349a(cVar); iMo349a < iB; iMo349a++) {
            if (!this.f816a.m2118a(i, iMo349a) && this.f816a.m2124b(i, iMo349a)) {
                if (this.f816a.m2096a(abstractC0048c)) {
                    this.f816a.m2110h(i);
                    this.f816a.m2084a(i, iMo349a, false);
                } else {
                    this.f816a.m2112i(i);
                }
            }
        }
    }
}
