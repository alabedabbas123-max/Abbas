package a.b.a.c;

public class c extends a.b.a.c.m {

    public int f51a;
    public a.b.a.c.r[] b;
    public int c;
    public a.b.a.c.r[] d;

    public c() {
    }

    public c(int r1, int r2, a.b.a.c.r[] r3, int r4, a.b.a.c.r[] r5) {
        this.e = r1;
        this.f51a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    public c(int r7, a.b.a.c.r[] r8, a.b.a.c.r[] r9) {
        this(r7, r8.length, r8, r9.length, r9);
    }

    @Override
    public int a() {
        return 255;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r5 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r5 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r5 >= this.f51a) { $pc0 = 6; continue $sw0; }
                    this.b[r5].b(r8, r9, r10, r11, r5, r12);
                    r5 = r5 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r5 >= this.c) { $pc1 = 6; continue $sw1; }
                    this.d[r5].a(r8, r9, r10, r11, r5, r12);
                    r5 = r5 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        a.b.a.c.c r6 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (super.equals(r5) == true) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r6 = (a.b.a.c.c) r5;
                    if (this.e == r6.e) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    if (this.f51a == r6.f51a) { $pc2 = 10; continue $sw2; }
                    return false;
                }
                case 10: {
                    if (this.c != r6.c) { $pc2 = 30; continue $sw2; }
                    r0 = 0;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    if (r0 >= this.f51a) { $pc2 = 17; continue $sw2; }
                    if (this.b[r0].equals(r6.b[r0]) == false) { $pc2 = 32; continue $sw2; }
                    r0 = r0 + 1;
                    { $pc2 = 13; continue $sw2; }
                }
                case 32: {
                    return false;
                }
                case 17: {
                    r1 = 0;
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    if (r1 >= this.c) { $pc2 = 23; continue $sw2; }
                    if (this.d[r1].equals(r6.d[r1]) == false) { $pc2 = 33; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 19; continue $sw2; }
                }
                case 33: {
                    return false;
                }
                case 23: {
                    return true;
                }
                case 30: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        int r1 = 0;
        int r2 = 0;
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = 0;
                    r2 = super.hashCode();
                    r0 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= this.f51a) { $pc3 = 7; continue $sw3; }
                    r2 = r2 ^ this.b[r0].hashCode();
                    r0 = r0 + 1;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1 >= this.c) { $pc3 = 9; continue $sw3; }
                    r2 = r2 ^ this.d[r1].hashCode();
                    r1 = r1 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 9: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        int r1 = 0;
        java.lang.StringBuffer r2 = null;
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = 0;
                    r2 = new java.lang.StringBuffer(super.toString()).append("Var: ");
                    r0 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0 >= this.f51a) { $pc4 = 6; continue $sw4; }
                    r2 = r2.append('[').append(this.b[r0].toString()).append(']');
                    r0 = r0 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    r2.append(", Stack: ");
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r1 >= this.c) { $pc4 = 11; continue $sw4; }
                    r2 = r2.append('[').append(this.d[r1].toString()).append(']');
                    r1 = r1 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 11: {
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
