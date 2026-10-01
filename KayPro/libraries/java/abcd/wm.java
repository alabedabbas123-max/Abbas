package abcd;

public final class wm extends abcd.AbstractAm {
    private final abcd.Js DW;

    public wm(abcd.Js r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("Signature");
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("signature == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Hw() {
        return 8;
    }

    public abcd.Js j6() {
        return this.DW;
    }
}
