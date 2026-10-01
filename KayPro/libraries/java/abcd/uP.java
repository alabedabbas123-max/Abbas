package abcd;

class uP {
    private static final abcd.AbstractxL j6 = null;

    static {
        j6 = new abcd.mM();
    }

    private static java.lang.String j6(abcd.oM r1) {
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

    static java.lang.String j6(abcd.wN r3) {
        abcd.InterfaceqL r0 = r3.VH();
        if (r0 == null) goto L15;
        if (j6.equals(r0) == true) goto L15;
        if (r3.Zo().equals(abcd.InterfacelN.EQ) == false) goto L11;
        return java.lang.String.valueOf(j6(abcd.nN.j6(r0).v5().Zo())) + "withRSAandMGF1";
    L11:
        if (r3.Zo().equals(abcd.QN.we) == false) goto L15;
        return java.lang.String.valueOf(j6((abcd.oM) abcd.FL.j6(r0).j6(0))) + "withECDSA";
    L15:
        return r3.Zo().tp();
    }

    static void j6(java.security.Signature r2, abcd.InterfaceqL r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (j6.equals(r3) == true) goto L22;
        java.security.AlgorithmParameters r0 = java.security.AlgorithmParameters.getInstance(r2.getAlgorithm(), r2.getProvider());
        r0.init(r3.DW().Hw());     // Catch: java.io.IOException -> L14
        if (r2.getAlgorithm().endsWith("MGF1") == false) goto L23;
        r2.setParameter(r0.getParameterSpec(java.security.spec.PSSParameterSpec.class));     // Catch: java.security.GeneralSecurityException -> L11
        return;
    L11:
        e = move-exception;
        throw new java.security.SignatureException("Exception extracting parameters: " + e.getMessage());
    L23:
        return;
    L14:
        e = move-exception;
        throw new java.security.SignatureException("IOException decoding parameters: " + e.getMessage());
    }
}
