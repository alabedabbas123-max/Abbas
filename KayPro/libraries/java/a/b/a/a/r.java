package a.b.a.a;

public abstract class r extends a.b.a.a.d {
    protected r() {
    }

    protected r(int r1, int r2, a.b.a.a.q[] r3) {
        super(r1, r2, r3);
    }

    public void a(a.b.c r4, a.b.a.a.b.h r5) {
        a.b.a.a.q[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (a.b.a.a.q[]) this.d;
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1 >= this.c) { $pc0 = 6; continue $sw0; }
                    r5.a(r4, r0[r1]);
                    r1 = r1 + 1;
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
