package abcd;

final class SD extends abcd.MD {
    private final char FH;

    SD(char r1, boolean r2) {
        super(r2);
        this.FH = r1;
    }

    @Override
    protected final boolean DW(char r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == this.FH) { $pc0 = 6; continue $sw0; }
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
