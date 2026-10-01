package com.aide.ui.views.editor;

@abcd.Interfacexu
class ua extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 4587903370976954931L)
    private char[] EQ;

    @abcd.Interfaceru(field = 412333317917277219L)
    private com.aide.ui.views.editor.Interfaceo FH;

    @abcd.Interfaceru(field = 1328527460320608825L)
    private int Hw;

    @abcd.Interfaceru(field = 2618435471901938744L)
    private int VH;

    @abcd.Interfaceru(field = 3323455104459596200L)
    private int Zo;

    @abcd.Interfaceru(field = 5937247321418295515L)
    private int gn;

    @abcd.Interfaceru(field = -6311479247298608L)
    private int tp;

    @abcd.Interfaceru(field = 290187455210148033L)
    private char u7;

    @abcd.Interfaceru(field = -1964389678324685183L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ua.class, 1215171460922875599L, 1215171460922875599L);
    }

    @abcd.Interfacesu(method = -1468295511332350655L)
    ua(com.aide.ui.views.editor.Interfaceo r9, int r10, int r11, int r12, int r13, boolean r14, java.lang.String r15) {
        int r16 = 0;
        char r17 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    abcd.wu.j6(-51200298011060736L, null, new java.lang.Object[]{r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14), r15});
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.FH = r9;
                    this.Hw = r10;
                    this.v5 = r11;
                    if (r13 >= r9.v5()) { $pc0 = 12; continue $sw0; }
                    this.VH = r13;
                    if (r12 < r9.EQ(this.VH)) { $pc0 = 11; continue $sw0; }
                    r12 = r9.EQ(this.VH) - 1;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    this.Zo = r12;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r11 != this.VH) { $pc0 = 16; continue $sw0; }
                    r16 = this.Zo + 1;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    this.gn = r16;
                    if (r14 == false) { $pc0 = 20; continue $sw0; }
                    r17 = ' ';
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    this.u7 = r17;
                    this.tp = 0;
                    this.EQ = r15.toCharArray();
                    return;
                }
                case 20: {
                    r17 = '\t';
                    { $pc0 = 21; continue $sw0; }
                }
                case 16: {
                    r16 = r9.EQ(r11);
                    { $pc0 = 17; continue $sw0; }
                }
                case 12: {
                    this.VH = r9.v5() - 1;
                    this.Zo = r9.EQ(this.VH) - 1;
                    { $pc0 = 14; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2850881407170820185L)
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 2043230389146606560L, this);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(2043230389146606560L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1037753150407565601L)
    public int read() {
        com.aide.ui.views.editor.Interfaceo r2 = null;
        int r3 = 0;
        char r4 = 0;
        char[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 31; continue $sw2; }
                    abcd.wu.j6(th, 709409337973381296L, this);
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(709409337973381296L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (this.Hw >= this.gn) { $pc2 = 14; continue $sw2; }
                    try {
                        r2 = this.FH;
                        r3 = this.Hw;
                        this.Hw = r3 + 1;
                        r4 = r2.FH(r3, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (r4 == '\t') { $pc2 = 12; continue $sw2; }
                    return r4;
                }
                case 12: {
                    return this.u7;
                }
                case 14: {
                    if (this.v5 != this.VH) { $pc2 = 18; continue $sw2; }
                    return -1;
                }
                case 18: {
                    if (this.tp >= (this.EQ.length - 1)) { $pc2 = 21; continue $sw2; }
                    try {
                        r5 = this.EQ;
                        r6 = this.tp;
                        this.tp = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    return r5[r6];
                }
                case 21: {
                    try {
                        this.tp = 0;
                        this.Hw = 0;
                        this.v5++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (this.v5 != this.VH) { $pc2 = 24; continue $sw2; }
                    try {
                        r7 = this.Zo + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    try {
                        this.gn = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    return this.EQ[this.EQ.length - 1];
                }
                case 24: {
                    try {
                        r7 = this.FH.EQ(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 25; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -731244846448698805L)
    public int read(char[] r9, int r10, int r11) {
        java.lang.Throwable r1 = null;
        int r0 = 0;
        int r2 = 0;
        int r12 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 38: {
                    th = th;
                    $pc3 = 40; continue $sw3;
                }
                case 40: {
                    if (DW == false) { $pc3 = 43; continue $sw3; }
                    r1 = th;
                    abcd.wu.j6(r1, 3839133521585640380L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc3 = 43; continue $sw3;
                }
                case 43: {
                    throw th;
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(3839133521585640380L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r9 == null) { $pc3 = 37; continue $sw3; }
                    if (r11 < 0) { $pc3 = 35; continue $sw3; }
                    if (r10 < 0) { $pc3 = 33; continue $sw3; }
                    if ((r11 + r10) > r9.length) { $pc3 = 31; continue $sw3; }
                    if (r11 != 0) { $pc3 = 13; continue $sw3; }
                    return 0;
                }
                case 13: {
                    try {
                        r0 = read();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                    if (r0 != (-1)) { $pc3 = 17; continue $sw3; }
                    return -1;
                }
                case 17: {
                    r2 = r10 + 1;
                    try {
                        r9[r10] = (char) r0;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 28; continue $sw3;
                    }
                    r12 = 1;
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    if (r12 >= r11) { $pc3 = 27; continue $sw3; }
                    try {
                        r3 = read();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 28; continue $sw3;
                    }
                    if (r3 == (-1)) { $pc3 = 27; continue $sw3; }
                    r4 = r2 + 1;
                    try {
                        r9[r2] = (char) r3;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 25; continue $sw3;
                    }
                    r12 = r12 + 1;
                    r2 = r4;
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    th = th;
                    r10 = r4;
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    return r12;
                }
                case 28: {
                    th = th;
                    r10 = r2;
                    { $pc3 = 40; continue $sw3; }
                }
                case 31: {
                    try {
                        throw new java.lang.IndexOutOfBoundsException();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                }
                case 33: {
                    try {
                        throw new java.lang.IndexOutOfBoundsException();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                }
                case 35: {
                    try {
                        throw new java.lang.IndexOutOfBoundsException();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                }
                case 37: {
                    try {
                        throw new java.lang.NullPointerException();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 38; continue $sw3;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
