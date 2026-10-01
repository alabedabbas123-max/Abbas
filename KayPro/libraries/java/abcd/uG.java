package abcd;

class uG extends abcd.XF {
    private final int DW;
    private final abcd.UF j6;

    uG(abcd.XF r7) {
        abcd.dG r0 = null;
        abcd.dG[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new abcd.UF();
                    this.DW = r7.DW() | 8;
                    r7.j6(this.j6);
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r0 = r7.j6();
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    r1 = r0.J8;
                    r2 = r1.length;
                    r3 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 >= r2) { $pc0 = 8; continue $sw0; }
                    r1[r3].QX++;
                    r3 = r3 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    this.j6.j6(r0);
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int DW() {
        return this.DW;
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = null;
        abcd.dG[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.dG r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    r0 = this.j6.j6();
                    if (r0 == null) { $pc1 = 4; continue $sw1; }
                    if (r0.QX <= 0) { $pc1 = 9; continue $sw1; }
                    r0.EQ |= 32;
                    { $pc1 = 2; continue $sw1; }
                }
                case 9: {
                    r1 = r0.J8;
                    r2 = r1.length;
                    r3 = 0;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r3 >= r2) { $pc1 = 11; continue $sw1; }
                    r4 = r1[r3];
                    r5 = r4.QX - 1;
                    r4.QX = r5;
                    if (r5 != 0) { $pc1 = 17; continue $sw1; }
                    r6 = r4.EQ;
                    if ((r6 & 32) == 0) { $pc1 = 17; continue $sw1; }
                    r4.EQ = r6 & (-33);
                    this.j6.DW(r4);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r3 = r3 + 1;
                    { $pc1 = 10; continue $sw1; }
                }
                case 11: {
                    return r0;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.OF r2) {
        r2.j6(this.j6);
    }
}
