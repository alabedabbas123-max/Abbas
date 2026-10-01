package abcd;

public class XJ extends abcd.YJ {
    private static final int we = 0;
    private boolean J0;
    private abcd.TJ J8;

    static {
        we = abcd.AbstractrE.j6.DW();
    }

    public XJ(abcd.IE r1) {
        super(r1);
    }

    public XJ(abcd.UE r1) {
        this(r1.j3());
    }

    private abcd.TJ FH(abcd.TJ r9) {
        abcd.TJ[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.TJ r4 = null;
        int r3 = 0;
        abcd.TJ r5 = null;
        int r6 = 0;
        int r7 = 0;
        abcd.TJ[] r8 = null;
        int r10 = 0;
        abcd.TJ r11 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.v5;
                    r1 = r0.length;
                    r2 = 0;
                    r4 = null;
                    r3 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r3 >= r1) { $pc0 = 4; continue $sw0; }
                    r5 = r0[r3];
                    if (r5.FH == r9) { $pc0 = 31; continue $sw0; }
                    if (r5.DW() == true) { $pc0 = 31; continue $sw0; }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    r6 = r5.j6(r9, we);
                    if (r6 >= 0) { $pc0 = 26; continue $sw0; }
                    r5.Hw++;
                    r5.FH(1);
                    if (r5.DW() == false) { $pc0 = 21; continue $sw0; }
                    r5.j6(r5.Hw);
                    r5.Hw = 0;
                    { $pc0 = 31; continue $sw0; }
                }
                case 26: {
                    if (r6 != 0) { $pc0 = 28; continue $sw0; }
                    r5.FH = r9;
                    r4 = r5;
                    { $pc0 = 31; continue $sw0; }
                }
                case 28: {
                    r7 = r5.Hw;
                    if (r7 == 0) { $pc0 = 31; continue $sw0; }
                    r5.j6(r7);
                    r5.Hw = 0;
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    r3 = r3 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    if (r4 == null) { $pc0 = 15; continue $sw0; }
                    r8 = this.v5;
                    r10 = r8.length;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r2 >= r10) { $pc0 = 8; continue $sw0; }
                    r11 = r8[r2];
                    if (r11.FH != r9) { $pc0 = 14; continue $sw0; }
                    r11.FH = r4;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r2 = r2 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    if (this.J8 != null) { $pc0 = 10; continue $sw0; }
                    this.J8 = r4;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return r4;
                }
                case 15: {
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean Hw(abcd.TJ r1) {
        return abcd.AbstractrE.j6.j6(r1.v5);
    }

    private abcd.TJ XL() {
        abcd.TJ r1 = null;
        int r3 = 0;
        abcd.TJ[] r4 = null;
        abcd.TJ r5 = null;
        boolean r2 = false;
        abcd.TJ[] r6 = null;
        abcd.TJ r7 = null;
        int r8 = 0;
        int r9 = 0;
        abcd.TJ r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.J0 = true;
                    r1 = this.v5[0];
                    r3 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1.DW() == false) { $pc1 = 10; continue $sw1; }
                    r3 = r3 + 1;
                    r4 = this.v5;
                    if (r3 >= r4.length) { $pc1 = 10; continue $sw1; }
                    r1 = r4[r3];
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r1.DW() == false) { $pc1 = 12; continue $sw1; }
                    return r1;
                }
                case 12: {
                    r1.FH = r1;
                    r5 = r1;
                    r2 = false;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r3 = r3 + 1;
                    r6 = this.v5;
                    if (r3 >= r6.length) { $pc1 = 15; continue $sw1; }
                    r7 = r6[r3];
                    if (r7.DW() == true) { $pc1 = 13; continue $sw1; }
                    r8 = r7.DW(r5);
                    if (r8 < 0) { $pc1 = 28; continue $sw1; }
                    if (r8 != 0) { $pc1 = 41; continue $sw1; }
                    r7.FH = r5;
                    { $pc1 = 13; continue $sw1; }
                }
                case 41: {
                    if (this.J0 == false) { $pc1 = 55; continue $sw1; }
                    if (Hw(r7) == false) { $pc1 = 55; continue $sw1; }
                    if (Hw(r5) == true) { $pc1 = 55; continue $sw1; }
                    if (j6(r7, r5) == false) { $pc1 = 55; continue $sw1; }
                    r9 = 0;
                    $pc1 = 49; continue $sw1;
                }
                case 49: {
                    if (r9 >= r3) { $pc1 = 50; continue $sw1; }
                    r10 = this.v5[r9];
                    if (r10.FH != r5) { $pc1 = 54; continue $sw1; }
                    r10.FH = r7;
                    $pc1 = 54; continue $sw1;
                }
                case 54: {
                    r9 = r9 + 1;
                    { $pc1 = 49; continue $sw1; }
                }
                case 50: {
                    r7.FH = r7;
                    r5 = r7;
                    $pc1 = 36; continue $sw1;
                }
                case 36: {
                    r2 = true;
                    $pc1 = 55; continue $sw1;
                }
                case 55: {
                    this.J0 = false;
                    { $pc1 = 13; continue $sw1; }
                }
                case 28: {
                    if (this.J0 == false) { $pc1 = 37; continue $sw1; }
                    if (Hw(r5) == false) { $pc1 = 37; continue $sw1; }
                    if (Hw(r7) == true) { $pc1 = 37; continue $sw1; }
                    if (j6(r5, r7) == false) { $pc1 = 37; continue $sw1; }
                    r7.FH = r5;
                    $pc1 = 37; continue $sw1;
                }
                case 37: {
                    this.J0 = false;
                    r7.FH = r7;
                    r5 = r7;
                    { $pc1 = 13; continue $sw1; }
                }
                case 15: {
                    if (r2 == true) { $pc1 = 17; continue $sw1; }
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    return r5;
                }
                case 17: {
                    if (this.J0 == false) { $pc1 = 21; continue $sw1; }
                    if (this.J8 != null) { $pc1 = 21; continue $sw1; }
                    this.J8 = r5;
                    { $pc1 = 21; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(abcd.TJ r1, abcd.TJ r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1.j6(r2, we) != 0) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean v5(abcd.TJ r9) {
        abcd.TJ[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        abcd.TJ r4 = null;
        int r5 = 0;
        int r7 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5;
                    r1 = r0.length;
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r1) { $pc3 = 4; continue $sw3; }
                    r4 = r0[r3];
                    if (r4.FH == r9) { $pc3 = 19; continue $sw3; }
                    if (r4.FH() == true) { $pc3 = 19; continue $sw3; }
                    r5 = 0;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r5 = r5 + 1;
                    r4.j6(1);
                    r7 = r4.j6(r9, 0);
                    if (r7 == 0) { $pc3 = 13; continue $sw3; }
                    if (r7 < 0) { $pc3 = 18; continue $sw3; }
                    if (r4.FH() == false) { $pc3 = 11; continue $sw3; }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    r4.FH(r5);
                    { $pc3 = 19; continue $sw3; }
                }
                case 13: {
                    r4.FH(r5);
                    return true;
                }
                case 19: {
                    r3 = r3 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean QX() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.J8 == null) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void Ws() {
        abcd.TJ r0 = null;
        int r2 = 0;
        abcd.TJ[] r3 = null;
        abcd.TJ r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.EQ;
                    r2 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    r3 = this.v5;
                    if (r2 >= r3.length) { $pc5 = 6; continue $sw5; }
                    r4 = r3[r2];
                    if (r4.FH != r0) { $pc5 = 16; continue $sw5; }
                    r5 = r4.Hw;
                    if (r5 != 0) { $pc5 = 14; continue $sw5; }
                    r4.we();
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r4.FH = null;
                    { $pc5 = 16; continue $sw5; }
                }
                case 14: {
                    r4.j6(r5);
                    r4.Hw = 0;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    r2 = r2 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 6: {
                    if (r0 != this.J8) { $pc5 = 20; continue $sw5; }
                    this.J8 = null;
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    abcd.TJ tp() {
        abcd.TJ r0 = null;
        abcd.TJ[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.TJ r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 2;
        $sw6: while (true) {
            switch ($pc6) {
                case 2: {
                    r0 = XL();
                    if (this.J0 == true) { $pc6 = 4; continue $sw6; }
                    if (Hw(r0) == false) { $pc6 = 18; continue $sw6; }
                    if (v5(r0) == false) { $pc6 = 16; continue $sw6; }
                    r1 = this.v5;
                    r2 = r1.length;
                    r3 = 0;
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r3 >= r2) { $pc6 = 2; continue $sw6; }
                    r4 = r1[r3];
                    if (r4.FH != r0) { $pc6 = 15; continue $sw6; }
                    r4.FH(1);
                    r4.FH = null;
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    r3 = r3 + 1;
                    { $pc6 = 10; continue $sw6; }
                }
                case 16: {
                    return r0;
                }
                case 18: {
                    return FH(r0);
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void we() {
        abcd.TJ r0 = null;
        int r2 = 0;
        abcd.TJ[] r3 = null;
        abcd.TJ r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.EQ;
                    r2 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r3 = this.v5;
                    if (r2 >= r3.length) { $pc7 = 6; continue $sw7; }
                    r4 = r3[r2];
                    if (r4.FH != r0) { $pc7 = 16; continue $sw7; }
                    r5 = r4.Hw;
                    if (r5 != 0) { $pc7 = 14; continue $sw7; }
                    r4.FH(1);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    r4.FH = null;
                    { $pc7 = 16; continue $sw7; }
                }
                case 14: {
                    r4.j6(r5);
                    r4.Hw = 0;
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    r2 = r2 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 6: {
                    if (r0 != this.J8) { $pc7 = 20; continue $sw7; }
                    this.J8 = null;
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
