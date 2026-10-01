package a.g.c;

import a.b.a.d.g;
import a.b.b.a.f;
import a.b.c;
import a.b.c.au;
import a.b.c.bf;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import a.b.ClassE;
import a.b.c.ClassH;
import a.b.f.ClassI;
import a.b.g.ac;
import a.b.g.ad;
import a.b.g.ae;
import a.b.g.ag;
import a.b.g.ak;
import a.b.g.al;
import a.b.g.ao;
import a.b.g.av;
import a.b.g.ClassB;
import a.b.g.bi;
import a.b.g.bk;
import a.b.g.ClassD;
import a.b.g.ClassF;
import a.b.g.ClassH;
import a.b.g.ClassJ;
import a.b.g.ClassW;
import a.g.ClassF;
import a.g.b.aa;
import a.g.b.ab;
import a.g.b.ae;
import a.g.b.an;
import a.g.b.ClassD;
import a.g.b.ClassF;
import a.g.b.ClassH;
import a.g.b.ClassM;
import a.g.b.ClassO;
import a.j.ClassI;
import a.j.ClassL;
import a.j.ClassP;
import a.j.ClassQ;

public class ClassC extends w implements f, s {

    private final k f1026a;

    private final boolean f1027b;

    private final boolean f1028c;

    private final boolean f1029d;

    private final s f1030e;

    private final aq f1031f = new ClassE();

    public ClassC(k kVar, boolean z, boolean z2, boolean z3, s sVar) {
        this.f1026a = kVar;
        this.f1027b = z;
        this.f1028c = z2;
        this.f1029d = z3;
        this.f1030e = sVar;
    }

    public static void m2700a(c cVar, c cVar2) {
        ae.m2304f(cVar).m2309d(cVar2);
    }

    private boolean m2701a(c cVar, k kVar) {
        return kVar.o != null && kVar.o.length == 1 && kVar.o[0].equals(cVar);
    }

    public static c m2702b(c cVar) {
        c cVar2 = null;
        while (true) {
            c cVarMo2320n = ClassF.m2515b(cVar).mo2320n();
            if (cVarMo2320n == null) {
                return cVar2;
            }
            cVar2 = cVarMo2320n;
            cVar = cVarMo2320n;
        }
    }

    private Set m2703b(c cVar, c cVar2) {
        HashSet hashSet = new HashSet();
        cVar.a(false, false, false, true, new ClassF(512, 0, new ClassW(new c[]{cVar2}, new ClassH(hashSet))));
        return hashSet;
    }

    private boolean m2704b(c cVar, k kVar) {
        if (!ClassO.m2551b(kVar) && (kVar.o == null || m2701a(cVar, kVar))) {
            return false;
        }
        al c0108al = new al();
        cVar.a(new ag(0, 8, c0108al));
        return c0108al.m986a() > 0;
    }

    private Set m2705c(c cVar) {
        HashSet hashSet = new HashSet();
        bi c0131bi = new bi(new ClassJ(false, false, true, false, new ClassH(hashSet)));
        cVar.b(c0131bi);
        cVar.c(c0131bi);
        return hashSet;
    }

    private boolean m2706c(c cVar, c cVar2) {
        al c0108al = new al();
        cVar.a(new bk(cVar2, true, false, false, false, c0108al));
        return c0108al.m986a() > 0;
    }

    private boolean m2707c(c cVar, k kVar) {
        if ((kVar.a() & 1536) != 0 && (kVar.o == null || m2701a(cVar, kVar))) {
            return false;
        }
        al c0108al = new al();
        HashSet hashSet = new HashSet();
        cVar.b(new ag(1024, 0, new av(c0108al, new bk(kVar, true, true, true, false, new ag(1024, 0, new ak(false, true, true, hashSet))))));
        return hashSet.size() < c0108al.m986a();
    }

    private Set m2708d(c cVar) {
        HashSet hashSet = new HashSet();
        cVar.a(true, true, true, false, new an(new ClassH(hashSet)));
        return hashSet;
    }

    private boolean m2709d(c cVar, c cVar2) {
        al c0108al = new al();
        cVar.a(true, false, false, true, new ClassB(new bk(cVar2, true, true, true, false, new ag(0, 2, c0108al))));
        return c0108al.m986a() > 0;
    }

    private boolean m2710d(c cVar, k kVar) {
        if (!ClassO.m2551b(kVar) && (kVar.o == null || m2701a(cVar, kVar))) {
            return false;
        }
        al c0108al = new al();
        cVar.b(new ag(0, 1024, new ae(null, new bk(kVar, true, true, false, false, new ag(0, 1034, c0108al)))));
        return c0108al.m986a() > 0;
    }

    private Set m2711e(c cVar) {
        HashSet hashSet = new HashSet();
        cVar.a(true, true, true, false, new ClassM(new ClassH(hashSet)));
        return hashSet;
    }

    private boolean m2712e(c cVar, c cVar2) {
        al c0108al = new al();
        cVar.b(new ag(0, 1024, new bk(cVar2, true, false, false, false, new ag(0, 1024, c0108al))));
        return c0108al.m986a() > 0;
    }

    private Set m2713f(c cVar) {
        if (!cVar.a("java/lang/Throwable")) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        cVar.a(true, true, false, false, new ClassD(new ClassH(hashSet)));
        return hashSet;
    }

    private boolean m2714f(c cVar, c cVar2) {
        if (cVar.b(cVar2) || cVar2.b(cVar)) {
            return false;
        }
        al c0108al = new al();
        cVar.a(true, false, false, true, new ClassD(new ae(null, new bk(cVar2, true, true, false, false, new ag(16, 0, c0108al)))));
        if (c0108al.m986a() > 0) {
            return true;
        }
        cVar.a(true, false, false, true, new ClassD(new ag(2, 0, new ae(null, new bk(cVar2, true, true, true, false, new ag(0, 2, c0108al))))));
        if (c0108al.m986a() > 0) {
            return true;
        }
        cVar.a(true, false, false, true, new ClassD(new ag(8, 0, new ae(null, new bk(cVar2, true, true, true, false, new ag(0, 2, c0108al))))));
        return c0108al.m986a() > 0;
    }

    private boolean m2715g(c cVar) {
        a.b.a.d.f fVar = new a.b.a.d.f();
        cVar.a(new g(new ClassQ(new ClassI(AttInnerClasses.ATTRIBUTE_NAME), new ClassI(AttEnclosingMethod.ATTRIBUTE_NAME)), fVar));
        return fVar.a() > 0;
    }

    public void m2716a(ClassE c0057e) {
    }

    public void m2717a(k kVar) {
        try {
            m2718b(kVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while merging classes:");
            ClassL.m3161a("  Class        = [" + kVar.b() + "]");
            ClassL.m3161a("  Target class = [" + this.f1026a.b() + "]");
            ClassL.m3161a("  Exception    = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m2718b(k kVar) {
        if (!kVar.equals(this.f1026a) && !ClassF.m2862b(kVar) && !ClassF.m2862b(this.f1026a) && m2702b((c) kVar) == null && m2702b((c) this.f1026a) == null && (kVar.a() & 8192) == 0 && kVar.a == this.f1026a.a) {
            if (this.f1027b || (!((kVar.a() & this.f1026a.a() & 1) == 0 || aa.m2242b(kVar) || ab.m2246b(kVar)) || ClassI.m743B(kVar.b()).equals(ClassI.m743B(this.f1026a.b())))) {
                if ((kVar.a() & 1536) != (this.f1026a.a() & 1536)) {
                    if (!m2701a((c) kVar, this.f1026a) || kVar.e() == null) {
                        return;
                    }
                    if (!kVar.e().equals(this.f1026a) && !kVar.e().equals(this.f1026a.e())) {
                        return;
                    }
                }
                if (m2705c(kVar).contains(this.f1026a) || this.f1026a.c(kVar)) {
                    return;
                }
                if (((kVar.a() & 512) == 0 || (this.f1026a.a() & 512) == 0 || m2703b((c) kVar, (c) this.f1026a).equals(m2703b((c) this.f1026a, (c) kVar))) && m2708d(kVar).equals(m2708d(this.f1026a)) && m2711e(kVar).equals(m2711e(this.f1026a)) && m2713f(kVar).equals(m2713f(this.f1026a))) {
                    if (ClassH.m2521b(kVar) && ClassH.m2521b(this.f1026a)) {
                        return;
                    }
                    if (this.f1029d || !m2706c((c) kVar, (c) this.f1026a)) {
                        if (this.f1029d || !(m2704b((c) kVar, this.f1026a) || m2704b((c) this.f1026a, kVar))) {
                            if ((this.f1029d || !(m2709d((c) kVar, (c) this.f1026a) || m2709d((c) this.f1026a, (c) kVar))) && !m2712e(kVar, this.f1026a)) {
                                if ((!this.f1028c && (m2707c((c) kVar, this.f1026a) || m2707c((c) this.f1026a, kVar))) || m2710d((c) kVar, this.f1026a) || m2710d((c) this.f1026a, kVar) || m2714f(kVar, this.f1026a) || m2714f(this.f1026a, kVar)) {
                                    return;
                                }
                                if (!this.f1029d && (kVar.a() & 4096) == 0 && m2715g(kVar)) {
                                    return;
                                }
                                int iA = this.f1026a.a();
                                int iA2 = kVar.a();
                                this.f1026a.d = ((iA | iA2) & 24609) | (iA & iA2 & 1536);
                                kVar.c(new a.b.b.a.g(this.f1026a.b(), new ac(this.f1026a, new ad(this.f1026a, new au(this.f1026a)))));
                                ao bfVar = new bf(this.f1026a, this.f1031f);
                                kVar.a(this.f1029d ? new ag(8, 0, bfVar) : bfVar);
                                if (this.f1029d) {
                                    bfVar = new ao(new ClassP(new ClassI("<init>")), bfVar);
                                }
                                kVar.b(bfVar);
                                kVar.a(new g(new ClassP(new ClassQ(new ClassI(AttBootstrapMethods.ATTRIBUTE_NAME), new ClassQ(new ClassI(AttSourceFile.ATTRIBUTE_NAME), new ClassQ(new ClassI(AttInnerClasses.ATTRIBUTE_NAME), new ClassI(AttEnclosingMethod.ATTRIBUTE_NAME))))), new ClassH(this.f1026a, true)));
                                ae.m2304f(this.f1026a).m2305a(ClassF.m2515b(kVar));
                                m2700a((c) kVar, (c) this.f1026a);
                                if (this.f1030e != null) {
                                    this.f1030e.a(kVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
