package abcd;

public final class mm extends abcd.AbstractAm {
    private final abcd.Ks DW;
    private final abcd.Hs FH;

    public mm(abcd.Ks r2, abcd.Hs r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("EnclosingMethod");
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    this.FH = r3;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hs DW() {
        return this.FH;
    }

    @Override
    public int Hw() {
        return 10;
    }

    public abcd.Ks j6() {
        return this.DW;
    }
}
