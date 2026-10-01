package abcd;

final class Iy {
    static final int[] DW = null;
    private static final int[] j6 = null;
    int[] EQ;
    int FH;
    int Hw;
    int[][] J0;
    int[] J8;
    int[] Mr;
    private final abcd.Jy QX;
    byte[] U2;
    int[] VH;
    int[] Ws;
    int XL;
    int Zo;
    int a8;
    int aM;
    private boolean er;
    private final abcd.Oy gW;
    int[] gn;
    int j3;
    int lg;
    int rN;
    int[] tp;
    int[] u7;
    int v5;
    int[][] we;
    private final abcd.Ky yS;

    static {
        j6 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
        DW = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    }

    Iy(abcd.Oy r4, int r5) {
        boolean r0 = true;
        this.gn = new int[1];
        this.u7 = new int[1];
        this.tp = new int[1];
        this.EQ = new int[1];
        this.we = new int[1][];
        this.J0 = new int[1][];
        this.J8 = new int[1];
        this.Ws = new int[1];
        this.yS = new abcd.Ky();
        this.gW = r4;
        this.QX = new abcd.Jy(this.gW, this);
        this.Mr = new int[4320];
        this.U2 = new byte[r5];
        this.a8 = r5;
        if (r4.EQ.VH != 0) goto L5;
        r0 = false;
    L5:
        this.er = r0;
        this.FH = 0;
        DW();
    }

    int DW(int r34) {
        abcd.Oy r1 = this.gW;
        int r2 = r1.DW;
        int r3 = r1.FH;
        int r4 = this.j3;
        int r5 = this.aM;
        int r6 = this.rN;
        int r7 = this.lg;
        if (r6 >= r7) goto L5;
        int r8 = (r7 - r6) - 1;
    L6:
        int r9 = 0;
        int r10 = r34;
    L7:
        int r14 = 9;
        int r15 = 7;
        int r12 = -3;
        switch(this.FH) {
            case 0: goto L196;
            case 1: goto L176;
            case 2: goto L133;
            case 3: goto L14;
            case 4: goto L32;
            case 5: goto L42;
            case 6: goto L52;
            case 7: goto L65;
            case 8: goto L74;
            case 9: goto L11;
            default: goto L9;
        };
    L9:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r11 = this.gW;
        r11.FH = r3;
        r11.Hw += (long) (r2 - r11.DW);
        r11.DW = r2;
        this.rN = r6;
        return j6(-2);
    L11:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r13 = this.gW;
        r13.FH = r3;
        r13.Hw += (long) (r2 - r13.DW);
        r13.DW = r2;
        this.rN = r6;
        return j6(-3);
    L65:
        this.rN = r6;
        int r16 = j6(r10);
        int r17 = this.rN;
        if (r17 < this.lg) goto L70;
        int r18 = this.a8;
    L70:
        if (this.lg == this.rN) goto L73;
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r19 = this.gW;
        r19.FH = r3;
        r19.Hw += (long) (r2 - r19.DW);
        r19.DW = r2;
        this.rN = r17;
        return j6(r16);
    L73:
        this.FH = 8;
        r6 = r17;
    L74:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r20 = this.gW;
        r20.FH = r3;
        r20.Hw += (long) (r2 - r20.DW);
        r20.DW = r2;
        this.rN = r6;
        return j6(1);
    L176:
        int r21 = 7;
    L178:
        if (r5 >= 32) goto L179;
        if (r3 == 0) goto L194;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r10 = 0;
        goto L178
    L194:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r22 = this.gW;
        r22.FH = r3;
        r22.Hw += (long) (r2 - r22.DW);
        r22.DW = r2;
        this.rN = r6;
        return j6(r10);
    L179:
        int r110 = 65535 & r4;
        if ((((r4 ^ (-1)) >>> 16) & 65535) != r110) goto L181;
        this.Hw = r110;
        if (this.Hw == 0) goto L187;
        r21 = 2;
    L190:
        this.FH = r21;
        r4 = 0;
        r5 = 0;
    L205:
        r9 = 0;
        goto L7
    L187:
        if (this.XL != 0) goto L190;
        r21 = 0;
        goto L190
    L181:
        this.FH = 9;
        abcd.Oy r23 = this.gW;
        r23.u7 = "invalid stored block lengths";
        this.j3 = r4;
        this.aM = r5;
        r23.FH = r3;
        r23.Hw += (long) (r2 - r23.DW);
        r23.DW = r2;
        this.rN = r6;
        return j6(-3);
    L196:
        int r24 = 3;
    L197:
        if (r5 >= r24) goto L198;
        if (r3 == 0) goto L214;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r24 = 3;
        r10 = 0;
        goto L197
    L214:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r25 = this.gW;
        r25.FH = r3;
        r25.Hw += (long) (r2 - r25.DW);
        r25.DW = r2;
        this.rN = r6;
        return j6(r10);
    L198:
        int r26 = r4 & 7;
        this.XL = r26 & 1;
        int r27 = r26 >>> 1;
        if (r27 == 0) goto L210;
        if (r27 != 1) goto L202;
        abcd.Ky.j6(this.tp, this.EQ, this.we, this.J0, this.gW);
        this.QX.j6(this.tp[0], this.EQ[0], this.we[0], 0, this.J0[0], 0);
        r4 = r4 >>> 3;
        r5 = r5 - 3;
        this.FH = 6;
        goto L205
    L202:
        if (r27 != 2) goto L204;
        r4 = r4 >>> 3;
        r5 = r5 - 3;
        this.FH = 3;
        goto L205
    L204:
        if (r27 != 3) goto L205;
        this.FH = 9;
        abcd.Oy r28 = this.gW;
        r28.u7 = "invalid block type";
        this.j3 = r4 >>> 3;
        this.aM = r5 - 3;
        r28.FH = r3;
        r28.Hw += (long) (r2 - r28.DW);
        r28.DW = r2;
        this.rN = r6;
        return j6(-3);
    L210:
        int r29 = r5 - 3;
        int r30 = r29 & 7;
        r4 = (r4 >>> 3) >>> r30;
        r5 = r29 - r30;
        this.FH = 1;
    L14:
        if (r5 >= 14) goto L15;
        if (r3 == 0) goto L131;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r9 = 0;
        r10 = 0;
        r12 = -3;
        r14 = 9;
        r15 = 7;
        goto L14
    L131:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r31 = this.gW;
        r31.FH = r3;
        r31.Hw += (long) (r2 - r31.DW);
        r31.DW = r2;
        this.rN = r6;
        return j6(r10);
    L15:
        int r32 = r4 & 16383;
        this.v5 = r32;
        int r111 = r32 & 31;
        if (r111 > 29) goto L126;
        int r33 = (r32 >> 5) & 31;
        if (r33 > 29) goto L126;
        int r112 = (r111 + 258) + r33;
        int[] r35 = this.VH;
        if (r35 != null) goto L23;
    L29:
        this.VH = new int[r112];
    L30:
        r4 = r4 >>> 14;
        r5 = r5 - 14;
        this.Zo = r9;
        this.FH = 4;
        goto L32
    L23:
        if (r35.length < r112) goto L29;
        int r36 = 0;
    L26:
        if (r36 >= r112) goto L30;
        this.VH[r36] = r9;
        r36 = r36 + 1;
    L126:
        this.FH = 9;
        abcd.Oy r37 = this.gW;
        r37.u7 = "too many length or distance symbols";
        this.j3 = r4;
        this.aM = r5;
        r37.FH = r3;
        r37.Hw += (long) (r2 - r37.DW);
        r37.DW = r2;
        this.rN = r6;
        return j6(-3);
    L32:
        if (this.Zo >= ((this.v5 >>> 10) + 4)) goto L33;
        int r38 = 3;
    L120:
        if (r5 >= r38) goto L121;
        if (r3 == 0) goto L124;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r38 = 3;
        r10 = 0;
        goto L120
    L124:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r39 = this.gW;
        r39.FH = r3;
        r39.Hw += (long) (r2 - r39.DW);
        r39.DW = r2;
        this.rN = r6;
        return j6(r10);
    L121:
        int[] r40 = this.VH;
        int[] r41 = DW;
        int r113 = this.Zo;
        this.Zo = r113 + 1;
        r40[r41[r113]] = r4 & 7;
        r4 = r4 >>> 3;
        r5 = r5 - 3;
        r9 = 0;
        r12 = -3;
        r14 = 9;
        r15 = 7;
    L33:
        int r42 = this.Zo;
        if (r42 >= 19) goto L35;
        int[] r43 = this.VH;
        int[] r114 = DW;
        this.Zo = r42 + 1;
        r43[r114[r42]] = 0;
        r9 = 0;
        r12 = -3;
        r14 = 9;
        r15 = 7;
        goto L33
    L35:
        int[] r44 = this.gn;
        r44[r9] = r15;
        int r45 = this.yS.j6(this.VH, r44, this.u7, this.Mr, this.gW);
        if (r45 != 0) goto L37;
        this.Zo = r9;
        this.FH = 5;
        goto L42
    L37:
        if (r45 != r12) goto L39;
        this.VH = null;
        this.FH = r14;
    L39:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r46 = this.gW;
        r46.FH = r3;
        r46.Hw += (long) (r2 - r46.DW);
        r46.DW = r2;
        this.rN = r6;
        return j6(r45);
    L42:
        int r47 = this.v5;
        if (this.Zo >= (((r47 & 31) + 258) + ((r47 >> 5) & 31))) goto L44;
        char r48 = 0;
        int r49 = this.gn[0];
    L77:
        if (r5 >= r49) goto L78;
        if (r3 == 0) goto L116;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r48 = 0;
        r10 = 0;
        goto L77
    L116:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r50 = this.gW;
        r50.FH = r3;
        r50.Hw += (long) (r2 - r50.DW);
        r50.DW = r2;
        this.rN = r6;
        return j6(r10);
    L78:
        int[] r115 = this.u7;
        int r116 = r115[r48];
        int[] r117 = this.Mr;
        int r118 = r115[r48];
        int[] r119 = j6;
        int r120 = r117[((r118 + (r119[r49] & r4)) * 3) + 1];
        int r51 = r117[((r115[r48] + (r119[r120] & r4)) * 3) + 2];
        if (r51 >= 16) goto L83;
        r4 = r4 >>> r120;
        r5 = r5 - r120;
        int[] r52 = this.VH;
        int r121 = this.Zo;
        this.Zo = r121 + 1;
        r52[r121] = r51;
    L81:
        r9 = 0;
        r14 = 9;
        goto L42
    L83:
        if (r51 != 18) goto L85;
        int r122 = 7;
    L87:
        if (r51 != 18) goto L89;
        int r123 = 11;
    L91:
        if (r5 >= (r120 + r122)) goto L92;
        if (r3 == 0) goto L111;
        r3 = r3 - 1;
        r4 = r4 | ((this.gW.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        r10 = 0;
        goto L91
    L111:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r53 = this.gW;
        r53.FH = r3;
        r53.Hw += (long) (r2 - r53.DW);
        r53.DW = r2;
        this.rN = r6;
        return j6(r10);
    L92:
        int r54 = r4 >>> r120;
        int r124 = r123 + (j6[r122] & r54);
        r4 = r54 >>> r122;
        r5 = (r5 - r120) - r122;
        int r55 = this.Zo;
        int r125 = this.v5;
        if ((r55 + r124) > (((r125 & 31) + 258) + ((r125 >> 5) & 31))) goto L106;
        if (r51 == 16) goto L97;
    L99:
        if (r51 != 16) goto L101;
        int r56 = this.VH[r55 - 1];
    L102:
        int r126 = r55 + 1;
        this.VH[r55] = r56;
        r124 = r124 - 1;
        if (r124 == 0) goto L104;
        r55 = r126;
        goto L102
    L104:
        this.Zo = r126;
        goto L81
    L101:
        r56 = 0;
        goto L102
    L97:
        if (r55 >= 1) goto L99;
    L106:
        this.VH = null;
        this.FH = 9;
        abcd.Oy r57 = this.gW;
        r57.u7 = "invalid bit length repeat";
        this.j3 = r4;
        this.aM = r5;
        r57.FH = r3;
        r57.Hw += (long) (r2 - r57.DW);
        r57.DW = r2;
        this.rN = r6;
        return j6(-3);
    L89:
        r123 = 3;
        goto L91
    L85:
        r122 = r51 - 14;
        goto L87
    L44:
        this.u7[r9] = -1;
        int[] r58 = this.tp;
        r58[r9] = r14;
        int[] r127 = this.EQ;
        r127[r9] = 6;
        int r59 = this.yS.j6((r47 & 31) + 257, ((r47 >> 5) & 31) + 1, this.VH, r58, r127, this.J8, this.Ws, this.Mr, this.gW);
        if (r59 != 0) goto L47;
        abcd.Jy r128 = this.QX;
        int r129 = this.tp[0];
        int r130 = this.EQ[0];
        int[] r131 = this.Mr;
        r128.j6(r129, r130, r131, this.J8[0], r131, this.Ws[0]);
        this.FH = 6;
        goto L52
    L47:
        if (r59 != (-3)) goto L49;
        this.VH = null;
        this.FH = 9;
    L49:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r60 = this.gW;
        r60.FH = r3;
        r60.Hw += (long) (r2 - r60.DW);
        r60.DW = r2;
        this.rN = r6;
        return j6(r59);
    L52:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r61 = this.gW;
        r61.FH = r3;
        r61.Hw += (long) (r2 - r61.DW);
        r61.DW = r2;
        this.rN = r6;
        int r62 = this.QX.j6(r10);
        if (r62 != 1) goto L55;
        this.QX.j6(this.gW);
        abcd.Oy r63 = this.gW;
        r2 = r63.DW;
        r3 = r63.FH;
        r4 = this.j3;
        r5 = this.aM;
        r6 = this.rN;
        int r64 = this.lg;
        if (r6 >= r64) goto L59;
        r8 = (r64 - r6) - 1;
    L61:
        if (this.XL != 0) goto L64;
        this.FH = 0;
    L63:
        r9 = 0;
        r10 = 0;
        goto L7
    L64:
        this.FH = 7;
        r10 = 0;
        goto L65
    L59:
        r8 = this.a8 - r6;
        goto L61
    L55:
        return j6(r62);
    L133:
        int r65 = 7;
        if (r3 == 0) goto L135;
        if (r8 != 0) goto L163;
        int r66 = this.a8;
        if (r6 != r66) goto L146;
        int r132 = this.lg;
        if (r132 == 0) goto L146;
        if (r132 <= 0) goto L144;
        r8 = (r132 + 0) - 1;
    L145:
        r6 = 0;
        goto L146
    L144:
        r8 = r66 + 0;
    L146:
        if (r8 != 0) goto L163;
        this.rN = r6;
        int r67 = j6(r10);
        int r68 = this.rN;
        int r69 = this.lg;
        if (r68 >= r69) goto L150;
        r8 = (r69 - r68) - 1;
    L151:
        int r70 = this.a8;
        if (r68 != r70) goto L159;
        int r133 = this.lg;
        if (r133 == 0) goto L159;
        if (r133 <= 0) goto L157;
        int r134 = (r133 + 0) - 1;
    L158:
        r8 = r134;
        r68 = 0;
        goto L159
    L157:
        r134 = r70 + 0;
    L159:
        if (r8 == 0) goto L160;
        r6 = r68;
        goto L163
    L160:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r71 = this.gW;
        r71.FH = r3;
        r71.Hw += (long) (r2 - r71.DW);
        r71.DW = r2;
        this.rN = r68;
        return j6(r67);
    L150:
        r8 = this.a8 - r68;
    L163:
        int r72 = this.Hw;
        if (r72 <= r3) goto L166;
        r72 = r3;
    L166:
        if (r72 <= r8) goto L168;
        r72 = r8;
    L168:
        java.lang.System.arraycopy(this.gW.j6, r2, this.U2, r6, r72);
        r2 = r2 + r72;
        r3 = r3 - r72;
        r6 = r6 + r72;
        r8 = r8 - r72;
        int r73 = this.Hw - r72;
        this.Hw = r73;
        if (r73 != 0) goto L63;
        if (this.XL != 0) goto L175;
        r65 = 0;
    L175:
        this.FH = r65;
        goto L63
    L135:
        this.j3 = r4;
        this.aM = r5;
        abcd.Oy r74 = this.gW;
        r74.FH = r3;
        r74.Hw += (long) (r2 - r74.DW);
        r74.DW = r2;
        this.rN = r6;
        return j6(r10);
    L5:
        r8 = this.a8 - r6;
        goto L6
    }

    void DW() {
        if (this.FH != 6) goto L5;
        this.QX.j6(this.gW);
    L5:
        this.FH = 0;
        this.aM = 0;
        this.j3 = 0;
        this.rN = 0;
        this.lg = 0;
        if (this.er == false) goto L9;
        this.gW.J0.reset();
        return;
    }

    int j6(int r11) {
        int r0 = this.gW.Zo;
        int r1 = this.lg;
        int r2 = this.rN;
        if (r1 <= r2) goto L6;
        r2 = this.a8;
    L6:
        int r3 = r2 - r1;
        int r4 = this.gW.VH;
        if (r3 <= r4) goto L10;
        r3 = r4;
    L10:
        if (r3 == 0) goto L13;
        if (r11 != (-5)) goto L13;
        r11 = 0;
    L13:
        abcd.Oy r5 = this.gW;
        r5.VH -= r3;
        r5.gn += (long) r3;
        if (this.er == false) goto L17;
        if (r3 <= 0) goto L17;
        r5.J0.update(this.U2, r1, r3);
    L17:
        java.lang.System.arraycopy(this.U2, r1, this.gW.v5, r0, r3);
        int r6 = r0 + r3;
        int r7 = r1 + r3;
        int r8 = this.a8;
        if (r7 == r8) goto L20;
    L33:
        this.gW.Zo = r6;
        this.lg = r7;
        return r11;
    L20:
        if (this.rN != r8) goto L22;
        this.rN = 0;
    L22:
        int r9 = this.rN - 0;
        int r10 = this.gW.VH;
        if (r9 <= r10) goto L25;
        r9 = r10;
    L25:
        if (r9 == 0) goto L28;
        if (r11 != (-5)) goto L28;
        r11 = 0;
    L28:
        abcd.Oy r12 = this.gW;
        r12.VH -= r9;
        r12.gn += (long) r9;
        if (this.er == false) goto L32;
        if (r9 <= 0) goto L32;
        r12.J0.update(this.U2, 0, r9);
    L32:
        java.lang.System.arraycopy(this.U2, 0, this.gW.v5, r6, r9);
        r6 = r6 + r9;
        r7 = r9 + 0;
        goto L33
    }

    void j6() {
        DW();
        this.U2 = null;
        this.Mr = null;
    }
}
