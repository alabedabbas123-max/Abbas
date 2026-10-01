package a;

public class f implements java.lang.Cloneable {

    public final java.lang.String f133a;
    public int b;
    public int c;
    public final java.lang.String d;
    public java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.util.List h;
    public java.util.List i;
    public java.util.List j;

    public f() {
        this(null, 0, 0, null, null, null, null);
    }

    public f(a.f r11) {
        this(r11.f133a, r11.b, r11.c, r11.d, r11.e, r11.f, r11.g, r11.i, r11.j);
    }

    public f(java.lang.String r11, int r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        this(r11, r12, r13, r14, r15, r16, r17, null, null);
    }

    public f(java.lang.String r2, int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.util.List r10) {
        this.h = null;
        this.f133a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.i = r9;
        this.j = r10;
    }

    public void a(a.ae r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.i != null) { $pc0 = 5; continue $sw0; }
                    this.i = new java.util.ArrayList();
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.i.add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(a.ae r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j != null) { $pc1 = 5; continue $sw1; }
                    this.j = new java.util.ArrayList();
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    this.j.add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object clone() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return super.clone();
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r4) {
        a.f r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 != null) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    if (getClass() != r4.getClass()) { $pc3 = 54; continue $sw3; }
                    r5 = (a.f) r4;
                    if (this.b == r5.b) { $pc3 = 10; continue $sw3; }
                    return false;
                }
                case 10: {
                    if (this.c == r5.c) { $pc3 = 12; continue $sw3; }
                    return false;
                }
                case 12: {
                    if (this.d != null) { $pc3 = 37; continue $sw3; }
                    if (r5.d == null) { $pc3 = 16; continue $sw3; }
                    return false;
                }
                case 16: {
                    if (this.e != null) { $pc3 = 40; continue $sw3; }
                    if (r5.e == null) { $pc3 = 20; continue $sw3; }
                    return false;
                }
                case 20: {
                    if (this.f != null) { $pc3 = 43; continue $sw3; }
                    if (r5.f == null) { $pc3 = 24; continue $sw3; }
                    return false;
                }
                case 24: {
                    if (this.g != null) { $pc3 = 46; continue $sw3; }
                    if (r5.g == null) { $pc3 = 28; continue $sw3; }
                    return false;
                }
                case 28: {
                    if (this.i != null) { $pc3 = 49; continue $sw3; }
                    if (r5.i == null) { $pc3 = 32; continue $sw3; }
                    return false;
                }
                case 32: {
                    if (this.j != null) { $pc3 = 52; continue $sw3; }
                    if (r5.j != null) { $pc3 = 62; continue $sw3; }
                    $pc3 = 35; continue $sw3;
                }
                case 35: {
                    return true;
                }
                case 62: {
                    return false;
                }
                case 52: {
                    if (this.j.equals(r5.j) == true) { $pc3 = 35; continue $sw3; }
                    return false;
                }
                case 49: {
                    if (this.i.equals(r5.i) == true) { $pc3 = 32; continue $sw3; }
                    return false;
                }
                case 46: {
                    if (this.g.equals(r5.g) == true) { $pc3 = 28; continue $sw3; }
                    return false;
                }
                case 43: {
                    if (this.f.equals(r5.f) == true) { $pc3 = 24; continue $sw3; }
                    return false;
                }
                case 40: {
                    if (this.e.equals(r5.e) == true) { $pc3 = 20; continue $sw3; }
                    return false;
                }
                case 37: {
                    if (this.d.equals(r5.d) == true) { $pc3 = 16; continue $sw3; }
                    return false;
                }
                case 54: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r1 = 0;
        int r2 = 0;
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = 0;
                    r2 = this.c ^ this.b;
                    if (this.d != null) { $pc4 = 21; continue $sw4; }
                    r0 = 0;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r3 = r2 ^ r0;
                    if (this.e != null) { $pc4 = 22; continue $sw4; }
                    r4 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r5 = r3 ^ r4;
                    if (this.f != null) { $pc4 = 23; continue $sw4; }
                    r6 = 0;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    r7 = r5 ^ r6;
                    if (this.g != null) { $pc4 = 24; continue $sw4; }
                    r8 = 0;
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    r9 = r7 ^ r8;
                    if (this.i != null) { $pc4 = 25; continue $sw4; }
                    r10 = 0;
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    r11 = r10 ^ r9;
                    if (this.j == null) { $pc4 = 20; continue $sw4; }
                    r1 = this.j.hashCode();
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    return r11 ^ r1;
                }
                case 25: {
                    r10 = this.i.hashCode();
                    { $pc4 = 17; continue $sw4; }
                }
                case 24: {
                    r8 = this.g.hashCode();
                    { $pc4 = 14; continue $sw4; }
                }
                case 23: {
                    r6 = this.f.hashCode();
                    { $pc4 = 11; continue $sw4; }
                }
                case 22: {
                    r4 = this.e.hashCode();
                    { $pc4 = 8; continue $sw4; }
                }
                case 21: {
                    r0 = this.d.hashCode();
                    { $pc4 = 5; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
