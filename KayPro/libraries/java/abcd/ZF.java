package abcd;

class ZF extends abcd.XF {
    private final abcd.QF DW;
    private int FH;
    private int Hw;
    private final abcd.qG j6;
    private int v5;

    ZF(abcd.qG r1) {
        this.j6 = r1;
        this.DW = new abcd.QF();
    }

    private boolean DW(abcd.dG r5, int r6) {
        boolean r0 = false;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r5.EQ & r6) != r6) { $pc0 = 5; continue $sw0; }
                    r0 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r5.EQ = r6 | r5.EQ;
                    r7 = r5.EQ;
                    if ((this.v5 & r7) != this.Hw) { $pc0 = 10; continue $sw0; }
                    r5.EQ = r7 & (-17);
                    this.DW.j6(r5);
                    j6(r5, this.FH | 8);
                    return true;
                }
                case 10: {
                    return r0;
                }
                case 5: {
                    r0 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.dG r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.FH();
                    this.FH |= r0;
                    r1 = r5.EQ;
                    if ((this.FH & r1) != 0) { $pc1 = 7; continue $sw1; }
                    r5.EQ = r0 | r1;
                    this.DW.j6(r5);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().staleRevFlagsOn, new java.lang.Object[]{r5.we()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.dG r5, int r6) {
        abcd.dG[] r7 = null;
        int r0 = 0;
        int r1 = 0;
        abcd.dG r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 2;
        $sw2: while (true) {
            switch ($pc2) {
                case 2: {
                    r7 = r5.J8;
                    if (r7 == null) { $pc2 = 4; continue $sw2; }
                    r0 = r7.length;
                    if (r0 == 0) { $pc2 = 7; continue $sw2; }
                    r1 = 1;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r1 >= r0) { $pc2 = 10; continue $sw2; }
                    r2 = r7[r1];
                    if (DW(r2, r6) == true) { $pc2 = 16; continue $sw2; }
                    j6(r2, r6);
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r1 = r1 + 1;
                    { $pc2 = 9; continue $sw2; }
                }
                case 10: {
                    r5 = r7[0];
                    if (DW(r5, r6) == false) { $pc2 = 2; continue $sw2; }
                    return;
                }
                case 7: {
                    return;
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int DW() {
        return 0;
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = null;
        abcd.dG[] r2 = null;
        int r3 = 0;
        boolean r4 = false;
        int r5 = 0;
        abcd.dG r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 2;
        $sw3: while (true) {
            switch ($pc3) {
                case 2: {
                    r0 = this.DW.j6();
                    if (r0 == null) { $pc3 = 4; continue $sw3; }
                    r2 = r0.J8;
                    r3 = r2.length;
                    r4 = false;
                    r5 = 0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r5 >= r3) { $pc3 = 8; continue $sw3; }
                    r6 = r2[r5];
                    r7 = r6.EQ;
                    if ((r7 & 2) != 0) { $pc3 = 29; continue $sw3; }
                    if ((r7 & 1) != 0) { $pc3 = 28; continue $sw3; }
                    r6.j6(this.j6);
                    $pc3 = 28; continue $sw3;
                }
                case 28: {
                    r6.EQ |= 2;
                    this.DW.j6(r6);
                    $pc3 = 29; continue $sw3;
                }
                case 29: {
                    r5 = r5 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 8: {
                    r8 = r0.EQ;
                    r9 = this.FH;
                    r10 = r8 & r9;
                    if (r10 != r9) { $pc3 = 11; continue $sw3; }
                    r4 = true;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r4 == false) { $pc3 = 13; continue $sw3; }
                    r10 = r10 | 8;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    j6(r0, r10);
                    r11 = r0.EQ;
                    if ((r11 & 8) != 0) { $pc3 = 16; continue $sw3; }
                    r0.EQ = r11 | 16;
                    if (r4 == false) { $pc3 = 2; continue $sw3; }
                    r0.EQ |= 8;
                    return r0;
                }
                case 16: {
                    if (this.DW.DW(8) == false) { $pc3 = 2; continue $sw3; }
                    return null;
                }
                case 4: {
                    this.j6.DW.Hw();
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.LF r3) {
        abcd.dG r0 = null;
        int r4 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 12;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    try {
                        r0 = r3.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    if (r0 == null) { $pc4 = 4; continue $sw4; }
                    try {
                        j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    { $pc4 = 12; continue $sw4; }
                }
                case 4: {
                    this.j6.v5(this.FH);
                    r4 = this.FH;
                    this.Hw = r4 | 16;
                    this.v5 = (r4 | 16) | 8;
                    return;
                }
                case 8: {
                    th = $ex4;
                    this.j6.v5(this.FH);
                    r1 = this.FH;
                    this.Hw = r1 | 16;
                    this.v5 = (r1 | 16) | 8;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
