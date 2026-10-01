package com.jcraft.jsch;

public class KeyPairPKCS8 extends com.jcraft.jsch.KeyPair {
    private static final byte[] Mr = null;
    private static final byte[] U2 = null;
    private static final byte[] XL = null;
    private static final byte[] a8 = null;
    private static final byte[] aM = null;
    private static final byte[] er = null;
    private static final byte[] j3 = null;
    private static final byte[] lg = null;
    private static final byte[] rN = null;
    private static final byte[] yS = null;
    private com.jcraft.jsch.KeyPair gW;

    static {
        XL = new byte[]{42, -122, 72, -122, -9, 13, 1, 1, 1};
        aM = new byte[]{42, -122, 72, -50, 56, 4, 1};
        j3 = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 13};
        Mr = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 12};
        U2 = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 2};
        a8 = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 22};
        lg = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 42};
        rN = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 3};
        er = com.jcraft.jsch.Util.FH("-----BEGIN DSA PRIVATE KEY-----");
        yS = com.jcraft.jsch.Util.FH("-----END DSA PRIVATE KEY-----");
    }

    public KeyPairPKCS8(com.jcraft.jsch.JSch r1) {
        super(r1);
        this.gW = null;
    }

    @Override
    public byte[] DW() {
        return this.gW.DW();
    }

    @Override
    public byte[] DW(byte[] r2) {
        return this.gW.DW(r2);
    }

    @Override
    boolean FH(byte[] r13) {
        java.util.Vector r1 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r14 = null;
        com.jcraft.jsch.KeyPair.ASN1 r3 = null;
        com.jcraft.jsch.KeyPair.ASN1 r15 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r4 = null;
        byte[] r5 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r6 = null;
        int r7 = 0;
        byte[] r16 = null;
        com.jcraft.jsch.KeyPairRSA r2 = null;
        com.jcraft.jsch.KeyPair.ASN1 r8 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r17 = null;
        byte[] r9 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r18 = null;
        int r10 = 0;
        byte[] r11 = null;
        byte[] r12 = null;
        byte[] r19 = null;
        byte[] r110 = null;
        byte[] r111 = null;
        byte[] r112 = null;
        com.jcraft.jsch.KeyPairDSA r20 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r1 = new java.util.Vector();
                        r14 = new com.jcraft.jsch.KeyPair.ASN1(this, r13).DW();
                        r3 = r14[1];
                        r15 = r14[2];
                        r4 = r3.DW();
                        r5 = r4[0].j6();
                        r6 = r4[1].DW();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r6.length <= 0) { $pc0 = 10; continue $sw0; }
                    r7 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r7 >= r6.length) { $pc0 = 10; continue $sw0; }
                    try {
                        r1.addElement(r6[r7].j6());
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        r16 = r15.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (com.jcraft.jsch.Util.j6(r5, XL) == false) { $pc0 = 16; continue $sw0; }
                    try {
                        r2 = new com.jcraft.jsch.KeyPairRSA(this.u7);
                        r2.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r2.FH(r16) == false) { $pc0 = 29; continue $sw0; }
                    try {
                        this.gW = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    if (this.gW == null) { $pc0 = 31; continue $sw0; }
                    return true;
                }
                case 16: {
                    if (com.jcraft.jsch.Util.j6(r5, aM) == false) { $pc0 = 29; continue $sw0; }
                    try {
                        r8 = new com.jcraft.jsch.KeyPair.ASN1(this, r16);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r1.size() != 0) { $pc0 = 24; continue $sw0; }
                    try {
                        r17 = r8.DW();
                        r9 = r17[1].j6();
                        r18 = r17[0].DW();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    r10 = 0;
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if (r10 >= r18.length) { $pc0 = 22; continue $sw0; }
                    try {
                        r1.addElement(r18[r10].j6());
                        r10 = r10 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    { $pc0 = 21; continue $sw0; }
                }
                case 22: {
                    try {
                        r1.addElement(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    try {
                        r11 = (byte[]) r1.elementAt(0);
                        r12 = (byte[]) r1.elementAt(1);
                        r19 = (byte[]) r1.elementAt(2);
                        r110 = (byte[]) r1.elementAt(3);
                        r111 = new java.math.BigInteger(r19).modPow(new java.math.BigInteger(r110), new java.math.BigInteger(r11)).toByteArray();
                        r112 = new com.jcraft.jsch.KeyPairDSA(this.u7, r11, r12, r19, r111, r110).Zo();
                        r20 = new com.jcraft.jsch.KeyPairDSA(this.u7);
                        r20.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r20.FH(r112) == false) { $pc0 = 29; continue $sw0; }
                    try {
                        this.gW = r20;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    { $pc0 = 29; continue $sw0; }
                }
                case 24: {
                    try {
                        r1.addElement(r8.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    return false;
                }
                case 32: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    byte[] FH() {
        return this.gW.FH();
    }

    com.jcraft.jsch.Cipher Hw(byte[] r6) {
        java.lang.String r1 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 17;
        $sw1: while (true) {
            switch ($pc1) {
                case 17: {
                    r1 = null;
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(4) == false) { $pc1 = 30; continue $sw1; }
                    if (r1 != null) { $pc1 = 22; continue $sw1; }
                    r7 = "unknown oid: " + com.jcraft.jsch.Util.FH(r6);
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    com.jcraft.jsch.JSch.v5().j6(4, "PKCS8: " + r7);
                    return null;
                }
                case 22: {
                    r7 = "function " + r1 + " is not supported";
                    { $pc1 = 23; continue $sw1; }
                }
                case 30: {
                    return null;
                }
                case 4: {
                    if (com.jcraft.jsch.Util.j6(r6, U2) == false) { $pc1 = 7; continue $sw1; }
                    r1 = "aes128-cbc";
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    return (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW(r1)).newInstance();
                }
                case 7: {
                    if (com.jcraft.jsch.Util.j6(r6, a8) == false) { $pc1 = 9; continue $sw1; }
                    r1 = "aes192-cbc";
                    { $pc1 = 27; continue $sw1; }
                }
                case 9: {
                    if (com.jcraft.jsch.Util.j6(r6, lg) == false) { $pc1 = 13; continue $sw1; }
                    r1 = "aes256-cbc";
                    { $pc1 = 27; continue $sw1; }
                }
                case 13: {
                    r1 = null;
                    { $pc1 = 27; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] Hw() {
        return this.gW.Hw();
    }

    @Override
    public boolean j6(byte[] r11) {
        com.jcraft.jsch.KeyPair.ASN1[] r2 = null;
        byte[] r5 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r3 = null;
        byte[] r4 = null;
        com.jcraft.jsch.KeyPair.ASN1 r6 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r7 = null;
        com.jcraft.jsch.KeyPair.ASN1 r8 = null;
        com.jcraft.jsch.KeyPair.ASN1 r9 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r10 = null;
        com.jcraft.jsch.KeyPair.ASN1[] r12 = null;
        byte[] r13 = null;
        int r14 = 0;
        com.jcraft.jsch.KeyPair.ASN1[] r15 = null;
        byte[] r16 = null;
        byte[] r17 = null;
        com.jcraft.jsch.Cipher r18 = null;
        byte[] r19 = null;
        byte[] r110 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (v5() == true) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (r11 == null) { $pc2 = 8; continue $sw2; }
                    try {
                        r2 = new com.jcraft.jsch.KeyPair.ASN1(this, this.J8).DW();
                        r5 = r2[1].j6();
                        r3 = r2[0].DW();
                        r4 = r3[0].j6();
                        r6 = r3[1];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    if (com.jcraft.jsch.Util.j6(r4, j3) == false) { $pc2 = 26; continue $sw2; }
                    try {
                        r7 = r6.DW();
                        r8 = r7[0];
                        r9 = r7[1];
                        r10 = r8.DW();
                        r10[0].j6();
                        r12 = r10[1].DW();
                        r13 = r12[0].j6();
                        r14 = java.lang.Integer.parseInt(new java.math.BigInteger(r12[1].j6()).toString());
                        r15 = r9.DW();
                        r16 = r15[0].j6();
                        r17 = r15[1].j6();
                        r18 = Hw(r16);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    if (r18 != null) { $pc2 = 17; continue $sw2; }
                    return false;
                }
                case 17: {
                    r19 = null;
                    try {
                        r19 = ((com.jcraft.jsch.PBKDF) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("pbkdf")).newInstance()).j6(r11, r13, r14, r18.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 28; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    if (r19 != null) { $pc2 = 21; continue $sw2; }
                    return false;
                }
                case 21: {
                    try {
                        r18.j6(1, r19, r17);
                        com.jcraft.jsch.Util.DW(r19);
                        r110 = new byte[r5.length];
                        r18.j6(r5, 0, r5.length, r110, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    if (FH(r110) == false) { $pc2 = 27; continue $sw2; }
                    try {
                        this.J0 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    return true;
                }
                case 26: {
                    if (com.jcraft.jsch.Util.j6(r4, rN) == true) { $pc2 = 27; continue $sw2; }
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    return false;
                }
                case 8: {
                    if (v5() == true) { $pc2 = 33; continue $sw2; }
                    return true;
                }
                case 33: {
                    return false;
                }
                case 28: {
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
