package a.b.b;

public class r extends a.b.b.b {

    public int f100a;
    public a.b.c b;
    public a.b.i c;
    public a.b.c e;

    public r() {
    }

    public r(int r1, a.b.c r2, a.b.i r3) {
        this.f100a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override
    public int a() {
        return 8;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f100a);
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(a.b.g.aq r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.c == null) { $pc0 = 6; continue $sw0; }
                    this.c.a(this.b, r3);
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
                    if (this.b != null) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    if (this.c != null) { $pc1 = 9; continue $sw1; }
                    this.b.a(r2);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
