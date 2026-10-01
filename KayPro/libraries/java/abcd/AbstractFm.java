package abcd;

public abstract class AbstractFm implements abcd.InterfaceTm {
    private abcd.Rs[] DW;
    private boolean EQ;
    private int FH;
    private abcd.Qs Hw;
    private abcd.Rs[] J0;
    private int J8;
    private int VH;
    private abcd.Abstractms Zo;
    private abcd.cn gn;
    private final abcd.Os j6;
    private int tp;
    private java.util.ArrayList<abcd.Abstractms> u7;
    private int v5;
    private abcd.bs we;

    public AbstractFm(abcd.Os r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    this.DW = new abcd.Rs[10];
                    this.J0 = new abcd.Rs[6];
                    j6();
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("prototype == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.Rs r3, abcd.Rs r4) {
        throw new abcd.an("local variable type mismatch: attempt to set or access a value of type " + r3.aM() + " using a local variable of type " + r4.aM() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    @Override
    public abcd.Os DW() {
        return this.j6;
    }

    protected final abcd.bs DW(boolean r5) {
        java.lang.StringBuilder r0 = null;
        java.lang.String r1 = null;
        abcd.Rs r2 = null;
        abcd.Qs r3 = null;
        abcd.Qs r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.we != null) { $pc1 = 6; continue $sw1; }
                    return null;
                }
                case 6: {
                    if (this.J8 == 1) { $pc1 = 13; continue $sw1; }
                    r0 = new java.lang.StringBuilder();
                    r0.append("local target with ");
                    if (this.J8 != 0) { $pc1 = 10; continue $sw1; }
                    r1 = "no";
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r0.append(r1);
                    r0.append(" results");
                    throw new abcd.an(r0.toString());
                }
                case 10: {
                    r1 = "multiple";
                    { $pc1 = 11; continue $sw1; }
                }
                case 13: {
                    r2 = this.J0[0];
                    r3 = r2.getType();
                    r4 = this.we.getType();
                    if (r3 != r4) { $pc1 = 21; continue $sw1; }
                    if (r5 == false) { $pc1 = 19; continue $sw1; }
                    return this.we.j6(r2);
                }
                case 19: {
                    return this.we;
                }
                case 21: {
                    if (abcd.Um.j6(r4, r3) == true) { $pc1 = 23; continue $sw1; }
                    j6(r3, r4);
                    throw null;
                }
                case 23: {
                    if (r4 != abcd.Qs.QX) { $pc1 = 26; continue $sw1; }
                    this.we = this.we.j6(r2);
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void DW(int r1) {
        this.v5 = r1;
    }

    @Override
    public final void DW(abcd.Om r3, int r4) {
        j6();
        this.DW[0] = r3.DW().get(r4);
        this.FH = 1;
        this.tp = r4;
    }

    protected final void DW(abcd.Rs r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 6; continue $sw2; }
                    this.J0[0] = r3;
                    this.J8 = 1;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("result == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected final int EQ() {
        return this.tp;
    }

    protected final int FH() {
        return this.FH;
    }

    protected final abcd.Rs FH(int r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 >= this.FH) { $pc3 = 9; continue $sw3; }
                    return this.DW[r2];
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("n < 0");
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("n >= argCount");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected final abcd.Rs Hw(int r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 >= this.J8) { $pc4 = 9; continue $sw4; }
                    return this.J0[r2];
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("n < 0");
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("n >= resultCount");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected final void Hw() {
        this.J8 = 0;
    }

    protected final int VH() {
        return this.v5;
    }

    protected final abcd.Abstractms Zo() {
        return this.Zo;
    }

    protected final int gn() {
        return this.VH;
    }

    @Override
    public final void j6() {
        this.FH = 0;
        this.Hw = null;
        this.v5 = 0;
        this.Zo = null;
        this.VH = 0;
        this.gn = null;
        this.u7 = null;
        this.tp = -1;
        this.EQ = false;
        this.we = null;
        this.J8 = -1;
    }

    @Override
    public final void j6(int r1) {
        this.VH = r1;
    }

    @Override
    public final void j6(int r1, abcd.Qs r2, abcd.Vr r3) {
        this.we = abcd.bs.FH(r1, r2, r3);
    }

    protected final void j6(abcd.Om r3) {
        int r0 = 0;
        int r1 = 0;
        abcd.Nm r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.J8;
                    if (r0 < 0) { $pc5 = 18; continue $sw5; }
                    if (r0 != 0) { $pc5 = 6; continue $sw5; }
                    return;
                }
                case 6: {
                    r1 = 0;
                    if (this.we == null) { $pc5 = 9; continue $sw5; }
                    r3.DW().j6(DW(false));
                    return;
                }
                case 9: {
                    r4 = r3.FH();
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    if (r1 >= this.J8) { $pc5 = 23; continue $sw5; }
                    if (this.EQ == false) { $pc5 = 15; continue $sw5; }
                    r4.yS();
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r4.j6(this.J0[r1]);
                    r1 = r1 + 1;
                    { $pc5 = 11; continue $sw5; }
                }
                case 23: {
                    return;
                }
                case 18: {
                    throw new abcd.an("results never set");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Om r4, int r5) {
        abcd.Nm r6 = null;
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r6 = r4.FH();
                    j6();
                    if (r5 <= this.DW.length) { $pc6 = 5; continue $sw6; }
                    this.DW = new abcd.Rs[r5 + 10];
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r0 = r5 - 1;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r0 < 0) { $pc6 = 8; continue $sw6; }
                    this.DW[r0] = r6.er();
                    r0 = r0 - 1;
                    { $pc6 = 6; continue $sw6; }
                }
                case 8: {
                    this.FH = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Om r5, abcd.Os r6) {
        abcd.Ps r7 = null;
        int r0 = 0;
        int r8 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r7 = r6.VH();
                    r0 = r7.size();
                    j6(r5, r0);
                    r8 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r8 >= r0) { $pc7 = 9; continue $sw7; }
                    if (abcd.Um.j6(r7.getType(r8), this.DW[r8]) == false) { $pc7 = 8; continue $sw7; }
                    r8 = r8 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 8: {
                    throw new abcd.an("at stack depth " + ((r0 - 1) - r8) + ", expected type " + r7.getType(r8).aM() + " but found " + this.DW[r8].getType().aM());
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    j6(r4, 1);
                    if (abcd.Um.j6(r5, this.DW[0]) == false) { $pc8 = 6; continue $sw8; }
                    return;
                }
                case 6: {
                    throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5, abcd.Qs r6) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    j6(r4, 2);
                    if (abcd.Um.j6(r5, this.DW[0]) == false) { $pc9 = 10; continue $sw9; }
                    if (abcd.Um.j6(r6, this.DW[1]) == false) { $pc9 = 8; continue $sw9; }
                    return;
                }
                case 8: {
                    throw new abcd.an("expected type " + r6.aM() + " but found " + this.DW[1].getType().aM());
                }
                case 10: {
                    throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5, abcd.Qs r6, abcd.Qs r7) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    j6(r4, 3);
                    if (abcd.Um.j6(r5, this.DW[0]) == false) { $pc10 = 14; continue $sw10; }
                    if (abcd.Um.j6(r6, this.DW[1]) == false) { $pc10 = 12; continue $sw10; }
                    if (abcd.Um.j6(r7, this.DW[2]) == false) { $pc10 = 10; continue $sw10; }
                    return;
                }
                case 10: {
                    throw new abcd.an("expected type " + r7.aM() + " but found " + this.DW[2].getType().aM());
                }
                case 12: {
                    throw new abcd.an("expected type " + r6.aM() + " but found " + this.DW[1].getType().aM());
                }
                case 14: {
                    throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Qs r1) {
        this.Hw = r1;
    }

    protected final void j6(abcd.Rs r3) {
        abcd.Rs[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r3 == null) { $pc11 = 6; continue $sw11; }
                    r0 = this.J0;
                    r1 = this.J8;
                    r0[r1] = r3;
                    this.J8 = r1 + 1;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("result == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.cn r2) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r2 == null) { $pc12 = 6; continue $sw12; }
                    this.gn = r2;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("cases == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(abcd.Abstractms r2) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r2 == null) { $pc13 = 6; continue $sw13; }
                    this.Zo = r2;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("cst == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void j6(java.util.ArrayList<abcd.Abstractms> r1) {
        this.u7 = r1;
    }

    @Override
    public final void j6(boolean r1) {
        this.EQ = r1;
    }

    protected final java.util.ArrayList<abcd.Abstractms> tp() {
        return this.u7;
    }

    protected final abcd.Qs u7() {
        return this.Hw;
    }

    protected final abcd.cn v5() {
        return this.gn;
    }

    protected final int we() {
        int r0 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.J8;
                    if (r0 < 0) { $pc14 = 6; continue $sw14; }
                    return r0;
                }
                case 6: {
                    throw new abcd.an("results never set");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
