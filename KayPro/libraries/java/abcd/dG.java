package abcd;

public class dG extends abcd.AbstractiG {
    static final abcd.dG[] we = null;
    private abcd.mG J0;
    abcd.dG[] J8;
    int QX;
    int Ws;
    private byte[] XL;

    static {
        we = new abcd.dG[0];
    }

    protected dG(abcd.YD r1) {
        super(r1);
    }

    static void j6(abcd.dG r5, int r6) {
        abcd.dG[] r7 = null;
        int r0 = 0;
        int r1 = 0;
        abcd.dG r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r7 = r5.J8;
                    if (r7 == null) { $pc0 = 4; continue $sw0; }
                    r0 = r7.length;
                    if (r0 == 0) { $pc0 = 7; continue $sw0; }
                    r1 = 1;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r1 >= r0) { $pc0 = 10; continue $sw0; }
                    r2 = r7[r1];
                    r3 = r2.EQ;
                    if ((r3 & r6) == r6) { $pc0 = 18; continue $sw0; }
                    r2.EQ = r3 | r6;
                    j6(r2, r6);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    r1 = r1 + 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 10: {
                    r5 = r7[0];
                    r4 = r5.EQ;
                    if ((r4 & r6) == r6) { $pc0 = 12; continue $sw0; }
                    r5.EQ = r4 | r6;
                    { $pc0 = 2; continue $sw0; }
                }
                case 12: {
                    return;
                }
                case 7: {
                    return;
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(byte[] r2, int r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    if (r3 >= r4) { $pc1 = 3; continue $sw1; }
                    r0 = r3 + 1;
                    if (r2[r3] == 10) { $pc1 = 7; continue $sw1; }
                    r3 = r0;
                    { $pc1 = 2; continue $sw1; }
                }
                case 7: {
                    return true;
                }
                case 3: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.dG DW(int r2) {
        return this.J8[r2];
    }

    void DW(abcd.qG r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.XL != null) { $pc2 = 8; continue $sw2; }
                    this.XL = r2.j6(this);
                    if ((this.EQ & 1) != 0) { $pc2 = 9; continue $sw2; }
                    j6(r2, this.XL);
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(abcd.fG r2) {
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.EQ;
                    r3 = r2.Hw & r0;
                    if (r3 == 0) { $pc3 = 6; continue $sw3; }
                    j6(this, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.KE Mr() {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.XL;
                    r1 = abcd.IK.j6(r0, 0);
                    if (r1 >= 0) { $pc4 = 7; continue $sw4; }
                    return null;
                }
                case 7: {
                    return abcd.IK.u7(r0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int U2() {
        return this.Ws;
    }

    public final java.lang.String a8() {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.XL;
                    r1 = abcd.IK.DW(r0, 0);
                    if (r1 >= 0) { $pc5 = 7; continue $sw5; }
                    return "";
                }
                case 7: {
                    return abcd.IK.j6(abcd.IK.DW(r0), r0, r1, r0.length);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final int aM() {
        return 1;
    }

    public final java.lang.String er() {
        byte[] r0 = null;
        int r1 = 0;
        java.nio.charset.Charset r2 = null;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.XL;
                    r1 = abcd.IK.DW(r0, 0);
                    if (r1 >= 0) { $pc6 = 6; continue $sw6; }
                    return "";
                }
                case 6: {
                    r2 = abcd.IK.DW(r0);
                    r3 = abcd.IK.v5(r0, r1);
                    r4 = abcd.IK.j6(r2, r0, r1, r3);
                    if (j6(r0, r1, r3) == true) { $pc6 = 9; continue $sw6; }
                    return r4;
                }
                case 9: {
                    return r4.replace('\n', ' ');
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gW() {
        this.QX = 0;
    }

    final void j3() {
        this.XL = null;
    }

    @Override
    void j6(abcd.qG r2) {
        j6(r2, r2.j6(this));
    }

    void j6(abcd.qG r9, byte[] r10) {
        abcd.uE r0 = null;
        int r3 = 0;
        abcd.dG[] r5 = null;
        int r1 = 0;
        abcd.dG r6 = null;
        int r7 = 0;
        abcd.dG[] r8 = null;
        abcd.dG[] r2 = null;
        int r4 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = r9.FH;
                    r0.v5(r10, 5);
                    this.J0 = r9.v5(r0);
                    r3 = 46;
                    if (this.J8 != null) { $pc7 = 23; continue $sw7; }
                    r5 = new abcd.dG[1];
                    r1 = 0;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r10[r3] != 112) { $pc7 = 8; continue $sw7; }
                    r0.v5(r10, r3 + 7);
                    r6 = r9.FH(r0);
                    if (r1 != 0) { $pc7 = 16; continue $sw7; }
                    r7 = r1 + 1;
                    r5[r1] = r6;
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    r1 = r7;
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    r3 = r3 + 48;
                    { $pc7 = 6; continue $sw7; }
                }
                case 16: {
                    if (r1 != 1) { $pc7 = 19; continue $sw7; }
                    r5 = new abcd.dG[]{r5[0], r6};
                    r1 = 2;
                    { $pc7 = 22; continue $sw7; }
                }
                case 19: {
                    if (r5.length > r1) { $pc7 = 21; continue $sw7; }
                    r8 = new abcd.dG[r5.length + 32];
                    java.lang.System.arraycopy(r5, 0, r8, 0, r1);
                    r5 = r8;
                    $pc7 = 21; continue $sw7;
                }
                case 21: {
                    r7 = r1 + 1;
                    r5[r1] = r6;
                    { $pc7 = 15; continue $sw7; }
                }
                case 8: {
                    if (r1 == r5.length) { $pc7 = 10; continue $sw7; }
                    r2 = new abcd.dG[r1];
                    java.lang.System.arraycopy(r5, 0, r2, 0, r1);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    this.J8 = r2;
                    { $pc7 = 23; continue $sw7; }
                }
                case 10: {
                    r2 = r5;
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    r4 = abcd.IK.FH(r10, r3);
                    if (r4 <= 0) { $pc7 = 27; continue $sw7; }
                    this.Ws = abcd.IK.j6(r10, abcd.IK.DW(r10, r4, '>'), null);
                    $pc7 = 27; continue $sw7;
                }
                case 27: {
                    if (r9.u7() == false) { $pc7 = 29; continue $sw7; }
                    this.XL = r10;
                    $pc7 = 29; continue $sw7;
                }
                case 29: {
                    this.EQ |= 1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int lg() {
        return this.J8.length;
    }

    public final abcd.dG[] rN() {
        return this.J8;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(abcd.hE.DW(aM()));
        r0.append(' ');
        r0.append(we());
        r0.append(' ');
        r0.append(this.Ws);
        r0.append(' ');
        j6(r0);
        return r0.toString();
    }

    public final abcd.mG yS() {
        return this.J0;
    }
}
