package abcd;

public class UJ extends abcd.TJ {
    private static final byte[] u7 = null;
    private int EQ;
    private int J0;
    private byte[] tp;
    private int we;

    static {
        u7 = new byte[0];
    }

    public UJ() {
        j6(u7);
    }

    private UJ(abcd.UJ r1) {
        super(r1);
    }

    public UJ(byte[] r1, abcd.IE r2, abcd.YD r3) {
        super(r1);
        DW(r2, r3);
    }

    private void Ws() {
        int r0 = 0;
        int r2 = 0;
        int r1 = 0;
        int r3 = 0;
        byte r4 = 0;
        int r5 = 0;
        int r6 = 0;
        byte r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.we;
                    r2 = r0 + 1;
                    r1 = this.tp[r0] - 48;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r3 = r2 + 1;
                    r4 = this.tp[r2];
                    if (32 == r4) { $pc0 = 5; continue $sw0; }
                    r1 = (r1 << 3) + (r4 - 48);
                    r2 = r3;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    this.v5 = r1;
                    r5 = this.VH;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r6 = r3 + 1;
                    r7 = this.tp[r3];
                    if (r7 == 0) { $pc0 = 8; continue $sw0; }
                    try {
                        this.Zo[r5] = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r5 = r5 + 1;
                    r3 = r6;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    DW(r5);
                    this.Zo[r5] = r7;
                    { $pc0 = 13; continue $sw0; }
                }
                case 8: {
                    this.gn = r5;
                    this.J0 = r6 + 20;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.IE r2, abcd.YD r3) {
        j6(r2.Hw(r3, 2).j6());
    }

    @Override
    public boolean DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.we != this.tp.length) { $pc1 = 6; continue $sw1; }
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
    public void EQ() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (FH() == true) { $pc2 = 6; continue $sw2; }
                    j6(this.tp);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void FH(int r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 != 1) { $pc3 = 8; continue $sw3; }
                    this.EQ = this.we;
                    this.we = this.J0;
                    if (DW() == true) { $pc3 = 29; continue $sw3; }
                    Ws();
                    return;
                }
                case 29: {
                    return;
                }
                case 8: {
                    r0 = this.tp.length;
                    r1 = this.J0;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r4 = r4 - 1;
                    if (r4 <= 0) { $pc3 = 18; continue $sw3; }
                    if (r1 == r0) { $pc3 = 18; continue $sw3; }
                    this.EQ = r1;
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    if (this.tp[r1] == 0) { $pc3 = 16; continue $sw3; }
                    r1 = r1 + 1;
                    { $pc3 = 15; continue $sw3; }
                }
                case 16: {
                    r1 = r1 + 21;
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (r4 != 0) { $pc3 = 24; continue $sw3; }
                    this.we = r1;
                    if (DW() == true) { $pc3 = 30; continue $sw3; }
                    Ws();
                    return;
                }
                case 30: {
                    return;
                }
                case 24: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean FH() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.we != 0) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.UJ J8() {
        abcd.UJ r0 = null;
        int r1 = 0;
        abcd.TJ r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    r1 = r0.J0;
                    if (r1 != r0.tp.length) { $pc5 = 10; continue $sw5; }
                    r2 = r0.DW;
                    if (r2 == null) { $pc5 = 7; continue $sw5; }
                    r0 = (abcd.UJ) r2;
                    { $pc5 = 3; continue $sw5; }
                }
                case 7: {
                    r0.we = r1;
                    return r0;
                }
                case 10: {
                    r0.EQ = r0.we;
                    r0.we = r1;
                    r0.Ws();
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean gn() {
        return true;
    }

    @Override
    public abcd.TJ j6(abcd.IE r1) {
        return j6(r1);
    }

    @Override
    public abcd.TJ j6(abcd.IE r1, abcd.uE r2) {
        return j6(r1, r2);
    }

    @Override
    public abcd.UJ j6(abcd.IE r2) {
        return j6(r2, new abcd.uE());
    }

    public final abcd.UJ j6(abcd.IE r2, abcd.YD r3) {
        abcd.UJ r0 = new abcd.UJ(this);
        r0.DW(r2, r3);
        return r0;
    }

    @Override
    public abcd.UJ j6(abcd.IE r3, abcd.uE r4) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r4.Hw(u7(), tp());
                    if (abcd.AbstractrE.j6.j6(this.v5) == false) { $pc6 = 7; continue $sw6; }
                    return j6(r3, r4);
                }
                case 7: {
                    throw new abcd.ZC(r4.J8(), "tree");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r7) {
        int r2 = 0;
        int[] r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r7 != 1) { $pc7 = 10; continue $sw7; }
                    r2 = this.EQ;
                    if (r2 < 0) { $pc7 = 10; continue $sw7; }
                    this.we = r2;
                    this.EQ = -1;
                    if (DW() == true) { $pc7 = 30; continue $sw7; }
                    Ws();
                    return;
                }
                case 30: {
                    return;
                }
                case 10: {
                    if (r7 <= 0) { $pc7 = 26; continue $sw7; }
                    r3 = new int[r7 + 1];
                    java.util.Arrays.fill(r3, -1);
                    r4 = 0;
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    if (r4 == this.we) { $pc7 = 15; continue $sw7; }
                    java.lang.System.arraycopy(r3, 1, r3, 0, r7);
                    r3[r7] = r4;
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    if (this.tp[r4] == 0) { $pc7 = 23; continue $sw7; }
                    r4 = r4 + 1;
                    { $pc7 = 22; continue $sw7; }
                }
                case 23: {
                    r4 = r4 + 21;
                    { $pc7 = 13; continue $sw7; }
                }
                case 15: {
                    if (r3[1] == (-1)) { $pc7 = 19; continue $sw7; }
                    this.EQ = r3[0];
                    this.we = r3[1];
                    Ws();
                    return;
                }
                case 19: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r7);
                }
                case 26: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    this.tp = r2;
                    this.EQ = -1;
                    this.we = 0;
                    if (DW() == false) { $pc8 = 5; continue $sw8; }
                    this.J0 = 0;
                    return;
                }
                case 5: {
                    Ws();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int tp() {
        return this.J0 - 20;
    }

    @Override
    public byte[] u7() {
        return this.tp;
    }
}
