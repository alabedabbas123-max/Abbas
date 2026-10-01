package a.b.b;

public abstract class q extends a.b.b.b {

    public int f99a;
    public int b;
    public a.b.c c;
    public a.b.i e;

    protected q() {
    }

    public java.lang.String a(a.b.c r2) {
        return r2.e(this.f99a);
    }

    public void a(a.b.g.aq r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.e == null) { $pc0 = 6; continue $sw0; }
                    this.e.a(this.c, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.g.s r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.c == null) { $pc1 = 6; continue $sw1; }
                    this.c.a(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int b() {
        return this.f99a;
    }

    public java.lang.String b(a.b.c r2) {
        return r2.f(this.b);
    }

    public int c() {
        return this.b;
    }

    public java.lang.String c(a.b.c r2) {
        return r2.g(this.b);
    }
}
