package abcd;

public abstract class AbstractwF {
    protected final abcd.IE DW;
    protected final abcd.qG FH;
    private abcd.EE Hw;
    protected abcd.mG[] VH;
    protected abcd.dG[] Zo;
    protected final abcd.UE j6;
    protected abcd.AbstractiG[] v5;

    protected AbstractwF(abcd.UE r2) {
        this.j6 = r2;
        this.DW = this.j6.j3();
        this.FH = new abcd.qG(this.DW);
    }

    protected abcd.TJ DW(int r1, int r2) {
        abcd.dG r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3 = j6(r1, r2);
                    if (r3 != null) { $pc0 = 6; continue $sw0; }
                    return new abcd.VJ();
                }
                case 6: {
                    return j6(r3.yS());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.UE DW() {
        return this.j6;
    }

    public abstract abcd.yE FH();

    protected abstract boolean Hw();

    public abcd.EE j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw != null) { $pc1 = 6; continue $sw1; }
                    this.Hw = DW().aM();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.TJ j6(abcd.YD r4) {
        return new abcd.UJ(null, this.DW, r4);
    }

    public abcd.dG j6(int r8, int r9) {
        abcd.dG[] r0 = null;
        abcd.dG r1 = null;
        abcd.dG r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Zo;
                    if (r0[r8] == null) { $pc2 = 18; continue $sw2; }
                    if (r0[r9] == null) { $pc2 = 16; continue $sw2; }
                    this.FH.we();
                    this.FH.j6(abcd.AbstractyG.Hw);
                    this.FH.DW(this.Zo[r8]);
                    this.FH.DW(this.Zo[r9]);
                    r1 = this.FH.tp();
                    if (r1 != null) { $pc2 = 10; continue $sw2; }
                    return null;
                }
                case 10: {
                    r2 = this.FH.tp();
                    if (r2 != null) { $pc2 = 14; continue $sw2; }
                    return r1;
                }
                case 14: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().multipleMergeBasesFor, new java.lang.Object[]{this.Zo[r8].we(), this.Zo[r9].we(), r1.we(), r2.we()}));
                }
                case 16: {
                    throw new abcd.ZC(this.v5[r9], "commit");
                }
                case 18: {
                    throw new abcd.ZC(this.v5[r8], "commit");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.YD... r6) {
        int r0 = 0;
        int r1 = 0;
        int r7 = 0;
        abcd.AbstractiG[] r2 = null;
        abcd.AbstractiG[] r8 = null;
        boolean r9 = false;
        abcd.EE r3 = null;
        abcd.EE r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.v5 = new abcd.AbstractiG[r6.length];
                    r0 = 0;
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1 >= r6.length) { $pc3 = 5; continue $sw3; }
                    this.v5[r1] = this.FH.Zo(r6[r1]);
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    this.Zo = new abcd.dG[this.v5.length];
                    r7 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r2 = this.v5;
                    if (r7 >= r2.length) { $pc3 = 8; continue $sw3; }
                    try {
                        this.Zo[r7] = this.FH.VH(r2[r7]);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof abcd.ZC) { $pc3 = 30; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 31; continue $sw3;
                }
                case 31: {
                    r7 = r7 + 1;
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    this.Zo[r7] = null;
                    { $pc3 = 31; continue $sw3; }
                }
                case 8: {
                    this.VH = new abcd.mG[r2.length];
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r8 = this.v5;
                    if (r0 >= r8.length) { $pc3 = 33; continue $sw3; }
                    this.VH[r0] = this.FH.gn(r8[r0]);
                    r0 = r0 + 1;
                    { $pc3 = 9; continue $sw3; }
                }
                case 33: {
                    try {
                        r9 = Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 21; continue $sw3;
                    }
                    if (r9 == true) { $pc3 = 14; continue $sw3; }
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    r3 = this.Hw;
                    if (r3 == null) { $pc3 = 19; continue $sw3; }
                    r3.Hw();
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    this.DW.FH();
                    return r9;
                }
                case 14: {
                    if (this.Hw == null) { $pc3 = 16; continue $sw3; }
                    try {
                        this.Hw.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 21; continue $sw3;
                    }
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    th = $ex3;
                    r4 = this.Hw;
                    if (r4 == null) { $pc3 = 25; continue $sw3; }
                    r4.Hw();
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    this.DW.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
