package abcd;

class qE extends abcd.AbstractrE {
    private final int tp;

    qE(int r1, int r2, int r3) {
        this.tp = r3;
        super(r1, r2, null);
    }

    @Override
    public boolean j6(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.tp != r2) { $pc0 = 6; continue $sw0; }
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
