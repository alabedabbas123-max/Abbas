package abcd;

public final class Ot {
    public static int DW(int[] r0) {
        return r0.length * 32;
    }

    public static int DW(int[] r3, int r4) {
        int r0 = 0;
        int r1 = 0;
        int r5 = 0;
        int r2 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.length;
                    r1 = r4 & 31;
                    r5 = r4 >> 5;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r5 >= r0) { $pc0 = 11; continue $sw0; }
                    r2 = r3[r5];
                    if (r2 == 0) { $pc0 = 10; continue $sw0; }
                    r6 = j6(r2, r1);
                    if (r6 < 0) { $pc0 = 10; continue $sw0; }
                    return (r5 << 5) + r6;
                }
                case 10: {
                    r1 = 0;
                    r5 = r5 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 11: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean FH(int[] r4) {
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.length;
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r0) { $pc1 = 8; continue $sw1; }
                    if (r4[r2] != 0) { $pc1 = 6; continue $sw1; }
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return false;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean FH(int[] r2, int r3) {
        int r0 = 0;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r3 >> 5;
                    r4 = r2[r0];
                    if ((r4 & (1 << (r3 & 31))) != 0) { $pc2 = 7; continue $sw2; }
                    return false;
                }
                case 7: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Hw(int[] r2, int r3) {
        int r0 = r3 >> 5;
        r2[r0] = (1 << (r3 & 31)) | r2[r0];
    }

    public static int j6(int r1, int r2) {
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = java.lang.Integer.numberOfTrailingZeros(r1 & (((1 << r2) - 1) ^ (-1)));
                    if (r3 != 32) { $pc3 = 6; continue $sw3; }
                    return -1;
                }
                case 6: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(int[] r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r4.length;
                    r1 = 0;
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 >= r0) { $pc4 = 5; continue $sw4; }
                    r2 = r2 + java.lang.Integer.bitCount(r4[r1]);
                    r1 = r1 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(int[] r2, int r3) {
        int r0 = r3 >> 5;
        int r4 = (1 << (r3 & 31)) ^ (-1);
        r2[r0] = r4 & r2[r0];
    }

    public static void j6(int[] r2, int r3, boolean r4) {
        int r0 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r3 >> 5;
                    r5 = 1 << (r3 & 31);
                    if (r4 == false) { $pc5 = 5; continue $sw5; }
                    r2[r0] = r5 | r2[r0];
                    return;
                }
                case 5: {
                    r6 = r5 ^ (-1);
                    r2[r0] = r6 & r2[r0];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(int[] r3, int[] r4) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0 >= r4.length) { $pc6 = 6; continue $sw6; }
                    r3[r0] = r3[r0] | r4[r0];
                    r0 = r0 + 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(int[] r0, int r1, int r2) {
        int r3 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r3 = DW(r0, r1);
                    if (r3 < 0) { $pc7 = 6; continue $sw7; }
                    if (r3 >= r2) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int[] j6(int r0) {
        return new int[(r0 + 31) >> 5];
    }
}
