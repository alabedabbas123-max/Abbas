package abcd;

public final class ClassZ {
    private static char[] DW;
    private static final java.lang.Object j6 = null;

    static {
        j6 = new java.lang.Object();
        DW = new char[24];
    }

    private static int j6(int r2, int r3, boolean r4, int r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 > 99) { $pc0 = 22; continue $sw0; }
                    if (r4 == false) { $pc0 = 8; continue $sw0; }
                    if (r5 >= 3) { $pc0 = 22; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r2 > 9) { $pc0 = 20; continue $sw0; }
                    if (r4 == false) { $pc0 = 12; continue $sw0; }
                    if (r5 >= 2) { $pc0 = 20; continue $sw0; }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r4 == true) { $pc0 = 18; continue $sw0; }
                    if (r2 > 0) { $pc0 = 18; continue $sw0; }
                    return 0;
                }
                case 18: {
                    return r3 + 1;
                }
                case 20: {
                    return r3 + 2;
                }
                case 22: {
                    return r3 + 3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(long r17, int r19) {
        long r0 = 0L;
        char[] r3 = null;
        int r1 = 0;
        char r5 = 0;
        int r12 = 0;
        int r2 = 0;
        int r6 = 0;
        int r4 = 0;
        int r7 = 0;
        int r13 = 0;
        int r8 = 0;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        boolean r14 = false;
        int r15 = 0;
        boolean r16 = false;
        int r18 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        boolean r24 = false;
        int r25 = 0;
        boolean r26 = false;
        int r27 = 0;
        int r28 = 0;
        boolean r29 = false;
        int r30 = 0;
        int r31 = 0;
        boolean r32 = false;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r17;
                    if (DW.length >= r19) { $pc1 = 5; continue $sw1; }
                    DW = new char[r19];
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r3 = DW;
                    if (r0 != 0) { $pc1 = 13; continue $sw1; }
                    r1 = r19 - 1;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r1 <= 0) { $pc1 = 10; continue $sw1; }
                    r3[0] = ' ';
                    { $pc1 = 8; continue $sw1; }
                }
                case 10: {
                    r3[0] = '0';
                    return 1;
                }
                case 13: {
                    if (r0 <= 0) { $pc1 = 15; continue $sw1; }
                    r5 = '+';
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    r12 = (int) (r0 % 1000);
                    r2 = (int) java.lang.Math.floor(r0 / 1000);
                    if (r2 <= 86400) { $pc1 = 19; continue $sw1; }
                    r6 = r2 / 86400;
                    r2 = r2 - (86400 * r6);
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    if (r2 <= 3600) { $pc1 = 23; continue $sw1; }
                    r4 = r2 / 3600;
                    r2 = r2 - (r4 * 3600);
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    if (r2 <= 60) { $pc1 = 27; continue $sw1; }
                    r7 = r2 / 60;
                    r13 = r2 - (r7 * 60);
                    r8 = r7;
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    if (r19 == 0) { $pc1 = 49; continue $sw1; }
                    r9 = j6(r6, 1, false, 0);
                    if (r9 <= 0) { $pc1 = 33; continue $sw1; }
                    r10 = true;
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    r11 = r9 + j6(r4, 1, r10, 2);
                    if (r11 <= 0) { $pc1 = 37; continue $sw1; }
                    r14 = true;
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    r15 = r11 + j6(r8, 1, r14, 2);
                    if (r15 <= 0) { $pc1 = 41; continue $sw1; }
                    r16 = true;
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    r18 = r15 + j6(r13, 1, r16, 2);
                    if (r18 <= 0) { $pc1 = 45; continue $sw1; }
                    r20 = 3;
                    $pc1 = 46; continue $sw1;
                }
                case 46: {
                    r21 = r18 + (j6(r12, 2, true, r20) + 1);
                    r22 = 0;
                    $pc1 = 47; continue $sw1;
                }
                case 47: {
                    if (r21 >= r19) { $pc1 = 50; continue $sw1; }
                    r3[r22] = ' ';
                    r22 = r22 + 1;
                    r21 = r21 + 1;
                    $pc1 = 50; continue $sw1;
                }
                case 50: {
                    r3[r22] = r5;
                    r23 = r22 + 1;
                    if (r19 == 0) { $pc1 = 53; continue $sw1; }
                    r24 = true;
                    $pc1 = 54; continue $sw1;
                }
                case 54: {
                    r25 = j6(r3, r6, 'd', r23, false, 0);
                    if (r25 == r23) { $pc1 = 57; continue $sw1; }
                    r26 = true;
                    $pc1 = 58; continue $sw1;
                }
                case 58: {
                    if (r24 == false) { $pc1 = 60; continue $sw1; }
                    r27 = 2;
                    $pc1 = 61; continue $sw1;
                }
                case 61: {
                    r28 = j6(r3, r4, 'h', r25, r26, r27);
                    if (r28 == r23) { $pc1 = 64; continue $sw1; }
                    r29 = true;
                    $pc1 = 65; continue $sw1;
                }
                case 65: {
                    if (r24 == false) { $pc1 = 67; continue $sw1; }
                    r30 = 2;
                    $pc1 = 68; continue $sw1;
                }
                case 68: {
                    r31 = j6(r3, r8, 'm', r28, r29, r30);
                    if (r31 == r23) { $pc1 = 71; continue $sw1; }
                    r32 = true;
                    $pc1 = 72; continue $sw1;
                }
                case 72: {
                    if (r24 == false) { $pc1 = 74; continue $sw1; }
                    r33 = 2;
                    $pc1 = 75; continue $sw1;
                }
                case 75: {
                    r34 = j6(r3, r13, 's', r31, r32, r33);
                    if (r24 == false) { $pc1 = 79; continue $sw1; }
                    if (r34 == r23) { $pc1 = 79; continue $sw1; }
                    r35 = 3;
                    $pc1 = 80; continue $sw1;
                }
                case 80: {
                    r36 = j6(r3, r12, 'm', r34, true, r35);
                    r3[r36] = 's';
                    return r36 + 1;
                }
                case 79: {
                    r35 = 0;
                    { $pc1 = 80; continue $sw1; }
                }
                case 74: {
                    r33 = 0;
                    { $pc1 = 75; continue $sw1; }
                }
                case 71: {
                    r32 = false;
                    { $pc1 = 72; continue $sw1; }
                }
                case 67: {
                    r30 = 0;
                    { $pc1 = 68; continue $sw1; }
                }
                case 64: {
                    r29 = false;
                    { $pc1 = 65; continue $sw1; }
                }
                case 60: {
                    r27 = 0;
                    { $pc1 = 61; continue $sw1; }
                }
                case 57: {
                    r26 = false;
                    { $pc1 = 58; continue $sw1; }
                }
                case 53: {
                    r24 = false;
                    { $pc1 = 54; continue $sw1; }
                }
                case 45: {
                    r20 = 0;
                    { $pc1 = 46; continue $sw1; }
                }
                case 41: {
                    r16 = false;
                    { $pc1 = 42; continue $sw1; }
                }
                case 37: {
                    r14 = false;
                    { $pc1 = 38; continue $sw1; }
                }
                case 33: {
                    r10 = false;
                    { $pc1 = 34; continue $sw1; }
                }
                case 49: {
                    r22 = 0;
                    { $pc1 = 50; continue $sw1; }
                }
                case 27: {
                    r13 = r2;
                    r8 = 0;
                    { $pc1 = 29; continue $sw1; }
                }
                case 23: {
                    r4 = 0;
                    { $pc1 = 25; continue $sw1; }
                }
                case 19: {
                    r6 = 0;
                    { $pc1 = 21; continue $sw1; }
                }
                case 15: {
                    r5 = '-';
                    r0 = -r0;
                    { $pc1 = 16; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(char[] r2, int r3, char r4, int r5, boolean r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r6 == true) { $pc2 = 4; continue $sw2; }
                    if (r3 > 0) { $pc2 = 4; continue $sw2; }
                    return r5;
                }
                case 4: {
                    if (r6 == false) { $pc2 = 8; continue $sw2; }
                    if (r7 < 3) { $pc2 = 8; continue $sw2; }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r0 = r3 / 100;
                    r2[r5] = (char) (r0 + 48);
                    r1 = r5 + 1;
                    r3 = r3 - (r0 * 100);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r6 == false) { $pc2 = 15; continue $sw2; }
                    if (r7 < 2) { $pc2 = 15; continue $sw2; }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    r8 = r3 / 10;
                    r2[r1] = (char) (r8 + 48);
                    r1 = r1 + 1;
                    r3 = r3 - (r8 * 10);
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    r2[r1] = (char) (r3 + 48);
                    r9 = r1 + 1;
                    r2[r9] = r4;
                    return r9 + 1;
                }
                case 15: {
                    if (r3 > 9) { $pc2 = 17; continue $sw2; }
                    if (r5 == r1) { $pc2 = 18; continue $sw2; }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r3 > 99) { $pc2 = 9; continue $sw2; }
                    r1 = r5;
                    { $pc2 = 11; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(long r3, long r5, java.io.PrintWriter r7) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 != 0) { $pc3 = 6; continue $sw3; }
                    r7.print("--");
                    return;
                }
                case 6: {
                    j6(r3 - r5, r7, 0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(long r1, java.io.PrintWriter r3) {
        j6(r1, r3, 0);
    }

    public static void j6(long r2, java.io.PrintWriter r4, int r5) {
        synchronized (j6) {
            java.lang.Object r0 = null;
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = j6;
                        try {
                            r3 = j6(r2, r5);
                            r4.print(new java.lang.String(DW, 0, r3));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
