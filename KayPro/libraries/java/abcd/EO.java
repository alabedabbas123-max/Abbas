package abcd;

public class EO extends abcd.AbstractxO {
    private int EQ;
    private int Hw;
    private int J0;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;
    private int[] we;

    public EO() {
        this.we = new int[16];
        reset();
    }

    private int DW(int r1, int r2, int r3) {
        int r4 = r2 & r1;
        return ((r1 ^ (-1)) & r3) | r4;
    }

    private int DW(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + DW(r2, r3, r4)) + r5) + 1518500249, r6);
    }

    private int FH(int r1, int r2, int r3) {
        return (r1 | (r2 ^ (-1))) ^ r3;
    }

    private int FH(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + FH(r2, r3, r4)) + r5) + 1859775393, r6);
    }

    private int Hw(int r1, int r2, int r3) {
        return (r1 & r3) | (r2 & (r3 ^ (-1)));
    }

    private int Hw(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + Hw(r2, r3, r4)) + r5) - 1894007588, r6);
    }

    private int VH(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + FH(r2, r3, r4)) + r5) + 1548603684, r6);
    }

    private int Zo(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + DW(r2, r3, r4)) + r5) + 1836072691, r6);
    }

    private int gn(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6(((r1 + Hw(r2, r3, r4)) + r5) + 1352829926, r6);
    }

    private int j6(int r2, int r3) {
        int r0 = r2 << r3;
        return (r2 >>> (32 - r3)) | r0;
    }

    private int j6(int r1, int r2, int r3) {
        return (r1 ^ r2) ^ r3;
    }

    private int j6(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6((r1 + j6(r2, r3, r4)) + r5, r6);
    }

    private void j6(int r3, byte[] r4, int r5) {
        r4[r5] = (byte) r3;
        r4[r5 + 1] = (byte) (r3 >>> 8);
        r4[r5 + 2] = (byte) (r3 >>> 16);
        r4[r5 + 3] = (byte) (r3 >>> 24);
    }

    private int v5(int r1, int r2, int r3, int r4, int r5, int r6) {
        return j6((r1 + j6(r2, r3, r4)) + r5, r6);
    }

    @Override
    public int DW() {
        return 32;
    }

    @Override
    protected void DW(byte[] r6, int r7) {
        int[] r0 = this.we;
        int r1 = this.J0;
        this.J0 = r1 + 1;
        int r2 = ((r6[r7] & 255) | ((r6[r7 + 1] & 255) << 8)) | ((r6[r7 + 2] & 255) << 16);
        r0[r1] = ((r6[r7 + 3] & 255) << 24) | r2;
        if (this.J0 != 16) goto L6;
        Hw();
        return;
    }

    @Override
    protected void Hw() {
        int r1 = this.Hw;
        int r8 = this.v5;
        int r9 = this.Zo;
        int r10 = this.VH;
        int r11 = this.gn;
        int r12 = this.u7;
        int r13 = this.tp;
        int r14 = this.EQ;
        int r16 = j6(r1, r8, r9, r10, this.we[0], 11);
        int r15 = j6(r10, r16, r8, r9, this.we[1], 14);
        int r17 = j6(r9, r15, r16, r8, this.we[2], 15);
        int r18 = j6(r8, r17, r15, r16, this.we[3], 12);
        int r19 = j6(r16, r18, r17, r15, this.we[4], 5);
        int r110 = j6(r15, r19, r18, r17, this.we[5], 8);
        int r20 = j6(r17, r110, r19, r18, this.we[6], 7);
        int r21 = j6(r18, r20, r110, r19, this.we[7], 9);
        int r111 = j6(r19, r21, r20, r110, this.we[8], 11);
        int r112 = j6(r110, r111, r21, r20, this.we[9], 13);
        int r22 = j6(r20, r112, r111, r21, this.we[10], 14);
        int r23 = j6(r21, r22, r112, r111, this.we[11], 15);
        int r113 = j6(r111, r23, r22, r112, this.we[12], 6);
        int r114 = j6(r112, r113, r23, r22, this.we[13], 7);
        int r24 = j6(r22, r114, r113, r23, this.we[14], 9);
        int r25 = j6(r23, r24, r114, r113, this.we[15], 8);
        int r115 = gn(r11, r12, r13, r14, this.we[5], 8);
        int r116 = gn(r14, r115, r12, r13, this.we[14], 9);
        int r117 = gn(r13, r116, r115, r12, this.we[7], 9);
        int r118 = gn(r12, r117, r116, r115, this.we[0], 11);
        int r119 = gn(r115, r118, r117, r116, this.we[9], 13);
        int r120 = gn(r116, r119, r118, r117, this.we[2], 15);
        int r121 = gn(r117, r120, r119, r118, this.we[11], 15);
        int r122 = gn(r118, r121, r120, r119, this.we[4], 5);
        int r123 = gn(r119, r122, r121, r120, this.we[13], 7);
        int r124 = gn(r120, r123, r122, r121, this.we[6], 7);
        int r125 = gn(r121, r124, r123, r122, this.we[15], 8);
        int r126 = gn(r122, r125, r124, r123, this.we[8], 11);
        int r127 = gn(r123, r126, r125, r124, this.we[1], 14);
        int r128 = gn(r124, r127, r126, r125, this.we[10], 14);
        int r129 = gn(r125, r128, r127, r126, this.we[3], 12);
        int r130 = gn(r126, r129, r128, r127, this.we[12], 6);
        int r131 = DW(r127, r25, r24, r114, this.we[7], 7);
        int r132 = DW(r114, r131, r25, r24, this.we[4], 6);
        int r26 = DW(r24, r132, r131, r25, this.we[13], 8);
        int r27 = DW(r25, r26, r132, r131, this.we[1], 13);
        int r133 = DW(r131, r27, r26, r132, this.we[10], 11);
        int r134 = DW(r132, r133, r27, r26, this.we[6], 9);
        int r28 = DW(r26, r134, r133, r27, this.we[15], 7);
        int r29 = DW(r27, r28, r134, r133, this.we[3], 15);
        int r135 = DW(r133, r29, r28, r134, this.we[12], 7);
        int r136 = DW(r134, r135, r29, r28, this.we[0], 12);
        int r30 = DW(r28, r136, r135, r29, this.we[9], 15);
        int r31 = DW(r29, r30, r136, r135, this.we[5], 9);
        int r137 = DW(r135, r31, r30, r136, this.we[2], 11);
        int r138 = DW(r136, r137, r31, r30, this.we[14], 7);
        int r32 = DW(r30, r138, r137, r31, this.we[11], 13);
        int r33 = DW(r31, r32, r138, r137, this.we[8], 12);
        int r139 = VH(r113, r130, r129, r128, this.we[6], 9);
        int r140 = VH(r128, r139, r130, r129, this.we[11], 13);
        int r141 = VH(r129, r140, r139, r130, this.we[3], 15);
        int r142 = VH(r130, r141, r140, r139, this.we[7], 7);
        int r143 = VH(r139, r142, r141, r140, this.we[0], 12);
        int r144 = VH(r140, r143, r142, r141, this.we[13], 8);
        int r145 = VH(r141, r144, r143, r142, this.we[5], 9);
        int r146 = VH(r142, r145, r144, r143, this.we[10], 11);
        int r147 = VH(r143, r146, r145, r144, this.we[14], 7);
        int r148 = VH(r144, r147, r146, r145, this.we[15], 7);
        int r149 = VH(r145, r148, r147, r146, this.we[8], 12);
        int r150 = VH(r146, r149, r148, r147, this.we[12], 7);
        int r151 = VH(r147, r150, r149, r148, this.we[4], 6);
        int r152 = VH(r148, r151, r150, r149, this.we[9], 15);
        int r153 = VH(r149, r152, r151, r150, this.we[1], 13);
        int r154 = VH(r150, r153, r152, r151, this.we[2], 11);
        int r155 = FH(r137, r154, r32, r138, this.we[3], 11);
        int r156 = FH(r138, r155, r154, r32, this.we[10], 13);
        int r34 = FH(r32, r156, r155, r154, this.we[14], 6);
        int r157 = FH(r154, r34, r156, r155, this.we[4], 7);
        int r158 = FH(r155, r157, r34, r156, this.we[9], 14);
        int r159 = FH(r156, r158, r157, r34, this.we[15], 9);
        int r35 = FH(r34, r159, r158, r157, this.we[8], 13);
        int r160 = FH(r157, r35, r159, r158, this.we[1], 15);
        int r161 = FH(r158, r160, r35, r159, this.we[2], 14);
        int r162 = FH(r159, r161, r160, r35, this.we[7], 8);
        int r36 = FH(r35, r162, r161, r160, this.we[0], 13);
        int r163 = FH(r160, r36, r162, r161, this.we[6], 6);
        int r164 = FH(r161, r163, r36, r162, this.we[13], 5);
        int r165 = FH(r162, r164, r163, r36, this.we[11], 12);
        int r37 = FH(r36, r165, r164, r163, this.we[5], 7);
        int r166 = FH(r163, r37, r165, r164, this.we[12], 5);
        int r167 = Zo(r151, r33, r153, r152, this.we[15], 9);
        int r168 = Zo(r152, r167, r33, r153, this.we[5], 7);
        int r169 = Zo(r153, r168, r167, r33, this.we[1], 15);
        int r38 = Zo(r33, r169, r168, r167, this.we[3], 11);
        int r170 = Zo(r167, r38, r169, r168, this.we[7], 8);
        int r171 = Zo(r168, r170, r38, r169, this.we[14], 6);
        int r172 = Zo(r169, r171, r170, r38, this.we[6], 6);
        int r39 = Zo(r38, r172, r171, r170, this.we[9], 14);
        int r173 = Zo(r170, r39, r172, r171, this.we[11], 12);
        int r174 = Zo(r171, r173, r39, r172, this.we[8], 13);
        int r175 = Zo(r172, r174, r173, r39, this.we[12], 5);
        int r40 = Zo(r39, r175, r174, r173, this.we[2], 14);
        int r176 = Zo(r173, r40, r175, r174, this.we[10], 13);
        int r177 = Zo(r174, r176, r40, r175, this.we[0], 13);
        int r178 = Zo(r175, r177, r176, r40, this.we[4], 7);
        int r41 = Zo(r40, r178, r177, r176, this.we[13], 5);
        int r179 = Hw(r164, r166, r178, r165, this.we[1], 11);
        int r180 = Hw(r165, r179, r166, r178, this.we[9], 12);
        int r181 = Hw(r178, r180, r179, r166, this.we[11], 14);
        int r182 = Hw(r166, r181, r180, r179, this.we[10], 15);
        int r183 = Hw(r179, r182, r181, r180, this.we[0], 14);
        int r184 = Hw(r180, r183, r182, r181, this.we[8], 15);
        int r185 = Hw(r181, r184, r183, r182, this.we[12], 9);
        int r186 = Hw(r182, r185, r184, r183, this.we[4], 8);
        int r187 = Hw(r183, r186, r185, r184, this.we[13], 9);
        int r188 = Hw(r184, r187, r186, r185, this.we[3], 14);
        int r189 = Hw(r185, r188, r187, r186, this.we[7], 5);
        int r190 = Hw(r186, r189, r188, r187, this.we[15], 6);
        int r191 = Hw(r187, r190, r189, r188, this.we[14], 8);
        int r192 = Hw(r188, r191, r190, r189, this.we[5], 6);
        int r193 = Hw(r189, r192, r191, r190, this.we[6], 5);
        int r194 = Hw(r190, r193, r192, r191, this.we[2], 12);
        int r195 = v5(r176, r41, r37, r177, this.we[8], 15);
        int r196 = v5(r177, r195, r41, r37, this.we[6], 5);
        int r42 = v5(r37, r196, r195, r41, this.we[4], 8);
        int r43 = v5(r41, r42, r196, r195, this.we[1], 11);
        int r197 = v5(r195, r43, r42, r196, this.we[3], 14);
        int r198 = v5(r196, r197, r43, r42, this.we[11], 14);
        int r44 = v5(r42, r198, r197, r43, this.we[15], 6);
        int r45 = v5(r43, r44, r198, r197, this.we[0], 14);
        int r199 = v5(r197, r45, r44, r198, this.we[5], 6);
        int r1100 = v5(r198, r199, r45, r44, this.we[12], 9);
        int r46 = v5(r44, r1100, r199, r45, this.we[2], 12);
        int r47 = v5(r45, r46, r1100, r199, this.we[13], 9);
        int r1101 = v5(r199, r47, r46, r1100, this.we[9], 12);
        int r1102 = v5(r1100, r1101, r47, r46, this.we[7], 5);
        int r48 = v5(r46, r1102, r1101, r47, this.we[10], 15);
        int r0 = v5(r47, r48, r1102, r1101, this.we[14], 8);
        this.Hw += r191;
        this.v5 += r194;
        this.Zo += r193;
        this.VH += r1102;
        this.gn += r1101;
        this.u7 += r0;
        this.tp += r48;
        this.EQ += r192;
        this.J0 = 0;
        int r2 = 0;
    L3:
        int[] r3 = this.we;
        if (r2 == r3.length) goto L5;
        r3[r2] = 0;
        r2 = r2 + 1;
        goto L3
    }

    @Override
    public int j6(byte[] r3, int r4) {
        FH();
        j6(this.Hw, r3, r4);
        j6(this.v5, r3, r4 + 4);
        j6(this.Zo, r3, r4 + 8);
        j6(this.VH, r3, r4 + 12);
        j6(this.gn, r3, r4 + 16);
        j6(this.u7, r3, r4 + 20);
        j6(this.tp, r3, r4 + 24);
        j6(this.EQ, r3, r4 + 28);
        reset();
        return 32;
    }

    @Override
    public java.lang.String j6() {
        return "RIPEMD256";
    }

    @Override
    protected void j6(long r5) {
        if (this.J0 <= 14) goto L5;
        Hw();
    L5:
        int[] r0 = this.we;
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
        this.gn = 1985229328;
        this.u7 = -19088744;
        this.tp = -1985229329;
        this.EQ = 19088743;
        this.J0 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.we;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }
}
