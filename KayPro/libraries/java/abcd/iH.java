package abcd;

class iH extends abcd.AbstractgH {
    iH(java.io.OutputStream r1) {
        super(r1);
    }

    private void Hw() {
        java.util.Iterator<? extends abcd.CI> r0 = null;
        abcd.CI r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r1 = r0.next();
                    abcd.FK.DW(this.FH, 0, r1.aM());
                    this.DW.write(this.FH, 0, 4);
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void VH() {
        java.util.Iterator<? extends abcd.CI> r0 = null;
        long r1 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 5; continue $sw1; }
                    r1 = r0.next().getOffset();
                    if (2147483647L >= r1) { $pc1 = 4; continue $sw1; }
                    abcd.FK.j6(this.FH, 0, r1);
                    this.DW.write(this.FH, 0, 8);
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        java.util.Iterator<? extends abcd.CI> r0 = null;
        int r2 = 0;
        long r3 = 0L;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw.iterator();
                    r2 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc2 = 5; continue $sw2; }
                    r3 = r0.next().getOffset();
                    if (r3 > 2147483647L) { $pc2 = 9; continue $sw2; }
                    abcd.FK.DW(this.FH, 0, (int) r3);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    this.DW.write(this.FH, 0, 4);
                    { $pc2 = 4; continue $sw2; }
                }
                case 9: {
                    r5 = r2 + 1;
                    abcd.FK.DW(this.FH, 0, r2 | Integer.MIN_VALUE);
                    r2 = r5;
                    { $pc2 = 10; continue $sw2; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        java.util.Iterator<? extends abcd.CI> r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 5; continue $sw3; }
                    r0.next().j6(this.DW);
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void FH() {
        j6(2);
        DW();
        v5();
        Hw();
        Zo();
        VH();
        j6();
    }
}
