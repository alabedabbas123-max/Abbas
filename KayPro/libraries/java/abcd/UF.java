package abcd;

public class UF extends abcd.OF {
    private abcd.OF.a Hw;
    private abcd.OF.a v5;

    public UF() {
    }

    UF(abcd.XF r1) {
        super(r1);
    }

    void DW(int r5) {
        int r6 = 0;
        abcd.OF.a r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r5 ^ (-1);
                    r0 = this.Hw;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 == null) { $pc0 = 4; continue $sw0; }
                    r1 = r0.FH;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r0.Hw) { $pc0 = 8; continue $sw0; }
                    r0.DW[r1].EQ &= r6;
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    r0 = r0.j6;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.dG r3) {
        abcd.OF.a r0 = null;
        abcd.OF.a r1 = null;
        abcd.OF.a r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc1 = 7; continue $sw1; }
                    r1 = this.FH.j6();
                    r1.VH();
                    r1.j6(r3);
                    this.Hw = r1;
                    this.v5 = r1;
                    return;
                }
                case 7: {
                    if (r0.j6() == false) { $pc1 = 10; continue $sw1; }
                    r0.DW(r3);
                    return;
                }
                case 10: {
                    r2 = this.FH.j6();
                    r2.Zo();
                    r2.DW(r3);
                    r2.j6 = this.Hw;
                    this.Hw = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.dG j6() {
        abcd.OF.a r0 = null;
        abcd.dG r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    r2 = r0.v5();
                    if (r0.FH() == false) { $pc2 = 11; continue $sw2; }
                    this.Hw = r0.j6;
                    if (this.Hw != null) { $pc2 = 10; continue $sw2; }
                    this.v5 = null;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    this.FH.j6(r0);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.dG r3) {
        abcd.OF.a r0 = null;
        abcd.OF.a r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc3 = 7; continue $sw3; }
                    r1 = this.FH.j6();
                    r1.j6(r3);
                    this.Hw = r1;
                    this.v5 = r1;
                    return;
                }
                case 7: {
                    if (r0.Hw() == false) { $pc3 = 9; continue $sw3; }
                    r0 = this.FH.j6();
                    this.v5.j6 = r0;
                    this.v5 = r0;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r0.j6(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(int r4) {
        abcd.OF.a r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.Hw;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r0 == null) { $pc4 = 4; continue $sw4; }
                    r1 = r0.FH;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r1 >= r0.Hw) { $pc4 = 9; continue $sw4; }
                    if ((r0.DW[r1].EQ & r4) != 0) { $pc4 = 12; continue $sw4; }
                    r1 = r1 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 12: {
                    return true;
                }
                case 9: {
                    r0 = r0.j6;
                    { $pc4 = 3; continue $sw4; }
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.OF.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.Hw;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 == null) { $pc5 = 5; continue $sw5; }
                    r2 = r1.FH;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r2 >= r1.Hw) { $pc5 = 9; continue $sw5; }
                    abcd.LF.j6(r0, r1.DW[r2]);
                    r2 = r2 + 1;
                    { $pc5 = 8; continue $sw5; }
                }
                case 9: {
                    r1 = r1.j6;
                    { $pc5 = 3; continue $sw5; }
                }
                case 5: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
