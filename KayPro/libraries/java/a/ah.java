package a;

public class ah {

    private final a.h f16a;
    private a.b.b b;
    private final a.b.b c;
    private final a.j.n d;

    public ah(a.h r2) {
        this.b = new a.b.b();
        this.c = new a.b.b();
        this.d = new a.j.n();
        this.f16a = r2;
    }

    private boolean a(int r5, int r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.f16a.R == false) { $pc0 = 6; continue $sw0; }
                    a.j.l.a("Optimizing (pass " + r5 + "/" + r6 + ")...");
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new a.g.m(this.f16a).a(this.b, this.c, this.d);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void b() {
        java.io.PrintWriter r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.f16a.R == false) { $pc1 = 5; continue $sw1; }
                    a.j.l.a("Printing configuration to [" + a.j.r.b(this.f16a.V) + "]...");
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = a.j.r.a(this.f16a.V);
                    try {
                        new a.l(r1).a(this.f16a);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    a.j.r.a(this.f16a.V, r1);
                    return;
                }
                case 9: {
                    th = $ex1;
                    a.j.r.a(this.f16a.V, r1);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void c() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.f16a.R == false) { $pc2 = 5; continue $sw2; }
                    a.j.l.a("Reading input...");
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    new a.y(this.f16a).a(this.b, this.c);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void d() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.f16a.R == false) { $pc3 = 5; continue $sw3; }
                    a.j.l.a("Initializing...");
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    new a.x(this.f16a).a(this.b, this.c);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void e() {
        this.b.a(new a.b.f.d());
    }

    private void f() {
        this.b.a(new a.b.f.v());
    }

    private void g() {
        new a.a.a(this.f16a).a(this.b, this.c, this.d);
    }

    private void h() {
        new a.c.c(this.f16a).a(this.b, this.c, this.d);
    }

    private void i() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.f16a.R == false) { $pc4 = 5; continue $sw4; }
                    a.j.l.a("Setting target versions...");
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    new a.aj(this.f16a).a(this.b);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j() {
        java.io.PrintWriter r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.f16a.R == false) { $pc5 = 5; continue $sw5; }
                    a.j.l.a("Printing kept classes, fields, and methods...");
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r1 = a.j.r.a(this.f16a.j);
                    try {
                        new a.ai(r1).a(this.f16a, this.b, this.c);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    a.j.r.a(this.f16a.j, r1);
                    return;
                }
                case 9: {
                    th = $ex5;
                    a.j.r.a(this.f16a.j, r1);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void k() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.f16a.R == false) { $pc6 = 10; continue $sw6; }
                    a.j.l.a("Shrinking...");
                    if (this.f16a.m == null) { $pc6 = 8; continue $sw6; }
                    a.j.l.a("Explaining why classes and class members are being kept...");
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    if (this.f16a.l == null) { $pc6 = 10; continue $sw6; }
                    a.j.l.a("Printing usage to [" + a.j.r.b(this.f16a.l) + "]...");
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    this.b = new a.i.m(this.f16a).a(this.b, this.c);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void l() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.f16a.R == false) { $pc7 = 5; continue $sw7; }
                    a.j.l.a("Inlining subroutines...");
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    new a.h.d(this.f16a).a(this.b);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void m() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.f16a.R == false) { $pc8 = 10; continue $sw8; }
                    a.j.l.a("Obfuscating...");
                    if (this.f16a.y == null) { $pc8 = 8; continue $sw8; }
                    a.j.l.a("Applying mapping [" + a.j.r.b(this.f16a.y) + "]");
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (this.f16a.x == null) { $pc8 = 10; continue $sw8; }
                    a.j.l.a("Printing mapping to [" + a.j.r.b(this.f16a.x) + "]...");
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    new a.f.w(this.f16a).a(this.b, this.c);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void n() {
        this.b.a(new a.g.c.q());
    }

    private void o() {
        this.b.a(new a.b.a.d.a(true, new a.b.c.ba()));
    }

    private void p() {
        this.b.a(new a.b.g.q(3276800, new a.b.g.d(new a.b.a.d.a(new a.b.c.bj("StackMapTable")))));
    }

    private void q() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.f16a.R == false) { $pc9 = 5; continue $sw9; }
                    a.j.l.a("Preverifying...");
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    new a.h.c(this.f16a).a(this.b);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void r() {
        this.b.a(new a.b.c.s());
    }

    private void s() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.f16a.R == false) { $pc10 = 5; continue $sw10; }
                    a.j.l.a("Writing output...");
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    new a.af(this.f16a).a(this.b, this.d);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void t() {
        java.io.PrintWriter r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (this.f16a.R == false) { $pc11 = 5; continue $sw11; }
                    a.j.l.a("Printing classes to [" + a.j.r.b(this.f16a.W) + "]...");
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    r1 = a.j.r.a(this.f16a.W);
                    try {
                        this.b.a(new a.b.g.p(r1));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    a.j.r.a(this.f16a.W, r1);
                    return;
                }
                case 9: {
                    th = $ex11;
                    a.j.r.a(this.f16a.W, r1);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a() {
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    a.j.l.a("ProGuard, version 6.0.3");
                    a.s.a();
                    if (this.f16a.V == null) { $pc12 = 5; continue $sw12; }
                    b();
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    new a.i(this.f16a).a();
                    if (this.f16a.b == null) { $pc12 = 13; continue $sw12; }
                    if (this.f16a.b.a() == false) { $pc12 = 13; continue $sw12; }
                    if (new a.ak(this.f16a).a() == false) { $pc12 = 13; continue $sw12; }
                    return;
                }
                case 13: {
                    if (this.f16a.g == 0) { $pc12 = 15; continue $sw12; }
                    this.f16a.Y = true;
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    c();
                    if (this.f16a.k == false) { $pc12 = 18; continue $sw12; }
                    $pc12 = 23; continue $sw12;
                }
                case 23: {
                    p();
                    $pc12 = 25; continue $sw12;
                }
                case 25: {
                    if (this.f16a.j == null) { $pc12 = 27; continue $sw12; }
                    $pc12 = 36; continue $sw12;
                }
                case 36: {
                    d();
                    $pc12 = 38; continue $sw12;
                }
                case 38: {
                    if (this.f16a.w == false) { $pc12 = 40; continue $sw12; }
                    $pc12 = 41; continue $sw12;
                }
                case 41: {
                    e();
                    $pc12 = 43; continue $sw12;
                }
                case 43: {
                    if (this.f16a.Y == false) { $pc12 = 46; continue $sw12; }
                    g();
                    $pc12 = 46; continue $sw12;
                }
                case 46: {
                    if (this.f16a.X == false) { $pc12 = 49; continue $sw12; }
                    h();
                    $pc12 = 49; continue $sw12;
                }
                case 49: {
                    if (this.f16a.j == null) { $pc12 = 52; continue $sw12; }
                    j();
                    $pc12 = 52; continue $sw12;
                }
                case 52: {
                    if (this.f16a.O == false) { $pc12 = 54; continue $sw12; }
                    $pc12 = 55; continue $sw12;
                }
                case 55: {
                    l();
                    $pc12 = 57; continue $sw12;
                }
                case 57: {
                    if (this.f16a.k == false) { $pc12 = 60; continue $sw12; }
                    k();
                    $pc12 = 60; continue $sw12;
                }
                case 60: {
                    if (this.f16a.n == false) { $pc12 = 68; continue $sw12; }
                    r0 = 0;
                    $pc12 = 63; continue $sw12;
                }
                case 63: {
                    if (r0 >= this.f16a.p) { $pc12 = 66; continue $sw12; }
                    if (a(r0 + 1, this.f16a.p) == false) { $pc12 = 66; continue $sw12; }
                    if (this.f16a.k == false) { $pc12 = 102; continue $sw12; }
                    this.f16a.l = null;
                    this.f16a.m = null;
                    k();
                    $pc12 = 102; continue $sw12;
                }
                case 102: {
                    r0 = r0 + 1;
                    $pc12 = 66; continue $sw12;
                }
                case 66: {
                    n();
                    $pc12 = 68; continue $sw12;
                }
                case 68: {
                    if (this.f16a.w == false) { $pc12 = 71; continue $sw12; }
                    m();
                    $pc12 = 71; continue $sw12;
                }
                case 71: {
                    if (this.f16a.n == false) { $pc12 = 73; continue $sw12; }
                    $pc12 = 74; continue $sw12;
                }
                case 74: {
                    f();
                    $pc12 = 76; continue $sw12;
                }
                case 76: {
                    if (this.f16a.n == false) { $pc12 = 79; continue $sw12; }
                    o();
                    $pc12 = 79; continue $sw12;
                }
                case 79: {
                    if (this.f16a.g == 0) { $pc12 = 82; continue $sw12; }
                    i();
                    $pc12 = 82; continue $sw12;
                }
                case 82: {
                    if (this.f16a.O == false) { $pc12 = 85; continue $sw12; }
                    q();
                    $pc12 = 85; continue $sw12;
                }
                case 85: {
                    if (this.f16a.k == false) { $pc12 = 87; continue $sw12; }
                    $pc12 = 92; continue $sw12;
                }
                case 92: {
                    r();
                    $pc12 = 94; continue $sw12;
                }
                case 94: {
                    if (this.f16a.b.a() == false) { $pc12 = 97; continue $sw12; }
                    s();
                    $pc12 = 97; continue $sw12;
                }
                case 97: {
                    if (this.f16a.W == null) { $pc12 = 107; continue $sw12; }
                    t();
                    return;
                }
                case 107: {
                    return;
                }
                case 87: {
                    if (this.f16a.n == true) { $pc12 = 92; continue $sw12; }
                    if (this.f16a.w == true) { $pc12 = 92; continue $sw12; }
                    if (this.f16a.O == false) { $pc12 = 94; continue $sw12; }
                    $pc12 = 73; continue $sw12;
                }
                case 73: {
                    if (this.f16a.w == false) { $pc12 = 76; continue $sw12; }
                    $pc12 = 54; continue $sw12;
                }
                case 54: {
                    if (this.f16a.Q == false) { $pc12 = 57; continue $sw12; }
                    $pc12 = 40; continue $sw12;
                }
                case 40: {
                    if (this.f16a.n == false) { $pc12 = 43; continue $sw12; }
                    $pc12 = 27; continue $sw12;
                }
                case 27: {
                    if (this.f16a.k == true) { $pc12 = 36; continue $sw12; }
                    if (this.f16a.n == true) { $pc12 = 36; continue $sw12; }
                    if (this.f16a.w == true) { $pc12 = 36; continue $sw12; }
                    if (this.f16a.O == true) { $pc12 = 36; continue $sw12; }
                    if (this.f16a.Y == false) { $pc12 = 38; continue $sw12; }
                    $pc12 = 18; continue $sw12;
                }
                case 18: {
                    if (this.f16a.n == true) { $pc12 = 23; continue $sw12; }
                    if (this.f16a.w == true) { $pc12 = 23; continue $sw12; }
                    if (this.f16a.O == false) { $pc12 = 25; continue $sw12; }
                    { $pc12 = 23; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
