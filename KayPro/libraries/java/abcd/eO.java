package abcd;

class eO {
    private static final java.util.Map DW = null;
    private static final java.util.Map FH = null;
    private static final java.util.Map Hw = null;
    static final abcd.eO j6 = null;

    static {
        j6 = new abcd.eO();
        DW = new java.util.HashMap();
        FH = new java.util.HashMap();
        Hw = new java.util.HashMap();
        j6(abcd.InterfacehN.vy, "SHA224", "DSA");
        j6(abcd.InterfacehN.P8, "SHA256", "DSA");
        j6(abcd.InterfacehN.ei, "SHA384", "DSA");
        j6(abcd.InterfacehN.nw, "SHA512", "DSA");
        j6(abcd.InterfacejN.tp, "SHA1", "DSA");
        j6(abcd.InterfacejN.j6, "MD4", "RSA");
        j6(abcd.InterfacejN.FH, "MD4", "RSA");
        j6(abcd.InterfacejN.DW, "MD5", "RSA");
        j6(abcd.InterfacejN.EQ, "SHA1", "RSA");
        j6(abcd.InterfacelN.FH, "MD2", "RSA");
        j6(abcd.InterfacelN.Hw, "MD4", "RSA");
        j6(abcd.InterfacelN.v5, "MD5", "RSA");
        j6(abcd.InterfacelN.Zo, "SHA1", "RSA");
        j6(abcd.InterfacelN.Ws, "SHA224", "RSA");
        j6(abcd.InterfacelN.we, "SHA256", "RSA");
        j6(abcd.InterfacelN.J0, "SHA384", "RSA");
        j6(abcd.InterfacelN.J8, "SHA512", "RSA");
        j6(abcd.QN.u7, "SHA1", "ECDSA");
        j6(abcd.QN.J0, "SHA224", "ECDSA");
        j6(abcd.QN.J8, "SHA256", "ECDSA");
        j6(abcd.QN.Ws, "SHA384", "ECDSA");
        j6(abcd.QN.QX, "SHA512", "ECDSA");
        j6(abcd.QN.x9, "SHA1", "DSA");
        j6(abcd.InterfaceaN.j3, "SHA1", "ECDSA");
        j6(abcd.InterfaceaN.Mr, "SHA224", "ECDSA");
        j6(abcd.InterfaceaN.U2, "SHA256", "ECDSA");
        j6(abcd.InterfaceaN.a8, "SHA384", "ECDSA");
        j6(abcd.InterfaceaN.lg, "SHA512", "ECDSA");
        j6(abcd.InterfaceaN.we, "SHA1", "RSA");
        j6(abcd.InterfaceaN.J0, "SHA256", "RSA");
        j6(abcd.InterfaceaN.J8, "SHA1", "RSAandMGF1");
        j6(abcd.InterfaceaN.Ws, "SHA256", "RSAandMGF1");
        DW.put(abcd.QN.ca.tp(), "DSA");
        DW.put(abcd.InterfacelN.DW.tp(), "RSA");
        DW.put(abcd.InterfaceoN.v5, "RSA");
        DW.put(abcd.NN.we.tp(), "RSA");
        DW.put(abcd.dO.Ws, "RSAandMGF1");
        DW.put(abcd._M.FH.tp(), "GOST3410");
        DW.put(abcd._M.Hw.tp(), "ECGOST3410");
        DW.put("1.3.6.1.4.1.5849.1.6.2", "ECGOST3410");
        DW.put("1.3.6.1.4.1.5849.1.1.5", "GOST3410");
        DW.put(abcd._M.Zo.tp(), "ECGOST3410");
        DW.put(abcd._M.v5.tp(), "GOST3410");
        FH.put(abcd.InterfacelN.ei.tp(), "MD2");
        FH.put(abcd.InterfacelN.nw.tp(), "MD4");
        FH.put(abcd.InterfacelN.SI.tp(), "MD5");
        FH.put(abcd.InterfacejN.u7.tp(), "SHA1");
        FH.put(abcd.InterfacehN.v5.tp(), "SHA224");
        FH.put(abcd.InterfacehN.DW.tp(), "SHA256");
        FH.put(abcd.InterfacehN.FH.tp(), "SHA384");
        FH.put(abcd.InterfacehN.Hw.tp(), "SHA512");
        FH.put(abcd.InterfaceoN.FH.tp(), "RIPEMD128");
        FH.put(abcd.InterfaceoN.DW.tp(), "RIPEMD160");
        FH.put(abcd.InterfaceoN.Hw.tp(), "RIPEMD256");
        FH.put(abcd._M.j6.tp(), "GOST3411");
        FH.put("1.3.6.1.4.1.5849.1.2.1", "GOST3411");
        Hw.put("SHA1", new java.lang.String[]{"SHA-1"});
        Hw.put("SHA224", new java.lang.String[]{"SHA-224"});
        Hw.put("SHA256", new java.lang.String[]{"SHA-256"});
        Hw.put("SHA384", new java.lang.String[]{"SHA-384"});
        Hw.put("SHA512", new java.lang.String[]{"SHA-512"});
    }

    eO() {
    }

    private static void j6(abcd.oM r2, java.lang.String r3, java.lang.String r4) {
        FH.put(r2.tp(), r3);
        DW.put(r2.tp(), r4);
    }

    java.lang.String DW(java.lang.String r2) {
        java.lang.String r0 = (java.lang.String) DW.get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return r2;
    }

    abcd.wN j6(abcd.wN r3) {
        if (r3.VH() == null) goto L5;
        return r3;
    L5:
        return new abcd.wN(r3.Zo(), abcd.mM.j6);
    }

    java.lang.String j6(java.lang.String r2) {
        java.lang.String r0 = (java.lang.String) FH.get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return r2;
    }
}
