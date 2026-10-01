package abcd;

public class yE extends abcd.YD implements java.io.Serializable {
    private static final abcd.yE gn = null;
    private static final java.lang.String u7 = null;

    static {
        gn = new abcd.yE(0, 0, 0, 0, 0);
        u7 = gn.we();
    }

    yE(int r1, int r2, int r3, int r4, int r5) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
    }

    protected yE(abcd.YD r2) {
        this.FH = r2.FH;
        this.Hw = r2.Hw;
        this.v5 = r2.v5;
        this.Zo = r2.Zo;
        this.VH = r2.VH;
    }

    public static final abcd.yE DW(int[] r7, int r8) {
        return new abcd.yE(r7[r8], r7[r8 + 1], r7[r8 + 2], r7[r8 + 3], r7[r8 + 4]);
    }

    public static final boolean DW(java.lang.String r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.length() == 40) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r0 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 >= 40) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.IK.j6((byte) r4.charAt(r0));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r0 + 1;
                    $pc0 = 7; continue $sw0;
                }
                case 11: {
                    return false;
                }
                case 7: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.yE Hw(byte[] r6, int r7) {
        return new abcd.yE(abcd.FK.j6(r6, r7), abcd.FK.j6(r6, r7 + 4), abcd.FK.j6(r6, r7 + 8), abcd.FK.j6(r6, r7 + 12), abcd.FK.j6(r6, r7 + 16));
    }

    public static final abcd.yE Ws() {
        return gn;
    }

    private static final abcd.yE Zo(byte[] r7, int r8) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return new abcd.yE(abcd.IK.gn(r7, r8), abcd.IK.gn(r7, r8 + 8), abcd.IK.gn(r7, r8 + 16), abcd.IK.gn(r7, r8 + 24), abcd.IK.gn(r7, r8 + 32));
                }
                case 5: {
                    throw new abcd.aD(r7, r8, 40);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.yE j6(java.lang.String r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3.length() != 40) { $pc2 = 7; continue $sw2; }
                    return Zo(abcd.hE.DW(r3), 0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Invalid id: " + r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.yE j6(byte[] r1) {
        return Hw(r1, 0);
    }

    public static final java.lang.String j6(abcd.yE r0) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r0 == null) { $pc3 = 5; continue $sw3; }
                    return r0.we();
                }
                case 5: {
                    return u7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(byte[] r2, int r3, byte[] r4, int r5) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2[r3] == r4[r5]) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    if (r2[r3 + 1] == r4[r5 + 1]) { $pc4 = 7; continue $sw4; }
                    return false;
                }
                case 7: {
                    if (r2[r3 + 2] == r4[r5 + 2]) { $pc4 = 9; continue $sw4; }
                    return false;
                }
                case 9: {
                    if (r2[r3 + 3] == r4[r5 + 3]) { $pc4 = 11; continue $sw4; }
                    return false;
                }
                case 11: {
                    if (r2[r3 + 4] == r4[r5 + 4]) { $pc4 = 13; continue $sw4; }
                    return false;
                }
                case 13: {
                    if (r2[r3 + 5] == r4[r5 + 5]) { $pc4 = 15; continue $sw4; }
                    return false;
                }
                case 15: {
                    if (r2[r3 + 6] == r4[r5 + 6]) { $pc4 = 17; continue $sw4; }
                    return false;
                }
                case 17: {
                    if (r2[r3 + 7] == r4[r5 + 7]) { $pc4 = 19; continue $sw4; }
                    return false;
                }
                case 19: {
                    if (r2[r3 + 8] == r4[r5 + 8]) { $pc4 = 21; continue $sw4; }
                    return false;
                }
                case 21: {
                    if (r2[r3 + 9] == r4[r5 + 9]) { $pc4 = 23; continue $sw4; }
                    return false;
                }
                case 23: {
                    if (r2[r3 + 10] == r4[r5 + 10]) { $pc4 = 25; continue $sw4; }
                    return false;
                }
                case 25: {
                    if (r2[r3 + 11] == r4[r5 + 11]) { $pc4 = 27; continue $sw4; }
                    return false;
                }
                case 27: {
                    if (r2[r3 + 12] == r4[r5 + 12]) { $pc4 = 29; continue $sw4; }
                    return false;
                }
                case 29: {
                    if (r2[r3 + 13] == r4[r5 + 13]) { $pc4 = 31; continue $sw4; }
                    return false;
                }
                case 31: {
                    if (r2[r3 + 14] == r4[r5 + 14]) { $pc4 = 33; continue $sw4; }
                    return false;
                }
                case 33: {
                    if (r2[r3 + 15] == r4[r5 + 15]) { $pc4 = 35; continue $sw4; }
                    return false;
                }
                case 35: {
                    if (r2[r3 + 16] == r4[r5 + 16]) { $pc4 = 37; continue $sw4; }
                    return false;
                }
                case 37: {
                    if (r2[r3 + 17] == r4[r5 + 17]) { $pc4 = 39; continue $sw4; }
                    return false;
                }
                case 39: {
                    if (r2[r3 + 18] == r4[r5 + 18]) { $pc4 = 41; continue $sw4; }
                    return false;
                }
                case 41: {
                    if (r2[r3 + 19] != r4[r5 + 19]) { $pc4 = 64; continue $sw4; }
                    return true;
                }
                case 64: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.yE v5(byte[] r0, int r1) {
        return Zo(r0, r1);
    }

    @Override
    public abcd.yE J8() {
        return this;
    }
}
