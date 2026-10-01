package abcd;

class pE extends abcd.AbstractrE {
    pE(int r2, int r3) {
        super(r2, r3, null);
    }

    @Override
    public boolean j6(int r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 != 0) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
