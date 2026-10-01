package abcd;

public class QF extends abcd.LF {
    private abcd.QF.a FH;
    private abcd.QF.a Hw;

    static class a {
        abcd.dG DW;
        abcd.QF.a j6;

        a() {
        }
    }

    public QF() {
    }

    QF(abcd.XF r2) {
        abcd.dG r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 3: {
                    r0 = r2.j6();
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    j6(r0);
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.QF.a DW(abcd.dG r3) {
        abcd.QF.a r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    r0 = new abcd.QF.a();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0.DW = r3;
                    return r0;
                }
                case 5: {
                    this.Hw = r0.j6;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.QF.a r2) {
        r2.j6 = this.Hw;
        this.Hw = r2;
    }

    @Override
    int DW() {
        return this.DW | 1;
    }

    boolean DW(int r3) {
        abcd.QF.a r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r0 == null) { $pc2 = 4; continue $sw2; }
                    if ((r0.DW.EQ & r3) == 0) { $pc2 = 8; continue $sw2; }
                    r0 = r0.j6;
                    { $pc2 = 3; continue $sw2; }
                }
                case 8: {
                    return false;
                }
                case 4: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        this.FH = null;
        this.Hw = null;
    }

    public abcd.dG Hw() {
        abcd.QF.a r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc3 = 7; continue $sw3; }
                    return null;
                }
                case 7: {
                    return r0.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.dG j6() {
        abcd.QF.a r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc4 = 6; continue $sw4; }
                    return null;
                }
                case 6: {
                    this.FH = r0.j6;
                    j6(r0);
                    return r0.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.dG r9) {
        abcd.QF.a r0 = null;
        long r1 = 0L;
        abcd.QF.a r10 = null;
        abcd.QF.a r3 = null;
        abcd.QF.a r7 = null;
        abcd.QF.a r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.FH;
                    r1 = r9.Ws;
                    r10 = DW(r9);
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r10.j6 = r0;
                    this.FH = r10;
                    return;
                }
                case 5: {
                    if (r1 > r0.DW.Ws) { $pc5 = 15; continue $sw5; }
                    r3 = r0.j6;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    r7 = r3;
                    r4 = r0;
                    r0 = r7;
                    if (r0 == null) { $pc5 = 14; continue $sw5; }
                    if (r0.DW.Ws <= r1) { $pc5 = 14; continue $sw5; }
                    r3 = r0.j6;
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r10.j6 = r4.j6;
                    r4.j6 = r10;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(int r3) {
        abcd.QF.a r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.FH;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r0 == null) { $pc6 = 4; continue $sw6; }
                    if ((r0.DW.EQ & r3) != 0) { $pc6 = 8; continue $sw6; }
                    r0 = r0.j6;
                    { $pc6 = 3; continue $sw6; }
                }
                case 8: {
                    return true;
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
        abcd.QF.a r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.FH;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r1 == null) { $pc7 = 5; continue $sw7; }
                    abcd.LF.j6(r0, r1.DW);
                    r1 = r1.j6;
                    { $pc7 = 3; continue $sw7; }
                }
                case 5: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
