package a.b.c;

public class al implements a.b.a.d.l {

    private final a.b.c.ad f114a;
    private final a.b.c.u b;

    public al(a.b.k r2, a.b.c.u r3) {
        this.f114a = new a.b.c.ad(r2);
        this.b = r3;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, a.b.a.h r10) {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r0 = 0;
        a.b.a.h r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2 = r10.f73a;
                    r3 = r10.b;
                    r4 = r10.c;
                    if (r10.d != 0) { $pc0 = 7; continue $sw0; }
                    r0 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r1 = new a.b.a.h(r2, r3, r4, r0);
                    this.b.a(r1);
                    return;
                }
                case 7: {
                    r0 = this.f114a.a(r7, r10.d);
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
