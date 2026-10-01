package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import java.util.Arrays;
import java.util.Stack;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassE;
import a.b.g.aa;
import a.d.ClassA;
import a.d.ClassB;
import a.d.ClassG;
import a.d.ClassJ;
import a.d.ClassK;
import a.d.ClassL;
import a.d.Interfacef;
import a.d.a.ad;
import a.d.a.ClassC;
import a.d.a.Interfacebe;
import a.g.c.ClassA;
import a.j.ClassL;

public class ClassV extends w implements i, l {

    private final Interfacebe f843a;

    private final Interfacef f844b;

    private final boolean f845c;

    private final d f846d;

    private ad[] f847e;

    private ad[] f848f;

    private ClassK[] f849g;

    private ClassJ[] f850h;

    private ClassK[] f851i;

    private ClassJ[] f852j;

    private boolean[] f853k;

    private int[] f854l;

    private boolean f855m;

    private int f856n;

    private final ClassA f857o;

    private final ClassA f858p;

    private final Stack f859q;

    private final Stack f860r;

    public ClassV() {
        this(new ClassC());
    }

    public ClassV(Interfacebe interfaceC0207be) {
        this(interfaceC0207be, new ClassB(interfaceC0207be), true);
    }

    public ClassV(Interfacebe interfaceC0207be, Interfacef interfaceC0236f, boolean z) {
        this(interfaceC0207be, interfaceC0236f, z, null);
    }

    public ClassV(Interfacebe interfaceC0207be, Interfacef interfaceC0236f, boolean z, d dVar) {
        this(interfaceC0207be, interfaceC0236f, z, dVar, z ? new ClassA() : new ai(), new ClassA(), null);
    }

    private ClassV(Interfacebe interfaceC0207be, Interfacef interfaceC0236f, boolean z, d dVar, ClassA c0174a, ClassA c0409a, Stack stack) {
        this.f847e = new ad[8096];
        this.f848f = new ad[8096];
        this.f849g = new ClassK[8096];
        this.f850h = new ClassJ[8096];
        this.f851i = new ClassK[8096];
        this.f852j = new ClassJ[8096];
        this.f853k = new boolean[8096];
        this.f854l = new int[8096];
        this.f860r = new Stack();
        this.f843a = interfaceC0207be;
        this.f844b = interfaceC0236f;
        this.f845c = z;
        this.f846d = dVar;
        this.f857o = c0174a;
        this.f858p = c0409a;
        this.f859q = stack == null ? this.f860r : stack;
    }

    private ClassV(ClassV c0349v) {
        this(c0349v.f843a, c0349v.f844b, c0349v.f845c, c0349v.f846d, c0349v.f857o, c0349v.f858p, c0349v.f860r);
    }

    private void m2179a(int i, int i2, boolean z, ClassK c0241k) {
        boolean z2;
        int i3;
        boolean z3 = true;
        int i4 = -1;
        int i5 = i;
        while (i5 < i2) {
            if (m2196a(i5)) {
                ClassK c0241k2 = this.f849g[i5];
                if (z3) {
                    c0241k.m1670a(c0241k2);
                    z3 = false;
                } else {
                    c0241k.m1671a(c0241k2, false);
                }
                z2 = z3;
                i3 = i5;
            } else {
                int i6 = i4;
                z2 = z3;
                i3 = i6;
            }
            i5++;
            int i7 = i3;
            z3 = z2;
            i4 = i7;
        }
        if (z && i4 >= 0) {
            ClassK c0241k3 = this.f851i[i4];
            if (z3) {
                c0241k.m1670a(c0241k3);
            } else {
                c0241k.m1671a(c0241k3, false);
            }
        }
        if (z3) {
            c0241k.mo1672b(c0241k.m1674a());
        }
    }

    private void m2180a(a.b.a.d dVar) {
        int i = dVar.e;
        if (this.f847e.length < i) {
            this.f847e = new ad[i];
            this.f848f = new ad[i];
            this.f849g = new ClassK[i];
            this.f850h = new ClassJ[i];
            this.f851i = new ClassK[i];
            this.f852j = new ClassJ[i];
            this.f853k = new boolean[i];
            this.f854l = new int[i];
        } else {
            Arrays.fill(this.f847e, 0, this.f856n, (Object) null);
            Arrays.fill(this.f848f, 0, this.f856n, (Object) null);
            Arrays.fill(this.f853k, 0, this.f856n, false);
            Arrays.fill(this.f854l, 0, this.f856n, 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f849g[i2] != null) {
                    this.f849g[i2].mo1672b(dVar.d);
                }
                if (this.f850h[i2] != null) {
                    this.f850h[i2].mo1636a(dVar.c);
                }
                if (this.f851i[i2] != null) {
                    this.f851i[i2].mo1672b(dVar.d);
                }
                if (this.f852j[i2] != null) {
                    this.f852j[i2].mo1636a(dVar.c);
                }
            }
            for (int i3 = i; i3 < this.f856n; i3++) {
                if (this.f849g[i3] != null) {
                    this.f849g[i3].mo1672b(0);
                }
                if (this.f850h[i3] != null) {
                    this.f850h[i3].mo1636a(0);
                }
                if (this.f851i[i3] != null) {
                    this.f851i[i3].mo1672b(0);
                }
                if (this.f852j[i3] != null) {
                    this.f852j[i3].mo1636a(0);
                }
            }
        }
        this.f856n = i;
    }

    private void m2181a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        aa c0097aa = new aa(i, i2, this);
        do {
            this.f855m = false;
            dVar.a(cVar, interfaceC0162j, i, i2, c0097aa);
        } while (this.f855m);
    }

    private void m2182a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassK c0241k) {
        ClassL c0242l = new ClassL(dVar.d);
        this.f844b.mo1624a(cVar, interfaceC0162j, c0242l);
        c0241k.m1675a(c0242l);
        for (int i = 0; i < c0242l.m1674a(); i++) {
            c0241k.m1668a(i, new ad(16777216 | i));
        }
    }

    private void m2183a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassK c0241k, ClassJ c0240j, int i) {
        m2187b(cVar, interfaceC0162j, dVar, c0241k, c0240j, i);
        while (!this.f860r.empty()) {
            ClassX c0351x = (ClassX) this.f860r.pop();
            m2187b(cVar, interfaceC0162j, dVar, c0351x.f861a, c0351x.f862b, c0351x.f863c);
        }
    }

    private void m2184a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassK c0241k, ClassJ c0240j, int i, int i2) {
        m2183a(cVar, interfaceC0162j, dVar, c0241k, c0240j, i);
        m2181a(cVar, interfaceC0162j, dVar, i, i2);
    }

    private void m2185a(ClassK c0241k, ClassJ c0240j, int i) {
        this.f859q.push(new ClassX(c0241k, c0240j, i));
    }

    private void m2186a(ClassV c0349v, int i, int i2) {
        while (i < i2) {
            if (c0349v.f847e[i] != null) {
                this.f847e[i] = this.f847e[i] == null ? c0349v.f847e[i] : this.f847e[i].m1318a(c0349v.f847e[i]);
            }
            if (c0349v.m2196a(i)) {
                if (c0349v.f848f[i] != null) {
                    this.f848f[i] = this.f848f[i] == null ? c0349v.f848f[i] : this.f848f[i].m1318a(c0349v.f848f[i]);
                }
                if (this.f854l[i] == 0) {
                    this.f849g[i] = c0349v.f849g[i];
                    this.f850h[i] = c0349v.f850h[i];
                    this.f851i[i] = c0349v.f851i[i];
                    this.f852j[i] = c0349v.f852j[i];
                    this.f853k[i] = c0349v.f853k[i];
                    this.f854l[i] = c0349v.f854l[i];
                } else {
                    this.f849g[i].m1671a(c0349v.f849g[i], false);
                    this.f850h[i].m1662b(c0349v.f850h[i]);
                    this.f851i[i].m1671a(c0349v.f851i[i], false);
                    this.f852j[i].m1662b(c0349v.f852j[i]);
                    int[] iArr = this.f854l;
                    iArr[i] = iArr[i] + c0349v.f854l[i];
                }
            }
            i++;
        }
    }

    private void m2187b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassK c0241k, ClassJ c0240j, int i) {
        int iMo322a;
        byte[] bArr = dVar.f;
        ClassG c0237g = new ClassG(c0241k, c0240j, this.f843a, this.f857o, this.f844b, this.f845c);
        int i2 = i;
        int i3 = i;
        while (true) {
            int i4 = i2 < i3 ? i3 : i2;
            int i5 = this.f854l[i3];
            if (i5 == 0) {
                if (this.f849g[i3] == null) {
                    this.f849g[i3] = new ClassK(c0241k);
                    this.f850h[i3] = new ClassJ(c0240j);
                } else {
                    this.f849g[i3].m1670a(c0241k);
                    this.f850h[i3].m1660a(c0240j);
                }
                this.f853k[i3] = true;
            } else {
                boolean zM1671a = this.f849g[i3].m1671a(c0241k, true);
                boolean zM1662b = this.f850h[i3].m1662b(c0240j);
                if (!zM1671a && !zM1662b && this.f853k[i3]) {
                    return;
                }
                if (i5 >= 5) {
                    c0241k.m1671a(this.f849g[i3], false);
                    c0240j.m1662b(this.f850h[i3]);
                    this.f853k[i3] = true;
                } else {
                    this.f853k[i3] = false;
                }
            }
            int[] iArr = this.f854l;
            iArr[i3] = iArr[i3] + 1;
            ad c0179ad = new ad(i3);
            c0241k.m1669a(c0179ad);
            c0240j.m1661b(c0179ad);
            Abstractc abstractC0048cM387a = ClassE.m387a(bArr, i3);
            this.f857o.mo1296a();
            if (this.f846d != null) {
                abstractC0048cM387a.mo324a(cVar, interfaceC0162j, dVar, i3, this.f846d);
            }
            try {
                abstractC0048cM387a.mo324a(cVar, interfaceC0162j, dVar, i3, c0237g);
                ad c0179adM1300c = this.f857o.m1300c();
                int iM1324e = c0179adM1300c.m1324e();
                if (i5 != 0) {
                    this.f851i[i3].m1671a(c0241k, true);
                    this.f852j[i3].m1662b(c0240j);
                } else if (this.f851i[i3] == null) {
                    this.f851i[i3] = new ClassK(c0241k);
                    this.f852j[i3] = new ClassJ(c0240j);
                } else {
                    this.f851i[i3].m1670a(c0241k);
                    this.f852j[i3].m1660a(c0240j);
                }
                if (this.f857o.m1299b()) {
                    this.f848f[i3] = this.f848f[i3] == null ? c0179adM1300c : this.f848f[i3].m1318a(c0179adM1300c);
                    if (iM1324e == 0) {
                        return;
                    }
                    ad c0179ad2 = new ad(i3);
                    for (int i6 = 0; i6 < iM1324e; i6++) {
                        int iM1317a = c0179adM1300c.m1317a(i6);
                        this.f847e[iM1317a] = this.f847e[iM1317a] == null ? c0179ad2 : this.f847e[iM1317a].m1318a(c0179ad2);
                    }
                    if (iM1324e > 1) {
                        for (int i7 = 0; i7 < iM1324e; i7++) {
                            m2188b(new ClassK(c0241k), new ClassJ(c0240j), c0179adM1300c.m1317a(i7));
                        }
                        return;
                    }
                    iMo322a = c0179adM1300c.m1317a(0);
                } else {
                    iMo322a = i3 + abstractC0048cM387a.mo322a(i3);
                }
                if (abstractC0048cM387a.f147c == -88 || abstractC0048cM387a.f147c == -55) {
                    m2190c(cVar, interfaceC0162j, dVar, c0241k, c0240j, iMo322a);
                    return;
                } else if (abstractC0048cM387a.f147c == -87) {
                    m2185a(new ClassK(c0241k), new ClassJ(c0240j), iMo322a);
                    return;
                } else {
                    i2 = i4;
                    i3 = iMo322a;
                }
            } catch (RuntimeException e) {
                ClassL.m3161a("Unexpected error while evaluating instruction:");
                ClassL.m3161a("  Class       = [" + cVar.b() + "]");
                ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
                ClassL.m3161a("  Instruction = " + abstractC0048cM387a.mo333b(i3));
                ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
                throw e;
            }
        }
    }

    private void m2188b(ClassK c0241k, ClassJ c0240j, int i) {
        this.f860r.push(new ClassX(c0241k, c0240j, i));
    }

    private boolean m2189b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        while (i < i2) {
            if (m2196a(i) && (this.f845c || ClassE.m387a(dVar.f, i).m385e())) {
                return true;
            }
            i++;
        }
        return false;
    }

    private void m2190c(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, ClassK c0241k, ClassJ c0240j, int i) {
        int iM2647n = this.f858p.m2647n(i);
        ClassV c0349v = new ClassV(this);
        c0349v.m2180a(dVar);
        c0349v.m2184a(cVar, interfaceC0162j, dVar, c0241k, c0240j, i, iM2647n);
        m2186a(c0349v, 0, dVar.e);
    }

    public d m2191a(d dVar) {
        return m2192a(true, dVar);
    }

    public d m2192a(boolean z, d dVar) {
        return new ClassY(this, z, dVar);
    }

    public void m2193a(c cVar, a aVar) {
    }

    public void m2194a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m2197b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while performing partial evaluation:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m2195a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        int i = hVar.a;
        int i2 = hVar.b;
        if (m2189b(cVar, interfaceC0162j, dVar, i, i2)) {
            int i3 = hVar.c;
            int i4 = hVar.d;
            ClassK c0241k = new ClassK(dVar.d);
            ClassJ c0240j = new ClassJ(dVar.c);
            ad c0179ad = new ad(536870912 | i3);
            c0241k.m1669a(c0179ad);
            c0240j.m1661b(c0179ad);
            m2179a(i, i2, this.f845c, c0241k);
            this.f844b.mo1622a(cVar, interfaceC0162j, dVar, i3, i4, c0240j);
            int i5 = this.f854l[i3];
            m2183a(cVar, interfaceC0162j, dVar, c0241k, c0240j, i3);
            if (this.f855m) {
                return;
            }
            this.f855m = i5 < this.f854l[i3];
        }
    }

    public boolean m2196a(int i) {
        return this.f854l[i] > 0;
    }

    public void m2197b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        ClassK c0241k = new ClassK(dVar.d);
        ClassJ c0240j = new ClassJ(dVar.c);
        m2180a(dVar);
        m2182a(cVar, interfaceC0162j, dVar, c0241k);
        this.f860r.clear();
        this.f859q.clear();
        dVar.a(cVar, interfaceC0162j, this.f858p);
        m2184a(cVar, interfaceC0162j, dVar, c0241k, c0240j, 0, dVar.e);
    }

    public boolean m2198b(int i) {
        return this.f858p.m2639f(i) || this.f858p.m2642i(i);
    }

    public boolean m2199c(int i) {
        return this.f858p.m2642i(i);
    }

    public boolean m2200d(int i) {
        return this.f858p.m2644k(i);
    }

    public boolean m2201e(int i) {
        return this.f858p.m2646m(i);
    }

    public boolean m2202f(int i) {
        return this.f858p.m2635b(i);
    }

    public boolean m2203g(int i) {
        return this.f858p.m2636c(i);
    }

    public ClassK m2204h(int i) {
        return this.f849g[i];
    }

    public ClassK m2205i(int i) {
        return this.f851i[i];
    }

    public ClassJ m2206j(int i) {
        return this.f850h[i];
    }

    public ClassJ m2207k(int i) {
        return this.f852j[i];
    }

    public ad m2208l(int i) {
        return this.f847e[i];
    }

    public ad m2209m(int i) {
        return this.f848f[i];
    }
}
