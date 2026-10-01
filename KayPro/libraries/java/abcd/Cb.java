package abcd;

@abcd.Interfacexu
public class Cb {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2741246541754232352L)
    private int[] FH;

    @abcd.Interfaceru(field = -2689474325645500761L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Cb.class, 1772296429983558735L, 1772296429983558735L);
    }

    public Cb() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1812504265671665600L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1812504265671665600L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = null;
                        this.Hw = 0;
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

    public Cb(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 44833406766386859L, null, new java.lang.Integer(r6));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(44833406766386859L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.FH = new int[r6];
                        this.Hw = r6;
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

    public Cb(abcd.ec r7) {
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 14: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, -334798370985474000L, null, r7);
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-334798370985474000L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.Hw = r7.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    if (this.Hw <= 0) { $pc2 = 13; continue $sw2; }
                    try {
                        this.FH = new int[this.Hw];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    r3 = 0;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r3 >= this.FH.length) { $pc2 = 24; continue $sw2; }
                    try {
                        this.FH[r3] = r7.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    r3 = r3 + 1;
                    { $pc2 = 9; continue $sw2; }
                }
                case 24: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 8592412082527781793L)
    private void DW(int r8, int r9) {
        int r1 = 0;
        int r2 = 0;
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 21: {
                    th = th;
                    r1 = r8;
                    r2 = r9;
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    if (DW == false) { $pc3 = 27; continue $sw3; }
                    abcd.wu.j6(th, 6476239322047086384L, this, new java.lang.Integer(r1), new java.lang.Integer(r2));
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    throw th;
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(6476239322047086384L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 21; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r8 >= r9) { $pc3 = 40; continue $sw3; }
                    try {
                        r0 = this.FH[((r9 - r8) / 2) + r8];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 21; continue $sw3;
                    }
                    r1 = r8;
                    r2 = r9;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r1 > r2) { $pc3 = 19; continue $sw3; }
                    $pc3 = 29; continue $sw3;
                }
                case 29: {
                    $pc3 = 10; continue $sw3;
                }
                case 17: {
                    th = th;
                    { $pc3 = 24; continue $sw3; }
                }
                case 10: {
                    if (this.FH[r1] >= r0) { $pc3 = 13; continue $sw3; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r0 >= this.FH[r2]) { $pc3 = 15; continue $sw3; }
                    try {
                        r2 = r2 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    { $pc3 = 13; continue $sw3; }
                }
                case 15: {
                    if (r1 > r2) { $pc3 = 8; continue $sw3; }
                    try {
                        r3 = this.FH[r2];
                        this.FH[r2] = this.FH[r1];
                        this.FH[r1] = r3;
                        r1 = r1 + 1;
                        r2 = r2 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    { $pc3 = 8; continue $sw3; }
                }
                case 19: {
                    try {
                        DW(r8, r2);
                        DW(r1, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    return;
                }
                case 40: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 16; continue $sw4; }
                    abcd.wu.j6(th, -838419201184654845L, this);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(-838419201184654845L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (this.Hw != 0) { $pc4 = 10; continue $sw4; }
                    return -1;
                }
                case 10: {
                    return DW(this.Hw - 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 17: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 21; continue $sw5; }
                    abcd.wu.j6(th, -4807456511014428765L, this, new java.lang.Integer(r5));
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-4807456511014428765L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 17; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (this.FH != null) { $pc5 = 10; continue $sw5; }
                    return -1;
                }
                case 10: {
                    if (r5 < this.FH.length) { $pc5 = 13; continue $sw5; }
                    return -1;
                }
                case 13: {
                    if (r5 < this.Hw) { $pc5 = 15; continue $sw5; }
                    return -1;
                }
                case 15: {
                    return this.FH[r5];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        int[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, 568608656937265713L, this);
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(568608656937265713L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (this.Hw != 0) { $pc6 = 10; continue $sw6; }
                    return -1;
                }
                case 10: {
                    try {
                        r2 = this.FH;
                        r3 = this.Hw - 1;
                        this.Hw = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    return r2[r3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 6169686089017505477L, this, new java.lang.Integer(r5));
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(6169686089017505477L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        j6(r5);
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

    public int Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -837821790407373349L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-837821790407373349L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(int r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 14: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 18; continue $sw9; }
                    abcd.wu.j6(th, 4447896482021548145L, this, new java.lang.Integer(r7));
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(4447896482021548145L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 14; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (this.FH != null) { $pc9 = 10; continue $sw9; }
                    return;
                }
                case 10: {
                    if (r7 < this.Hw) { $pc9 = 12; continue $sw9; }
                    return;
                }
                case 12: {
                    try {
                        java.lang.System.arraycopy(this.FH, r7 + 1, this.FH, r7, (this.Hw - r7) - 1);
                        this.Hw--;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 14; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r8) {
        abcd.Cb r2 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 21: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 26; continue $sw10; }
                    abcd.wu.j6(th, 223935440798815320L, this, r8);
                    $pc10 = 26; continue $sw10;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 7; continue $sw10; }
                    try {
                        abcd.wu.j6(223935440798815320L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if ((r8 instanceof abcd.Cb) == true) { $pc10 = 9; continue $sw10; }
                    return false;
                }
                case 9: {
                    try {
                        r2 = (abcd.Cb) r8;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 21; continue $sw10;
                    }
                    if (this.Hw == r2.Hw) { $pc10 = 12; continue $sw10; }
                    return false;
                }
                case 12: {
                    r4 = 0;
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    if (r4 >= this.Hw) { $pc10 = 19; continue $sw10; }
                    if (DW(r4) != r2.DW(r4)) { $pc10 = 17; continue $sw10; }
                    r4 = r4 + 1;
                    { $pc10 = 13; continue $sw10; }
                }
                case 17: {
                    return false;
                }
                case 19: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -1412049244061192187L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-1412049244061192187L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.Hw = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r7) {
        int[] r2 = null;
        int r3 = 0;
        int[] r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 14: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 18; continue $sw12; }
                    abcd.wu.j6(th, -5542839875055269188L, this, new java.lang.Integer(r7));
                    $pc12 = 18; continue $sw12;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(-5542839875055269188L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (this.FH != null) { $pc12 = 10; continue $sw12; }
                    try {
                        this.FH = new int[10];
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    try {
                        r2 = this.FH;
                        r3 = this.Hw;
                        this.Hw = r3 + 1;
                        r2[r3] = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    return;
                }
                case 10: {
                    if (this.Hw < this.FH.length) { $pc12 = 12; continue $sw12; }
                    try {
                        r4 = new int[(this.FH.length * 2) + 1];
                        java.lang.System.arraycopy(this.FH, 0, r4, 0, this.FH.length);
                        this.FH = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 14; continue $sw12;
                    }
                    { $pc12 = 12; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, int r9) {
        int[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 16: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 20; continue $sw13; }
                    abcd.wu.j6(th, -2919152307333001580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc13 = 20; continue $sw13;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-2919152307333001580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    if (this.FH != null) { $pc13 = 9; continue $sw13; }
                    try {
                        this.FH = new int[java.lang.Math.max(10, r8 + 1)];
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    if (r8 < this.Hw) { $pc13 = 14; continue $sw13; }
                    try {
                        this.Hw = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    try {
                        this.FH[r8] = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    return;
                }
                case 9: {
                    if (r8 < this.FH.length) { $pc13 = 12; continue $sw13; }
                    try {
                        r0 = new int[java.lang.Math.max(r8 + 1, (this.FH.length * 2) + 1)];
                        java.lang.System.arraycopy(this.FH, 0, r0, 0, this.FH.length);
                        this.FH = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    { $pc13 = 12; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.fc r5) {
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 15: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 20; continue $sw14; }
                    abcd.wu.j6(th, -5896539441114979352L, this, r5);
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-5896539441114979352L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 15; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r3 = 0;
                    if (this.FH != null) { $pc14 = 9; continue $sw14; }
                    try {
                        r5.writeInt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 15; continue $sw14;
                    }
                    return;
                }
                case 9: {
                    try {
                        r5.writeInt(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 15; continue $sw14;
                    }
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    if (r3 >= this.Hw) { $pc14 = 24; continue $sw14; }
                    try {
                        r5.writeInt(this.FH[r3]);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 15; continue $sw14;
                    }
                    r3 = r3 + 1;
                    { $pc14 = 11; continue $sw14; }
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 12: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 17; continue $sw15; }
                    abcd.wu.j6(th, -883228644126773492L, this);
                    $pc15 = 17; continue $sw15;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(-883228644126773492L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    r2 = "{";
                    r3 = 0;
                    $pc15 = 8; continue $sw15;
                }
                case 8: {
                    if (r3 >= this.Hw) { $pc15 = 10; continue $sw15; }
                    try {
                        r2 = r2 + this.FH[r3] + ", ";
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    { $pc15 = 8; continue $sw15; }
                }
                case 10: {
                    return r2 + "}";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -838415478933956000L, this);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-838415478933956000L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        DW(0, this.Hw - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, 125597264603791088L, this, new java.lang.Integer(r5));
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(125597264603791088L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        this.Hw = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
