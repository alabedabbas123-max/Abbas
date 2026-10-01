package abcd;

public class AO extends abcd.AbstractxO {
    private int Hw;
    private int VH;
    private int Zo;
    private int[] gn;
    private int u7;
    private int v5;

    public AO() {
        this.gn = new int[16];
        reset();
    }

    private int DW(int r2, int r3, int r4) {
        int r0 = r2 & r3;
        return ((r2 & r4) | r0) | (r3 & r4);
    }

    private int FH(int r1, int r2, int r3) {
        return (r1 ^ r2) ^ r3;
    }

    private int j6(int r2, int r3) {
        int r0 = r2 << r3;
        return (r2 >>> (32 - r3)) | r0;
    }

    private int j6(int r1, int r2, int r3) {
        int r4 = r2 & r1;
        return ((r1 ^ (-1)) & r3) | r4;
    }

    private void j6(int r3, byte[] r4, int r5) {
        r4[r5] = (byte) r3;
        r4[r5 + 1] = (byte) (r3 >>> 8);
        r4[r5 + 2] = (byte) (r3 >>> 16);
        r4[r5 + 3] = (byte) (r3 >>> 24);
    }

    @Override
    public int DW() {
        return 16;
    }

    @Override
    protected void DW(byte[] r6, int r7) {
        int[] r0 = this.gn;
        int r1 = this.u7;
        this.u7 = r1 + 1;
        int r2 = ((r6[r7] & 255) | ((r6[r7 + 1] & 255) << 8)) | ((r6[r7 + 2] & 255) << 16);
        r0[r1] = ((r6[r7 + 3] & 255) << 24) | r2;
        if (this.u7 != 16) goto L6;
        Hw();
        return;
    }

    @Override
    protected void Hw() {
        int r1 = this.Hw;
        int r2 = this.v5;
        int r3 = this.Zo;
        int r4 = this.VH;
        int r5 = j6((r1 + j6(r2, r3, r4)) + this.gn[0], 3);
        int r6 = j6((r4 + j6(r5, r2, r3)) + this.gn[1], 7);
        int r7 = j6((r3 + j6(r6, r5, r2)) + this.gn[2], 11);
        int r8 = j6((r2 + j6(r7, r6, r5)) + this.gn[3], 19);
        int r9 = j6((r5 + j6(r8, r7, r6)) + this.gn[4], 3);
        int r10 = j6((r6 + j6(r9, r8, r7)) + this.gn[5], 7);
        int r11 = j6((r7 + j6(r10, r9, r8)) + this.gn[6], 11);
        int r12 = j6((r8 + j6(r11, r10, r9)) + this.gn[7], 19);
        int r13 = j6((r9 + j6(r12, r11, r10)) + this.gn[8], 3);
        int r14 = j6((r10 + j6(r13, r12, r11)) + this.gn[9], 7);
        int r15 = j6((r11 + j6(r14, r13, r12)) + this.gn[10], 11);
        int r16 = j6((r12 + j6(r15, r14, r13)) + this.gn[11], 19);
        int r17 = j6((r13 + j6(r16, r15, r14)) + this.gn[12], 3);
        int r18 = j6((r14 + j6(r17, r16, r15)) + this.gn[13], 7);
        int r19 = j6((r15 + j6(r18, r17, r16)) + this.gn[14], 11);
        int r20 = j6((r16 + j6(r19, r18, r17)) + this.gn[15], 19);
        int r21 = j6(((r17 + DW(r20, r19, r18)) + this.gn[0]) + 1518500249, 3);
        int r22 = j6(((r18 + DW(r21, r20, r19)) + this.gn[4]) + 1518500249, 5);
        int r23 = j6(((r19 + DW(r22, r21, r20)) + this.gn[8]) + 1518500249, 9);
        int r24 = j6(((r20 + DW(r23, r22, r21)) + this.gn[12]) + 1518500249, 13);
        int r25 = j6(((r21 + DW(r24, r23, r22)) + this.gn[1]) + 1518500249, 3);
        int r26 = j6(((r22 + DW(r25, r24, r23)) + this.gn[5]) + 1518500249, 5);
        int r27 = j6(((r23 + DW(r26, r25, r24)) + this.gn[9]) + 1518500249, 9);
        int r28 = j6(((r24 + DW(r27, r26, r25)) + this.gn[13]) + 1518500249, 13);
        int r29 = j6(((r25 + DW(r28, r27, r26)) + this.gn[2]) + 1518500249, 3);
        int r30 = j6(((r26 + DW(r29, r28, r27)) + this.gn[6]) + 1518500249, 5);
        int r31 = j6(((r27 + DW(r30, r29, r28)) + this.gn[10]) + 1518500249, 9);
        int r32 = j6(((r28 + DW(r31, r30, r29)) + this.gn[14]) + 1518500249, 13);
        int r33 = j6(((r29 + DW(r32, r31, r30)) + this.gn[3]) + 1518500249, 3);
        int r34 = j6(((r30 + DW(r33, r32, r31)) + this.gn[7]) + 1518500249, 5);
        int r35 = j6(((r31 + DW(r34, r33, r32)) + this.gn[11]) + 1518500249, 9);
        int r36 = j6(((r32 + DW(r35, r34, r33)) + this.gn[15]) + 1518500249, 13);
        int r37 = j6(((r33 + FH(r36, r35, r34)) + this.gn[0]) + 1859775393, 3);
        int r38 = j6(((r34 + FH(r37, r36, r35)) + this.gn[8]) + 1859775393, 9);
        int r39 = j6(((r35 + FH(r38, r37, r36)) + this.gn[4]) + 1859775393, 11);
        int r40 = j6(((r36 + FH(r39, r38, r37)) + this.gn[12]) + 1859775393, 15);
        int r41 = j6(((r37 + FH(r40, r39, r38)) + this.gn[2]) + 1859775393, 3);
        int r42 = j6(((r38 + FH(r41, r40, r39)) + this.gn[10]) + 1859775393, 9);
        int r43 = j6(((r39 + FH(r42, r41, r40)) + this.gn[6]) + 1859775393, 11);
        int r44 = j6(((r40 + FH(r43, r42, r41)) + this.gn[14]) + 1859775393, 15);
        int r45 = j6(((r41 + FH(r44, r43, r42)) + this.gn[1]) + 1859775393, 3);
        int r46 = j6(((r42 + FH(r45, r44, r43)) + this.gn[9]) + 1859775393, 9);
        int r47 = j6(((r43 + FH(r46, r45, r44)) + this.gn[5]) + 1859775393, 11);
        int r48 = j6(((r44 + FH(r47, r46, r45)) + this.gn[13]) + 1859775393, 15);
        int r49 = j6(((r45 + FH(r48, r47, r46)) + this.gn[3]) + 1859775393, 3);
        int r50 = j6(((r46 + FH(r49, r48, r47)) + this.gn[11]) + 1859775393, 9);
        int r51 = j6(((r47 + FH(r50, r49, r48)) + this.gn[7]) + 1859775393, 11);
        int r52 = j6(((r48 + FH(r51, r50, r49)) + this.gn[15]) + 1859775393, 15);
        this.Hw += r49;
        this.v5 += r52;
        this.Zo += r51;
        this.VH += r50;
        this.u7 = 0;
        int r53 = 0;
    L3:
        int[] r54 = this.gn;
        if (r53 == r54.length) goto L5;
        r54[r53] = 0;
        r53 = r53 + 1;
        goto L3
    }

    @Override
    public int j6(byte[] r3, int r4) {
        FH();
        j6(this.Hw, r3, r4);
        j6(this.v5, r3, r4 + 4);
        j6(this.Zo, r3, r4 + 8);
        j6(this.VH, r3, r4 + 12);
        reset();
        return 16;
    }

    @Override
    public java.lang.String j6() {
        return "MD4";
    }

    @Override
    protected void j6(long r5) {
        if (this.u7 <= 14) goto L5;
        Hw();
    L5:
        int[] r0 = this.gn;
        r0[14] = (int) ((-1) & r5);
        r0[15] = (int) (r5 >>> 32);
    }

    @Override
    public void reset() {
        super.reset();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.u7 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.gn;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }
}
