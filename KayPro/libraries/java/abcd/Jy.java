package abcd;

final class Jy {
    private static final int[] j6 = null;
    int DW;
    byte EQ;
    int FH;
    int[] Hw;
    int J0;
    int[] J8;
    private final abcd.Oy QX;
    int VH;
    int Ws;
    private final abcd.Iy XL;
    int Zo;
    int gn;
    byte tp;
    int u7;
    int v5;
    int[] we;

    static {
        j6 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    }

    Jy(abcd.Oy r2, abcd.Iy r3) {
        this.v5 = 0;
        this.QX = r2;
        this.XL = r3;
    }

    int j6(int r18) {
        abcd.Oy r0 = this.QX;
        int r1 = r0.DW;
        int r2 = r0.FH;
        abcd.Iy r3 = this.XL;
        int r4 = r3.j3;
        int r5 = r3.aM;
        int r6 = r3.rN;
        int r7 = r3.lg;
        if (r6 >= r7) goto L5;
        int r8 = (r7 - r6) - 1;
    L6:
        int r11 = 0;
        int r9 = r18;
    L7:
        int r14 = 7;
        switch(this.DW) {
            case 0: goto L121;
            case 1: goto L135;
            case 2: goto L99;
            case 3: goto L102;
            case 4: goto L54;
            case 5: goto L53;
            case 6: goto L26;
            case 7: goto L13;
            case 8: goto L24;
            case 9: goto L11;
            default: goto L9;
        };
    L9:
        abcd.Iy r10 = this.XL;
        r10.j3 = r4;
        r10.aM = r5;
        abcd.Oy r12 = this.QX;
        r12.FH = r2;
        r12.Hw += (long) (r1 - r12.DW);
        r12.DW = r1;
        r10.rN = r6;
        return r10.j6(-2);
    L11:
        abcd.Iy r13 = this.XL;
        r13.j3 = r4;
        r13.aM = r5;
        abcd.Oy r15 = this.QX;
        r15.FH = r2;
        r15.Hw += (long) (r1 - r15.DW);
        r15.DW = r1;
        r13.rN = r6;
        return r13.j6(-3);
    L13:
        if (r5 <= 7) goto L15;
        r5 = r5 - 8;
        r2 = r2 + 1;
        r1 = r1 - 1;
    L15:
        abcd.Iy r16 = this.XL;
        r16.rN = r6;
        int r17 = r16.j6(r9);
        abcd.Iy r19 = this.XL;
        int r20 = r19.rN;
        if (r20 < r19.lg) goto L19;
        int r21 = r19.a8;
    L19:
        abcd.Iy r22 = this.XL;
        if (r22.lg == r22.rN) goto L23;
        r22.j3 = r4;
        r22.aM = r5;
        abcd.Oy r23 = this.QX;
        r23.FH = r2;
        r23.Hw += (long) (r1 - r23.DW);
        r23.DW = r1;
        r22.rN = r20;
        return r22.j6(r17);
    L23:
        this.DW = 8;
        r6 = r20;
    L24:
        abcd.Iy r24 = this.XL;
        r24.j3 = r4;
        r24.aM = r5;
        abcd.Oy r25 = this.QX;
        r25.FH = r2;
        r25.Hw += (long) (r1 - r25.DW);
        r25.DW = r1;
        r24.rN = r6;
        return r24.j6(1);
    L53:
        int r110 = r2;
        int r111 = r1;
        int r112 = r9;
        int r26 = r4;
        int r113 = r5;
        int r27 = r6 - this.u7;
    L58:
        if (r27 >= 0) goto L59;
        r27 = r27 + this.XL.a8;
        goto L58
    L59:
        r9 = r112;
    L61:
        if (this.FH == 0) goto L62;
        if (r8 != 0) goto L89;
        abcd.Iy r28 = this.XL;
        int r29 = r28.a8;
        if (r6 != r29) goto L72;
        int r30 = r28.lg;
        if (r30 == 0) goto L72;
        if (r30 <= 0) goto L70;
        r8 = (r30 + 0) - 1;
    L71:
        r6 = 0;
        goto L72
    L70:
        r8 = r29 + 0;
    L72:
        if (r8 != 0) goto L89;
        abcd.Iy r31 = this.XL;
        r31.rN = r6;
        r9 = r31.j6(r9);
        abcd.Iy r32 = this.XL;
        int r33 = r32.rN;
        int r34 = r32.lg;
        if (r33 >= r34) goto L76;
        int r35 = (r34 - r33) - 1;
    L77:
        abcd.Iy r36 = this.XL;
        int r37 = r36.a8;
        if (r33 != r37) goto L85;
        int r38 = r36.lg;
        if (r38 == 0) goto L85;
        if (r38 <= 0) goto L83;
        int r39 = (r38 + 0) - 1;
    L84:
        r8 = r39;
        r6 = 0;
    L86:
        if (r8 != 0) goto L89;
        abcd.Iy r40 = this.XL;
        r40.j3 = r26;
        r40.aM = r113;
        abcd.Oy r41 = this.QX;
        r41.FH = r110;
        r41.Hw += (long) (r111 - r41.DW);
        r41.DW = r111;
        r40.rN = r6;
        return r40.j6(r9);
    L83:
        r39 = r37 + 0;
    L85:
        r6 = r33;
        r8 = r35;
        goto L86
    L76:
        r35 = r32.a8 - r33;
    L89:
        abcd.Iy r42 = this.XL;
        byte[] r43 = r42.U2;
        int r44 = r6 + 1;
        int r45 = r27 + 1;
        r43[r6] = r43[r27];
        r8 = r8 - 1;
        if (r45 != r42.a8) goto L92;
        r27 = 0;
    L93:
        this.FH--;
        r6 = r44;
        goto L61
    L92:
        r27 = r45;
        goto L93
    L62:
        this.DW = r11;
        r4 = r26;
        r5 = r113;
        r1 = r111;
        r2 = r110;
        goto L7
    L54:
        int r46 = this.gn;
    L55:
        if (r5 >= r46) goto L56;
        if (r2 == 0) goto L97;
        r2 = r2 - 1;
        r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
        r5 = r5 + 8;
        r1 = r1 + 1;
        r9 = 0;
        goto L55
    L97:
        abcd.Iy r47 = this.XL;
        r47.j3 = r4;
        r47.aM = r5;
        abcd.Oy r48 = this.QX;
        r48.FH = r2;
        r48.Hw += (long) (r1 - r48.DW);
        r48.DW = r1;
        r47.rN = r6;
        return r47.j6(r9);
    L56:
        this.u7 += j6[r46] & r4;
        r4 = r4 >> r46;
        r5 = r5 - r46;
        this.DW = 5;
        goto L53
    L99:
        int r49 = this.gn;
    L100:
        if (r5 >= r49) goto L101;
        if (r2 == 0) goto L118;
        r2 = r2 - 1;
        r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
        r5 = r5 + 8;
        r1 = r1 + 1;
        r9 = 0;
        goto L100
    L118:
        abcd.Iy r50 = this.XL;
        r50.j3 = r4;
        r50.aM = r5;
        abcd.Oy r51 = this.QX;
        r51.FH = r2;
        r51.Hw += (long) (r1 - r51.DW);
        r51.DW = r1;
        r50.rN = r6;
        return r50.j6(r9);
    L101:
        this.FH += j6[r49] & r4;
        r4 = r4 >> r49;
        r5 = r5 - r49;
        this.Zo = this.EQ;
        this.Hw = this.J8;
        this.v5 = this.Ws;
        this.DW = 3;
    L102:
        int r52 = this.Zo;
    L103:
        if (r5 >= r52) goto L104;
        if (r2 == 0) goto L114;
        r2 = r2 - 1;
        r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
        r5 = r5 + 8;
        r1 = r1 + 1;
        r9 = 0;
        goto L103
    L114:
        abcd.Iy r53 = this.XL;
        r53.j3 = r4;
        r53.aM = r5;
        abcd.Oy r54 = this.QX;
        r54.FH = r2;
        r54.Hw += (long) (r1 - r54.DW);
        r54.DW = r1;
        r53.rN = r6;
        return r53.j6(r9);
    L104:
        int r55 = (this.v5 + (j6[r52] & r4)) * 3;
        int[] r56 = this.Hw;
        int r114 = r55 + 1;
        r4 = r4 >> r56[r114];
        r5 = r5 - r56[r114];
        int r115 = r56[r55];
        if ((r115 & 16) != 0) goto L106;
        if ((r115 & 64) != 0) goto L110;
        this.Zo = r115;
        this.v5 = (r55 / 3) + r56[r55 + 2];
        goto L7
    L110:
        this.DW = 9;
        abcd.Oy r57 = this.QX;
        r57.u7 = "invalid distance code";
        abcd.Iy r58 = this.XL;
        r58.j3 = r4;
        r58.aM = r5;
        r57.FH = r2;
        r57.Hw += (long) (r1 - r57.DW);
        r57.DW = r1;
        r58.rN = r6;
        return r58.j6(-3);
    L106:
        this.gn = r115 & 15;
        this.u7 = r56[r55 + 2];
        this.DW = 4;
        goto L7
    L121:
        if (r8 < 258) goto L134;
        if (r2 < 10) goto L134;
        abcd.Iy r59 = this.XL;
        r59.j3 = r4;
        r59.aM = r5;
        abcd.Oy r60 = this.QX;
        r60.FH = r2;
        r60.Hw += (long) (r1 - r60.DW);
        r60.DW = r1;
        r59.rN = r6;
        r9 = j6(this.tp, this.EQ, this.we, this.J0, this.J8, this.Ws, r59, r60);
        abcd.Oy r61 = this.QX;
        r1 = r61.DW;
        r2 = r61.FH;
        abcd.Iy r62 = this.XL;
        int r63 = r62.j3;
        int r64 = r62.aM;
        int r65 = r62.rN;
        int r66 = r62.lg;
        if (r65 >= r66) goto L127;
        int r67 = (r66 - r65) - 1;
    L128:
        if (r9 != 0) goto L129;
        r8 = r67;
        r4 = r63;
        r5 = r64;
        r6 = r65;
        goto L134
    L129:
        if (r9 == 1) goto L132;
        r14 = 9;
    L132:
        this.DW = r14;
        r11 = 0;
        r8 = r67;
        r4 = r63;
        r5 = r64;
        r6 = r65;
        goto L7
    L127:
        r67 = r62.a8 - r65;
    L134:
        this.Zo = this.tp;
        this.Hw = this.we;
        this.v5 = this.J0;
        this.DW = 1;
    L135:
        int r68 = this.Zo;
    L136:
        if (r5 >= r68) goto L137;
        if (r2 == 0) goto L155;
        r2 = r2 - 1;
        r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
        r5 = r5 + 8;
        r1 = r1 + 1;
        r9 = 0;
        goto L136
    L155:
        abcd.Iy r69 = this.XL;
        r69.j3 = r4;
        r69.aM = r5;
        abcd.Oy r70 = this.QX;
        r70.FH = r2;
        r70.Hw += (long) (r1 - r70.DW);
        r70.DW = r1;
        r69.rN = r6;
        return r69.j6(r9);
    L137:
        int r71 = (this.v5 + (j6[r68] & r4)) * 3;
        int[] r72 = this.Hw;
        int r116 = r71 + 1;
        r4 = r4 >>> r72[r116];
        r5 = r5 - r72[r116];
        int r117 = r72[r71];
        if (r117 != 0) goto L141;
        this.VH = r72[r71 + 2];
        this.DW = 6;
    L149:
        r11 = 0;
        goto L7
    L141:
        if ((r117 & 16) == 0) goto L144;
        this.gn = r117 & 15;
        this.FH = r72[r71 + 2];
        this.DW = 2;
        goto L149
    L144:
        if ((r117 & 64) != 0) goto L147;
        this.Zo = r117;
        this.v5 = (r71 / 3) + r72[r71 + 2];
        goto L149
    L147:
        if ((r117 & 32) == 0) goto L150;
        this.DW = 7;
        goto L149
    L150:
        this.DW = 9;
        abcd.Oy r73 = this.QX;
        r73.u7 = "invalid literal/length code";
        abcd.Iy r74 = this.XL;
        r74.j3 = r4;
        r74.aM = r5;
        r73.FH = r2;
        r73.Hw += (long) (r1 - r73.DW);
        r73.DW = r1;
        r74.rN = r6;
        return r74.j6(-3);
    L26:
        if (r8 != 0) goto L52;
        abcd.Iy r75 = this.XL;
        int r76 = r75.a8;
        if (r6 != r76) goto L35;
        int r77 = r75.lg;
        if (r77 == 0) goto L35;
        if (r77 <= 0) goto L33;
        r8 = (r77 + 0) - 1;
    L34:
        r6 = 0;
        goto L35
    L33:
        r8 = r76 + 0;
    L35:
        if (r8 != 0) goto L52;
        abcd.Iy r78 = this.XL;
        r78.rN = r6;
        int r79 = r78.j6(r9);
        abcd.Iy r80 = this.XL;
        int r81 = r80.rN;
        int r82 = r80.lg;
        if (r81 >= r82) goto L39;
        int r83 = (r82 - r81) - 1;
    L40:
        abcd.Iy r84 = this.XL;
        int r85 = r84.a8;
        if (r81 != r85) goto L48;
        int r86 = r84.lg;
        if (r86 == 0) goto L48;
        if (r86 <= 0) goto L46;
        int r87 = (r86 + 0) - 1;
    L47:
        r8 = r87;
        r6 = 0;
    L49:
        if (r8 != 0) goto L52;
        abcd.Iy r88 = this.XL;
        r88.j3 = r4;
        r88.aM = r5;
        abcd.Oy r89 = this.QX;
        r89.FH = r2;
        r89.Hw += (long) (r1 - r89.DW);
        r89.DW = r1;
        r88.rN = r6;
        return r88.j6(r79);
    L46:
        r87 = r85 + 0;
    L48:
        r6 = r81;
        r8 = r83;
        goto L49
    L39:
        r83 = r80.a8 - r81;
    L52:
        this.XL.U2[r6] = (byte) this.VH;
        r8 = r8 - 1;
        this.DW = r11;
        r6 = r6 + 1;
        r9 = 0;
        goto L7
    L5:
        r8 = r3.a8 - r6;
        goto L6
    }

    int j6(int r20, int r21, int[] r22, int r23, int[] r24, int r25, abcd.Iy r26, abcd.Oy r27) {
        int r2 = r27.DW;
        int r3 = r27.FH;
        int r4 = r26.j3;
        int r5 = r26.aM;
        int r6 = r26.rN;
        int r7 = r26.lg;
        if (r6 >= r7) goto L5;
        int r8 = (r7 - r6) - 1;
    L6:
        int[] r9 = j6;
        int r10 = r9[r20];
        int r11 = r9[r21];
    L8:
        if (r5 >= 20) goto L9;
        r3 = r3 - 1;
        r4 = r4 | ((r27.j6[r2] & 255) << r5);
        r5 = r5 + 8;
        r2 = r2 + 1;
        goto L8
    L9:
        int r12 = r4 & r10;
        int r13 = (r23 + r12) * 3;
        int r14 = r22[r13];
        if (r14 != 0) goto L13;
        int r15 = r13 + 1;
        r4 = r4 >> r22[r15];
        r5 = r5 - r22[r15];
        int r16 = r6 + 1;
        r26.U2[r6] = (byte) r22[r13 + 2];
    L12:
        r8 = r8 - 1;
        r6 = r16;
    L70:
        if (r8 < 258) goto L73;
        if (r3 >= 10) goto L8;
    L73:
        int r17 = r27.FH - r3;
        int r18 = r5 >> 3;
        if (r18 >= r17) goto L76;
        r17 = r18;
    L76:
        int r19 = r2 - r17;
        r26.j3 = r4;
        r26.aM = r5 - (r17 << 3);
        r27.FH = r3 + r17;
        r27.Hw += (long) (r19 - r27.DW);
        r27.DW = r19;
        r26.rN = r6;
        return 0;
    L13:
        int r110 = r13 + 1;
        r4 = r4 >> r22[r110];
        r5 = r5 - r22[r110];
        if ((r14 & 16) != 0) goto L15;
        if ((r14 & 64) != 0) goto L79;
        r12 = (r12 + r22[r13 + 2]) + (j6[r14] & r4);
        r13 = (r23 + r12) * 3;
        r14 = r22[r13];
        if (r14 != 0) goto L13;
        int r111 = r13 + 1;
        r4 = r4 >> r22[r111];
        r5 = r5 - r22[r111];
        r16 = r6 + 1;
        r26.U2[r6] = (byte) r22[r13 + 2];
        goto L12
    L79:
        if ((r14 & 32) == 0) goto L85;
        int r28 = r27.FH - r3;
        int r29 = r5 >> 3;
        if (r29 >= r28) goto L83;
        r28 = r29;
    L83:
        int r30 = r2 - r28;
        r26.j3 = r4;
        r26.aM = r5 - (r28 << 3);
        r27.FH = r3 + r28;
        r27.Hw += (long) (r30 - r27.DW);
        r27.DW = r30;
        r26.rN = r6;
        return 1;
    L85:
        r27.u7 = "invalid literal/length code";
        int r31 = r27.FH - r3;
        int r32 = r5 >> 3;
        if (r32 >= r31) goto L88;
        r31 = r32;
    L88:
        int r33 = r2 - r31;
        r26.j3 = r4;
        r26.aM = r5 - (r31 << 3);
        r27.FH = r3 + r31;
        r27.Hw += (long) (r33 - r27.DW);
        r27.DW = r33;
        r26.rN = r6;
        return -3;
    L15:
        int r112 = r14 & 15;
        int r113 = r22[r13 + 2] + (j6[r112] & r4);
        int r34 = r4 >> r112;
        int r35 = r5 - r112;
    L17:
        if (r35 >= 15) goto L18;
        r3 = r3 - 1;
        r34 = r34 | ((r27.j6[r2] & 255) << r35);
        r35 = r35 + 8;
        r2 = r2 + 1;
        goto L17
    L18:
        int r114 = r34 & r11;
        int r115 = (r25 + r114) * 3;
        int r116 = r24[r115];
    L19:
        int r117 = r115 + 1;
        r34 = r34 >> r24[r117];
        r35 = r35 - r24[r117];
        if ((r116 & 16) != 0) goto L21;
        if ((r116 & 64) != 0) goto L58;
        r114 = (r114 + r24[r115 + 2]) + (j6[r116] & r34);
        r115 = (r25 + r114) * 3;
        r116 = r24[r115];
        goto L19
    L58:
        r27.u7 = "invalid distance code";
        int r36 = r27.FH - r3;
        int r37 = r35 >> 3;
        if (r37 >= r36) goto L61;
        r36 = r37;
    L61:
        int r38 = r2 - r36;
        r26.j3 = r34;
        r26.aM = r35 - (r36 << 3);
        r27.FH = r3 + r36;
        r27.Hw += (long) (r38 - r27.DW);
        r27.DW = r38;
        r26.rN = r6;
        return -3;
    L21:
        int r118 = r116 & 15;
    L22:
        if (r35 >= r118) goto L23;
        r3 = r3 - 1;
        r34 = r34 | ((r27.j6[r2] & 255) << r35);
        r35 = r35 + 8;
        r2 = r2 + 1;
        goto L22
    L23:
        int r119 = r24[r115 + 2] + (j6[r118] & r34);
        int r120 = r34 >> r118;
        int r121 = r35 - r118;
        int r122 = r8 - r113;
        if (r6 < r119) goto L31;
        int r39 = r6 - r119;
        int r40 = r6 - r39;
        if (r40 <= 0) goto L29;
        if (2 <= r40) goto L29;
        byte[] r41 = r26.U2;
        int r42 = r6 + 1;
        int r123 = r39 + 1;
        r41[r6] = r41[r39];
        r6 = r42 + 1;
        int r43 = r123 + 1;
        r41[r42] = r41[r123];
    L30:
        r113 = r113 - 2;
    L45:
        int r44 = r6 - r43;
        if (r44 <= 0) goto L52;
        if (r113 <= r44) goto L52;
    L48:
        byte[] r45 = r26.U2;
        int r46 = r6 + 1;
        int r124 = r43 + 1;
        r45[r6] = r45[r43];
        r113 = r113 - 1;
        if (r113 == 0) goto L50;
        r6 = r46;
        r43 = r124;
        goto L48
    L50:
        r6 = r46;
    L53:
        r4 = r120;
        r5 = r121;
        r8 = r122;
    L52:
        byte[] r47 = r26.U2;
        java.lang.System.arraycopy(r47, r43, r47, r6, r113);
        r6 = r6 + r113;
    L29:
        byte[] r48 = r26.U2;
        java.lang.System.arraycopy(r48, r39, r48, r6, 2);
        r6 = r6 + 2;
        r43 = r39 + 2;
        goto L30
    L31:
        r43 = r6 - r119;
    L32:
        int r49 = r26.a8;
        r43 = r43 + r49;
        if (r43 < 0) goto L32;
        int r50 = r49 - r43;
        if (r113 <= r50) goto L45;
        r113 = r113 - r50;
        int r51 = r6 - r43;
        if (r51 <= 0) goto L43;
        if (r50 <= r51) goto L43;
    L39:
        byte[] r52 = r26.U2;
        int r125 = r6 + 1;
        int r126 = r43 + 1;
        r52[r6] = r52[r43];
        r50 = r50 - 1;
        if (r50 == 0) goto L41;
        r6 = r125;
        r43 = r126;
        goto L39
    L41:
        r6 = r125;
    L44:
        r43 = 0;
    L43:
        byte[] r53 = r26.U2;
        java.lang.System.arraycopy(r53, r43, r53, r6, r50);
        r6 = r6 + r50;
        goto L44
    L5:
        r8 = r26.a8 - r6;
        goto L6
    }

    void j6(int r2, int r3, int[] r4, int r5, int[] r6, int r7) {
        this.DW = 0;
        this.tp = (byte) r2;
        this.EQ = (byte) r3;
        this.we = r4;
        this.J0 = r5;
        this.J8 = r6;
        this.Ws = r7;
        this.Hw = null;
    }

    void j6(abcd.Oy r1) {
    }
}
