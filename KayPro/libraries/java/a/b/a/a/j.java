package a.b.a.a;

public abstract class j extends a.b.a.a {
    public int c;
    public int[] d;
    public a.b.a.a.a[][] e;

    protected j() {
    }

    protected j(int r1, int r2, int[] r3, a.b.a.a.a[][] r4) {
        super(r1);
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    public void a(a.b.c r7, a.b.j r8, a.b.a.a.b.f r9) {
        int r0 = 0;
        int r3 = 0;
        a.b.a.a.a[] r4 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.c) { $pc0 = 9; continue $sw0; }
                    r3 = this.d[r0];
                    r4 = this.e[r0];
                    r2 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r2 >= r3) { $pc0 = 8; continue $sw0; }
                    r9.a(r7, r8, r0, r4[r2]);
                    r2 = r2 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
