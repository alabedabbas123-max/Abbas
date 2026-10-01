package abcd;

class ko extends abcd.Tr.a {
    final int DW;
    final int FH;
    final boolean[] j6;

    ko(boolean[] r1, int r2, int r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void j6(abcd.Yr r6) {
        int r0 = 0;
        boolean[] r1 = null;
        boolean r7 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6.v5().Hw() != 3) { $pc0 = 12; continue $sw0; }
                    r0 = ((abcd.ys) r6.tp()).rN();
                    r1 = this.j6;
                    if (r1[0] == true) { $pc0 = 7; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r7 = false;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r1[0] = r7;
                    return;
                }
                case 7: {
                    if (((this.DW - this.FH) + r0) != r6.VH().we()) { $pc0 = 9; continue $sw0; }
                    r7 = true;
                    { $pc0 = 10; continue $sw0; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
