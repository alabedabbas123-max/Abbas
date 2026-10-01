package a.b.a.c;

public class l extends a.b.a.a {
    public int c;
    public a.b.a.c.c[] d;

    public l() {
    }

    public l(int r1, a.b.a.c.c[] r2) {
        this.c = r1;
        this.d = r2;
    }

    public l(a.b.a.c.c[] r2) {
        this(r2.length, r2);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, a.b.a.c.a.a r11) {
        int r0 = 0;
        int r6 = 0;
        a.b.a.c.c r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r6 = r0;
                    if (r6 >= this.c) { $pc0 = 6; continue $sw0; }
                    r5 = this.d[r6];
                    r11.a(r8, r9, r10, r5.b(), r5);
                    r0 = r6 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
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
