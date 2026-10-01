package abcd;

public final class PP {
    private static final java.math.BigInteger j6 = null;

    static {
        j6 = java.math.BigInteger.valueOf(0);
    }

    public static java.math.BigInteger j6(java.math.BigInteger r3, java.math.BigInteger r4, java.security.SecureRandom r5) {
        int r0 = 0;
        int r1 = 0;
        java.math.BigInteger r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.compareTo(r4);
                    if (r0 < 0) { $pc0 = 9; continue $sw0; }
                    if (r0 > 0) { $pc0 = 7; continue $sw0; }
                    return r3;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("'min' may not be greater than 'max'");
                }
                case 9: {
                    if (r3.bitLength() > (r4.bitLength() / 2)) { $pc0 = 11; continue $sw0; }
                    r1 = 0;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r1 >= 1000) { $pc0 = 16; continue $sw0; }
                    r2 = new java.math.BigInteger(r4.bitLength(), r5);
                    if (r2.compareTo(r3) < 0) { $pc0 = 22; continue $sw0; }
                    if (r2.compareTo(r4) > 0) { $pc0 = 22; continue $sw0; }
                    return r2;
                }
                case 22: {
                    r1 = r1 + 1;
                    { $pc0 = 14; continue $sw0; }
                }
                case 16: {
                    return new java.math.BigInteger(r4.subtract(r3).bitLength() - 1, r5).add(r3);
                }
                case 11: {
                    return j6(j6, r4.subtract(r3), r5).add(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
