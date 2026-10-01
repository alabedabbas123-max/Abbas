package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassQ extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -33415978249027341L)
    private com.aide.ui.views.editor.Interfaceo FH;

    @abcd.Interfaceru(field = -1565989522330427247L)
    private int Hw;

    @abcd.Interfaceru(field = 106621836159123792L)
    private int VH;

    @abcd.Interfaceru(field = 3529359687829859504L)
    private int Zo;

    @abcd.Interfaceru(field = -2101006542006529287L)
    private char gn;

    @abcd.Interfaceru(field = 1592903492243448067L)
    private char[] tp;

    @abcd.Interfaceru(field = -209342069288996800L)
    private int u7;

    @abcd.Interfaceru(field = 523738323999885033L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassQ.class, -2860579357306958496L, -2860579357306958496L);
    }

    @abcd.Interfacesu(method = -336306307054872585L)
    ClassQ(com.aide.ui.views.editor.Interfaceo r9, int r10, int r11, int r12, int r13, boolean r14, java.lang.String r15) {
        char r16 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    abcd.wu.j6(58416528859645440L, null, new java.lang.Object[]{r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14), r15});
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.FH = r9;
                    this.Hw = r10;
                    this.v5 = r11;
                    this.VH = r13;
                    this.Zo = r12;
                    if (this.VH <= (r9.v5() - 1)) { $pc0 = 9; continue $sw0; }
                    this.VH = r9.v5() - 1;
                    this.Zo = r9.EQ(this.VH);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (this.Zo <= r9.EQ(this.VH)) { $pc0 = 11; continue $sw0; }
                    this.Zo = r9.EQ(this.VH);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r14 == false) { $pc0 = 13; continue $sw0; }
                    r16 = ' ';
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    this.gn = r16;
                    this.u7 = 0;
                    this.tp = r15.toCharArray();
                    return;
                }
                case 13: {
                    r16 = '\t';
                    { $pc0 = 14; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -136981706850093275L)
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -1968969293903434385L, this);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(-1968969293903434385L, this);
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
    @abcd.Interfacesu(method = 1854250374981214893L)
    public int read() {
        synchronized (this.FH) {
            com.aide.ui.views.editor.Interfaceo r2 = null;
            int r3 = 0;
            com.aide.ui.views.editor.Interfaceo r4 = null;
            int r5 = 0;
            char r6 = 0;
            char r7 = 0;
            char[] r8 = null;
            int r9 = 0;
            char r10 = 0;
            char r11 = 0;
            com.aide.ui.views.editor.Interfaceo r12 = null;
            int r13 = 0;
            char r14 = 0;
            char r15 = 0;
            char[] r16 = null;
            int r17 = 0;
            char r18 = 0;
            char r19 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 61: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 65; continue $sw2; }
                        abcd.wu.j6(th, -213908543651208097L, this);
                        $pc2 = 65; continue $sw2;
                    }
                    case 65: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-213908543651208097L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 61; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            r2 = this.FH;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 61; continue $sw2;
                        }
                        try {
                            r3 = this.FH.v5();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        if (this.v5 >= this.VH) { $pc2 = 30; continue $sw2; }
                        if (this.v5 >= r3) { $pc2 = 30; continue $sw2; }
                        if (this.Hw >= this.FH.EQ(this.v5)) { $pc2 = 22; continue $sw2; }
                        try {
                            r4 = this.FH;
                            r5 = this.Hw;
                            this.Hw = r5 + 1;
                            r6 = r4.FH(r5, this.v5);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        if (r6 == '\t') { $pc2 = 18; continue $sw2; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r6;
                    }
                    case 18: {
                        try {
                            r7 = this.gn;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r7;
                    }
                    case 22: {
                        if (this.u7 >= (this.tp.length - 1)) { $pc2 = 26; continue $sw2; }
                        try {
                            r8 = this.tp;
                            r9 = this.u7;
                            this.u7 = r9 + 1;
                            r10 = r8[r9];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r10;
                    }
                    case 26: {
                        try {
                            this.u7 = 0;
                            this.Hw = 0;
                            this.v5++;
                            r11 = this.tp[this.tp.length - 1];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r11;
                    }
                    case 30: {
                        if (this.v5 == this.VH) { $pc2 = 32; continue $sw2; }
                        $pc2 = 56; continue $sw2;
                    }
                    case 56: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return -1;
                    }
                    case 32: {
                        if (this.v5 >= r3) { $pc2 = 56; continue $sw2; }
                        if (this.Hw <= this.Zo) { $pc2 = 36; continue $sw2; }
                        $pc2 = 54; continue $sw2;
                    }
                    case 54: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return -1;
                    }
                    case 36: {
                        if (this.Hw > this.FH.EQ(this.v5)) { $pc2 = 54; continue $sw2; }
                        if (this.Hw >= this.FH.EQ(this.v5)) { $pc2 = 47; continue $sw2; }
                        try {
                            r12 = this.FH;
                            r13 = this.Hw;
                            this.Hw = r13 + 1;
                            r14 = r12.FH(r13, this.v5);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        if (r14 == '\t') { $pc2 = 43; continue $sw2; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r14;
                    }
                    case 43: {
                        try {
                            r15 = this.gn;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r15;
                    }
                    case 47: {
                        if (this.u7 >= (this.tp.length - 1)) { $pc2 = 51; continue $sw2; }
                        try {
                            r16 = this.tp;
                            r17 = this.u7;
                            this.u7 = r17 + 1;
                            r18 = r16[r17];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r18;
                    }
                    case 51: {
                        try {
                            this.u7 = 0;
                            this.Hw = 0;
                            this.v5++;
                            r19 = this.tp[this.tp.length - 1];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 58; continue $sw2;
                        }
                        return r19;
                    }
                    case 58: {
                        th = $ex2;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 61; continue $sw2;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    @abcd.Interfacesu(method = 434601568616869173L)
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
                    abcd.wu.j6(r1, -22544804121713933L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc3 = 43; continue $sw3;
                }
                case 43: {
                    throw th;
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-22544804121713933L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
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
                    $pc3 = 27; continue $sw3;
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
