package a.b.a.c;

public class j extends a.b.a.c.m {

    public a.b.a.c.r f55a;

    public j() {
    }

    public j(int r2) {
        this.e = r2 - 64;
    }

    public j(a.b.a.c.r r1) {
        this.f55a = r1;
    }

    @Override
    public int a() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.e < 64) { $pc0 = 5; continue $sw0; }
                    return 247;
                }
                case 5: {
                    return this.e + 64;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.b r11) {
        this.f55a.a(r7, r8, r9, r10, r11);
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        a.b.a.c.j r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (super.equals(r4) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r5 = (a.b.a.c.j) r4;
                    if (this.e == r5.e) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (this.f55a.equals(r5.f55a) == false) { $pc1 = 11; continue $sw1; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f55a.hashCode();
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + "Var: ..., Stack: [" + this.f55a.toString() + "]";
    }
}
