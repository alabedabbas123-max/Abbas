package a.b.a;

public class g extends a.b.a.a {
    public int c;
    public int d;
    public a.b.c e;
    public a.b.j f;

    public g() {
    }

    public g(int r1, int r2, int r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    public void a(a.b.g.s r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.e == null) { $pc0 = 6; continue $sw0; }
                    this.e.a(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String b(a.b.c r2) {
        return r2.e(this.c);
    }

    public java.lang.String c(a.b.c r2) {
        return r2.f(this.d);
    }

    public java.lang.String d(a.b.c r2) {
        return r2.g(this.d);
    }
}
