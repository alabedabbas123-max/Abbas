package a.b.c;

public class aj {

    private final a.b.k f112a;
    private final a.b.a.a.a b;
    private final a.b.a.a.e c;
    private final boolean d;

    public aj(a.b.k r2, a.b.a.a.a r3, boolean r4) {
        this.f112a = r2;
        this.b = r3;
        this.c = null;
        this.d = r4;
    }

    public aj(a.b.k r2, a.b.a.a.e r3, boolean r4) {
        this.f112a = r2;
        this.b = null;
        this.c = r3;
        this.d = r4;
    }

    private int a(int r4, a.b.a.a.h[] r5, java.lang.String r6) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r4) { $pc0 = 8; continue $sw0; }
                    if (r5[r0].b(this.f112a).equals(r6) == true) { $pc0 = 11; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 11: {
                    return r0;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean a(int r2, a.b.a.a.h[] r3, a.b.a.a.h r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = a(r2, r3, r4.b(this.f112a));
                    if (r0 >= 0) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    r3[r0] = r4;
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private a.b.a.a.h[] b(int r3, a.b.a.a.h[] r4, a.b.a.a.h r5) {
        a.b.a.a.h[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4.length > r3) { $pc2 = 5; continue $sw2; }
                    r0 = new a.b.a.a.h[r3 + 1];
                    java.lang.System.arraycopy(r4, 0, r0, 0, r3);
                    r4 = r0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r4[r3] = r5;
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.a.a.h r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.b == null) { $pc3 = 11; continue $sw3; }
                    if (this.d == true) { $pc3 = 7; continue $sw3; }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    this.b.c = b(this.b.b, this.b.c, r4);
                    this.b.b++;
                    return;
                }
                case 7: {
                    if (a(this.b.b, this.b.c, r4) == false) { $pc3 = 8; continue $sw3; }
                    return;
                }
                case 11: {
                    if (this.d == true) { $pc3 = 13; continue $sw3; }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    this.c.b = b(this.c.f41a, this.c.b, r4);
                    this.c.f41a++;
                    return;
                }
                case 13: {
                    if (a(this.c.f41a, this.c.b, r4) == false) { $pc3 = 14; continue $sw3; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
