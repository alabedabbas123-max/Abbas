package abcd;

public class cO extends abcd.dO {
    private java.util.List ei;

    private class a {
        final java.lang.Object DW;
        final java.lang.String FH;
        final java.lang.String Hw;
        final abcd.WN Zo;
        final java.security.PrivateKey j6;
        final abcd.WN v5;

        abcd.kO j6(java.security.SecureRandom r4, java.security.Provider r5, boolean r6) {
            java.lang.String r0 = null;
            abcd.nO r1 = null;
            abcd.JP r7 = null;
            abcd.InterfacevP r8 = null;
            java.lang.Object r9 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = java.lang.String.valueOf(abcd.eO.j6.j6(this.FH)) + "with" + abcd.eO.j6.DW(this.Hw);
                        r1 = new abcd.nO(new abcd.GP());
                        if (r6 == false) { $pc0 = 5; continue $sw0; }
                        r1.j6(this.v5);
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        r1.j6(!r6);
                        r1.DW(this.Zo);
                        try {
                            r7 = new abcd.JP(r0);
                            r7.j6(r4);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 15; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (r5 == null) { $pc0 = 9; continue $sw0; }
                        r7.j6(r5);
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        r8 = r7.j6(this.j6);
                        r9 = this.DW;
                        if ((r9 instanceof java.security.cert.X509Certificate) == false) { $pc0 = 14; continue $sw0; }
                        return r1.j6(r8, (java.security.cert.X509Certificate) r9);
                    }
                    case 14: {
                        return r1.j6(r8, (byte[]) r9);
                    }
                    case 15: {
                        e = $ex0;
                        throw new java.security.NoSuchAlgorithmException(e.getMessage());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public cO() {
        this.ei = new java.util.ArrayList();
    }

    public abcd.aO j6(abcd.InterfacefO r13, boolean r14) {
        abcd.rL r0 = null;
        abcd.rL r1 = null;
        java.util.Iterator r2 = null;
        abcd.mO r3 = null;
        abcd.zL r4 = null;
        abcd.HL r5 = null;
        java.io.ByteArrayOutputStream r6 = null;
        java.io.OutputStream r7 = null;
        abcd.SL r8 = null;
        java.util.Iterator r9 = null;
        abcd.kO r15 = null;
        abcd.YM r10 = null;
        byte[] r16 = null;
        abcd.HL r11 = null;
        abcd.UM r12 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.ei.isEmpty() == false) { $pc1 = 37; continue $sw1; }
                    r0 = new abcd.rL();
                    r1 = new abcd.rL();
                    this.vy.clear();
                    r2 = this.gW.iterator();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r2.hasNext() == false) { $pc1 = 7; continue $sw1; }
                    r3 = (abcd.mO) r2.next();
                    r0.j6(abcd.eO.j6.j6(r3.j6()));
                    r1.j6(r3.DW());
                    { $pc1 = 6; continue $sw1; }
                }
                case 7: {
                    r4 = r13.getContentType();
                    r5 = null;
                    if (r13 == null) { $pc1 = 19; continue $sw1; }
                    if (r14 == false) { $pc1 = 11; continue $sw1; }
                    r6 = new java.io.ByteArrayOutputStream();
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r7 = abcd.gO.j6(abcd.gO.j6(this.BT, r6));
                    try {
                        r13.j6(r7);
                        r7.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 16; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r14 == false) { $pc1 = 19; continue $sw1; }
                    r8 = new abcd.SL(r6.toByteArray());
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r9 = this.BT.iterator();
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    if (r9.hasNext() == false) { $pc1 = 24; continue $sw1; }
                    r15 = (abcd.kO) r9.next();
                    r10 = r15.j6(r4);
                    r0.j6(r10.v5());
                    r1.j6(r10);
                    r16 = r15.j6();
                    if (r16 == null) { $pc1 = 22; continue $sw1; }
                    this.vy.put(r10.v5().v5().tp(), r16);
                    { $pc1 = 22; continue $sw1; }
                }
                case 24: {
                    if (this.er.size() == 0) { $pc1 = 26; continue $sw1; }
                    r11 = abcd.gO.j6(this.er);
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (this.yS.size() == 0) { $pc1 = 30; continue $sw1; }
                    r5 = abcd.gO.j6(this.yS);
                    $pc1 = 30; continue $sw1;
                }
                case 30: {
                    r12 = new abcd.UM(r4, r8);
                    return new abcd.aO(r13, new abcd.UM(abcd.TM.DW, new abcd.WM(new abcd.vM(r0), r12, r11, r5, new abcd.vM(r1))));
                }
                case 26: {
                    r11 = null;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    e = $ex1;
                    throw new abcd.XN("data processing exception: " + e.getMessage(), e);
                }
                case 11: {
                    r6 = null;
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    r8 = null;
                    { $pc1 = 20; continue $sw1; }
                }
                case 37: {
                    throw new java.lang.IllegalStateException("this method can only be used with SignerInfoGenerator");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.aO j6(java.lang.String r7, abcd.YN r8, boolean r9, java.lang.String r10, boolean r11) {
        return j6(r7, r8, r9, abcd.gO.j6(r10), r11);
    }

    public abcd.aO j6(java.lang.String r5, abcd.YN r6, boolean r7, java.security.Provider r8, boolean r9) {
        boolean r0 = false;
        abcd.zL r10 = null;
        java.util.Iterator r1 = null;
        abcd.cO.a r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 != null) { $pc2 = 4; continue $sw2; }
                    r0 = true;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r0 == false) { $pc2 = 7; continue $sw2; }
                    r10 = null;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r1 = this.ei.iterator();
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r1.hasNext() == false) { $pc2 = 11; continue $sw2; }
                    r2 = (abcd.cO.a) r1.next();
                    try {
                        this.BT.add(r2.j6(this.P8, r8, r9));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.security.cert.CertificateEncodingException) { $pc2 = 20; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 23; continue $sw2; }
                        if ($t instanceof abcd.BP) { $pc2 = 26; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    e = $ex2;
                    throw new abcd.XN("exception creating signerInf", e);
                }
                case 23: {
                    e = $ex2;
                    throw new abcd.XN("exception encoding attributes", e);
                }
                case 20: {
                    e = $ex2;
                    throw new abcd.XN("error creating sid.", e);
                }
                case 11: {
                    this.ei.clear();
                    if (r6 == null) { $pc2 = 16; continue $sw2; }
                    return j6(new abcd.bO(this, r10, r6), r7);
                }
                case 16: {
                    return j6(new abcd.VN(r10), r7);
                }
                case 7: {
                    r10 = new abcd.zL(r5);
                    { $pc2 = 8; continue $sw2; }
                }
                case 4: {
                    r0 = false;
                    { $pc2 = 5; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
