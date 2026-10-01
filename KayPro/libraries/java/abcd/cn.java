package abcd;

public final class cn extends abcd.hu {
    private final abcd.au DW;
    private final abcd.au FH;
    private int Hw;

    public cn(int r3) {
        super(true);
        this.DW = new abcd.au(r3);
        this.FH = new abcd.au(r3 + 1);
        this.Hw = r3;
    }

    public int DW(int r2) {
        return this.FH.get(r2);
    }

    public int FH(int r2) {
        return this.DW.get(r2);
    }

    public void Hw(int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    J8();
                    if (r3 < 0) { $pc0 = 11; continue $sw0; }
                    if (this.FH.size() != this.Hw) { $pc0 = 9; continue $sw0; }
                    this.FH.DW(r3);
                    return;
                }
                case 9: {
                    throw new java.lang.RuntimeException("non-default elements not all set");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("target < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au er() {
        return this.DW;
    }

    public void j6(int r2, int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    J8();
                    if (r3 < 0) { $pc1 = 7; continue $sw1; }
                    this.DW.DW(r2);
                    this.FH.DW(r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("target < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int lg() {
        return this.FH.get(this.Hw);
    }

    public abcd.au rN() {
        return this.FH;
    }

    public int size() {
        return this.Hw;
    }

    @Override
    public void we() {
        this.DW.we();
        this.FH.we();
        super.we();
    }

    public void yS() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        abcd.au r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    J8();
                    r0 = this.Hw;
                    if (r0 != (this.FH.size() - 1)) { $pc2 = 16; continue $sw2; }
                    r1 = this.FH.get(r0);
                    r2 = 0;
                    r3 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r2 >= r0) { $pc2 = 12; continue $sw2; }
                    r4 = this.FH.get(r2);
                    if (r4 == r1) { $pc2 = 11; continue $sw2; }
                    if (r2 == r3) { $pc2 = 10; continue $sw2; }
                    this.FH.FH(r3, r4);
                    r5 = this.DW;
                    r5.FH(r3, r5.get(r2));
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r3 = r3 + 1;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r2 = r2 + 1;
                    { $pc2 = 5; continue $sw2; }
                }
                case 12: {
                    if (r3 == r0) { $pc2 = 21; continue $sw2; }
                    this.DW.gn(r3);
                    this.FH.FH(r3, r1);
                    this.FH.gn(r3 + 1);
                    this.Hw = r3;
                    return;
                }
                case 21: {
                    return;
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("incomplete instance");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
