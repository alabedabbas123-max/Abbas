package abcd;

class oE extends abcd.AbstractrE {
    oE(int r2, int r3) {
        super(r2, r3, null);
    }

    @Override
    public boolean j6(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 & 61440) != 57344) { $pc0 = 6; continue $sw0; }
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
