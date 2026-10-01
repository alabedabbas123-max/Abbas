package abcd;

class OO {
    private static final java.math.BigInteger DW = null;
    private static final java.math.BigInteger j6 = null;

    static {
        j6 = java.math.BigInteger.valueOf(1);
        DW = java.math.BigInteger.valueOf(2);
    }

    static java.math.BigInteger j6(java.math.BigInteger r2, java.math.BigInteger r3, java.security.SecureRandom r4) {
        java.math.BigInteger r5 = r2.subtract(DW);
    L3:
        java.math.BigInteger r0 = abcd.PP.j6(DW, r5, r4).modPow(DW, r2);
        if (r0.equals(j6) == true) goto L3;
        return r0;
    }

    static java.math.BigInteger[] j6(int r5, int r6, java.security.SecureRandom r7) {
        int r8 = r5 - 1;
    L3:
        java.math.BigInteger r1 = new java.math.BigInteger(r8, 2, r7);
        java.math.BigInteger r3 = r1.shiftLeft(1).add(j6);
        if (r3.isProbablePrime(r6) == false) goto L3;
        if (r6 <= 2) goto L9;
        if (r1.isProbablePrime(r6) == false) goto L3;
    L9:
        return new java.math.BigInteger[]{r3, r1};
    }
}
