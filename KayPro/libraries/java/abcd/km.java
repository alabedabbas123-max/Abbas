package abcd;

public final class km extends abcd.AbstractAm {
    private final abcd.Ms DW;

    public km(abcd.Ms r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("ConstantValue");
                    if ((r2 instanceof abcd.Js) == false) { $pc0 = 5; continue $sw0; }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    this.DW = r2;
                    return;
                }
                case 5: {
                    if ((r2 instanceof abcd.ys) == true) { $pc0 = 17; continue $sw0; }
                    if ((r2 instanceof abcd.Es) == true) { $pc0 = 17; continue $sw0; }
                    if ((r2 instanceof abcd.xs) == true) { $pc0 = 17; continue $sw0; }
                    if ((r2 instanceof abcd.us) == true) { $pc0 = 17; continue $sw0; }
                    if (r2 != null) { $pc0 = 16; continue $sw0; }
                    throw new java.lang.NullPointerException("constantValue == null");
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("bad type for constantValue");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Hw() {
        return 8;
    }

    public abcd.Ms j6() {
        return this.DW;
    }
}
