package a.g.a;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import java.lang.reflect.Array;
import java.util.Arrays;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassE;
import a.d.ClassJ;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.ax;
import a.g.b.ap;
import a.j.ClassB;
import a.j.ClassL;

public class ClassJ extends w implements i {

    private final ClassV f800a;

    private final boolean f801b;

    private final ClassV f802c;

    private final ap f803d;

    private final ClassO f804e;

    private final ClassM f805f;

    private final ClassP f806g;

    private final ClassR f807h;

    private final ClassQ f808i;

    private final ClassL f809j;

    private ad[] f810k;

    private boolean[][] f811l;

    private boolean[][] f812m;

    private boolean[] f813n;

    private boolean[] f814o;

    private int f815p;

    public ClassJ() {
        this(new ClassV(), true);
    }

    public ClassJ(ClassV c0349v, boolean z) {
        C0338k c0338k = null;
        this.f802c = new ClassV(new ax());
        this.f803d = new ap(true, true);
        this.f804e = new ClassO(this);
        this.f805f = new ClassM(this);
        this.f806g = new ClassP(this);
        this.f807h = new ClassR(this);
        this.f808i = new ClassQ(this);
        this.f809j = new ClassL(this);
        this.f810k = new ad[8096];
        this.f811l = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 8096, 16);
        this.f812m = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 8096, 16);
        this.f813n = new boolean[8096];
        this.f814o = new boolean[8096];
        this.f800a = c0349v;
        this.f801b = z;
    }

    private void m2082a(int i, int i2, int i3, int i4) {
        if (m2123b(i3) || !m2111h(i, i2)) {
            return;
        }
        m2110h(i3);
    }

    public void m2083a(int i, int i2, ad c0179ad) {
        if (c0179ad == null || !c0179ad.m1320b(i)) {
            ad c0179ad2 = c0179ad == null ? new ad(i) : c0179ad.m1332j(i);
            ad c0179adMo1335n_ = this.f802c.m2204h(i).m1667a(i2).mo1335n_();
            int iM1324e = c0179adMo1335n_.m1324e();
            for (int i3 = 0; i3 < iM1324e; i3++) {
                if (!c0179adMo1335n_.m1322c(i3) && !c0179adMo1335n_.m1330i(i3)) {
                    m2099b(c0179adMo1335n_.m1317a(i3), i2, c0179ad2);
                }
            }
        }
    }

    public void m2084a(int i, int i2, boolean z) {
        if (m2118a(i, i2)) {
            return;
        }
        m2089a(this.f800a.m2206j(i).m1663d(i2).mo1335n_(), i2, z);
    }

    private void m2085a(int i, ad c0179ad, boolean z) {
        if (c0179ad != null) {
            int iM1324e = c0179ad.m1324e();
            for (int i2 = 0; i2 < iM1324e; i2++) {
                int iM1317a = c0179ad.m1317a(i2);
                if (z) {
                    m2082a(i, iM1317a, i, iM1317a);
                } else {
                    m2082a(i, iM1317a, iM1317a, i);
                }
            }
        }
    }

    private void m2086a(d dVar) {
        int i = dVar.e;
        int i2 = dVar.d;
        int i3 = dVar.c;
        this.f810k = (ad[]) ClassB.m3145b(this.f810k, i, (Object) null);
        if (this.f811l.length < i || this.f811l[0].length < i3) {
            this.f811l = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i, i3);
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                Arrays.fill(this.f811l[i4], 0, i3, false);
            }
        }
        if (this.f812m.length < i || this.f812m[0].length < i3) {
            this.f812m = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i, i3);
        } else {
            for (int i5 = 0; i5 < i; i5++) {
                Arrays.fill(this.f812m[i5], 0, i3, false);
            }
        }
        this.f813n = ClassB.m3140a(this.f813n, i, false);
        this.f814o = ClassB.m3140a(this.f814o, i, false);
    }

    public void m2087a(c cVar, int i, Abstractc abstractC0048c) {
        int iB = this.f800a.m2206j(i).m1639b();
        for (int iMo349a = iB - abstractC0048c.mo349a(cVar); iMo349a < iB; iMo349a++) {
            m2084a(i, iMo349a, true);
        }
    }

    private void m2088a(ad c0179ad) {
        int iM1324e = c0179ad.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            m2110h(c0179ad.m1317a(i));
        }
    }

    private void m2089a(ad c0179ad, int i, boolean z) {
        if (c0179ad != null) {
            int iM1324e = c0179ad.m1324e();
            for (int i2 = 0; i2 < iM1324e; i2++) {
                if (!c0179ad.m1330i(i2)) {
                    int iM1317a = c0179ad.m1317a(i2);
                    m2107f(iM1317a, i);
                    if (z) {
                        m2110h(iM1317a);
                    } else {
                        m2112i(iM1317a);
                    }
                }
            }
        }
    }

    public boolean m2096a(Abstractc abstractC0048c) {
        return abstractC0048c.f147c == 87 || abstractC0048c.f147c == 88;
    }

    private void m2099b(int i, int i2, ad c0179ad) {
        if (m2123b(i)) {
            return;
        }
        if (m2106e(i, i2)) {
            m2110h(i);
        } else {
            m2083a(i, i2, c0179ad);
        }
    }

    public void m2102c(int i, int i2, int i3) {
        if (m2127c(i, (this.f800a.m2207k(i).m1639b() - i2) - 1)) {
            m2084a(i, (this.f800a.m2206j(i).m1639b() - i3) - 1, true);
        }
    }

    public void m2105d(int i, int i2) {
        ad c0179adMo1335n_ = this.f800a.m2204h(i).m1667a(i2).mo1335n_();
        if (c0179adMo1335n_ != null) {
            int iM1324e = c0179adMo1335n_.m1324e();
            for (int i3 = 0; i3 < iM1324e; i3++) {
                if (!c0179adMo1335n_.m1322c(i3) && !c0179adMo1335n_.m1330i(i3)) {
                    m2110h(c0179adMo1335n_.m1317a(i3));
                }
            }
        }
    }

    private boolean m2106e(int i, int i2) {
        Abstractbd abstractC0206bdC = this.f802c.m2204h(i).m1677c(i2);
        if (abstractC0206bdC == null) {
            return true;
        }
        Abstractbd abstractC0206bdC2 = this.f802c.m2205i(i).m1677c(i2);
        if (abstractC0206bdC2.mo1331j() != abstractC0206bdC.mo1331j()) {
            return true;
        }
        if (abstractC0206bdC2.mo1331j() == 5 && (abstractC0206bdC2.mo1558l_().mo1559m() == 1 || !abstractC0206bdC2.mo1558l_().mo1555e().equals(abstractC0206bdC.mo1558l_().mo1555e()))) {
            return true;
        }
        ad c0179adMo1335n_ = this.f802c.m2204h(i).m1667a(i2).mo1335n_();
        return c0179adMo1335n_.m1324e() == 1 && c0179adMo1335n_.m1322c(0);
    }

    public void m2107f(int i, int i2) {
        if (m2127c(i, i2)) {
            return;
        }
        this.f811l[i][i2] = true;
        if (this.f815p < i) {
            this.f815p = i;
        }
    }

    private void m2108g(int i) {
        ad c0179ad = this.f810k[i];
        if (c0179ad != null) {
            m2088a(c0179ad);
        }
    }

    public void m2109g(int i, int i2) {
        this.f812m[i][i2] = true;
    }

    public void m2110h(int i) {
        if (m2123b(i)) {
            return;
        }
        this.f813n[i] = true;
        if (this.f815p < i) {
            this.f815p = i;
        }
    }

    private boolean m2111h(int i, int i2) {
        while (i < i2) {
            if (m2123b(i) || m2126c(i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void m2112i(int i) {
        if (m2123b(i) || m2126c(i)) {
            return;
        }
        this.f814o[i] = true;
        if (this.f815p < i) {
            this.f815p = i;
        }
    }

    public a.b.d.a.d m2113a(a.b.d.a.d dVar) {
        return m2121b(true, dVar);
    }

    public a.b.d.a.d m2114a(boolean z, a.b.d.a.d dVar) {
        return this.f800a.m2192a(z, dVar);
    }

    public void m2115a(c cVar, a aVar) {
    }

    public void m2116a(c cVar, Interfacej interfaceC0162j, d dVar) {
        try {
            m2122b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while marking instruction usage after partial evaluation:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public boolean m2117a(int i) {
        return this.f800a.m2196a(i);
    }

    public boolean m2118a(int i, int i2) {
        return this.f812m[i][i2];
    }

    public boolean m2119a(int i, int i2, int i3) {
        return m2124b(i, i2) || m2124b(i, i3);
    }

    public boolean m2120a(ad c0179ad, int i) {
        int iM1324e = c0179ad.m1324e();
        for (int i2 = 0; i2 < iM1324e; i2++) {
            if (c0179ad.m1330i(i2) || m2127c(c0179ad.m1317a(i2), i)) {
                return true;
            }
        }
        return false;
    }

    public a.b.d.a.d m2121b(boolean z, a.b.d.a.d dVar) {
        return new ClassN(this, z, dVar);
    }

    public void m2122b(c cVar, Interfacej interfaceC0162j, d dVar) {
        m2086a(dVar);
        if (this.f801b) {
            this.f800a.m2194a(cVar, interfaceC0162j, dVar);
        }
        this.f802c.m2194a(cVar, interfaceC0162j, dVar);
        int i = dVar.e;
        this.f815p = -1;
        dVar.a(cVar, interfaceC0162j, this.f800a.m2191a(this.f804e));
        dVar.a(cVar, interfaceC0162j, this.f800a.m2191a(this.f805f));
        while (this.f815p >= 0) {
            int i2 = this.f815p;
            this.f815p = i2 - 1;
            if (this.f800a.m2196a(i2)) {
                if (m2123b(i2)) {
                    ClassE.m387a(dVar.f, i2).mo324a(cVar, interfaceC0162j, dVar, i2, this.f806g);
                    m2108g(i2);
                }
                m2085a(i2, this.f800a.m2209m(i2), true);
                m2085a(i2, this.f800a.m2208l(i2), false);
            }
        }
        dVar.a(cVar, interfaceC0162j, m2113a(this.f807h));
        this.f815p = i - 1;
        while (this.f815p >= 0) {
            int i3 = this.f815p;
            this.f815p = i3 - 1;
            if (this.f800a.m2196a(i3)) {
                ClassE.m387a(dVar.f, i3).mo324a(cVar, interfaceC0162j, dVar, i3, this.f808i);
                m2085a(i3, this.f800a.m2209m(i3), true);
                m2085a(i3, this.f800a.m2208l(i3), false);
            }
        }
        this.f815p = i - 1;
        while (this.f815p >= 0) {
            int i4 = this.f815p;
            this.f815p = i4 - 1;
            if (this.f800a.m2196a(i4) && !m2123b(i4)) {
                ClassE.m387a(dVar.f, i4).mo324a(cVar, interfaceC0162j, dVar, i4, this.f809j);
                m2085a(i4, this.f800a.m2209m(i4), true);
                m2085a(i4, this.f800a.m2208l(i4), false);
            }
        }
    }

    public boolean m2123b(int i) {
        return this.f813n[i];
    }

    public boolean m2124b(int i, int i2) {
        return m2120a(this.f800a.m2206j(i).m1663d(i2).mo1335n_(), i2);
    }

    public boolean m2125b(int i, int i2, int i3) {
        return m2127c(i, i2) || m2127c(i, i3);
    }

    public boolean m2126c(int i) {
        return this.f814o[i];
    }

    public boolean m2127c(int i, int i2) {
        return (536870912 & i) != 0 || this.f811l[i][i2];
    }

    public ClassJ m2128d(int i) {
        return this.f800a.m2206j(i);
    }

    public ClassJ m2129e(int i) {
        return this.f800a.m2207k(i);
    }

    public ad m2130f(int i) {
        return this.f800a.m2209m(i);
    }
}
