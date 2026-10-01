package abcd;

public abstract class AbstractKp {
    private final abcd.jp DW;
    private final int FH;
    private int Hw;
    private final java.lang.String j6;
    private boolean v5;

    public AbstractKp(java.lang.String r1, abcd.jp r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    FH(r3);
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = -1;
                    this.v5 = false;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("file == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 <= 0) { $pc1 = 7; continue $sw1; }
                    if ((r1 & (r1 - 1)) != 0) { $pc1 = 7; continue $sw1; }
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("invalid alignment");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int DW(int r2) {
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 < 0) { $pc2 = 10; continue $sw2; }
                    if (this.Hw >= 0) { $pc2 = 8; continue $sw2; }
                    r0 = this.FH - 1;
                    r3 = (r2 + r0) & (r0 ^ (-1));
                    this.Hw = r3;
                    return r3;
                }
                case 8: {
                    throw new java.lang.RuntimeException("fileOffset already set");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("fileOffset < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.jp DW() {
        return this.DW;
    }

    public final void DW(abcd.Lt r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    VH();
                    j6(r5);
                    r0 = r5.v5();
                    r1 = this.Hw;
                    if (r1 >= 0) { $pc3 = 5; continue $sw3; }
                    this.Hw = r0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r5.Hw() == true) { $pc3 = 9; continue $sw3; }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    FH(r5);
                    return;
                }
                case 9: {
                    if (this.j6 == null) { $pc3 = 11; continue $sw3; }
                    r5.j6(0, "\n" + this.j6 + ":");
                    { $pc3 = 13; continue $sw3; }
                }
                case 11: {
                    if (r0 == 0) { $pc3 = 13; continue $sw3; }
                    r5.j6(0, "\n");
                    { $pc3 = 13; continue $sw3; }
                }
                case 5: {
                    if (r1 == r0) { $pc3 = 7; continue $sw3; }
                    throw new java.lang.RuntimeException("alignment mismatch: for " + this + ", at " + r0 + ", but expected " + this.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int FH() {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 < 0) { $pc4 = 6; continue $sw4; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.RuntimeException("fileOffset not set");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void FH(abcd.Lt r1);

    public abstract java.util.Collection<? extends abcd.Abstractvp> Hw();

    protected final void VH() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.v5 == false) { $pc5 = 6; continue $sw5; }
                    return;
                }
                case 6: {
                    throw new java.lang.RuntimeException("not prepared");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void Zo();

    protected final void gn() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.v5 == true) { $pc6 = 6; continue $sw6; }
                    return;
                }
                case 6: {
                    throw new java.lang.RuntimeException("already prepared");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6() {
        return this.FH;
    }

    public final int j6(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 < 0) { $pc7 = 10; continue $sw7; }
                    r0 = this.Hw;
                    if (r0 < 0) { $pc7 = 8; continue $sw7; }
                    return r0 + r2;
                }
                case 8: {
                    throw new java.lang.RuntimeException("fileOffset not yet set");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("relative < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract int j6(abcd.Abstractvp r1);

    protected final void j6(abcd.Lt r2) {
        r2.Hw(this.FH);
    }

    public abstract int u7();

    public final void v5() {
        gn();
        Zo();
        this.v5 = true;
    }
}
