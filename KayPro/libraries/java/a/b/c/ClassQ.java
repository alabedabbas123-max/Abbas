package a.b.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;

public class ClassQ extends w implements i, f, d, aq {

    private String f83a;

    public void m178a(c cVar, a aVar) {
    }

    public void m179a(c cVar, q qVar) {
        this.f83a = qVar.b(cVar);
    }

    public void m180a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.a(cVar, interfaceC0162j, this);
    }

    public void m181a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -74:
            case -73:
            case -72:
            case -71:
                cVar.a(c0047b.f139a, this);
                if (!interfaceC0162j.mo946a(cVar).equals(this.f83a)) {
                    ((ClassN) interfaceC0162j).f430b &= -65;
                }
                break;
        }
    }

    public void m182a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m183a(k kVar, ClassN c0165n) {
        if ((c0165n.mo945a() & 64) != 0) {
            c0165n.mo1267a(kVar, (i) this);
        }
    }
}
