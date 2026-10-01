package abcd;

public class Vm extends abcd.AbstractRm {
    private final abcd.Rs[] DW;

    public Vm(int r2) {
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == 0) { $pc0 = 4; continue $sw0; }
                    r0 = true;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    super(r0);
                    this.DW = new abcd.Rs[r2];
                    return;
                }
                case 4: {
                    r0 = false;
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Rs j6(int r3, java.lang.String r4) {
        throw new abcd.an("local " + abcd.Yt.v5(r3) + ": " + r4);
    }

    public abcd.Rs DW(int r2) {
        return this.DW[r2];
    }

    @Override
    public void DW(abcd.Qs r6) {
        int r0 = 0;
        abcd.Qs r1 = null;
        int r2 = 0;
        abcd.Rs[] r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW.length;
                    if (r0 != 0) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    J8();
                    r1 = r6.Ws();
                    r2 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r2 >= r0) { $pc1 = 11; continue $sw1; }
                    r3 = this.DW;
                    if (r3[r2] != r6) { $pc1 = 10; continue $sw1; }
                    r3[r2] = r1;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r2 = r2 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r3) {
        J8();
        this.DW[r3] = null;
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        abcd.Rs[] r2 = null;
        abcd.Rs r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r2 = this.DW;
                    if (r1 >= r2.length) { $pc2 = 11; continue $sw2; }
                    r3 = r2[r1];
                    if (r3 != null) { $pc2 = 8; continue $sw2; }
                    r4 = "<invalid>";
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r0.append("locals[" + abcd.Yt.v5(r1) + "]: " + r4 + "\n");
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 8: {
                    r4 = r3.toString();
                    { $pc2 = 9; continue $sw2; }
                }
                case 11: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int er() {
        return this.DW.length;
    }

    @Override
    public abcd.Rs get(int r2) {
        abcd.Rs r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW[r2];
                    if (r0 == null) { $pc3 = 5; continue $sw3; }
                    return r0;
                }
                case 5: {
                    j6(r2, "invalid");
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractRm j6(abcd.AbstractRm r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r2 instanceof abcd.Vm) == false) { $pc4 = 7; continue $sw4; }
                    return j6((abcd.Vm) r2);
                }
                case 7: {
                    return r2.j6(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r3, int r4) {
        return new abcd.Sm(er()).j6(r3, r4);
    }

    public abcd.Vm j6(abcd.Vm r3) {
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
                    e.j6("underlay locals:");
                    j6(e);
                    e.j6("overlay locals:");
                    r3.j6(e);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r4, abcd.Rs r5) {
        abcd.Rs r6 = null;
        abcd.Rs[] r0 = null;
        int r7 = 0;
        abcd.Rs r8 = null;
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
                        if ($t instanceof java.lang.NullPointerException) { $pc6 = 18; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 < 0) { $pc6 = 17; continue $sw6; }
                    if (r6.getType().yS() == false) { $pc6 = 8; continue $sw6; }
                    this.DW[r4 + 1] = null;
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    r0 = this.DW;
                    r0[r4] = r6;
                    if (r4 == 0) { $pc6 = 22; continue $sw6; }
                    r7 = r4 - 1;
                    r8 = r0[r7];
                    if (r8 != null) { $pc6 = 13; continue $sw6; }
                    return;
                }
                case 13: {
                    if (r8.getType().yS() == false) { $pc6 = 24; continue $sw6; }
                    this.DW[r7] = null;
                    return;
                }
                case 24: {
                    return;
                }
                case 22: {
                    return;
                }
                case 17: {
                    throw new java.lang.IndexOutOfBoundsException("idx < 0");
                }
                case 19: {
                    throw new java.lang.NullPointerException("type == null");
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Vt r5) {
        int r0 = 0;
        abcd.Rs[] r1 = null;
        abcd.Rs r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r1 = this.DW;
                    if (r0 >= r1.length) { $pc7 = 10; continue $sw7; }
                    r2 = r1[r0];
                    if (r2 != null) { $pc7 = 8; continue $sw7; }
                    r3 = "<invalid>";
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r5.j6("locals[" + abcd.Yt.v5(r0) + "]: " + r3);
                    r0 = r0 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 8: {
                    r3 = r2.toString();
                    { $pc7 = 9; continue $sw7; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.bs r2) {
        j6(r2.we(), r2);
    }

    @Override
    public abcd.AbstractRm lg() {
        return lg();
    }

    @Override
    public abcd.Vm lg() {
        abcd.Vm r0 = new abcd.Vm(this.DW.length);
        abcd.Rs[] r1 = this.DW;
        java.lang.System.arraycopy(r1, 0, r0.DW, 0, r1.length);
        return r0;
    }

    @Override
    protected abcd.Vm rN() {
        return this;
    }
}
