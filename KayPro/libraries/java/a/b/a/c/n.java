package a.b.a.c;

public class n extends a.b.a.a {
    public int c;
    public a.b.a.c.m[] d;

    public n() {
    }

    public n(int r1, a.b.a.c.m[] r2) {
        this.c = r1;
        this.d = r2;
    }

    public n(a.b.a.c.m[] r2) {
        this(r2.length, r2);
    }

    public void a(a.b.c r9, a.b.j r10, a.b.a.d r11, a.b.a.c.a.a r12) {
        int r6 = 0;
        int r4 = 0;
        a.b.a.c.m r0 = null;
        int r2 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = 0;
                    r4 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r6 >= this.c) { $pc0 = 10; continue $sw0; }
                    r0 = this.d[r6];
                    r2 = r0.b();
                    if (r6 != 0) { $pc0 = 9; continue $sw0; }
                    r1 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r4 = r4 + (r1 + r2);
                    r0.a(r9, r10, r11, r4, r12);
                    r6 = r6 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 9: {
                    r1 = 1;
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }
}
