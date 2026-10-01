package a.b.g;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.f.ClassI;

public class ae implements aq {

    private final aq f326a;

    private final aq f327b;

    public ae(aq aqVar, aq aqVar2) {
        this.f326a = aqVar;
        this.f327b = aqVar2;
    }

    private aq m958a(c cVar, Interfacei interfaceC0161i) {
        return ClassI.m795r(interfaceC0161i.mo946a(cVar)) ? this.f326a : this.f327b;
    }

    public void m959a(ClassE c0057e, ClassF c0069f) {
    }

    public void m960a(ClassE c0057e, ClassH c0160h) {
        aq aqVarM958a = m958a((c) c0057e, (Interfacei) c0160h);
        if (aqVarM958a != null) {
            aqVarM958a.a(c0057e, c0160h);
        }
    }

    public void m961a(k kVar, ClassL c0163l) {
    }

    public void m962a(k kVar, ClassN c0165n) {
        aq aqVarM958a = m958a((c) kVar, (Interfacei) c0165n);
        if (aqVarM958a != null) {
            aqVarM958a.a(kVar, c0165n);
        }
    }
}
