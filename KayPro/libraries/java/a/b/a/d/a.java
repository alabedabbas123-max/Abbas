package a.b.a.d;

public class a extends a.b.f.w implements a.b.a.d.i, a.b.g.aq, a.b.g.s {

    private final boolean f58a;
    private final a.b.a.d.i b;

    public a(a.b.a.d.i r2) {
        this(false, r2);
    }

    public a(boolean r1, a.b.a.d.i r2) {
        this.f58a = r1;
        this.b = r2;
    }

    @Override
    public void a(a.b.c r1, a.b.a.a r2) {
    }

    @Override
    public void a(a.b.c r2, a.b.j r3, a.b.a.d r4) {
        r4.b(r2, r3, this.b);
    }

    @Override
    public void a(a.b.e r1) {
    }

    @Override
    public void a(a.b.e r1, a.b.g r2) {
    }

    @Override
    public void a(a.b.k r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2.a(this.b);
                    if (this.f58a == false) { $pc0 = 6; continue $sw0; }
                    r2.a(this);
                    r2.b(this);
                    r2.a(this);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.k r2, a.b.m r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3.a(r2, this.b);
                    if (this.f58a == false) { $pc1 = 6; continue $sw1; }
                    r3.a(r2, this);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
