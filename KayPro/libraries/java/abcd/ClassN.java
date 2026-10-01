package abcd;

class ClassN {
    static final long[] DW = null;
    static final java.lang.Object[] FH = null;
    static final int[] j6 = null;

    static {
        j6 = new int[0];
        DW = new long[0];
        FH = new java.lang.Object[0];
    }

    public static int DW(int r0) {
        return j6(r0 * 4) / 4;
    }

    public static int j6(int r2) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 4;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= 32) { $pc0 = 9; continue $sw0; }
                    r1 = (1 << r0) - 12;
                    if (r2 <= r1) { $pc0 = 7; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 7: {
                    return r1;
                }
                case 9: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(int[] r3, int r4, int r5) {
        int r6 = 0;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = r4 - 1;
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 > r6) { $pc1 = 11; continue $sw1; }
                    r1 = (r0 + r6) >>> 1;
                    r2 = r3[r1];
                    if (r2 < r5) { $pc1 = 6; continue $sw1; }
                    if (r2 <= r5) { $pc1 = 9; continue $sw1; }
                    r6 = r1 - 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 9: {
                    return r1;
                }
                case 6: {
                    r0 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 11: {
                    return r0 ^ (-1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r0 == r1) { $pc2 = 8; continue $sw2; }
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.equals(r1) == false) { $pc2 = 7; continue $sw2; }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
