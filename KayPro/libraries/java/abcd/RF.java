package abcd;

final class RF extends abcd.XF {
    private final abcd.UF DW;
    private int FH;
    private final abcd.XF j6;

    RF(abcd.XF r1) {
        this.j6 = r1;
        this.DW = new abcd.UF();
    }

    @Override
    int DW() {
        return this.j6.DW();
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = null;
        abcd.dG r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 3: {
                    if (this.FH >= 6) { $pc0 = 7; continue $sw0; }
                    r0 = this.j6.j6();
                    if (r0 == null) { $pc0 = 7; continue $sw0; }
                    this.DW.j6(r0);
                    this.FH++;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r1 = this.DW.j6();
                    if (r1 != null) { $pc0 = 11; continue $sw0; }
                    return null;
                }
                case 11: {
                    this.FH--;
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
