package abcd;

public class HK {
    private static final boolean[] j6 = null;

    static {
        j6 = new boolean[256];
        boolean[] r0 = j6;
        r0[13] = true;
        r0[10] = true;
        r0[9] = true;
        r0[32] = true;
    }

    public static int DW(byte[] r1, int r2, int r3) {
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = r3 - 1;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 > r4) { $pc0 = 9; continue $sw0; }
                    if (j6(r1[r4]) == false) { $pc0 = 9; continue $sw0; }
                    r4 = r4 - 1;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return r4 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(byte[] r1, int r2, int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    if (r2 >= r3) { $pc1 = 7; continue $sw1; }
                    if (j6(r1[r2]) == false) { $pc1 = 7; continue $sw1; }
                    r2 = r2 + 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(byte r1) {
        return j6[r1 & 255];
    }
}
