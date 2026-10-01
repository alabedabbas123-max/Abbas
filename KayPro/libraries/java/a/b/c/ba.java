package a.b.c;

public class ba extends a.b.f.w implements a.b.a.d.i {
    public ba() {
    }

    @Override
    public void a(a.b.c r1, a.b.a.a r2) {
    }

    @Override
    public void a(a.b.c r9, a.b.j r10, a.b.a.d r11, a.b.a.n r12) {
        int r0 = 0;
        a.b.a.m[] r3 = null;
        int r4 = 0;
        int r2 = 0;
        a.b.a.m r5 = null;
        int r1 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r3 = r12.d;
                    r4 = r12.c;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r4) { $pc0 = 15; continue $sw0; }
                    r5 = r3[r2];
                    r1 = r5.b;
                    r6 = r5.c;
                    if (r1 >= r11.e) { $pc0 = 14; continue $sw0; }
                    if (r2 != (r4 - 1)) { $pc0 = 9; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r2 != 0) { $pc0 = 12; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r3[r0] = r5;
                    r0 = r0 + 1;
                    { $pc0 = 14; continue $sw0; }
                }
                case 12: {
                    if (r6 == r3[r2 - 1].c) { $pc0 = 14; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r1 < r3[r2 + 1].b) { $pc0 = 10; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 15: {
                    java.util.Arrays.fill(r3, r0, r12.c, null);
                    r12.c = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
