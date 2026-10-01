package a.b.a.c;

public class g extends a.b.a.c.m {

    public int f53a;
    public a.b.a.c.r[] b;

    public g() {
    }

    public g(int r2) {
        this.f53a = (r2 + 1) - 252;
    }

    public g(int r1, a.b.a.c.r[] r2) {
        this.f53a = r1;
        this.b = r2;
    }

    public g(a.b.a.c.r[] r2) {
        this(r2.length, r2);
    }

    @Override
    public int a() {
        return (this.f53a + 252) - 1;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r0 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r6 = r0;
                    if (r6 >= this.f53a) { $pc0 = 6; continue $sw0; }
                    this.b[r6].a(r8, r9, r10, r11, r12);
                    r0 = r6 + 1;
                    { $pc0 = 3; continue $sw0; }
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
        a.b.a.c.g r6 = null;
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (super.equals(r5) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r6 = (a.b.a.c.g) r5;
                    if (this.e == r6.e) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (this.f53a != r6.f53a) { $pc1 = 19; continue $sw1; }
                    r0 = 0;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r0 >= this.f53a) { $pc1 = 15; continue $sw1; }
                    if (this.b[r0].equals(r6.b[r0]) == false) { $pc1 = 21; continue $sw1; }
                    r0 = r0 + 1;
                    { $pc1 = 11; continue $sw1; }
                }
                case 21: {
                    return false;
                }
                case 15: {
                    return true;
                }
                case 19: {
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = super.hashCode();
                    r0 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0 >= this.f53a) { $pc2 = 6; continue $sw2; }
                    r1 = r1 ^ this.b[r0].hashCode();
                    r0 = r0 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuffer r1 = null;
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = new java.lang.StringBuffer(super.toString()).append("Var: ...");
                    r0 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= this.f53a) { $pc3 = 6; continue $sw3; }
                    r1 = r1.append('[').append(this.b[r0].toString()).append(']');
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    r1.append(", Stack: (empty)");
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
