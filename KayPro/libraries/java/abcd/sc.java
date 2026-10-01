package abcd;

@abcd.Interfacexu
public class sc {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1163465277969364720L)
    private final abcd.La FH;

    @abcd.Interfaceru(field = -1567882820142547216L)
    protected char[] Hw;

    @abcd.Interfaceru(field = -5085882770732288448L)
    protected int Zo;

    @abcd.Interfaceru(field = -1564011502060302592L)
    protected int v5;

    static {
        abcd.wu.j6(abcd.sc.class, -852481163335970448L, -852481163335970448L);
    }

    public sc(abcd.La r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1229876428548785625L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1229876428548785625L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Hw = new char[100];
                        this.v5 = 0;
                        this.Zo = 0;
                        this.FH = r6;
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

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 1135715074626110139L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(1135715074626110139L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.v5 = 0;
                        this.Zo = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 58544816190744289L)
    protected final void DW(int r7) {
        int r2 = 0;
        char[] r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 14: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, -5255461686612134251L, this, new java.lang.Integer(r7));
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-5255461686612134251L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if ((this.v5 + r7) < this.Hw.length) { $pc2 = 25; continue $sw2; }
                    try {
                        r2 = this.Hw.length;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    try {
                        r2 = r2 * 2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    if ((this.v5 + r7) >= r2) { $pc2 = 11; continue $sw2; }
                    try {
                        r3 = new char[r2];
                        java.lang.System.arraycopy(this.Hw, 0, r3, 0, this.v5);
                        this.Hw = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(java.lang.String r7) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 18: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 23; continue $sw3; }
                    abcd.wu.j6(th, -95016601307592300L, this, r7);
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-95016601307592300L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r7.length() == this.v5) { $pc3 = 9; continue $sw3; }
                    return false;
                }
                case 9: {
                    r2 = 0;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if (r2 >= this.v5) { $pc3 = 16; continue $sw3; }
                    if (this.Hw[r2] != r7.charAt(r2)) { $pc3 = 14; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 10; continue $sw3; }
                }
                case 14: {
                    return false;
                }
                case 16: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -4041256069273710253L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-4041256069273710253L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return this.FH.j3.j6(this.Hw, 0, this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(java.lang.String r8) {
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 19: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 24; continue $sw5; }
                    abcd.wu.j6(th, -582745585163359761L, this, r8);
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-582745585163359761L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 19; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r3 = 0;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r3 > (this.v5 - r8.length())) { $pc5 = 17; continue $sw5; }
                    r4 = 0;
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    if (r4 >= r8.length()) { $pc5 = 16; continue $sw5; }
                    if (this.Hw[r3 + r4] != r8.charAt(r4)) { $pc5 = 14; continue $sw5; }
                    r4 = r4 + 1;
                    { $pc5 = 11; continue $sw5; }
                }
                case 14: {
                    r3 = r3 + 1;
                    { $pc5 = 7; continue $sw5; }
                }
                case 16: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.Reader Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -216273785863105581L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-216273785863105581L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return new java.io.CharArrayReader(this.Hw, 0, this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        int r2 = 0;
        char r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 15: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 20; continue $sw7; }
                    abcd.wu.j6(th, 4257971017659738489L, this);
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(4257971017659738489L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    r2 = 0;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r2 >= this.v5) { $pc7 = 14; continue $sw7; }
                    try {
                        r3 = this.Hw[r2];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    if (r3 != 65534) { $pc7 = 12; continue $sw7; }
                    try {
                        r2 = r2 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    r2 = r2 + 1;
                    { $pc7 = 7; continue $sw7; }
                }
                case 12: {
                    try {
                        this.Hw[r2] = java.lang.Character.toUpperCase(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    { $pc7 = 13; continue $sw7; }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 25152940034563500L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(25152940034563500L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        j6(0, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(char r7) {
        char[] r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 4794298806826596921L, this, new java.lang.Character(r7));
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(4794298806826596921L, this, new java.lang.Character(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        DW(1);
                        r3 = this.Hw;
                        r4 = this.v5;
                        this.v5 = r4 + 1;
                        r3[r4] = r7;
                        this.Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r7) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 265524541951657952L, this, new java.lang.Integer(r7));
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(265524541951657952L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        r2 = this.FH.j3.DW(r7);
                        DW(r2);
                        this.FH.j3.j6(r7, this.Hw, this.v5);
                        this.v5 += r2;
                        this.Zo += r2;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, int r9) {
        char[] r0 = null;
        int r1 = 0;
        char[] r2 = null;
        int r3 = 0;
        char[] r4 = null;
        int r5 = 0;
        char[] r6 = null;
        int r7 = 0;
        char[] r10 = null;
        int r11 = 0;
        char[] r12 = null;
        int r13 = 0;
        char[] r14 = null;
        int r15 = 0;
        char[] r16 = null;
        int r17 = 0;
        char[] r18 = null;
        int r19 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 7: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 11; continue $sw11; }
                    abcd.wu.j6(th, 2302798679034330499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(2302798679034330499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        DW(9);
                        r0 = this.Hw;
                        r1 = this.v5;
                        this.v5 = r1 + 1;
                        r0[r1] = 65534;
                        r2 = this.Hw;
                        r3 = this.v5;
                        this.v5 = r3 + 1;
                        r2[r3] = (char) ((r8 >>> 24) & 255);
                        r4 = this.Hw;
                        r5 = this.v5;
                        this.v5 = r5 + 1;
                        r4[r5] = (char) ((r8 >>> 16) & 255);
                        r6 = this.Hw;
                        r7 = this.v5;
                        this.v5 = r7 + 1;
                        r6[r7] = (char) ((r8 >>> 8) & 255);
                        r10 = this.Hw;
                        r11 = this.v5;
                        this.v5 = r11 + 1;
                        r10[r11] = (char) ((r8 >>> 0) & 255);
                        r12 = this.Hw;
                        r13 = this.v5;
                        this.v5 = r13 + 1;
                        r12[r13] = (char) ((r9 >>> 24) & 255);
                        r14 = this.Hw;
                        r15 = this.v5;
                        this.v5 = r15 + 1;
                        r14[r15] = (char) ((r9 >>> 16) & 255);
                        r16 = this.Hw;
                        r17 = this.v5;
                        this.v5 = r17 + 1;
                        r16[r17] = (char) ((r9 >>> 8) & 255);
                        r18 = this.Hw;
                        r19 = this.v5;
                        this.v5 = r19 + 1;
                        r18[r19] = (char) ((r9 >>> 0) & 255);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.sc r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, 3944732640918947187L, this, r8);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(3944732640918947187L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        DW(r8.v5);
                        java.lang.System.arraycopy(r8.Hw, 0, this.Hw, this.v5, r8.v5);
                        this.v5 += r8.v5;
                        this.Zo += r8.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.sc r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 14: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 19; continue $sw13; }
                    abcd.wu.j6(th, -715750175023512399L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc13 = 19; continue $sw13;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc13 = 5; continue $sw13; }
                    try {
                        abcd.wu.j6(-715750175023512399L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    try {
                        DW(r11);
                        java.lang.System.arraycopy(r9.Hw, r10, this.Hw, this.v5, r11);
                        r0 = this.v5 + r11;
                        r1 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    if (r1 >= r0) { $pc13 = 12; continue $sw13; }
                    if (this.Hw[r1] != 65534) { $pc13 = 10; continue $sw13; }
                    try {
                        r1 = r1 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    { $pc13 = 6; continue $sw13; }
                }
                case 10: {
                    try {
                        this.Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    { $pc13 = 11; continue $sw13; }
                }
                case 12: {
                    try {
                        this.v5 = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 14; continue $sw13;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r7) {
        int r2 = 0;
        char[] r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 12: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 17; continue $sw14; }
                    abcd.wu.j6(th, -103440080495285136L, this, r7);
                    $pc14 = 17; continue $sw14;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-103440080495285136L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        DW(r7.length());
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    r2 = 0;
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (r2 >= r7.length()) { $pc14 = 11; continue $sw14; }
                    try {
                        r3 = this.Hw;
                        r4 = this.v5;
                        this.v5 = r4 + 1;
                        r3[r4] = r7.charAt(r2);
                        this.Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    r2 = r2 + 1;
                    { $pc14 = 7; continue $sw14; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(char[] r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        char[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 10: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 15; continue $sw15; }
                    abcd.wu.j6(th, 190738705975047104L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(190738705975047104L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 10; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        DW(r11);
                        r0 = r10 + r11;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 10; continue $sw15;
                    }
                    r1 = r10;
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    if (r1 >= r0) { $pc15 = 9; continue $sw15; }
                    try {
                        r2 = this.Hw;
                        r3 = this.v5;
                        this.v5 = r3 + 1;
                        r2[r3] = r9[r1];
                        this.Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 10; continue $sw15;
                    }
                    r1 = r1 + 1;
                    { $pc15 = 6; continue $sw15; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(java.lang.String r8, int r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 17: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 22; continue $sw16; }
                    abcd.wu.j6(th, 1441655871692487527L, this, r8, new java.lang.Integer(r9));
                    $pc16 = 22; continue $sw16;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(1441655871692487527L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 17; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    if ((r8.length() + r9) <= this.v5) { $pc16 = 8; continue $sw16; }
                    return false;
                }
                case 8: {
                    r0 = 0;
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    if (r0 >= r8.length()) { $pc16 = 15; continue $sw16; }
                    if (this.Hw[r9 + r0] != r8.charAt(r0)) { $pc16 = 13; continue $sw16; }
                    r0 = r0 + 1;
                    { $pc16 = 9; continue $sw16; }
                }
                case 13: {
                    return false;
                }
                case 15: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r2 = null;
        int r3 = 0;
        char r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 16: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 21; continue $sw17; }
                    abcd.wu.j6(th, -2266833613108730400L, this);
                    $pc17 = 21; continue $sw17;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(-2266833613108730400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        r2 = new java.lang.StringBuffer(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    r3 = 0;
                    $pc17 = 8; continue $sw17;
                }
                case 8: {
                    if (r3 >= this.v5) { $pc17 = 14; continue $sw17; }
                    try {
                        r4 = this.Hw[r3];
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    if (r4 != 65534) { $pc17 = 12; continue $sw17; }
                    try {
                        r5 = r3 + 1;
                        r2.append("#[");
                        r6 = (((this.Hw[r5] << 24) | (this.Hw[r5 + 1] << 16)) | (this.Hw[r5 + 2] << '\b')) | this.Hw[r5 + 3];
                        r7 = ((this.Hw[r5 + 4] << 24) | (this.Hw[r5 + 5] << 16)) | (this.Hw[r5 + 6] << '\b');
                        r3 = r5 + 7;
                        r8 = r7 | this.Hw[r3];
                        r2.append(r6);
                        r2.append(", ");
                        r2.append(r8);
                        r2.append("]");
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    { $pc17 = 8; continue $sw17; }
                }
                case 12: {
                    try {
                        r2.append(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 16; continue $sw17;
                    }
                    { $pc17 = 13; continue $sw17; }
                }
                case 14: {
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 2220572928664209460L, this);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(2220572928664209460L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
