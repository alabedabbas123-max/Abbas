package a.b.a;

public class o implements a.b.o, java.lang.Comparable {

    public int f76a;
    public int b;
    public int c;
    public int d;
    public int e;
    public a.b.c f;
    public java.lang.Object g;

    public o() {
    }

    public o(int r1, int r2, int r3, int r4, int r5) {
        this.f76a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.c);
    }

    public void a(a.b.g.s r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.f == null) { $pc0 = 6; continue $sw0; }
                    this.f.a(r2);
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
    public void a(java.lang.Object r1) {
        this.g = r1;
    }

    public java.lang.String b(a.b.c r2) {
        return r2.c(this.d);
    }

    @Override
    public int compareTo(java.lang.Object r5) {
        a.b.a.o r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = (a.b.a.o) r5;
                    if (this.f76a >= r6.f76a) { $pc1 = 6; continue $sw1; }
                    return -1;
                }
                case 6: {
                    if (this.f76a <= r6.f76a) { $pc1 = 9; continue $sw1; }
                    return 1;
                }
                case 9: {
                    if (this.e >= r6.e) { $pc1 = 11; continue $sw1; }
                    return -1;
                }
                case 11: {
                    if (this.e <= r6.e) { $pc1 = 14; continue $sw1; }
                    return 1;
                }
                case 14: {
                    if (this.b >= r6.b) { $pc1 = 16; continue $sw1; }
                    return -1;
                }
                case 16: {
                    if (this.b <= r6.b) { $pc1 = 19; continue $sw1; }
                    return 1;
                }
                case 19: {
                    if (this.d >= r6.d) { $pc1 = 21; continue $sw1; }
                    return -1;
                }
                case 21: {
                    if (this.d <= r6.d) { $pc1 = 24; continue $sw1; }
                    return 1;
                }
                case 24: {
                    if (this.c >= r6.c) { $pc1 = 26; continue $sw1; }
                    return -1;
                }
                case 26: {
                    if (this.c > r6.c) { $pc1 = 37; continue $sw1; }
                    return 0;
                }
                case 37: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object f() {
        return this.g;
    }
}
