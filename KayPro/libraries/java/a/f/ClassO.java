package a.f;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;

public class ClassO implements aq {

    private final aq f719a;

    public ClassO(aq aqVar) {
        this.f719a = aqVar;
    }

    private boolean m1840a(c cVar) {
        return ClassC.m1794b(cVar) != null;
    }

    private boolean m1841a(c cVar, Interfacej interfaceC0162j) {
        return m1842a(interfaceC0162j) || (m1840a(cVar) && interfaceC0162j.mo946a(cVar).equals("<init>"));
    }

    private boolean m1842a(Interfacei interfaceC0161i) {
        return ClassP.m1850b(interfaceC0161i) != null;
    }

    public void m1843a(ClassE c0057e, ClassF c0069f) {
        if (m1842a(c0069f)) {
            this.f719a.a(c0057e, c0069f);
        }
    }

    public void m1844a(ClassE c0057e, ClassH c0160h) {
        if (m1841a((c) c0057e, (Interfacej) c0160h)) {
            this.f719a.a(c0057e, c0160h);
        }
    }

    public void m1845a(k kVar, ClassL c0163l) {
        if (m1842a(c0163l)) {
            this.f719a.a(kVar, c0163l);
        }
    }

    public void m1846a(k kVar, ClassN c0165n) {
        if (m1841a((c) kVar, (Interfacej) c0165n)) {
            this.f719a.a(kVar, c0165n);
        }
    }
}
