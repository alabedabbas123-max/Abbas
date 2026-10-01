package abcd;

public final class OP {
    public static int DW(byte[] r3) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 != null) { $pc0 = 5; continue $sw0; }
                    return 0;
                }
                case 5: {
                    r0 = r3.length;
                    r1 = r0 + 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r0 = r0 - 1;
                    if (r0 < 0) { $pc0 = 8; continue $sw0; }
                    r1 = (r1 * 257) ^ r3[r0];
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(char[] r3) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 5; continue $sw1; }
                    return 0;
                }
                case 5: {
                    r0 = r3.length;
                    r1 = r0 + 1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0 = r0 - 1;
                    if (r0 < 0) { $pc1 = 8; continue $sw1; }
                    r1 = (r1 * 257) ^ r3[r0];
                    { $pc1 = 6; continue $sw1; }
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(byte[] r5, byte[] r6) {
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 != r6) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (r5 == null) { $pc2 = 20; continue $sw2; }
                    if (r6 == null) { $pc2 = 20; continue $sw2; }
                    if (r5.length == r6.length) { $pc2 = 12; continue $sw2; }
                    return false;
                }
                case 12: {
                    r2 = 0;
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    if (r2 == r5.length) { $pc2 = 15; continue $sw2; }
                    if (r5[r2] != r6[r2]) { $pc2 = 18; continue $sw2; }
                    r2 = r2 + 1;
                    { $pc2 = 14; continue $sw2; }
                }
                case 18: {
                    return false;
                }
                case 15: {
                    return true;
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(char[] r5, char[] r6) {
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r5 != r6) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    if (r5 == null) { $pc3 = 20; continue $sw3; }
                    if (r6 == null) { $pc3 = 20; continue $sw3; }
                    if (r5.length == r6.length) { $pc3 = 12; continue $sw3; }
                    return false;
                }
                case 12: {
                    r2 = 0;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r2 == r5.length) { $pc3 = 15; continue $sw3; }
                    if (r5[r2] != r6[r2]) { $pc3 = 18; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 14; continue $sw3; }
                }
                case 18: {
                    return false;
                }
                case 15: {
                    return true;
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(byte[] r3) {
        byte[] r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r3 != null) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    r0 = new byte[r3.length];
                    java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
