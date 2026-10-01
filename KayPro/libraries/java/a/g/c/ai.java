package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.l;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassH;

public class ai extends w implements i, f, d, s {

    private final d f1021a;

    private final ClassV f1022b;

    private c f1023c;

    private Abstractc f1024d;

    public ai() {
        this(null);
    }

    public ai(d dVar) {
        this.f1022b = new ClassV(true, true);
        this.f1021a = dVar;
    }

    private boolean m2688a(c cVar, int i) {
        this.f1023c = null;
        cVar.a(i, this);
        return this.f1023c != null;
    }

    public void m2689a(c cVar, a aVar) {
    }

    public void m2690a(c cVar, a.b.b.a aVar) {
        aVar.a(this);
    }

    public void m2691a(c cVar, b bVar) {
    }

    public void m2692a(c cVar, a.b.b.d dVar) {
        dVar.a(this);
    }

    public void m2693a(c cVar, l lVar) {
        if (lVar.b(cVar).equals("<init>")) {
            lVar.a(this);
        }
    }

    public void m2694a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1022b.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f1022b.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m2695a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -76:
                if (m2688a(cVar, c0047b.f139a)) {
                    this.f1022b.m314c(i);
                }
                break;
            case -73:
                if (m2688a(cVar, c0047b.f139a)) {
                    if (this.f1024d != null) {
                        this.f1022b.m316c(i, new Abstractc[]{this.f1024d, new ClassH((byte) 87)});
                    } else {
                        this.f1022b.m314c(i);
                    }
                }
                break;
            case -69:
                if (m2688a(cVar, c0047b.f139a)) {
                    int iMo322a = c0047b.mo322a(i) + i;
                    this.f1024d = ClassE.m387a(dVar.f, iMo322a);
                    switch (this.f1024d.mo332b()) {
                        case 58:
                            this.f1022b.m311b(i, new ClassH((byte) 1));
                            break;
                        case 89:
                            this.f1022b.m314c(i);
                            this.f1022b.m314c(iMo322a);
                            this.f1024d = null;
                            break;
                        default:
                            this.f1022b.m311b(i, new ClassH((byte) 1));
                            this.f1024d = new ClassH((byte) 87);
                            break;
                    }
                    if (this.f1021a != null) {
                        this.f1021a.a(cVar, interfaceC0162j, dVar, i, c0047b);
                    }
                }
                break;
        }
    }

    public void m2696a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2697a(ClassE c0057e) {
    }

    public void m2698a(k kVar) {
        this.f1023c = ClassC.m2702b((c) kVar);
    }
}
