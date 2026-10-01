package a.g.a;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.o;
import a.b.a.p;
import a.b.a.u;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.h;
import a.b.c;
import a.b.c.ae;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.b.f.ClassJ;
import a.b.f.ClassQ;
import a.g.ClassF;
import a.g.b.ag;
import a.g.b.as;

public class ae extends w implements i, q, r, f, aq, s {
    private String m1921a(String str, c cVar) {
        return m1923b(cVar) ? str.substring(0, ClassI.m774g(str)) + 'I' : str;
    }

    private String m1922a(String str, c[] cVarArr) {
        int i;
        if (cVarArr == null) {
            return str;
        }
        ClassQ c0086q = new ClassQ(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (c0086q.m895a()) {
            ClassJ c0079j = new ClassJ(c0086q.m896b());
            stringBuffer.append(c0079j.m807c());
            i = 0;
            while (c0079j.m806b()) {
                int i2 = i + 1;
                stringBuffer.append(m1923b(cVarArr[i]) ? "java/lang/Integer" : c0079j.m808d());
                stringBuffer.append(c0079j.m807c());
                i = i2;
            }
        } else {
            i = 0;
        }
        if (c0086q.m897c()) {
            stringBuffer.append('(');
        }
        while (c0086q.m898d()) {
            String strM899e = c0086q.m899e();
            ClassJ c0079j2 = new ClassJ(strM899e);
            String strM807c = c0079j2.m807c();
            if (c0079j2.m806b()) {
                String strM808d = c0079j2.m808d();
                int i3 = i + 1;
                if (m1923b(cVarArr[i])) {
                    stringBuffer.append(strM899e.substring(0, ClassI.m774g(strM899e)));
                    stringBuffer.append('I');
                    c0079j2.m807c();
                    i = i3;
                    while (c0079j2.m806b()) {
                        c0079j2.m808d();
                        c0079j2.m807c();
                        i++;
                    }
                } else {
                    stringBuffer.append(strM807c);
                    stringBuffer.append(strM808d);
                    stringBuffer.append(c0079j2.m807c());
                    while (c0079j2.m806b()) {
                        int i4 = i3 + 1;
                        stringBuffer.append(m1923b(cVarArr[i3]) ? "java/lang/Integer" : c0079j2.m808d());
                        stringBuffer.append(c0079j2.m807c());
                        i3 = i4;
                    }
                    i = i3;
                }
            } else {
                stringBuffer.append(strM807c);
            }
        }
        if (c0086q.m897c()) {
            stringBuffer.append(')');
            String strM900f = c0086q.m900f();
            ClassJ c0079j3 = new ClassJ(strM900f);
            String strM807c2 = c0079j3.m807c();
            if (c0079j3.m806b()) {
                String strM808d2 = c0079j3.m808d();
                int i5 = i + 1;
                if (m1923b(cVarArr[i])) {
                    stringBuffer.append(strM900f.substring(0, ClassI.m774g(strM900f)));
                    stringBuffer.append('I');
                } else {
                    stringBuffer.append(strM807c2);
                    stringBuffer.append(strM808d2);
                    stringBuffer.append(c0079j3.m807c());
                    int i6 = i5;
                    while (c0079j3.m806b()) {
                        int i7 = i6 + 1;
                        stringBuffer.append(m1923b(cVarArr[i6]) ? "java/lang/Integer" : c0079j3.m808d());
                        stringBuffer.append(c0079j3.m807c());
                        i6 = i7;
                    }
                }
            } else {
                stringBuffer.append(strM807c2);
            }
        }
        return stringBuffer.toString();
    }

    private boolean m1923b(c cVar) {
        return cVar != null && as.m2467a(cVar);
    }

    private c[] m1924b(String str, c[] cVarArr) {
        int i;
        int i2;
        if (cVarArr == null) {
            return cVarArr;
        }
        ClassQ c0086q = new ClassQ(str);
        if (c0086q.m895a()) {
            ClassJ c0079j = new ClassJ(c0086q.m896b());
            c0079j.m807c();
            i = 0;
            i2 = 0;
            while (c0079j.m806b()) {
                c0079j.m808d();
                c0079j.m807c();
                int i3 = i2 + 1;
                c cVar = cVarArr[i2];
                int i4 = i + 1;
                if (m1923b(cVar)) {
                    cVar = null;
                }
                cVarArr[i] = cVar;
                i = i4;
                i2 = i3;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        while (c0086q.m898d()) {
            ClassJ c0079j2 = new ClassJ(c0086q.m899e());
            c0079j2.m807c();
            if (c0079j2.m806b()) {
                c0079j2.m808d();
                c0079j2.m807c();
                int i5 = i2 + 1;
                c cVar2 = cVarArr[i2];
                if (m1923b(cVar2)) {
                    c0079j2.m807c();
                    i2 = i5;
                    while (c0079j2.m806b()) {
                        c0079j2.m808d();
                        c0079j2.m807c();
                        i2++;
                    }
                } else {
                    cVarArr[i] = cVar2;
                    i++;
                    while (c0079j2.m806b()) {
                        c0079j2.m808d();
                        c0079j2.m807c();
                        int i6 = i5 + 1;
                        c cVar3 = cVarArr[i5];
                        int i7 = i + 1;
                        if (m1923b(cVar3)) {
                            cVar3 = null;
                        }
                        cVarArr[i] = cVar3;
                        i = i7;
                        i5 = i6;
                    }
                    i2 = i5;
                }
            }
        }
        if (c0086q.m897c()) {
            ClassJ c0079j3 = new ClassJ(c0086q.m900f());
            c0079j3.m807c();
            if (c0079j3.m806b()) {
                c0079j3.m808d();
                c0079j3.m807c();
                int i8 = i2 + 1;
                c cVar4 = cVarArr[i2];
                if (!m1923b(cVar4)) {
                    int i9 = i + 1;
                    cVarArr[i] = cVar4;
                    while (true) {
                        i = i9;
                        i2 = i8;
                        if (!c0079j3.m806b()) {
                            break;
                        }
                        c0079j3.m808d();
                        c0079j3.m807c();
                        i8 = i2 + 1;
                        c cVar5 = cVarArr[i2];
                        i9 = i + 1;
                        if (m1923b(cVar5)) {
                            cVar5 = null;
                        }
                        cVarArr[i] = cVar5;
                    }
                } else {
                    i2 = i8;
                }
            }
        }
        if (i == 0) {
            return null;
        }
        if (i >= i2) {
            return cVarArr;
        }
        c[] cVarArr2 = new c[i];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
        return cVarArr2;
    }

    public void m1925a(c cVar, a aVar) {
    }

    public void m1926a(c cVar, u uVar) {
        String strB = uVar.b(cVar);
        String strM1922a = m1922a(strB, uVar.d);
        if (strB.equals(strM1922a)) {
            return;
        }
        uVar.c = new ae((k) cVar).c(strM1922a);
        uVar.d = m1924b(strB, uVar.d);
    }

    public void m1927a(c cVar, a.b.b.a aVar) {
        c cVar2 = aVar.b;
        if (m1923b(cVar2)) {
            String strA = aVar.a(cVar);
            if (ClassI.m773f(strA)) {
                aVar.a = new ae((k) cVar).c(m1921a(strA, cVar2));
                aVar.b = null;
            }
        }
    }

    public void m1928a(c cVar, b bVar) {
    }

    public void m1929a(c cVar, h hVar) {
        String strB = hVar.b(cVar);
        String strM1922a = m1922a(strB, hVar.c);
        if (strB.equals(strM1922a)) {
            return;
        }
        hVar.b = new ae((k) cVar).a(hVar.a(cVar), strM1922a);
        hVar.c = m1924b(strB, hVar.c);
    }

    public void m1930a(c cVar, a.b.b.k kVar) {
        String strA = kVar.a(cVar);
        String strM1922a = m1922a(strA, kVar.c);
        if (strA.equals(strM1922a)) {
            return;
        }
        kVar.a = new ae((k) cVar).c(strM1922a);
        kVar.c = m1924b(strA, kVar.c);
    }

    public void m1931a(c cVar, a.b.b.r rVar) {
        c cVar2 = rVar.b;
        if (m1923b(cVar2)) {
            String strA = rVar.a(cVar);
            if (ClassI.m773f(strA)) {
                rVar.a = new ae((k) cVar).c(m1921a(strA, cVar2));
                rVar.b = null;
            }
        }
    }

    public void m1932a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m1933a(c cVar, Interfacej interfaceC0162j, d dVar, o oVar) {
        String strB = oVar.b(cVar);
        String strM1921a = m1921a(strB, oVar.f);
        if (strB.equals(strM1921a)) {
            return;
        }
        oVar.d = new ae((k) cVar).c(strM1921a);
        oVar.f = null;
    }

    public void m1934a(c cVar, Interfacej interfaceC0162j, d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m1935a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.q qVar) {
        if (qVar.f == null || qVar.f.length <= 0) {
            return;
        }
        String strB = qVar.b(cVar);
        String strM1921a = m1921a(strB, qVar.f[0]);
        if (strB.equals(strM1921a)) {
            return;
        }
        qVar.d = new ae((k) cVar).c(strM1921a);
        qVar.f[0] = null;
    }

    public void m1936a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m1937a(k kVar) {
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
    }

    public void m1938a(k kVar, ClassL c0163l) {
        String strB = c0163l.mo949b(kVar);
        String strM1921a = m1921a(strB, c0163l.f429a);
        if (strB.equals(strM1921a)) {
            return;
        }
        String str = c0163l.mo946a((c) kVar) + '$' + Long.toHexString(Math.abs(strB.hashCode()));
        ae aeVar = new ae(kVar);
        c0163l.f431c = aeVar.c(str);
        c0163l.f432d = aeVar.c(strM1921a);
        c0163l.f429a = null;
        c0163l.f430b &= -16385;
        if (!ClassF.m2860a(c0163l)) {
            ag.m2330b(c0163l).m2337b(kVar, c0163l);
        }
        c0163l.mo1267a(kVar, (i) this);
    }

    public void m1939a(k kVar, ClassN c0165n) {
        c0165n.mo1267a(kVar, (i) this);
        String strB = c0165n.mo949b(kVar);
        String strM1922a = m1922a(strB, c0165n.f437a);
        if (strB.equals(strM1922a)) {
            return;
        }
        String strA = c0165n.mo946a((c) kVar);
        String str = !strA.equals("<init>") ? strA + '$' + Long.toHexString(Math.abs(strB.hashCode())) : strA;
        ae aeVar = new ae(kVar);
        if (!str.equals(strA)) {
            c0165n.f431c = aeVar.c(str);
        }
        c0165n.f432d = aeVar.c(strM1922a);
        c0165n.f437a = m1924b(strB, c0165n.f437a);
    }
}
