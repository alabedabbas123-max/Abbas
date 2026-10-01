package a.g.a;

import a.b.a.d.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.b.f.ClassB;
import a.b.f.ClassI;
import a.b.g.bi;
import a.b.g.bj;
import a.b.g.Interfacebg;
import a.d.ClassJ;
import a.d.ClassK;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.ax;
import a.g.ClassK;
import a.g.b.as;

public class af extends w implements i, f, d, aq, Interfacebg, s {

    private final ClassV f756a;

    private final aq f757b;

    private final f f758c;

    private final f f759d;

    private final s f760e;

    private final bi f761f;

    private int f762g;

    public af() {
        this(new ClassV(new ax()));
    }

    public af(ClassV c0349v) {
        this.f757b = new a(this);
        this.f758c = new bj(this);
        this.f759d = new bj(new ClassB(false, this));
        this.f760e = new ClassK(new as(false));
        this.f761f = new bi(this.f760e);
        this.f756a = c0349v;
    }

    private void m1940a(int i) {
        ad c0179adMo1335n_;
        int iM1324e;
        ClassJ c0240jM2206j = this.f756a.m2206j(i);
        int iB = c0240jM2206j.m1639b();
        for (int i2 = 0; i2 < iB; i2++) {
            Abstractbd abstractC0206bdB = c0240jM2206j.m1640b(i2);
            if (abstractC0206bdB.mo1331j() == 5 && (iM1324e = (c0179adMo1335n_ = c0240jM2206j.m1664e(i2).mo1335n_()).m1324e()) > 1 && !m1948a(abstractC0206bdB.mo1558l_())) {
                for (int i3 = 0; i3 < iM1324e; i3++) {
                    if (!c0179adMo1335n_.m1330i(i3)) {
                        m1958d(c0179adMo1335n_.m1317a(i3));
                    }
                }
            }
        }
    }

    private void m1941a(c cVar, int i) {
        cVar.a(i, this.f761f);
    }

    private boolean m1942a(int i, int i2) {
        return m1948a(this.f756a.m2206j(i).m1643c(i2).mo1558l_());
    }

    private boolean m1943a(int i, int i2, int i3) {
        ClassJ c0240jM2206j = this.f756a.m2206j(i);
        String strMo1555e = c0240jM2206j.m1643c(i2).mo1558l_().mo1555e();
        String strMo1555e2 = c0240jM2206j.m1643c(i3).mo1558l_().mo1555e();
        if (strMo1555e == null) {
            return strMo1555e2 == null;
        }
        return strMo1555e.equals(strMo1555e2);
    }

    private boolean m1944a(int i, int i2, c cVar, int i3) {
        return m1945a(i, i2, cVar.e(i3));
    }

    private boolean m1945a(int i, int i2, String str) {
        return str.equals(this.f756a.m2206j(i).m1643c(i2).mo1558l_().mo1555e());
    }

    private boolean m1946a(int i, c cVar, int i2) {
        return m1944a(i, 0, cVar, i2);
    }

    private boolean m1947a(c cVar, Interfacej interfaceC0162j) {
        c[] cVarArr;
        if (!ClassI.m784j(ClassI.m796s(interfaceC0162j.mo949b(cVar))) || (cVarArr = ((ClassN) interfaceC0162j).f437a) == null) {
            return false;
        }
        return m1953b(cVarArr[cVarArr.length - 1]);
    }

    private boolean m1948a(Abstractap abstractC0191ap) {
        return m1953b(abstractC0191ap.mo1556f());
    }

    private boolean m1949a(String str, String str2) {
        return (str.equals("ordinal") && str2.equals("()I")) || (str.equals("clone") && str2.equals("()Ljava/lang/Object;"));
    }

    private void m1950b(int i) {
        ad c0179adMo1335n_;
        int iM1324e;
        ClassK c0241kM2204h = this.f756a.m2204h(i);
        int iA = c0241kM2204h.m1674a();
        for (int i2 = 0; i2 < iA; i2++) {
            Abstractbd abstractC0206bdC = c0241kM2204h.m1677c(i2);
            if (abstractC0206bdC != null && abstractC0206bdC.mo1331j() == 5 && (iM1324e = (c0179adMo1335n_ = c0241kM2204h.m1667a(i2).mo1335n_()).m1324e()) > 1 && !m1948a(abstractC0206bdC.mo1558l_())) {
                for (int i3 = 0; i3 < iM1324e; i3++) {
                    if (!c0179adMo1335n_.m1322c(i3)) {
                        m1956c(c0179adMo1335n_.m1317a(i3), i2);
                    }
                }
            }
        }
    }

    private void m1951b(int i, int i2) {
        m1952b(this.f756a.m2206j(i).m1643c(i2).mo1558l_());
    }

    private void m1952b(Abstractap abstractC0191ap) {
        c cVarMo1556f = abstractC0191ap.mo1556f();
        if (cVarMo1556f != null) {
            cVarMo1556f.a(this.f760e);
        }
    }

    private boolean m1953b(c cVar) {
        return cVar != null && as.m2467a(cVar);
    }

    private boolean m1954b(String str, String str2) {
        return str.equals("valueOf");
    }

    private void m1955c(int i) {
        m1951b(i, 0);
    }

    private void m1956c(int i, int i2) {
        m1952b(this.f756a.m2205i(i).m1677c(i2).mo1558l_());
    }

    private boolean m1957c(String str, String str2) {
        return str.equals("valueOf") || str.equals("values");
    }

    private void m1958d(int i) {
        m1952b(this.f756a.m2207k(i).m1643c(0).mo1558l_());
    }

    public void m1959a(c cVar, a.b.a.a aVar) {
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        int i5 = (i4 - i3) - 1;
        if (ClassI.m784j(str)) {
            int i6 = this.f762g;
            if (!ClassI.m773f(str)) {
                str = ClassI.m792o(str);
            }
            if (m1945a(i6, i5, str)) {
                return;
            }
            m1951b(this.f762g, i5);
        }
    }

    public void m1960a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f756a.m2194a(cVar, interfaceC0162j, dVar);
        int i = dVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f756a.m2196a(i2)) {
                ClassE.m387a(dVar.f, i2).mo324a(cVar, interfaceC0162j, dVar, i2, this);
                if (this.f756a.m2198b(i2)) {
                    m1940a(i2);
                    m1950b(i2);
                }
            }
        }
    }

    public void m1961a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        switch (c0042a.f147c) {
            case -91:
            case -90:
                if (!m1943a(i, 0, 1)) {
                    m1951b(i, 0);
                    m1951b(i, 1);
                }
                break;
        }
    }

    public void m1962a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -77:
            case -75:
                this.f762g = i;
                cVar.a(c0047b.f139a, this.f759d);
                break;
            case -74:
                String strI = cVar.i(c0047b.f139a);
                String strJ = cVar.j(c0047b.f139a);
                int iM798u = ClassI.m798u(strJ);
                if (m1942a(i, iM798u) && !m1949a(strI, strJ)) {
                    m1951b(i, iM798u);
                }
                this.f762g = i;
                cVar.a(c0047b.f139a, this.f759d);
                break;
            case -73:
            case -72:
            case -71:
                cVar.a(c0047b.f139a, this.f758c);
                this.f762g = i;
                cVar.a(c0047b.f139a, this.f759d);
                break;
            case -64:
            case -63:
                if (!m1946a(i, cVar, c0047b.f139a)) {
                    m1955c(i);
                    if (c0047b.f147c != -64 || !m1953b(cVar) || (interfaceC0162j.mo945a() & 8) == 0 || !m1957c(interfaceC0162j.mo946a(cVar), interfaceC0162j.mo949b(cVar))) {
                        m1941a(cVar, c0047b.f139a);
                    }
                }
                break;
        }
    }

    public void m1963a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -80:
                if (!m1947a(cVar, interfaceC0162j)) {
                    m1955c(i);
                }
                break;
            case -62:
            case -61:
                m1955c(i);
                break;
            case 83:
                if (!m1942a(i, 2)) {
                    m1955c(i);
                }
                break;
        }
    }

    public void m1964a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
    }

    public void m1965a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
    }

    public void m1966a(ClassE c0057e, ClassH c0160h) {
    }

    public void m1967a(k kVar) {
        if ((kVar.a() & 8192) != 0) {
            kVar.b(this.f761f);
        } else {
            kVar.b(this.f757b);
        }
    }

    public void m1968a(k kVar, ClassN c0165n) {
        if (m1953b((c) kVar) && m1954b(c0165n.mo946a((c) kVar), c0165n.mo949b(kVar))) {
            this.f760e.a(kVar);
        }
    }
}
