package abcd;

class NG extends abcd.GH {
    final abcd.OG J0;
    private final abcd.FE J8;
    private final abcd.wH Ws;
    private long we;

    NG(abcd.OG r1, java.io.InputStream r2, abcd.FE r3, abcd.wH r4) {
        this.J0 = r1;
        this.J8 = r3;
        this.Ws = r4;
        super(r2);
        this.we = -1;
    }

    @Override
    protected java.io.InputStream FH() {
        abcd.FE r0 = null;
        java.io.InputStream r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.J8;
                    if ((r0 instanceof abcd.OG) == false) { $pc0 = 5; continue $sw0; }
                    r1 = abcd.OG.j6((abcd.OG) r0, this.Ws);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.we == (-1)) { $pc0 = 9; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return r1;
                }
                case 9: {
                    if ((r1 instanceof abcd.GH) == false) { $pc0 = 12; continue $sw0; }
                    this.we = ((abcd.GH) r1).DW();
                    { $pc0 = 14; continue $sw0; }
                }
                case 12: {
                    if ((r1 instanceof abcd.JE) == false) { $pc0 = 14; continue $sw0; }
                    this.we = ((abcd.JE) r1).j6();
                    { $pc0 = 14; continue $sw0; }
                }
                case 5: {
                    r1 = r0.v5();
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected long j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.we != (-1)) { $pc1 = 6; continue $sw1; }
                    this.we = this.J8.DW();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
