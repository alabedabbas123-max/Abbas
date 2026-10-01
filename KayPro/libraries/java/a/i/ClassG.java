package a.i;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.p;
import a.b.b.a.f;
import a.b.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.o;
import a.b.ClassE;
import a.b.Interfacej;

public class ClassG extends w implements i, q, r, f, s {

    private final ClassN f1286a;

    private boolean f1287b;

    private boolean f1288c;

    public ClassG(ClassN c0486n) {
        this.f1286a = c0486n;
    }

    private void m2991a(c cVar, int i) {
        cVar.a(i, this);
    }

    public void m2992a(c cVar, a aVar) {
    }

    public void m2993a(c cVar, b bVar) {
        this.f1286a.mo3068a((o) bVar);
    }

    public void m2994a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.o oVar) {
        this.f1288c = true;
        oVar.a(this);
        if (this.f1288c) {
            this.f1286a.mo3068a((o) oVar);
            m2991a(cVar, oVar.c);
            m2991a(cVar, oVar.d);
            this.f1287b = true;
        }
    }

    public void m2995a(c cVar, Interfacej interfaceC0162j, d dVar, p pVar) {
        this.f1287b = false;
        pVar.a(cVar, interfaceC0162j, dVar, this);
        if (this.f1287b) {
            this.f1286a.mo3068a((o) pVar);
            m2991a(cVar, pVar.a);
        }
    }

    public void m2996a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.q qVar) {
        this.f1288c = true;
        qVar.a(this);
        if (this.f1288c) {
            this.f1286a.mo3068a((o) qVar);
            m2991a(cVar, qVar.c);
            m2991a(cVar, qVar.d);
            this.f1287b = true;
        }
    }

    public void m2997a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.r rVar) {
        this.f1287b = false;
        rVar.a(cVar, interfaceC0162j, dVar, this);
        if (this.f1287b) {
            this.f1286a.mo3068a((o) rVar);
            m2991a(cVar, rVar.a);
        }
    }

    public void m2998a(ClassE c0057e) {
    }

    public void m2999a(k kVar) {
        if (this.f1286a.mo3074c(kVar)) {
            return;
        }
        this.f1288c = false;
    }
}
