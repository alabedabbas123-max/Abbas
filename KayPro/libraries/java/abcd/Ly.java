package abcd;

final class Ly {
    private static byte[] j6;
    int DW;
    private int EQ;
    int FH;
    long Hw;
    private byte[] J0;
    abcd.Hy J8;
    int VH;
    private java.io.ByteArrayOutputStream Ws;
    int Zo;
    int gn;
    private final abcd.Oy tp;
    abcd.Iy u7;
    long v5;
    private int we;

    class a extends java.lang.Exception {
        final abcd.Ly DW;
        int j6;

        a(abcd.Ly r1, int r2) {
            this.DW = r1;
            this.j6 = r2;
        }
    }

    static {
        j6 = new byte[]{0, 0, -1, -1};
    }

    Ly(abcd.Oy r3) {
        this.Hw = -1;
        this.we = -1;
        this.J0 = new byte[4];
        this.J8 = null;
        this.Ws = null;
        this.tp = r3;
    }

    private int DW(int r6, int r7) {
        abcd.Oy r0 = null;
        int r1 = 0;
        byte[] r8 = null;
        int r2 = 0;
        byte r3 = 0;
        abcd.Oy r9 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.Ws != null) { $pc0 = 5; continue $sw0; }
                    this.Ws = new java.io.ByteArrayOutputStream();
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r0 = this.tp;
                    r1 = r0.FH;
                    if (r1 == 0) { $pc0 = 15; continue $sw0; }
                    r0.FH = r1 - 1;
                    r0.Hw++;
                    r8 = r0.j6;
                    r2 = r0.DW;
                    r3 = r8[r2];
                    if (r3 == 0) { $pc0 = 10; continue $sw0; }
                    this.Ws.write(r8, r2, 1);
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r9 = this.tp;
                    r9.J0.update(r9.j6, r9.DW, 1);
                    this.tp.DW++;
                    if (r3 == 0) { $pc0 = 12; continue $sw0; }
                    r6 = r7;
                    { $pc0 = 5; continue $sw0; }
                }
                case 12: {
                    return r7;
                }
                case 15: {
                    throw new abcd.Ly.a(this, r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r6, int r7) {
        abcd.Oy r0 = null;
        int r1 = 0;
        byte[] r8 = null;
        int r2 = 0;
        byte r3 = 0;
        abcd.Oy r9 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Ws != null) { $pc1 = 6; continue $sw1; }
                    this.Ws = new java.io.ByteArrayOutputStream();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (this.v5 <= 0) { $pc1 = 7; continue $sw1; }
                    r0 = this.tp;
                    r1 = r0.FH;
                    if (r1 == 0) { $pc1 = 12; continue $sw1; }
                    r0.FH = r1 - 1;
                    r0.Hw++;
                    r8 = r0.j6;
                    r2 = r0.DW;
                    r3 = r8[r2];
                    this.Ws.write(r8, r2, 1);
                    r9 = this.tp;
                    r9.J0.update(r9.j6, r9.DW, 1);
                    this.tp.DW++;
                    this.v5--;
                    r6 = r7;
                    { $pc1 = 6; continue $sw1; }
                }
                case 12: {
                    throw new abcd.Ly.a(this, r6);
                }
                case 7: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r8, int r9, int r10) {
        int r0 = 0;
        abcd.Oy r2 = null;
        int r3 = 0;
        long r4 = 0L;
        byte[] r11 = null;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.we != (-1)) { $pc2 = 5; continue $sw2; }
                    this.we = r8;
                    this.v5 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = this.we;
                    if (r0 <= 0) { $pc2 = 8; continue $sw2; }
                    r2 = this.tp;
                    r3 = r2.FH;
                    if (r3 == 0) { $pc2 = 19; continue $sw2; }
                    r2.FH = r3 - 1;
                    r2.Hw++;
                    r4 = this.v5;
                    r11 = r2.j6;
                    r5 = r2.DW;
                    r2.DW = r5 + 1;
                    this.v5 = r4 | ((long) ((r11[r5] & 255) << ((r8 - r0) * 8)));
                    this.we = r0 - 1;
                    r9 = r10;
                    { $pc2 = 5; continue $sw2; }
                }
                case 19: {
                    throw new abcd.Ly.a(this, r9);
                }
                case 8: {
                    if (r8 != 2) { $pc2 = 11; continue $sw2; }
                    this.v5 &= 65535;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    this.we = -1;
                    return r9;
                }
                case 11: {
                    if (r8 != 4) { $pc2 = 13; continue $sw2; }
                    this.v5 &= 4294967295L;
                    { $pc2 = 13; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r6, long r7) {
        long r1 = 0L;
        int r8 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = r7;
                    r8 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r8 >= r6) { $pc3 = 4; continue $sw3; }
                    this.J0[r8] = (byte) (255 & r1);
                    r1 = r1 >> 8;
                    r8 = r8 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 4: {
                    this.tp.J0.update(this.J0, 0, r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW() {
        abcd.Oy r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.tp;
                    if (r0 != null) { $pc4 = 6; continue $sw4; }
                    return -2;
                }
                case 6: {
                    r0.gn = 0;
                    r0.Hw = 0;
                    r0.u7 = null;
                    this.DW = 14;
                    this.we = -1;
                    this.u7.DW();
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW(int r7) {
        abcd.Iy r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.tp.u7 = null;
                    this.u7 = null;
                    this.VH = 0;
                    if (r7 >= 0) { $pc5 = 6; continue $sw5; }
                    r7 = -r7;
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    if (r7 >= 8) { $pc5 = 20; continue $sw5; }
                    $pc5 = 29; continue $sw5;
                }
                case 29: {
                    j6();
                    return -2;
                }
                case 20: {
                    if (r7 > 15) { $pc5 = 29; continue $sw5; }
                    r3 = this.u7;
                    if (r3 != null) { $pc5 = 25; continue $sw5; }
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    this.gn = r7;
                    this.u7 = new abcd.Iy(this.tp, 1 << r7);
                    DW();
                    return 0;
                }
                case 25: {
                    if (this.gn == r7) { $pc5 = 27; continue $sw5; }
                    r3.j6();
                    this.u7 = null;
                    { $pc5 = 27; continue $sw5; }
                }
                case 6: {
                    if ((1073741824 & r7) == 0) { $pc5 = 11; continue $sw5; }
                    this.VH = 4;
                    r7 = r7 & (-1073741825);
                    if (r7 >= 48) { $pc5 = 18; continue $sw5; }
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r7 = r7 & 15;
                    { $pc5 = 18; continue $sw5; }
                }
                case 11: {
                    if ((r7 & (-32)) == 0) { $pc5 = 14; continue $sw5; }
                    this.VH = 4;
                    { $pc5 = 13; continue $sw5; }
                }
                case 14: {
                    this.VH = (r7 >> 4) + 1;
                    if (r7 >= 48) { $pc5 = 18; continue $sw5; }
                    { $pc5 = 13; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6() {
        abcd.Iy r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.u7;
                    if (r0 == null) { $pc6 = 7; continue $sw6; }
                    r0.j6();
                    return 0;
                }
                case 7: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(int r22) {
        abcd.Oy r2 = null;
        int r0 = 0;
        int r3 = 0;
        abcd.Hy r6 = null;
        abcd.Hy r7 = null;
        long r12 = 0L;
        long r13 = 0L;
        int r8 = 0;
        abcd.Hy r9 = null;
        abcd.Hy r10 = null;
        abcd.Hy r4 = null;
        int r11 = 0;
        int r14 = 0;
        long r15 = 0L;
        int r16 = 0;
        abcd.Oy r17 = null;
        abcd.Oy r5 = null;
        int r18 = 0;
        byte[] r19 = null;
        int r20 = 0;
        abcd.Oy r21 = null;
        int r23 = 0;
        long r110 = 0L;
        byte[] r24 = null;
        int r25 = 0;
        abcd.Oy r26 = null;
        int r27 = 0;
        long r28 = 0L;
        byte[] r29 = null;
        int r30 = 0;
        abcd.Oy r31 = null;
        int r32 = 0;
        long r33 = 0L;
        byte[] r34 = null;
        int r35 = 0;
        long r36 = 0L;
        int r37 = 0;
        long r38 = 0L;
        abcd.Hy r39 = null;
        java.lang.String r40 = null;
        long r41 = 0L;
        abcd.Oy r42 = null;
        java.lang.String r43 = null;
        abcd.Oy r44 = null;
        int r45 = 0;
        long r46 = 0L;
        byte[] r1 = null;
        int r47 = 0;
        abcd.Oy r48 = null;
        int r49 = 0;
        byte[] r50 = null;
        int r51 = 0;
        abcd.Oy r52 = null;
        int r53 = 0;
        long r111 = 0L;
        byte[] r54 = null;
        int r55 = 0;
        abcd.Oy r56 = null;
        int r57 = 0;
        long r58 = 0L;
        byte[] r59 = null;
        int r60 = 0;
        abcd.Hy r61 = null;
        abcd.Hy r62 = null;
        byte[] r63 = null;
        abcd.Hy r64 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r2 = this.tp;
                    if (r2 == null) { $pc7 = 255; continue $sw7; }
                    if (r2.j6 == null) { $pc7 = 255; continue $sw7; }
                    if (r22 != 4) { $pc7 = 9; continue $sw7; }
                    r0 = -5;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r3 = -5;
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    switch(this.DW) {
                        case 2: { $pc7 = 237; continue $sw7; }
                        case 3: { $pc7 = 241; continue $sw7; }
                        case 4: { $pc7 = 245; continue $sw7; }
                        case 5: { $pc7 = 236; continue $sw7; }
                        case 6: { $pc7 = 234; continue $sw7; }
                        case 7: { $pc7 = 172; continue $sw7; }
                        case 8: { $pc7 = 183; continue $sw7; }
                        case 9: { $pc7 = 187; continue $sw7; }
                        case 10: { $pc7 = 191; continue $sw7; }
                        case 11: { $pc7 = 195; continue $sw7; }
                        case 12: { $pc7 = 233; continue $sw7; }
                        case 13: { $pc7 = 170; continue $sw7; }
                        case 14: { $pc7 = 125; continue $sw7; }
                        case 15: { $pc7 = 211; continue $sw7; }
                        case 16: { $pc7 = 260; continue $sw7; }
                        case 17: { $pc7 = 264; continue $sw7; }
                        case 18: { $pc7 = 46; continue $sw7; }
                        case 19: { $pc7 = 62; continue $sw7; }
                        case 20: { $pc7 = 78; continue $sw7; }
                        case 21: { $pc7 = 92; continue $sw7; }
                        case 22: { $pc7 = 106; continue $sw7; }
                        case 23: { $pc7 = 266; continue $sw7; }
                        default: { $pc7 = 13; continue $sw7; }
                    };
                }
                case 260: {
                    try {
                        r3 = j6(4, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 121; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r6 = this.J8;
                    if (r6 == null) { $pc7 = 34; continue $sw7; }
                    r6.FH = this.v5;
                    $pc7 = 34; continue $sw7;
                }
                case 34: {
                    if ((this.EQ & 512) == 0) { $pc7 = 36; continue $sw7; }
                    j6(4, this.v5);
                    $pc7 = 36; continue $sw7;
                }
                case 36: {
                    this.DW = 17;
                    $pc7 = 121; continue $sw7;
                }
                case 121: {
                    e = $ex7;
                    return e.j6;
                }
                case 264: {
                    try {
                        r3 = j6(2, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 118; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = this.J8;
                    if (r7 == null) { $pc7 = 42; continue $sw7; }
                    r12 = this.v5;
                    r7.Hw = ((int) r12) & 255;
                    r7.v5 = (((int) r12) >> 8) & 255;
                    $pc7 = 42; continue $sw7;
                }
                case 42: {
                    if ((this.EQ & 512) == 0) { $pc7 = 44; continue $sw7; }
                    j6(2, this.v5);
                    $pc7 = 44; continue $sw7;
                }
                case 44: {
                    this.DW = 18;
                    $pc7 = 118; continue $sw7;
                }
                case 118: {
                    e = $ex7;
                    return e.j6;
                }
                case 266: {
                    try {
                        r3 = j6(2, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 26; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = this.v5;
                    this.EQ = ((int) r13) & 65535;
                    r8 = this.EQ;
                    if ((r8 & 255) == 8) { $pc7 = 20; continue $sw7; }
                    this.tp.u7 = "unknown compression method";
                    this.DW = 13;
                    { $pc7 = 12; continue $sw7; }
                }
                case 20: {
                    if ((57344 & r8) == 0) { $pc7 = 23; continue $sw7; }
                    this.tp.u7 = "unknown header flags set";
                    this.DW = 13;
                    { $pc7 = 12; continue $sw7; }
                }
                case 23: {
                    if ((r8 & 512) == 0) { $pc7 = 25; continue $sw7; }
                    j6(2, r13);
                    $pc7 = 25; continue $sw7;
                }
                case 25: {
                    this.DW = 16;
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    e = $ex7;
                    return e.j6;
                }
                case 13: {
                    return -2;
                }
                case 78: {
                    if ((this.EQ & 2048) != 0) { $pc7 = 262; continue $sw7; }
                    r9 = this.J8;
                    if (r9 == null) { $pc7 = 90; continue $sw7; }
                    r9.VH = null;
                    $pc7 = 90; continue $sw7;
                }
                case 90: {
                    this.DW = 21;
                    { $pc7 = 92; continue $sw7; }
                }
                case 262: {
                    try {
                        DW(r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 84; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.J8 == null) { $pc7 = 82; continue $sw7; }
                    try {
                        this.J8.VH = this.Ws.toByteArray();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 84; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 82; continue $sw7;
                }
                case 82: {
                    try {
                        this.Ws = null;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 84; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = r0;
                    $pc7 = 84; continue $sw7;
                }
                case 84: {
                    e = $ex7;
                    return e.j6;
                }
                case 92: {
                    if ((this.EQ & 4096) != 0) { $pc7 = 272; continue $sw7; }
                    r10 = this.J8;
                    if (r10 == null) { $pc7 = 104; continue $sw7; }
                    r10.gn = null;
                    $pc7 = 104; continue $sw7;
                }
                case 104: {
                    this.DW = 22;
                    { $pc7 = 106; continue $sw7; }
                }
                case 272: {
                    try {
                        DW(r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 98; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.J8 == null) { $pc7 = 96; continue $sw7; }
                    try {
                        this.J8.gn = this.Ws.toByteArray();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 98; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 96; continue $sw7;
                }
                case 96: {
                    try {
                        this.Ws = null;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 98; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = r0;
                    $pc7 = 98; continue $sw7;
                }
                case 98: {
                    e = $ex7;
                    return e.j6;
                }
                case 106: {
                    if ((this.EQ & 512) == 0) { $pc7 = 117; continue $sw7; }
                    try {
                        r3 = j6(2, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 114; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = this.J8;
                    if (r4 == null) { $pc7 = 112; continue $sw7; }
                    r4.u7 = (int) (this.v5 & 65535);
                    $pc7 = 112; continue $sw7;
                }
                case 112: {
                    if (this.v5 == (this.tp.J0.getValue() & 65535)) { $pc7 = 117; continue $sw7; }
                    this.DW = 13;
                    this.tp.u7 = "header crc mismatch";
                    this.Zo = 5;
                    $pc7 = 114; continue $sw7;
                }
                case 114: {
                    e = $ex7;
                    return e.j6;
                }
                case 117: {
                    this.tp.J0 = new abcd.Ey();
                    this.DW = 7;
                    { $pc7 = 12; continue $sw7; }
                }
                case 125: {
                    if (this.VH == 0) { $pc7 = 126; continue $sw7; }
                    try {
                        r3 = j6(2, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 167; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r11 = this.VH;
                    if (r11 == 4) { $pc7 = 133; continue $sw7; }
                    if ((r11 & 2) != 0) { $pc7 = 133; continue $sw7; }
                    $pc7 = 141; continue $sw7;
                }
                case 141: {
                    r14 = this.VH;
                    if ((r14 & 2) != 0) { $pc7 = 143; continue $sw7; }
                    this.EQ = 0;
                    r15 = this.v5;
                    this.FH = ((int) r15) & 255;
                    r16 = ((int) (r15 >> 8)) & 255;
                    if ((r14 & 1) == 0) { $pc7 = 149; continue $sw7; }
                    if ((((this.FH << 8) + r16) % 31) != 0) { $pc7 = 149; continue $sw7; }
                    $pc7 = 155; continue $sw7;
                }
                case 155: {
                    if ((this.FH & 15) != 8) { $pc7 = 156; continue $sw7; }
                    if (this.VH != 4) { $pc7 = 161; continue $sw7; }
                    this.VH = 1;
                    $pc7 = 161; continue $sw7;
                }
                case 161: {
                    if (((this.FH >> 4) + 8) > this.gn) { $pc7 = 162; continue $sw7; }
                    this.tp.J0 = new abcd.Dy();
                    if ((r16 & 32) != 0) { $pc7 = 166; continue $sw7; }
                    this.DW = 7;
                    { $pc7 = 12; continue $sw7; }
                }
                case 166: {
                    this.DW = 2;
                    { $pc7 = 237; continue $sw7; }
                }
                case 162: {
                    this.DW = 13;
                    this.tp.u7 = "invalid window size";
                    { $pc7 = 12; continue $sw7; }
                }
                case 156: {
                    this.DW = 13;
                    this.tp.u7 = "unknown compression method";
                    $pc7 = 149; continue $sw7;
                }
                case 149: {
                    if ((this.FH & 15) == 8) { $pc7 = 155; continue $sw7; }
                    if (this.VH == 4) { $pc7 = 152; continue $sw7; }
                    this.DW = 13;
                    this.tp.u7 = "incorrect header check";
                    { $pc7 = 12; continue $sw7; }
                }
                case 152: {
                    r17 = this.tp;
                    r17.DW -= 2;
                    r17.FH += 2;
                    r17.Hw -= 2;
                    this.VH = 0;
                    this.DW = 7;
                    { $pc7 = 12; continue $sw7; }
                }
                case 143: {
                    this.DW = 13;
                    this.tp.u7 = "incorrect header check";
                    $pc7 = 133; continue $sw7;
                }
                case 133: {
                    if (this.v5 != 35615) { $pc7 = 141; continue $sw7; }
                    if (this.VH != 4) { $pc7 = 137; continue $sw7; }
                    this.VH = 2;
                    $pc7 = 137; continue $sw7;
                }
                case 137: {
                    this.tp.J0 = new abcd.Ey();
                    j6(2, this.v5);
                    if (this.J8 != null) { $pc7 = 140; continue $sw7; }
                    this.J8 = new abcd.Hy();
                    $pc7 = 140; continue $sw7;
                }
                case 140: {
                    this.DW = 23;
                    $pc7 = 167; continue $sw7;
                }
                case 167: {
                    e = $ex7;
                    return e.j6;
                }
                case 126: {
                    this.DW = 7;
                    { $pc7 = 12; continue $sw7; }
                }
                case 170: {
                    return -3;
                }
                case 172: {
                    r3 = this.u7.DW(r3);
                    if (r3 == (-3)) { $pc7 = 174; continue $sw7; }
                    if (r3 != 0) { $pc7 = 177; continue $sw7; }
                    r3 = r0;
                    $pc7 = 177; continue $sw7;
                }
                case 177: {
                    if (r3 != 1) { $pc7 = 178; continue $sw7; }
                    this.Hw = this.tp.J0.getValue();
                    this.u7.DW();
                    if (this.VH == 0) { $pc7 = 181; continue $sw7; }
                    this.DW = 8;
                    r3 = r0;
                    { $pc7 = 183; continue $sw7; }
                }
                case 181: {
                    this.DW = 12;
                    r3 = r0;
                    { $pc7 = 12; continue $sw7; }
                }
                case 178: {
                    return r3;
                }
                case 174: {
                    this.DW = 13;
                    this.Zo = 0;
                    $pc7 = 183; continue $sw7;
                }
                case 183: {
                    r5 = this.tp;
                    r18 = r5.FH;
                    if (r18 == 0) { $pc7 = 185; continue $sw7; }
                    r5.FH = r18 - 1;
                    r5.Hw++;
                    r19 = r5.j6;
                    r20 = r5.DW;
                    r5.DW = r20 + 1;
                    this.v5 = ((long) ((r19[r20] & 255) << 24)) & 4278190080L;
                    this.DW = 9;
                    r3 = r0;
                    { $pc7 = 187; continue $sw7; }
                }
                case 185: {
                    return r3;
                }
                case 187: {
                    r21 = this.tp;
                    r23 = r21.FH;
                    if (r23 == 0) { $pc7 = 189; continue $sw7; }
                    r21.FH = r23 - 1;
                    r21.Hw++;
                    r110 = this.v5;
                    r24 = r21.j6;
                    r25 = r21.DW;
                    r21.DW = r25 + 1;
                    this.v5 = r110 + (((long) ((r24[r25] & 255) << 16)) & 16711680);
                    this.DW = 10;
                    r3 = r0;
                    { $pc7 = 191; continue $sw7; }
                }
                case 189: {
                    return r3;
                }
                case 191: {
                    r26 = this.tp;
                    r27 = r26.FH;
                    if (r27 == 0) { $pc7 = 193; continue $sw7; }
                    r26.FH = r27 - 1;
                    r26.Hw++;
                    r28 = this.v5;
                    r29 = r26.j6;
                    r30 = r26.DW;
                    r26.DW = r30 + 1;
                    this.v5 = r28 + (((long) ((r29[r30] & 255) << 8)) & 65280);
                    this.DW = 11;
                    r3 = r0;
                    { $pc7 = 195; continue $sw7; }
                }
                case 193: {
                    return r3;
                }
                case 195: {
                    r31 = this.tp;
                    r32 = r31.FH;
                    if (r32 == 0) { $pc7 = 197; continue $sw7; }
                    r31.FH = r32 - 1;
                    r31.Hw++;
                    r33 = this.v5;
                    r34 = r31.j6;
                    r35 = r31.DW;
                    r31.DW = r35 + 1;
                    this.v5 = r33 + (((long) r34[r35]) & 255);
                    if (this.EQ == 0) { $pc7 = 201; continue $sw7; }
                    r36 = this.v5;
                    this.v5 = (((r36 & 65535) << 24) | (((((-16777216) & r36) >> 24) | ((16711680 & r36) >> 8)) | ((65280 & r36) << 8))) & 4294967295L;
                    $pc7 = 201; continue $sw7;
                }
                case 201: {
                    r37 = (int) this.Hw;
                    r38 = this.v5;
                    if (r37 == ((int) r38)) { $pc7 = 205; continue $sw7; }
                    this.tp.u7 = "incorrect data check";
                    $pc7 = 209; continue $sw7;
                }
                case 209: {
                    this.DW = 15;
                    r3 = r0;
                    { $pc7 = 211; continue $sw7; }
                }
                case 205: {
                    if (this.EQ == 0) { $pc7 = 209; continue $sw7; }
                    r39 = this.J8;
                    if (r39 == null) { $pc7 = 209; continue $sw7; }
                    r39.tp = r38;
                    { $pc7 = 209; continue $sw7; }
                }
                case 197: {
                    return r3;
                }
                case 211: {
                    if (this.VH == 0) { $pc7 = 227; continue $sw7; }
                    if (this.EQ == 0) { $pc7 = 227; continue $sw7; }
                    try {
                        r3 = j6(4, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 224; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r40 = this.tp.u7;
                    if (r40 == null) { $pc7 = 220; continue $sw7; }
                    if (r40.equals("incorrect data check") == false) { $pc7 = 220; continue $sw7; }
                    this.DW = 13;
                    this.Zo = 5;
                    $pc7 = 220; continue $sw7;
                }
                case 220: {
                    r41 = this.v5;
                    r42 = this.tp;
                    if (r41 == (r42.gn & 4294967295L)) { $pc7 = 223; continue $sw7; }
                    r42.u7 = "incorrect length check";
                    this.DW = 13;
                    { $pc7 = 12; continue $sw7; }
                }
                case 223: {
                    r42.u7 = null;
                    $pc7 = 232; continue $sw7;
                }
                case 232: {
                    this.DW = 12;
                    $pc7 = 224; continue $sw7;
                }
                case 224: {
                    e = $ex7;
                    return e.j6;
                }
                case 227: {
                    r43 = this.tp.u7;
                    if (r43 == null) { $pc7 = 232; continue $sw7; }
                    if (r43.equals("incorrect data check") == false) { $pc7 = 232; continue $sw7; }
                    this.DW = 13;
                    this.Zo = 5;
                    $pc7 = 233; continue $sw7;
                }
                case 233: {
                    return 1;
                }
                case 234: {
                    this.DW = 13;
                    this.tp.u7 = "need dictionary";
                    this.Zo = 0;
                    return -2;
                }
                case 236: {
                    r0 = r3;
                    $pc7 = 249; continue $sw7;
                }
                case 249: {
                    r44 = this.tp;
                    r45 = r44.FH;
                    if (r45 != 0) { $pc7 = 252; continue $sw7; }
                    return r0;
                }
                case 252: {
                    r44.FH = r45 - 1;
                    r44.Hw++;
                    r46 = this.v5;
                    r1 = r44.j6;
                    r47 = r44.DW;
                    r44.DW = r47 + 1;
                    this.v5 = r46 + (((long) r1[r47]) & 255);
                    r44.J0.j6(this.v5);
                    this.DW = 6;
                    return 2;
                }
                case 237: {
                    r48 = this.tp;
                    r49 = r48.FH;
                    if (r49 != 0) { $pc7 = 240; continue $sw7; }
                    return r3;
                }
                case 240: {
                    r48.FH = r49 - 1;
                    r48.Hw++;
                    r50 = r48.j6;
                    r51 = r48.DW;
                    r48.DW = r51 + 1;
                    this.v5 = ((long) ((r50[r51] & 255) << 24)) & 4278190080L;
                    this.DW = 3;
                    r3 = r0;
                    $pc7 = 241; continue $sw7;
                }
                case 241: {
                    r52 = this.tp;
                    r53 = r52.FH;
                    if (r53 != 0) { $pc7 = 244; continue $sw7; }
                    return r3;
                }
                case 244: {
                    r52.FH = r53 - 1;
                    r52.Hw++;
                    r111 = this.v5;
                    r54 = r52.j6;
                    r55 = r52.DW;
                    r52.DW = r55 + 1;
                    this.v5 = r111 + (((long) ((r54[r55] & 255) << 16)) & 16711680);
                    this.DW = 4;
                    r3 = r0;
                    $pc7 = 245; continue $sw7;
                }
                case 245: {
                    r56 = this.tp;
                    r57 = r56.FH;
                    if (r57 != 0) { $pc7 = 248; continue $sw7; }
                    return r3;
                }
                case 248: {
                    r56.FH = r57 - 1;
                    r56.Hw++;
                    r58 = this.v5;
                    r59 = r56.j6;
                    r60 = r56.DW;
                    r56.DW = r60 + 1;
                    this.v5 = r58 + (((long) ((r59[r60] & 255) << 8)) & 65280);
                    this.DW = 5;
                    $pc7 = 46; continue $sw7;
                }
                case 46: {
                    if ((this.EQ & 1024) != 0) { $pc7 = 278; continue $sw7; }
                    r61 = this.J8;
                    if (r61 == null) { $pc7 = 60; continue $sw7; }
                    r61.Zo = null;
                    $pc7 = 60; continue $sw7;
                }
                case 60: {
                    this.DW = 19;
                    { $pc7 = 62; continue $sw7; }
                }
                case 278: {
                    try {
                        r3 = j6(2, r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 54; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r62 = this.J8;
                    if (r62 == null) { $pc7 = 52; continue $sw7; }
                    r62.Zo = new byte[((int) this.v5) & 65535];
                    $pc7 = 52; continue $sw7;
                }
                case 52: {
                    if ((this.EQ & 512) == 0) { $pc7 = 60; continue $sw7; }
                    j6(2, this.v5);
                    $pc7 = 54; continue $sw7;
                }
                case 54: {
                    e = $ex7;
                    return e.j6;
                }
                case 62: {
                    if ((this.EQ & 1024) == 0) { $pc7 = 73; continue $sw7; }
                    try {
                        r3 = j6(r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 70; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.J8 == null) { $pc7 = 76; continue $sw7; }
                    try {
                        r63 = this.Ws.toByteArray();
                        this.Ws = null;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 70; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r63.length != this.J8.Zo.length) { $pc7 = 68; continue $sw7; }
                    try {
                        java.lang.System.arraycopy(r63, 0, this.J8.Zo, 0, r63.length);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 70; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc7 = 76; continue $sw7; }
                }
                case 68: {
                    try {
                        this.tp.u7 = "bad extra field length";
                        this.DW = 13;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.Ly.a) { $pc7 = 70; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 76; continue $sw7;
                }
                case 76: {
                    this.DW = 20;
                    $pc7 = 70; continue $sw7;
                }
                case 70: {
                    e = $ex7;
                    return e.j6;
                }
                case 73: {
                    r64 = this.J8;
                    if (r64 == null) { $pc7 = 76; continue $sw7; }
                    r64.Zo = null;
                    { $pc7 = 76; continue $sw7; }
                }
                case 9: {
                    r0 = 0;
                    $pc7 = 255; continue $sw7;
                }
                case 255: {
                    if (r22 == 4) { $pc7 = 257; continue $sw7; }
                    $pc7 = 259; continue $sw7;
                }
                case 259: {
                    return -2;
                }
                case 257: {
                    if (this.DW != 14) { $pc7 = 259; continue $sw7; }
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
