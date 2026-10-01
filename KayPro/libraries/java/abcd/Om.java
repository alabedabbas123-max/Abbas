package abcd;

public final class Om {
    private final abcd.Nm DW;
    private final abcd.au FH;
    private final abcd.AbstractRm j6;

    public Om(int r2, int r3) {
        this(new abcd.Vm(r2), new abcd.Nm(r3));
    }

    private Om(abcd.AbstractRm r2, abcd.Nm r3) {
        this(r2, r3, abcd.au.DW);
    }

    private Om(abcd.AbstractRm r1, abcd.Nm r2, abcd.au r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    r3.Ws();
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("stack == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("locals == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.AbstractRm j6(abcd.AbstractRm r1, abcd.au r2) {
        abcd.Sm r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.Sm) == true) { $pc1 = 5; continue $sw1; }
                    return r1;
                }
                case 5: {
                    r3 = (abcd.Sm) r1;
                    if (r2.size() == 0) { $pc1 = 8; continue $sw1; }
                    return r3;
                }
                case 8: {
                    return r3.rN();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.au j6(abcd.au r7) {
        abcd.au r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH.equals(r7) == true) { $pc2 = 5; continue $sw2; }
                    r0 = new abcd.au();
                    r1 = this.FH.size();
                    r2 = r7.size();
                    r3 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r3 >= r1) { $pc2 = 12; continue $sw2; }
                    if (r3 >= r2) { $pc2 = 12; continue $sw2; }
                    if (this.FH.get(r3) != r7.get(r3)) { $pc2 = 12; continue $sw2; }
                    r0.DW(r3);
                    r3 = r3 + 1;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r0.we();
                    return r0;
                }
                case 5: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Om DW(int r5, int r6) {
        abcd.AbstractRm r1 = null;
        abcd.AbstractRm r7 = null;
        abcd.au r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = this.j6;
                    if ((r1 instanceof abcd.Sm) == false) { $pc3 = 5; continue $sw3; }
                    r7 = ((abcd.Sm) r1).DW(r6);
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    try {
                        r2 = this.FH.lg();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc3 = 15; continue $sw3; }
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc3 = 17; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2.rN() != r5) { $pc3 = 14; continue $sw3; }
                    try {
                        r2.we();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc3 = 15; continue $sw3; }
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc3 = 17; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 != null) { $pc3 = 12; continue $sw3; }
                    return null;
                }
                case 12: {
                    return new abcd.Om(r7, this.DW, r2);
                }
                case 14: {
                    try {
                        throw new java.lang.RuntimeException("returning from invalid subroutine");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc3 = 15; continue $sw3; }
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc3 = 17; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 18: {
                    throw new java.lang.RuntimeException("returning from invalid subroutine");
                }
                case 16: {
                    throw new java.lang.NullPointerException("can't return from non-subroutine");
                }
                case 5: {
                    r7 = null;
                    { $pc3 = 19; continue $sw3; }
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractRm DW() {
        return this.j6;
    }

    public abcd.Nm FH() {
        return this.DW;
    }

    public abcd.au Hw() {
        return this.FH;
    }

    public abcd.Om j6() {
        return new abcd.Om(this.j6.lg(), this.DW.rN(), this.FH);
    }

    public abcd.Om j6(int r5, int r6) {
        this.FH.lg().DW(r5);
        return new abcd.Om(this.j6.rN(), this.DW, abcd.au.Zo(r5)).j6(this, r5, r6);
    }

    public abcd.Om j6(abcd.Ks r4) {
        abcd.Nm r0 = FH().rN();
        r0.lg();
        r0.j6(r4);
        return new abcd.Om(DW(), r0, this.FH);
    }

    public abcd.Om j6(abcd.Om r4) {
        abcd.AbstractRm r0 = null;
        abcd.Nm r1 = null;
        abcd.au r5 = null;
        abcd.AbstractRm r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = DW().j6(r4.DW());
                    r1 = FH().j6(r4.FH());
                    r5 = j6(r4.FH);
                    r2 = j6(r0, r5);
                    if (r2 != DW()) { $pc4 = 10; continue $sw4; }
                    if (r1 != FH()) { $pc4 = 10; continue $sw4; }
                    if (this.FH != r5) { $pc4 = 10; continue $sw4; }
                    return this;
                }
                case 10: {
                    return new abcd.Om(r2, r1, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Om j6(abcd.Om r8, int r9, int r10) {
        abcd.Sm r11 = null;
        abcd.Nm r0 = null;
        abcd.au r12 = null;
        abcd.au r13 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r11 = DW().j6(r8.DW(), r10);
                    r0 = FH().j6(r8.FH());
                    r12 = r8.FH.lg();
                    r12.DW(r9);
                    r12.we();
                    if (r11 != DW()) { $pc5 = 10; continue $sw5; }
                    if (r0 != FH()) { $pc5 = 10; continue $sw5; }
                    if (this.FH.equals(r12) == false) { $pc5 = 10; continue $sw5; }
                    return this;
                }
                case 10: {
                    if (this.FH.equals(r12) == false) { $pc5 = 13; continue $sw5; }
                    r12 = this.FH;
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    return new abcd.Om(r11, r0, r12);
                }
                case 13: {
                    if (this.FH.size() <= r12.size()) { $pc5 = 15; continue $sw5; }
                    r13 = r12;
                    r12 = this.FH;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    r1 = r12.size();
                    r2 = r13.size();
                    r3 = r2 - 1;
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    if (r3 < 0) { $pc5 = 24; continue $sw5; }
                    if (r13.get(r3) != r12.get((r1 - r2) + r3)) { $pc5 = 22; continue $sw5; }
                    r3 = r3 - 1;
                    { $pc5 = 17; continue $sw5; }
                }
                case 22: {
                    throw new java.lang.RuntimeException("Incompatible merged subroutines");
                }
                case 15: {
                    r13 = this.FH;
                    { $pc5 = 16; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Ps r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.Qs r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = r6.size();
                    r1 = 0;
                    r2 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r0) { $pc6 = 5; continue $sw6; }
                    r3 = r6.get(r1);
                    this.j6.j6(r2, r3);
                    r2 = r2 + r3.Zo();
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Qs r2) {
        this.j6.DW(r2);
        this.DW.DW(r2);
    }

    public void j6(abcd.Vt r2) {
        this.j6.j6(r2);
        this.DW.j6(r2);
    }

    public void v5() {
        this.j6.we();
        this.DW.we();
    }
}
