package a.b.a.a;

public class f extends a.b.a.a.h {

    public int f42a;
    public a.b.c[] b;

    public f() {
    }

    public f(int r1, int r2) {
        super(r1);
        this.f42a = r2;
    }

    @Override
    public char a() {
        return 'c';
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f42a);
    }

    @Override
    public void a(a.b.c r1, a.b.a.a.a r2, a.b.a.a.b.g r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.g.s r3) {
        int r0 = 0;
        a.b.c r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.b == null) { $pc0 = 11; continue $sw0; }
                    r0 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 >= this.b.length) { $pc0 = 15; continue $sw0; }
                    r1 = this.b[r0];
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    r1.a(r3);
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
