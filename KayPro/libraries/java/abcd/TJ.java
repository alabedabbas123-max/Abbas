package abcd;

public abstract class TJ {
    protected static final byte[] j6 = null;
    final abcd.TJ DW;
    abcd.TJ FH;
    int Hw;
    protected final int VH;
    protected byte[] Zo;
    protected int gn;
    protected int v5;

    static {
        j6 = new byte[20];
    }

    protected TJ() {
        this.DW = null;
        this.Zo = new byte[128];
        this.VH = 0;
    }

    protected TJ(abcd.TJ r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = r4;
                    this.Zo = r4.Zo;
                    this.VH = r4.gn + 1;
                    try {
                        this.Zo[this.VH - 1] = 47;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    DW(r4.gn);
                    this.Zo[this.VH - 1] = 47;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected TJ(abcd.TJ r1, byte[] r2, int r3) {
        this.DW = r1;
        this.Zo = r2;
        this.VH = r3;
    }

    protected TJ(byte[] r4) {
        byte[] r5 = null;
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.DW = null;
                    if (r4 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    this.Zo = new byte[128];
                    this.VH = 0;
                    return;
                }
                case 5: {
                    if (r4.length <= 0) { $pc1 = 10; continue $sw1; }
                    this.gn = r4.length;
                    this.Zo = new byte[java.lang.Math.max(128, this.gn + 1)];
                    java.lang.System.arraycopy(r4, 0, this.Zo, 0, this.gn);
                    r5 = this.Zo;
                    r0 = this.gn;
                    if (r5[r0 - 1] == 47) { $pc1 = 9; continue $sw1; }
                    this.gn = r0 + 1;
                    r5[r0] = 47;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    this.VH = this.gn;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r3, int r4) {
        byte[] r0 = null;
        byte[] r5 = null;
        abcd.TJ r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Zo;
                    r5 = new byte[r3];
                    java.lang.System.arraycopy(r0, 0, r5, 0, r4);
                    r6 = this;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r6 == null) { $pc2 = 8; continue $sw2; }
                    if (r6.Zo != r0) { $pc2 = 11; continue $sw2; }
                    r6.Zo = r5;
                    r6 = r6.DW;
                    { $pc2 = 3; continue $sw2; }
                }
                case 11: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int Hw(int r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (abcd.AbstractrE.j6.j6(r1) == false) { $pc3 = 5; continue $sw3; }
                    return 47;
                }
                case 5: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(abcd.TJ r3, abcd.TJ r4) {
        abcd.TJ r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 2;
        $sw4: while (true) {
            switch ($pc4) {
                case 2: {
                    r0 = r3.DW;
                    r4 = r4.DW;
                    if (r0 == null) { $pc4 = 11; continue $sw4; }
                    if (r4 == null) { $pc4 = 16; continue $sw4; }
                    if (r0.FH == r4.FH) { $pc4 = 9; continue $sw4; }
                    r3 = r0;
                    { $pc4 = 2; continue $sw4; }
                }
                case 9: {
                    return r3.VH;
                }
                case 16: {
                    return 0;
                }
                case 11: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(byte[] r5, int r6, int r7, int r8, int r9) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Zo;
                    r1 = this.gn;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r9 >= r1) { $pc5 = 10; continue $sw5; }
                    if (r6 >= r7) { $pc5 = 10; continue $sw5; }
                    r2 = (r0[r9] & 255) - (r5[r6] & 255);
                    if (r2 != 0) { $pc5 = 8; continue $sw5; }
                    r9 = r9 + 1;
                    r6 = r6 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 8: {
                    return r2;
                }
                case 10: {
                    if (r9 >= r1) { $pc5 = 14; continue $sw5; }
                    r10 = r0[r9] & 255;
                    r11 = Hw(r8);
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    return r10 - r11;
                }
                case 14: {
                    if (r6 < r7) { $pc5 = 16; continue $sw5; }
                    r10 = Hw(this.v5);
                    r11 = Hw(r8);
                    { $pc5 = 13; continue $sw5; }
                }
                case 16: {
                    return Hw(this.v5) - (r5[r6] & 255);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(abcd.TJ r2) {
        return j6(r2, r2.v5);
    }

    protected void DW(int r2) {
        DW(this.Zo.length << 1, r2);
    }

    public abstract boolean DW();

    public void EQ() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 3: {
                    if (FH() == true) { $pc6 = 4; continue $sw6; }
                    j6(1);
                    { $pc6 = 3; continue $sw6; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void FH(int r1);

    public abstract boolean FH();

    public abcd.AbstractrE Hw() {
        return abcd.AbstractrE.DW(this.v5);
    }

    public void J0() {
    }

    public int VH() {
        return this.v5;
    }

    public java.lang.String Zo() {
        return abcd.YJ.DW(this);
    }

    public abstract boolean gn();

    int j6(abcd.TJ r7, int r8) {
        int r5 = j6(this, r7);
        return j6(r7.Zo, r5, r7.gn, r8, r5);
    }

    public int j6(byte[] r7, int r8, int r9, int r10) {
        return j6(r7, r8, r9, r10, 0);
    }

    public abstract abcd.TJ j6(abcd.IE r1);

    public abcd.TJ j6(abcd.IE r1, abcd.uE r2) {
        return j6(r1);
    }

    public abcd.VJ j6() {
        return new abcd.VJ(this);
    }

    public abstract void j6(int r1);

    protected void j6(int r3, int r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.Zo;
                    if (r0.length < r3) { $pc7 = 5; continue $sw7; }
                    return;
                }
                case 5: {
                    r1 = r0.length;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r1 >= r3) { $pc7 = 10; continue $sw7; }
                    if (r1 <= 0) { $pc7 = 10; continue $sw7; }
                    r1 = r1 << 1;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    DW(r1, r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.uE r3) {
        r3.Hw(u7(), tp());
    }

    public boolean j6(abcd.TJ r4) {
        return abcd.yE.j6(u7(), tp(), r4.u7(), r4.tp());
    }

    public abstract int tp();

    public abstract byte[] u7();

    public abcd.yE v5() {
        return abcd.yE.Hw(u7(), tp());
    }

    public void we() {
        FH(1);
    }
}
