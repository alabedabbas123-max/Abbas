package a.b.f;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.h;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.o;
import a.b.a.p;
import a.b.a.u;
import a.b.b;
import a.b.b.j;
import a.b.b.k;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;

public class ClassF extends w implements f, g, i, q, r, a.b.b.a.f, aq, s {

    private final b f208a;

    private final b f209b;

    private final ClassZ f210c;

    private final ClassZ f211d;

    private final ClassZ f212e;

    private final ClassZ f213f;

    private final ClassR f214g;

    public ClassF(b bVar, b bVar2) {
        this(bVar, bVar2, null, null, null, null);
    }

    public ClassF(b bVar, b bVar2, ClassZ c0094z, ClassZ c0094z2, ClassZ c0094z3, ClassZ c0094z4) {
        this.f214g = new ClassR();
        this.f208a = bVar;
        this.f209b = bVar2;
        this.f210c = c0094z;
        this.f211d = c0094z2;
        this.f212e = c0094z3;
        this.f213f = c0094z4;
    }

    private c m701a(c cVar, String str) {
        ClassJ c0079j = new ClassJ(str);
        c0079j.m807c();
        if (c0079j.m806b()) {
            return m704c(cVar, c0079j.m808d());
        }
        return null;
    }

    private void m702b(c cVar, a aVar, h hVar) {
        if (aVar == null || aVar.d == null || hVar.c == 0) {
            return;
        }
        String strB = hVar.b(cVar);
        c cVar2 = aVar.d[0];
        hVar.d = cVar2;
        hVar.e = cVar2.b(strB, (String) null);
    }

    private c[] m703b(c cVar, String str) {
        boolean z = false;
        ClassJ c0079j = new ClassJ(str);
        int iM805a = c0079j.m805a();
        if (iM805a > 0) {
            c[] cVarArr = new c[iM805a];
            for (int i = 0; i < iM805a; i++) {
                c0079j.m807c();
                c cVarM704c = m704c(cVar, c0079j.m808d());
                if (cVarM704c != null) {
                    cVarArr[i] = cVarM704c;
                    z = true;
                }
            }
            if (z) {
                return cVarArr;
            }
        }
        return null;
    }

    private c m704c(c cVar, String str) {
        if (ClassI.m773f(str)) {
            if (!ClassI.m784j(str)) {
                return null;
            }
            str = ClassI.m792o(str);
        }
        c cVarA = this.f208a.a(str);
        if (cVarA != null) {
            if (this.f213f == null) {
                return cVarA;
            }
            String strB = cVar.b();
            this.f213f.m942a(strB, str, "Warning: library class " + ClassI.m764c(strB) + " depends on program class " + ClassI.m764c(str));
            return cVarA;
        }
        c cVarA2 = this.f209b.a(str);
        if (cVarA2 != null || this.f210c == null) {
            return cVarA2;
        }
        String strB2 = cVar.b();
        this.f210c.m942a(strB2, str, "Warning: " + ClassI.m764c(strB2) + ": can't find referenced class " + ClassI.m764c(str));
        return cVarA2;
    }

    public void m705a(c cVar, a aVar) {
        aVar.d = m703b(cVar, aVar.a(cVar));
        aVar.a(cVar, this);
    }

    public void m706a(c cVar, a aVar, a.b.a.a.c cVar2) {
        m702b(cVar, aVar, cVar2);
        cVar2.a(cVar, this);
    }

    public void m707a(c cVar, a aVar, e eVar) {
        m702b(cVar, aVar, eVar);
        eVar.b(cVar, aVar, this);
    }

    public void m708a(c cVar, a aVar, a.b.a.a.f fVar) {
        m702b(cVar, aVar, fVar);
        fVar.b = m703b(cVar, fVar.a(cVar));
    }

    public void m709a(c cVar, a aVar, a.b.a.a.g gVar) {
        m702b(cVar, aVar, gVar);
    }

    public void m710a(c cVar, a aVar, a.b.a.a.i iVar) {
        m702b(cVar, aVar, iVar);
        iVar.g = m703b(cVar, iVar.a(cVar));
    }

    public void m711a(c cVar, d dVar) {
        dVar.a(cVar, this);
    }

    public void m712a(c cVar, a.b.a.a aVar) {
    }

    public void m713a(c cVar, a.b.a.g gVar) {
        String strB = gVar.b(cVar);
        gVar.e = m704c(cVar, strB);
        if (gVar.e == null || gVar.d == 0) {
            return;
        }
        String strC = gVar.c(cVar);
        String strD = gVar.d(cVar);
        gVar.f = gVar.e.b(strC, strD);
        if (gVar.f != null || this.f211d == null) {
            return;
        }
        String strB2 = cVar.b();
        this.f211d.m942a(strB2, strB, "Warning: " + ClassI.m764c(strB2) + ": can't find enclosing method '" + ClassI.m751a(strB, 0, strC, strD) + "' in program class " + ClassI.m764c(strB));
    }

    public void m714a(c cVar, u uVar) {
        uVar.d = m703b(cVar, uVar.b(cVar));
    }

    public void m715a(c cVar, a.b.b.a aVar) {
        aVar.b = m704c(cVar, ClassI.m792o(aVar.a(cVar)));
        aVar.c = m704c(cVar, "java/lang/Class");
    }

    public void m716a(c cVar, a.b.b.b bVar) {
    }

    public void m717a(c cVar, a.b.b.h hVar) {
        hVar.c = m703b(cVar, hVar.b(cVar));
    }

    public void m718a(c cVar, j jVar) {
        jVar.c = m704c(cVar, "java/lang/invoke/MethodHandle");
    }

    public void m719a(c cVar, k kVar) {
        kVar.b = m704c(cVar, "java/lang/invoke/MethodType");
        kVar.c = m703b(cVar, kVar.a(cVar));
    }

    public void m720a(c cVar, a.b.b.r rVar) {
        rVar.e = m704c(cVar, "java/lang/String");
    }

    public void m721a(c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        bVar.a(cVar, this);
    }

    public void m722a(c cVar, Interfacej interfaceC0162j, a.b.a.a.j jVar) {
        jVar.a(cVar, interfaceC0162j, this);
    }

    public void m723a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m724a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, o oVar) {
        oVar.f = m701a(cVar, oVar.b(cVar));
    }

    public void m725a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m726a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        qVar.f = m703b(cVar, qVar.b(cVar));
    }

    public void m727a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m728a(ClassE c0057e) {
        c0057e.m406a((aq) this);
        c0057e.m417b((aq) this);
    }

    public void m729a(ClassE c0057e, ClassF c0069f) {
        c0069f.f188a = m701a(c0057e, c0069f.mo949b(c0057e));
    }

    public void m730a(ClassE c0057e, ClassH c0160h) {
        c0160h.f427a = m703b(c0057e, c0160h.mo949b(c0057e));
    }

    public void m731a(a.b.k kVar) {
        kVar.a(this);
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
    }

    public void m732a(a.b.k kVar, ClassL c0163l) {
        c0163l.f429a = m701a((c) kVar, c0163l.mo949b(kVar));
        c0163l.mo1267a(kVar, (i) this);
    }

    public void m733a(a.b.k kVar, ClassN c0165n) {
        c0165n.f437a = m703b((c) kVar, c0165n.mo949b(kVar));
        c0165n.mo1267a(kVar, (i) this);
    }

    public void m734b(c cVar, a.b.b.q qVar) {
        String strA = qVar.a(cVar);
        String str = ClassI.m773f(strA) ? "java/lang/Object" : strA;
        c cVarM704c = m704c(cVar, str);
        if (cVarM704c != null) {
            String strB = qVar.b(cVar);
            String strC = qVar.c(cVar);
            boolean z = qVar.a() == 9;
            qVar.e = this.f214g.m902a(cVar, cVarM704c, strB, strC, z);
            qVar.c = this.f214g.m901a();
            if (qVar.e == null) {
                boolean z2 = cVarM704c instanceof a.b.k;
                ClassZ c0094z = z2 ? this.f211d : this.f212e;
                if (c0094z != null) {
                    c0094z.m942a(cVar.b(), str, "Warning: " + ClassI.m764c(cVar.b()) + ": can't find referenced " + (z ? "field '" + ClassI.m749a(0, strB, strC) : "method '" + ClassI.m751a(str, 0, strB, strC)) + "' in " + (z2 ? "program" : "library") + " class " + ClassI.m764c(str));
                }
            }
        }
    }
}
