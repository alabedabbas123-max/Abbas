package abcd;

final class pC<S extends abcd.CC> {
    private final mC<S> DW;
    private int[] EQ;
    private final lC<S> FH;
    private final lC<S> Hw;
    private abcd.jC J0;
    private int J8;
    private final int VH;
    private boolean Ws;
    private final int[] Zo;
    private long[] gn;
    private final int j6;
    private int[] tp;
    private int u7;
    private final abcd.jC v5;
    private int we;

    pC(int r1, mC<S> r2, lC<S> r3, lC<S> r4, abcd.jC r5) {
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    this.v5 = r5;
                    if (this.v5.DW >= 268435455) { $pc0 = 7; continue $sw0; }
                    r6 = r5.VH();
                    r7 = j6(r6);
                    this.Zo = new int[1 << r7];
                    this.VH = 32 - r7;
                    this.we = r5.j6;
                    this.gn = new long[java.lang.Math.max(4, r6 >>> 3)];
                    this.tp = new int[r6];
                    this.EQ = new int[r6];
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().sequenceTooLargeForDiffAlgorithm);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int DW(int r17) {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        long r6 = 0L;
        int r5 = 0;
        int r8 = 0;
        int r9 = 0;
        int r11 = 0;
        int r10 = 0;
        abcd.jC r12 = null;
        int r7 = 0;
        abcd.jC r13 = null;
        abcd.jC r14 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = r17 + 1;
                    r3 = this.Zo[j6(this.Hw, r17)];
                    r4 = r2;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r3 == 0) { $pc1 = 4; continue $sw1; }
                    r6 = this.gn[r3];
                    if (j6(r6) > this.J8) { $pc1 = 8; continue $sw1; }
                    r5 = FH(r6);
                    if (this.DW.j6(this.FH, r5, this.Hw, r17) == false) { $pc1 = 52; continue $sw1; }
                    this.Ws = true;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r8 = this.tp[r5 - this.we];
                    r9 = r5 + 1;
                    r11 = j6(r6);
                    r10 = r17;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r12 = this.v5;
                    if (r12.j6 >= r5) { $pc1 = 25; continue $sw1; }
                    if (r12.FH >= r10) { $pc1 = 25; continue $sw1; }
                    if (this.DW.j6(this.FH, r5 - 1, this.Hw, r10 - 1) == false) { $pc1 = 25; continue $sw1; }
                    r5 = r5 - 1;
                    r10 = r10 - 1;
                    if (1 >= r11) { $pc1 = 15; continue $sw1; }
                    r11 = java.lang.Math.min(r11, j6(this.gn[this.EQ[r5 - this.we]]));
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r7 = r2;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r13 = this.v5;
                    if (r9 >= r13.DW) { $pc1 = 38; continue $sw1; }
                    if (r7 >= r13.Hw) { $pc1 = 38; continue $sw1; }
                    if (this.DW.j6(this.FH, r9, this.Hw, r7) == false) { $pc1 = 38; continue $sw1; }
                    if (1 >= r11) { $pc1 = 36; continue $sw1; }
                    r11 = java.lang.Math.min(r11, j6(this.gn[this.EQ[r9 - this.we]]));
                    $pc1 = 36; continue $sw1;
                }
                case 36: {
                    r9 = r9 + 1;
                    r7 = r7 + 1;
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    if (r4 >= r7) { $pc1 = 41; continue $sw1; }
                    r4 = r7;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    if (this.J0.VH() >= (r9 - r5)) { $pc1 = 43; continue $sw1; }
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    r14 = this.J0;
                    r14.j6 = r5;
                    r14.FH = r10;
                    r14.DW = r9;
                    r14.Hw = r7;
                    this.J8 = r11;
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    if (r8 == 0) { $pc1 = 52; continue $sw1; }
                    r5 = r8;
                    $pc1 = 48; continue $sw1;
                }
                case 48: {
                    if (r5 >= r9) { $pc1 = 14; continue $sw1; }
                    r5 = this.tp[r5 - this.we];
                    if (r5 != 0) { $pc1 = 48; continue $sw1; }
                    $pc1 = 43; continue $sw1;
                }
                case 43: {
                    if (r11 >= this.J8) { $pc1 = 45; continue $sw1; }
                    $pc1 = 52; continue $sw1;
                }
                case 52: {
                    r3 = DW(r6);
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    if (this.Ws == true) { $pc1 = 52; continue $sw1; }
                    this.Ws = this.DW.j6(this.FH, FH(r6), this.Hw, r17);
                    { $pc1 = 52; continue $sw1; }
                }
                case 4: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int DW(long r1) {
        return (int) (r1 >>> 36);
    }

    private boolean DW() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        long r7 = 0L;
        int r4 = 0;
        int r6 = 0;
        long[] r8 = null;
        long[] r9 = null;
        long[] r10 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.v5.DW - 1;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (this.v5.j6 > r0) { $pc2 = 5; continue $sw2; }
                    r2 = j6(this.FH, r0);
                    r3 = this.Zo[r2];
                    r5 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r3 == 0) { $pc2 = 9; continue $sw2; }
                    r7 = this.gn[r3];
                    if (this.DW.j6(this.FH, FH(r7), this.FH, r0) == true) { $pc2 = 17; continue $sw2; }
                    r3 = DW(r7);
                    r5 = r5 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 17: {
                    r4 = j6(r7) + 1;
                    if (255 >= r4) { $pc2 = 20; continue $sw2; }
                    r4 = 255;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    this.gn[r3] = j6(DW(r7), r0, r4);
                    this.tp[r0 - this.we] = FH(r7);
                    this.EQ[r0 - this.we] = r3;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    r0 = r0 - 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 9: {
                    if (r5 == this.j6) { $pc2 = 10; continue $sw2; }
                    r6 = this.u7 + 1;
                    this.u7 = r6;
                    r8 = this.gn;
                    if (r6 != r8.length) { $pc2 = 14; continue $sw2; }
                    r9 = new long[java.lang.Math.min(r8.length << 1, this.v5.VH() + 1)];
                    r10 = this.gn;
                    java.lang.System.arraycopy(r10, 0, r9, 0, r10.length);
                    this.gn = r9;
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    this.gn[r6] = j6(this.Zo[r2], r0, 1);
                    this.EQ[r0 - this.we] = r6;
                    this.Zo[r2] = r6;
                    { $pc2 = 21; continue $sw2; }
                }
                case 10: {
                    return false;
                }
                case 5: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int FH(long r1) {
        return 268435455 & ((int) (r1 >>> 8));
    }

    private static int j6(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 31 - java.lang.Integer.numberOfLeadingZeros(r2);
                    if (r0 != 0) { $pc3 = 6; continue $sw3; }
                    r0 = 1;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if ((1 << r0) < r2) { $pc3 = 8; continue $sw3; }
                    return r0;
                }
                case 8: {
                    return r0 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(long r0) {
        return ((int) r0) & 255;
    }

    private int j6(lC<S> r2, int r3) {
        return (this.DW.j6(r2, r3) * (-1640562687)) >>> this.VH;
    }

    private static long j6(int r3, int r4, int r5) {
        long r0 = ((long) r3) << 36;
        return ((((long) r4) << 8) | r0) | ((long) r5);
    }

    abcd.jC j6() {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (DW() == true) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    this.J0 = new abcd.jC(0, 0);
                    this.J8 = this.j6 + 1;
                    r0 = this.v5.FH;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r0 >= this.v5.Hw) { $pc4 = 9; continue $sw4; }
                    r0 = DW(r0);
                    { $pc4 = 7; continue $sw4; }
                }
                case 9: {
                    if (this.Ws == false) { $pc4 = 14; continue $sw4; }
                    if (this.j6 >= this.J8) { $pc4 = 14; continue $sw4; }
                    return null;
                }
                case 14: {
                    return this.J0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
