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
        abcd.InterfaceqL r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.VH();
                    if (r0 == null) { $pc0 = 11; continue $sw0; }
                    if (abcd.mM.j6.equals(r0) == true) { $pc0 = 11; continue $sw0; }
                    if (r3.v5().equals(abcd.InterfacelN.EQ) == false) { $pc0 = 11; continue $sw0; }
                    return java.lang.String.valueOf(j6(abcd.nN.j6(r0).v5().v5())) + "WITHRSAANDMGF1";
                }
                case 11: {
                    if (j6.containsKey(r3.v5()) == false) { $pc0 = 15; continue $sw0; }
                    return (java.lang.String) j6.get(r3.v5());
                }
                case 15: {
                    return r3.v5().tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(abcd.zL r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (abcd.InterfacelN.SI.equals(r1) == false) { $pc1 = 7; continue $sw1; }
                    return "MD5";
                }
                case 7: {
                    if (abcd.InterfacejN.u7.equals(r1) == false) { $pc1 = 11; continue $sw1; }
                    return "SHA1";
                }
                case 11: {
                    if (abcd.InterfacehN.v5.equals(r1) == false) { $pc1 = 15; continue $sw1; }
                    return "SHA224";
                }
                case 15: {
                    if (abcd.InterfacehN.DW.equals(r1) == false) { $pc1 = 19; continue $sw1; }
                    return "SHA256";
                }
                case 19: {
                    if (abcd.InterfacehN.FH.equals(r1) == false) { $pc1 = 23; continue $sw1; }
                    return "SHA384";
                }
                case 23: {
                    if (abcd.InterfacehN.Hw.equals(r1) == false) { $pc1 = 27; continue $sw1; }
                    return "SHA512";
                }
                case 27: {
                    if (abcd.InterfaceoN.FH.equals(r1) == false) { $pc1 = 31; continue $sw1; }
                    return "RIPEMD128";
                }
                case 31: {
                    if (abcd.InterfaceoN.DW.equals(r1) == false) { $pc1 = 35; continue $sw1; }
                    return "RIPEMD160";
                }
                case 35: {
                    if (abcd.InterfaceoN.Hw.equals(r1) == false) { $pc1 = 39; continue $sw1; }
                    return "RIPEMD256";
                }
                case 39: {
                    if (abcd._M.j6.equals(r1) == false) { $pc1 = 43; continue $sw1; }
                    return "GOST3411";
                }
                case 43: {
                    return r1.tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.security.Signature DW(abcd.wN r4) {
        java.lang.String r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return this.v5.j6(FH(r4));
                }
                case 4: {
                    e = $ex2;
                    if (j6.get(r4.v5()) == null) { $pc2 = 9; continue $sw2; }
                    r5 = (java.lang.String) j6.get(r4.v5());
                    return this.v5.j6(r5);
                }
                case 9: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.security.MessageDigest j6(abcd.wN r4) {
        java.lang.String r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    return this.v5.DW(j6(r4.v5()));
                }
                case 4: {
                    e = $ex3;
                    if (j6.get(r4.v5()) == null) { $pc3 = 9; continue $sw3; }
                    r5 = (java.lang.String) j6.get(r4.v5());
                    return this.v5.DW(r5);
                }
                case 9: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
