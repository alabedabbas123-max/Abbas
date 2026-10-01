package a;

public class aa extends a.f {
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final a.f r;

    public aa(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, a.f r8, a.f r9) {
        super(r9);
        this.k = r1;
        this.l = r2;
        this.m = r3;
        this.n = r4;
        this.o = r5;
        this.p = r6;
        this.q = r7;
        this.r = r8;
    }

    @Override
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        a.aa r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (getClass() != r4.getClass()) { $pc0 = 31; continue $sw0; }
                    r5 = (a.aa) r4;
                    if (this.k == r5.k) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    if (this.l == r5.l) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.m == r5.m) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                case 14: {
                    if (this.n == r5.n) { $pc0 = 16; continue $sw0; }
                    return false;
                }
                case 16: {
                    if (this.o == r5.o) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.p == r5.p) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 20: {
                    if (this.q == r5.q) { $pc0 = 22; continue $sw0; }
                    return false;
                }
                case 22: {
                    if (this.r != null) { $pc0 = 29; continue $sw0; }
                    if (r5.r == null) { $pc0 = 26; continue $sw0; }
                    return false;
                }
                case 26: {
                    if (super.equals(r5) == false) { $pc0 = 40; continue $sw0; }
                    return true;
                }
                case 40: {
                    return false;
                }
                case 29: {
                    if (this.r.equals(r5.r) == true) { $pc0 = 26; continue $sw0; }
                    return false;
                }
                case 31: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    if (this.k == false) { $pc1 = 27; continue $sw1; }
                    r0 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (this.l == false) { $pc1 = 28; continue $sw1; }
                    r2 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r3 = r2 ^ r0;
                    if (this.m == false) { $pc1 = 29; continue $sw1; }
                    r4 = 0;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r5 = r3 ^ r4;
                    if (this.n == false) { $pc1 = 30; continue $sw1; }
                    r6 = 0;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r7 = r5 ^ r6;
                    if (this.o == false) { $pc1 = 31; continue $sw1; }
                    r8 = 0;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r9 = r7 ^ r8;
                    if (this.p == false) { $pc1 = 32; continue $sw1; }
                    r10 = 0;
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r11 = r9 ^ r10;
                    if (this.q == false) { $pc1 = 33; continue $sw1; }
                    r12 = 0;
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    r13 = r12 ^ r11;
                    if (this.r == null) { $pc1 = 26; continue $sw1; }
                    r1 = this.r.hashCode();
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    return (r13 ^ r1) ^ super.hashCode();
                }
                case 33: {
                    r12 = 64;
                    { $pc1 = 23; continue $sw1; }
                }
                case 32: {
                    r10 = 32;
                    { $pc1 = 20; continue $sw1; }
                }
                case 31: {
                    r8 = 16;
                    { $pc1 = 17; continue $sw1; }
                }
                case 30: {
                    r6 = 8;
                    { $pc1 = 14; continue $sw1; }
                }
                case 29: {
                    r4 = 4;
                    { $pc1 = 11; continue $sw1; }
                }
                case 28: {
                    r2 = 2;
                    { $pc1 = 8; continue $sw1; }
                }
                case 27: {
                    r0 = 1;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
