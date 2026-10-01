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
        int[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.we;
                    r1 = this.J0;
                    this.J0 = r1 + 1;
                    r2 = ((r6[r7] & 255) | ((r6[r7 + 1] & 255) << 8)) | ((r6[r7 + 2] & 255) << 16);
                    r0[r1] = ((r6[r7 + 3] & 255) << 24) | r2;
                    if (this.J0 != 16) { $pc0 = 6; continue $sw0; }
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
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r16 = 0;
        int r15 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r110 = 0;
        int r20 = 0;
        int r21 = 0;
        int r111 = 0;
        int r112 = 0;
        int r22 = 0;
        int r23 = 0;
        int r113 = 0;
        int r114 = 0;
        int r24 = 0;
        int r25 = 0;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        int r126 = 0;
        int r127 = 0;
        int r128 = 0;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        int r26 = 0;
        int r27 = 0;
        int r133 = 0;
        int r134 = 0;
        int r28 = 0;
        int r29 = 0;
        int r135 = 0;
        int r136 = 0;
        int r30 = 0;
        int r31 = 0;
        int r137 = 0;
        int r138 = 0;
        int r32 = 0;
        int r33 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        int r144 = 0;
        int r145 = 0;
        int r146 = 0;
        int r147 = 0;
        int r148 = 0;
        int r149 = 0;
        int r150 = 0;
        int r151 = 0;
        int r152 = 0;
        int r153 = 0;
        int r154 = 0;
        int r155 = 0;
        int r156 = 0;
        int r34 = 0;
        int r157 = 0;
        int r158 = 0;
        int r159 = 0;
        int r35 = 0;
        int r160 = 0;
        int r161 = 0;
        int r162 = 0;
        int r36 = 0;
        int r163 = 0;
        int r164 = 0;
        int r165 = 0;
        int r37 = 0;
        int r166 = 0;
        int r167 = 0;
        int r168 = 0;
        int r169 = 0;
        int r38 = 0;
        int r170 = 0;
        int r171 = 0;
        int r172 = 0;
        int r39 = 0;
        int r173 = 0;
        int r174 = 0;
        int r175 = 0;
        int r40 = 0;
        int r176 = 0;
        int r177 = 0;
        int r178 = 0;
        int r41 = 0;
        int r179 = 0;
        int r180 = 0;
        int r181 = 0;
        int r182 = 0;
        int r183 = 0;
        int r184 = 0;
        int r185 = 0;
        int r186 = 0;
        int r187 = 0;
        int r188 = 0;
        int r189 = 0;
        int r190 = 0;
        int r191 = 0;
        int r192 = 0;
        int r193 = 0;
        int r194 = 0;
        int r195 = 0;
        int r196 = 0;
        int r42 = 0;
        int r43 = 0;
        int r197 = 0;
        int r198 = 0;
        int r44 = 0;
        int r45 = 0;
        int r199 = 0;
        int r1100 = 0;
        int r46 = 0;
        int r47 = 0;
        int r1101 = 0;
        int r1102 = 0;
        int r48 = 0;
        int r0 = 0;
        int r2 = 0;
        int[] r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = this.Hw;
                    r8 = this.v5;
                    r9 = this.Zo;
                    r10 = this.VH;
                    r11 = this.gn;
                    r12 = this.u7;
                    r13 = this.tp;
                    r14 = this.EQ;
                    r16 = j6(r1, r8, r9, r10, this.we[0], 11);
                    r15 = j6(r10, r16, r8, r9, this.we[1], 14);
                    r17 = j6(r9, r15, r16, r8, this.we[2], 15);
                    r18 = j6(r8, r17, r15, r16, this.we[3], 12);
                    r19 = j6(r16, r18, r17, r15, this.we[4], 5);
                    r110 = j6(r15, r19, r18, r17, this.we[5], 8);
                    r20 = j6(r17, r110, r19, r18, this.we[6], 7);
                    r21 = j6(r18, r20, r110, r19, this.we[7], 9);
                    r111 = j6(r19, r21, r20, r110, this.we[8], 11);
                    r112 = j6(r110, r111, r21, r20, this.we[9], 13);
                    r22 = j6(r20, r112, r111, r21, this.we[10], 14);
                    r23 = j6(r21, r22, r112, r111, this.we[11], 15);
                    r113 = j6(r111, r23, r22, r112, this.we[12], 6);
                    r114 = j6(r112, r113, r23, r22, this.we[13], 7);
                    r24 = j6(r22, r114, r113, r23, this.we[14], 9);
                    r25 = j6(r23, r24, r114, r113, this.we[15], 8);
                    r115 = gn(r11, r12, r13, r14, this.we[5], 8);
                    r116 = gn(r14, r115, r12, r13, this.we[14], 9);
                    r117 = gn(r13, r116, r115, r12, this.we[7], 9);
                    r118 = gn(r12, r117, r116, r115, this.we[0], 11);
                    r119 = gn(r115, r118, r117, r116, this.we[9], 13);
                    r120 = gn(r116, r119, r118, r117, this.we[2], 15);
                    r121 = gn(r117, r120, r119, r118, this.we[11], 15);
                    r122 = gn(r118, r121, r120, r119, this.we[4], 5);
                    r123 = gn(r119, r122, r121, r120, this.we[13], 7);
                    r124 = gn(r120, r123, r122, r121, this.we[6], 7);
                    r125 = gn(r121, r124, r123, r122, this.we[15], 8);
                    r126 = gn(r122, r125, r124, r123, this.we[8], 11);
                    r127 = gn(r123, r126, r125, r124, this.we[1], 14);
                    r128 = gn(r124, r127, r126, r125, this.we[10], 14);
                    r129 = gn(r125, r128, r127, r126, this.we[3], 12);
                    r130 = gn(r126, r129, r128, r127, this.we[12], 6);
                    r131 = DW(r127, r25, r24, r114, this.we[7], 7);
                    r132 = DW(r114, r131, r25, r24, this.we[4], 6);
                    r26 = DW(r24, r132, r131, r25, this.we[13], 8);
                    r27 = DW(r25, r26, r132, r131, this.we[1], 13);
                    r133 = DW(r131, r27, r26, r132, this.we[10], 11);
                    r134 = DW(r132, r133, r27, r26, this.we[6], 9);
                    r28 = DW(r26, r134, r133, r27, this.we[15], 7);
                    r29 = DW(r27, r28, r134, r133, this.we[3], 15);
                    r135 = DW(r133, r29, r28, r134, this.we[12], 7);
                    r136 = DW(r134, r135, r29, r28, this.we[0], 12);
                    r30 = DW(r28, r136, r135, r29, this.we[9], 15);
                    r31 = DW(r29, r30, r136, r135, this.we[5], 9);
                    r137 = DW(r135, r31, r30, r136, this.we[2], 11);
                    r138 = DW(r136, r137, r31, r30, this.we[14], 7);
                    r32 = DW(r30, r138, r137, r31, this.we[11], 13);
                    r33 = DW(r31, r32, r138, r137, this.we[8], 12);
                    r139 = VH(r113, r130, r129, r128, this.we[6], 9);
                    r140 = VH(r128, r139, r130, r129, this.we[11], 13);
                    r141 = VH(r129, r140, r139, r130, this.we[3], 15);
                    r142 = VH(r130, r141, r140, r139, this.we[7], 7);
                    r143 = VH(r139, r142, r141, r140, this.we[0], 12);
                    r144 = VH(r140, r143, r142, r141, this.we[13], 8);
                    r145 = VH(r141, r144, r143, r142, this.we[5], 9);
                    r146 = VH(r142, r145, r144, r143, this.we[10], 11);
                    r147 = VH(r143, r146, r145, r144, this.we[14], 7);
                    r148 = VH(r144, r147, r146, r145, this.we[15], 7);
                    r149 = VH(r145, r148, r147, r146, this.we[8], 12);
                    r150 = VH(r146, r149, r148, r147, this.we[12], 7);
                    r151 = VH(r147, r150, r149, r148, this.we[4], 6);
                    r152 = VH(r148, r151, r150, r149, this.we[9], 15);
                    r153 = VH(r149, r152, r151, r150, this.we[1], 13);
                    r154 = VH(r150, r153, r152, r151, this.we[2], 11);
                    r155 = FH(r137, r154, r32, r138, this.we[3], 11);
                    r156 = FH(r138, r155, r154, r32, this.we[10], 13);
                    r34 = FH(r32, r156, r155, r154, this.we[14], 6);
                    r157 = FH(r154, r34, r156, r155, this.we[4], 7);
                    r158 = FH(r155, r157, r34, r156, this.we[9], 14);
                    r159 = FH(r156, r158, r157, r34, this.we[15], 9);
                    r35 = FH(r34, r159, r158, r157, this.we[8], 13);
                    r160 = FH(r157, r35, r159, r158, this.we[1], 15);
                    r161 = FH(r158, r160, r35, r159, this.we[2], 14);
                    r162 = FH(r159, r161, r160, r35, this.we[7], 8);
                    r36 = FH(r35, r162, r161, r160, this.we[0], 13);
                    r163 = FH(r160, r36, r162, r161, this.we[6], 6);
                    r164 = FH(r161, r163, r36, r162, this.we[13], 5);
                    r165 = FH(r162, r164, r163, r36, this.we[11], 12);
                    r37 = FH(r36, r165, r164, r163, this.we[5], 7);
                    r166 = FH(r163, r37, r165, r164, this.we[12], 5);
                    r167 = Zo(r151, r33, r153, r152, this.we[15], 9);
                    r168 = Zo(r152, r167, r33, r153, this.we[5], 7);
                    r169 = Zo(r153, r168, r167, r33, this.we[1], 15);
                    r38 = Zo(r33, r169, r168, r167, this.we[3], 11);
                    r170 = Zo(r167, r38, r169, r168, this.we[7], 8);
                    r171 = Zo(r168, r170, r38, r169, this.we[14], 6);
                    r172 = Zo(r169, r171, r170, r38, this.we[6], 6);
                    r39 = Zo(r38, r172, r171, r170, this.we[9], 14);
                    r173 = Zo(r170, r39, r172, r171, this.we[11], 12);
                    r174 = Zo(r171, r173, r39, r172, this.we[8], 13);
                    r175 = Zo(r172, r174, r173, r39, this.we[12], 5);
                    r40 = Zo(r39, r175, r174, r173, this.we[2], 14);
                    r176 = Zo(r173, r40, r175, r174, this.we[10], 13);
                    r177 = Zo(r174, r176, r40, r175, this.we[0], 13);
                    r178 = Zo(r175, r177, r176, r40, this.we[4], 7);
                    r41 = Zo(r40, r178, r177, r176, this.we[13], 5);
                    r179 = Hw(r164, r166, r178, r165, this.we[1], 11);
                    r180 = Hw(r165, r179, r166, r178, this.we[9], 12);
                    r181 = Hw(r178, r180, r179, r166, this.we[11], 14);
                    r182 = Hw(r166, r181, r180, r179, this.we[10], 15);
                    r183 = Hw(r179, r182, r181, r180, this.we[0], 14);
                    r184 = Hw(r180, r183, r182, r181, this.we[8], 15);
                    r185 = Hw(r181, r184, r183, r182, this.we[12], 9);
                    r186 = Hw(r182, r185, r184, r183, this.we[4], 8);
                    r187 = Hw(r183, r186, r185, r184, this.we[13], 9);
                    r188 = Hw(r184, r187, r186, r185, this.we[3], 14);
                    r189 = Hw(r185, r188, r187, r186, this.we[7], 5);
                    r190 = Hw(r186, r189, r188, r187, this.we[15], 6);
                    r191 = Hw(r187, r190, r189, r188, this.we[14], 8);
                    r192 = Hw(r188, r191, r190, r189, this.we[5], 6);
                    r193 = Hw(r189, r192, r191, r190, this.we[6], 5);
                    r194 = Hw(r190, r193, r192, r191, this.we[2], 12);
                    r195 = v5(r176, r41, r37, r177, this.we[8], 15);
                    r196 = v5(r177, r195, r41, r37, this.we[6], 5);
                    r42 = v5(r37, r196, r195, r41, this.we[4], 8);
                    r43 = v5(r41, r42, r196, r195, this.we[1], 11);
                    r197 = v5(r195, r43, r42, r196, this.we[3], 14);
                    r198 = v5(r196, r197, r43, r42, this.we[11], 14);
                    r44 = v5(r42, r198, r197, r43, this.we[15], 6);
                    r45 = v5(r43, r44, r198, r197, this.we[0], 14);
                    r199 = v5(r197, r45, r44, r198, this.we[5], 6);
                    r1100 = v5(r198, r199, r45, r44, this.we[12], 9);
                    r46 = v5(r44, r1100, r199, r45, this.we[2], 12);
                    r47 = v5(r45, r46, r1100, r199, this.we[13], 9);
                    r1101 = v5(r199, r47, r46, r1100, this.we[9], 12);
                    r1102 = v5(r1100, r1101, r47, r46, this.we[7], 5);
                    r48 = v5(r46, r1102, r1101, r47, this.we[10], 15);
                    r0 = v5(r47, r48, r1102, r1101, this.we[14], 8);
                    this.Hw += r191;
                    this.v5 += r194;
                    this.Zo += r193;
                    this.VH += r1102;
                    this.gn += r1101;
                    this.u7 += r0;
                    this.tp += r48;
                    this.EQ += r192;
                    this.J0 = 0;
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r3 = this.we;
                    if (r2 == r3.length) { $pc1 = 5; continue $sw1; }
                    r3[r2] = 0;
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.J0 <= 14) { $pc2 = 5; continue $sw2; }
                    Hw();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = this.we;
                    r0[14] = (int) ((-1) & r5);
                    r0[15] = (int) (r5 >>> 32);
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
                    this.Hw = 1732584193;
                    this.v5 = -271733879;
                    this.Zo = -1732584194;
                    this.VH = 271733878;
                    this.gn = 1985229328;
                    this.u7 = -19088744;
                    this.tp = -1985229329;
                    this.EQ = 19088743;
                    this.J0 = 0;
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r2 = this.we;
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
