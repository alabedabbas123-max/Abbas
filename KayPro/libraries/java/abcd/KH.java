package abcd;

class KH {
    private int DW;
    private int[] j6;

    KH() {
        this.j6 = new int[64];
    }

    boolean j6(int r8) {
        int r0 = 0;
        int r3 = 0;
        int r1 = 0;
        int r4 = 0;
        int[] r5 = null;
        int r6 = 0;
        int[] r7 = null;
        int[] r9 = null;
        int r2 = 0;
        int[] r10 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != 0) { $pc0 = 6; continue $sw0; }
                    this.j6[0] = r8;
                    this.DW = 1;
                    return true;
                }
                case 6: {
                    r3 = r0;
                    r1 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r4 = (r1 + r3) >>> 1;
                    r5 = this.j6;
                    if (r8 >= r5[r4]) { $pc0 = 11; continue $sw0; }
                    r3 = r4;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r1 < r3) { $pc0 = 7; continue $sw0; }
                    r6 = this.DW;
                    r7 = this.j6;
                    if (r6 != r7.length) { $pc0 = 18; continue $sw0; }
                    r9 = new int[r7.length * 2];
                    java.lang.System.arraycopy(r7, 0, r9, 0, r6);
                    this.j6 = r9;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    r2 = this.DW;
                    if (r1 >= r2) { $pc0 = 21; continue $sw0; }
                    r10 = this.j6;
                    java.lang.System.arraycopy(r10, r1, r10, r1 + 1, r2 - r1);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    this.j6[r1] = r8;
                    this.DW++;
                    return true;
                }
                case 11: {
                    if (r8 == r5[r4]) { $pc0 = 12; continue $sw0; }
                    r1 = r4 + 1;
                    { $pc0 = 14; continue $sw0; }
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
