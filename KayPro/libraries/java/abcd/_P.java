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
        java.lang.String r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2 = abcd.TP.FH(r1);
                    if (j6.containsKey(r2) == false) { $pc0 = 7; continue $sw0; }
                    return (abcd.oM) j6.get(r2);
                }
                case 7: {
                    return new abcd.oM(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.wN j6(abcd.oM r2, java.lang.String r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (FH.contains(r2) == true) { $pc1 = 5; continue $sw1; }
                    r4 = abcd.TP.FH(r3);
                    if (DW.containsKey(r4) == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.wN(r2, (abcd.InterfaceqL) DW.get(r4));
                }
                case 11: {
                    return new abcd.wN(r2, new abcd.mM());
                }
                case 5: {
                    return new abcd.wN(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.security.Signature j6(java.lang.String r0, java.lang.String r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1 == null) { $pc2 = 6; continue $sw2; }
                    return java.security.Signature.getInstance(r0, r1);
                }
                case 6: {
                    return java.security.Signature.getInstance(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] j6(abcd.oM r0, java.lang.String r1, java.lang.String r2, java.security.PrivateKey r3, java.security.SecureRandom r4, abcd.InterfaceqL r5) {
        java.security.Signature r6 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r0 == null) { $pc3 = 10; continue $sw3; }
                    r6 = j6(r1, r2);
                    if (r4 == null) { $pc3 = 6; continue $sw3; }
                    r6.initSign(r3, r4);
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    r6.update(r5.DW().j6("DER"));
                    return r6.sign();
                }
                case 6: {
                    r6.initSign(r3);
                    { $pc3 = 7; continue $sw3; }
                }
                case 10: {
                    throw new java.lang.IllegalStateException("no signature algorithm specified");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
