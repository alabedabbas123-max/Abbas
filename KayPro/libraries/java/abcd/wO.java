package abcd;

public class wO implements abcd.InterfacetO {
    private static final byte[] j6 = null;
    private byte[] DW;
    private byte[] EQ;
    private byte[] FH;
    private byte[] Hw;
    byte[] J0;
    short[] J8;
    byte[] QX;
    private byte[] VH;
    short[] Ws;
    byte[] XL;
    private byte[][] Zo;
    byte[] aM;
    private int gn;
    byte[] j3;
    private abcd.InterfacepO tp;
    private long u7;
    private byte[] v5;
    private byte[] we;

    static {
        j6 = new byte[]{0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    }

    public wO() {
        this.DW = new byte[32];
        this.FH = new byte[32];
        this.Hw = new byte[32];
        this.v5 = new byte[32];
        this.Zo = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{4, 32});
        this.VH = new byte[32];
        this.tp = new abcd.KO();
        this.we = new byte[32];
        this.J0 = new byte[8];
        this.J8 = new short[16];
        this.Ws = new short[16];
        this.QX = new byte[32];
        this.XL = new byte[32];
        this.aM = new byte[32];
        this.j3 = new byte[32];
        this.EQ = abcd.KO.j6("D-A");
        this.tp.j6(true, new abcd.YO(null, this.EQ));
        reset();
    }

    private byte[] DW(byte[] r6) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= 8) { $pc0 = 6; continue $sw0; }
                    r1 = this.we;
                    r2 = r0 * 4;
                    r1[r2] = r6[r0];
                    r1[r2 + 1] = r6[r0 + 8];
                    r1[r2 + 2] = r6[r0 + 16];
                    r1[r2 + 3] = r6[r0 + 24];
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    abcd.ZO.DW(this.u7 * 8, this.FH, 0);
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (this.gn == 0) { $pc1 = 5; continue $sw1; }
                    j6((byte) 0);
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    DW(this.FH, 0);
                    DW(this.v5, 0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(byte[] r8) {
        j6(r8, this.J8);
        short[] r0 = this.Ws;
        short[] r1 = this.J8;
        r0[15] = (short) (((((r1[0] ^ r1[1]) ^ r1[2]) ^ r1[3]) ^ r1[12]) ^ r1[15]);
        java.lang.System.arraycopy(r1, 1, r0, 0, 15);
        j6(this.Ws, r8);
    }

    private void Hw(byte[] r6) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r2 = this.v5;
                    if (r0 == r2.length) { $pc2 = 5; continue $sw2; }
                    r3 = ((r2[r0] & 255) + (r6[r0] & 255)) + r1;
                    r2[r0] = (byte) r3;
                    r1 = r3 >>> 8;
                    r0 = r0 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(byte[] r3, byte[] r4, int r5, byte[] r6, int r7) {
        this.tp.j6(true, new abcd.XO(r3));
        this.tp.j6(r6, r7, r4, r5);
    }

    private void j6(byte[] r5, short[] r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= (r5.length / 2)) { $pc3 = 5; continue $sw3; }
                    r1 = r0 * 2;
                    r2 = (r5[r1 + 1] << 8) & 65280;
                    r6[r0] = (short) ((r5[r1] & 255) | r2);
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(short[] r5, byte[] r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0 >= (r6.length / 2)) { $pc4 = 5; continue $sw4; }
                    r1 = r0 * 2;
                    r6[r1 + 1] = (byte) (r5[r0] >> 8);
                    r6[r1] = (byte) r5[r0];
                    r0 = r0 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(byte[] r6) {
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r1 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r1 >= 8) { $pc5 = 5; continue $sw5; }
                    this.J0[r1] = (byte) (r6[r1] ^ r6[r1 + 8]);
                    r1 = r1 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    java.lang.System.arraycopy(r6, 8, r6, 0, 24);
                    java.lang.System.arraycopy(this.J0, 0, r6, 24, 8);
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int DW() {
        return 32;
    }

    protected void DW(byte[] r10, int r11) {
        int r12 = 0;
        int r13 = 0;
        byte[] r0 = null;
        int r14 = 0;
        byte[] r15 = null;
        int r16 = 0;
        int r8 = 0;
        int r17 = 0;
        int r18 = 0;
        byte[] r19 = null;
        int r110 = 0;
        byte[] r111 = null;
        int r112 = 0;
        byte[] r113 = null;
        byte[] r114 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    java.lang.System.arraycopy(r10, r11, this.Hw, 0, 32);
                    java.lang.System.arraycopy(this.DW, 0, this.XL, 0, 32);
                    java.lang.System.arraycopy(this.Hw, 0, this.aM, 0, 32);
                    r12 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r12 >= 32) { $pc6 = 4; continue $sw6; }
                    this.j3[r12] = (byte) (this.XL[r12] ^ this.aM[r12]);
                    r12 = r12 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 4: {
                    j6(DW(this.j3), this.QX, 0, this.DW, 0);
                    r13 = 1;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r13 >= 4) { $pc6 = 7; continue $sw6; }
                    r0 = this.XL;
                    j6(r0);
                    r14 = 0;
                    $pc6 = 24; continue $sw6;
                }
                case 24: {
                    if (r14 >= 32) { $pc6 = 25; continue $sw6; }
                    this.XL[r14] = (byte) (r0[r14] ^ this.Zo[r13][r14]);
                    r14 = r14 + 1;
                    { $pc6 = 24; continue $sw6; }
                }
                case 25: {
                    r15 = this.aM;
                    j6(r15);
                    j6(r15);
                    this.aM = r15;
                    r16 = 0;
                    $pc6 = 26; continue $sw6;
                }
                case 26: {
                    if (r16 >= 32) { $pc6 = 27; continue $sw6; }
                    this.j3[r16] = (byte) (this.XL[r16] ^ this.aM[r16]);
                    r16 = r16 + 1;
                    { $pc6 = 26; continue $sw6; }
                }
                case 27: {
                    r8 = r13 * 8;
                    j6(DW(this.j3), this.QX, r8, this.DW, r8);
                    r13 = r13 + 1;
                    { $pc6 = 6; continue $sw6; }
                }
                case 7: {
                    r17 = 0;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r17 >= 12) { $pc6 = 10; continue $sw6; }
                    FH(this.QX);
                    r17 = r17 + 1;
                    { $pc6 = 9; continue $sw6; }
                }
                case 10: {
                    r18 = 0;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r18 >= 32) { $pc6 = 12; continue $sw6; }
                    r19 = this.QX;
                    r19[r18] = (byte) (r19[r18] ^ this.Hw[r18]);
                    r18 = r18 + 1;
                    { $pc6 = 11; continue $sw6; }
                }
                case 12: {
                    FH(this.QX);
                    r110 = 0;
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    if (r110 >= 32) { $pc6 = 14; continue $sw6; }
                    r111 = this.QX;
                    r111[r110] = (byte) (this.DW[r110] ^ r111[r110]);
                    r110 = r110 + 1;
                    { $pc6 = 13; continue $sw6; }
                }
                case 14: {
                    r112 = 0;
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    if (r112 >= 61) { $pc6 = 17; continue $sw6; }
                    FH(this.QX);
                    r112 = r112 + 1;
                    { $pc6 = 16; continue $sw6; }
                }
                case 17: {
                    r113 = this.QX;
                    r114 = this.DW;
                    java.lang.System.arraycopy(r113, 0, r114, 0, r114.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(byte[] r4, int r5) {
        FH();
        byte[] r0 = this.DW;
        java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
        reset();
        return 32;
    }

    @Override
    public java.lang.String j6() {
        return "GOST3411";
    }

    @Override
    public void j6(byte r5) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.VH;
                    r1 = this.gn;
                    this.gn = r1 + 1;
                    r0[r1] = r5;
                    if (this.gn != r0.length) { $pc7 = 5; continue $sw7; }
                    Hw(r0);
                    DW(this.VH, 0);
                    this.gn = 0;
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    this.u7++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void reset() {
        int r1 = 0;
        byte[] r2 = null;
        int r3 = 0;
        byte[] r4 = null;
        int r5 = 0;
        byte[] r6 = null;
        int r7 = 0;
        byte[][] r8 = null;
        int r9 = 0;
        byte[][] r10 = null;
        int r11 = 0;
        byte[] r12 = null;
        int r13 = 0;
        byte[] r14 = null;
        byte[] r15 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    this.u7 = 0;
                    this.gn = 0;
                    r1 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    r2 = this.DW;
                    if (r1 >= r2.length) { $pc8 = 5; continue $sw8; }
                    r2[r1] = 0;
                    r1 = r1 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 5: {
                    r3 = 0;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    r4 = this.FH;
                    if (r3 >= r4.length) { $pc8 = 8; continue $sw8; }
                    r4[r3] = 0;
                    r3 = r3 + 1;
                    { $pc8 = 6; continue $sw8; }
                }
                case 8: {
                    r5 = 0;
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    r6 = this.Hw;
                    if (r5 >= r6.length) { $pc8 = 11; continue $sw8; }
                    r6[r5] = 0;
                    r5 = r5 + 1;
                    { $pc8 = 9; continue $sw8; }
                }
                case 11: {
                    r7 = 0;
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    r8 = this.Zo;
                    if (r7 >= r8[1].length) { $pc8 = 14; continue $sw8; }
                    r8[1][r7] = 0;
                    r7 = r7 + 1;
                    { $pc8 = 12; continue $sw8; }
                }
                case 14: {
                    r9 = 0;
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    r10 = this.Zo;
                    if (r9 >= r10[3].length) { $pc8 = 17; continue $sw8; }
                    r10[3][r9] = 0;
                    r9 = r9 + 1;
                    { $pc8 = 15; continue $sw8; }
                }
                case 17: {
                    r11 = 0;
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    r12 = this.v5;
                    if (r11 >= r12.length) { $pc8 = 20; continue $sw8; }
                    r12[r11] = 0;
                    r11 = r11 + 1;
                    { $pc8 = 18; continue $sw8; }
                }
                case 20: {
                    r13 = 0;
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    r14 = this.VH;
                    if (r13 >= r14.length) { $pc8 = 23; continue $sw8; }
                    r14[r13] = 0;
                    r13 = r13 + 1;
                    { $pc8 = 21; continue $sw8; }
                }
                case 23: {
                    r15 = j6;
                    java.lang.System.arraycopy(r15, 0, this.Zo[2], 0, r15.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void update(byte[] r6, int r7, int r8) {
        byte[] r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 3: {
                    if (this.gn == 0) { $pc9 = 7; continue $sw9; }
                    if (r8 <= 0) { $pc9 = 7; continue $sw9; }
                    j6(r6[r7]);
                    r7 = r7 + 1;
                    r8 = r8 - 1;
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    r0 = this.VH;
                    if (r8 <= r0.length) { $pc9 = 9; continue $sw9; }
                    java.lang.System.arraycopy(r6, r7, r0, 0, r0.length);
                    Hw(this.VH);
                    DW(this.VH, 0);
                    r1 = this.VH;
                    r7 = r7 + r1.length;
                    r8 = r8 - r1.length;
                    this.u7 += (long) r1.length;
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    if (r8 <= 0) { $pc9 = 10; continue $sw9; }
                    j6(r6[r7]);
                    r7 = r7 + 1;
                    r8 = r8 - 1;
                    { $pc9 = 9; continue $sw9; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
