package abcd;

public final class fs {
    private final int DW;
    private abcd.au[] FH;
    private abcd.au Hw;
    private final abcd.Or j6;

    public fs(abcd.Or r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 < 0) { $pc0 = 8; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = null;
                    this.Hw = null;
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("firstLabel < 0");
                }
                case 10: {
                    throw new java.lang.NullPointerException("blocks == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r0 = 0;
        abcd.au[] r1 = null;
        abcd.au r2 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        abcd.Nr r7 = null;
        int r8 = 0;
        abcd.au r9 = null;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        abcd.au r13 = null;
        abcd.au r3 = null;
        int r14 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.rN();
                    r1 = new abcd.au[r0];
                    r2 = new abcd.au(10);
                    r4 = this.j6.size();
                    r5 = 0;
                    r6 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r6 >= r4) { $pc1 = 14; continue $sw1; }
                    r7 = this.j6.get(r6);
                    r8 = r7.DW();
                    r9 = r7.gn();
                    r10 = r9.size();
                    if (r10 != 0) { $pc1 = 7; continue $sw1; }
                    r2.DW(r8);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r6 = r6 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 7: {
                    r11 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r11 >= r10) { $pc1 = 13; continue $sw1; }
                    r12 = r9.get(r11);
                    r13 = r1[r12];
                    if (r13 != null) { $pc1 = 12; continue $sw1; }
                    r13 = new abcd.au(10);
                    r1[r12] = r13;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r13.DW(r8);
                    r11 = r11 + 1;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r5 >= r0) { $pc1 = 19; continue $sw1; }
                    r3 = r1[r5];
                    if (r3 == null) { $pc1 = 18; continue $sw1; }
                    r3.er();
                    r3.we();
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r5 = r5 + 1;
                    { $pc1 = 14; continue $sw1; }
                }
                case 19: {
                    r2.er();
                    r2.we();
                    r14 = this.DW;
                    if (r1[r14] != null) { $pc1 = 22; continue $sw1; }
                    r1[r14] = abcd.au.DW;
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    this.FH = r1;
                    this.Hw = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.DW;
    }

    public abcd.Or j6() {
        return this.j6;
    }

    public abcd.au j6(int r4) {
        abcd.au r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw != null) { $pc2 = 5; continue $sw2; }
                    FH();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = this.FH[r4];
                    if (r0 == null) { $pc2 = 9; continue $sw2; }
                    return r0;
                }
                case 9: {
                    throw new java.lang.RuntimeException("no such block: " + abcd.Yt.v5(r4));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
