package abcd;

public final class eu {
    public static int DW(abcd.St r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = r5.readByte() & 255;
                    r0 = r0 | ((r2 & 127) << (r1 * 7));
                    r1 = r1 + 1;
                    r3 = r2 & 128;
                    if (r3 != 128) { $pc0 = 7; continue $sw0; }
                    if (r1 < 5) { $pc0 = 3; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 == 128) { $pc0 = 10; continue $sw0; }
                    return r0;
                }
                case 10: {
                    throw new abcd.Ut("invalid LEB128 sequence");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(abcd.Tt r2, int r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    r0 = r3;
                    r3 = r3 >>> 7;
                    if (r3 == 0) { $pc1 = 5; continue $sw1; }
                    r2.writeByte((byte) ((r0 & 127) | 128));
                    { $pc1 = 2; continue $sw1; }
                }
                case 5: {
                    r2.writeByte((byte) (r0 & 127));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(int r1) {
        int r2 = 0;
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = r1 >> 7;
                    r0 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 == 0) { $pc2 = 6; continue $sw2; }
                    r2 = r2 >> 7;
                    r0 = r0 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return r0 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.St r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    r2 = -1;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r3 = r6.readByte() & 255;
                    r0 = r0 | ((r3 & 127) << (r1 * 7));
                    r2 = r2 << 7;
                    r1 = r1 + 1;
                    r4 = r3 & 128;
                    if (r4 != 128) { $pc3 = 7; continue $sw3; }
                    if (r1 < 5) { $pc3 = 3; continue $sw3; }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r4 == 128) { $pc3 = 13; continue $sw3; }
                    if (((r2 >> 1) & r0) != 0) { $pc3 = 11; continue $sw3; }
                    return r0;
                }
                case 11: {
                    return r0 | r2;
                }
                case 13: {
                    throw new abcd.Ut("invalid LEB128 sequence");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.Tt r7, int r8) {
        int r0 = 0;
        int r1 = 0;
        int r4 = 0;
        boolean r9 = false;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r8 >> 7;
                    if ((Integer.MIN_VALUE & r8) != 0) { $pc4 = 5; continue $sw4; }
                    r1 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r4 = r8;
                    r9 = true;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r9 == false) { $pc4 = 19; continue $sw4; }
                    if (r0 == r1) { $pc4 = 10; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r9 = true;
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    r5 = r4 & 127;
                    if (r9 == false) { $pc4 = 17; continue $sw4; }
                    r6 = 128;
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    r7.writeByte((byte) (r5 | r6));
                    r4 = r0;
                    r0 = r0 >> 7;
                    { $pc4 = 7; continue $sw4; }
                }
                case 17: {
                    r6 = 0;
                    { $pc4 = 18; continue $sw4; }
                }
                case 10: {
                    if ((r0 & 1) != ((r4 >> 6) & 1)) { $pc4 = 13; continue $sw4; }
                    r9 = false;
                    { $pc4 = 14; continue $sw4; }
                }
                case 19: {
                    return;
                }
                case 5: {
                    r1 = -1;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
