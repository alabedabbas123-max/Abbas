package abcd;

@abcd.Interfacexu
public final class wc extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3901488013810570605L)
    private int EQ;

    @abcd.Interfaceru(field = 1223981471092438224L)
    private java.io.Reader FH;

    @abcd.Interfaceru(field = 1791917173016709680L)
    private char[] Hw;

    @abcd.Interfaceru(field = -7378995248337726376L)
    private int J0;

    @abcd.Interfaceru(field = 40755095542000200L)
    private int J8;

    @abcd.Interfaceru(field = 2129210516147708133L)
    private int VH;

    @abcd.Interfaceru(field = -4169784818957103495L)
    private boolean Ws;

    @abcd.Interfaceru(field = -4339679485673802368L)
    private int Zo;

    @abcd.Interfaceru(field = 2133767135118013304L)
    private int gn;

    @abcd.Interfaceru(field = -1747669195909045504L)
    private int tp;

    @abcd.Interfaceru(field = 3277389036248364532L)
    private int u7;

    @abcd.Interfaceru(field = -4057650634066717695L)
    private int v5;

    @abcd.Interfaceru(field = 20759376291682560L)
    private int we;

    static {
        abcd.wu.j6(abcd.wc.class, 3029094188873400095L, 3029094188873400095L);
    }

    public wc() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3033754888632851289L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3033754888632851289L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Hw = new char[16384];
                        this.u7 = 1;
                        this.tp = 1;
                        this.EQ = -1;
                        this.we = -1;
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

    @abcd.Interfacesu(method = 2757400930519688256L)
    private void DW() {
        char[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 19: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 24; continue $sw1; }
                    abcd.wu.j6(th, -871699983253226772L, this);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-871699983253226772L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if ((this.v5 + 10) < this.Hw.length) { $pc1 = 12; continue $sw1; }
                    if (this.VH <= 10) { $pc1 = 11; continue $sw1; }
                    try {
                        java.lang.System.arraycopy(this.Hw, this.VH, this.Hw, 0, this.v5 - this.VH);
                        this.v5 -= this.VH;
                        this.Zo -= this.VH;
                        this.EQ -= this.VH;
                        this.VH = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    { $pc1 = 12; continue $sw1; }
                }
                case 11: {
                    try {
                        r2 = new char[this.Hw.length * 2];
                        java.lang.System.arraycopy(this.Hw, 0, r2, 0, this.v5);
                        this.Hw = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    try {
                        r3 = this.FH.read(this.Hw, this.v5, (this.Hw.length - this.v5) - 10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r3 == 0) { $pc1 = 12; continue $sw1; }
                    if (r3 >= 0) { $pc1 = 17; continue $sw1; }
                    try {
                        this.Ws = true;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    return;
                }
                case 17: {
                    try {
                        this.v5 += r3;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2334286517715510193L)
    private void FH(int r8, boolean r9) {
        int r0 = 0;
        int r1 = 0;
        int r6 = 0;
        char r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 56: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 61; continue $sw2; }
                    abcd.wu.j6(th, -3395974040566592215L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    $pc2 = 61; continue $sw2;
                }
                case 61: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3395974040566592215L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r8 < this.gn) { $pc2 = 55; continue $sw2; }
                    if (((this.VH + r8) - this.gn) != (this.v5 + 1)) { $pc2 = 11; continue $sw2; }
                    try {
                        r8 = r8 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (((this.VH + r8) - this.gn) > this.v5) { $pc2 = 53; continue $sw2; }
                    try {
                        r0 = this.VH;
                        r1 = this.gn;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    if (r1 >= r8) { $pc2 = 30; continue $sw2; }
                    try {
                        r6 = r0 + 1;
                        r2 = this.Hw[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    if (r2 == '\n') { $pc2 = 27; continue $sw2; }
                    if (r2 != 65534) { $pc2 = 19; continue $sw2; }
                    try {
                        r3 = r6 + 7;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    if (r3 >= this.v5) { $pc2 = 25; continue $sw2; }
                    try {
                        this.u7 = (((this.Hw[r6] << 24) | (this.Hw[r6 + 1] << 16)) | (this.Hw[r6 + 2] << '\b')) | this.Hw[r6 + 3];
                        this.tp = this.Hw[r3] | (((this.Hw[r6 + 4] << 24) | (this.Hw[r6 + 5] << 16)) | (this.Hw[r6 + 6] << '\b'));
                        r6 = r6 + 8;
                        r1 = r1 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    r0 = r6;
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    { $pc2 = 14; continue $sw2; }
                }
                case 25: {
                    try {
                        throw new java.lang.RuntimeException("Incomplete buffer while reading position");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                }
                case 19: {
                    if (this.u7 <= 0) { $pc2 = 29; continue $sw2; }
                    try {
                        this.tp++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    { $pc2 = 29; continue $sw2; }
                }
                case 27: {
                    if (this.u7 <= 0) { $pc2 = 29; continue $sw2; }
                    try {
                        this.u7++;
                        this.tp = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    { $pc2 = 29; continue $sw2; }
                }
                case 30: {
                    try {
                        this.gn = r8;
                        this.VH = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    if (r9 == true) { $pc2 = 33; continue $sw2; }
                    return;
                }
                case 33: {
                    if (this.we != r8) { $pc2 = 35; continue $sw2; }
                    return;
                }
                case 35: {
                    try {
                        this.we = r8;
                        this.J0 = this.u7;
                        this.J8 = this.tp;
                        this.EQ = this.VH;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    $pc2 = 37; continue $sw2;
                }
                case 37: {
                    if (this.EQ < this.v5) { $pc2 = 45; continue $sw2; }
                    if (this.Ws == true) { $pc2 = 40; continue $sw2; }
                    try {
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    if (this.Ws == false) { $pc2 = 45; continue $sw2; }
                    return;
                }
                case 40: {
                    return;
                }
                case 45: {
                    if (this.Hw[this.EQ] != 65534) { $pc2 = 75; continue $sw2; }
                    try {
                        this.EQ++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    if ((this.EQ + 7) >= this.v5) { $pc2 = 50; continue $sw2; }
                    try {
                        this.J0 = (((this.Hw[this.EQ] << 24) | (this.Hw[this.EQ + 1] << 16)) | (this.Hw[this.EQ + 2] << '\b')) | this.Hw[this.EQ + 3];
                        this.J8 = (((this.Hw[this.EQ + 4] << 24) | (this.Hw[this.EQ + 5] << 16)) | (this.Hw[this.EQ + 6] << '\b')) | this.Hw[this.EQ + 7];
                        this.EQ += 8;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                    { $pc2 = 37; continue $sw2; }
                }
                case 50: {
                    try {
                        throw new java.lang.RuntimeException("Incomplete buffer while reading position");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                }
                case 75: {
                    return;
                }
                case 53: {
                    try {
                        throw new java.lang.IllegalArgumentException("Trying to advance to position not yet read");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                }
                case 55: {
                    try {
                        throw new java.lang.IllegalArgumentException("getLine(), getColumn() must be called for monotonically increasing values");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 10: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 14; continue $sw3; }
                    abcd.wu.j6(th, 2540021048482679160L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(2540021048482679160L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        FH(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    if (r9 == false) { $pc3 = 9; continue $sw3; }
                    return this.J0;
                }
                case 9: {
                    return this.u7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1680727992679029448L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1680727992679029448L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.FH = null;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 10: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 14; continue $sw5; }
                    abcd.wu.j6(th, 1046429192824092328L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(1046429192824092328L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        FH(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    if (r9 == false) { $pc5 = 9; continue $sw5; }
                    return this.J8;
                }
                case 9: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 6603622254896705L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(6603622254896705L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.u7 = 0;
                        this.tp = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.Reader r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 483606290191106647L, this, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(483606290191106647L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        this.FH = r5;
                        this.v5 = 0;
                        this.Zo = 0;
                        this.VH = 0;
                        this.gn = 0;
                        this.u7 = 1;
                        this.tp = 1;
                        this.we = -1;
                        this.Ws = false;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(char[] r10, int r11, int r12) {
        char[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        char r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 36: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 41; continue $sw8; }
                    abcd.wu.j6(th, 7073394677899606328L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    $pc8 = 41; continue $sw8;
                }
                case 41: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(7073394677899606328L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (this.Ws == false) { $pc8 = 9; continue $sw8; }
                    return -1;
                }
                case 9: {
                    if (this.Zo != this.v5) { $pc8 = 13; continue $sw8; }
                    try {
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    if (this.Ws == false) { $pc8 = 13; continue $sw8; }
                    return -1;
                }
                case 13: {
                    try {
                        r0 = this.Hw;
                        r1 = this.Zo;
                        r2 = this.Zo + java.lang.Math.min(this.v5 - this.Zo, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    r3 = r11;
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    if (r1 >= r2) { $pc8 = 30; continue $sw8; }
                    try {
                        r4 = r0[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    if (r4 == 65534) { $pc8 = 18; continue $sw8; }
                    try {
                        r10[r3] = r4;
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    $pc8 = 29; continue $sw8;
                }
                case 29: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    { $pc8 = 14; continue $sw8; }
                }
                case 18: {
                    try {
                        r1 = r1 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    if (r1 < this.v5) { $pc8 = 27; continue $sw8; }
                    try {
                        r5 = (r1 - this.v5) + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    r6 = 0;
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    if (r6 >= r5) { $pc8 = 27; continue $sw8; }
                    try {
                        r7 = this.FH.read();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    if (r7 < 0) { $pc8 = 26; continue $sw8; }
                    try {
                        r8 = this.v5;
                        this.v5 = r8 + 1;
                        r0[r8] = (char) r7;
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    { $pc8 = 21; continue $sw8; }
                }
                case 26: {
                    try {
                        throw new java.lang.RuntimeException("EOF encountered while reading position");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                }
                case 27: {
                    if (r1 < r2) { $pc8 = 29; continue $sw8; }
                    try {
                        r2 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    { $pc8 = 29; continue $sw8; }
                }
                case 30: {
                    try {
                        this.Zo = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 36; continue $sw8;
                    }
                    if (r3 != r11) { $pc8 = 35; continue $sw8; }
                    return read(r10, r11, r12);
                }
                case 35: {
                    return r3 - r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
