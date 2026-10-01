package abcd;

public class KO implements abcd.InterfacepO {
    private static byte[] DW;
    private static byte[] FH;
    private static byte[] Hw;
    private static byte[] VH;
    private static byte[] Zo;
    private static byte[] gn;
    private static byte[] j6;
    private static java.util.Hashtable u7;
    private static byte[] v5;
    private boolean EQ;
    private int[] tp;
    private byte[] we;

    static {
        j6 = new byte[]{4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
        DW = new byte[]{4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};
        FH = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
        Hw = new byte[]{8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
        v5 = new byte[]{1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};
        Zo = new byte[]{15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};
        VH = new byte[]{4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
        gn = new byte[]{10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};
        u7 = new java.util.Hashtable();
        j6("Default", j6);
        j6("E-TEST", DW);
        j6("E-A", FH);
        j6("E-B", Hw);
        j6("E-C", v5);
        j6("E-D", Zo);
        j6("D-TEST", VH);
        j6("D-A", gn);
    }

    public KO() {
        this.tp = null;
        this.we = j6;
    }

    private int j6(int r3, int r4) {
        int r5 = r4 + r3;
        byte[] r6 = this.we;
        int r0 = (((((((r6[((r5 >> 0) & 15) + 0] << 0) + (r6[((r5 >> 4) & 15) + 16] << 4)) + (r6[((r5 >> 8) & 15) + 32] << 8)) + (r6[((r5 >> 12) & 15) + 48] << 12)) + (r6[((r5 >> 16) & 15) + 64] << 16)) + (r6[((r5 >> 20) & 15) + 80] << 20)) + (r6[((r5 >> 24) & 15) + 96] << 24)) + (r6[((r5 >> 28) & 15) + 112] << 28);
        return (r0 << 11) | (r0 >>> 21);
    }

    private int j6(byte[] r4, int r5) {
        return ((((r4[r5 + 3] << 24) & (-16777216)) + ((r4[r5 + 2] << 16) & 16711680)) + ((r4[r5 + 1] << 8) & 65280)) + (r4[r5] & 255);
    }

    private void j6(int r3, byte[] r4, int r5) {
        r4[r5 + 3] = (byte) (r3 >>> 24);
        r4[r5 + 2] = (byte) (r3 >>> 16);
        r4[r5 + 1] = (byte) (r3 >>> 8);
        r4[r5] = (byte) r3;
    }

    private static void j6(java.lang.String r1, byte[] r2) {
        u7.put(abcd.TP.FH(r1), r2);
    }

    private void j6(int[] r9, byte[] r10, int r11, byte[] r12, int r13) {
        int r0 = 0;
        int r14 = 0;
        int r1 = 0;
        int r15 = 0;
        int r5 = 0;
        int r16 = 0;
        int r6 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r110 = 0;
        int r111 = 0;
        int r7 = 0;
        int r8 = 0;
        int r2 = 0;
        int r112 = 0;
        int r113 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6(r10, r11);
                    r14 = j6(r10, r11 + 4);
                    r1 = 7;
                    if (this.EQ == false) { $pc0 = 14; continue $sw0; }
                    r15 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r15 >= 3) { $pc0 = 6; continue $sw0; }
                    r5 = r14;
                    r16 = 0;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r16 >= 8) { $pc0 = 12; continue $sw0; }
                    r6 = r5 ^ j6(r0, r9[r16]);
                    r16 = r16 + 1;
                    r5 = r0;
                    r0 = r6;
                    { $pc0 = 11; continue $sw0; }
                }
                case 12: {
                    r15 = r15 + 1;
                    r14 = r5;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    r17 = r14;
                    r18 = r0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 <= 0) { $pc0 = 18; continue $sw0; }
                    r19 = r17 ^ j6(r18, r9[r1]);
                    r1 = r1 - 1;
                    r17 = r18;
                    r18 = r19;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    r20 = j6(r18, r9[0]) ^ r17;
                    j6(r18, r12, r13);
                    j6(r20, r12, r13 + 4);
                    return;
                }
                case 14: {
                    r17 = r14;
                    r110 = 0;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    if (r110 >= 8) { $pc0 = 16; continue $sw0; }
                    r111 = r17 ^ j6(r0, r9[r110]);
                    r110 = r110 + 1;
                    r7 = r0;
                    r0 = r111;
                    r17 = r7;
                    { $pc0 = 15; continue $sw0; }
                }
                case 16: {
                    r18 = r0;
                    r8 = 0;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    if (r8 >= 3) { $pc0 = 18; continue $sw0; }
                    r2 = r17;
                    r112 = r18;
                    r113 = 7;
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if (r113 < 0) { $pc0 = 26; continue $sw0; }
                    if (r8 != 2) { $pc0 = 27; continue $sw0; }
                    if (r113 == 0) { $pc0 = 26; continue $sw0; }
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    r3 = r2 ^ j6(r112, r9[r113]);
                    r113 = r113 - 1;
                    r2 = r112;
                    r112 = r3;
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    r8 = r8 + 1;
                    r18 = r112;
                    r17 = r2;
                    { $pc0 = 17; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(java.lang.String r1) {
        byte[] r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = (byte[]) u7.get(abcd.TP.FH(r1));
                    if (r2 == null) { $pc1 = 7; continue $sw1; }
                    return abcd.OP.j6(r2);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"D-Test\", \"D-A\".");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int[] j6(boolean r4, byte[] r5) {
        int[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.EQ = r4;
                    if (r5.length != 32) { $pc2 = 9; continue $sw2; }
                    r0 = new int[8];
                    r1 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r1 == 8) { $pc2 = 6; continue $sw2; }
                    r0[r1] = j6(r5, r1 * 4);
                    r1 = r1 + 1;
                    { $pc2 = 5; continue $sw2; }
                }
                case 6: {
                    return r0;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(byte[] r7, int r8, byte[] r9, int r10) {
        int[] r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = this.tp;
                    if (r1 == null) { $pc3 = 15; continue $sw3; }
                    if ((r8 + 8) > r7.length) { $pc3 = 13; continue $sw3; }
                    if ((r10 + 8) > r9.length) { $pc3 = 11; continue $sw3; }
                    j6(r1, r7, r8, r9, r10);
                    return 8;
                }
                case 11: {
                    throw new abcd.rO("output buffer too short");
                }
                case 13: {
                    throw new abcd.rO("input buffer too short");
                }
                case 15: {
                    throw new java.lang.IllegalStateException("GOST28147 engine not initialised");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(boolean r4, abcd.InterfaceqO r5) {
        abcd.YO r6 = null;
        byte[] r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r5 instanceof abcd.YO) == false) { $pc4 = 12; continue $sw4; }
                    r6 = (abcd.YO) r5;
                    r0 = r6.DW();
                    if (r0.length != j6.length) { $pc4 = 10; continue $sw4; }
                    this.we = abcd.OP.j6(r0);
                    if (r6.j6() == null) { $pc4 = 15; continue $sw4; }
                    this.tp = j6(r4, ((abcd.XO) r6.j6()).j6());
                    return;
                }
                case 15: {
                    return;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("invalid S-box passed to GOST28147 init");
                }
                case 12: {
                    if ((r5 instanceof abcd.XO) == false) { $pc4 = 14; continue $sw4; }
                    this.tp = j6(r4, ((abcd.XO) r5).j6());
                    return;
                }
                case 14: {
                    if (r5 != null) { $pc4 = 17; continue $sw4; }
                    return;
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("invalid parameter passed to GOST28147 init - " + r5.getClass().getName());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
