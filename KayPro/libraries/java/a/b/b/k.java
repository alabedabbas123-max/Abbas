package a.b.b;

public class k extends a.b.b.b {

    public int f94a;
    public a.b.c b;
    public a.b.c[] c;

    public k() {
    }

    public k(int r1, a.b.c[] r2) {
        this.f94a = r1;
        this.c = r2;
    }

    @Override
    public int a() {
        return 16;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f94a);
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(a.b.g.s r3) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.c == null) { $pc0 = 11; continue $sw0; }
                    r0 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 >= this.c.length) { $pc0 = 15; continue $sw0; }
                    if (this.c[r0] == null) { $pc0 = 10; continue $sw0; }
                    this.c[r0].a(r3);
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
}
