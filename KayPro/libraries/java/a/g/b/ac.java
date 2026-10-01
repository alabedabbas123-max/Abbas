package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.h;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.f.ClassB;
import a.b.f.ClassI;
import a.b.g.Interfacebg;
import a.d.ClassB;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;
import a.d.a.ClassC;
import a.d.a.Interfacebe;
import a.g.a.aa;
import a.g.a.ClassU;
import a.g.a.ClassV;

public class ac extends w implements i, f, d, aq, Interfacebg {

    private final ClassR f873a;

    private final ClassV f874b;

    private final boolean f875c;

    private final ak f876d;

    private final boolean f877e;

    private final aq f878f;

    private Interfacej f879g;

    private int f880h;

    private int f881i;

    private boolean f882j;

    private boolean f883k;

    public ac(ClassR c0399r) {
        this(c0399r, new ClassC());
    }

    public ac(ClassR c0399r, Interfacebe interfaceC0207be) {
        this(c0399r, interfaceC0207be, new aa(interfaceC0207be));
    }

    public ac(ClassR c0399r, Interfacebe interfaceC0207be, aa c0319aa) {
        this(c0399r, new ClassV(c0319aa, new ClassU(new ClassB(c0319aa)), true, c0319aa), true);
    }

    public ac(ClassR c0399r, ClassV c0349v, boolean z) {
        this(c0399r, c0349v, z, new ak(c0349v, false), true);
    }

    public ac(ClassR c0399r, ClassV c0349v, boolean z, ak c0367ak, boolean z2) {
        this.f878f = new ClassB(true, this);
        this.f873a = c0399r;
        this.f874b = c0349v;
        this.f875c = z;
        this.f876d = c0367ak;
        this.f877e = z2;
    }

    public static long m2254a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2407w();
    }

    private void m2255a(c cVar, Interfacej interfaceC0162j, int i, int i2) {
        Abstractbd abstractC0206bdC = this.f874b.m2206j(i).m1643c(i2);
        if (abstractC0206bdC.mo1331j() == 5) {
            Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
            if (abstractC0191apMo1558l_.mo1559m() == 1 || !m2259a(cVar, interfaceC0162j, abstractC0191apMo1558l_)) {
                return;
            }
            m2264b(interfaceC0162j, abstractC0191apMo1558l_);
        }
    }

    private void m2256a(Interfacej interfaceC0162j, int i, int i2) {
        Abstractbd abstractC0206bdC = this.f874b.m2206j(i).m1643c(i2);
        if (abstractC0206bdC.mo1331j() == 5) {
            Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
            if (abstractC0191apMo1558l_.mo1559m() != 1) {
                m2258a(interfaceC0162j, abstractC0191apMo1558l_);
            }
        }
    }

    private void m2257a(Interfacej interfaceC0162j, long j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        long jMo2407w = c0398qM2566a.mo2407w();
        if ((((-1) ^ jMo2407w) & j) == 0 || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2377b(j);
        if (c0398qM2566a.mo2407w() != jMo2407w) {
            this.f873a.m2574a();
        }
    }

    private void m2258a(Interfacej interfaceC0162j, Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (c0179adMo1335n_.m1322c(i)) {
                m2270d(interfaceC0162j, c0179adMo1335n_.m1323d(i));
            }
        }
    }

    private boolean m2259a(c cVar, Interfacej interfaceC0162j, Abstractap abstractC0191ap) {
        String strM796s = ClassI.m796s(interfaceC0162j.mo949b(cVar));
        c[] cVarArr = interfaceC0162j instanceof ClassN ? ((ClassN) interfaceC0162j).f437a : ((ClassH) interfaceC0162j).f427a;
        return abstractC0191ap.mo1536a(strM796s, (cVarArr == null || !ClassI.m784j(strM796s)) ? null : cVarArr[cVarArr.length + (-1)]) != -1;
    }

    public static boolean m2260a(Interfacej interfaceC0162j, int i) {
        return ClassQ.m2566a(interfaceC0162j).mo2379b(i);
    }

    public static long m2261b(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2410z();
    }

    private void m2262b(Interfacej interfaceC0162j, int i, int i2) {
        Abstractbd abstractC0206bdC = this.f874b.m2206j(i).m1643c(i2);
        if (abstractC0206bdC.mo1331j() == 5) {
            Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
            if (abstractC0191apMo1558l_.mo1559m() != 1) {
                m2267c(interfaceC0162j, abstractC0191apMo1558l_);
            }
        }
    }

    private void m2263b(Interfacej interfaceC0162j, long j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        long jMo2410z = c0398qM2566a.mo2410z();
        if ((((-1) ^ jMo2410z) & j) == 0 || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2383d(j);
        if (c0398qM2566a.mo2410z() != jMo2410z) {
            this.f873a.m2574a();
        }
    }

    private void m2264b(Interfacej interfaceC0162j, Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (c0179adMo1335n_.m1322c(i)) {
                m2272e(interfaceC0162j, c0179adMo1335n_.m1323d(i));
            } else if (c0179adMo1335n_.m1327f(i)) {
                m2276g(interfaceC0162j);
            } else if (c0179adMo1335n_.m1328g(i) || c0179adMo1335n_.m1330i(i)) {
                m2274f(interfaceC0162j);
            }
        }
    }

    public static boolean m2265b(Interfacej interfaceC0162j, int i) {
        return ClassQ.m2566a(interfaceC0162j).mo2384e(i);
    }

    private void m2266c(Interfacej interfaceC0162j, long j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        long jMo2408x = c0398qM2566a.mo2408x();
        if ((((-1) ^ jMo2408x) & j) == 0 || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2380c(j);
        if (c0398qM2566a.mo2408x() != jMo2408x) {
            this.f873a.m2574a();
        }
    }

    private void m2267c(Interfacej interfaceC0162j, Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (c0179adMo1335n_.m1322c(i)) {
                m2275f(interfaceC0162j, c0179adMo1335n_.m1323d(i));
            } else if (!c0179adMo1335n_.m1328g(i) && !c0179adMo1335n_.m1330i(i)) {
                m2266c(interfaceC0162j, m2254a(interfaceC0162j));
                m2277h(interfaceC0162j);
            }
        }
    }

    public static boolean m2268c(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2353A();
    }

    public static boolean m2269c(Interfacej interfaceC0162j, int i) {
        return ClassQ.m2566a(interfaceC0162j).mo2381c(i);
    }

    private void m2270d(Interfacej interfaceC0162j, int i) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2379b(i) || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2391j(i);
        if (c0398qM2566a.mo2379b(i)) {
            this.f873a.m2574a();
        }
    }

    public static boolean m2271d(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2354B();
    }

    private void m2272e(Interfacej interfaceC0162j, int i) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2384e(i) || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2395l(i);
        if (c0398qM2566a.mo2384e(i)) {
            this.f873a.m2574a();
        }
    }

    public static boolean m2273e(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2409y();
    }

    private void m2274f(Interfacej interfaceC0162j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2353A() || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2369Q();
        if (c0398qM2566a.mo2353A()) {
            this.f873a.m2574a();
        }
    }

    private void m2275f(Interfacej interfaceC0162j, int i) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2381c(i) || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2393k(i);
        if (c0398qM2566a.mo2381c(i)) {
            this.f873a.m2574a();
        }
    }

    private void m2276g(Interfacej interfaceC0162j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2354B() || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2370R();
        if (c0398qM2566a.mo2354B()) {
            this.f873a.m2574a();
        }
    }

    private void m2277h(Interfacej interfaceC0162j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2409y() || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2368P();
        if (c0398qM2566a.mo2409y()) {
            this.f873a.m2574a();
        }
    }

    public void m2278a(c cVar, a aVar) {
    }

    public void m2279a(c cVar, a.b.b.a aVar) {
        c cVar2 = aVar.b;
        if (cVar2 == null || am.m2441a(cVar, cVar2)) {
            m2277h(this.f879g);
        }
    }

    public void m2280a(c cVar, b bVar) {
    }

    public void m2281a(c cVar, a.b.b.d dVar) {
        cVar.a(dVar.a, this);
    }

    public void m2282a(c cVar, h hVar) {
        m2277h(this.f879g);
    }

    public void m2283a(c cVar, q qVar) {
        Interfacej interfaceC0162j = (Interfacej) qVar.e;
        if (interfaceC0162j == null || m2273e(interfaceC0162j) || am.m2442a(cVar, qVar.c, interfaceC0162j)) {
            m2277h(this.f879g);
        }
        if (interfaceC0162j != null) {
            this.f882j = this.f876d.m2437a(this.f880h);
            this.f883k = this.f876d.m2439c(this.f880h);
            qVar.a(this.f878f);
        } else {
            for (int i = 0; i < this.f881i; i++) {
                int i2 = (this.f881i - i) - 1;
                m2256a(this.f879g, this.f880h, i2);
                m2262b(this.f879g, this.f880h, i2);
            }
        }
    }

    public void m2284a(c cVar, r rVar) {
        c cVar2 = rVar.b;
        if (cVar2 == null || am.m2441a(cVar, cVar2)) {
            m2277h(this.f879g);
        }
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        if (ClassI.m755a(str.charAt(0))) {
            return;
        }
        Interfacej interfaceC0162j = (Interfacej) interfaceC0161i;
        if (m2260a(interfaceC0162j, i) || (m2265b(interfaceC0162j, i) && this.f882j)) {
            m2256a(this.f879g, this.f880h, (i4 - i3) - 1);
        }
        if (m2269c(interfaceC0162j, i) || (m2265b(interfaceC0162j, i) && this.f883k)) {
            m2262b(this.f879g, this.f880h, (i4 - i3) - 1);
        }
    }

    public void m2285a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f875c) {
            this.f874b.m2194a(cVar, interfaceC0162j, dVar);
        }
        if (this.f877e) {
            this.f876d.m2433a(cVar, interfaceC0162j, dVar);
        }
    }

    public void m2286a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -69:
            case -67:
            case -59:
            case 18:
            case 19:
                this.f879g = interfaceC0162j;
                this.f880h = i;
                cVar.a(c0047b.f139a, this);
                break;
            case -77:
                m2277h(interfaceC0162j);
                m2256a(interfaceC0162j, i, 0);
                break;
            case -75:
                m2262b(interfaceC0162j, i, c0047b.mo349a(cVar) - 1);
                m2256a(interfaceC0162j, i, 0);
                break;
            case -74:
            case -73:
            case -72:
            case -71:
            case -70:
                this.f879g = interfaceC0162j;
                this.f880h = i;
                this.f881i = c0047b.mo349a(cVar);
                cVar.a(c0047b.f139a, this);
                break;
        }
    }

    public void m2287a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2288a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -80:
                m2255a(cVar, interfaceC0162j, i, 0);
                break;
            case -65:
                m2256a(interfaceC0162j, i, 0);
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
                m2262b(interfaceC0162j, i, c0053h.mo349a(cVar) - 1);
                break;
            case 83:
                m2262b(interfaceC0162j, i, c0053h.mo349a(cVar) - 1);
                m2256a(interfaceC0162j, i, 0);
                break;
        }
    }

    public void m2289a(k kVar, ClassN c0165n) {
        if ((c0165n.mo945a() & 256) != 0) {
            m2266c((Interfacej) c0165n, -1L);
            m2257a((Interfacej) c0165n, -1L);
            m2263b((Interfacej) c0165n, -1L);
            m2277h(c0165n);
        }
    }
}
