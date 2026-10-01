package abcd;

class MO {
    private static final java.math.BigInteger DW = null;
    private static final java.math.BigInteger FH = null;
    static final abcd.MO j6 = null;

    static {
        j6 = new abcd.MO();
        DW = java.math.BigInteger.valueOf(1);
        FH = java.math.BigInteger.valueOf(2);
    }

    private MO() {
    }

    java.math.BigInteger j6(abcd.TO r2, java.math.BigInteger r3) {
        return r2.j6().modPow(r3, r2.Hw());
    }

    java.math.BigInteger j6(abcd.TO r4, java.security.SecureRandom r5) {
        java.math.BigInteger r0 = null;
        int r1 = 0;
        java.math.BigInteger r2 = null;
        int r3 = 0;
        java.math.BigInteger r6 = null;
        java.math.BigInteger r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.Hw();
                    r1 = r4.DW();
                    if (r1 != 0) { $pc0 = 5; continue $sw0; }
                    r2 = FH;
                    r3 = r4.FH();
                    if (r3 == 0) { $pc0 = 9; continue $sw0; }
                    r2 = DW.shiftLeft(r3 - 1);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r6 = r0.subtract(FH);
                    r7 = r4.v5();
                    if (r7 == null) { $pc0 = 13; continue $sw0; }
                    r6 = r7.subtract(FH);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return abcd.PP.j6(r2, r6, r5);
                }
                case 5: {
                    return new java.math.BigInteger(r1, r5).setBit(r1 - 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
