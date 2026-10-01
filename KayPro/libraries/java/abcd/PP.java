package abcd;

public final class PP {
    private static final java.math.BigInteger j6 = null;

    static {
        j6 = java.math.BigInteger.valueOf(0);
    }

    public static java.math.BigInteger j6(java.math.BigInteger r3, java.math.BigInteger r4, java.security.SecureRandom r5) {
        int r0 = r3.compareTo(r4);
        if (r0 < 0) goto L9;
        if (r0 > 0) goto L7;
        return r3;
    L7:
        throw new java.lang.IllegalArgumentException("'min' may not be greater than 'max'");
    L9:
        if (r3.bitLength() > (r4.bitLength() / 2)) goto L11;
        int r1 = 0;
    L14:
        if (r1 >= 1000) goto L16;
        java.math.BigInteger r2 = new java.math.BigInteger(r4.bitLength(), r5);
        if (r2.compareTo(r3) < 0) goto L22;
        if (r2.compareTo(r4) > 0) goto L22;
        return r2;
    L22:
        r1 = r1 + 1;
        goto L14
    L16:
        return new java.math.BigInteger(r4.subtract(r3).bitLength() - 1, r5).add(r3);
    L11:
        return j6(j6, r4.subtract(r3), r5).add(r3);
    }
}
