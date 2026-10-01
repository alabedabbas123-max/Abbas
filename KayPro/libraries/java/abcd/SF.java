package abcd;

class SF extends abcd.XF {
    private final int DW;
    private final abcd.qG FH;
    private final abcd.fG Hw;
    private final abcd.UF j6;
    private final abcd.fG v5;

    /* JADX WARN: Multi-variable type inference failed */
    SF(abcd.TF r2, abcd.XF r3) {
        abcd.dG r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new abcd.UF();
                    this.FH = (abcd.qG) r2;
                    this.DW = r2.getDepth();
                    this.Hw = r2.DW();
                    this.v5 = r2.j6();
                    r3.j6(this.j6);
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r4 = r3.j6();
                    if (r4 == null) { $pc0 = 5; continue $sw0; }
                    if (((abcd.TF.a) r4).BT() != 0) { $pc0 = 3; continue $sw0; }
                    this.j6.j6(r4);
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int DW() {
        return this.j6.DW() | 16;
    }

    @Override
    abcd.dG j6() {
        abcd.TF.a r0 = null;
        boolean r2 = false;
        int r1 = 0;
        abcd.dG[] r3 = null;
        int r4 = 0;
        int r6 = 0;
        abcd.dG r7 = null;
        abcd.TF.a r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    r0 = (abcd.TF.a) this.j6.j6();
                    if (r0 == null) { $pc1 = 4; continue $sw1; }
                    r2 = true;
                    if ((r0.EQ & 1) != 0) { $pc1 = 9; continue $sw1; }
                    r0.j6(this.FH);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r1 = r0.aM + 1;
                    r3 = r0.J8;
                    r4 = r3.length;
                    r6 = 0;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r6 >= r4) { $pc1 = 12; continue $sw1; }
                    r7 = r3[r6];
                    r8 = (abcd.TF.a) r7;
                    if (r8.aM != (-1)) { $pc1 = 28; continue $sw1; }
                    r8.aM = r1;
                    if (r1 > this.DW) { $pc1 = 28; continue $sw1; }
                    this.j6.j6(r7);
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (r0.DW(this.Hw) == false) { $pc1 = 30; continue $sw1; }
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    r7.j6(this.v5);
                    r7.EQ &= -5;
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r6 = r6 + 1;
                    { $pc1 = 10; continue $sw1; }
                }
                case 30: {
                    if (r0.DW(this.v5) == false) { $pc1 = 32; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r0.aM <= this.DW) { $pc1 = 16; continue $sw1; }
                    r2 = false;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if ((r0.EQ & 4) == 0) { $pc1 = 20; continue $sw1; }
                    if (r0.DW(this.Hw) == true) { $pc1 = 20; continue $sw1; }
                    r2 = false;
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    if (r2 == false) { $pc1 = 2; continue $sw1; }
                    return r0;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
