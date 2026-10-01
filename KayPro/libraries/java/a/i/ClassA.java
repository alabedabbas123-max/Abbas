package a.i;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.h;
import a.b.a.a.j;
import a.b.a.d.i;
import a.b.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.o;
import a.b.ClassE;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacej;

public class ClassA extends w implements f, g, i, a.b.b.a.f, aq, s {

    private final ClassN f1269a;

    private boolean f1270b;

    private boolean f1271c;

    private boolean f1272d;

    private boolean f1273e;

    public ClassA(ClassN c0486n) {
        this.f1269a = c0486n;
    }

    private void m2936a(c cVar, int i) {
        if (i > 0) {
            cVar.a(i, this);
        }
    }

    private boolean m2937a(a aVar) {
        this.f1272d = true;
        aVar.a(this);
        return this.f1272d;
    }

    private boolean m2938a(h hVar) {
        this.f1273e = true;
        hVar.a(this);
        return this.f1273e;
    }

    public void m2939a(c cVar, a aVar) {
        if (m2937a(aVar)) {
            this.f1269a.mo3068a((o) aVar);
            m2936a(cVar, aVar.a);
            aVar.a(cVar, this);
            this.f1271c = true;
            this.f1270b = true;
        }
    }

    public void m2940a(c cVar, a aVar, a.b.a.a.c cVar2) {
        if (m2938a((h) cVar2)) {
            boolean z = this.f1271c;
            this.f1271c = false;
            cVar2.a(cVar, this);
            if (this.f1271c) {
                this.f1269a.mo3068a((o) cVar2);
                m2936a(cVar, cVar2.c);
            }
            this.f1271c = z;
        }
    }

    public void m2941a(c cVar, a aVar, e eVar) {
        if (m2938a((h) eVar)) {
            eVar.b(cVar, aVar, this);
            this.f1269a.mo3068a((o) eVar);
            m2936a(cVar, eVar.c);
        }
    }

    public void m2942a(c cVar, a aVar, a.b.a.a.f fVar) {
        if (m2938a((h) fVar)) {
            this.f1269a.mo3068a((o) fVar);
            m2936a(cVar, fVar.c);
            m2936a(cVar, fVar.a);
            fVar.a(this.f1269a);
        }
    }

    public void m2943a(c cVar, a aVar, a.b.a.a.g gVar) {
        if (m2938a((h) gVar)) {
            this.f1269a.mo3068a((o) gVar);
            m2936a(cVar, gVar.c);
            m2936a(cVar, gVar.b);
        }
    }

    public void m2944a(c cVar, a aVar, a.b.a.a.i iVar) {
        if (m2938a((h) iVar)) {
            this.f1272d = true;
            iVar.a(this);
            if (this.f1272d) {
                this.f1269a.mo3068a((o) iVar);
                m2936a(cVar, iVar.c);
                m2936a(cVar, iVar.a);
                m2936a(cVar, iVar.b);
            }
        }
    }

    public void m2945a(c cVar, d dVar) {
        this.f1270b = false;
        dVar.a(cVar, this);
        if (this.f1270b) {
            this.f1269a.mo3068a((o) dVar);
            m2936a(cVar, dVar.a);
        }
    }

    public void m2946a(c cVar, a.b.a.a aVar) {
    }

    public void m2947a(c cVar, a.b.b.a aVar) {
        if (this.f1269a.mo3074c(aVar)) {
            return;
        }
        this.f1272d = true;
        aVar.a(this);
        if (this.f1272d) {
            this.f1269a.mo3068a((o) aVar);
            m2936a(cVar, aVar.a);
        }
    }

    public void m2948a(c cVar, b bVar) {
        this.f1269a.mo3068a((o) bVar);
    }

    public void m2949a(c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        bVar.a(cVar, this);
        this.f1269a.mo3068a((o) bVar);
        m2936a(cVar, bVar.a);
    }

    public void m2950a(c cVar, Interfacej interfaceC0162j, j jVar) {
        this.f1270b = false;
        jVar.a(cVar, interfaceC0162j, this);
        if (this.f1270b) {
            this.f1269a.mo3068a((o) jVar);
            m2936a(cVar, jVar.a);
        }
    }

    public void m2951a(ClassE c0057e) {
    }

    public void m2952a(ClassE c0057e, ClassH c0160h) {
    }

    public void m2953a(k kVar) {
        this.f1272d &= this.f1269a.mo3074c(kVar);
    }

    public void m2954a(k kVar, ClassN c0165n) {
        this.f1273e = this.f1269a.mo3074c(c0165n);
    }
}
