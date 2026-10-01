package abcd;

public class BO extends abcd.AbstractxO {
    private int Hw;
    private int VH;
    private int Zo;
    private int[] gn;
    private int u7;
    private int v5;

    public BO() {
        this.gn = new int[16];
        reset();
    }

    private int DW(int r1, int r2, int r3) {
        return (r1 & r3) | (r2 & (r3 ^ (-1)));
    }

    private int FH(int r1, int r2, int r3) {
        return (r1 ^ r2) ^ r3;
    }

    private int Hw(int r1, int r2, int r3) {
        return (r1 | (r3 ^ (-1))) ^ r2;
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
        int r5 = j6(((r1 + j6(r2, r3, r4)) + this.gn[0]) - 680876936, 7) + r2;
        int r6 = j6(((r4 + j6(r5, r2, r3)) + this.gn[1]) - 389564586, 12) + r5;
        int r7 = j6(((r3 + j6(r6, r5, r2)) + this.gn[2]) + 606105819, 17) + r6;
        int r8 = j6(((r2 + j6(r7, r6, r5)) + this.gn[3]) - 1044525330, 22) + r7;
        int r9 = j6(((r5 + j6(r8, r7, r6)) + this.gn[4]) - 176418897, 7) + r8;
        int r10 = j6(((r6 + j6(r9, r8, r7)) + this.gn[5]) + 1200080426, 12) + r9;
        int r11 = j6(((r7 + j6(r10, r9, r8)) + this.gn[6]) - 1473231341, 17) + r10;
        int r12 = j6(((r8 + j6(r11, r10, r9)) + this.gn[7]) - 45705983, 22) + r11;
        int r13 = j6(((r9 + j6(r12, r11, r10)) + this.gn[8]) + 1770035416, 7) + r12;
        int r14 = j6(((r10 + j6(r13, r12, r11)) + this.gn[9]) - 1958414417, 12) + r13;
        int r15 = j6(((r11 + j6(r14, r13, r12)) + this.gn[10]) - 42063, 17) + r14;
        int r16 = j6(((r12 + j6(r15, r14, r13)) + this.gn[11]) - 1990404162, 22) + r15;
        int r17 = j6(((r13 + j6(r16, r15, r14)) + this.gn[12]) + 1804603682, 7) + r16;
        int r18 = j6(((r14 + j6(r17, r16, r15)) + this.gn[13]) - 40341101, 12) + r17;
        int r19 = j6(((r15 + j6(r18, r17, r16)) + this.gn[14]) - 1502002290, 17) + r18;
        int r20 = j6(((r16 + j6(r19, r18, r17)) + this.gn[15]) + 1236535329, 22) + r19;
        int r21 = j6(((r17 + DW(r20, r19, r18)) + this.gn[1]) - 165796510, 5) + r20;
        int r22 = j6(((r18 + DW(r21, r20, r19)) + this.gn[6]) - 1069501632, 9) + r21;
        int r23 = j6(((r19 + DW(r22, r21, r20)) + this.gn[11]) + 643717713, 14) + r22;
        int r24 = j6(((r20 + DW(r23, r22, r21)) + this.gn[0]) - 373897302, 20) + r23;
        int r25 = j6(((r21 + DW(r24, r23, r22)) + this.gn[5]) - 701558691, 5) + r24;
        int r26 = j6(((r22 + DW(r25, r24, r23)) + this.gn[10]) + 38016083, 9) + r25;
        int r27 = j6(((r23 + DW(r26, r25, r24)) + this.gn[15]) - 660478335, 14) + r26;
        int r28 = j6(((r24 + DW(r27, r26, r25)) + this.gn[4]) - 405537848, 20) + r27;
        int r29 = j6(((r25 + DW(r28, r27, r26)) + this.gn[9]) + 568446438, 5) + r28;
        int r30 = j6(((r26 + DW(r29, r28, r27)) + this.gn[14]) - 1019803690, 9) + r29;
        int r31 = j6(((r27 + DW(r30, r29, r28)) + this.gn[3]) - 187363961, 14) + r30;
        int r32 = j6(((r28 + DW(r31, r30, r29)) + this.gn[8]) + 1163531501, 20) + r31;
        int r33 = j6(((r29 + DW(r32, r31, r30)) + this.gn[13]) - 1444681467, 5) + r32;
        int r34 = j6(((r30 + DW(r33, r32, r31)) + this.gn[2]) - 51403784, 9) + r33;
        int r35 = j6(((r31 + DW(r34, r33, r32)) + this.gn[7]) + 1735328473, 14) + r34;
        int r36 = j6(((r32 + DW(r35, r34, r33)) + this.gn[12]) - 1926607734, 20) + r35;
        int r37 = j6(((r33 + FH(r36, r35, r34)) + this.gn[5]) - 378558, 4) + r36;
        int r38 = j6(((r34 + FH(r37, r36, r35)) + this.gn[8]) - 2022574463, 11) + r37;
        int r39 = j6(((r35 + FH(r38, r37, r36)) + this.gn[11]) + 1839030562, 16) + r38;
        int r40 = j6(((r36 + FH(r39, r38, r37)) + this.gn[14]) - 35309556, 23) + r39;
        int r41 = j6(((r37 + FH(r40, r39, r38)) + this.gn[1]) - 1530992060, 4) + r40;
        int r42 = j6(((r38 + FH(r41, r40, r39)) + this.gn[4]) + 1272893353, 11) + r41;
        int r43 = j6(((r39 + FH(r42, r41, r40)) + this.gn[7]) - 155497632, 16) + r42;
        int r44 = j6(((r40 + FH(r43, r42, r41)) + this.gn[10]) - 1094730640, 23) + r43;
        int r45 = j6(((r41 + FH(r44, r43, r42)) + this.gn[13]) + 681279174, 4) + r44;
        int r46 = j6(((r42 + FH(r45, r44, r43)) + this.gn[0]) - 358537222, 11) + r45;
        int r47 = j6(((r43 + FH(r46, r45, r44)) + this.gn[3]) - 722521979, 16) + r46;
        int r48 = j6(((r44 + FH(r47, r46, r45)) + this.gn[6]) + 76029189, 23) + r47;
        int r49 = j6(((r45 + FH(r48, r47, r46)) + this.gn[9]) - 640364487, 4) + r48;
        int r50 = j6(((r46 + FH(r49, r48, r47)) + this.gn[12]) - 421815835, 11) + r49;
        int r51 = j6(((r47 + FH(r50, r49, r48)) + this.gn[15]) + 530742520, 16) + r50;
        int r52 = j6(((r48 + FH(r51, r50, r49)) + this.gn[2]) - 995338651, 23) + r51;
        int r53 = j6(((r49 + Hw(r52, r51, r50)) + this.gn[0]) - 198630844, 6) + r52;
        int r54 = j6(((r50 + Hw(r53, r52, r51)) + this.gn[7]) + 1126891415, 10) + r53;
        int r55 = j6(((r51 + Hw(r54, r53, r52)) + this.gn[14]) - 1416354905, 15) + r54;
        int r56 = j6(((r52 + Hw(r55, r54, r53)) + this.gn[5]) - 57434055, 21) + r55;
        int r57 = j6(((r53 + Hw(r56, r55, r54)) + this.gn[12]) + 1700485571, 6) + r56;
        int r58 = j6(((r54 + Hw(r57, r56, r55)) + this.gn[3]) - 1894986606, 10) + r57;
        int r59 = j6(((r55 + Hw(r58, r57, r56)) + this.gn[10]) - 1051523, 15) + r58;
        int r60 = j6(((r56 + Hw(r59, r58, r57)) + this.gn[1]) - 2054922799, 21) + r59;
        int r61 = j6(((r57 + Hw(r60, r59, r58)) + this.gn[8]) + 1873313359, 6) + r60;
        int r62 = j6(((r58 + Hw(r61, r60, r59)) + this.gn[15]) - 30611744, 10) + r61;
        int r63 = j6(((r59 + Hw(r62, r61, r60)) + this.gn[6]) - 1560198380, 15) + r62;
        int r64 = j6(((r60 + Hw(r63, r62, r61)) + this.gn[13]) + 1309151649, 21) + r63;
        int r65 = j6(((r61 + Hw(r64, r63, r62)) + this.gn[4]) - 145523070, 6) + r64;
        int r66 = j6(((r62 + Hw(r65, r64, r63)) + this.gn[11]) - 1120210379, 10) + r65;
        int r67 = j6(((r63 + Hw(r66, r65, r64)) + this.gn[2]) + 718787259, 15) + r66;
        int r68 = j6(((r64 + Hw(r67, r66, r65)) + this.gn[9]) - 343485551, 21) + r67;
        this.Hw += r65;
        this.v5 += r68;
        this.Zo += r67;
        this.VH += r66;
        this.u7 = 0;
        int r69 = 0;
    L3:
        int[] r70 = this.gn;
        if (r69 == r70.length) goto L5;
        r70[r69] = 0;
        r69 = r69 + 1;
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
        return "MD5";
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
