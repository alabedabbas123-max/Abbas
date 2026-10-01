package abcd;

class FH {
    final long[] DW;
    final int[] FH;
    final int Hw;
    final int[] j6;
    private int v5;

    FH(byte[] r4, int r5) {
        int r6 = 0;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r5 - (r5 % 16);
                    r0 = r6 / 16;
                    if (r0 >= 1) { $pc0 = 5; continue $sw0; }
                    this.j6 = new int[0];
                    this.Hw = 0;
                    this.DW = new long[0];
                    this.FH = new int[0];
                    return;
                }
                case 5: {
                    this.j6 = new int[j6(r0)];
                    this.Hw = this.j6.length - 1;
                    this.DW = new long[r0 + 1];
                    this.FH = new int[this.DW.length];
                    j6(r4, r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 1 << ((32 - java.lang.Integer.numberOfLeadingZeros(r2)) - 1);
                    if (r0 < r2) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    return r0 << 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(byte[] r11, int r12) {
        int r13 = 0;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r13 = r12 - 16;
                    r0 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r1 = abcd.EH.j6(r11, r13);
                    r2 = this.Hw & r1;
                    r3 = this.j6[r2];
                    if (r3 == 0) { $pc2 = 7; continue $sw2; }
                    if (r0 != r1) { $pc2 = 7; continue $sw2; }
                    this.DW[r3] = (((long) r1) << 32) | ((long) r13);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r13 = r13 - 16;
                    if (r13 < 0) { $pc2 = 10; continue $sw2; }
                    r0 = r1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 10: {
                    return;
                }
                case 7: {
                    r4 = this.v5 + 1;
                    this.v5 = r4;
                    this.DW[r4] = (((long) r1) << 32) | ((long) r13);
                    this.FH[r4] = r3;
                    this.j6[r2] = r4;
                    { $pc2 = 8; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
