package abcd;

public class RC extends abcd.TJ {
    private final int EQ;
    private final byte[] J0;
    protected int J8;
    protected abcd.QC QX;
    private int Ws;
    protected abcd.TC XL;
    private final abcd.TC tp;
    protected final abcd.KC u7;
    private final int we;

    public RC(abcd.KC r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.u7 = r2;
                    this.tp = r2.j6(true);
                    this.EQ = 0;
                    this.we = this.tp.DW();
                    this.J0 = new byte[20];
                    if (DW() == true) { $pc0 = 6; continue $sw0; }
                    Ws();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    RC(abcd.RC r3, abcd.TC r4) {
        super(r3, r3.Zo, r3.gn + 1);
        this.u7 = r3.u7;
        this.tp = r4;
        this.EQ = r3.J8;
        this.we = this.EQ + this.tp.DW();
        this.J0 = r3.J0;
        this.J8 = r3.J8;
        Ws();
    }

    private void Ws() {
        byte[] r0 = null;
        abcd.TC r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.QX = this.u7.j6(this.J8);
                    r0 = this.QX.Hw;
                    if (this.Ws == this.tp.j6()) { $pc1 = 11; continue $sw1; }
                    r1 = this.tp.j6(this.Ws);
                    if (r1.j6(r0, this.VH, r0.length) == false) { $pc1 = 11; continue $sw1; }
                    this.XL = r1;
                    this.Ws++;
                    if (r1.Hw() == false) { $pc1 = 9; continue $sw1; }
                    r1.FH().DW(this.J0, 0);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    this.v5 = abcd.AbstractrE.j6.DW();
                    this.Zo = r0;
                    this.gn = this.VH + r1.v5();
                    return;
                }
                case 11: {
                    this.v5 = this.QX.Zo();
                    this.Zo = r0;
                    this.gn = r0.length;
                    this.XL = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean DW() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.J8 != this.we) { $pc2 = 6; continue $sw2; }
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
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (FH() == true) { $pc3 = 8; continue $sw3; }
                    this.J8 = this.EQ;
                    if (DW() == true) { $pc3 = 9; continue $sw3; }
                    Ws();
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

    @Override
    public void FH(int r3) {
        abcd.TC r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 2;
        $sw4: while (true) {
            switch ($pc4) {
                case 2: {
                    r3 = r3 - 1;
                    if (r3 < 0) { $pc4 = 11; continue $sw4; }
                    r0 = this.XL;
                    if (r0 == null) { $pc4 = 8; continue $sw4; }
                    this.J8 += r0.DW();
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (DW() == true) { $pc4 = 15; continue $sw4; }
                    Ws();
                    { $pc4 = 2; continue $sw4; }
                }
                case 15: {
                    return;
                }
                case 8: {
                    this.J8++;
                    { $pc4 = 10; continue $sw4; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean FH() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.J8 != this.EQ) { $pc5 = 6; continue $sw5; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.QC J8() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.XL == null) { $pc6 = 7; continue $sw6; }
                    return null;
                }
                case 7: {
                    return this.QX;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean gn() {
        abcd.TC r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.XL;
                    if (r0 == null) { $pc7 = 7; continue $sw7; }
                    return r0.Hw();
                }
                case 7: {
                    if (this.QX == null) { $pc7 = 10; continue $sw7; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.TJ j6(abcd.IE r3) {
        abcd.TC r4 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r4 = this.XL;
                    if (r4 == null) { $pc8 = 7; continue $sw8; }
                    return new abcd.RC(this, r4);
                }
                case 7: {
                    throw new abcd.ZC(v5(), "tree");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.VJ j6() {
        byte[] r0 = new byte[java.lang.Math.max(this.gn + 1, 128)];
        java.lang.System.arraycopy(this.Zo, 0, r0, 0, this.gn);
        int r1 = this.gn;
        r0[r1] = 47;
        return new abcd.VJ(this, r0, r1 + 1);
    }

    @Override
    public void j6(int r3) {
        abcd.TC r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 2;
        $sw9: while (true) {
            switch ($pc9) {
                case 2: {
                    r3 = r3 - 1;
                    if (r3 < 0) { $pc9 = 4; continue $sw9; }
                    if (this.XL == null) { $pc9 = 8; continue $sw9; }
                    this.Ws--;
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    this.J8--;
                    Ws();
                    r0 = this.XL;
                    if (r0 == null) { $pc9 = 2; continue $sw9; }
                    this.J8 -= r0.DW() - 1;
                    { $pc9 = 2; continue $sw9; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int tp() {
        abcd.QC r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.XL == null) { $pc10 = 5; continue $sw10; }
                    return 0;
                }
                case 5: {
                    r0 = this.QX;
                    if (r0 != null) { $pc10 = 8; continue $sw10; }
                    return 0;
                }
                case 8: {
                    return r0.u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] u7() {
        abcd.TC r0 = null;
        abcd.QC r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.XL;
                    if (r0 != null) { $pc11 = 5; continue $sw11; }
                    r1 = this.QX;
                    if (r1 == null) { $pc11 = 14; continue $sw11; }
                    return r1.gn();
                }
                case 14: {
                    return abcd.TJ.j6;
                }
                case 5: {
                    if (r0.Hw() == false) { $pc11 = 8; continue $sw11; }
                    return this.J0;
                }
                case 8: {
                    return abcd.TJ.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
