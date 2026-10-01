package a.g;

import a.b.a.a;
import a.b.a.a.j;
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
import a.b.f.ClassJ;
import a.b.f.ClassQ;
import a.g.b.ad;

public class ClassI extends w implements i, aq {

    private final aq f1125a;

    public ClassI() {
        this(null);
    }

    public ClassI(aq aqVar) {
        this.f1125a = aqVar;
    }

    private String m2878a(Interfacej interfaceC0162j, String str) {
        int iM799v = (interfaceC0162j.mo945a() & 8) != 0 ? 0 : 1;
        ClassQ c0086q = new ClassQ(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(c0086q.m896b());
        stringBuffer.append('(');
        while (c0086q.m898d()) {
            String strM899e = c0086q.m899e();
            if (ad.m2294b(interfaceC0162j, iM799v)) {
                stringBuffer.append(strM899e);
            }
            iM799v += ClassI.m799v(strM899e);
        }
        stringBuffer.append(')');
        stringBuffer.append(c0086q.m900f());
        return stringBuffer.toString();
    }

    private c[] m2879a(Interfacej interfaceC0162j, String str, c[] cVarArr) {
        if (cVarArr == null) {
            return cVarArr;
        }
        int i = (interfaceC0162j.mo945a() & 8) != 0 ? 0 : 1;
        ClassQ c0086q = new ClassQ(str);
        int iM805a = new ClassJ(c0086q.m896b()).m805a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iM805a) {
            cVarArr[i3] = cVarArr[i4];
            i2++;
            i4++;
            i3++;
        }
        int i5 = i3;
        int i6 = i4;
        int iM799v = i;
        int i7 = i5;
        while (c0086q.m898d()) {
            String strM899e = c0086q.m899e();
            int iM805a2 = new ClassJ(strM899e).m805a();
            if (ad.m2294b(interfaceC0162j, iM799v)) {
                int i8 = 0;
                while (i8 < iM805a2) {
                    cVarArr[i7] = cVarArr[i6];
                    i8++;
                    i6++;
                    i7++;
                }
            } else {
                i6 += iM805a2;
            }
            iM799v += ClassI.m799v(strM899e);
        }
        int iM805a3 = new ClassJ(c0086q.m900f()).m805a();
        int i9 = i6;
        int i10 = i7;
        int i11 = 0;
        while (i11 < iM805a3) {
            cVarArr[i10] = cVarArr[i9];
            i11++;
            i10++;
            i9++;
        }
        if (i10 == 0) {
            return null;
        }
        if (i10 >= i9) {
            return cVarArr;
        }
        c[] cVarArr2 = new c[i10];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, i10);
        return cVarArr2;
    }

    public void m2880a(c cVar, a aVar) {
    }

    public void m2881a(c cVar, Interfacej interfaceC0162j, j jVar) {
        int[] iArr = jVar.d;
        a.b.a.a.a[][] aVarArr = jVar.e;
        int i = (interfaceC0162j.mo945a() & 8) != 0 ? 0 : 1;
        ClassQ c0086q = new ClassQ(interfaceC0162j.mo949b(cVar));
        int i2 = 0;
        int iM799v = i;
        int i3 = 0;
        while (c0086q.m898d()) {
            String strM899e = c0086q.m899e();
            if (ad.m2294b(interfaceC0162j, iM799v)) {
                iArr[i3] = iArr[i2];
                aVarArr[i3] = aVarArr[i2];
                i3++;
            }
            i2++;
            iM799v += ClassI.m799v(strM899e);
        }
        jVar.c = i3;
        while (i3 < i2) {
            iArr[i3] = 0;
            aVarArr[i3] = null;
            i3++;
        }
    }

    public void m2882a(c cVar, Interfacej interfaceC0162j, u uVar) {
        String strB = uVar.b(cVar);
        String strM2878a = m2878a(interfaceC0162j, strB);
        if (strM2878a.equals(strB)) {
            return;
        }
        uVar.c = new ae((k) cVar).c(strM2878a);
        uVar.d = m2879a(interfaceC0162j, strB, uVar.d);
    }

    public void m2883a(k kVar, ClassN c0165n) {
        String strB = c0165n.mo949b(kVar);
        String strM2878a = m2878a(c0165n, strB);
        if (strM2878a.equals(strB)) {
            return;
        }
        c0165n.mo1267a(kVar, (i) this);
        String strA = c0165n.mo946a((c) kVar);
        String str = !strA.equals("<init>") ? strA + '$' + Long.toHexString(Math.abs(strB.hashCode())) : strA;
        ae aeVar = new ae(kVar);
        if (!str.equals(strA)) {
            c0165n.f431c = aeVar.c(str);
        }
        c0165n.f437a = m2879a(c0165n, strB, c0165n.f437a);
        c0165n.f432d = aeVar.c(strM2878a);
        if (this.f1125a != null) {
            this.f1125a.a(kVar, c0165n);
        }
    }
}
