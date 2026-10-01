package abcd;

public class YF extends abcd.OF {
    private abcd.OF.a Hw;

    YF(abcd.XF r1) {
        super(r1);
    }

    @Override
    public abcd.dG j6() {
        abcd.OF.a r0 = null;
        abcd.dG r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc0 = 6; continue $sw0; }
                    return null;
                }
                case 6: {
                    r1 = r0.v5();
                    if (r0.FH() == false) { $pc0 = 9; continue $sw0; }
                    this.Hw = r0.j6;
                    this.FH.j6(r0);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.dG r3) {
        abcd.OF.a r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0 = this.FH.j6();
                    r0.Zo();
                    r0.j6 = this.Hw;
                    this.Hw = r0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r0.DW(r3);
                    return;
                }
                case 5: {
                    if (r0.j6() == true) { $pc1 = 7; continue $sw1; }
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(int r4) {
        abcd.OF.a r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r0 == null) { $pc2 = 4; continue $sw2; }
                    r1 = r0.FH;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r1 >= r0.Hw) { $pc2 = 9; continue $sw2; }
                    if ((r0.DW[r1].EQ & r4) != 0) { $pc2 = 12; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 8; continue $sw2; }
                }
                case 12: {
                    return true;
                }
                case 9: {
                    r0 = r0.j6;
                    { $pc2 = 3; continue $sw2; }
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
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.Hw;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 == null) { $pc3 = 5; continue $sw3; }
                    r2 = r1.FH;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r2 >= r1.Hw) { $pc3 = 9; continue $sw3; }
                    abcd.LF.j6(r0, r1.DW[r2]);
                    r2 = r2 + 1;
                    { $pc3 = 8; continue $sw3; }
                }
                case 9: {
                    r1 = r1.j6;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
