package a.b.c;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.j;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.l;
import a.b.a.o;
import a.b.a.p;
import a.b.a.u;
import a.b.b.b;
import a.b.b.h;
import a.b.c;
import a.b.c.ae;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.b.f.ClassJ;

public class ClassT extends w implements f, g, i, m, q, r, a.b.b.a.f, aq, s {

    private final boolean f88a;

    public ClassT(boolean z) {
        this.f88a = z;
    }

    private static String m192a(String str, c cVar) {
        if (cVar == null) {
            return str;
        }
        ClassJ c0079j = new ClassJ(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(c0079j.m807c());
        if (c0079j.m806b()) {
            String strM808d = c0079j.m808d();
            String strM807c = c0079j.m807c();
            stringBuffer.append(m195b(strM808d, cVar));
            stringBuffer.append(strM807c);
        }
        return stringBuffer.toString();
    }

    private String m193a(String str, String str2) {
        return str.equals("<init>") ? "<init>" : str + '$' + Long.toHexString(Math.abs(str2.hashCode()));
    }

    private static String m194a(String str, c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return str;
        }
        ClassJ c0079j = new ClassJ(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(c0079j.m807c());
        int i = 0;
        while (c0079j.m806b()) {
            String strM808d = c0079j.m808d();
            boolean zM809e = c0079j.m809e();
            String strM807c = c0079j.m807c();
            int i2 = i + 1;
            String strM195b = m195b(strM808d, cVarArr[i]);
            if (zM809e) {
                strM195b = strM195b.substring(strM195b.lastIndexOf(36) + 1);
            }
            stringBuffer.append(strM195b);
            stringBuffer.append(strM807c);
            i = i2;
        }
        return stringBuffer.toString();
    }

    private static String m195b(String str, c cVar) {
        if (cVar == null) {
            return str;
        }
        String strB = cVar.b();
        if (str.charAt(0) == '[') {
            strB = str.substring(0, str.indexOf(76) + 1) + strB + ';';
        }
        return strB;
    }

    public void m196a(c cVar, a aVar) {
        String strA = aVar.a(cVar);
        String strM194a = m194a(strA, aVar.d);
        if (!strA.equals(strM194a)) {
            aVar.a = new ae((k) cVar).c(strM194a);
        }
        aVar.a(cVar, this);
    }

    public void m197a(c cVar, a aVar, a.b.a.a.c cVar2) {
        cVar2.a(cVar, this);
    }

    public void m198a(c cVar, a aVar, e eVar) {
        eVar.b(cVar, aVar, this);
    }

    public void m199a(c cVar, a aVar, a.b.a.a.f fVar) {
        String strA = fVar.a(cVar);
        String strM194a = m194a(strA, fVar.b);
        if (strA.equals(strM194a)) {
            return;
        }
        fVar.a = new ae((k) cVar).c(strM194a);
    }

    public void m200a(c cVar, a aVar, a.b.a.a.g gVar) {
    }

    public void m201a(c cVar, a aVar, a.b.a.a.i iVar) {
        String strA = iVar.a(cVar);
        String strM194a = m194a(strA, iVar.g);
        if (strA.equals(strM194a)) {
            return;
        }
        iVar.a = new ae((k) cVar).c(strM194a);
    }

    public void m202a(c cVar, d dVar) {
        dVar.a(cVar, this);
    }

    public void m203a(c cVar, a.b.a.a aVar) {
    }

    public void m204a(c cVar, a.b.a.k kVar) {
        kVar.a(cVar, this);
    }

    public void m205a(c cVar, l lVar) {
        String strE;
        int iLastIndexOf;
        int i = lVar.a;
        int i2 = lVar.c;
        if (i == 0 || i2 == 0 || (iLastIndexOf = (strE = cVar.e(i)).lastIndexOf(36)) < 0) {
            return;
        }
        lVar.c = new ae((k) cVar).c(strE.substring(iLastIndexOf + 1));
    }

    public void m206a(c cVar, u uVar) {
        String strB = uVar.b(cVar);
        String strM194a = m194a(strB, uVar.d);
        if (strB.equals(strM194a)) {
            return;
        }
        uVar.c = new ae((k) cVar).c(strM194a);
    }

    public void m207a(c cVar, a.b.b.a aVar) {
        c cVar2 = aVar.b;
        if (cVar2 != null) {
            String strA = aVar.a(cVar);
            String strM195b = m195b(strA, cVar2);
            if (strA.equals(strM195b)) {
                return;
            }
            aVar.a = new ae((k) cVar).c(strM195b);
        }
    }

    public void m208a(c cVar, b bVar) {
    }

    public void m209a(c cVar, h hVar) {
        String strB = hVar.b(cVar);
        String strM194a = m194a(strB, hVar.c);
        if (strB.equals(strM194a)) {
            return;
        }
        hVar.b = new ae((k) cVar).a(hVar.a(cVar), strM194a);
    }

    public void m210a(c cVar, a.b.b.k kVar) {
        String strA = kVar.a(cVar);
        String strM194a = m194a(strA, kVar.c);
        if (strA.equals(strM194a)) {
            return;
        }
        kVar.a = new ae((k) cVar).c(strM194a);
    }

    public void m211a(c cVar, a.b.b.r rVar) {
        c cVar2 = rVar.b;
        Interfacei interfaceC0161i = rVar.c;
        if (cVar2 == null || interfaceC0161i != null) {
            return;
        }
        String strA = rVar.a(cVar);
        String strM760b = ClassI.m760b(strA);
        String strM195b = m195b(strM760b, cVar2);
        if (strM195b.equals(strM760b)) {
            return;
        }
        if (strA.indexOf(46) >= 0) {
            strM195b = ClassI.m764c(strM195b);
        }
        rVar.a = new ae((k) cVar).c(strM195b);
    }

    public void m212a(c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        bVar.a(cVar, this);
    }

    public void m213a(c cVar, Interfacej interfaceC0162j, j jVar) {
        jVar.a(cVar, interfaceC0162j, this);
    }

    public void m214a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m215a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, o oVar) {
        String strB = oVar.b(cVar);
        String strM192a = m192a(strB, oVar.f);
        if (strB.equals(strM192a)) {
            return;
        }
        oVar.d = new ae((k) cVar).c(strM192a);
    }

    public void m216a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m217a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        String strB = qVar.b(cVar);
        String strM194a = m194a(strB, qVar.f);
        if (strB.equals(strM194a)) {
            return;
        }
        qVar.d = new ae((k) cVar).c(strM194a);
    }

    public void m218a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m219a(ClassE c0057e) {
        c0057e.m406a((aq) this);
        c0057e.m417b((aq) this);
    }

    public void m220a(ClassE c0057e, ClassF c0069f) {
        c0069f.f315d = m192a(c0069f.mo949b(c0057e), c0069f.f188a);
    }

    public void m221a(ClassE c0057e, ClassH c0160h) {
        String strB = c0160h.mo949b(c0057e);
        String strM194a = m194a(strB, c0160h.f427a);
        if (strB.equals(strM194a)) {
            return;
        }
        c0160h.f315d = strM194a;
    }

    public void m222a(k kVar) {
        kVar.a(this);
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
    }

    public void m223a(k kVar, ClassL c0163l) {
        String strB = c0163l.mo949b(kVar);
        String strM192a = m192a(strB, c0163l.f429a);
        if (!strB.equals(strM192a)) {
            ae aeVar = new ae(kVar);
            c0163l.f432d = aeVar.c(strM192a);
            if (this.f88a) {
                c0163l.f431c = aeVar.c(m193a(c0163l.mo946a((c) kVar), strB));
            }
        }
        c0163l.mo1267a(kVar, (i) this);
    }

    public void m224a(k kVar, ClassN c0165n) {
        String strB = c0165n.mo949b(kVar);
        String strM194a = m194a(strB, c0165n.f437a);
        if (!strB.equals(strM194a)) {
            ae aeVar = new ae(kVar);
            c0165n.f432d = aeVar.c(strM194a);
            if (this.f88a) {
                c0165n.f431c = aeVar.c(m193a(c0165n.mo946a((c) kVar), strB));
            }
        }
        c0165n.mo1267a(kVar, (i) this);
    }
}
