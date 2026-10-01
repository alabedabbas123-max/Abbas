package abcd;

public class MH extends abcd.CI {
    private abcd.yE J0;
    private int J8;
    private abcd.CH.a QX;
    private int Ws;

    public MH(abcd.YD r1, int r2) {
        super(r1);
        this.J8 = r2 << 5;
    }

    public MH(abcd.AbstractiG r2) {
        this(r2, r2.aM());
    }

    public boolean BT() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.J0 == null) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void DW(abcd.yE r1) {
        this.J0 = r1;
    }

    void FH(int r1) {
        this.Ws = r1;
    }

    void Hw(int r2) {
        this.J8 = (r2 << 12) | (this.J8 & 4095);
    }

    abcd.CH.a KD() {
        abcd.CH.a r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.QX;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    this.QX = null;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void Mr() {
        this.J8 &= -3;
    }

    boolean P8() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((this.J8 & 8) == 0) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void SI() {
        this.J8 |= 1;
    }

    int U2() {
        return this.Ws;
    }

    void Zo(int r1) {
        DW(r1);
    }

    public abcd.MH a8() {
        abcd.yE r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.J0;
                    if ((r0 instanceof abcd.MH) == true) { $pc3 = 5; continue $sw3; }
                    return null;
                }
                case 5: {
                    return (abcd.MH) r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void cn() {
        this.J8 |= 2;
    }

    public boolean ei() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((this.J8 & 2) == 0) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int er() {
        return this.Ws;
    }

    int gW() {
        return aM();
    }

    void j3() {
        abcd.CH.a r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.J0 = null;
                    r1 = this.QX;
                    if (r1 == null) { $pc5 = 6; continue $sw5; }
                    r1.clear();
                    this.QX.enqueue();
                    this.QX = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.CH.a r1) {
        this.QX = r1;
    }

    public void j6(abcd.UH r1) {
    }

    void j6(boolean r1) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r1 == false) { $pc6 = 4; continue $sw6; }
                    this.J8 |= 4;
                    return;
                }
                case 4: {
                    this.J8 &= -5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE lg() {
        return this.J0;
    }

    public boolean nw() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (getOffset() == 0) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int rN() {
        return this.J8 >>> 12;
    }

    void ro() {
        this.J8 |= 8;
    }

    boolean sh() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if ((this.J8 & 1) == 0) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("ObjectToPack[");
                    r0.append(abcd.hE.DW(yS()));
                    r0.append(" ");
                    r0.append(we());
                    if (sh() == false) { $pc9 = 6; continue $sw9; }
                    r0.append(" wantWrite");
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (ei() == false) { $pc9 = 9; continue $sw9; }
                    r0.append(" reuseAsIs");
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    if (vy() == false) { $pc9 = 12; continue $sw9; }
                    r0.append(" doNotDelta");
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (P8() == false) { $pc9 = 15; continue $sw9; }
                    r0.append(" edge");
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    if (rN() <= 0) { $pc9 = 18; continue $sw9; }
                    r0.append(" depth=" + rN());
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    if (BT() == false) { $pc9 = 24; continue $sw9; }
                    if (a8() == null) { $pc9 = 22; continue $sw9; }
                    r0.append(" base=inpack:" + a8().we());
                    { $pc9 = 24; continue $sw9; }
                }
                case 22: {
                    r0.append(" base=edge:" + lg().we());
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    if (nw() == false) { $pc9 = 26; continue $sw9; }
                    r0.append(" offset=" + getOffset());
                    $pc9 = 26; continue $sw9;
                }
                case 26: {
                    r0.append("]");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void v5(int r1) {
        this.Ws = r1;
    }

    boolean vy() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if ((this.J8 & 4) == 0) { $pc10 = 6; continue $sw10; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int yS() {
        return (this.J8 >> 5) & 7;
    }
}
