package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.f.ClassI;
import a.d.ClassB;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ax;
import a.d.a.Interfacebe;
import a.g.a.aa;
import a.g.a.ClassV;
import a.g.a.ClassZ;

public class ClassK extends w implements i, d, s {

    private final ClassV f980a;

    private final boolean f981b;

    private final ak f982c;

    private final boolean f983d;

    public ClassK() {
        this(new ax());
    }

    public ClassK(Interfacebe interfaceC0207be) {
        this(interfaceC0207be, new aa(interfaceC0207be));
    }

    public ClassK(Interfacebe interfaceC0207be, aa c0319aa) {
        this(new ClassV(c0319aa, new ClassZ(new ClassB(c0319aa)), true, c0319aa), true);
    }

    public ClassK(ClassV c0349v, boolean z) {
        this(c0349v, z, new ak(c0349v, false), true);
    }

    public ClassK(ClassV c0349v, boolean z, ak c0367ak, boolean z2) {
        this.f980a = c0349v;
        this.f981b = z;
        this.f982c = c0367ak;
        this.f983d = z2;
    }

    public static boolean m2534b(c cVar) {
        return ClassF.m2515b(cVar).mo2315i();
    }

    private void m2535c(c cVar) {
        ClassF c0387fB = ae.m2515b(cVar);
        if (c0387fB instanceof ae) {
            ((ae) c0387fB).m2325s();
        }
    }

    public void m2536a(c cVar, a aVar) {
    }

    public void m2537a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f981b) {
            this.f980a.m2194a(cVar, interfaceC0162j, dVar);
        }
        if (this.f983d) {
            this.f982c.m2433a(cVar, interfaceC0162j, dVar);
        }
        dVar.a(cVar, interfaceC0162j, this.f980a.m2191a(this));
    }

    public void m2538a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        c cVarMo1556f;
        if (abstractC0048c.mo367b(cVar) == 1) {
            if (this.f982c.m2437a(i) || this.f982c.m2438b(i)) {
                Abstractbd abstractC0206bdC = this.f980a.m2207k(i).m1643c(0);
                if (abstractC0206bdC.mo1331j() == 5) {
                    Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
                    if (abstractC0191apMo1558l_.mo1559m() == 1 || ClassI.m773f(abstractC0191apMo1558l_.mo1555e()) || (cVarMo1556f = abstractC0191apMo1558l_.mo1556f()) == null) {
                        return;
                    }
                    cVarMo1556f.a(true, true, true, false, this);
                }
            }
        }
    }

    public void m2539a(ClassE c0057e) {
    }

    public void m2540a(k kVar) {
        m2535c(kVar);
    }
}
