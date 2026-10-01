package abcd;

public class RO extends abcd.uO {
    private abcd.TO FH;

    public RO(java.security.SecureRandom r2, abcd.TO r3) {
        super(r2, j6(r3));
        this.FH = r3;
    }

    static int j6(abcd.TO r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1.DW() == 0) { $pc0 = 6; continue $sw0; }
                    return r1.DW();
                }
                case 6: {
                    return r1.Hw().bitLength();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.TO DW() {
        return this.FH;
    }
}
