package abcd;

public abstract class AbstractGp extends abcd.Abstractvp implements java.lang.Comparable<abcd.AbstractGp> {
    private int DW;
    private abcd.AbstractKp FH;
    private int Hw;
    private final int j6;

    public AbstractGp(int r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    abcd.AbstractKp.FH(r2);
                    if (r3 < (-1)) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    this.DW = r3;
                    this.FH = null;
                    this.Hw = -1;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("writeSize < -1");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int FH(abcd.AbstractGp r0) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 != null) { $pc1 = 6; continue $sw1; }
                    return 0;
                }
                case 6: {
                    return r0.we();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected int DW(abcd.AbstractGp r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    protected void DW(abcd.AbstractKp r1, int r2) {
    }

    protected abstract void DW(abcd.jp r1, abcd.Lt r2);

    public final int J8() {
        return this.j6;
    }

    @Override
    public final int VH() {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    if (r0 < 0) { $pc2 = 6; continue $sw2; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.UnsupportedOperationException("writeSize is unknown");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.lang.String Ws() {
        return '[' + java.lang.Integer.toHexString(we()) + ']';
    }

    public abstract java.lang.String aM();

    @Override
    public int compareTo(abcd.AbstractGp r1) {
        return j6(r1);
    }

    public final boolean equals(java.lang.Object r5) {
        abcd.AbstractGp r6 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this != r5) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    r6 = (abcd.AbstractGp) r5;
                    if (Hw() == r6.Hw()) { $pc3 = 9; continue $sw3; }
                    return false;
                }
                case 9: {
                    if (DW(r6) == 0) { $pc3 = 13; continue $sw3; }
                    return false;
                }
                case 13: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6(abcd.AbstractGp r3) {
        abcd.Enumwp r0 = null;
        abcd.Enumwp r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this != r3) { $pc4 = 5; continue $sw4; }
                    return 0;
                }
                case 5: {
                    r0 = Hw();
                    r1 = r3.Hw();
                    if (r0 == r1) { $pc4 = 10; continue $sw4; }
                    return r0.compareTo(r1);
                }
                case 10: {
                    return DW(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6(abcd.AbstractKp r2, int r3) {
        int r0 = 0;
        int r4 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 == null) { $pc5 = 13; continue $sw5; }
                    if (r3 < 0) { $pc5 = 11; continue $sw5; }
                    if (this.FH != null) { $pc5 = 9; continue $sw5; }
                    r0 = this.j6 - 1;
                    r4 = (r3 + r0) & (r0 ^ (-1));
                    this.FH = r2;
                    this.Hw = r4;
                    DW(r2, r4);
                    return r4;
                }
                case 9: {
                    throw new java.lang.RuntimeException("already written");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("offset < 0");
                }
                case 13: {
                    throw new java.lang.NullPointerException("addedTo == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(int r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 < 0) { $pc6 = 10; continue $sw6; }
                    if (this.DW >= 0) { $pc6 = 8; continue $sw6; }
                    this.DW = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.UnsupportedOperationException("writeSize already set");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("writeSize < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.jp r2, abcd.Lt r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r3.Hw(this.j6);
                    $pc7 = 4; continue $sw7;
                }
                case 10: {
                    e = $ex7;
                    throw abcd.Vt.j6(e, "...while writing " + this);
                }
                case 4: {
                    if (this.DW < 0) { $pc7 = 9; continue $sw7; }
                    try {
                        r3.FH(we());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 10; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    DW(r2, r3);
                    return;
                }
                case 9: {
                    try {
                        throw new java.lang.UnsupportedOperationException("writeSize is unknown");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 10; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int we() {
        int r0 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 < 0) { $pc8 = 7; continue $sw8; }
                    return this.FH.j6(r0);
                }
                case 7: {
                    throw new java.lang.RuntimeException("offset not yet known");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
