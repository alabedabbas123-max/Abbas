package a.h;

import a.b.a.a;
import a.b.a.c.c;
import a.b.a.c.e;
import a.b.a.c.g;
import a.b.a.c.j;
import a.b.a.c.l;
import a.b.a.c.m;
import a.b.a.c.n;
import a.b.a.c.r;
import a.b.a.c.s;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c.ae;
import a.b.f.w;
import a.b.k;
import java.util.ArrayList;
import java.util.List;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.c.ClassJ;
import a.b.c.ClassV;
import a.b.f.ClassI;
import a.d.ClassB;
import a.d.ClassJ;
import a.d.ClassK;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;
import a.d.a.ax;
import a.g.a.aa;
import a.g.a.ClassI;
import a.g.a.ClassS;
import a.g.a.ClassV;
import a.g.a.ClassZ;
import a.j.ClassL;

public class ClassA extends w implements i {

    private final boolean f1255a;

    private final aa f1256b = new aa(new ax());

    private final ClassV f1257c = new ClassV(this.f1256b, new ClassZ(new ClassB(this.f1256b)), true, this.f1256b);

    private final ClassI f1258d = new ClassI(this.f1257c, false);

    private final ClassS f1259e = new ClassS(this.f1257c, false, this.f1258d, false);

    private final ClassV f1260f = new ClassV();

    public ClassA(boolean z) {
        this.f1255a = z;
    }

    private int m2915a(k kVar, Abstractap abstractC0191ap) {
        return new ae(kVar).a(abstractC0191ap.mo1555e(), abstractC0191ap.mo1556f());
    }

    private r m2916a(k kVar, ClassN c0165n, d dVar, int i, Abstractbd abstractC0206bd, Abstractbd abstractC0206bd2) {
        if (abstractC0206bd == null) {
            return s.e();
        }
        int iMo1331j = abstractC0206bd.mo1331j();
        switch (iMo1331j) {
            case 1:
            case 6:
                return s.a();
            case 2:
                return s.b();
            case 3:
                return s.c();
            case 4:
                return s.d();
            case 5:
                Abstractap abstractC0191apMo1558l_ = abstractC0206bd.mo1558l_();
                if (abstractC0191apMo1558l_.mo1559m() == 1) {
                    return s.f();
                }
                if (i != -1) {
                    ad c0179adMo1335n_ = ((av) abstractC0191apMo1558l_).m1582s().mo1335n_();
                    if (c0179adMo1335n_.m1324e() == 1) {
                        if (c0179adMo1335n_.m1322c(0)) {
                            if (c0179adMo1335n_.m1323d(0) == 0 && this.f1258d.m2078a() && i <= this.f1258d.m2080b()) {
                                return s.g();
                            }
                        } else if (c0179adMo1335n_.m1328g(0)) {
                            int iM1317a = c0179adMo1335n_.m1317a(0);
                            if (!this.f1258d.m2079a(i, c0179adMo1335n_)) {
                                return s.a(iM1317a);
                            }
                        }
                    }
                }
                return s.b(m2915a(kVar, abstractC0191apMo1558l_));
            case 7:
                return s.e();
            default:
                throw new IllegalArgumentException("Unknown computational type [" + iMo1331j + "]");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    private void m2917a(r[] rVarArr, List list) {
        m gVar;
        int i = -1;
        int length = rVarArr.length;
        int i2 = 0;
        while (i2 < list.size()) {
            m mVar = (c) list.get(i2);
            int i3 = ((c) mVar).a;
            r[] rVarArr2 = ((c) mVar).b;
            int i4 = ((c) mVar).c;
            r[] rVarArr3 = ((c) mVar).d;
            if (i3 == length && m2918a(rVarArr2, rVarArr, i3)) {
                if (i4 == 0) {
                    gVar = new a.b.a.c.k();
                } else if (i4 == 1) {
                    gVar = new j(rVarArr3[0]);
                } else {
                    gVar = mVar;
                }
            } else if (i4 != 0) {
                gVar = mVar;
            } else {
                int i5 = i3 - length;
                if (i5 < 0 && i5 > -4 && m2918a(rVarArr2, rVarArr, i3)) {
                    gVar = new e((byte) (-i5));
                } else if (i5 <= 0 || i5 >= 4 || !m2918a(rVarArr2, rVarArr, length)) {
                    gVar = mVar;
                } else {
                    r[] rVarArr4 = new r[i5];
                    System.arraycopy(rVarArr2, i3 - i5, rVarArr4, 0, i5);
                    gVar = new g(rVarArr4);
                }
            }
            int i6 = ((c) mVar).e;
            gVar.e = (i6 - i) - 1;
            int i7 = ((c) mVar).a;
            rVarArr = ((c) mVar).b;
            list.set(i2, gVar);
            i2++;
            length = i7;
            i = i6;
        }
    }

    private boolean m2918a(r[] rVarArr, r[] rVarArr2, int i) {
        if (i > 0 && (rVarArr.length < i || rVarArr2.length < i)) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!rVarArr[i2].equals(rVarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private r[] m2919a(k kVar, ClassN c0165n, d dVar, int i, ClassJ c0240j) {
        int iB = c0240j.m1639b();
        int i2 = 0;
        int i3 = 0;
        while (i3 < iB) {
            i2++;
            if (c0240j.m1643c(i3).mo1588b()) {
                i3++;
            }
            i3++;
        }
        r[] rVarArr = new r[i2];
        int i4 = 0;
        int i5 = i2;
        while (i4 < iB) {
            Abstractbd abstractC0206bdC = c0240j.m1643c(i4);
            int i6 = i5 - 1;
            rVarArr[i6] = m2916a(kVar, c0165n, dVar, i, abstractC0206bdC, c0240j.m1665f(i4));
            i4 = (abstractC0206bdC.mo1588b() ? i4 + 1 : i4) + 1;
            i5 = i6;
        }
        return rVarArr;
    }

    private r[] m2920a(k kVar, ClassN c0165n, d dVar, int i, ClassK c0241k) {
        int iM757b;
        r rVarG;
        int i2;
        if (i == -1) {
            iM757b = ClassI.m757b(c0165n.mo949b(kVar), c0165n.mo945a());
        } else {
            int i3 = 0;
            int iA = c0241k.m1674a();
            int i4 = 0;
            int i5 = 0;
            while (i5 < iA) {
                Abstractbd abstractC0206bdC = c0241k.m1677c(i5);
                i4++;
                if (abstractC0206bdC != null && this.f1259e.m2173a(i, i5)) {
                    if (abstractC0206bdC.mo1588b()) {
                        i5++;
                        i3 = i4;
                    } else {
                        i3 = i4;
                    }
                }
                i5++;
            }
            iM757b = i3;
        }
        r[] rVarArr = new r[iM757b];
        int i6 = 0;
        for (int i7 = 0; i7 < iM757b; i7++) {
            Abstractbd abstractC0206bdC2 = c0241k.m1677c(i6);
            Abstractbd abstractC0206bdM1667a = c0241k.m1667a(i6);
            if (abstractC0206bdC2 == null || !(i == -1 || this.f1259e.m2173a(i, i6))) {
                rVarG = i == -1 ? s.g() : s.e();
                i2 = i6;
            } else {
                rVarG = m2916a(kVar, c0165n, dVar, i, abstractC0206bdC2, abstractC0206bdM1667a);
                i2 = abstractC0206bdC2.mo1588b() ? i6 + 1 : i6;
            }
            rVarArr[i7] = rVarG;
            i6 = i2 + 1;
        }
        return rVarArr;
    }

    public void m2921a(a.b.c cVar, a aVar) {
    }

    public void m2922a(a.b.c cVar, Interfacej interfaceC0162j, d dVar) {
        try {
            m2923b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while preverifying:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m2923b(a.b.c cVar, Interfacej interfaceC0162j, d dVar) {
        l nVar;
        k kVar = (k) cVar;
        ClassN c0165n = (ClassN) interfaceC0162j;
        int i = dVar.e;
        this.f1257c.m2194a(cVar, interfaceC0162j, dVar);
        this.f1258d.m2077a(cVar, interfaceC0162j, dVar);
        this.f1259e.m2167a(cVar, interfaceC0162j, dVar);
        this.f1260f.m277a(i);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            if (!this.f1257c.m2196a(i2)) {
                this.f1260f.m314c(i2);
            } else if (this.f1257c.m2198b(i2)) {
                arrayList.add(new c(i2, m2920a(kVar, c0165n, dVar, i2, this.f1257c.m2204h(i2)), m2919a(kVar, c0165n, dVar, i2, this.f1257c.m2206j(i2))));
            }
        }
        if (!this.f1255a && !arrayList.isEmpty()) {
            r[] rVarArrM2920a = m2920a(kVar, c0165n, dVar, -1, this.f1257c.m2204h(0));
            if (interfaceC0162j.mo946a((a.b.c) kVar).equals("<init>")) {
                rVarArrM2920a[0] = s.g();
            }
            m2917a(rVarArrM2920a, arrayList);
        }
        String str = this.f1255a ? "StackMap" : "StackMapTable";
        int size = arrayList.size();
        if (size == 0) {
            new ClassJ(kVar, c0165n, dVar, true).m150b(str);
        } else {
            if (this.f1255a) {
                c[] cVarArr = new c[size];
                arrayList.toArray(cVarArr);
                nVar = new l(cVarArr);
            } else {
                m[] mVarArr = new m[size];
                arrayList.toArray(mVarArr);
                nVar = new n(mVarArr);
            }
            ((a) nVar).a = new ae(kVar).c(str);
            new ClassJ(kVar, c0165n, dVar, true).m149a((a) nVar);
        }
        this.f1260f.m284a(cVar, interfaceC0162j, dVar);
    }
}
