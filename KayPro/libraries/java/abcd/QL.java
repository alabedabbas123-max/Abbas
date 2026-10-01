package abcd;

class QL {
    static final abcd.WL DW = null;
    static final abcd.UL j6 = null;

    static {
        j6 = new abcd.UL();
        DW = new abcd.WL();
    }

    static abcd.UL j6(abcd.rL r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.j6() >= 1) { $pc0 = 6; continue $sw0; }
                    return j6;
                }
                case 6: {
                    return new abcd.UL(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
