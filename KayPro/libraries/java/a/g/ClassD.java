package a.g;

import a.b.a.a;
import a.b.a.a.j;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.u;
import a.b.c;
import a.b.c.ae;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.g.b.ai;
import a.g.b.ClassQ;

public class ClassD extends w implements i, aq {

    private static final char[] f1116a = {'B', 'C', 'S', 'I', 'Z'};

    private final aq f1117b;

    public ClassD() {
        this(null);
    }

    public ClassD(aq aqVar) {
        this.f1117b = aqVar;
    }

    public void m2847a(c cVar, a aVar) {
    }

    public void m2848a(c cVar, Interfacej interfaceC0162j, j jVar) {
        int i = jVar.c;
        jVar.c = i + 1;
        if (jVar.d == null || jVar.d.length < jVar.c) {
            int[] iArr = new int[jVar.c];
            a.b.a.a.a[][] aVarArr = new a.b.a.a.a[jVar.c][];
            System.arraycopy(jVar.d, 0, iArr, 0, i);
            System.arraycopy(jVar.e, 0, aVarArr, 0, i);
            jVar.d = iArr;
            jVar.e = aVarArr;
        }
    }

    public void m2849a(c cVar, Interfacej interfaceC0162j, d dVar) {
        int iM762c = ClassI.m762c(interfaceC0162j.mo949b(cVar), interfaceC0162j.mo945a());
        if (dVar.d < iM762c) {
            dVar.d = iM762c;
        }
    }

    public void m2850a(c cVar, Interfacej interfaceC0162j, u uVar) {
        String strB = interfaceC0162j.mo949b(cVar);
        int iIndexOf = strB.indexOf(41);
        String strB2 = uVar.b(cVar);
        int iIndexOf2 = strB2.indexOf(41);
        uVar.c = new ae((k) cVar).c(strB2.substring(0, iIndexOf2) + strB.charAt(iIndexOf - 1) + strB2.substring(iIndexOf2));
    }

    public void m2851a(k kVar, ClassN c0165n) {
        String string;
        String strA = c0165n.mo946a((c) kVar);
        if (strA.equals("<init>")) {
            String strB = c0165n.mo949b(kVar);
            Interfacej interfaceC0162jB = kVar.b(strA, strB);
            if (c0165n.equals(interfaceC0162jB)) {
                return;
            }
            if (ClassF.m2861a(c0165n)) {
                c0165n = (ClassN) interfaceC0162jB;
            }
            int iIndexOf = strB.indexOf(41);
            int i = 0;
            while (true) {
                StringBuffer stringBuffer = new StringBuffer(strB.substring(0, iIndexOf));
                for (int i2 = 0; i2 < i / f1116a.length; i2++) {
                    stringBuffer.append('[');
                }
                stringBuffer.append(f1116a[i % f1116a.length]);
                stringBuffer.append(strB.substring(iIndexOf));
                string = stringBuffer.toString();
                if (kVar.b(strA, string) == null) {
                    break;
                } else {
                    i++;
                }
            }
            c0165n.f432d = new ae(kVar).c(string);
            c0165n.mo1267a(kVar, (i) this);
            ClassQ c0398qA = ai.m2566a(c0165n);
            if (c0398qA instanceof ai) {
                ai c0365ai = (ai) c0398qA;
                c0365ai.m2387h(ClassI.m757b(string, c0165n.mo945a()) - 1);
                int iMo2404t = c0365ai.mo2404t();
                c0365ai.m2385f(iMo2404t + 1);
                c0365ai.m2386g(iMo2404t);
            }
            if (this.f1117b != null) {
                this.f1117b.a(kVar, c0165n);
            }
        }
    }
}
