package a.b.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b;
import a.b.b.a.f;
import a.b.c;
import a.b.c.ae;
import a.b.c.ar;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.g.am;
import a.b.g.ao;
import a.b.g.ClassB;
import a.b.g.ClassD;
import a.j.Abstractt;
import a.j.ClassL;

public class ClassL extends w implements i, f, d, aq {

    private final b f249a;

    private final b f250b;

    private final ClassZ f251c;

    private final Abstractt f252d;

    private final Abstractt f253e;

    private final ClassP f254f;

    private final ClassP f255g;

    private final ClassP f256h;

    private final ClassP f257i;

    private final ClassP f258j;

    private final ClassP f259k;

    private final ClassN f260l = new ClassN(this);

    private final ClassR f261m = new ClassR(true);

    private final ClassR f262n = new ClassR(false);

    private final ClassV f263o = new ClassV();

    private c f264p;

    public ClassL(b bVar, b bVar2, ClassZ c0094z, Abstractt abstractC0515t, Abstractt abstractC0515t2) {
        this.f249a = bVar;
        this.f250b = bVar2;
        this.f251c = c0094z;
        this.f252d = abstractC0515t;
        this.f253e = abstractC0515t2;
        ar arVar = new ar(bVar, bVar2);
        Abstractc[] abstractC0048cArrC = arVar.h(1073741827).h(1073741828).d("java/util/concurrent/atomic/AtomicIntegerFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;").c();
        Abstractc[] abstractC0048cArrC2 = arVar.h(1073741827).h(1073741828).d("java/util/concurrent/atomic/AtomicLongFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;").c();
        Abstractc[] abstractC0048cArrC3 = arVar.h(1073741827).h(1073741829).h(1073741828).d("java/util/concurrent/atomic/AtomicReferenceFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;").c();
        Abstractc[] abstractC0048cArrC4 = arVar.h(1073741828).d("java/util/concurrent/atomic/AtomicIntegerFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;").c();
        Abstractc[] abstractC0048cArrC5 = arVar.h(1073741828).d("java/util/concurrent/atomic/AtomicLongFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;").c();
        Abstractc[] abstractC0048cArrC6 = arVar.h(1073741828).d("java/util/concurrent/atomic/AtomicReferenceFieldUpdater", "newUpdater", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;").c();
        a.b.b.b[] bVarArrD = arVar.d();
        this.f254f = new ClassP(bVarArrD, abstractC0048cArrC);
        this.f255g = new ClassP(bVarArrD, abstractC0048cArrC2);
        this.f256h = new ClassP(bVarArrD, abstractC0048cArrC3);
        this.f257i = new ClassP(bVarArrD, abstractC0048cArrC4);
        this.f258j = new ClassP(bVarArrD, abstractC0048cArrC5);
        this.f259k = new ClassP(bVarArrD, abstractC0048cArrC6);
    }

    public void m819a(c cVar, int i, c cVar2, String str, String str2, boolean z, boolean z2, boolean z3) {
        ClassR c0087r = z3 ? this.f262n : this.f261m;
        Interfacei interfaceC0161iM903a = c0087r.m903a(cVar2, str, str2, z);
        if (interfaceC0161iM903a != null) {
            if (!z3) {
                cVar2 = c0087r.m901a();
            }
            this.f263o.m311b(i, new ClassB((byte) 18, new ae((k) cVar).a(str, cVar2, interfaceC0161iM903a)));
        }
    }

    public void m820a(c cVar, c cVar2, String str, boolean z) {
        if (this.f251c == null || !this.f251c.m943a(cVar.b())) {
            return;
        }
        if (this.f253e == null || !this.f253e.mo3151a("<init>")) {
            this.f251c.m941a(cVar.b(), "Note: " + ClassI.m764c(cVar.b()) + " retrieves a " + (z ? "declared " : "") + "constructor '<init>(" + ClassI.m742A(str) + ")' dynamically");
            ClassD c0138d = new ClassD(new ao("<init>", new am(str, this)));
            if (cVar2 != null) {
                cVar2.a(true, !z, false, false, c0138d);
            } else {
                this.f249a.b(c0138d);
                this.f250b.b(c0138d);
            }
        }
    }

    private void m821a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c, ClassP c0085p, ClassP c0085p2, boolean z, boolean z2, boolean z3, String str) {
        String strM786k;
        if (c0085p != null) {
            abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, c0085p);
            if (c0085p.m885b()) {
                int iM856a = c0085p.m856a(c0085p.m889c() - 2);
                cVar.a(c0085p.m891d(1073741827), this);
                if (this.f264p != null) {
                    int iM891d = c0085p.m891d(1073741829);
                    strM786k = iM891d > 0 ? ClassI.m786k(cVar.e(iM891d)) : str;
                    m819a(cVar, iM856a, this.f264p, cVar.d(c0085p.m891d(1073741828)), strM786k, z, z2, z3);
                } else {
                    strM786k = str;
                }
                c0085p2.m858a();
                str = strM786k;
            }
        }
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, c0085p2);
        if (c0085p2.m885b()) {
            m822a(cVar, cVar.d(c0085p2.m891d(1073741828)), str, z, z2, z3);
        }
    }

    public void m822a(c cVar, String str, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        s c0138d;
        if (this.f251c == null || !this.f251c.m943a(cVar.b())) {
            return;
        }
        Abstractt abstractC0515t = z ? this.f252d : this.f253e;
        if (abstractC0515t == null || !abstractC0515t.mo3151a(str)) {
            String str4 = !z ? str + '(' + ClassI.m742A(str2) + ')' : str;
            ClassZ c0094z = this.f251c;
            String strB = cVar.b();
            StringBuilder sbAppend = new StringBuilder().append("Note: ").append(ClassI.m764c(cVar.b())).append(" accesses a ").append(z3 ? "declared " : "");
            if (z) {
                str3 = "field";
            } else {
                str3 = z2 ? "constructor" : "method";
            }
            c0094z.m941a(strB, sbAppend.append(str3).append(" '").append(str4).append("' dynamically").toString());
            if (z) {
                c0138d = str2 == null ? new ClassB(new ao(str, this)) : new ClassB(new ao(str, new am(str2, this)));
            } else {
                c0138d = new ClassD(new ao(str, new am(str2, this)));
            }
            this.f249a.b(c0138d);
            this.f250b.b(c0138d);
        }
    }

    public void m826a(c cVar, a aVar) {
    }

    public void m827a(c cVar, a.b.b.a aVar) {
        this.f264p = ClassI.m773f(aVar.a(cVar)) ? null : aVar.b;
    }

    public void m828a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f263o.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f263o.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m829a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f260l);
        m821a(cVar, interfaceC0162j, dVar, i, abstractC0048c, this.f254f, this.f257i, true, false, false, "I");
        m821a(cVar, interfaceC0162j, dVar, i, abstractC0048c, this.f255g, this.f258j, true, false, false, "J");
        m821a(cVar, interfaceC0162j, dVar, i, abstractC0048c, this.f256h, this.f259k, true, false, false, null);
    }

    public void m830a(ClassE c0057e, ClassF c0069f) {
        if (this.f251c.m943a(c0057e.m415b())) {
            ClassL.m3161a("      Maybe this is library field '" + ClassI.m748a(0, c0057e.m415b()) + " { " + ClassI.m749a(0, c0069f.mo946a((c) c0057e), c0069f.mo949b(c0057e)) + "; }'");
        }
    }

    public void m831a(ClassE c0057e, ClassH c0160h) {
        if (this.f251c.m943a(c0057e.m415b())) {
            ClassL.m3161a("      Maybe this is library method '" + ClassI.m748a(0, c0057e.m415b()) + " { " + ClassI.m751a(c0057e.m415b(), 0, c0160h.mo946a((c) c0057e), c0160h.mo949b(c0057e)) + "; }'");
        }
    }

    public void m832a(k kVar, ClassL c0163l) {
        if (this.f251c.m943a(kVar.b())) {
            ClassL.m3161a("      Maybe this is program field '" + ClassI.m748a(0, kVar.b()) + " { " + ClassI.m749a(0, c0163l.mo946a((c) kVar), c0163l.mo949b(kVar)) + "; }'");
        }
    }

    public void m833a(k kVar, ClassN c0165n) {
        if (this.f251c.m943a(kVar.b())) {
            ClassL.m3161a("      Maybe this is program method '" + ClassI.m748a(0, kVar.b()) + " { " + ClassI.m751a(kVar.b(), 0, c0165n.mo946a((c) kVar), c0165n.mo949b(kVar)) + "; }'");
        }
    }
}
