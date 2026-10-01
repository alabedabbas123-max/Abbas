package abcd;

public final class TP {
    public static java.lang.String DW(java.lang.String r5) {
        char[] r0 = null;
        int r1 = 0;
        boolean r2 = false;
        char r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.toCharArray();
                    r1 = 0;
                    r2 = false;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1 == r0.length) { $pc0 = 5; continue $sw0; }
                    r3 = r0[r1];
                    if ('A' > r3) { $pc0 = 13; continue $sw0; }
                    if ('Z' < r3) { $pc0 = 13; continue $sw0; }
                    r0[r1] = (char) ((r3 - 'A') + 97);
                    r2 = true;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    if (r2 == true) { $pc0 = 7; continue $sw0; }
                    return r5;
                }
                case 7: {
                    return new java.lang.String(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(byte[] r1) {
        return new java.lang.String(j6(r1));
    }

    public static java.lang.String FH(java.lang.String r5) {
        char[] r0 = null;
        int r1 = 0;
        boolean r2 = false;
        char r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r5.toCharArray();
                    r1 = 0;
                    r2 = false;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 == r0.length) { $pc1 = 5; continue $sw1; }
                    r3 = r0[r1];
                    if ('a' > r3) { $pc1 = 13; continue $sw1; }
                    if ('z' < r3) { $pc1 = 13; continue $sw1; }
                    r0[r1] = (char) ((r3 - 'a') + 65);
                    r2 = true;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    if (r2 == true) { $pc1 = 7; continue $sw1; }
                    return r5;
                }
                case 7: {
                    return new java.lang.String(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String FH(byte[] r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        char[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        char r7 = 0;
        char r6 = 0;
        int r8 = 0;
        byte r10 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    r2 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 >= r9.length) { $pc2 = 5; continue $sw2; }
                    r2 = r2 + 1;
                    if ((r9[r1] & 240) == 240) { $pc2 = 27; continue $sw2; }
                    if ((r9[r1] & 224) == 224) { $pc2 = 30; continue $sw2; }
                    if ((r9[r1] & 192) == 192) { $pc2 = 33; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 33: {
                    r1 = r1 + 2;
                    { $pc2 = 4; continue $sw2; }
                }
                case 30: {
                    r1 = r1 + 3;
                    { $pc2 = 4; continue $sw2; }
                }
                case 27: {
                    r2 = r2 + 1;
                    r1 = r1 + 4;
                    { $pc2 = 4; continue $sw2; }
                }
                case 5: {
                    r3 = new char[r2];
                    r4 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r0 >= r9.length) { $pc2 = 9; continue $sw2; }
                    if ((r9[r0] & 240) != 240) { $pc2 = 14; continue $sw2; }
                    r5 = (((((r9[r0] & 3) << 18) | ((r9[r0 + 1] & 63) << 12)) | ((r9[r0 + 2] & 63) << 6)) | (r9[r0 + 3] & 63)) - 65536;
                    r7 = (char) (55296 | (r5 >> 10));
                    r6 = (char) ((r5 & 1023) | 56320);
                    r3[r4] = r7;
                    r0 = r0 + 4;
                    r4 = r4 + 1;
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    r3[r4] = r6;
                    r4 = r4 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 14: {
                    if ((r9[r0] & 224) != 224) { $pc2 = 17; continue $sw2; }
                    r6 = (char) ((((r9[r0] & 15) << 12) | ((r9[r0 + 1] & 63) << 6)) | (r9[r0 + 2] & 63));
                    r0 = r0 + 3;
                    { $pc2 = 24; continue $sw2; }
                }
                case 17: {
                    if ((r9[r0] & 208) != 208) { $pc2 = 21; continue $sw2; }
                    r8 = (r9[r0] & 31) << 6;
                    r10 = r9[r0 + 1];
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r6 = (char) (r8 | (r10 & 63));
                    r0 = r0 + 2;
                    { $pc2 = 24; continue $sw2; }
                }
                case 21: {
                    if ((r9[r0] & 192) != 192) { $pc2 = 23; continue $sw2; }
                    r8 = (r9[r0] & 31) << 6;
                    r10 = r9[r0 + 1];
                    { $pc2 = 19; continue $sw2; }
                }
                case 23: {
                    r6 = (char) (r9[r0] & 255);
                    r0 = r0 + 1;
                    { $pc2 = 24; continue $sw2; }
                }
                case 9: {
                    return new java.lang.String(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(java.lang.String r3) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new byte[r3.length()];
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1 == r0.length) { $pc3 = 5; continue $sw3; }
                    r0[r1] = (byte) r3.charAt(r1);
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static char[] j6(byte[] r3) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new char[r3.length];
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1 == r0.length) { $pc4 = 5; continue $sw4; }
                    r0[r1] = (char) (r3[r1] & 255);
                    r1 = r1 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
