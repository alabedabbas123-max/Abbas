package abcd;

class NP {
    private static final java.util.Map DW = null;
    private static final java.util.Map FH = null;
    private static final java.util.Map Hw = null;
    private static final java.util.Map j6 = null;
    private abcd.InterfaceaP v5;

    static {
        j6 = new java.util.HashMap();
        DW = new java.util.HashMap();
        FH = new java.util.HashMap();
        Hw = new java.util.HashMap();
        j6.put(new abcd.zL("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        j6.put(abcd.InterfacelN.Ws, "SHA224WITHRSA");
        j6.put(abcd.InterfacelN.we, "SHA256WITHRSA");
        j6.put(abcd.InterfacelN.J0, "SHA384WITHRSA");
        j6.put(abcd.InterfacelN.J8, "SHA512WITHRSA");
        j6.put(abcd._M.v5, "GOST3411WITHGOST3410");
        j6.put(abcd._M.Zo, "GOST3411WITHECGOST3410");
        j6.put(new abcd.zL("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        j6.put(new abcd.zL("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        j6.put(new abcd.zL("1.2.840.10040.4.3"), "SHA1WITHDSA");
        j6.put(abcd.QN.u7, "SHA1WITHECDSA");
        j6.put(abcd.QN.J0, "SHA224WITHECDSA");
        j6.put(abcd.QN.J8, "SHA256WITHECDSA");
        j6.put(abcd.QN.Ws, "SHA384WITHECDSA");
        j6.put(abcd.QN.QX, "SHA512WITHECDSA");
        j6.put(abcd.InterfacejN.EQ, "SHA1WITHRSA");
        j6.put(abcd.InterfacejN.tp, "SHA1WITHDSA");
        j6.put(abcd.InterfacehN.vy, "SHA224WITHDSA");
        j6.put(abcd.InterfacehN.P8, "SHA256WITHDSA");
        DW.put(abcd.InterfacelN.DW, "RSA/ECB/PKCS1Padding");
        FH.put(abcd.InterfacelN.Lz, "DESEDEWrap");
        FH.put(abcd.InterfacelN.sT, "RC2Wrap");
        FH.put(abcd.InterfacehN.EQ, "AESWrap");
        FH.put(abcd.InterfacehN.aM, "AESWrap");
        FH.put(abcd.InterfacehN.er, "AESWrap");
        FH.put(abcd.InterfaceiN.Hw, "CamelliaWrap");
        FH.put(abcd.InterfaceiN.v5, "CamelliaWrap");
        FH.put(abcd.InterfaceiN.Zo, "CamelliaWrap");
        FH.put(abcd.InterfacecN.DW, "SEEDWrap");
        FH.put(abcd.InterfacelN.BT, "DESede");
        Hw.put(abcd.InterfacehN.Zo, "AES");
        Hw.put(abcd.InterfacehN.gn, "AES");
        Hw.put(abcd.InterfacehN.Ws, "AES");
        Hw.put(abcd.InterfacehN.a8, "AES");
        Hw.put(abcd.InterfacelN.BT, "DESede");
        Hw.put(abcd.InterfacelN.vy, "RC2");
    }

    NP(abcd.InterfaceaP r1) {
        this.v5 = r1;
    }

    private static java.lang.String FH(abcd.wN r3) {
        abcd.InterfaceqL r0 = r3.VH();
        if (r0 == null) goto L11;
        if (abcd.mM.j6.equals(r0) == true) goto L11;
        if (r3.v5().equals(abcd.InterfacelN.EQ) == false) goto L11;
        return java.lang.String.valueOf(j6(abcd.nN.j6(r0).v5().v5())) + "WITHRSAANDMGF1";
    L11:
        if (j6.containsKey(r3.v5()) == false) goto L15;
        return (java.lang.String) j6.get(r3.v5());
    L15:
        return r3.v5().tp();
    }

    private static java.lang.String j6(abcd.zL r1) {
        if (abcd.InterfacelN.SI.equals(r1) == false) goto L7;
        return "MD5";
    L7:
        if (abcd.InterfacejN.u7.equals(r1) == false) goto L11;
        return "SHA1";
    L11:
        if (abcd.InterfacehN.v5.equals(r1) == false) goto L15;
        return "SHA224";
    L15:
        if (abcd.InterfacehN.DW.equals(r1) == false) goto L19;
        return "SHA256";
    L19:
        if (abcd.InterfacehN.FH.equals(r1) == false) goto L23;
        return "SHA384";
    L23:
        if (abcd.InterfacehN.Hw.equals(r1) == false) goto L27;
        return "SHA512";
    L27:
        if (abcd.InterfaceoN.FH.equals(r1) == false) goto L31;
        return "RIPEMD128";
    L31:
        if (abcd.InterfaceoN.DW.equals(r1) == false) goto L35;
        return "RIPEMD160";
    L35:
        if (abcd.InterfaceoN.Hw.equals(r1) == false) goto L39;
        return "RIPEMD256";
    L39:
        if (abcd._M.j6.equals(r1) == false) goto L43;
        return "GOST3411";
    L43:
        return r1.tp();
    }

    java.security.Signature DW(abcd.wN r4) {
        return this.v5.j6(FH(r4));
    L4:
        e = move-exception;
        if (j6.get(r4.v5()) == null) goto L9;
        java.lang.String r5 = (java.lang.String) j6.get(r4.v5());
        return this.v5.j6(r5);
    L9:
        throw e;
    }

    java.security.MessageDigest j6(abcd.wN r4) {
        return this.v5.DW(j6(r4.v5()));
    L4:
        e = move-exception;
        if (j6.get(r4.v5()) == null) goto L9;
        java.lang.String r5 = (java.lang.String) j6.get(r4.v5());
        return this.v5.DW(r5);
    L9:
        throw e;
    }
}
