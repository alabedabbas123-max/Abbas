package abcd;

public final class Nm extends abcd.hu {
    private final abcd.Rs[] DW;
    private final boolean[] FH;
    private int Hw;

    public Nm(int r3) {
        boolean r1 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == 0) { $pc0 = 5; continue $sw0; }
                    r1 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    super(r1);
                    this.DW = new abcd.Rs[r3];
                    this.FH = new boolean[r3];
                    this.Hw = 0;
                    return;
                }
                case 5: {
                    r1 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Rs DW(java.lang.String r3) {
        throw new abcd.an("stack: " + r3);
    }

    private static java.lang.String DW(abcd.Rs r0) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 != null) { $pc1 = 6; continue $sw1; }
                    return "<invalid>";
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Rs DW(int r3) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 < 0) { $pc2 = 10; continue $sw2; }
                    r0 = this.Hw;
                    if (r3 < r0) { $pc2 = 6; continue $sw2; }
                    DW("underflow");
                    throw null;
                }
                case 6: {
                    return this.DW[(r0 - r3) - 1];
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("n < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.Qs r5) {
        abcd.Qs r0 = null;
        int r1 = 0;
        abcd.Rs[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.Hw != 0) { $pc3 = 5; continue $sw3; }
                    return;
                }
                case 5: {
                    J8();
                    r0 = r5.Ws();
                    r1 = 0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1 >= this.Hw) { $pc3 = 12; continue $sw3; }
                    r2 = this.DW;
                    if (r2[r1] != r5) { $pc3 = 11; continue $sw3; }
                    r2[r1] = r0;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r1 = r1 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH(int r3) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r3 < 0) { $pc4 = 10; continue $sw4; }
                    r0 = this.Hw;
                    if (r3 >= r0) { $pc4 = 8; continue $sw4; }
                    return this.FH[(r0 - r3) - 1];
                }
                case 8: {
                    throw new abcd.an("stack: underflow");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("n < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs Hw(int r1) {
        return DW(r1).getType();
    }

    public abcd.Rs er() {
        J8();
        abcd.Rs r1 = DW(0);
        abcd.Rs[] r2 = this.DW;
        int r3 = this.Hw;
        r2[r3 - 1] = null;
        this.FH[r3 - 1] = false;
        this.Hw = r3 - r1.getType().Zo();
        return r1;
    }

    public abcd.Nm j6(abcd.Nm r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    return abcd.Um.j6(this, r3);
                }
                case 4: {
                    e = $ex5;
                    e.j6("underlay stack:");
                    j6(e);
                    e.j6("overlay stack:");
                    r3.j6(e);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r4, abcd.Rs r5) {
        abcd.Rs r6 = null;
        int r0 = 0;
        abcd.Rs r7 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    J8();
                    try {
                        r6 = r5.U2();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc6 = 12; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = (this.Hw - r4) - 1;
                    r7 = this.DW[r0];
                    if (r7 != null) { $pc6 = 7; continue $sw6; }
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    DW("incompatible substitution: " + DW(r7) + " -> " + DW(r6));
                    throw null;
                }
                case 7: {
                    if (r7.getType().Zo() != r6.getType().Zo()) { $pc6 = 10; continue $sw6; }
                    this.DW[r0] = r6;
                    return;
                }
                case 13: {
                    throw new java.lang.NullPointerException("type == null");
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Rs r7) {
        abcd.Rs r8 = null;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.Rs[] r3 = null;
        abcd.Rs[] r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    J8();
                    try {
                        r8 = r7.U2();
                        r0 = r8.getType().Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc7 = 13; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = this.Hw;
                    r2 = r1 + r0;
                    r3 = this.DW;
                    if (r2 <= r3.length) { $pc7 = 7; continue $sw7; }
                    DW("overflow");
                    throw null;
                }
                case 7: {
                    if (r0 != 2) { $pc7 = 9; continue $sw7; }
                    r3[r1] = null;
                    this.Hw = r1 + 1;
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r4 = this.DW;
                    r5 = this.Hw;
                    r4[r5] = r8;
                    this.Hw = r5 + 1;
                    return;
                }
                case 14: {
                    throw new java.lang.NullPointerException("type == null");
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Vt r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.Hw - 1;
                    r1 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r1 > r0) { $pc8 = 8; continue $sw8; }
                    if (r1 != r0) { $pc8 = 6; continue $sw8; }
                    r2 = "top0";
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    r6.j6("stack[" + r2 + "]: " + DW(this.DW[r1]));
                    r1 = r1 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 6: {
                    r2 = abcd.Yt.v5(r0 - r1);
                    { $pc8 = 7; continue $sw8; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void lg() {
        int r1 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    J8();
                    r1 = 0;
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r1 >= this.Hw) { $pc9 = 6; continue $sw9; }
                    this.DW[r1] = null;
                    this.FH[r1] = false;
                    r1 = r1 + 1;
                    { $pc9 = 4; continue $sw9; }
                }
                case 6: {
                    this.Hw = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Nm rN() {
        abcd.Nm r0 = new abcd.Nm(this.DW.length);
        abcd.Rs[] r1 = this.DW;
        java.lang.System.arraycopy(r1, 0, r0.DW, 0, r1.length);
        boolean[] r2 = this.FH;
        java.lang.System.arraycopy(r2, 0, r0.FH, 0, r2.length);
        r0.Hw = this.Hw;
        return r0;
    }

    public int size() {
        return this.Hw;
    }

    public void yS() {
        J8();
        this.FH[this.Hw] = true;
    }
}
