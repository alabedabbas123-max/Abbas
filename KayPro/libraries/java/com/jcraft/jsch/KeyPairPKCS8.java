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
        java.util.Vector r1 = new java.util.Vector();     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1[] r14 = new com.jcraft.jsch.KeyPair.ASN1(this, r13).DW();     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1 r3 = r14[1];     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1 r15 = r14[2];     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1[] r4 = r3.DW();     // Catch: java.lang.Throwable -> L32
        byte[] r5 = r4[0].j6();     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1[] r6 = r4[1].DW();     // Catch: java.lang.Throwable -> L32
        if (r6.length <= 0) goto L10;
        int r7 = 0;
    L7:
        if (r7 >= r6.length) goto L10;
        r1.addElement(r6[r7].j6());     // Catch: java.lang.Throwable -> L32
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L32
    L10:
        byte[] r16 = r15.j6();     // Catch: java.lang.Throwable -> L32
        if (com.jcraft.jsch.Util.j6(r5, XL) == false) goto L16;
        com.jcraft.jsch.KeyPairRSA r2 = new com.jcraft.jsch.KeyPairRSA(this.u7);     // Catch: java.lang.Throwable -> L32
        r2.j6(this);     // Catch: java.lang.Throwable -> L32
        if (r2.FH(r16) == false) goto L29;
        this.gW = r2;     // Catch: java.lang.Throwable -> L32
    L29:
        if (this.gW == null) goto L31;
        return true;
    L16:
        if (com.jcraft.jsch.Util.j6(r5, aM) == false) goto L29;
        com.jcraft.jsch.KeyPair.ASN1 r8 = new com.jcraft.jsch.KeyPair.ASN1(this, r16);     // Catch: java.lang.Throwable -> L32
        if (r1.size() != 0) goto L24;
        com.jcraft.jsch.KeyPair.ASN1[] r17 = r8.DW();     // Catch: java.lang.Throwable -> L32
        byte[] r9 = r17[1].j6();     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPair.ASN1[] r18 = r17[0].DW();     // Catch: java.lang.Throwable -> L32
        int r10 = 0;
    L21:
        if (r10 >= r18.length) goto L22;
        r1.addElement(r18[r10].j6());     // Catch: java.lang.Throwable -> L32
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L32
        goto L21
    L22:
        r1.addElement(r9);     // Catch: java.lang.Throwable -> L32
    L25:
        byte[] r11 = (byte[]) r1.elementAt(0);     // Catch: java.lang.Throwable -> L32
        byte[] r12 = (byte[]) r1.elementAt(1);     // Catch: java.lang.Throwable -> L32
        byte[] r19 = (byte[]) r1.elementAt(2);     // Catch: java.lang.Throwable -> L32
        byte[] r110 = (byte[]) r1.elementAt(3);     // Catch: java.lang.Throwable -> L32
        byte[] r111 = new java.math.BigInteger(r19).modPow(new java.math.BigInteger(r110), new java.math.BigInteger(r11)).toByteArray();     // Catch: java.lang.Throwable -> L32
        byte[] r112 = new com.jcraft.jsch.KeyPairDSA(this.u7, r11, r12, r19, r111, r110).Zo();     // Catch: java.lang.Throwable -> L32
        com.jcraft.jsch.KeyPairDSA r20 = new com.jcraft.jsch.KeyPairDSA(this.u7);     // Catch: java.lang.Throwable -> L32
        r20.j6(this);     // Catch: java.lang.Throwable -> L32
        if (r20.FH(r112) == false) goto L29;
        this.gW = r20;     // Catch: java.lang.Throwable -> L32
        goto L29
    L24:
        r1.addElement(r8.j6());     // Catch: java.lang.Throwable -> L32
    L31:
        return false;
    }

    @Override
    byte[] FH() {
        return this.gW.FH();
    }

    com.jcraft.jsch.Cipher Hw(byte[] r6) {
    L17:
        java.lang.String r1 = null;
    L19:
        if (com.jcraft.jsch.JSch.v5().isEnabled(4) == false) goto L30;
        if (r1 != null) goto L22;
        java.lang.String r7 = "unknown oid: " + com.jcraft.jsch.Util.FH(r6);
    L23:
        com.jcraft.jsch.JSch.v5().j6(4, "PKCS8: " + r7);
        return null;
    L22:
        r7 = "function " + r1 + " is not supported";
        goto L23
    L30:
        return null;
    L4:
        if (com.jcraft.jsch.Util.j6(r6, U2) == false) goto L7;
        r1 = "aes128-cbc";
    L27:
        return (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW(r1)).newInstance();
    L7:
        if (com.jcraft.jsch.Util.j6(r6, a8) == false) goto L9;
        r1 = "aes192-cbc";
        goto L27
    L9:
        if (com.jcraft.jsch.Util.j6(r6, lg) == false) goto L13;
        r1 = "aes256-cbc";
        goto L27
    L13:
        r1 = null;
        goto L27
    }

    @Override
    public byte[] Hw() {
        return this.gW.Hw();
    }

    @Override
    public boolean j6(byte[] r11) {
        if (v5() == true) goto L6;
        return true;
    L6:
        if (r11 == null) goto L8;
        com.jcraft.jsch.KeyPair.ASN1[] r2 = new com.jcraft.jsch.KeyPair.ASN1(this, this.J8).DW();     // Catch: java.lang.Throwable -> L29
        byte[] r5 = r2[1].j6();     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1[] r3 = r2[0].DW();     // Catch: java.lang.Throwable -> L29
        byte[] r4 = r3[0].j6();     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1 r6 = r3[1];     // Catch: java.lang.Throwable -> L29
        if (com.jcraft.jsch.Util.j6(r4, j3) == false) goto L26;
        com.jcraft.jsch.KeyPair.ASN1[] r7 = r6.DW();     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1 r8 = r7[0];     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1 r9 = r7[1];     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1[] r10 = r8.DW();     // Catch: java.lang.Throwable -> L29
        r10[0].j6();     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1[] r12 = r10[1].DW();     // Catch: java.lang.Throwable -> L29
        byte[] r13 = r12[0].j6();     // Catch: java.lang.Throwable -> L29
        int r14 = java.lang.Integer.parseInt(new java.math.BigInteger(r12[1].j6()).toString());     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.KeyPair.ASN1[] r15 = r9.DW();     // Catch: java.lang.Throwable -> L29
        byte[] r16 = r15[0].j6();     // Catch: java.lang.Throwable -> L29
        byte[] r17 = r15[1].j6();     // Catch: java.lang.Throwable -> L29
        com.jcraft.jsch.Cipher r18 = Hw(r16);     // Catch: java.lang.Throwable -> L29
        if (r18 != null) goto L17;
        return false;
    L17:
        byte[] r19 = null;
        r19 = ((com.jcraft.jsch.PBKDF) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("pbkdf")).newInstance()).j6(r11, r13, r14, r18.j6());     // Catch: java.lang.Exception -> L28
    L19:
        if (r19 != null) goto L21;
        return false;
    L21:
        r18.j6(1, r19, r17);     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L29
        com.jcraft.jsch.Util.DW(r19);     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L29
        byte[] r110 = new byte[r5.length];     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L29
        r18.j6(r5, 0, r5.length, r110, 0);     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L29
        if (FH(r110) == false) goto L27;
        this.J0 = false;     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L29
        return true;
    L26:
        if (com.jcraft.jsch.Util.j6(r4, rN) == true) goto L27;
    L27:
        return false;
    L8:
        if (v5() == true) goto L33;
        return true;
    L33:
        return false;
    }
}
