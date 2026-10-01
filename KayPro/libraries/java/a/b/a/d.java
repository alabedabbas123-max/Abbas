package a.b.a;

public class d extends a.b.a.a {
    private static final byte[] k = null;
    private static final a.b.a.h[] l = null;
    private static final a.b.a.a[] m = null;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    public int g;
    public a.b.a.h[] h;
    public int i;
    public a.b.a.a[] j;

    static {
        k = new byte[0];
        l = new a.b.a.h[0];
        m = new a.b.a.a[0];
    }

    public d() {
    }

    public d(int r7) {
        this(r7, 0, 0, 0, k);
    }

    public d(int r11, int r12, int r13, int r14, byte[] r15) {
        this(r11, r12, r13, r14, r15, 0, l, 0, m);
    }

    public d(int r1, int r2, int r3, int r4, byte[] r5, int r6, a.b.a.h[] r7, int r8, a.b.a.a[] r9) {
        super(r1);
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r9;
    }

    public a.b.a.a a(a.b.c r4, java.lang.String r5) {
        int r0 = 0;
        a.b.a.a r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.i) { $pc0 = 10; continue $sw0; }
                    r1 = this.j[r0];
                    if (r1.a(r4).equals(r5) == true) { $pc0 = 8; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 8: {
                    return r1;
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r4, a.b.j r5, int r6, int r7, a.b.a.d.l r8) {
        int r0 = 0;
        a.b.a.h r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 >= this.g) { $pc1 = 9; continue $sw1; }
                    r1 = this.h[r0];
                    if (r1.a(r6, r7) == false) { $pc1 = 8; continue $sw1; }
                    r8.a(r4, r5, this, r1);
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r8, a.b.j r9, int r10, int r11, a.b.d.a.d r12) {
        int r4 = 0;
        a.b.d.c r0 = null;
        int r6 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r4 = r10;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r4 >= r11) { $pc2 = 5; continue $sw2; }
                    r0 = a.b.d.e.a(this.f, r4);
                    r6 = r0.a(r4);
                    r0.a(r8, r9, this, r4, r12);
                    r4 = r4 + r6;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r4, a.b.j r5, int r6, a.b.a.d.l r7) {
        int r0 = 0;
        a.b.a.h r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= this.g) { $pc3 = 9; continue $sw3; }
                    r1 = this.h[r0];
                    if (r1.a(r6) == false) { $pc3 = 8; continue $sw3; }
                    r7.a(r4, r5, this, r1);
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r7, a.b.j r8, int r9, a.b.d.a.d r10) {
        a.b.d.e.a(this.f, r9).a(r7, r8, this, r9, r10);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d.l r5) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0 >= this.g) { $pc4 = 6; continue $sw4; }
                    r5.a(r3, r4, this, this.h[r0]);
                    r0 = r0 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.c r7, a.b.j r8, a.b.d.a.d r9) {
        a(r7, r8, 0, this.e, r9);
    }

    public void b(a.b.c r3, a.b.j r4, a.b.a.d.i r5) {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0 >= this.i) { $pc5 = 6; continue $sw5; }
                    this.j[r0].a(r3, r4, this, r5);
                    r0 = r0 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
