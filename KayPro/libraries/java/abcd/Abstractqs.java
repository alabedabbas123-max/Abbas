package abcd;

public abstract class Abstractqs extends abcd.Fs {
    private final abcd.Os FH;
    private abcd.Os Hw;

    Abstractqs(abcd.Ks r1, abcd.Hs r2) {
        super(r1, r2);
        this.FH = abcd.Os.j6(we().VH().we());
        this.Hw = null;
    }

    @Override
    protected final int DW(abcd.Abstractms r2) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = super.DW(r2);
                    if (r0 == 0) { $pc0 = 6; continue $sw0; }
                    return r0;
                }
                case 6: {
                    return this.FH.j6(((abcd.Abstractqs) r2).FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.Os DW(boolean r2) {
        abcd.Qs r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 == false) { $pc1 = 6; continue $sw1; }
                    return this.FH;
                }
                case 6: {
                    if (this.Hw != null) { $pc1 = 9; continue $sw1; }
                    r3 = VH().VH();
                    this.Hw = this.FH.j6(r3);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.Os J8() {
        return this.FH;
    }

    public final boolean Ws() {
        return we().Ws();
    }

    @Override
    public final abcd.Qs getType() {
        return this.FH.we();
    }

    public final int j6(boolean r1) {
        return DW(r1).VH().rN();
    }

    public final boolean lg() {
        return we().lg();
    }
}
