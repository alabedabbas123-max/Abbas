package a.g.c;

import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.h;
import a.b.a.a.j;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.o;
import a.b.a.p;
import a.b.a.u;
import a.b.b.a;
import a.b.b.b;
import a.b.c;
import a.b.c.ae;
import a.b.c.av;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.bp;
import a.b.g.bi;
import a.b.g.bm;

public class ClassZ extends w implements f, g, i, q, r, a.b.b.a.f, aq, s {
    private int m2813a(k kVar, String str, c cVar) {
        ae aeVar = new ae(kVar);
        return aeVar.a(new a(aeVar.c(str), cVar));
    }

    private Interfacei m2814a(Interfacei interfaceC0161i, String str, String str2, c cVar) {
        if (interfaceC0161i == null) {
            return null;
        }
        return interfaceC0161i instanceof Interfaced ? cVar.a(str, str2) : cVar.b(str, str2);
    }

    private void m2815a(c[] cVarArr) {
        if (cVarArr == null) {
            return;
        }
        for (int i = 0; i < cVarArr.length; i++) {
            cVarArr[i] = m2817b(cVarArr[i]);
        }
    }

    private boolean m2816a(c cVar, int i, c cVar2) {
        for (int i2 = 0; i2 < i; i2++) {
            if (cVar2.equals(cVar.k(i2))) {
                return true;
            }
        }
        return false;
    }

    private c m2817b(c cVar) {
        if (cVar == null) {
            return null;
        }
        c cVarM2702b = ClassC.m2702b(cVar);
        return cVarM2702b != null ? cVarM2702b : cVar;
    }

    public void m2818a(c cVar, a.b.a.a.a aVar) {
        m2815a(aVar.d);
        aVar.a(cVar, this);
    }

    public void m2819a(c cVar, a.b.a.a.a aVar, a.b.a.a.c cVar2) {
        m2823a(cVar, aVar, (h) cVar2);
        cVar2.a(cVar, this);
    }

    public void m2820a(c cVar, a.b.a.a.a aVar, e eVar) {
        m2823a(cVar, aVar, (h) eVar);
        eVar.b(cVar, aVar, this);
    }

    public void m2821a(c cVar, a.b.a.a.a aVar, a.b.a.a.f fVar) {
        m2823a(cVar, aVar, (h) fVar);
        m2815a(fVar.b);
    }

    public void m2822a(c cVar, a.b.a.a.a aVar, a.b.a.a.g gVar) {
        m2823a(cVar, aVar, (h) gVar);
    }

    public void m2823a(c cVar, a.b.a.a.a aVar, h hVar) {
        c cVar2 = hVar.d;
        c cVarM2817b = m2817b(cVar2);
        if (cVar2 != cVarM2817b) {
            hVar.d = cVarM2817b;
            hVar.e = (Interfacej) m2814a(hVar.e, hVar.b(cVar), (String) null, cVarM2817b);
        }
    }

    public void m2824a(c cVar, a.b.a.a.a aVar, a.b.a.a.i iVar) {
        m2823a(cVar, aVar, (h) iVar);
        m2815a(iVar.g);
    }

    public void m2825a(c cVar, d dVar) {
        dVar.a(cVar, this);
    }

    public void m2826a(c cVar, a.b.a.a aVar) {
    }

    public void m2827a(c cVar, u uVar) {
        m2815a(uVar.d);
    }

    public void m2828a(c cVar, a aVar) {
        aVar.b = m2817b(aVar.b);
    }

    public void m2829a(c cVar, b bVar) {
    }

    public void m2830a(c cVar, a.b.b.h hVar) {
        m2815a(hVar.c);
    }

    public void m2831a(c cVar, a.b.b.k kVar) {
        m2815a(kVar.c);
    }

    public void m2832a(c cVar, a.b.b.r rVar) {
        c cVar2 = rVar.b;
        c cVarM2817b = m2817b(cVar2);
        if (cVar2 != cVarM2817b) {
            rVar.b = cVarM2817b;
            rVar.c = m2814a(rVar.c, rVar.a(cVar), (String) null, cVarM2817b);
        }
    }

    public void m2833a(c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        bVar.a(cVar, this);
    }

    public void m2834a(c cVar, Interfacej interfaceC0162j, j jVar) {
        jVar.a(cVar, interfaceC0162j, this);
    }

    public void m2835a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m2836a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, o oVar) {
        oVar.f = m2817b(oVar.f);
    }

    public void m2837a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m2838a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        m2815a(qVar.f);
    }

    public void m2839a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m2840a(ClassE c0057e) {
        c0057e.m406a((aq) this);
        c0057e.m417b((aq) this);
    }

    public void m2841a(ClassE c0057e, ClassF c0069f) {
        c0069f.f188a = m2817b(c0069f.f188a);
    }

    public void m2842a(ClassE c0057e, ClassH c0160h) {
        m2815a(c0160h.f427a);
    }

    public void m2843a(k kVar) {
        kVar.a(this);
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
        boolean[] zArr = null;
        for (int i = 0; i < kVar.g; i++) {
            c cVarK = kVar.k(i);
            if (cVarK != null && (kVar.equals(cVarK) || m2816a((c) kVar, i, cVarK))) {
                if (zArr == null) {
                    zArr = new boolean[kVar.g];
                }
                zArr[i] = true;
            }
        }
        if (zArr != null) {
            new av(zArr).a(kVar);
        }
        if (ClassC.m2702b((c) kVar) != null) {
            kVar.e = m2813a(kVar, kVar.b(), (c) kVar);
            kVar.o = null;
        } else {
            bi c0131bi = new bi(new bm(kVar, new bp(kVar)));
            kVar.b(c0131bi);
            kVar.c(c0131bi);
        }
    }

    public void m2844a(k kVar, ClassL c0163l) {
        c0163l.f429a = m2817b(c0163l.f429a);
        c0163l.mo1267a(kVar, (i) this);
    }

    public void m2845a(k kVar, ClassN c0165n) {
        m2815a(c0165n.f437a);
        c0165n.mo1267a(kVar, (i) this);
    }

    public void m2846b(c cVar, a.b.b.q qVar) {
        c cVar2 = qVar.c;
        c cVarM2817b = m2817b(cVar2);
        if (cVar2 != cVarM2817b) {
            qVar.c = cVarM2817b;
            qVar.e = m2814a(qVar.e, qVar.b(cVar), qVar.c(cVar), cVarM2817b);
        }
    }
}
