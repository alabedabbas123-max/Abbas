package a.b.a.a;

public class a implements a.b.o {

    public int f24a;
    public int b;
    public a.b.a.a.h[] c;
    public a.b.c[] d;
    public java.lang.Object e;

    public a() {
    }

    public a(int r1, int r2, a.b.a.a.h[] r3) {
        this.f24a = r1;
        this.b = r2;
        this.c = r3;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f24a);
    }

    public void a(a.b.c r3, a.b.a.a.b.g r4) {
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
                    if (r0 >= this.b) { $pc0 = 6; continue $sw0; }
                    this.c[r0].a(r3, this, r4);
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

    public void a(a.b.g.s r3) {
        a.b.c r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.d == null) { $pc1 = 8; continue $sw1; }
                    r0 = this.d[0];
                    if (r0 == null) { $pc1 = 9; continue $sw1; }
                    r0.a(r3);
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(java.lang.Object r1) {
        this.e = r1;
    }

    public void b(a.b.g.s r3) {
        int r0 = 0;
        a.b.c r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.d == null) { $pc2 = 11; continue $sw2; }
                    r0 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r0 >= this.d.length) { $pc2 = 15; continue $sw2; }
                    r1 = this.d[r0];
                    if (r1 == null) { $pc2 = 10; continue $sw2; }
                    r1.a(r3);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r0 = r0 + 1;
                    { $pc2 = 6; continue $sw2; }
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

    @Override
    public java.lang.Object f() {
        return this.e;
    }
}
