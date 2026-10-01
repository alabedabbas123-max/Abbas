package abcd;

class OO {
    private static final java.math.BigInteger DW = null;
    private static final java.math.BigInteger j6 = null;

    static {
        j6 = java.math.BigInteger.valueOf(1);
        DW = java.math.BigInteger.valueOf(2);
    }

    static java.math.BigInteger j6(java.math.BigInteger r2, java.math.BigInteger r3, java.security.SecureRandom r4) {
        java.math.BigInteger r5 = null;
        java.math.BigInteger r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r5 = r2.subtract(DW);
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r0 = abcd.PP.j6(DW, r5, r4).modPow(DW, r2);
                    if (r0.equals(j6) == true) { $pc0 = 3; continue $sw0; }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.math.BigInteger[] j6(int r5, int r6, java.security.SecureRandom r7) {
        int r8 = 0;
        java.math.BigInteger r1 = null;
        java.math.BigInteger r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r8 = r5 - 1;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = new java.math.BigInteger(r8, 2, r7);
                    r3 = r1.shiftLeft(1).add(j6);
                    if (r3.isProbablePrime(r6) == false) { $pc1 = 3; continue $sw1; }
                    if (r6 <= 2) { $pc1 = 9; continue $sw1; }
                    if (r1.isProbablePrime(r6) == false) { $pc1 = 3; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return new java.math.BigInteger[]{r3, r1};
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
