package abcd;

abstract class IC {
    protected abcd.QC[] DW;
    protected int FH;
    protected abcd.KC j6;

    protected IC(abcd.KC r1, int r2) {
        this.j6 = r1;
        this.DW = new abcd.QC[r2];
    }

    public abstract void DW();

    public abcd.KC FH() {
        return this.j6;
    }

    protected void Hw() {
        int r0 = 0;
        abcd.QC[] r1 = null;
        abcd.QC[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    r1 = this.DW;
                    if (r0 >= (r1.length / 2)) { $pc0 = 5; continue $sw0; }
                    r2 = new abcd.QC[r0];
                    java.lang.System.arraycopy(r1, 0, r2, 0, r0);
                    this.DW = r2;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.j6.j6(this.DW, this.FH);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(int r5, int r6) {
        int r0 = 0;
        abcd.QC[] r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH;
                    if ((r0 + r6) <= this.DW.length) { $pc1 = 5; continue $sw1; }
                    r1 = new abcd.QC[java.lang.Math.max(((r0 + 16) * 3) / 2, r0 + r6)];
                    java.lang.System.arraycopy(this.DW, 0, r1, 0, this.FH);
                    this.DW = r1;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    this.j6.j6(r5, this.DW, this.FH, r6);
                    this.FH += r6;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(abcd.QC r5) {
        abcd.QC[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.QC[] r3 = null;
        abcd.QC[] r4 = null;
        int r6 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    r1 = r0.length;
                    r2 = this.FH;
                    if (r1 != r2) { $pc2 = 5; continue $sw2; }
                    r3 = new abcd.QC[((r2 + 16) * 3) / 2];
                    java.lang.System.arraycopy(r0, 0, r3, 0, r2);
                    this.DW = r3;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r4 = this.DW;
                    r6 = this.FH;
                    this.FH = r6 + 1;
                    r4[r6] = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        DW();
        this.j6.EQ();
        return this.j6.FH();
    }
}
