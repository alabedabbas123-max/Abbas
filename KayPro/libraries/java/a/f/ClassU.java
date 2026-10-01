package a.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.k;
import a.b.a.l;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacej;
import a.b.f.ClassI;

class ClassU extends w implements i, m, f, aq, s {
    ClassU() {
    }

    private void m1860a(c cVar, Interfaced interfaceC0041d) {
        ClassP.m1848a(interfaceC0041d, interfaceC0041d.mo946a(cVar));
    }

    private void m1861a(c cVar, Interfacej interfaceC0162j) {
        String strA = interfaceC0162j.mo946a(cVar);
        if (ClassI.m795r(strA)) {
            return;
        }
        ClassP.m1848a(interfaceC0162j, strA);
    }

    public void m1862a(c cVar, a aVar) {
    }

    public void m1863a(c cVar, k kVar) {
        kVar.a(cVar, this);
    }

    public void m1864a(c cVar, l lVar) {
        int i = lVar.a;
        int i2 = lVar.b;
        if (i == 0 || i2 == 0 || !cVar.e(i).equals(cVar.b())) {
            return;
        }
        cVar.a(i2, this);
    }

    public void m1865a(c cVar, a.b.b.a aVar) {
        aVar.a(this);
    }

    public void m1866a(ClassE c0057e) {
        m1872b(c0057e);
    }

    public void m1867a(ClassE c0057e, ClassF c0069f) {
        m1860a((c) c0057e, (Interfaced) c0069f);
    }

    public void m1868a(ClassE c0057e, ClassH c0160h) {
        m1861a((c) c0057e, (Interfacej) c0160h);
    }

    public void m1869a(a.b.k kVar) {
        m1872b(kVar);
        kVar.a(this);
    }

    public void m1870a(a.b.k kVar, ClassL c0163l) {
        m1860a((c) kVar, (Interfaced) c0163l);
    }

    public void m1871a(a.b.k kVar, ClassN c0165n) {
        m1861a((c) kVar, (Interfacej) c0165n);
    }

    public void m1872b(c cVar) {
        ClassC.m1792a(cVar, cVar.b());
    }
}
