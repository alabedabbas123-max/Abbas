package abcd;

public class FO extends abcd.AbstractxO {
    private int Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int[] u7;
    private int v5;

    public FO() {
        this.u7 = new int[80];
        reset();
    }

    public FO(abcd.FO r5) {
        super(r5);
        this.u7 = new int[80];
        this.Hw = r5.Hw;
        this.v5 = r5.v5;
        this.Zo = r5.Zo;
        this.VH = r5.VH;
        this.gn = r5.gn;
        int[] r0 = r5.u7;
        java.lang.System.arraycopy(r0, 0, this.u7, 0, r0.length);
        this.tp = r5.tp;
    }

    private int DW(int r2, int r3, int r4) {
        int r0 = r2 & r3;
        return ((r2 & r4) | r0) | (r3 & r4);
    }

    private int FH(int r1, int r2, int r3) {
        return (r1 ^ r2) ^ r3;
    }

    private int j6(int r1, int r2, int r3) {
        int r4 = r2 & r1;
        return ((r1 ^ (-1)) & r3) | r4;
    }

    @Override
    public int DW() {
        return 20;
    }

    @Override
    protected void DW(byte[] r4, int r5) {
        int r0 = r4[r5] << 24;
        int r6 = r5 + 1;
        int r1 = r0 | ((r4[r6] & 255) << 16);
        int r7 = r6 + 1;
        int r2 = r1 | ((r4[r7] & 255) << 8);
        int r8 = (r4[r7 + 1] & 255) | r2;
        int[] r9 = this.u7;
        int r3 = this.tp;
        r9[r3] = r8;
        int r10 = r3 + 1;
        this.tp = r10;
        if (r10 != 16) goto L6;
        Hw();
        return;
    }

    @Override
    protected void Hw() {
        int r1 = 16;
    L4:
        if (r1 >= 80) goto L5;
        int[] r2 = this.u7;
        int r3 = ((r2[r1 - 3] ^ r2[r1 - 8]) ^ r2[r1 - 14]) ^ r2[r1 - 16];
        r2[r1] = (r3 >>> 31) | (r3 << 1);
        r1 = r1 + 1;
        goto L4
    L5:
        int r4 = this.Hw;
        int r5 = this.v5;
        int r6 = this.Zo;
        int r7 = this.VH;
        int r8 = this.gn;
        int r9 = r7;
        int r10 = 0;
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        int r14 = 0;
    L7:
        if (r14 >= 4) goto L8;
        int r15 = r10 + 1;
        int r16 = r8 + (((((r13 << 5) | (r13 >>> 27)) + j6(r12, r11, r9)) + this.u7[r10]) + 1518500249);
        int r17 = (r12 >>> 2) | (r12 << 30);
        int r18 = r15 + 1;
        int r19 = r9 + (((((r16 << 5) | (r16 >>> 27)) + j6(r13, r17, r11)) + this.u7[r15]) + 1518500249);
        int r20 = (r13 >>> 2) | (r13 << 30);
        int r110 = r18 + 1;
        int r21 = r11 + (((((r19 << 5) | (r19 >>> 27)) + j6(r16, r20, r17)) + this.u7[r18]) + 1518500249);
        r8 = (r16 >>> 2) | (r16 << 30);
        int r111 = r110 + 1;
        r12 = r17 + (((((r21 << 5) | (r21 >>> 27)) + j6(r19, r8, r20)) + this.u7[r110]) + 1518500249);
        r9 = (r19 >>> 2) | (r19 << 30);
        r13 = r20 + (((((r12 << 5) | (r12 >>> 27)) + j6(r21, r9, r8)) + this.u7[r111]) + 1518500249);
        r11 = (r21 >>> 2) | (r21 << 30);
        r14 = r14 + 1;
        r10 = r111 + 1;
        goto L7
    L8:
        int r22 = 0;
    L9:
        if (r22 >= 4) goto L10;
        int r112 = r10 + 1;
        int r23 = r8 + (((((r13 << 5) | (r13 >>> 27)) + FH(r12, r11, r9)) + this.u7[r10]) + 1859775393);
        int r24 = (r12 >>> 2) | (r12 << 30);
        int r113 = r112 + 1;
        int r25 = r9 + (((((r23 << 5) | (r23 >>> 27)) + FH(r13, r24, r11)) + this.u7[r112]) + 1859775393);
        int r26 = (r13 >>> 2) | (r13 << 30);
        int r114 = r113 + 1;
        int r27 = r11 + (((((r25 << 5) | (r25 >>> 27)) + FH(r23, r26, r24)) + this.u7[r113]) + 1859775393);
        r8 = (r23 >>> 2) | (r23 << 30);
        int r115 = r114 + 1;
        r12 = r24 + (((((r27 << 5) | (r27 >>> 27)) + FH(r25, r8, r26)) + this.u7[r114]) + 1859775393);
        r9 = (r25 >>> 2) | (r25 << 30);
        r13 = r26 + (((((r12 << 5) | (r12 >>> 27)) + FH(r27, r9, r8)) + this.u7[r115]) + 1859775393);
        r11 = (r27 >>> 2) | (r27 << 30);
        r22 = r22 + 1;
        r10 = r115 + 1;
        goto L9
    L10:
        int r28 = 0;
    L11:
        if (r28 >= 4) goto L12;
        int r116 = r10 + 1;
        int r29 = r8 + (((((r13 << 5) | (r13 >>> 27)) + DW(r12, r11, r9)) + this.u7[r10]) - 1894007588);
        int r30 = (r12 >>> 2) | (r12 << 30);
        int r117 = r116 + 1;
        int r31 = r9 + (((((r29 << 5) | (r29 >>> 27)) + DW(r13, r30, r11)) + this.u7[r116]) - 1894007588);
        int r32 = (r13 >>> 2) | (r13 << 30);
        int r118 = r117 + 1;
        int r33 = r11 + (((((r31 << 5) | (r31 >>> 27)) + DW(r29, r32, r30)) + this.u7[r117]) - 1894007588);
        r8 = (r29 >>> 2) | (r29 << 30);
        int r119 = r118 + 1;
        r12 = r30 + (((((r33 << 5) | (r33 >>> 27)) + DW(r31, r8, r32)) + this.u7[r118]) - 1894007588);
        r9 = (r31 >>> 2) | (r31 << 30);
        r13 = r32 + (((((r12 << 5) | (r12 >>> 27)) + DW(r33, r9, r8)) + this.u7[r119]) - 1894007588);
        r11 = (r33 >>> 2) | (r33 << 30);
        r28 = r28 + 1;
        r10 = r119 + 1;
        goto L11
    L12:
        int r34 = 0;
    L14:
        if (r34 > 3) goto L15;
        int r120 = r10 + 1;
        int r35 = r8 + (((((r13 << 5) | (r13 >>> 27)) + FH(r12, r11, r9)) + this.u7[r10]) - 899497514);
        int r36 = (r12 >>> 2) | (r12 << 30);
        int r121 = r120 + 1;
        int r37 = r9 + (((((r35 << 5) | (r35 >>> 27)) + FH(r13, r36, r11)) + this.u7[r120]) - 899497514);
        int r38 = (r13 >>> 2) | (r13 << 30);
        int r122 = r121 + 1;
        int r39 = r11 + (((((r37 << 5) | (r37 >>> 27)) + FH(r35, r38, r36)) + this.u7[r121]) - 899497514);
        r8 = (r35 >>> 2) | (r35 << 30);
        int r123 = r122 + 1;
        r12 = r36 + (((((r39 << 5) | (r39 >>> 27)) + FH(r37, r8, r38)) + this.u7[r122]) - 899497514);
        r9 = (r37 >>> 2) | (r37 << 30);
        r13 = r38 + (((((r12 << 5) | (r12 >>> 27)) + FH(r39, r9, r8)) + this.u7[r123]) - 899497514);
        r11 = (r39 >>> 2) | (r39 << 30);
        r34 = r34 + 1;
        r10 = r123 + 1;
        goto L14
    L15:
        this.Hw += r13;
        this.v5 += r12;
        this.Zo += r11;
        this.VH += r9;
        this.gn += r8;
        this.tp = 0;
        int r40 = 0;
    L16:
        if (r40 >= 16) goto L17;
        this.u7[r40] = 0;
        r40 = r40 + 1;
        goto L16
    }

    @Override
    public int j6(byte[] r3, int r4) {
        FH();
        abcd.ZO.j6(this.Hw, r3, r4);
        abcd.ZO.j6(this.v5, r3, r4 + 4);
        abcd.ZO.j6(this.Zo, r3, r4 + 8);
        abcd.ZO.j6(this.VH, r3, r4 + 12);
        abcd.ZO.j6(this.gn, r3, r4 + 16);
        reset();
        return 20;
    }

    @Override
    public java.lang.String j6() {
        return "SHA-1";
    }

    @Override
    protected void j6(long r5) {
        if (this.tp <= 14) goto L5;
        Hw();
    L5:
        int[] r0 = this.u7;
        r0[14] = (int) (r5 >>> 32);
        r0[15] = (int) (r5 & (-1));
    }

    @Override
    public void reset() {
        super.reset();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.gn = -1009589776;
        this.tp = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.u7;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }
}
