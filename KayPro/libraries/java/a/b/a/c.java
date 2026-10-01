package a.b.a;

public class c extends a.b.a.a {
    public int c;
    public a.b.a.b[] d;

    public c() {
    }

    public c(int r1, int r2, a.b.a.b[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public void a(a.b.c r2, int r3, a.b.a.d.j r4) {
        r4.a(r2, this.d[r3]);
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    public void a(a.b.c r3, a.b.a.d.j r4) {
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
                    r4.a(r3, this.d[r0]);
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
