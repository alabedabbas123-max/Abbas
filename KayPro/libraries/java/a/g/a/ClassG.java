package a.g.a;

import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.g.b.ad;

class ClassG extends w implements f, d, aq {

    final ClassA f786a;

    private int f787b;

    private ClassB f788c;

    private ClassG(ClassA c0318a) {
        this.f786a = c0318a;
    }

    public void m2031a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m2032a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -74:
            case -73:
            case -71:
                this.f787b = i;
                this.f788c = c0047b;
                cVar.a(c0047b.f139a, this);
                break;
        }
    }

    public void m2033a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2034a(k kVar, ClassN c0165n) {
        if ((c0165n.mo945a() & 8) != 0 || ad.m2294b(c0165n, 0)) {
            return;
        }
        this.f786a.m1891a((c) kVar, this.f787b, this.f788c);
    }

    public void m2035b(c cVar, q qVar) {
        qVar.a(this);
    }
}
