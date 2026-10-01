package abcd;

public class HO extends abcd.AbstractxO {
    static final int[] Hw = null;
    private int EQ;
    private int[] J0;
    private int J8;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;
    private int we;

    static {
        Hw = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    }

    public HO() {
        this.J0 = new int[64];
        reset();
    }

    private int DW(int r4) {
        int r0 = ((r4 >>> 6) | (r4 << 26)) ^ ((r4 >>> 11) | (r4 << 21));
        int r1 = r4 >>> 25;
        return ((r4 << 7) | r1) ^ r0;
    }

    private int DW(int r2, int r3, int r4) {
        int r0 = r2 & r3;
        return ((r2 & r4) ^ r0) ^ (r3 & r4);
    }

    private int FH(int r4) {
        int r0 = ((r4 >>> 7) | (r4 << 25)) ^ ((r4 >>> 18) | (r4 << 14));
        return (r4 >>> 3) ^ r0;
    }

    private int Hw(int r4) {
        int r0 = ((r4 >>> 17) | (r4 << 15)) ^ ((r4 >>> 19) | (r4 << 13));
        return (r4 >>> 10) ^ r0;
    }

    private int j6(int r4) {
        int r0 = ((r4 >>> 2) | (r4 << 30)) ^ ((r4 >>> 13) | (r4 << 19));
        int r1 = r4 >>> 22;
        return ((r4 << 10) | r1) ^ r0;
    }

    private int j6(int r1, int r2, int r3) {
        int r4 = r2 & r1;
        return ((r1 ^ (-1)) & r3) ^ r4;
    }

    @Override
    public int DW() {
        return 32;
    }

    @Override
    protected void DW(byte[] r4, int r5) {
        int r0 = 0;
        int r6 = 0;
        int r1 = 0;
        int r7 = 0;
        int r2 = 0;
        int r8 = 0;
        int[] r9 = null;
        int r3 = 0;
        int r10 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4[r5] << 24;
                    r6 = r5 + 1;
                    r1 = r0 | ((r4[r6] & 255) << 16);
                    r7 = r6 + 1;
                    r2 = r1 | ((r4[r7] & 255) << 8);
                    r8 = (r4[r7 + 1] & 255) | r2;
                    r9 = this.J0;
                    r3 = this.J8;
                    r9[r3] = r8;
                    r10 = r3 + 1;
                    this.J8 = r10;
                    if (r10 != 16) { $pc0 = 6; continue $sw0; }
                    Hw();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void Hw() {
        int r1 = 0;
        int[] r2 = null;
        int r3 = 0;
        int[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r110 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r111 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r112 = 0;
        int r34 = 0;
        int r113 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 16;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 > 63) { $pc1 = 5; continue $sw1; }
                    r2 = this.J0;
                    r3 = Hw(r2[r1 - 2]);
                    r4 = this.J0;
                    r2[r1] = ((r3 + r4[r1 - 7]) + FH(r4[r1 - 15])) + this.J0[r1 - 16];
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    r5 = this.v5;
                    r6 = this.Zo;
                    r7 = this.VH;
                    r8 = this.gn;
                    r9 = this.u7;
                    r10 = this.tp;
                    r11 = this.EQ;
                    r12 = this.we;
                    r13 = r6;
                    r14 = r7;
                    r15 = 0;
                    r16 = r5;
                    r17 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r17 >= 8) { $pc1 = 8; continue $sw1; }
                    r18 = r12 + (((DW(r9) + j6(r9, r10, r11)) + Hw[r15]) + this.J0[r15]);
                    r19 = r8 + r18;
                    r20 = r18 + (j6(r16) + DW(r16, r13, r14));
                    r21 = r15 + 1;
                    r22 = r11 + (((DW(r19) + j6(r19, r9, r10)) + Hw[r21]) + this.J0[r21]);
                    r110 = r14 + r22;
                    r23 = r22 + (j6(r20) + DW(r20, r16, r13));
                    r24 = r21 + 1;
                    r25 = r10 + (((DW(r110) + j6(r110, r19, r9)) + Hw[r24]) + this.J0[r24]);
                    r111 = r13 + r25;
                    r26 = r25 + (j6(r23) + DW(r23, r20, r16));
                    r27 = r24 + 1;
                    r28 = r9 + (((DW(r111) + j6(r111, r110, r19)) + Hw[r27]) + this.J0[r27]);
                    r29 = r16 + r28;
                    r30 = r28 + (j6(r26) + DW(r26, r23, r20));
                    r31 = r27 + 1;
                    r32 = r19 + (((DW(r29) + j6(r29, r111, r110)) + Hw[r31]) + this.J0[r31]);
                    r12 = r20 + r32;
                    r8 = r32 + (j6(r30) + DW(r30, r26, r23));
                    r33 = r31 + 1;
                    r112 = r110 + (((DW(r12) + j6(r12, r29, r111)) + Hw[r33]) + this.J0[r33]);
                    r11 = r23 + r112;
                    r14 = r112 + (j6(r8) + DW(r8, r30, r26));
                    r34 = r33 + 1;
                    r113 = r111 + (((DW(r11) + j6(r11, r12, r29)) + Hw[r34]) + this.J0[r34]);
                    r10 = r26 + r113;
                    r13 = r113 + (j6(r14) + DW(r14, r8, r30));
                    r35 = r34 + 1;
                    r36 = r29 + (((DW(r10) + j6(r10, r11, r12)) + Hw[r35]) + this.J0[r35]);
                    r9 = r30 + r36;
                    r16 = r36 + (j6(r13) + DW(r13, r14, r8));
                    r15 = r35 + 1;
                    r17 = r17 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 8: {
                    this.v5 += r16;
                    this.Zo += r13;
                    this.VH += r14;
                    this.gn += r8;
                    this.u7 += r9;
                    this.tp += r10;
                    this.EQ += r11;
                    this.we += r12;
                    this.J8 = 0;
                    r37 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r37 >= 16) { $pc1 = 10; continue $sw1; }
                    this.J0[r37] = 0;
                    r37 = r37 + 1;
                    { $pc1 = 9; continue $sw1; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(byte[] r3, int r4) {
        FH();
        abcd.ZO.j6(this.v5, r3, r4);
        abcd.ZO.j6(this.Zo, r3, r4 + 4);
        abcd.ZO.j6(this.VH, r3, r4 + 8);
        abcd.ZO.j6(this.gn, r3, r4 + 12);
        abcd.ZO.j6(this.u7, r3, r4 + 16);
        abcd.ZO.j6(this.tp, r3, r4 + 20);
        abcd.ZO.j6(this.EQ, r3, r4 + 24);
        abcd.ZO.j6(this.we, r3, r4 + 28);
        reset();
        return 32;
    }

    @Override
    public java.lang.String j6() {
        return "SHA-256";
    }

    @Override
    protected void j6(long r5) {
        int[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.J8 <= 14) { $pc2 = 5; continue $sw2; }
                    Hw();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = this.J0;
                    r0[14] = (int) (r5 >>> 32);
                    r0[15] = (int) (r5 & (-1));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void reset() {
        int r1 = 0;
        int[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    super.reset();
                    this.v5 = 1779033703;
                    this.Zo = -1150833019;
                    this.VH = 1013904242;
                    this.gn = -1521486534;
                    this.u7 = 1359893119;
                    this.tp = -1694144372;
                    this.EQ = 528734635;
                    this.we = 1541459225;
                    this.J8 = 0;
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r2 = this.J0;
                    if (r1 == r2.length) { $pc3 = 5; continue $sw3; }
                    r2[r1] = 0;
                    r1 = r1 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
