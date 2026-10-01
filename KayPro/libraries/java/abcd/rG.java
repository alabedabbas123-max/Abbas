package abcd;

class rG extends abcd.XF {
    private final abcd.XF j6;

    rG(abcd.XF r1) {
        this.j6 = r1;
    }

    private abcd.dG j6(abcd.dG r4) {
        abcd.dG[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r0 = r4.J8;
                    if (r0.length > 1) { $pc0 = 4; continue $sw0; }
                    r1 = r4.EQ;
                    if ((r1 & 4) != 0) { $pc0 = 7; continue $sw0; }
                    if ((r1 & 8) == 0) { $pc0 = 10; continue $sw0; }
                    if (r0.length == 0) { $pc0 = 13; continue $sw0; }
                    r4 = r0[0];
                    { $pc0 = 2; continue $sw0; }
                }
                case 13: {
                    return null;
                }
                case 10: {
                    return r4;
                }
                case 7: {
                    return r4;
                }
                case 4: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.dG[] j6(abcd.dG[] r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.dG r3 = null;
        int r4 = 0;
        int r5 = 0;
        abcd.dG[] r6 = null;
        int r8 = 0;
        int r9 = 0;
        abcd.dG r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    r2 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r7.length) { $pc1 = 6; continue $sw1; }
                    r3 = r7[r1];
                    if (r3 == null) { $pc1 = 25; continue $sw1; }
                    r4 = r3.EQ;
                    if ((r4 & 16) == 0) { $pc1 = 24; continue $sw1; }
                    r7[r1] = null;
                    { $pc1 = 25; continue $sw1; }
                }
                case 24: {
                    r3.EQ = r4 | 16;
                    r2 = r2 + 1;
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    if (r2 != r7.length) { $pc1 = 11; continue $sw1; }
                    r5 = r7.length;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r0 >= r5) { $pc1 = 9; continue $sw1; }
                    r7[r0].EQ &= -17;
                    r0 = r0 + 1;
                    { $pc1 = 8; continue $sw1; }
                }
                case 9: {
                    return r7;
                }
                case 11: {
                    r6 = new abcd.dG[r2];
                    r8 = r7.length;
                    r9 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r0 >= r8) { $pc1 = 13; continue $sw1; }
                    r10 = r7[r0];
                    if (r10 == null) { $pc1 = 17; continue $sw1; }
                    r6[r9] = r10;
                    r10.EQ &= -17;
                    r9 = r9 + 1;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r0 = r0 + 1;
                    { $pc1 = 12; continue $sw1; }
                }
                case 13: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int DW() {
        return this.j6.DW() & (-5);
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = null;
        abcd.dG[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
        abcd.dG r5 = null;
        abcd.dG r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6.j6();
                    if (r0 != null) { $pc2 = 6; continue $sw2; }
                    return null;
                }
                case 6: {
                    r1 = r0.J8;
                    r2 = r1.length;
                    r3 = 0;
                    r4 = false;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r3 >= r2) { $pc2 = 8; continue $sw2; }
                    r5 = r1[r3];
                    r6 = j6(r5);
                    if (r5 == r6) { $pc2 = 14; continue $sw2; }
                    r1[r3] = r6;
                    r4 = true;
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    r3 = r3 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 8: {
                    if (r4 == false) { $pc2 = 10; continue $sw2; }
                    r0.J8 = j6(r1);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
