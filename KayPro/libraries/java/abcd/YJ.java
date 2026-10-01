package abcd;

public class YJ {
    private static final abcd.TJ[] j6 = null;
    private final abcd.IE DW;
    abcd.TJ EQ;
    private final abcd.uE FH;
    private abcd.AbstractjK Hw;
    private boolean VH;
    private boolean Zo;
    private int gn;
    private boolean tp;
    private boolean u7;
    abcd.TJ[] v5;

    static {
        j6 = new abcd.TJ[0];
    }

    public YJ(abcd.IE r2) {
        this.FH = new abcd.uE();
        this.DW = r2;
        this.Hw = abcd.AbstractjK.j6;
        this.v5 = j6;
    }

    public YJ(abcd.UE r1) {
        this(r1.j3());
    }

    static java.lang.String DW(abcd.TJ r3) {
        return abcd.IK.j6(abcd.hE.Zo, r3.Zo, 0, r3.gn);
    }

    private abcd.UJ FH(abcd.YD r3) {
        abcd.UJ r0 = new abcd.UJ();
        r0.DW(this.DW, r3);
        return r0;
    }

    private void QX() {
        int r0 = 0;
        int r1 = 0;
        abcd.TJ[] r2 = null;
        abcd.TJ r3 = null;
        int r4 = 0;
        abcd.TJ r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.gn--;
                    r0 = 0;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = this.v5;
                    if (r1 >= r2.length) { $pc0 = 5; continue $sw0; }
                    r2[r1] = r2[r1].DW;
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r3 = null;
                    r4 = r2.length;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 >= r4) { $pc0 = 7; continue $sw0; }
                    r5 = r2[r0];
                    if (r5.FH != r5) { $pc0 = 16; continue $sw0; }
                    if (r3 != null) { $pc0 = 14; continue $sw0; }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r3 = r5;
                    { $pc0 = 16; continue $sw0; }
                }
                case 14: {
                    if (r5.DW(r3) < 0) { $pc0 = 15; continue $sw0; }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    r0 = r0 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    this.EQ = r3;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.YJ j6(abcd.IE r1, java.lang.String r2, abcd.YD... r3) {
        abcd.YJ r0 = null;
        abcd.fK r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.YJ(r1);
                    r4 = abcd.fK.j6(r2);
                    r0.j6(r4);
                    r0.j6(r3);
                    r0.j6(false);
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.EQ() == false) { $pc1 = 5; continue $sw1; }
                    if (r4.DW(r0) == true) { $pc1 = 9; continue $sw1; }
                    if (r0.u7() == false) { $pc1 = 4; continue $sw1; }
                    r0.j6();
                    { $pc1 = 4; continue $sw1; }
                }
                case 9: {
                    return r0;
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.YJ j6(abcd.UE r2, java.lang.String r3, abcd.mG r4) {
        return j6(r2, r3, new abcd.yE[]{r4});
    }

    public static abcd.YJ j6(abcd.UE r0, java.lang.String r1, abcd.YD... r2) {
        abcd.IE r3 = null;
        abcd.YJ r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3 = r0.j3();
                    try {
                        r4 = j6(r3, r1, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    r3.FH();
                    return r4;
                }
                case 6: {
                    th = $ex2;
                    r3.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(byte[] r1, int r2, int r3) {
        return abcd.IK.j6(abcd.hE.Zo, r1, r2, r3);
    }

    public abcd.AbstractjK DW() {
        return this.Hw;
    }

    public abcd.yE DW(int r3) {
        abcd.TJ r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r4 = this.v5[r3];
                    if (r4.FH != this.EQ) { $pc3 = 6; continue $sw3; }
                    return r4.v5();
                }
                case 6: {
                    return abcd.yE.Ws();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.YD r5) {
        abcd.TJ[] r0 = null;
        abcd.TJ r1 = null;
        abcd.TJ r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.v5;
                    if (r0.length != 1) { $pc4 = 12; continue $sw4; }
                    r1 = r0[0];
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r2 = r1.DW;
                    if (r2 == null) { $pc4 = 8; continue $sw4; }
                    r1 = r2;
                    { $pc4 = 5; continue $sw4; }
                }
                case 8: {
                    if ((r1 instanceof abcd.UJ) == false) { $pc4 = 10; continue $sw4; }
                    r1.FH = null;
                    r1.Hw = 0;
                    ((abcd.UJ) r1).DW(this.DW, r5);
                    this.v5[0] = r1;
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    this.u7 = false;
                    this.gn = 0;
                    return;
                }
                case 10: {
                    this.v5[0] = FH(r5);
                    { $pc4 = 13; continue $sw4; }
                }
                case 12: {
                    this.v5 = new abcd.TJ[]{FH(r5)};
                    { $pc4 = 13; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean EQ() {
        abcd.TJ[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.TJ r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 26: {
                    r1 = this.v5;
                    r2 = r1.length;
                    r3 = 0;
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    if (r3 >= r2) { $pc5 = 28; continue $sw5; }
                    r1[r3].J0();
                    r3 = r3 + 1;
                    { $pc5 = 27; continue $sw5; }
                }
                case 28: {
                    return false;
                }
                case 4: {
                    if (this.u7 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        this.u7 = false;
                        this.tp = false;
                        we();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r4 = tp();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4.DW() == true) { $pc5 = 9; continue $sw5; }
                    try {
                        this.EQ = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Hw.j6(this) == false) { $pc5 = 18; continue $sw5; }
                    if (this.Zo == false) { $pc5 = 24; continue $sw5; }
                    if (abcd.AbstractrE.j6.j6(r4.v5) == false) { $pc5 = 24; continue $sw5; }
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    try {
                        this.u7 = true;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 18: {
                    try {
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 6; continue $sw5; }
                }
                case 9: {
                    if (this.gn <= 0) { $pc5 = 15; continue $sw5; }
                    try {
                        QX();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.VH == true) { $pc5 = 12; continue $sw5; }
                    try {
                        we();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 6; continue $sw5; }
                }
                case 12: {
                    try {
                        this.u7 = true;
                        this.tp = true;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.sD) { $pc5 = 26; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 15: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        return this.EQ.gn;
    }

    public int FH(int r3) {
        abcd.TJ r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r4 = this.v5[r3];
                    if (r4.FH == this.EQ) { $pc6 = 7; continue $sw6; }
                    return 0;
                }
                case 7: {
                    return r4.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Hw() {
        return DW(this.EQ);
    }

    public void J0() {
        this.DW.FH();
    }

    public void J8() {
        this.v5 = j6;
        this.u7 = false;
        this.gn = 0;
    }

    public boolean VH() {
        return this.VH;
    }

    void Ws() {
        abcd.TJ r0 = null;
        int r1 = 0;
        abcd.TJ[] r2 = null;
        abcd.TJ r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.EQ;
                    r1 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r2 = this.v5;
                    if (r1 >= r2.length) { $pc7 = 5; continue $sw7; }
                    r3 = r2[r1];
                    if (r3.FH != r0) { $pc7 = 9; continue $sw7; }
                    r3.we();
                    r3.FH = null;
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Zo() {
        return this.v5.length;
    }

    public boolean gn() {
        return this.Zo;
    }

    public int j6(abcd.TJ r5) {
        abcd.TJ[] r0 = this.v5;
        int r1 = r0.length;
        abcd.TJ[] r2 = new abcd.TJ[r1 + 1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        r2[r1] = r5;
        r5.FH = null;
        r5.Hw = 0;
        this.v5 = r2;
        return r1;
    }

    public int j6(abcd.YD r1) {
        return j6(FH(r1));
    }

    public int j6(byte[] r7, int r8) {
        abcd.TJ r0 = null;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.EQ;
                    r1 = r0.Zo;
                    r2 = r0.gn;
                    r3 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r3 >= r2) { $pc8 = 11; continue $sw8; }
                    if (r3 >= r8) { $pc8 = 11; continue $sw8; }
                    r4 = (r1[r3] & 255) - (r7[r3] & 255);
                    if (r4 != 0) { $pc8 = 8; continue $sw8; }
                    r3 = r3 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 8: {
                    return r4;
                }
                case 11: {
                    if (r3 < r2) { $pc8 = 13; continue $sw8; }
                    if (r3 < r8) { $pc8 = 19; continue $sw8; }
                    return 0;
                }
                case 19: {
                    if (r7[r3] == 47) { $pc8 = 28; continue $sw8; }
                    return -1;
                }
                case 28: {
                    return 0;
                }
                case 13: {
                    if (r1[r3] == 47) { $pc8 = 26; continue $sw8; }
                    return -1;
                }
                case 26: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public <T extends abcd.TJ> T j6(int r2, java.lang.Class<T> r3) {
        T r4 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r4 = (T) this.v5[r2];
                    if (r4.FH == this.EQ) { $pc9 = 7; continue $sw9; }
                    return null;
                }
                case 7: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractrE j6(int r1) {
        return abcd.AbstractrE.DW(FH(r1));
    }

    public void j6() {
        abcd.TJ r0 = null;
        abcd.TJ[] r1 = null;
        int r3 = 0;
        abcd.TJ[] r4 = null;
        abcd.TJ r5 = null;
        abcd.TJ r6 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.EQ;
                    r1 = new abcd.TJ[this.v5.length];
                    r3 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    r4 = this.v5;
                    if (r3 >= r4.length) { $pc10 = 5; continue $sw10; }
                    r5 = r4[r3];
                    if (r5.FH == r0) { $pc10 = 10; continue $sw10; }
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    r6 = r5.j6();
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    r1[r3] = r6;
                    r3 = r3 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 10: {
                    if (r5.DW() == true) { $pc10 = 14; continue $sw10; }
                    if (abcd.AbstractrE.j6.j6(r5.v5) == false) { $pc10 = 14; continue $sw10; }
                    r6 = r5.j6(this.DW, this.FH);
                    { $pc10 = 15; continue $sw10; }
                }
                case 5: {
                    this.gn++;
                    this.u7 = false;
                    java.lang.System.arraycopy(r1, 0, r4, 0, r4.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.AbstractjK r1) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r1 != null) { $pc11 = 5; continue $sw11; }
                    r1 = abcd.AbstractjK.j6;
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    this.Hw = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.uE r3, int r4) {
        abcd.TJ r5 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r5 = this.v5[r4];
                    if (r5.FH != this.EQ) { $pc12 = 5; continue $sw12; }
                    r5.j6(r3);
                    return;
                }
                case 5: {
                    r3.Ws();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }

    public void j6(abcd.YD... r10) {
        abcd.TJ[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        abcd.TJ r5 = null;
        abcd.TJ r6 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.v5;
                    r1 = r0.length;
                    r2 = r10.length;
                    if (r2 == r1) { $pc13 = 6; continue $sw13; }
                    r0 = new abcd.TJ[r2];
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    r4 = 0;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r4 >= r2) { $pc13 = 8; continue $sw13; }
                    if (r4 >= r1) { $pc13 = 20; continue $sw13; }
                    r5 = this.v5[r4];
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    r6 = r5.DW;
                    if (r6 == null) { $pc13 = 15; continue $sw13; }
                    r5 = r6;
                    { $pc13 = 12; continue $sw13; }
                }
                case 15: {
                    if ((r5 instanceof abcd.UJ) == false) { $pc13 = 20; continue $sw13; }
                    if (r5.VH != 0) { $pc13 = 20; continue $sw13; }
                    r5.FH = null;
                    r5.Hw = 0;
                    ((abcd.UJ) r5).DW(this.DW, r10[r4]);
                    r0[r4] = r5;
                    $pc13 = 21; continue $sw13;
                }
                case 21: {
                    r4 = r4 + 1;
                    $pc13 = 20; continue $sw13;
                }
                case 20: {
                    r0[r4] = FH(r10[r4]);
                    { $pc13 = 21; continue $sw13; }
                }
                case 8: {
                    this.v5 = r0;
                    this.u7 = false;
                    this.gn = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r4, int r5) {
        abcd.TJ r0 = null;
        abcd.TJ[] r1 = null;
        abcd.TJ r6 = null;
        abcd.TJ r7 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.EQ;
                    r1 = this.v5;
                    r6 = r1[r4];
                    r7 = r1[r5];
                    if (r6.FH == r0) { $pc14 = 9; continue $sw14; }
                    if (r7.FH == r0) { $pc14 = 9; continue $sw14; }
                    return true;
                }
                case 9: {
                    if (r6.gn() == true) { $pc14 = 11; continue $sw14; }
                    $pc14 = 19; continue $sw14;
                }
                case 19: {
                    return false;
                }
                case 11: {
                    if (r7.gn() == false) { $pc14 = 19; continue $sw14; }
                    if (r6.FH != r0) { $pc14 = 19; continue $sw14; }
                    if (r7.FH != r0) { $pc14 = 19; continue $sw14; }
                    return r6.j6(r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.TJ tp() {
        int r1 = 0;
        abcd.TJ r0 = null;
        abcd.TJ[] r2 = null;
        abcd.TJ[] r3 = null;
        abcd.TJ r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r1 = 0;
                    r0 = this.v5[0];
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r0.DW() == false) { $pc15 = 10; continue $sw15; }
                    r1 = r1 + 1;
                    r2 = this.v5;
                    if (r1 >= r2.length) { $pc15 = 10; continue $sw15; }
                    r0 = r2[r1];
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    if (r0.DW() == false) { $pc15 = 12; continue $sw15; }
                    return r0;
                }
                case 12: {
                    r0.FH = r0;
                    $pc15 = 13; continue $sw15;
                }
                case 13: {
                    r1 = r1 + 1;
                    r3 = this.v5;
                    if (r1 >= r3.length) { $pc15 = 15; continue $sw15; }
                    r4 = r3[r1];
                    if (r4.DW() == true) { $pc15 = 13; continue $sw15; }
                    r5 = r4.DW(r0);
                    if (r5 < 0) { $pc15 = 21; continue $sw15; }
                    if (r5 != 0) { $pc15 = 13; continue $sw15; }
                    r4.FH = r0;
                    { $pc15 = 13; continue $sw15; }
                }
                case 21: {
                    r4.FH = r4;
                    r0 = r4;
                    { $pc15 = 13; continue $sw15; }
                }
                case 15: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        return abcd.AbstractrE.j6.j6(this.EQ.v5);
    }

    public byte[] v5() {
        abcd.TJ r0 = this.EQ;
        int r1 = r0.gn;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r0.Zo, 0, r2, 0, r1);
        return r2;
    }

    void we() {
        abcd.TJ r0 = null;
        int r1 = 0;
        abcd.TJ[] r2 = null;
        abcd.TJ r3 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.EQ;
                    r1 = 0;
                    $pc16 = 3; continue $sw16;
                }
                case 3: {
                    r2 = this.v5;
                    if (r1 >= r2.length) { $pc16 = 5; continue $sw16; }
                    r3 = r2[r1];
                    if (r3.FH != r0) { $pc16 = 9; continue $sw16; }
                    r3.FH(1);
                    r3.FH = null;
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc16 = 3; continue $sw16; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
