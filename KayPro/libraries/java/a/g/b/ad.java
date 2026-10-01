package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassK;
import a.b.f.ClassI;
import a.d.a.Abstractbd;
import a.g.a.ClassV;

public class ad extends w implements i, d, aq {

    private final boolean f884a;

    private final boolean f885b;

    private final boolean f886c;

    private final ClassV f887d;

    public ad() {
        this(false, false);
    }

    public ad(boolean z, boolean z2) {
        this(z, z2, true);
    }

    public ad(boolean z, boolean z2, boolean z3) {
        this.f887d = new ClassV();
        this.f884a = z;
        this.f885b = z2;
        this.f886c = z3;
    }

    public static int m2290a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2404t();
    }

    public static void m2291a(Interfacej interfaceC0162j, int i) {
        ai.m2350b(interfaceC0162j).m2386g(i);
    }

    private static void m2292a(Interfacej interfaceC0162j, long j) {
        ai.m2350b(interfaceC0162j).m2372a(j);
    }

    public static boolean m2293b(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2405u();
    }

    public static boolean m2294b(Interfacej interfaceC0162j, int i) {
        return ClassQ.m2566a(interfaceC0162j).mo2376a(i);
    }

    public static long m2295c(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2406v();
    }

    private static void m2296c(Interfacej interfaceC0162j, int i) {
        ai.m2350b(interfaceC0162j).m2385f(i);
    }

    public void m2297a(c cVar, a aVar) {
    }

    public void m2298a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f887d.m2194a(cVar, interfaceC0162j, dVar);
        dVar.a(cVar, interfaceC0162j, this);
    }

    public void m2299a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2300a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        int i2;
        Abstractbd abstractC0206bdM1667a;
        if (this.f887d.m2196a(i) && c0056k.m398g() && (i2 = c0056k.f156b) < dVar.d && (abstractC0206bdM1667a = this.f887d.m2204h(i).m1667a(i2)) != null && abstractC0206bdM1667a.mo1335n_().m1320b(16777216 | i2)) {
            m2291a(interfaceC0162j, i2);
            if (c0056k.mo349a(cVar) == 2 || c0056k.mo367b(cVar) == 2) {
                m2291a(interfaceC0162j, i2 + 1);
            }
        }
    }

    public void m2301a(ClassE c0057e, ClassH c0160h) {
        if (c0057e.m411a((Interfacej) c0160h)) {
            m2292a((Interfacej) c0160h, -1L);
        }
    }

    public void m2302a(k kVar, ClassN c0165n) {
        int iM762c = ClassI.m762c(c0165n.mo949b(kVar), c0165n.mo945a());
        if (iM762c > 0) {
            int iA = c0165n.mo945a();
            if (this.f884a && (iA & 8) == 0) {
                m2291a((Interfacej) c0165n, 0);
            }
            if (this.f885b) {
                m2292a(c0165n, (iA & 8) != 0 ? -1L : -2L);
            }
            if ((iA & 256) != 0) {
                m2292a((Interfacej) c0165n, -1L);
            } else if ((iA & 1024) != 0) {
                m2291a((Interfacej) c0165n, 0);
            } else {
                if ((iA & 8) == 0 && ((iA & 32) != 0 || kVar.a(c0165n) || c0165n.mo946a((c) kVar).equals("<init>"))) {
                    m2291a((Interfacej) c0165n, 0);
                }
                if (this.f886c) {
                    c0165n.mo1267a(kVar, (i) this);
                }
            }
        }
        m2296c(c0165n, iM762c);
    }
}
