package abcd;

public class CO extends abcd.AbstractxO {
    private int Hw;
    private int VH;
    private int Zo;
    private int[] gn;
    private int u7;
    private int v5;

    public CO() {
        this.gn = new int[16];
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
        int r8 = this.Hw;
        int r9 = this.v5;
        int r10 = this.Zo;
        int r11 = this.VH;
        int r13 = j6(r8, r9, r10, r11, this.gn[0], 11);
        int r15 = j6(r11, r13, r9, r10, this.gn[1], 14);
        int r17 = j6(r10, r15, r13, r9, this.gn[2], 15);
        int r19 = j6(r9, r17, r15, r13, this.gn[3], 12);
        int r14 = j6(r13, r19, r17, r15, this.gn[4], 5);
        int r16 = j6(r15, r14, r19, r17, this.gn[5], 8);
        int r18 = j6(r17, r16, r14, r19, this.gn[6], 7);
        int r110 = j6(r19, r18, r16, r14, this.gn[7], 9);
        int r111 = j6(r14, r110, r18, r16, this.gn[8], 11);
        int r112 = j6(r16, r111, r110, r18, this.gn[9], 13);
        int r113 = j6(r18, r112, r111, r110, this.gn[10], 14);
        int r114 = j6(r110, r113, r112, r111, this.gn[11], 15);
        int r115 = j6(r111, r114, r113, r112, this.gn[12], 6);
        int r116 = j6(r112, r115, r114, r113, this.gn[13], 7);
        int r117 = j6(r113, r116, r115, r114, this.gn[14], 9);
        int r118 = j6(r114, r117, r116, r115, this.gn[15], 8);
        int r119 = DW(r115, r118, r117, r116, this.gn[7], 7);
        int r120 = DW(r116, r119, r118, r117, this.gn[4], 6);
        int r121 = DW(r117, r120, r119, r118, this.gn[13], 8);
        int r122 = DW(r118, r121, r120, r119, this.gn[1], 13);
        int r123 = DW(r119, r122, r121, r120, this.gn[10], 11);
        int r124 = DW(r120, r123, r122, r121, this.gn[6], 9);
        int r125 = DW(r121, r124, r123, r122, this.gn[15], 7);
        int r126 = DW(r122, r125, r124, r123, this.gn[3], 15);
        int r127 = DW(r123, r126, r125, r124, this.gn[12], 7);
        int r128 = DW(r124, r127, r126, r125, this.gn[0], 12);
        int r129 = DW(r125, r128, r127, r126, this.gn[9], 15);
        int r130 = DW(r126, r129, r128, r127, this.gn[5], 9);
        int r131 = DW(r127, r130, r129, r128, this.gn[2], 11);
        int r132 = DW(r128, r131, r130, r129, this.gn[14], 7);
        int r133 = DW(r129, r132, r131, r130, this.gn[11], 13);
        int r134 = DW(r130, r133, r132, r131, this.gn[8], 12);
        int r135 = FH(r131, r134, r133, r132, this.gn[3], 11);
        int r136 = FH(r132, r135, r134, r133, this.gn[10], 13);
        int r137 = FH(r133, r136, r135, r134, this.gn[14], 6);
        int r138 = FH(r134, r137, r136, r135, this.gn[4], 7);
        int r139 = FH(r135, r138, r137, r136, this.gn[9], 14);
        int r140 = FH(r136, r139, r138, r137, this.gn[15], 9);
        int r141 = FH(r137, r140, r139, r138, this.gn[8], 13);
        int r142 = FH(r138, r141, r140, r139, this.gn[1], 15);
        int r143 = FH(r139, r142, r141, r140, this.gn[2], 14);
        int r144 = FH(r140, r143, r142, r141, this.gn[7], 8);
        int r145 = FH(r141, r144, r143, r142, this.gn[0], 13);
        int r146 = FH(r142, r145, r144, r143, this.gn[6], 6);
        int r147 = FH(r143, r146, r145, r144, this.gn[13], 5);
        int r148 = FH(r144, r147, r146, r145, this.gn[11], 12);
        int r149 = FH(r145, r148, r147, r146, this.gn[5], 7);
        int r150 = FH(r146, r149, r148, r147, this.gn[12], 5);
        int r151 = Hw(r147, r150, r149, r148, this.gn[1], 11);
        int r152 = Hw(r148, r151, r150, r149, this.gn[9], 12);
        int r153 = Hw(r149, r152, r151, r150, this.gn[11], 14);
        int r154 = Hw(r150, r153, r152, r151, this.gn[10], 15);
        int r155 = Hw(r151, r154, r153, r152, this.gn[0], 14);
        int r156 = Hw(r152, r155, r154, r153, this.gn[8], 15);
        int r157 = Hw(r153, r156, r155, r154, this.gn[12], 9);
        int r158 = Hw(r154, r157, r156, r155, this.gn[4], 8);
        int r159 = Hw(r155, r158, r157, r156, this.gn[13], 9);
        int r160 = Hw(r156, r159, r158, r157, this.gn[3], 14);
        int r161 = Hw(r157, r160, r159, r158, this.gn[7], 5);
        int r162 = Hw(r158, r161, r160, r159, this.gn[15], 6);
        int r163 = Hw(r159, r162, r161, r160, this.gn[14], 8);
        int r164 = Hw(r160, r163, r162, r161, this.gn[5], 6);
        int r165 = Hw(r161, r164, r163, r162, this.gn[6], 5);
        int r166 = Hw(r162, r165, r164, r163, this.gn[2], 12);
        int r12 = gn(r8, r9, r10, r11, this.gn[5], 8);
        int r167 = gn(r11, r12, r9, r10, this.gn[14], 9);
        int r168 = gn(r10, r167, r12, r9, this.gn[7], 9);
        int r20 = gn(r9, r168, r167, r12, this.gn[0], 11);
        int r21 = gn(r12, r20, r168, r167, this.gn[9], 13);
        int r169 = gn(r167, r21, r20, r168, this.gn[2], 15);
        int r170 = gn(r168, r169, r21, r20, this.gn[11], 15);
        int r22 = gn(r20, r170, r169, r21, this.gn[4], 5);
        int r23 = gn(r21, r22, r170, r169, this.gn[13], 7);
        int r171 = gn(r169, r23, r22, r170, this.gn[6], 7);
        int r172 = gn(r170, r171, r23, r22, this.gn[15], 8);
        int r24 = gn(r22, r172, r171, r23, this.gn[8], 11);
        int r25 = gn(r23, r24, r172, r171, this.gn[1], 14);
        int r173 = gn(r171, r25, r24, r172, this.gn[10], 14);
        int r174 = gn(r172, r173, r25, r24, this.gn[3], 12);
        int r26 = gn(r24, r174, r173, r25, this.gn[12], 6);
        int r27 = VH(r25, r26, r174, r173, this.gn[6], 9);
        int r175 = VH(r173, r27, r26, r174, this.gn[11], 13);
        int r176 = VH(r174, r175, r27, r26, this.gn[3], 15);
        int r28 = VH(r26, r176, r175, r27, this.gn[7], 7);
        int r29 = VH(r27, r28, r176, r175, this.gn[0], 12);
        int r177 = VH(r175, r29, r28, r176, this.gn[13], 8);
        int r178 = VH(r176, r177, r29, r28, this.gn[5], 9);
        int r30 = VH(r28, r178, r177, r29, this.gn[10], 11);
        int r31 = VH(r29, r30, r178, r177, this.gn[14], 7);
        int r179 = VH(r177, r31, r30, r178, this.gn[15], 7);
        int r180 = VH(r178, r179, r31, r30, this.gn[8], 12);
        int r32 = VH(r30, r180, r179, r31, this.gn[12], 7);
        int r33 = VH(r31, r32, r180, r179, this.gn[4], 6);
        int r181 = VH(r179, r33, r32, r180, this.gn[9], 15);
        int r182 = VH(r180, r181, r33, r32, this.gn[1], 13);
        int r34 = VH(r32, r182, r181, r33, this.gn[2], 11);
        int r35 = Zo(r33, r34, r182, r181, this.gn[15], 9);
        int r183 = Zo(r181, r35, r34, r182, this.gn[5], 7);
        int r184 = Zo(r182, r183, r35, r34, this.gn[1], 15);
        int r36 = Zo(r34, r184, r183, r35, this.gn[3], 11);
        int r37 = Zo(r35, r36, r184, r183, this.gn[7], 8);
        int r185 = Zo(r183, r37, r36, r184, this.gn[14], 6);
        int r186 = Zo(r184, r185, r37, r36, this.gn[6], 6);
        int r38 = Zo(r36, r186, r185, r37, this.gn[9], 14);
        int r39 = Zo(r37, r38, r186, r185, this.gn[11], 12);
        int r187 = Zo(r185, r39, r38, r186, this.gn[8], 13);
        int r188 = Zo(r186, r187, r39, r38, this.gn[12], 5);
        int r40 = Zo(r38, r188, r187, r39, this.gn[2], 14);
        int r41 = Zo(r39, r40, r188, r187, this.gn[10], 13);
        int r189 = Zo(r187, r41, r40, r188, this.gn[0], 13);
        int r190 = Zo(r188, r189, r41, r40, this.gn[4], 7);
        int r42 = Zo(r40, r190, r189, r41, this.gn[13], 5);
        int r43 = v5(r41, r42, r190, r189, this.gn[8], 15);
        int r191 = v5(r189, r43, r42, r190, this.gn[6], 5);
        int r192 = v5(r190, r191, r43, r42, this.gn[4], 8);
        int r44 = v5(r42, r192, r191, r43, this.gn[1], 11);
        int r45 = v5(r43, r44, r192, r191, this.gn[3], 14);
        int r193 = v5(r191, r45, r44, r192, this.gn[11], 14);
        int r194 = v5(r192, r193, r45, r44, this.gn[15], 6);
        int r46 = v5(r44, r194, r193, r45, this.gn[0], 14);
        int r47 = v5(r45, r46, r194, r193, this.gn[5], 6);
        int r195 = v5(r193, r47, r46, r194, this.gn[12], 9);
        int r196 = v5(r194, r195, r47, r46, this.gn[2], 12);
        int r48 = v5(r46, r196, r195, r47, this.gn[13], 9);
        int r49 = v5(r47, r48, r196, r195, this.gn[9], 12);
        int r197 = v5(r195, r49, r48, r196, this.gn[7], 5);
        int r198 = v5(r196, r197, r49, r48, this.gn[10], 15);
        int r0 = v5(r48, r198, r197, r49, this.gn[14], 8);
        int r199 = r197 + (r165 + this.v5);
        this.v5 = (this.Zo + r164) + r49;
        this.Zo = (this.VH + r163) + r0;
        this.VH = (this.Hw + r166) + r198;
        this.Hw = r199;
        this.u7 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.gn;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
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
        return "RIPEMD128";
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
