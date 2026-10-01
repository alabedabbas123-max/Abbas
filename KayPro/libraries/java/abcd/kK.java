package abcd;

public class kK {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;

    static {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        j6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes("UTF-8");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    DW = new byte[128];
                    java.util.Arrays.fill(DW, (byte) -3);
                    r0 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r0 >= 64) { $pc0 = 6; continue $sw0; }
                    DW[j6[r0]] = (byte) r0;
                    r0 = r0 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    r1 = DW;
                    r1[61] = -1;
                    r1[9] = -2;
                    r1[10] = -2;
                    r1[13] = -2;
                    r1[32] = -2;
                    return;
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.RuntimeException(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static java.lang.String j6(byte[] r7, int r8, int r9) {
        int r0 = 0;
        int r2 = 0;
        byte[] r1 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = (r9 * 4) / 3;
                    if ((r9 % 3) <= 0) { $pc1 = 5; continue $sw1; }
                    r2 = 4;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r1 = new byte[r0 + r2];
                    r3 = r9 - 2;
                    r4 = 0;
                    r5 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r4 >= r3) { $pc1 = 8; continue $sw1; }
                    j6(r7, r4 + r8, 3, r1, r5);
                    r4 = r4 + 3;
                    r5 = r5 + 4;
                    { $pc1 = 7; continue $sw1; }
                }
                case 8: {
                    if (r4 >= r9) { $pc1 = 15; continue $sw1; }
                    j6(r7, r8 + r4, r9 - r4, r1, r5);
                    r5 = r5 + 4;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    return new java.lang.String(r1, 0, r5, "UTF-8");
                }
                case 13: {
                    return new java.lang.String(r1, 0, r5);
                }
                case 5: {
                    r2 = 0;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(byte[] r5, int r6, int r7, byte[] r8, int r9) {
        int r3 = 0;
        byte[] r10 = null;
        byte[] r11 = null;
        byte[] r12 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3 = 0;
                    if (r7 == 1) { $pc2 = 9; continue $sw2; }
                    if (r7 == 2) { $pc2 = 8; continue $sw2; }
                    if (r7 != 3) { $pc2 = 11; continue $sw2; }
                    r3 = 0 | ((r5[r6 + 2] << 24) >>> 24);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r7 == 1) { $pc2 = 17; continue $sw2; }
                    if (r7 == 2) { $pc2 = 16; continue $sw2; }
                    if (r7 != 3) { $pc2 = 21; continue $sw2; }
                    r10 = j6;
                    r8[r9] = r10[r3 >>> 18];
                    r8[r9 + 1] = r10[(r3 >>> 12) & 63];
                    r8[r9 + 2] = r10[(r3 >>> 6) & 63];
                    r8[r9 + 3] = r10[r3 & 63];
                    return;
                }
                case 21: {
                    return;
                }
                case 16: {
                    r11 = j6;
                    r8[r9] = r11[r3 >>> 18];
                    r8[r9 + 1] = r11[(r3 >>> 12) & 63];
                    r8[r9 + 2] = r11[(r3 >>> 6) & 63];
                    r8[r9 + 3] = 61;
                    return;
                }
                case 17: {
                    r12 = j6;
                    r8[r9] = r12[r3 >>> 18];
                    r8[r9 + 1] = r12[(r3 >>> 12) & 63];
                    r8[r9 + 2] = 61;
                    r8[r9 + 3] = 61;
                    return;
                }
                case 8: {
                    r3 = r3 | ((r5[r6 + 1] << 24) >>> 16);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r3 = r3 | ((r5[r6] << 24) >>> 8);
                    { $pc2 = 11; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
