package a.a;

public class a {

    private final a.h f1a;

    public a(a.h r1) {
        this.f1a = r1;
    }

    public void a(a.b.b r25, a.b.b r26, a.j.n r27) {
        int r0 = 0;
        a.b.d.a.c r17 = null;
        a.b.g.i r18 = null;
        a.b.g.al r9 = null;
        a.b.g.al r19 = null;
        a.b.d.a.c r15 = null;
        a.b.c.v r4 = null;
        a.b.b r5 = null;
        a.b.b r10 = null;
        a.b.b r11 = null;
        a.b.g.m r8 = null;
        a.b.c.ar r6 = null;
        a.b.d.c[][][] r12 = null;
        a.b.b.b[] r13 = null;
        a.b.c.v r14 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.f1a.g;
                    if (this.f1a.R == false) { $pc0 = 5; continue $sw0; }
                    a.j.l.a("Backporting class files...");
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r25.a(new a.b.g.g());
                    r26.a(new a.b.g.g());
                    r17 = new a.b.d.a.c();
                    r18 = new a.b.g.i();
                    r9 = new a.b.g.al();
                    r19 = new a.b.g.al();
                    r15 = new a.b.d.a.c();
                    if (r0 >= 3473408) { $pc0 = 9; continue $sw0; }
                    r4 = new a.b.c.v(true, true);
                    r25.a(new a.b.g.q(3473408, new a.b.a.d.a(new a.b.a.d.g("BootstrapMethods", new a.b.a.d.h(new a.b.g.at(new a.b.g.s[]{new a.b.g.d(new a.b.a.d.a(new a.g.c.v(r4, new a.a.j(r17, r4)))), new a.b.c.o(), new a.b.f.f(r25, r26)}))))));
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r0 >= 3407872) { $pc0 = 12; continue $sw0; }
                    r5 = new a.b.b();
                    r25.a(new a.b.g.q(3407872, new a.b.a.d.a(new a.b.a.d.g("BootstrapMethods", new a.b.a.d.h(new a.b.g.m(r5))))));
                    r5.a(new a.b.g.at(new a.b.g.s[]{new a.a.g(r25, r26, r27, r18), new a.b.c.o(), new a.b.f.f(r25, r26)}));
                    r10 = new a.b.b();
                    r25.a(new a.b.g.q(3407872, new a.b.g.f(512, 0, new a.b.g.m(r10))));
                    r11 = new a.b.b();
                    r8 = new a.b.g.m(r11);
                    r10.a(new a.b.g.at(new a.b.g.s[]{new a.a.h(r25, r26, r27, r8, r9), new a.a.b(r8, r19)}));
                    r11.a(new a.b.f.f(r25, r26));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r0 >= 3342336) { $pc0 = 14; continue $sw0; }
                    r6 = new a.b.c.ar(r25, r26);
                    r12 = new a.b.d.c[][][]{new a.b.d.c[][]{r6.d("java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;").b(), r6.D().b("java/lang/Object", "getClass", "()Ljava/lang/Class;").B().b()}, new a.b.d.c[][]{r6.b("java/util/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V").b(), r6.B().B().b()}};
                    r13 = r6.d();
                    r14 = new a.b.c.v();
                    r25.a(new a.b.g.d(new a.b.a.d.a(new a.g.c.v(null, r14, new a.g.c.p(r13, r12, null, r14, r15)))));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r0 == 0) { $pc0 = 17; continue $sw0; }
                    r25.a(new a.b.g.r(r0));
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    if (this.f1a.R == false) { $pc0 = 20; continue $sw0; }
                    a.j.l.a("  Number of converted string concatenations:     " + r17.a());
                    a.j.l.a("  Number of converted lambda expressions:        " + r18.a());
                    a.j.l.a("  Number of converted static interface methods:  " + r9.a());
                    a.j.l.a("  Number of converted default interface methods: " + r19.a());
                    a.j.l.a("  Number of replaced Java 7+ method calls:       " + r15.a());
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
