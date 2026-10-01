package a.a;

public class b extends a.b.f.w implements a.b.a.d.i, a.b.g.s {

    private final a.b.g.s f2a;
    private final a.b.g.aq b;
    private final java.util.Set c;
    private boolean d;

    public b(a.b.g.s r2, a.b.g.aq r3) {
        this.c = new java.util.LinkedHashSet();
        this.f2a = r2;
        this.b = r3;
    }

    private void a(a.b.k r11, a.b.k r12, a.b.n r13) {
        a.a.c r0 = new a.a.c(this);
        r13.a(r12, new a.b.c.bf(r11, r0, null));
        a.b.i r1 = r11.b(r0.a(r13.a(r12)), r13.b(r12));
        a.b.c.ar r2 = new a.b.c.ar();
        a.b.d.c[] r3 = r2.b(r12, r13).b();
        a.b.d.c[] r4 = r2.a(r11, r1).b();
        a.b.c.v r6 = new a.b.c.v();
        a.b.b.b[] r5 = r2.d();
        r11.a(new a.b.g.d(new a.b.a.d.a(new a.g.c.v(null, r6, new a.g.c.k(r5, r3, r5, r4, null, r6)))));
    }

    private boolean a(a.b.c r6, a.b.c r7, a.b.j r8) {
        a.b.b.a.d r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new a.b.b.a.d();
                    r6.a(new a.b.g.d(new a.b.a.d.a(new a.b.d.a.a(new a.a.d(r7, r8, r0)))));
                    if (r0.a() <= 0) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean a(a.b.c r8, java.lang.String r9, java.lang.String r10) {
        a.b.g.al r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = new a.b.g.al();
                    r8.a(true, true, false, false, new a.b.g.ay(r9, r10, r6));
                    if (r6.a() <= 0) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r1, a.b.a.a r2) {
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9) {
        a.b.k r10 = null;
        a.b.j r11 = null;
        java.util.Iterator r1 = null;
        a.b.k r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.d = true;
                    r10 = (a.b.k) r7;
                    r11 = (a.b.n) r8;
                    r1 = this.c.iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc2 = 11; continue $sw2; }
                    r0 = (a.b.k) ((a.b.c) r1.next());
                    if (a(r0, r11.a(r10), r11.b(r10)) == true) { $pc2 = 9; continue $sw2; }
                    r11.a(r10, new a.b.c.bf(r0));
                    r0.a(this.f2a);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (a(r0, r10, r11) == false) { $pc2 = 4; continue $sw2; }
                    a(r0, r10, r11);
                    r0.a(this.f2a);
                    { $pc2 = 4; continue $sw2; }
                }
                case 11: {
                    r11.a(r10, new a.b.g.av(new a.b.g.aq[]{new a.b.c.bj("Code"), new a.b.g.ai(1024)}));
                    if (this.b == null) { $pc2 = 20; continue $sw2; }
                    r11.a(r10, this.b);
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.e r1) {
    }

    @Override
    public void a(a.b.k r7) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.d = false;
                    this.c.clear();
                    r7.a(false, false, false, true, new a.b.g.bh(new a.b.g.h(this.c)));
                    r7.a(new a.b.g.d(new a.b.g.ag(0, 8, new a.b.a.d.a(this))));
                    if (this.d == false) { $pc3 = 6; continue $sw3; }
                    r7.a(new a.b.c.ag());
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
