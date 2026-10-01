package abcd;

class uP {
    private static final abcd.AbstractxL j6 = null;

    static {
        j6 = new abcd.mM();
    }

    private static java.lang.String j6(abcd.oM r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.InterfacelN.SI.equals(r1) == false) { $pc0 = 7; continue $sw0; }
                    return "MD5";
                }
                case 7: {
                    if (abcd.InterfacejN.u7.equals(r1) == false) { $pc0 = 11; continue $sw0; }
                    return "SHA1";
                }
                case 11: {
                    if (abcd.InterfacehN.v5.equals(r1) == false) { $pc0 = 15; continue $sw0; }
                    return "SHA224";
                }
                case 15: {
                    if (abcd.InterfacehN.DW.equals(r1) == false) { $pc0 = 19; continue $sw0; }
                    return "SHA256";
                }
                case 19: {
                    if (abcd.InterfacehN.FH.equals(r1) == false) { $pc0 = 23; continue $sw0; }
                    return "SHA384";
                }
                case 23: {
                    if (abcd.InterfacehN.Hw.equals(r1) == false) { $pc0 = 27; continue $sw0; }
                    return "SHA512";
                }
                case 27: {
                    if (abcd.InterfaceoN.FH.equals(r1) == false) { $pc0 = 31; continue $sw0; }
                    return "RIPEMD128";
                }
                case 31: {
                    if (abcd.InterfaceoN.DW.equals(r1) == false) { $pc0 = 35; continue $sw0; }
                    return "RIPEMD160";
                }
                case 35: {
                    if (abcd.InterfaceoN.Hw.equals(r1) == false) { $pc0 = 39; continue $sw0; }
                    return "RIPEMD256";
                }
                case 39: {
                    if (abcd._M.j6.equals(r1) == false) { $pc0 = 43; continue $sw0; }
                    return "GOST3411";
                }
                case 43: {
                    return r1.tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(abcd.wN r3) {
        abcd.InterfaceqL r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r3.VH();
                    if (r0 == null) { $pc1 = 15; continue $sw1; }
                    if (j6.equals(r0) == true) { $pc1 = 15; continue $sw1; }
                    if (r3.Zo().equals(abcd.InterfacelN.EQ) == false) { $pc1 = 11; continue $sw1; }
                    return java.lang.String.valueOf(j6(abcd.nN.j6(r0).v5().Zo())) + "withRSAandMGF1";
                }
                case 11: {
                    if (r3.Zo().equals(abcd.QN.we) == false) { $pc1 = 15; continue $sw1; }
                    return java.lang.String.valueOf(j6((abcd.oM) abcd.FL.j6(r0).j6(0))) + "withECDSA";
                }
                case 15: {
                    return r3.Zo().tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(java.security.Signature r2, abcd.InterfaceqL r3) {
        java.security.AlgorithmParameters r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 != null) { $pc2 = 4; continue $sw2; }
                    return;
                }
                case 4: {
                    if (j6.equals(r3) == true) { $pc2 = 22; continue $sw2; }
                    r0 = java.security.AlgorithmParameters.getInstance(r2.getAlgorithm(), r2.getProvider());
                    try {
                        r0.init(r3.DW().Hw());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 14; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2.getAlgorithm().endsWith("MGF1") == false) { $pc2 = 23; continue $sw2; }
                    try {
                        r2.setParameter(r0.getParameterSpec(java.security.spec.PSSParameterSpec.class));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc2 = 11; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    e = $ex2;
                    throw new java.security.SignatureException("Exception extracting parameters: " + e.getMessage());
                }
                case 23: {
                    return;
                }
                case 14: {
                    e = $ex2;
                    throw new java.security.SignatureException("IOException decoding parameters: " + e.getMessage());
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
