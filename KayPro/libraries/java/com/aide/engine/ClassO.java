package com.aide.engine;

@abcd.Interfacexu
public class ClassO {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3125440392403647185L)
    private byte[][] FH;

    static {
        abcd.wu.j6(com.aide.engine.ClassO.class, 86643161135662827L, 86643161135662827L);
    }

    public ClassO() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 6569109565997957992L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(6569109565997957992L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{100, 5});
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -46299104196005680L)
    private int DW(int r8) {
        byte[] r2 = null;
        byte r4 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 20: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 25; continue $sw1; }
                    abcd.wu.j6(th, 8247287251512644319L, this, new java.lang.Integer(r8));
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(8247287251512644319L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 20; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r8 < this.FH.length) { $pc1 = 9; continue $sw1; }
                    return 0;
                }
                case 9: {
                    try {
                        r2 = this.FH[r8];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 20; continue $sw1;
                    }
                    if (r2.length != 0) { $pc1 = 12; continue $sw1; }
                    return 0;
                }
                case 12: {
                    try {
                        r4 = r2[r2.length - 1];
                        r5 = r2.length - 2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 20; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r5 < 0) { $pc1 = 19; continue $sw1; }
                    if (r2[r5] != r4) { $pc1 = 17; continue $sw1; }
                    r5 = r5 - 1;
                    { $pc1 = 13; continue $sw1; }
                }
                case 17: {
                    return r5 + 2;
                }
                case 19: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2012375522450652096L)
    private void FH(int r8, int r9) {
        int r1 = 0;
        int r2 = 0;
        byte[] r0 = null;
        byte[] r3 = null;
        byte r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 16: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 21; continue $sw2; }
                    abcd.wu.j6(th, -4076305448697781553L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-4076305448697781553L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r1 = r8 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    if (this.FH.length > r1) { $pc2 = 8; continue $sw2; }
                    return;
                }
                case 8: {
                    try {
                        r2 = r8 + 1;
                        java.lang.System.arraycopy(this.FH, r2, this.FH, r1, (this.FH.length - r8) - 2);
                        r0 = this.FH[r8];
                        r3 = new byte[r0.length];
                        this.FH[r2] = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    if (r0.length <= r9) { $pc2 = 15; continue $sw2; }
                    try {
                        r4 = r0[r9];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    r5 = r9;
                    r6 = 0;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r5 >= r0.length) { $pc2 = 26; continue $sw2; }
                    try {
                        r3[r6] = r0[r5];
                        r0[r5] = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    r5 = r5 + 1;
                    r6 = r6 + 1;
                    { $pc2 = 11; continue $sw2; }
                }
                case 26: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1621775776487089755L)
    private void j6(int r9, int r10, int r11) {
        int r0 = 0;
        byte[] r1 = null;
        byte r2 = 0;
        byte[] r3 = null;
        int r4 = 0;
        byte r5 = 0;
        byte r6 = 0;
        byte r7 = 0;
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 38: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 43; continue $sw3; }
                    abcd.wu.j6(th, -2449270981601921400L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc3 = 43; continue $sw3;
                }
                case 43: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-2449270981601921400L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r11 != 0) { $pc3 = 8; continue $sw3; }
                    return;
                }
                case 8: {
                    if (this.FH.length > r9) { $pc3 = 10; continue $sw3; }
                    return;
                }
                case 10: {
                    try {
                        r0 = DW(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    if (r0 > r10) { $pc3 = 14; continue $sw3; }
                    return;
                }
                case 14: {
                    if ((r0 - 1) != r10) { $pc3 = 20; continue $sw3; }
                    if (r10 <= 0) { $pc3 = 20; continue $sw3; }
                    try {
                        j6(r9, r0 + 1);
                        r1 = this.FH[r9];
                        r2 = r1[r10 - 1];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    if (r2 != (com.aide.engine.Enumm.EQ.ordinal() + 1)) { $pc3 = 20; continue $sw3; }
                    try {
                        r1[r10] = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    return;
                }
                case 20: {
                    try {
                        j6(r9, r0 + r11);
                        r3 = this.FH[r9];
                        r4 = r10 + r11;
                        java.lang.System.arraycopy(r3, r10, r3, r4, (r3.length - r10) - r11);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    r5 = 0;
                    if (r10 <= 0) { $pc3 = 23; continue $sw3; }
                    try {
                        r6 = r3[r10 - 1];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    try {
                        r7 = r3[r10];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    if (r7 < (com.aide.engine.Enumm.J8.ordinal() + 1)) { $pc3 = 27; continue $sw3; }
                    try {
                        r5 = (byte) (com.aide.engine.Enumm.J8.ordinal() + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    if (r6 == r7) { $pc3 = 29; continue $sw3; }
                    $pc3 = 33; continue $sw3;
                }
                case 33: {
                    r8 = r10;
                    $pc3 = 34; continue $sw3;
                }
                case 34: {
                    if (r8 >= r4) { $pc3 = 37; continue $sw3; }
                    try {
                        r3[r8] = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    r8 = r8 + 1;
                    { $pc3 = 34; continue $sw3; }
                }
                case 37: {
                    return;
                }
                case 29: {
                    if (r6 == (com.aide.engine.Enumm.VH.ordinal() + 1)) { $pc3 = 33; continue $sw3; }
                    if (r6 == (com.aide.engine.Enumm.gn.ordinal() + 1)) { $pc3 = 33; continue $sw3; }
                    r5 = r6;
                    { $pc3 = 33; continue $sw3; }
                }
                case 23: {
                    r6 = 0;
                    { $pc3 = 24; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte DW(int r8, int r9) {
        byte[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 19; continue $sw4; }
                    abcd.wu.j6(th, 1088747195166121255L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1088747195166121255L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r8 < this.FH.length) { $pc4 = 9; continue $sw4; }
                    return 0;
                }
                case 9: {
                    try {
                        r0 = this.FH[r8];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (r9 < r0.length) { $pc4 = 14; continue $sw4; }
                    return r0[r0.length - 1];
                }
                case 14: {
                    return r0[r9];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r10, int r11, int r12, int r13) {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r2 = null;
        byte[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 26: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 31; continue $sw5; }
                    abcd.wu.j6(th, 1096984178575092096L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc5 = 31; continue $sw5;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(1096984178575092096L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    if (r10 != r12) { $pc5 = 12; continue $sw5; }
                    if (r10 >= this.FH.length) { $pc5 = 25; continue $sw5; }
                    try {
                        r0 = this.FH[r10];
                        r1 = r13 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    if (r1 >= r0.length) { $pc5 = 37; continue $sw5; }
                    try {
                        java.lang.System.arraycopy(r0, r1, r0, r11, (r0.length - r13) - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    return;
                }
                case 37: {
                    return;
                }
                case 25: {
                    return;
                }
                case 12: {
                    if (r12 >= this.FH.length) { $pc5 = 19; continue $sw5; }
                    try {
                        j6(r10, DW(r10) + DW(r12));
                        r2 = this.FH[r10];
                        r3 = this.FH[r12];
                        r4 = r13 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    r5 = r11;
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    if (r4 >= r3.length) { $pc5 = 19; continue $sw5; }
                    if (r5 >= r2.length) { $pc5 = 19; continue $sw5; }
                    try {
                        r2[r5] = r3[r4];
                        r4 = r4 + 1;
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    try {
                        r6 = r12 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    if (r6 >= this.FH.length) { $pc5 = 39; continue $sw5; }
                    try {
                        java.lang.System.arraycopy(this.FH, r6, this.FH, r10 + 1, (this.FH.length - r12) - 2);
                        r7 = r12 - r10;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    r8 = 0;
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    if (r8 >= r7) { $pc5 = 40; continue $sw5; }
                    try {
                        this.FH[(this.FH.length - r8) - 1] = new byte[5];
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 26; continue $sw5;
                    }
                    r8 = r8 + 1;
                    { $pc5 = 22; continue $sw5; }
                }
                case 40: {
                    return;
                }
                case 39: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        int r3 = 0;
        byte[] r4 = null;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 16: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 21; continue $sw6; }
                    abcd.wu.j6(th, 2280343542653472000L, this);
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2280343542653472000L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 16; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    r3 = 0;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r3 >= this.FH.length) { $pc6 = 15; continue $sw6; }
                    try {
                        r4 = this.FH[r3];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 16; continue $sw6;
                    }
                    r5 = 0;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r5 >= r4.length) { $pc6 = 14; continue $sw6; }
                    try {
                        r4[r5] = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 16; continue $sw6;
                    }
                    r5 = r5 + 1;
                    { $pc6 = 11; continue $sw6; }
                }
                case 14: {
                    r3 = r3 + 1;
                    { $pc6 = 7; continue $sw6; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte r11, int r12, int r13, int r14, int r15) {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        byte[] r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 41: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 46; continue $sw7; }
                    abcd.wu.j6(th, 5570115083346327700L, this, new java.lang.Byte(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc7 = 46; continue $sw7;
                }
                case 46: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(5570115083346327700L, this, new java.lang.Byte(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    if (r12 != r14) { $pc7 = 13; continue $sw7; }
                    try {
                        j6(r14, r15 + 1);
                        r0 = this.FH[r14];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    r1 = r13;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r1 > r15) { $pc7 = 40; continue $sw7; }
                    if (r0[r1] < (com.aide.engine.Enumm.J8.ordinal() + 1)) { $pc7 = 11; continue $sw7; }
                    try {
                        r0[r1] = (byte) (com.aide.engine.Enumm.values().length + r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 7; continue $sw7; }
                }
                case 11: {
                    try {
                        r0[r1] = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 12; continue $sw7; }
                }
                case 40: {
                    return;
                }
                case 13: {
                    try {
                        j6(r12, r13 + 1);
                        j6(r14, r15 + 1);
                        r2 = this.FH[r12];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    r3 = r13;
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    if (r3 >= r2.length) { $pc7 = 21; continue $sw7; }
                    if (r2[r3] < (com.aide.engine.Enumm.J8.ordinal() + 1)) { $pc7 = 19; continue $sw7; }
                    try {
                        r2[r3] = (byte) (com.aide.engine.Enumm.values().length + r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 15; continue $sw7; }
                }
                case 19: {
                    try {
                        r2[r3] = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 20; continue $sw7; }
                }
                case 21: {
                    try {
                        r4 = r12 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    r5 = 0;
                    if (r4 >= r14) { $pc7 = 33; continue $sw7; }
                    try {
                        r6 = this.FH[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    if (r5 >= r6.length) { $pc7 = 32; continue $sw7; }
                    if (r6[r5] < (com.aide.engine.Enumm.J8.ordinal() + 1)) { $pc7 = 30; continue $sw7; }
                    try {
                        r6[r5] = (byte) (com.aide.engine.Enumm.values().length + r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 31; continue $sw7;
                }
                case 31: {
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 26; continue $sw7; }
                }
                case 30: {
                    try {
                        r6[r5] = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 31; continue $sw7; }
                }
                case 32: {
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 22; continue $sw7; }
                }
                case 33: {
                    try {
                        r7 = this.FH[r14];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 34; continue $sw7;
                }
                case 34: {
                    if (r5 > r15) { $pc7 = 62; continue $sw7; }
                    if (r7[r5] < (com.aide.engine.Enumm.J8.ordinal() + 1)) { $pc7 = 38; continue $sw7; }
                    try {
                        r7[r5] = (byte) (com.aide.engine.Enumm.values().length + r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    $pc7 = 39; continue $sw7;
                }
                case 39: {
                    r5 = r5 + 1;
                    { $pc7 = 34; continue $sw7; }
                }
                case 38: {
                    try {
                        r7[r5] = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 41; continue $sw7;
                    }
                    { $pc7 = 39; continue $sw7; }
                }
                case 62: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r7) {
        byte[][] r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 10: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 14; continue $sw8; }
                    abcd.wu.j6(th, -1263917484823256991L, this, new java.lang.Integer(r7));
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(-1263917484823256991L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (this.FH.length > r7) { $pc8 = 17; continue $sw8; }
                    try {
                        r2 = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{(r7 * 5) / 4, 5});
                        java.lang.System.arraycopy(this.FH, 0, r2, 0, this.FH.length);
                        this.FH = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, int r9) {
        byte[] r0 = null;
        byte r1 = 0;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 13: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 18; continue $sw9; }
                    abcd.wu.j6(th, -1700323982822110464L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(-1700323982822110464L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 13; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        j6(r8);
                        r0 = this.FH[r8];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 13; continue $sw9;
                    }
                    if (r0.length > r9) { $pc9 = 12; continue $sw9; }
                    try {
                        r1 = r0[r0.length - 1];
                        r2 = new byte[((r9 * 5) / 4) + 1];
                        java.lang.System.arraycopy(r0, 0, r2, 0, r0.length);
                        this.FH[r8] = r2;
                        r3 = r0.length;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 13; continue $sw9;
                    }
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    if (r3 >= r2.length) { $pc9 = 23; continue $sw9; }
                    try {
                        r2[r3] = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 13; continue $sw9;
                    }
                    r3 = r3 + 1;
                    { $pc9 = 8; continue $sw9; }
                }
                case 23: {
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 12: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 17; continue $sw10; }
                    abcd.wu.j6(th, -1675067388582708999L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(-1675067388582708999L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    if (r10 != r12) { $pc10 = 7; continue $sw10; }
                    try {
                        j6(r10, r11, (r13 - r11) + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    return;
                }
                case 7: {
                    r0 = r10;
                    $pc10 = 8; continue $sw10;
                }
                case 8: {
                    if (r0 >= r12) { $pc10 = 10; continue $sw10; }
                    try {
                        FH(r10, r11);
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    { $pc10 = 8; continue $sw10; }
                }
                case 10: {
                    try {
                        j6(r12, 0, r13 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r9, com.aide.engine.ClassO r10, int r11) {
        byte[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 10: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 14; continue $sw11; }
                    abcd.wu.j6(th, 2959760420785071920L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(2959760420785071920L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 10; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (r10.FH.length > r11) { $pc11 = 8; continue $sw11; }
                    return;
                }
                case 8: {
                    try {
                        j6(r9);
                        r0 = new byte[r10.FH[r11].length];
                        java.lang.System.arraycopy(r10.FH[r11], 0, r0, 0, r0.length);
                        this.FH[r9] = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 10; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.engine.Enumm[] r10, int[] r11, int[] r12, int[] r13, int[] r14, int r15) {
        int r16 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (j6 == false) { $pc12 = 5; continue $sw12; }
                    abcd.wu.j6(-644325777124863017L, this, new java.lang.Object[]{r10, r11, r12, r13, r14, new java.lang.Integer(r15)});
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    j6();
                    r16 = r15 - 1;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (r16 < 0) { $pc12 = 11; continue $sw12; }
                    if (r10[r16] == null) { $pc12 = 10; continue $sw12; }
                    j6((byte) r10[r16].ordinal(), r11[r16] - 1, r12[r16] - 1, r13[r16] - 1, r14[r16] - 2);
                    $pc12 = 10; continue $sw12;
                }
                case 10: {
                    r16 = r16 - 1;
                    { $pc12 = 6; continue $sw12; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
