package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.b.f.ClassB;
import a.b.f.ClassI;
import a.b.g.bj;
import a.b.g.Interfacebg;
import a.d.a.Abstractap;
import a.d.a.ad;
import a.d.a.ax;
import a.g.b.as;

public class ag extends w implements i, f, d, Interfacebg {

    private final d f763a;

    private final ClassV f764b;

    private final ClassV f765c;

    private final f f766d;

    private c f767e;

    private Interfacej f768f;

    private a.b.a.d f769g;

    private int f770h;

    private boolean f771i;

    public ag() {
        this(new ClassV(new ax()), null);
    }

    public ag(ClassV c0349v, d dVar) {
        this.f765c = new ClassV(true, true);
        this.f766d = new bj(new ClassB(false, this));
        this.f764b = c0349v;
        this.f763a = dVar;
    }

    private void m1969a(c cVar, int i, Abstractc abstractC0048c) {
        this.f765c.m314c(i);
        if (this.f763a != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f763a);
        }
    }

    private void m1970a(c cVar, int i, Abstractc abstractC0048c, Abstractc abstractC0048c2) {
        m1983c(i, abstractC0048c.mo349a(cVar) - abstractC0048c2.mo349a(cVar));
        this.f765c.m311b(i, abstractC0048c2);
        if (this.f763a != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f763a);
        }
    }

    private void m1971a(c cVar, int i, Abstractc abstractC0048c, String str, String str2) {
        if (str.equals("ordinal") && str2.equals("()I")) {
            m1972a(cVar, i, abstractC0048c, new Abstractc[]{new ClassH((byte) 4), new ClassH((byte) 100)});
        }
    }

    private void m1972a(c cVar, int i, Abstractc abstractC0048c, Abstractc[] abstractC0048cArr) {
        this.f765c.m316c(i, abstractC0048cArr);
        if (this.f763a != null) {
            abstractC0048c.mo324a(cVar, null, null, i, this.f763a);
        }
    }

    private void m1973a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i) {
        m1974a(cVar, interfaceC0162j, dVar, i, 0);
    }

    private void m1974a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        ad c0179adMo1335n_ = this.f764b.m2206j(i).m1666g(i2).mo1335n_();
        for (int i3 = 0; i3 < c0179adMo1335n_.m1324e(); i3++) {
            int iM1317a = c0179adMo1335n_.m1317a(i3);
            if (iM1317a >= 0 && dVar.f[iM1317a] == 1) {
                m1970a(cVar, iM1317a, new ClassH((byte) 1), new ClassH((byte) 3));
            }
        }
    }

    private boolean m1975a(int i) {
        Abstractap abstractC0191apMo1558l_ = this.f764b.m2207k(i).m1643c(0).mo1558l_();
        return m1982b(abstractC0191apMo1558l_.mo1556f()) && !ClassI.m773f(abstractC0191apMo1558l_.mo1555e());
    }

    private boolean m1976a(int i, int i2) {
        Abstractap abstractC0191apMo1558l_ = this.f764b.m2206j(i).m1643c(i2).mo1558l_();
        return m1982b(abstractC0191apMo1558l_.mo1556f()) && !ClassI.m773f(abstractC0191apMo1558l_.mo1555e());
    }

    private boolean m1977a(c cVar, int i) {
        this.f771i = false;
        cVar.a(i, this);
        return this.f771i;
    }

    private boolean m1978a(c cVar, Interfacej interfaceC0162j) {
        c[] cVarArr;
        String strM796s = ClassI.m796s(interfaceC0162j.mo949b(cVar));
        if (!ClassI.m784j(strM796s) || ClassI.m773f(strM796s) || (cVarArr = ((ClassN) interfaceC0162j).f437a) == null) {
            return false;
        }
        return m1982b(cVarArr[cVarArr.length - 1]);
    }

    private void m1979b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        ad c0179adMo1335n_ = this.f764b.m2204h(i).m1667a(i2).mo1335n_();
        for (int i3 = 0; i3 < c0179adMo1335n_.m1324e(); i3++) {
            if (!c0179adMo1335n_.m1322c(i3) && !c0179adMo1335n_.m1330i(i3)) {
                int iM1317a = c0179adMo1335n_.m1317a(i3);
                if (this.f764b.m2205i(iM1317a).m1677c(i2).mo1558l_().mo1559m() == 1) {
                    m1970a(cVar, iM1317a, new ClassK((byte) 58, i2), new ClassK((byte) 54, i2));
                    m1973a(cVar, interfaceC0162j, dVar, iM1317a);
                }
            }
        }
    }

    private boolean m1980b(int i) {
        return m1976a(i, 0);
    }

    private boolean m1981b(int i, int i2) {
        Abstractap abstractC0191apMo1558l_ = this.f764b.m2206j(i).m1643c(i2).mo1558l_();
        return m1982b(abstractC0191apMo1558l_.mo1556f()) && ClassI.m774g(abstractC0191apMo1558l_.mo1555e()) == 1;
    }

    private boolean m1982b(c cVar) {
        return cVar != null && as.m2467a(cVar);
    }

    private void m1983c(int i, int i2) {
        switch (i2) {
            case 0:
                break;
            case 1:
                this.f765c.m278a(i, new ClassH((byte) 87));
                break;
            case 2:
                this.f765c.m278a(i, new ClassH((byte) 88));
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
                this.f765c.m312b(i, abstractC0048cArr);
                break;
        }
    }

    public void m1984a(c cVar, a aVar) {
    }

    public void m1985a(c cVar, a.b.b.a aVar) {
        this.f771i = m1982b(aVar.b);
    }

    public void m1986a(c cVar, b bVar) {
    }

    public void m1987a(c cVar, r rVar) {
        this.f771i = m1982b(rVar.b);
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        if (ClassI.m755a(str.charAt(0)) || ClassI.m773f(str) || !m1982b(cVar2)) {
            return;
        }
        m1974a(this.f767e, this.f768f, this.f769g, this.f770h, (i4 - i3) - 1);
    }

    public void m1988a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (as.m2467a(cVar) && (interfaceC0162j.mo945a() & 8) == 0) {
            return;
        }
        this.f764b.m2194a(cVar, interfaceC0162j, dVar);
        int i = dVar.e;
        this.f765c.m277a(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f764b.m2196a(i2)) {
                ClassE.m387a(dVar.f, i2).mo324a(cVar, interfaceC0162j, dVar, i2, this);
            }
        }
        this.f765c.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m1989a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        switch (c0042a.f147c) {
            case -91:
                if (m1980b(i)) {
                    m1970a(cVar, i, c0042a, new ClassA((byte) -97, c0042a.f133a));
                }
                break;
            case -90:
                if (m1980b(i)) {
                    m1970a(cVar, i, c0042a, new ClassA((byte) -96, c0042a.f133a));
                }
                break;
            case -58:
                if (m1980b(i)) {
                    m1970a(cVar, i, c0042a, new ClassA((byte) -103, c0042a.f133a));
                }
                break;
            case -57:
                if (m1980b(i)) {
                    m1970a(cVar, i, c0042a, new ClassA((byte) -102, c0042a.f133a));
                }
                break;
        }
    }

    public void m1990a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -77:
            case -75:
                this.f767e = cVar;
                this.f768f = interfaceC0162j;
                this.f769g = dVar;
                this.f770h = i;
                cVar.a(c0047b.f139a, this.f766d);
                return;
            case -76:
            case -70:
            case -69:
            case -68:
            case -66:
            case -65:
            default:
                return;
            case -74:
                String strI = cVar.i(c0047b.f139a);
                String strJ = cVar.j(c0047b.f139a);
                if (m1976a(i, ClassI.m798u(strJ))) {
                    m1971a(cVar, i, c0047b, strI, strJ);
                }
                break;
            case -73:
            case -72:
            case -71:
                break;
            case -67:
                int i2 = c0047b.f139a;
                if (!m1977a(cVar, i2) || ClassI.m773f(cVar.e(i2))) {
                    return;
                }
                m1970a(cVar, i, c0047b, new ClassH((byte) -68, 10));
                return;
            case -64:
                if (m1980b(i)) {
                    m1969a(cVar, i, c0047b);
                    m1973a(cVar, interfaceC0162j, dVar, i);
                    return;
                }
                return;
            case -63:
                if (m1980b(i)) {
                    m1970a(cVar, i, c0047b, new ClassH((byte) 4));
                    m1973a(cVar, interfaceC0162j, dVar, i);
                    return;
                }
                return;
        }
        this.f767e = cVar;
        this.f768f = interfaceC0162j;
        this.f769g = dVar;
        this.f770h = i;
        cVar.a(c0047b.f139a, this.f766d);
    }

    public void m1991a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -80:
                if (m1978a(cVar, interfaceC0162j)) {
                    m1970a(cVar, i, c0053h, new ClassH((byte) -84));
                    m1973a(cVar, interfaceC0162j, dVar, i);
                }
                break;
            case 50:
                if (m1975a(i)) {
                    m1970a(cVar, i, c0053h, new ClassH((byte) 46));
                }
                break;
            case 83:
                if (m1981b(i, 2)) {
                    m1970a(cVar, i, c0053h, new ClassH((byte) 79));
                    m1973a(cVar, interfaceC0162j, dVar, i);
                }
                break;
        }
    }

    public void m1992a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
    }

    public void m1993a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        int i2 = c0056k.f156b;
        switch (c0056k.f147c) {
            case 25:
            case 42:
            case 43:
            case 44:
            case 45:
                if (m1975a(i)) {
                    m1970a(cVar, i, c0056k, new ClassK((byte) 21, i2));
                    m1979b(cVar, interfaceC0162j, dVar, i, i2);
                }
                break;
            case 58:
            case 75:
            case 76:
            case 77:
            case 78:
                if (!this.f764b.m2200d(i) && m1980b(i)) {
                    m1970a(cVar, i, c0056k, new ClassK((byte) 54, i2));
                    m1973a(cVar, interfaceC0162j, dVar, i);
                    break;
                }
                break;
        }
    }
}
