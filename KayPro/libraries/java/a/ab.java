package a;

public class ab extends a.g {

    private final boolean f11a;
    private final boolean b;
    private final boolean c;

    public ab(boolean r1, boolean r2, boolean r3) {
        this.f11a = r1;
        this.b = r2;
        this.c = r3;
    }

    private a.b.g.n a(a.aa r13, a.b.g.s r14, a.b.g.aq r15, a.b.g.aq r16, a.b.a.d.i r17, java.util.List r18) {
        a.b.g.at r11 = null;
        a.b.g.n r10 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r13.l == false) { $pc0 = 7; continue $sw0; }
                    r11 = new a.b.g.at();
                    r10 = a(r13, r11, new java.util.ArrayList(r18));
                    r11.a(a(r13.h, r13.i, r13.j, r14, r15, r16, r17, r18));
                    return r10;
                }
                case 7: {
                    return super.a(r13, r14, r15, r16, r17, r18);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public a.b.g.n a(a.aa r10, a.b.g.s r11, a.b.g.aq r12, a.b.g.aq r13, a.b.a.d.i r14) {
        java.util.ArrayList r6 = null;
        a.b.g.aq r15 = null;
        a.b.g.aq r0 = null;
        a.b.g.aq r4 = null;
        a.b.g.aq r3 = null;
        a.b.g.s r2 = null;
        a.b.a.d.g r5 = null;
        a.f r1 = null;
        a.b.g.as r8 = null;
        a.b.g.n r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = new java.util.ArrayList();
                    if (r10.m == false) { $pc1 = 27; continue $sw1; }
                    if (r11 == null) { $pc1 = 27; continue $sw1; }
                    if (r12 != null) { $pc1 = 22; continue $sw1; }
                    r15 = new a.b.g.an(r11);
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r13 != null) { $pc1 = 23; continue $sw1; }
                    r0 = new a.b.g.an(r11);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r4 = r0;
                    r3 = r15;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r10.k == false) { $pc1 = 13; continue $sw1; }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r2 = r11;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r10.n == false) { $pc1 = 24; continue $sw1; }
                    r5 = new a.b.a.d.g("Code", r14);
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r1 = r10.r;
                    if (r1 == null) { $pc1 = 28; continue $sw1; }
                    r8 = new a.b.g.as();
                    r7 = a(r1, r8, r6);
                    r8.a(a(r10, r2, r3, r4, r5, r6));
                    return r7;
                }
                case 28: {
                    return a(r10, r2, r3, r4, r5, r6);
                }
                case 24: {
                    r5 = null;
                    { $pc1 = 18; continue $sw1; }
                }
                case 13: {
                    if (r10.l == true) { $pc1 = 26; continue $sw1; }
                    r2 = null;
                    { $pc1 = 16; continue $sw1; }
                }
                case 23: {
                    r0 = new a.b.g.av(new a.b.g.aq[]{r13, new a.b.g.an(r11)});
                    { $pc1 = 9; continue $sw1; }
                }
                case 22: {
                    r15 = new a.b.g.av(new a.b.g.aq[]{r12, new a.b.g.an(r11)});
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    r4 = r13;
                    r3 = r12;
                    { $pc1 = 11; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public a.b.g.n a(java.util.List r9, a.b.g.s r10, a.b.g.aq r11, a.b.g.aq r12, a.b.a.d.i r13) {
        a.b.g.as r7 = null;
        int r0 = 0;
        int r6 = 0;
        a.aa r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r7 = new a.b.g.as();
                    if (r9 == null) { $pc2 = 21; continue $sw2; }
                    r0 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r6 = r0;
                    if (r6 >= r9.size()) { $pc2 = 21; continue $sw2; }
                    r1 = (a.aa) r9.get(r6);
                    if (this.f11a == false) { $pc2 = 12; continue $sw2; }
                    if (r1.o == true) { $pc2 = 12; continue $sw2; }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r7.a(a(r1, r10, r11, r12, r13));
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r0 = r6 + 1;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (this.b == false) { $pc2 = 16; continue $sw2; }
                    if (r1.p == false) { $pc2 = 19; continue $sw2; }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    if (this.c == false) { $pc2 = 20; continue $sw2; }
                    if (r1.q == true) { $pc2 = 20; continue $sw2; }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
