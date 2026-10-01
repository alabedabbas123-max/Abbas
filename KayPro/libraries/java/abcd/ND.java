package abcd;

final class ND extends abcd.MD {
    private final char FH;

    protected ND(char r2) {
        super(false);
        this.FH = r2;
    }

    @Override
    protected final boolean DW(char r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != this.FH) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
