package a.b.c;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.h;
import a.b.a.a.j;
import a.b.a.d.i;
import a.b.b.b;
import a.b.b.l;
import a.b.b.r;
import a.b.c;
import a.b.c.ae;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.Abstractm;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.f.ClassI;

public class bg extends w implements f, g, i, a.b.b.a.f, aq, s {

    private final bo f1a = new bo();

    private int f2b;

    private boolean f3c;

    private boolean f4d;

    private void m1b(c cVar, a aVar, h hVar) {
        Interfacej interfaceC0162j = hVar.e;
        if (interfaceC0162j != null) {
            String strB = hVar.b(cVar);
            String strMo946a = interfaceC0162j.mo946a(hVar.d);
            if (strB.equals(strMo946a)) {
                return;
            }
            hVar.c = new ae((k) cVar).c(strMo946a);
        }
    }

    public void m2a(c cVar, a aVar) {
        aVar.a(cVar, this);
    }

    public void m3a(c cVar, a aVar, a.b.a.a.c cVar2) {
        m1b(cVar, aVar, cVar2);
        cVar2.a(cVar, this);
    }

    public void m4a(c cVar, a aVar, e eVar) {
        m1b(cVar, aVar, eVar);
        eVar.b(cVar, aVar, this);
    }

    public void m5a(c cVar, a aVar, a.b.a.a.f fVar) {
        m1b(cVar, aVar, fVar);
    }

    public void m6a(c cVar, a aVar, a.b.a.a.g gVar) {
        m1b(cVar, aVar, gVar);
    }

    public void m7a(c cVar, a aVar, a.b.a.a.i iVar) {
        m1b(cVar, aVar, iVar);
    }

    public void m8a(c cVar, d dVar) {
        dVar.a(cVar, this);
    }

    public void m9a(c cVar, a.b.a.a aVar) {
    }

    public void m10a(c cVar, a.b.a.g gVar) {
        Interfacej interfaceC0162j = gVar.f;
        if (interfaceC0162j != null) {
            c cVar2 = gVar.e;
            String strMo946a = interfaceC0162j.mo946a(cVar2);
            String strMo949b = interfaceC0162j.mo949b(cVar2);
            if (gVar.c(cVar).equals(strMo946a) && gVar.d(cVar).equals(strMo949b)) {
                return;
            }
            gVar.d = new ae((k) cVar).a(strMo946a, strMo949b);
        }
    }

    public void m11a(c cVar, a.b.b.a aVar) {
        if (ClassI.m773f(aVar.a(cVar))) {
            this.f3c = false;
            return;
        }
        c cVar2 = aVar.b;
        if (cVar2 != null) {
            this.f3c = (cVar2.a() & 512) != 0;
        }
    }

    public void m12a(c cVar, b bVar) {
    }

    public void m13a(c cVar, a.b.b.d dVar) {
        Interfacei interfaceC0161i = dVar.e;
        if (interfaceC0161i != null) {
            c cVar2 = dVar.c;
            String strMo946a = interfaceC0161i.mo946a(cVar2);
            String strMo949b = interfaceC0161i.mo949b(cVar2);
            if (dVar.b(cVar).equals(strMo946a) && dVar.c(cVar).equals(strMo949b)) {
                return;
            }
            dVar.b = new ae((k) cVar).a(strMo946a, strMo949b);
        }
    }

    public void m14a(c cVar, a.b.b.g gVar) {
        Interfacei interfaceC0161i = gVar.e;
        if (interfaceC0161i != null) {
            c cVar2 = gVar.c;
            String strMo946a = interfaceC0161i.mo946a(cVar2);
            String strMo949b = interfaceC0161i.mo949b(cVar2);
            if (!gVar.b(cVar).equals(strMo946a) || !gVar.c(cVar).equals(strMo949b)) {
                gVar.b = new ae((k) cVar).a(strMo946a, strMo949b);
                this.f4d = true;
            }
            this.f3c = true;
            cVar.a(gVar.a, this);
            if (this.f3c) {
                return;
            }
            ((k) cVar).c[this.f2b] = new l(gVar.a, gVar.b, cVar2, interfaceC0161i);
        }
    }

    public void m15a(c cVar, l lVar) {
        Interfacei interfaceC0161i = lVar.e;
        if (interfaceC0161i != null) {
            c cVar2 = lVar.c;
            String strMo946a = interfaceC0161i.mo946a(cVar2);
            String strMo949b = interfaceC0161i.mo949b(cVar2);
            if (!lVar.b(cVar).equals(strMo946a) || !lVar.c(cVar).equals(strMo949b)) {
                lVar.b = new ae((k) cVar).a(strMo946a, strMo949b);
                this.f4d = true;
            }
            this.f3c = false;
            cVar.a(lVar.a, this);
            if (this.f3c) {
                ((k) cVar).c[this.f2b] = new a.b.b.g(lVar.a, lVar.b, cVar2, interfaceC0161i);
            }
        }
    }

    public void m16a(c cVar, r rVar) {
        Interfacei interfaceC0161i = rVar.c;
        if (interfaceC0161i != null) {
            String strMo946a = interfaceC0161i.mo946a(rVar.b);
            if (rVar.a(cVar).equals(strMo946a)) {
                return;
            }
            rVar.a = new ae((k) cVar).c(strMo946a);
        }
    }

    public void m17a(c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        bVar.a(cVar, this);
    }

    public void m18a(c cVar, Interfacej interfaceC0162j, j jVar) {
        jVar.a(cVar, interfaceC0162j, this);
    }

    public void m19a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f4d) {
            this.f1a.m53a(cVar, interfaceC0162j, dVar);
        }
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m20a(k kVar) {
        this.f4d = false;
        for (int i = 1; i < kVar.b; i++) {
            b bVar = kVar.c[i];
            if (bVar != null) {
                this.f2b = i;
                bVar.a(kVar, this);
            }
        }
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
    }

    public void m21a(k kVar, Abstractm abstractC0164m) {
        abstractC0164m.mo1267a(kVar, (i) this);
    }
}
