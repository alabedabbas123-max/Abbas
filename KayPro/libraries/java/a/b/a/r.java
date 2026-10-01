package a.b.a;

public class r extends a.b.a.a {
    public int c;
    public a.b.a.q[] d;

    public r() {
    }

    public r(int r1, int r2, a.b.a.q[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.d.r r6) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.c) { $pc0 = 6; continue $sw0; }
                    r6.a(r3, r4, r5, this.d[r0]);
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
