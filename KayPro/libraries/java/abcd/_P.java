package abcd;

class _P {
    private static java.util.Hashtable DW;
    private static java.util.Set FH;
    private static java.util.Hashtable j6;

    static {
        j6 = new java.util.Hashtable();
        DW = new java.util.Hashtable();
        FH = new java.util.HashSet();
        j6.put("MD2WITHRSAENCRYPTION", abcd.InterfacelN.FH);
        j6.put("MD2WITHRSA", abcd.InterfacelN.FH);
        j6.put("MD5WITHRSAENCRYPTION", abcd.InterfacelN.v5);
        j6.put("MD5WITHRSA", abcd.InterfacelN.v5);
        j6.put("SHA1WITHRSAENCRYPTION", abcd.InterfacelN.Zo);
        j6.put("SHA1WITHRSA", abcd.InterfacelN.Zo);
        j6.put("SHA224WITHRSAENCRYPTION", abcd.InterfacelN.Ws);
        j6.put("SHA224WITHRSA", abcd.InterfacelN.Ws);
        j6.put("SHA256WITHRSAENCRYPTION", abcd.InterfacelN.we);
        j6.put("SHA256WITHRSA", abcd.InterfacelN.we);
        j6.put("SHA384WITHRSAENCRYPTION", abcd.InterfacelN.J0);
        j6.put("SHA384WITHRSA", abcd.InterfacelN.J0);
        j6.put("SHA512WITHRSAENCRYPTION", abcd.InterfacelN.J8);
        j6.put("SHA512WITHRSA", abcd.InterfacelN.J8);
        j6.put("SHA1WITHRSAANDMGF1", abcd.InterfacelN.EQ);
        j6.put("SHA224WITHRSAANDMGF1", abcd.InterfacelN.EQ);
        j6.put("SHA256WITHRSAANDMGF1", abcd.InterfacelN.EQ);
        j6.put("SHA384WITHRSAANDMGF1", abcd.InterfacelN.EQ);
        j6.put("SHA512WITHRSAANDMGF1", abcd.InterfacelN.EQ);
        j6.put("RIPEMD160WITHRSAENCRYPTION", abcd.InterfaceoN.Zo);
        j6.put("RIPEMD160WITHRSA", abcd.InterfaceoN.Zo);
        j6.put("RIPEMD128WITHRSAENCRYPTION", abcd.InterfaceoN.VH);
        j6.put("RIPEMD128WITHRSA", abcd.InterfaceoN.VH);
        j6.put("RIPEMD256WITHRSAENCRYPTION", abcd.InterfaceoN.gn);
        j6.put("RIPEMD256WITHRSA", abcd.InterfaceoN.gn);
        j6.put("SHA1WITHDSA", abcd.QN.x9);
        j6.put("DSAWITHSHA1", abcd.QN.x9);
        j6.put("SHA224WITHDSA", abcd.InterfacehN.vy);
        j6.put("SHA256WITHDSA", abcd.InterfacehN.P8);
        j6.put("SHA384WITHDSA", abcd.InterfacehN.ei);
        j6.put("SHA512WITHDSA", abcd.InterfacehN.nw);
        j6.put("SHA1WITHECDSA", abcd.QN.u7);
        j6.put("ECDSAWITHSHA1", abcd.QN.u7);
        j6.put("SHA224WITHECDSA", abcd.QN.J0);
        j6.put("SHA256WITHECDSA", abcd.QN.J8);
        j6.put("SHA384WITHECDSA", abcd.QN.Ws);
        j6.put("SHA512WITHECDSA", abcd.QN.QX);
        j6.put("GOST3411WITHGOST3410", abcd._M.v5);
        j6.put("GOST3411WITHGOST3410-94", abcd._M.v5);
        j6.put("GOST3411WITHECGOST3410", abcd._M.Zo);
        j6.put("GOST3411WITHECGOST3410-2001", abcd._M.Zo);
        j6.put("GOST3411WITHGOST3410-2001", abcd._M.Zo);
        FH.add(abcd.QN.u7);
        FH.add(abcd.QN.J0);
        FH.add(abcd.QN.J8);
        FH.add(abcd.QN.Ws);
        FH.add(abcd.QN.QX);
        FH.add(abcd.QN.x9);
        FH.add(abcd.InterfacehN.vy);
        FH.add(abcd.InterfacehN.P8);
        FH.add(abcd.InterfacehN.ei);
        FH.add(abcd.InterfacehN.nw);
        FH.add(abcd._M.v5);
        FH.add(abcd._M.Zo);
        abcd.wN r0 = new abcd.wN(abcd.InterfacejN.u7, new abcd.mM());
        DW.put("SHA1WITHRSAANDMGF1", j6(r0, 20));
        abcd.wN r1 = new abcd.wN(abcd.InterfacehN.v5, new abcd.mM());
        DW.put("SHA224WITHRSAANDMGF1", j6(r1, 28));
        abcd.wN r2 = new abcd.wN(abcd.InterfacehN.DW, new abcd.mM());
        DW.put("SHA256WITHRSAANDMGF1", j6(r2, 32));
        abcd.wN r3 = new abcd.wN(abcd.InterfacehN.FH, new abcd.mM());
        DW.put("SHA384WITHRSAANDMGF1", j6(r3, 48));
        abcd.wN r4 = new abcd.wN(abcd.InterfacehN.Hw, new abcd.mM());
        DW.put("SHA512WITHRSAANDMGF1", j6(r4, 64));
    }

    private static abcd.nN j6(abcd.wN r4, int r5) {
        return new abcd.nN(r4, new abcd.wN(abcd.InterfacelN.u7, r4), new abcd.wL(r5), new abcd.wL(1));
    }

    static abcd.oM j6(java.lang.String r1) {
        java.lang.String r2 = abcd.TP.FH(r1);
        if (j6.containsKey(r2) == false) goto L7;
        return (abcd.oM) j6.get(r2);
    L7:
        return new abcd.oM(r2);
    }

    static abcd.wN j6(abcd.oM r2, java.lang.String r3) {
        if (FH.contains(r2) == true) goto L5;
        java.lang.String r4 = abcd.TP.FH(r3);
        if (DW.containsKey(r4) == false) goto L11;
        return new abcd.wN(r2, (abcd.InterfaceqL) DW.get(r4));
    L11:
        return new abcd.wN(r2, new abcd.mM());
    L5:
        return new abcd.wN(r2);
    }

    static java.security.Signature j6(java.lang.String r0, java.lang.String r1) {
        if (r1 == null) goto L6;
        return java.security.Signature.getInstance(r0, r1);
    L6:
        return java.security.Signature.getInstance(r0);
    }

    static byte[] j6(abcd.oM r0, java.lang.String r1, java.lang.String r2, java.security.PrivateKey r3, java.security.SecureRandom r4, abcd.InterfaceqL r5) {
        if (r0 == null) goto L10;
        java.security.Signature r6 = j6(r1, r2);
        if (r4 == null) goto L6;
        r6.initSign(r3, r4);
    L7:
        r6.update(r5.DW().j6("DER"));
        return r6.sign();
    L6:
        r6.initSign(r3);
        goto L7
    L10:
        throw new java.lang.IllegalStateException("no signature algorithm specified");
    }
}
