package abcd;

class nE extends abcd.AbstractrE {
    nE(int r2, int r3) {
        super(r2, r3, null);
    }

    @Override
    public boolean j6(int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((61440 & r3) == 32768) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if ((r3 & 73) == 0) { $pc0 = 10; continue $sw0; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
