package a.b.a;

public class n extends a.b.a.a {
    public int c;
    public a.b.a.m[] d;

    public n() {
    }

    public n(int r1, int r2, a.b.a.m[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public int a() {
        int r0 = 0;
        int r2 = 0;
        a.b.a.m r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r2 = Integer.MAX_VALUE;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.c) { $pc0 = 11; continue $sw0; }
                    r4 = this.d[r0];
                    if (r4.a() != null) { $pc0 = 10; continue $sw0; }
                    r5 = r4.c;
                    if (r5 >= r2) { $pc0 = 10; continue $sw0; }
                    r2 = r5;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 11: {
                    if (r2 != Integer.MAX_VALUE) { $pc0 = 18; continue $sw0; }
                    return 0;
                }
                case 18: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String a(int r2) {
        a.b.a.m r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = b(r2);
                    if (r0 != null) { $pc1 = 7; continue $sw1; }
                    return null;
                }
                case 7: {
                    return r0.a();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.d.o r6) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0 >= this.c) { $pc2 = 6; continue $sw2; }
                    r6.a(r3, r4, r5, this.d[r0]);
                    r0 = r0 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int b() {
        int r0 = 0;
        int r1 = 0;
        a.b.a.m r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= this.c) { $pc3 = 11; continue $sw3; }
                    r2 = this.d[r0];
                    if (r2.a() != null) { $pc3 = 10; continue $sw3; }
                    r3 = r2.c;
                    if (r3 <= r1) { $pc3 = 10; continue $sw3; }
                    r1 = r3;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 11: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public a.b.a.m b(int r4) {
        int r1 = 0;
        a.b.a.m r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = this.c - 1;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 < 0) { $pc4 = 9; continue $sw4; }
                    r0 = this.d[r1];
                    if (r4 >= r0.b) { $pc4 = 15; continue $sw4; }
                    r1 = r1 - 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 15: {
                    return r0;
                }
                case 9: {
                    if (this.c > 0) { $pc4 = 6; continue $sw4; }
                    return null;
                }
                case 6: {
                    return this.d[0];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
