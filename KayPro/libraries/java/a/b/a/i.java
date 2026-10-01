package a.b.a;

public class i extends a.b.a.a {
    public int c;
    public int[] d;

    public i() {
    }

    public i(int r1, int r2, int[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public void a(a.b.c r3, a.b.b.a.f r4) {
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
                    r3.a(this.d[r0], r4);
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

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }
}
