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
        abcd.Oy r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.Iy r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r11 = 0;
        int r9 = 0;
        int r14 = 0;
        abcd.Iy r10 = null;
        abcd.Oy r12 = null;
        abcd.Iy r13 = null;
        abcd.Oy r15 = null;
        abcd.Iy r16 = null;
        int r17 = 0;
        abcd.Iy r19 = null;
        int r20 = 0;
        int r21 = 0;
        abcd.Iy r22 = null;
        abcd.Oy r23 = null;
        abcd.Iy r24 = null;
        abcd.Oy r25 = null;
        int r110 = 0;
        int r111 = 0;
        int r112 = 0;
        int r26 = 0;
        int r113 = 0;
        int r27 = 0;
        abcd.Iy r28 = null;
        int r29 = 0;
        int r30 = 0;
        abcd.Iy r31 = null;
        abcd.Iy r32 = null;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        abcd.Iy r36 = null;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        abcd.Iy r40 = null;
        abcd.Oy r41 = null;
        abcd.Iy r42 = null;
        byte[] r43 = null;
        int r44 = 0;
        int r45 = 0;
        int r46 = 0;
        abcd.Iy r47 = null;
        abcd.Oy r48 = null;
        int r49 = 0;
        abcd.Iy r50 = null;
        abcd.Oy r51 = null;
        int r52 = 0;
        abcd.Iy r53 = null;
        abcd.Oy r54 = null;
        int r55 = 0;
        int[] r56 = null;
        int r114 = 0;
        int r115 = 0;
        abcd.Oy r57 = null;
        abcd.Iy r58 = null;
        abcd.Iy r59 = null;
        abcd.Oy r60 = null;
        abcd.Oy r61 = null;
        abcd.Iy r62 = null;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        int r67 = 0;
        int r68 = 0;
        abcd.Iy r69 = null;
        abcd.Oy r70 = null;
        int r71 = 0;
        int[] r72 = null;
        int r116 = 0;
        int r117 = 0;
        abcd.Oy r73 = null;
        abcd.Iy r74 = null;
        abcd.Iy r75 = null;
        int r76 = 0;
        int r77 = 0;
        abcd.Iy r78 = null;
        int r79 = 0;
        abcd.Iy r80 = null;
        int r81 = 0;
        int r82 = 0;
        int r83 = 0;
        abcd.Iy r84 = null;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        abcd.Iy r88 = null;
        abcd.Oy r89 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.QX;
                    r1 = r0.DW;
                    r2 = r0.FH;
                    r3 = this.XL;
                    r4 = r3.j3;
                    r5 = r3.aM;
                    r6 = r3.rN;
                    r7 = r3.lg;
                    if (r6 >= r7) { $pc0 = 5; continue $sw0; }
                    r8 = (r7 - r6) - 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r11 = 0;
                    r9 = r18;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r14 = 7;
                    switch(this.DW) {
                        case 0: { $pc0 = 121; continue $sw0; }
                        case 1: { $pc0 = 135; continue $sw0; }
                        case 2: { $pc0 = 99; continue $sw0; }
                        case 3: { $pc0 = 102; continue $sw0; }
                        case 4: { $pc0 = 54; continue $sw0; }
                        case 5: { $pc0 = 53; continue $sw0; }
                        case 6: { $pc0 = 26; continue $sw0; }
                        case 7: { $pc0 = 13; continue $sw0; }
                        case 8: { $pc0 = 24; continue $sw0; }
                        case 9: { $pc0 = 11; continue $sw0; }
                        default: { $pc0 = 9; continue $sw0; }
                    };
                }
                case 9: {
                    r10 = this.XL;
                    r10.j3 = r4;
                    r10.aM = r5;
                    r12 = this.QX;
                    r12.FH = r2;
                    r12.Hw += (long) (r1 - r12.DW);
                    r12.DW = r1;
                    r10.rN = r6;
                    return r10.j6(-2);
                }
                case 11: {
                    r13 = this.XL;
                    r13.j3 = r4;
                    r13.aM = r5;
                    r15 = this.QX;
                    r15.FH = r2;
                    r15.Hw += (long) (r1 - r15.DW);
                    r15.DW = r1;
                    r13.rN = r6;
                    return r13.j6(-3);
                }
                case 13: {
                    if (r5 <= 7) { $pc0 = 15; continue $sw0; }
                    r5 = r5 - 8;
                    r2 = r2 + 1;
                    r1 = r1 - 1;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r16 = this.XL;
                    r16.rN = r6;
                    r17 = r16.j6(r9);
                    r19 = this.XL;
                    r20 = r19.rN;
                    if (r20 < r19.lg) { $pc0 = 19; continue $sw0; }
                    r21 = r19.a8;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    r22 = this.XL;
                    if (r22.lg == r22.rN) { $pc0 = 23; continue $sw0; }
                    r22.j3 = r4;
                    r22.aM = r5;
                    r23 = this.QX;
                    r23.FH = r2;
                    r23.Hw += (long) (r1 - r23.DW);
                    r23.DW = r1;
                    r22.rN = r20;
                    return r22.j6(r17);
                }
                case 23: {
                    this.DW = 8;
                    r6 = r20;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    r24 = this.XL;
                    r24.j3 = r4;
                    r24.aM = r5;
                    r25 = this.QX;
                    r25.FH = r2;
                    r25.Hw += (long) (r1 - r25.DW);
                    r25.DW = r1;
                    r24.rN = r6;
                    return r24.j6(1);
                }
                case 53: {
                    r110 = r2;
                    r111 = r1;
                    r112 = r9;
                    r26 = r4;
                    r113 = r5;
                    r27 = r6 - this.u7;
                    $pc0 = 58; continue $sw0;
                }
                case 58: {
                    if (r27 >= 0) { $pc0 = 59; continue $sw0; }
                    r27 = r27 + this.XL.a8;
                    { $pc0 = 58; continue $sw0; }
                }
                case 59: {
                    r9 = r112;
                    $pc0 = 61; continue $sw0;
                }
                case 61: {
                    if (this.FH == 0) { $pc0 = 62; continue $sw0; }
                    if (r8 != 0) { $pc0 = 89; continue $sw0; }
                    r28 = this.XL;
                    r29 = r28.a8;
                    if (r6 != r29) { $pc0 = 72; continue $sw0; }
                    r30 = r28.lg;
                    if (r30 == 0) { $pc0 = 72; continue $sw0; }
                    if (r30 <= 0) { $pc0 = 70; continue $sw0; }
                    r8 = (r30 + 0) - 1;
                    $pc0 = 71; continue $sw0;
                }
                case 71: {
                    r6 = 0;
                    { $pc0 = 72; continue $sw0; }
                }
                case 70: {
                    r8 = r29 + 0;
                    $pc0 = 72; continue $sw0;
                }
                case 72: {
                    if (r8 != 0) { $pc0 = 89; continue $sw0; }
                    r31 = this.XL;
                    r31.rN = r6;
                    r9 = r31.j6(r9);
                    r32 = this.XL;
                    r33 = r32.rN;
                    r34 = r32.lg;
                    if (r33 >= r34) { $pc0 = 76; continue $sw0; }
                    r35 = (r34 - r33) - 1;
                    $pc0 = 77; continue $sw0;
                }
                case 77: {
                    r36 = this.XL;
                    r37 = r36.a8;
                    if (r33 != r37) { $pc0 = 85; continue $sw0; }
                    r38 = r36.lg;
                    if (r38 == 0) { $pc0 = 85; continue $sw0; }
                    if (r38 <= 0) { $pc0 = 83; continue $sw0; }
                    r39 = (r38 + 0) - 1;
                    $pc0 = 84; continue $sw0;
                }
                case 84: {
                    r8 = r39;
                    r6 = 0;
                    $pc0 = 86; continue $sw0;
                }
                case 86: {
                    if (r8 != 0) { $pc0 = 89; continue $sw0; }
                    r40 = this.XL;
                    r40.j3 = r26;
                    r40.aM = r113;
                    r41 = this.QX;
                    r41.FH = r110;
                    r41.Hw += (long) (r111 - r41.DW);
                    r41.DW = r111;
                    r40.rN = r6;
                    return r40.j6(r9);
                }
                case 83: {
                    r39 = r37 + 0;
                    $pc0 = 85; continue $sw0;
                }
                case 85: {
                    r6 = r33;
                    r8 = r35;
                    { $pc0 = 86; continue $sw0; }
                }
                case 76: {
                    r35 = r32.a8 - r33;
                    $pc0 = 89; continue $sw0;
                }
                case 89: {
                    r42 = this.XL;
                    r43 = r42.U2;
                    r44 = r6 + 1;
                    r45 = r27 + 1;
                    r43[r6] = r43[r27];
                    r8 = r8 - 1;
                    if (r45 != r42.a8) { $pc0 = 92; continue $sw0; }
                    r27 = 0;
                    $pc0 = 93; continue $sw0;
                }
                case 93: {
                    this.FH--;
                    r6 = r44;
                    { $pc0 = 61; continue $sw0; }
                }
                case 92: {
                    r27 = r45;
                    { $pc0 = 93; continue $sw0; }
                }
                case 62: {
                    this.DW = r11;
                    r4 = r26;
                    r5 = r113;
                    r1 = r111;
                    r2 = r110;
                    { $pc0 = 7; continue $sw0; }
                }
                case 54: {
                    r46 = this.gn;
                    $pc0 = 55; continue $sw0;
                }
                case 55: {
                    if (r5 >= r46) { $pc0 = 56; continue $sw0; }
                    if (r2 == 0) { $pc0 = 97; continue $sw0; }
                    r2 = r2 - 1;
                    r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
                    r5 = r5 + 8;
                    r1 = r1 + 1;
                    r9 = 0;
                    { $pc0 = 55; continue $sw0; }
                }
                case 97: {
                    r47 = this.XL;
                    r47.j3 = r4;
                    r47.aM = r5;
                    r48 = this.QX;
                    r48.FH = r2;
                    r48.Hw += (long) (r1 - r48.DW);
                    r48.DW = r1;
                    r47.rN = r6;
                    return r47.j6(r9);
                }
                case 56: {
                    this.u7 += j6[r46] & r4;
                    r4 = r4 >> r46;
                    r5 = r5 - r46;
                    this.DW = 5;
                    { $pc0 = 53; continue $sw0; }
                }
                case 99: {
                    r49 = this.gn;
                    $pc0 = 100; continue $sw0;
                }
                case 100: {
                    if (r5 >= r49) { $pc0 = 101; continue $sw0; }
                    if (r2 == 0) { $pc0 = 118; continue $sw0; }
                    r2 = r2 - 1;
                    r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
                    r5 = r5 + 8;
                    r1 = r1 + 1;
                    r9 = 0;
                    { $pc0 = 100; continue $sw0; }
                }
                case 118: {
                    r50 = this.XL;
                    r50.j3 = r4;
                    r50.aM = r5;
                    r51 = this.QX;
                    r51.FH = r2;
                    r51.Hw += (long) (r1 - r51.DW);
                    r51.DW = r1;
                    r50.rN = r6;
                    return r50.j6(r9);
                }
                case 101: {
                    this.FH += j6[r49] & r4;
                    r4 = r4 >> r49;
                    r5 = r5 - r49;
                    this.Zo = this.EQ;
                    this.Hw = this.J8;
                    this.v5 = this.Ws;
                    this.DW = 3;
                    $pc0 = 102; continue $sw0;
                }
                case 102: {
                    r52 = this.Zo;
                    $pc0 = 103; continue $sw0;
                }
                case 103: {
                    if (r5 >= r52) { $pc0 = 104; continue $sw0; }
                    if (r2 == 0) { $pc0 = 114; continue $sw0; }
                    r2 = r2 - 1;
                    r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
                    r5 = r5 + 8;
                    r1 = r1 + 1;
                    r9 = 0;
                    { $pc0 = 103; continue $sw0; }
                }
                case 114: {
                    r53 = this.XL;
                    r53.j3 = r4;
                    r53.aM = r5;
                    r54 = this.QX;
                    r54.FH = r2;
                    r54.Hw += (long) (r1 - r54.DW);
                    r54.DW = r1;
                    r53.rN = r6;
                    return r53.j6(r9);
                }
                case 104: {
                    r55 = (this.v5 + (j6[r52] & r4)) * 3;
                    r56 = this.Hw;
                    r114 = r55 + 1;
                    r4 = r4 >> r56[r114];
                    r5 = r5 - r56[r114];
                    r115 = r56[r55];
                    if ((r115 & 16) != 0) { $pc0 = 106; continue $sw0; }
                    if ((r115 & 64) != 0) { $pc0 = 110; continue $sw0; }
                    this.Zo = r115;
                    this.v5 = (r55 / 3) + r56[r55 + 2];
                    { $pc0 = 7; continue $sw0; }
                }
                case 110: {
                    this.DW = 9;
                    r57 = this.QX;
                    r57.u7 = "invalid distance code";
                    r58 = this.XL;
                    r58.j3 = r4;
                    r58.aM = r5;
                    r57.FH = r2;
                    r57.Hw += (long) (r1 - r57.DW);
                    r57.DW = r1;
                    r58.rN = r6;
                    return r58.j6(-3);
                }
                case 106: {
                    this.gn = r115 & 15;
                    this.u7 = r56[r55 + 2];
                    this.DW = 4;
                    { $pc0 = 7; continue $sw0; }
                }
                case 121: {
                    if (r8 < 258) { $pc0 = 134; continue $sw0; }
                    if (r2 < 10) { $pc0 = 134; continue $sw0; }
                    r59 = this.XL;
                    r59.j3 = r4;
                    r59.aM = r5;
                    r60 = this.QX;
                    r60.FH = r2;
                    r60.Hw += (long) (r1 - r60.DW);
                    r60.DW = r1;
                    r59.rN = r6;
                    r9 = j6(this.tp, this.EQ, this.we, this.J0, this.J8, this.Ws, r59, r60);
                    r61 = this.QX;
                    r1 = r61.DW;
                    r2 = r61.FH;
                    r62 = this.XL;
                    r63 = r62.j3;
                    r64 = r62.aM;
                    r65 = r62.rN;
                    r66 = r62.lg;
                    if (r65 >= r66) { $pc0 = 127; continue $sw0; }
                    r67 = (r66 - r65) - 1;
                    $pc0 = 128; continue $sw0;
                }
                case 128: {
                    if (r9 != 0) { $pc0 = 129; continue $sw0; }
                    r8 = r67;
                    r4 = r63;
                    r5 = r64;
                    r6 = r65;
                    { $pc0 = 134; continue $sw0; }
                }
                case 129: {
                    if (r9 == 1) { $pc0 = 132; continue $sw0; }
                    r14 = 9;
                    $pc0 = 132; continue $sw0;
                }
                case 132: {
                    this.DW = r14;
                    r11 = 0;
                    r8 = r67;
                    r4 = r63;
                    r5 = r64;
                    r6 = r65;
                    { $pc0 = 7; continue $sw0; }
                }
                case 127: {
                    r67 = r62.a8 - r65;
                    $pc0 = 134; continue $sw0;
                }
                case 134: {
                    this.Zo = this.tp;
                    this.Hw = this.we;
                    this.v5 = this.J0;
                    this.DW = 1;
                    $pc0 = 135; continue $sw0;
                }
                case 135: {
                    r68 = this.Zo;
                    $pc0 = 136; continue $sw0;
                }
                case 136: {
                    if (r5 >= r68) { $pc0 = 137; continue $sw0; }
                    if (r2 == 0) { $pc0 = 155; continue $sw0; }
                    r2 = r2 - 1;
                    r4 = r4 | ((this.QX.j6[r1] & 255) << r5);
                    r5 = r5 + 8;
                    r1 = r1 + 1;
                    r9 = 0;
                    { $pc0 = 136; continue $sw0; }
                }
                case 155: {
                    r69 = this.XL;
                    r69.j3 = r4;
                    r69.aM = r5;
                    r70 = this.QX;
                    r70.FH = r2;
                    r70.Hw += (long) (r1 - r70.DW);
                    r70.DW = r1;
                    r69.rN = r6;
                    return r69.j6(r9);
                }
                case 137: {
                    r71 = (this.v5 + (j6[r68] & r4)) * 3;
                    r72 = this.Hw;
                    r116 = r71 + 1;
                    r4 = r4 >>> r72[r116];
                    r5 = r5 - r72[r116];
                    r117 = r72[r71];
                    if (r117 != 0) { $pc0 = 141; continue $sw0; }
                    this.VH = r72[r71 + 2];
                    this.DW = 6;
                    $pc0 = 149; continue $sw0;
                }
                case 149: {
                    r11 = 0;
                    { $pc0 = 7; continue $sw0; }
                }
                case 141: {
                    if ((r117 & 16) == 0) { $pc0 = 144; continue $sw0; }
                    this.gn = r117 & 15;
                    this.FH = r72[r71 + 2];
                    this.DW = 2;
                    { $pc0 = 149; continue $sw0; }
                }
                case 144: {
                    if ((r117 & 64) != 0) { $pc0 = 147; continue $sw0; }
                    this.Zo = r117;
                    this.v5 = (r71 / 3) + r72[r71 + 2];
                    { $pc0 = 149; continue $sw0; }
                }
                case 147: {
                    if ((r117 & 32) == 0) { $pc0 = 150; continue $sw0; }
                    this.DW = 7;
                    { $pc0 = 149; continue $sw0; }
                }
                case 150: {
                    this.DW = 9;
                    r73 = this.QX;
                    r73.u7 = "invalid literal/length code";
                    r74 = this.XL;
                    r74.j3 = r4;
                    r74.aM = r5;
                    r73.FH = r2;
                    r73.Hw += (long) (r1 - r73.DW);
                    r73.DW = r1;
                    r74.rN = r6;
                    return r74.j6(-3);
                }
                case 26: {
                    if (r8 != 0) { $pc0 = 52; continue $sw0; }
                    r75 = this.XL;
                    r76 = r75.a8;
                    if (r6 != r76) { $pc0 = 35; continue $sw0; }
                    r77 = r75.lg;
                    if (r77 == 0) { $pc0 = 35; continue $sw0; }
                    if (r77 <= 0) { $pc0 = 33; continue $sw0; }
                    r8 = (r77 + 0) - 1;
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    r6 = 0;
                    { $pc0 = 35; continue $sw0; }
                }
                case 33: {
                    r8 = r76 + 0;
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    if (r8 != 0) { $pc0 = 52; continue $sw0; }
                    r78 = this.XL;
                    r78.rN = r6;
                    r79 = r78.j6(r9);
                    r80 = this.XL;
                    r81 = r80.rN;
                    r82 = r80.lg;
                    if (r81 >= r82) { $pc0 = 39; continue $sw0; }
                    r83 = (r82 - r81) - 1;
                    $pc0 = 40; continue $sw0;
                }
                case 40: {
                    r84 = this.XL;
                    r85 = r84.a8;
                    if (r81 != r85) { $pc0 = 48; continue $sw0; }
                    r86 = r84.lg;
                    if (r86 == 0) { $pc0 = 48; continue $sw0; }
                    if (r86 <= 0) { $pc0 = 46; continue $sw0; }
                    r87 = (r86 + 0) - 1;
                    $pc0 = 47; continue $sw0;
                }
                case 47: {
                    r8 = r87;
                    r6 = 0;
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    if (r8 != 0) { $pc0 = 52; continue $sw0; }
                    r88 = this.XL;
                    r88.j3 = r4;
                    r88.aM = r5;
                    r89 = this.QX;
                    r89.FH = r2;
                    r89.Hw += (long) (r1 - r89.DW);
                    r89.DW = r1;
                    r88.rN = r6;
                    return r88.j6(r79);
                }
                case 46: {
                    r87 = r85 + 0;
                    $pc0 = 48; continue $sw0;
                }
                case 48: {
                    r6 = r81;
                    r8 = r83;
                    { $pc0 = 49; continue $sw0; }
                }
                case 39: {
                    r83 = r80.a8 - r81;
                    $pc0 = 52; continue $sw0;
                }
                case 52: {
                    this.XL.U2[r6] = (byte) this.VH;
                    r8 = r8 - 1;
                    this.DW = r11;
                    r6 = r6 + 1;
                    r9 = 0;
                    { $pc0 = 7; continue $sw0; }
                }
                case 5: {
                    r8 = r3.a8 - r6;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(int r20, int r21, int[] r22, int r23, int[] r24, int r25, abcd.Iy r26, abcd.Oy r27) {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int[] r9 = null;
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
        int r110 = 0;
        int r111 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r112 = 0;
        int r113 = 0;
        int r34 = 0;
        int r35 = 0;
        int r114 = 0;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r39 = 0;
        int r40 = 0;
        byte[] r41 = null;
        int r42 = 0;
        int r123 = 0;
        int r43 = 0;
        int r44 = 0;
        byte[] r45 = null;
        int r46 = 0;
        int r124 = 0;
        byte[] r47 = null;
        byte[] r48 = null;
        int r49 = 0;
        int r50 = 0;
        int r51 = 0;
        byte[] r52 = null;
        int r125 = 0;
        int r126 = 0;
        byte[] r53 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = r27.DW;
                    r3 = r27.FH;
                    r4 = r26.j3;
                    r5 = r26.aM;
                    r6 = r26.rN;
                    r7 = r26.lg;
                    if (r6 >= r7) { $pc1 = 5; continue $sw1; }
                    r8 = (r7 - r6) - 1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r9 = j6;
                    r10 = r9[r20];
                    r11 = r9[r21];
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r5 >= 20) { $pc1 = 9; continue $sw1; }
                    r3 = r3 - 1;
                    r4 = r4 | ((r27.j6[r2] & 255) << r5);
                    r5 = r5 + 8;
                    r2 = r2 + 1;
                    { $pc1 = 8; continue $sw1; }
                }
                case 9: {
                    r12 = r4 & r10;
                    r13 = (r23 + r12) * 3;
                    r14 = r22[r13];
                    if (r14 != 0) { $pc1 = 13; continue $sw1; }
                    r15 = r13 + 1;
                    r4 = r4 >> r22[r15];
                    r5 = r5 - r22[r15];
                    r16 = r6 + 1;
                    r26.U2[r6] = (byte) r22[r13 + 2];
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r8 = r8 - 1;
                    r6 = r16;
                    $pc1 = 70; continue $sw1;
                }
                case 70: {
                    if (r8 < 258) { $pc1 = 73; continue $sw1; }
                    if (r3 >= 10) { $pc1 = 8; continue $sw1; }
                    $pc1 = 73; continue $sw1;
                }
                case 73: {
                    r17 = r27.FH - r3;
                    r18 = r5 >> 3;
                    if (r18 >= r17) { $pc1 = 76; continue $sw1; }
                    r17 = r18;
                    $pc1 = 76; continue $sw1;
                }
                case 76: {
                    r19 = r2 - r17;
                    r26.j3 = r4;
                    r26.aM = r5 - (r17 << 3);
                    r27.FH = r3 + r17;
                    r27.Hw += (long) (r19 - r27.DW);
                    r27.DW = r19;
                    r26.rN = r6;
                    return 0;
                }
                case 13: {
                    r110 = r13 + 1;
                    r4 = r4 >> r22[r110];
                    r5 = r5 - r22[r110];
                    if ((r14 & 16) != 0) { $pc1 = 15; continue $sw1; }
                    if ((r14 & 64) != 0) { $pc1 = 79; continue $sw1; }
                    r12 = (r12 + r22[r13 + 2]) + (j6[r14] & r4);
                    r13 = (r23 + r12) * 3;
                    r14 = r22[r13];
                    if (r14 != 0) { $pc1 = 13; continue $sw1; }
                    r111 = r13 + 1;
                    r4 = r4 >> r22[r111];
                    r5 = r5 - r22[r111];
                    r16 = r6 + 1;
                    r26.U2[r6] = (byte) r22[r13 + 2];
                    { $pc1 = 12; continue $sw1; }
                }
                case 79: {
                    if ((r14 & 32) == 0) { $pc1 = 85; continue $sw1; }
                    r28 = r27.FH - r3;
                    r29 = r5 >> 3;
                    if (r29 >= r28) { $pc1 = 83; continue $sw1; }
                    r28 = r29;
                    $pc1 = 83; continue $sw1;
                }
                case 83: {
                    r30 = r2 - r28;
                    r26.j3 = r4;
                    r26.aM = r5 - (r28 << 3);
                    r27.FH = r3 + r28;
                    r27.Hw += (long) (r30 - r27.DW);
                    r27.DW = r30;
                    r26.rN = r6;
                    return 1;
                }
                case 85: {
                    r27.u7 = "invalid literal/length code";
                    r31 = r27.FH - r3;
                    r32 = r5 >> 3;
                    if (r32 >= r31) { $pc1 = 88; continue $sw1; }
                    r31 = r32;
                    $pc1 = 88; continue $sw1;
                }
                case 88: {
                    r33 = r2 - r31;
                    r26.j3 = r4;
                    r26.aM = r5 - (r31 << 3);
                    r27.FH = r3 + r31;
                    r27.Hw += (long) (r33 - r27.DW);
                    r27.DW = r33;
                    r26.rN = r6;
                    return -3;
                }
                case 15: {
                    r112 = r14 & 15;
                    r113 = r22[r13 + 2] + (j6[r112] & r4);
                    r34 = r4 >> r112;
                    r35 = r5 - r112;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r35 >= 15) { $pc1 = 18; continue $sw1; }
                    r3 = r3 - 1;
                    r34 = r34 | ((r27.j6[r2] & 255) << r35);
                    r35 = r35 + 8;
                    r2 = r2 + 1;
                    { $pc1 = 17; continue $sw1; }
                }
                case 18: {
                    r114 = r34 & r11;
                    r115 = (r25 + r114) * 3;
                    r116 = r24[r115];
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    r117 = r115 + 1;
                    r34 = r34 >> r24[r117];
                    r35 = r35 - r24[r117];
                    if ((r116 & 16) != 0) { $pc1 = 21; continue $sw1; }
                    if ((r116 & 64) != 0) { $pc1 = 58; continue $sw1; }
                    r114 = (r114 + r24[r115 + 2]) + (j6[r116] & r34);
                    r115 = (r25 + r114) * 3;
                    r116 = r24[r115];
                    { $pc1 = 19; continue $sw1; }
                }
                case 58: {
                    r27.u7 = "invalid distance code";
                    r36 = r27.FH - r3;
                    r37 = r35 >> 3;
                    if (r37 >= r36) { $pc1 = 61; continue $sw1; }
                    r36 = r37;
                    $pc1 = 61; continue $sw1;
                }
                case 61: {
                    r38 = r2 - r36;
                    r26.j3 = r34;
                    r26.aM = r35 - (r36 << 3);
                    r27.FH = r3 + r36;
                    r27.Hw += (long) (r38 - r27.DW);
                    r27.DW = r38;
                    r26.rN = r6;
                    return -3;
                }
                case 21: {
                    r118 = r116 & 15;
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    if (r35 >= r118) { $pc1 = 23; continue $sw1; }
                    r3 = r3 - 1;
                    r34 = r34 | ((r27.j6[r2] & 255) << r35);
                    r35 = r35 + 8;
                    r2 = r2 + 1;
                    { $pc1 = 22; continue $sw1; }
                }
                case 23: {
                    r119 = r24[r115 + 2] + (j6[r118] & r34);
                    r120 = r34 >> r118;
                    r121 = r35 - r118;
                    r122 = r8 - r113;
                    if (r6 < r119) { $pc1 = 31; continue $sw1; }
                    r39 = r6 - r119;
                    r40 = r6 - r39;
                    if (r40 <= 0) { $pc1 = 29; continue $sw1; }
                    if (2 <= r40) { $pc1 = 29; continue $sw1; }
                    r41 = r26.U2;
                    r42 = r6 + 1;
                    r123 = r39 + 1;
                    r41[r6] = r41[r39];
                    r6 = r42 + 1;
                    r43 = r123 + 1;
                    r41[r42] = r41[r123];
                    $pc1 = 30; continue $sw1;
                }
                case 30: {
                    r113 = r113 - 2;
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    r44 = r6 - r43;
                    if (r44 <= 0) { $pc1 = 52; continue $sw1; }
                    if (r113 <= r44) { $pc1 = 52; continue $sw1; }
                    $pc1 = 48; continue $sw1;
                }
                case 48: {
                    r45 = r26.U2;
                    r46 = r6 + 1;
                    r124 = r43 + 1;
                    r45[r6] = r45[r43];
                    r113 = r113 - 1;
                    if (r113 == 0) { $pc1 = 50; continue $sw1; }
                    r6 = r46;
                    r43 = r124;
                    { $pc1 = 48; continue $sw1; }
                }
                case 50: {
                    r6 = r46;
                    $pc1 = 53; continue $sw1;
                }
                case 53: {
                    r4 = r120;
                    r5 = r121;
                    r8 = r122;
                    $pc1 = 52; continue $sw1;
                }
                case 52: {
                    r47 = r26.U2;
                    java.lang.System.arraycopy(r47, r43, r47, r6, r113);
                    r6 = r6 + r113;
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    r48 = r26.U2;
                    java.lang.System.arraycopy(r48, r39, r48, r6, 2);
                    r6 = r6 + 2;
                    r43 = r39 + 2;
                    { $pc1 = 30; continue $sw1; }
                }
                case 31: {
                    r43 = r6 - r119;
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r49 = r26.a8;
                    r43 = r43 + r49;
                    if (r43 < 0) { $pc1 = 32; continue $sw1; }
                    r50 = r49 - r43;
                    if (r113 <= r50) { $pc1 = 45; continue $sw1; }
                    r113 = r113 - r50;
                    r51 = r6 - r43;
                    if (r51 <= 0) { $pc1 = 43; continue $sw1; }
                    if (r50 <= r51) { $pc1 = 43; continue $sw1; }
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    r52 = r26.U2;
                    r125 = r6 + 1;
                    r126 = r43 + 1;
                    r52[r6] = r52[r43];
                    r50 = r50 - 1;
                    if (r50 == 0) { $pc1 = 41; continue $sw1; }
                    r6 = r125;
                    r43 = r126;
                    { $pc1 = 39; continue $sw1; }
                }
                case 41: {
                    r6 = r125;
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    r43 = 0;
                    $pc1 = 43; continue $sw1;
                }
                case 43: {
                    r53 = r26.U2;
                    java.lang.System.arraycopy(r53, r43, r53, r6, r50);
                    r6 = r6 + r50;
                    { $pc1 = 44; continue $sw1; }
                }
                case 5: {
                    r8 = r26.a8 - r6;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
