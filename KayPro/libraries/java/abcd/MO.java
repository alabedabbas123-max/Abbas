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
        java.math.BigInteger r0 = r4.Hw();
        int r1 = r4.DW();
        if (r1 != 0) goto L5;
        java.math.BigInteger r2 = FH;
        int r3 = r4.FH();
        if (r3 == 0) goto L9;
        r2 = DW.shiftLeft(r3 - 1);
    L9:
        java.math.BigInteger r6 = r0.subtract(FH);
        java.math.BigInteger r7 = r4.v5();
        if (r7 == null) goto L13;
        r6 = r7.subtract(FH);
    L13:
        return abcd.PP.j6(r2, r6, r5);
    L5:
        return new java.math.BigInteger(r1, r5).setBit(r1 - 1);
    }
}
