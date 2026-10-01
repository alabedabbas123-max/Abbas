package a.b.a.a;

public class q extends a.b.a.a.a {
    public a.b.a.a.a.h f;
    public a.b.a.a.s[] g;

    public q() {
    }

    public q(int r1, int r2, a.b.a.a.h[] r3, a.b.a.a.a.h r4, a.b.a.a.s[] r5) {
        super(r1, r2, r3);
        this.f = r4;
        this.g = r5;
    }

    public void a(a.b.c r2, a.b.a.a.a.a.b r3) {
        this.f.a(r2, this, r3);
    }

    public void a(a.b.c r3, a.b.a.a.b.i r4) {
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
                    if (r0 >= this.g.length) { $pc0 = 6; continue $sw0; }
                    r4.a(r3, this, this.g[r0]);
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
