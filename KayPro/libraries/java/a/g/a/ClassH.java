package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.c.ae;
import a.b.d.a.d;
import a.b.f.w;
import a.b.k;
import java.util.Arrays;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassG;
import a.b.d.ClassH;
import a.b.d.ClassJ;
import a.b.d.ClassK;
import a.d.ClassK;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.ao;
import a.g.b.ap;
import a.j.ClassL;

public class ClassH extends w implements i, d {

    private static final int f789a = Float.floatToIntBits(0.0f);

    private static final long f790b = Double.doubleToLongBits(0.0d);

    private final d f791c;

    private final ClassV f792d;

    private final ap f793e;

    private final ClassV f794f;

    public ClassH() {
        this(new ClassV(), null);
    }

    public ClassH(ClassV c0349v, d dVar) {
        this.f793e = new ap(true, true);
        this.f794f = new ClassV(true, true);
        this.f792d = c0349v;
        this.f791c = dVar;
    }

    private void m2036a(c cVar, int i, int i2, Abstracti abstractC0054i) {
        this.f794f.m316c(i, new Abstractc[]{new ClassH((byte) 95), new ClassH((byte) 87)});
        this.f794f.m311b(i2, abstractC0054i);
        if (this.f791c != null) {
            abstractC0054i.mo324a(cVar, null, null, i2, this.f791c);
        }
    }

    private void m2037a(c cVar, int i, ClassA c0042a) {
        int i2 = c0042a.f133a + i;
        if (!this.f792d.m2201e(i2) || this.f792d.m2208l(i2).m1324e() == 1) {
            m2063h(cVar, i, c0042a);
        } else {
            if (this.f792d.m2196a(c0042a.mo322a(i) + i)) {
                return;
            }
            m2064i(cVar, c0042a.mo322a(i) + i, c0042a);
        }
    }

    private void m2038a(c cVar, int i, Abstractc abstractC0048c) {
        Abstractbd abstractC0206bdC = this.f792d.m2207k(i).m1643c(0);
        if (abstractC0206bdC.mo1321c()) {
            switch (abstractC0206bdC.mo1331j()) {
                case 1:
                    m2051b(cVar, i, abstractC0048c);
                    break;
                case 2:
                    m2056c(cVar, i, abstractC0048c);
                    break;
                case 3:
                    m2058d(cVar, i, abstractC0048c);
                    break;
                case 4:
                    m2060e(cVar, i, abstractC0048c);
                    break;
                case 5:
                    m2061f(cVar, i, abstractC0048c);
                    break;
            }
        }
    }

    private void m2039a(c cVar, int i, Abstractc abstractC0048c, byte b, int i2) {
        m2041a(cVar, i, abstractC0048c, new ClassH(b, i2));
    }

    private void m2040a(c cVar, int i, Abstractc abstractC0048c, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2207k(i).m1643c(0);
        if (abstractC0206bdC.mo1321c()) {
            int iMo1357e = abstractC0206bdC.mo1404r().mo1357e();
            if (((short) iMo1357e) == iMo1357e) {
                m2039a(cVar, i, abstractC0048c, (byte) 17, iMo1357e);
                return;
            } else {
                m2041a(cVar, i, abstractC0048c, new ClassB((byte) 18, new ae((k) cVar).a(iMo1357e)));
                return;
            }
        }
        if (abstractC0206bdC.mo1309d()) {
            ClassK c0241kM2204h = this.f792d.m2204h(i);
            for (int i3 = 0; i3 < i2; i3++) {
                if (abstractC0206bdC.equals(c0241kM2204h.m1678d(i3))) {
                    m2052b(cVar, i, abstractC0048c, (byte) 21, i3);
                    return;
                }
            }
        }
    }

    private void m2041a(c cVar, int i, Abstractc abstractC0048c, Abstractc abstractC0048c2) {
        m2055c(i, abstractC0048c.mo349a(cVar) - abstractC0048c2.mo349a(cVar));
        this.f794f.m311b(i, abstractC0048c2);
        if (this.f791c != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f791c);
        }
    }

    private void m2042a(c cVar, int i, Abstractc abstractC0048c, String str) {
        ae aeVar = new ae((k) cVar);
        this.f794f.m316c(i, new Abstractc[]{new ClassB((byte) -69, aeVar.a(str, (c) null)), new ClassH((byte) 89), new ClassB((byte) -73, aeVar.c(str, "<init>", "()V", (c) null, (Interfacei) null)), new ClassH((byte) -65)});
        if (this.f791c != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f791c);
        }
    }

    private void m2043a(c cVar, int i, ClassG c0052g) {
        int i2;
        int i3 = 0;
        int i4 = c0052g.f151b;
        int[] iArr = c0052g.f152d;
        int length = iArr.length;
        int i5 = length;
        for (int i6 : iArr) {
            if (i6 == i4) {
                i5--;
            }
        }
        if (i5 < length) {
            if (i5 <= 0) {
                m2041a(cVar, i, c0052g, new ClassA((byte) -89, i4));
                return;
            }
            int[] iArr2 = c0052g.f149a;
            int[] iArr3 = new int[i5];
            int[] iArr4 = new int[i5];
            int i7 = 0;
            while (i7 < length) {
                if (iArr[i7] != i4) {
                    iArr3[i3] = iArr[i7];
                    i2 = i3 + 1;
                    iArr4[i3] = iArr2[i7];
                } else {
                    i2 = i3;
                }
                i7++;
                i3 = i2;
            }
            c0052g.f152d = iArr3;
            c0052g.f149a = iArr4;
            m2041a(cVar, i, c0052g, c0052g);
        }
    }

    private void m2044a(c cVar, int i, Abstracti abstractC0054i) {
        ad c0179adM2209m = this.f792d.m2209m(i);
        int iM1317a = c0179adM2209m.m1317a(c0179adM2209m.m1324e() - 1) - i;
        int[] iArr = abstractC0054i.f152d;
        Abstracti abstractC0054i2 = null;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!c0179adM2209m.m1320b(iArr[i2] + i)) {
                iArr[i2] = iM1317a;
                abstractC0054i2 = abstractC0054i;
            }
        }
        if (!c0179adM2209m.m1320b(abstractC0054i.f151b + i)) {
            abstractC0054i.f151b = iM1317a;
            abstractC0054i2 = abstractC0054i;
        }
        if (abstractC0054i2 != null) {
            m2041a(cVar, i, abstractC0054i, abstractC0054i2);
        }
    }

    private void m2045a(c cVar, int i, ClassJ c0055j) {
        int i2 = c0055j.f151b;
        int[] iArr = c0055j.f152d;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length && iArr[i3] == i2) {
            i3++;
        }
        int i4 = length - 1;
        while (i4 >= 0 && iArr[i4] == i2) {
            i4--;
        }
        int i5 = (i4 - i3) + 1;
        if (i5 < length) {
            if (i5 <= 0) {
                m2041a(cVar, i, c0055j, new ClassA((byte) -89, i2));
                return;
            }
            int[] iArr2 = new int[i5];
            System.arraycopy(iArr, i3, iArr2, 0, i5);
            c0055j.f152d = iArr2;
            c0055j.f153a += i3;
            c0055j.f154e -= (length - i5) - i3;
            m2041a(cVar, i, c0055j, c0055j);
        }
    }

    private void m2046a(c cVar, a.b.a.d dVar, int i, int i2, ClassG c0052g, Abstractap abstractC0191ap) {
        ao c0190ao = new ao();
        int[] iArr = c0052g.f149a;
        int[] iArr2 = c0052g.f152d;
        int[] iArr3 = new int[abstractC0191ap.mo1303a(c0190ao).mo1357e()];
        for (int i3 = 0; i3 < iArr3.length; i3++) {
            int iBinarySearch = Arrays.binarySearch(iArr, abstractC0191ap.mo1537a(c0190ao.mo1528a(i3), c0190ao).mo1357e());
            iArr3[i3] = iBinarySearch >= 0 ? iArr2[iBinarySearch] : c0052g.f151b;
        }
        ClassJ c0055j = new ClassJ((byte) -86, c0052g.f151b, 0, iArr3.length - 1, iArr3);
        m2036a(cVar, i, i2, c0055j);
        m2044a(cVar, i2, (Abstracti) c0055j);
        m2045a(cVar, i2, c0055j);
    }

    private void m2047a(c cVar, a.b.a.d dVar, int i, int i2, ClassJ c0055j, Abstractap abstractC0191ap) {
        ao c0190ao = new ao();
        int[] iArr = c0055j.f152d;
        int[] iArr2 = new int[abstractC0191ap.mo1303a(c0190ao).mo1357e()];
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            int iMo1357e = abstractC0191ap.mo1537a(c0190ao.mo1528a(i3), c0190ao).mo1357e();
            iArr2[i3] = (iMo1357e < c0055j.f153a || iMo1357e > c0055j.f154e) ? c0055j.f151b : iArr[iMo1357e - c0055j.f153a];
        }
        c0055j.f153a = 0;
        c0055j.f154e = iArr2.length - 1;
        c0055j.f152d = iArr2;
        m2036a(cVar, i, i2, c0055j);
        m2044a(cVar, i2, (Abstracti) c0055j);
        m2045a(cVar, i2, c0055j);
    }

    private void m2048a(c cVar, a.b.a.d dVar, int i, ClassG c0052g) {
        ad c0179adMo1335n_ = this.f792d.m2206j(i).m1665f(0).mo1335n_();
        if (c0179adMo1335n_.m1324e() == 1) {
            int iM1317a = c0179adMo1335n_.m1317a(0);
            if (dVar.f[iM1317a] != 46 || this.f794f.m320f(iM1317a)) {
                return;
            }
            Abstractap abstractC0191apMo1558l_ = this.f792d.m2206j(iM1317a).m1643c(1).mo1558l_();
            if (abstractC0191apMo1558l_.mo1321c()) {
                m2046a(cVar, dVar, iM1317a, i, c0052g, abstractC0191apMo1558l_);
            }
        }
    }

    private void m2049a(c cVar, a.b.a.d dVar, int i, ClassJ c0055j) {
        ad c0179adMo1335n_ = this.f792d.m2206j(i).m1665f(0).mo1335n_();
        if (c0179adMo1335n_.m1324e() == 1) {
            int iM1317a = c0179adMo1335n_.m1317a(0);
            if (dVar.f[iM1317a] != 46 || this.f794f.m320f(iM1317a)) {
                return;
            }
            Abstractap abstractC0191apMo1558l_ = this.f792d.m2206j(iM1317a).m1643c(1).mo1558l_();
            if (abstractC0191apMo1558l_.mo1321c()) {
                m2047a(cVar, dVar, iM1317a, i, c0055j, abstractC0191apMo1558l_);
            }
        }
    }

    private boolean m2050a(int i, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2206j(i).m1643c(0);
        switch (i2) {
            case 1:
                return abstractC0206bdC.mo1331j() == 1 && abstractC0206bdC.mo1321c() && abstractC0206bdC.mo1404r().mo1357e() == 0;
            case 2:
                return abstractC0206bdC.mo1331j() == 2 && abstractC0206bdC.mo1321c() && abstractC0206bdC.mo1466k_().mo1442e() == 0;
            case 3:
                return abstractC0206bdC.mo1331j() == 3 && abstractC0206bdC.mo1321c() && abstractC0206bdC.mo1590l().mo1527o_() == 0.0f;
            case 4:
                return abstractC0206bdC.mo1331j() == 4 && abstractC0206bdC.mo1321c() && abstractC0206bdC.mo1589i().mo1503m_() == 0.0d;
            default:
                return false;
        }
    }

    private void m2051b(c cVar, int i, Abstractc abstractC0048c) {
        m2040a(cVar, i, abstractC0048c, this.f792d.m2204h(i).m1674a());
    }

    private void m2052b(c cVar, int i, Abstractc abstractC0048c, byte b, int i2) {
        m2041a(cVar, i, abstractC0048c, new ClassK(b, i2));
    }

    private void m2053b(c cVar, int i, Abstractc abstractC0048c, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2207k(i).m1643c(0);
        if (abstractC0206bdC.mo1321c()) {
            long jMo1442e = abstractC0206bdC.mo1466k_().mo1442e();
            if (jMo1442e == 0 || jMo1442e == 1) {
                m2039a(cVar, i, abstractC0048c, (byte) 9, (int) jMo1442e);
                return;
            } else {
                m2041a(cVar, i, abstractC0048c, new ClassB((byte) 20, new ae((k) cVar).a(jMo1442e)));
                return;
            }
        }
        if (abstractC0206bdC.mo1309d()) {
            ClassK c0241kM2204h = this.f792d.m2204h(i);
            for (int i3 = 0; i3 < i2; i3++) {
                if (abstractC0206bdC.equals(c0241kM2204h.m1678d(i3)) && c0241kM2204h.m1678d(i3 + 1) != null && c0241kM2204h.m1678d(i3 + 1).mo1331j() == 7) {
                    m2052b(cVar, i, abstractC0048c, (byte) 22, i3);
                }
            }
        }
    }

    private boolean m2054b(int i, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2206j(i).m1643c(i2);
        return abstractC0206bdC.mo1331j() == 5 && abstractC0206bdC.mo1321c() && abstractC0206bdC.mo1558l_().mo1559m() == 1;
    }

    private void m2055c(int i, int i2) {
        switch (i2) {
            case 0:
                break;
            case 1:
                this.f794f.m278a(i, new ClassH((byte) 87));
                break;
            case 2:
                this.f794f.m278a(i, new ClassH((byte) 88));
                break;
            default:
                Abstractc[] abstractC0048cArr = new Abstractc[(i2 / 2) + (i2 % 2)];
                ClassH c0053h = new ClassH((byte) 88);
                for (int i3 = 0; i3 < i2 / 2; i3++) {
                    abstractC0048cArr[i3] = c0053h;
                }
                if (i2 % 2 == 1) {
                    abstractC0048cArr[i2 / 2] = new ClassH((byte) 87);
                }
                this.f794f.m312b(i, abstractC0048cArr);
                break;
        }
    }

    private void m2056c(c cVar, int i, Abstractc abstractC0048c) {
        m2053b(cVar, i, abstractC0048c, this.f792d.m2204h(i).m1674a());
    }

    private void m2057c(c cVar, int i, Abstractc abstractC0048c, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2207k(i).m1643c(0);
        if (!abstractC0206bdC.mo1321c()) {
            if (abstractC0206bdC.mo1309d()) {
                ClassK c0241kM2204h = this.f792d.m2204h(i);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (abstractC0206bdC.equals(c0241kM2204h.m1678d(i3))) {
                        m2052b(cVar, i, abstractC0048c, (byte) 23, i3);
                    }
                }
                return;
            }
            return;
        }
        float fMo1527o_ = abstractC0206bdC.mo1590l().mo1527o_();
        if ((fMo1527o_ == 0.0f && Float.floatToIntBits(fMo1527o_) == f789a) || fMo1527o_ == 1.0f || fMo1527o_ == 2.0f) {
            m2039a(cVar, i, abstractC0048c, (byte) 11, (int) fMo1527o_);
        } else {
            m2041a(cVar, i, abstractC0048c, new ClassB((byte) 18, new ae((k) cVar).a(fMo1527o_)));
        }
    }

    private void m2058d(c cVar, int i, Abstractc abstractC0048c) {
        m2057c(cVar, i, abstractC0048c, this.f792d.m2204h(i).m1674a());
    }

    private void m2059d(c cVar, int i, Abstractc abstractC0048c, int i2) {
        Abstractbd abstractC0206bdC = this.f792d.m2207k(i).m1643c(0);
        if (abstractC0206bdC.mo1321c()) {
            double dMo1503m_ = abstractC0206bdC.mo1589i().mo1503m_();
            if ((dMo1503m_ == 0.0d && Double.doubleToLongBits(dMo1503m_) == f790b) || dMo1503m_ == 1.0d) {
                m2039a(cVar, i, abstractC0048c, (byte) 14, (int) dMo1503m_);
                return;
            } else {
                m2041a(cVar, i, abstractC0048c, new ClassB((byte) 20, new ae((k) cVar).a(dMo1503m_)));
                return;
            }
        }
        if (abstractC0206bdC.mo1309d()) {
            ClassK c0241kM2204h = this.f792d.m2204h(i);
            for (int i3 = 0; i3 < i2; i3++) {
                if (abstractC0206bdC.equals(c0241kM2204h.m1678d(i3)) && c0241kM2204h.m1678d(i3 + 1) != null && c0241kM2204h.m1678d(i3 + 1).mo1331j() == 7) {
                    m2052b(cVar, i, abstractC0048c, (byte) 24, i3);
                }
            }
        }
    }

    private void m2060e(c cVar, int i, Abstractc abstractC0048c) {
        m2059d(cVar, i, abstractC0048c, this.f792d.m2204h(i).m1674a());
    }

    private void m2061f(c cVar, int i, Abstractc abstractC0048c) {
        if (this.f792d.m2207k(i).m1643c(0).mo1558l_().mo1559m() == 1) {
            m2039a(cVar, i, abstractC0048c, (byte) 1, 0);
        }
    }

    private void m2062g(c cVar, int i, Abstractc abstractC0048c) {
        if (this.f792d.m2200d(i)) {
            if (!this.f792d.m2201e(i) || this.f792d.m2208l(i).m1324e() == 1) {
                this.f794f.m314c(i);
            }
        }
    }

    private void m2063h(c cVar, int i, Abstractc abstractC0048c) {
        int iM1317a;
        ad c0179adM2209m = this.f792d.m2209m(i);
        if (c0179adM2209m == null || c0179adM2209m.m1324e() != 1 || (iM1317a = c0179adM2209m.m1317a(0) - i) == abstractC0048c.mo322a(i)) {
            return;
        }
        m2041a(cVar, i, abstractC0048c, new ClassA((byte) -89, iM1317a));
    }

    private void m2064i(c cVar, int i, Abstractc abstractC0048c) {
        this.f794f.m311b(i, new ClassA((byte) -89, 0));
        if (this.f791c != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f791c);
        }
    }

    public void m2065a(c cVar, a aVar) {
    }

    public void m2066a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m2073b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while simplifying instructions after partial evaluation:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            ClassL.m3161a("Not optimizing this method");
        }
    }

    public void m2067a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        switch (c0042a.f147c) {
            case -89:
            case -56:
                break;
            case -88:
            case -55:
                m2037a(cVar, i, c0042a);
                break;
            default:
                m2063h(cVar, i, c0042a);
                break;
        }
    }

    public void m2068a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -76:
            case -72:
                break;
            case -77:
            case -75:
            case -70:
            case -69:
            case -68:
            case -67:
            case -66:
            case -65:
            default:
                return;
            case -74:
            case -73:
            case -71:
                if (ap.f949a && m2054b(i, c0047b.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0047b, "java/lang/NullPointerException");
                    return;
                }
                break;
            case -64:
                m2061f(cVar, i, c0047b);
                return;
        }
        if (c0047b.mo367b(cVar) <= 0 || this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0047b)) {
            return;
        }
        m2038a(cVar, i, c0047b);
    }

    public void m2069a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassG c0052g) {
        m2063h(cVar, i, c0052g);
        if (this.f794f.m320f(i)) {
            return;
        }
        m2048a(cVar, dVar, i, c0052g);
        if (this.f794f.m320f(i)) {
            return;
        }
        m2044a(cVar, i, (Abstracti) c0052g);
        m2043a(cVar, i, c0052g);
    }

    public void m2070a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -128:
            case -126:
            case -120:
            case -117:
            case -114:
            case -111:
            case -110:
            case -109:
            case 96:
            case 100:
            case 104:
            case 116:
            case 120:
            case 122:
            case 124:
            case 126:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2051b(cVar, i, c0053h);
                }
                break;
            case -127:
            case -125:
            case -123:
            case -116:
            case -113:
            case 97:
            case 101:
            case 105:
            case 117:
            case 121:
            case 123:
            case 125:
            case 127:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2056c(cVar, i, c0053h);
                }
                break;
            case -122:
            case -119:
            case -112:
            case 98:
            case 102:
            case 106:
            case 118:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2058d(cVar, i, c0053h);
                }
                break;
            case -121:
            case -118:
            case -115:
            case 99:
            case 103:
            case 107:
            case 119:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2060e(cVar, i, c0053h);
                }
                break;
            case -66:
            case 46:
            case 51:
            case 52:
            case 53:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2051b(cVar, i, c0053h);
                } else if (m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                }
                break;
            case 47:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2056c(cVar, i, c0053h);
                } else if (m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                }
                break;
            case 48:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2058d(cVar, i, c0053h);
                } else if (m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                }
                break;
            case 49:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2060e(cVar, i, c0053h);
                } else if (m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                }
                break;
            case 50:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2061f(cVar, i, c0053h);
                } else if (m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                }
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                if (ap.f949a && m2054b(i, c0053h.mo349a(cVar) - 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/NullPointerException");
                    break;
                }
                break;
            case 108:
            case 112:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2051b(cVar, i, c0053h);
                } else if (m2050a(i, 1)) {
                    m2042a(cVar, i, c0053h, "java/lang/ArithmeticException");
                }
                break;
            case 109:
            case 113:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2056c(cVar, i, c0053h);
                } else if (m2050a(i, 2)) {
                    m2042a(cVar, i, c0053h, "java/lang/ArithmeticException");
                }
                break;
            case 110:
            case 114:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2058d(cVar, i, c0053h);
                } else if (m2050a(i, 3)) {
                    m2042a(cVar, i, c0053h, "java/lang/ArithmeticException");
                }
                break;
            case 111:
            case 115:
                if (!this.f793e.m2460b(cVar, interfaceC0162j, dVar, i, c0053h)) {
                    m2060e(cVar, i, c0053h);
                } else if (m2050a(i, 4)) {
                    m2042a(cVar, i, c0053h, "java/lang/ArithmeticException");
                }
                break;
        }
    }

    public void m2071a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassJ c0055j) {
        m2063h(cVar, i, c0055j);
        if (this.f794f.m320f(i)) {
            return;
        }
        m2049a(cVar, dVar, i, c0055j);
        if (this.f794f.m320f(i)) {
            return;
        }
        m2044a(cVar, i, (Abstracti) c0055j);
        m2045a(cVar, i, c0055j);
    }

    public void m2072a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        int i2 = c0056k.f156b;
        switch (c0056k.f147c) {
            case -87:
                m2063h(cVar, i, c0056k);
                break;
            case 21:
            case 26:
            case 27:
            case 28:
            case 29:
                m2040a(cVar, i, c0056k, i2);
                break;
            case 22:
            case 30:
            case 31:
            case 32:
            case 33:
                m2053b(cVar, i, c0056k, i2);
                break;
            case 23:
            case 34:
            case 35:
            case 36:
            case 37:
                m2057c(cVar, i, c0056k, i2);
                break;
            case 24:
            case 38:
            case 39:
            case 40:
            case 41:
                m2059d(cVar, i, c0056k, i2);
                break;
            case 25:
            case 42:
            case 43:
            case 44:
            case 45:
                m2061f(cVar, i, c0056k);
                break;
            case 58:
            case 75:
            case 76:
            case 77:
            case 78:
                m2062g(cVar, i, c0056k);
                break;
        }
    }

    public void m2073b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f792d.m2194a(cVar, interfaceC0162j, dVar);
        int i = dVar.e;
        this.f794f.m277a(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f792d.m2196a(i2)) {
                ClassE.m387a(dVar.f, i2).mo324a(cVar, interfaceC0162j, dVar, i2, this);
            }
        }
        this.f794f.m284a(cVar, interfaceC0162j, dVar);
    }
}
