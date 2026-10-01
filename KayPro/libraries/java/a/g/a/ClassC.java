package a.g.a;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.d.a.ad;

class ClassC extends w implements d {

    final ClassA f782a;

    private ClassC(ClassA c0318a) {
        this.f782a = c0318a;
    }

    private int m2012a(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (this.f782a.f732a.m2123b(i)) {
                return i2;
            }
        }
        return 0;
    }

    private boolean m2013a(ad c0179ad, int i) {
        int iM1324e;
        if (c0179ad == null || (iM1324e = c0179ad.m1324e()) <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < iM1324e; i2++) {
            if (c0179ad.m1317a(i2) > i) {
                return false;
            }
        }
        return true;
    }

    public void m2014a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (!m2013a(this.f782a.f732a.m2130f(i), i) || this.f782a.m1895a(m2012a(i), i)) {
            return;
        }
        this.f782a.m1890a(cVar, i);
    }
}
