package a.b.a;

public class u extends a.b.a.a {
    public int c;
    public a.b.c[] d;

    public u() {
    }

    public u(int r1, int r2) {
        super(r1);
        this.c = r2;
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    @Override
    public void a(a.b.c r1, a.b.d r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.g.s r3) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.d == null) { $pc0 = 11; continue $sw0; }
                    r0 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 >= this.d.length) { $pc0 = 15; continue $sw0; }
                    if (this.d[r0] == null) { $pc0 = 10; continue $sw0; }
                    this.d[r0].a(r3);
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r0 = r0 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 15: {
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String b(a.b.c r2) {
        return r2.c(this.c);
    }
}
