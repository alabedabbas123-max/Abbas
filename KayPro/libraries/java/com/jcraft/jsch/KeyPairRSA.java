package com.jcraft.jsch;

public class KeyPairRSA extends com.jcraft.jsch.KeyPair {
    private static final byte[] XL = null;
    private static final byte[] aM = null;
    private static final byte[] j3 = null;
    private int BT;
    private byte[] Mr;
    private byte[] U2;
    private byte[] a8;
    private byte[] er;
    private byte[] gW;
    private byte[] lg;
    private byte[] rN;
    private byte[] yS;

    static {
        XL = com.jcraft.jsch.Util.FH("-----BEGIN RSA PRIVATE KEY-----");
        aM = com.jcraft.jsch.Util.FH("-----END RSA PRIVATE KEY-----");
        j3 = com.jcraft.jsch.Util.FH("ssh-rsa");
    }

    public KeyPairRSA(com.jcraft.jsch.JSch r2) {
        this(r2, null, null, null);
    }

    public KeyPairRSA(com.jcraft.jsch.JSch r1, byte[] r2, byte[] r3, byte[] r4) {
        super(r1);
        this.BT = 1024;
        this.Mr = r2;
        this.U2 = r3;
        this.a8 = r4;
        if (r2 == null) goto L6;
        this.BT = new java.math.BigInteger(r2).bitLength();
        return;
    }

    private byte[] VH() {
        if (this.er != null) goto L6;
        this.er = new java.math.BigInteger(this.a8).mod(new java.math.BigInteger(this.lg).subtract(java.math.BigInteger.ONE)).toByteArray();
    L6:
        return this.er;
    }

    private byte[] Zo() {
        if (this.gW != null) goto L6;
        this.gW = new java.math.BigInteger(this.rN).modInverse(new java.math.BigInteger(this.lg)).toByteArray();
    L6:
        return this.gW;
    }

    private byte[] gn() {
        if (this.yS != null) goto L6;
        this.yS = new java.math.BigInteger(this.a8).mod(new java.math.BigInteger(this.rN).subtract(java.math.BigInteger.ONE)).toByteArray();
    L6:
        return this.yS;
    }

    static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r4, com.jcraft.jsch.Buffer r5) {
        byte[][] r6 = r5.j6(8, "invalid key format");
        com.jcraft.jsch.KeyPairRSA r3 = new com.jcraft.jsch.KeyPairRSA(r4, r6[1], r6[2], r6[3]);
        r3.gW = r6[4];
        r3.lg = r6[5];
        r3.rN = r6[6];
        r3.gn = new java.lang.String(r6[7]);
        r3.VH = 0;
        return r3;
    }

    @Override
    public byte[] DW() {
        if (v5() == true) goto L7;
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer();
        r0.Hw(j3);
        r0.Hw(this.Mr);
        r0.Hw(this.U2);
        r0.Hw(this.a8);
        r0.Hw(Zo());
        r0.Hw(this.lg);
        r0.Hw(this.rN);
        r0.Hw(com.jcraft.jsch.Util.FH(this.gn));
        byte[] r1 = new byte[r0.Hw()];
        r0.j6(r1, 0, r1.length);
        return r1;
    L7:
        throw new com.jcraft.jsch.JSchException("key is encrypted.");
    }

    @Override
    public byte[] DW(byte[] r4) {
        com.jcraft.jsch.SignatureRSA r0 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("signature.rsa")).newInstance();     // Catch: java.lang.Exception -> L4
        r0.DW();     // Catch: java.lang.Exception -> L4
        r0.DW(this.a8, this.Mr);     // Catch: java.lang.Exception -> L4
        r0.DW(r4);     // Catch: java.lang.Exception -> L4
        return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r0.j6()}).DW;
    L4:
        return null;
    }

    @Override
    boolean FH(byte[] r7) {
    L106:
        return false;
    L4:
        if (this.VH != 2) goto L12;
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer(r7);     // Catch: java.lang.Exception -> L106
        r1.v5(r7.length);     // Catch: java.lang.Exception -> L106
        byte[][] r8 = r1.j6(4, "");     // Catch: com.jcraft.jsch.JSchException -> L10 java.lang.Exception -> L106
        this.a8 = r8[0];     // Catch: com.jcraft.jsch.JSchException -> L10 java.lang.Exception -> L106
        this.lg = r8[1];     // Catch: com.jcraft.jsch.JSchException -> L10 java.lang.Exception -> L106
        this.rN = r8[2];     // Catch: com.jcraft.jsch.JSchException -> L10 java.lang.Exception -> L106
        this.gW = r8[3];     // Catch: com.jcraft.jsch.JSchException -> L10 java.lang.Exception -> L106
        VH();     // Catch: java.lang.Exception -> L106
        gn();     // Catch: java.lang.Exception -> L106
        return true;
    L10:
        return false;
    L12:
        if (this.VH == 1) goto L14;
        int r2 = r7[1] & 255;     // Catch: java.lang.Exception -> L106
        if ((r2 & 128) == 0) goto L28;
        int r3 = r2 & 127;     // Catch: java.lang.Exception -> L106
        int r4 = 2;
    L24:
        int r5 = r3 - 1;     // Catch: java.lang.Exception -> L106
        if (r3 <= 0) goto L30;
        int r6 = r4 + 1;     // Catch: java.lang.Exception -> L106
        byte r9 = r7[r4];     // Catch: java.lang.Exception -> L106
        r4 = r6;
        r3 = r5;
    L30:
        if (r7[r4] == 2) goto L32;
        return false;
    L32:
        int r10 = r4 + 1;     // Catch: java.lang.Exception -> L106
        int r11 = r10 + 1;     // Catch: java.lang.Exception -> L106
        int r12 = r7[r10] & 255;     // Catch: java.lang.Exception -> L106
        if ((r12 & 128) == 0) goto L39;
        int r13 = r12 & 127;     // Catch: java.lang.Exception -> L106
        int r14 = r11;
        int r15 = 0;
    L35:
        int r16 = r13 - 1;     // Catch: java.lang.Exception -> L106
        if (r13 <= 0) goto L37;
        r15 = (r15 << 8) + (r7[r14] & 255);     // Catch: java.lang.Exception -> L106
        r14 = r14 + 1;     // Catch: java.lang.Exception -> L106
        r13 = r16;
        goto L35
    L37:
        r12 = r15;
        r11 = r14;
    L39:
        int r17 = (r11 + r12) + 1;     // Catch: java.lang.Exception -> L106
        int r18 = r17 + 1;     // Catch: java.lang.Exception -> L106
        int r19 = r7[r17] & 255;     // Catch: java.lang.Exception -> L106
        if ((r19 & 128) == 0) goto L46;
        int r20 = r19 & 127;     // Catch: java.lang.Exception -> L106
        int r21 = r18;
        int r22 = 0;
    L42:
        int r23 = r20 - 1;     // Catch: java.lang.Exception -> L106
        if (r20 <= 0) goto L44;
        int r24 = r22 << 8;     // Catch: java.lang.Exception -> L106
        int r25 = r24 + (r7[r21] & 255);     // Catch: java.lang.Exception -> L106
        r21 = r21 + 1;     // Catch: java.lang.Exception -> L106
        r22 = r25;
        r20 = r23;
        goto L42
    L44:
        r19 = r22;
        r18 = r21;
    L46:
        this.Mr = new byte[r19];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r18, this.Mr, 0, r19);     // Catch: java.lang.Exception -> L106
        int r26 = (r18 + r19) + 1;     // Catch: java.lang.Exception -> L106
        int r27 = r26 + 1;     // Catch: java.lang.Exception -> L106
        int r28 = r7[r26] & 255;     // Catch: java.lang.Exception -> L106
        if ((r28 & 128) == 0) goto L53;
        int r29 = r28 & 127;     // Catch: java.lang.Exception -> L106
        int r30 = r27;
        int r31 = 0;
    L49:
        int r32 = r29 - 1;     // Catch: java.lang.Exception -> L106
        if (r29 <= 0) goto L54;
        r31 = (r31 << 8) + (r7[r30] & 255);     // Catch: java.lang.Exception -> L106
        r30 = r30 + 1;     // Catch: java.lang.Exception -> L106
        r29 = r32;
    L54:
        this.U2 = new byte[r31];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r30, this.U2, 0, r31);     // Catch: java.lang.Exception -> L106
        int r33 = (r30 + r31) + 1;     // Catch: java.lang.Exception -> L106
        int r34 = r33 + 1;     // Catch: java.lang.Exception -> L106
        int r35 = r7[r33] & 255;     // Catch: java.lang.Exception -> L106
        if ((r35 & 128) == 0) goto L61;
        int r36 = r35 & 127;     // Catch: java.lang.Exception -> L106
        int r37 = r34;
        int r38 = 0;
    L57:
        int r39 = r36 - 1;     // Catch: java.lang.Exception -> L106
        if (r36 <= 0) goto L62;
        r38 = (r38 << 8) + (r7[r37] & 255);     // Catch: java.lang.Exception -> L106
        r37 = r37 + 1;     // Catch: java.lang.Exception -> L106
        r36 = r39;
    L62:
        this.a8 = new byte[r38];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r37, this.a8, 0, r38);     // Catch: java.lang.Exception -> L106
        int r40 = (r37 + r38) + 1;     // Catch: java.lang.Exception -> L106
        int r41 = r40 + 1;     // Catch: java.lang.Exception -> L106
        int r42 = r7[r40] & 255;     // Catch: java.lang.Exception -> L106
        if ((r42 & 128) == 0) goto L69;
        int r43 = r42 & 127;     // Catch: java.lang.Exception -> L106
        int r44 = r41;
        int r45 = 0;
    L65:
        int r46 = r43 - 1;     // Catch: java.lang.Exception -> L106
        if (r43 <= 0) goto L70;
        r45 = (r45 << 8) + (r7[r44] & 255);     // Catch: java.lang.Exception -> L106
        r44 = r44 + 1;     // Catch: java.lang.Exception -> L106
        r43 = r46;
    L70:
        this.lg = new byte[r45];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r44, this.lg, 0, r45);     // Catch: java.lang.Exception -> L106
        int r47 = (r44 + r45) + 1;     // Catch: java.lang.Exception -> L106
        int r48 = r47 + 1;     // Catch: java.lang.Exception -> L106
        int r49 = r7[r47] & 255;     // Catch: java.lang.Exception -> L106
        if ((r49 & 128) == 0) goto L77;
        int r50 = r49 & 127;     // Catch: java.lang.Exception -> L106
        int r51 = r48;
        int r52 = 0;
    L73:
        int r53 = r50 - 1;     // Catch: java.lang.Exception -> L106
        if (r50 <= 0) goto L78;
        r52 = (r52 << 8) + (r7[r51] & 255);     // Catch: java.lang.Exception -> L106
        r51 = r51 + 1;     // Catch: java.lang.Exception -> L106
        r50 = r53;
    L78:
        this.rN = new byte[r52];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r51, this.rN, 0, r52);     // Catch: java.lang.Exception -> L106
        int r54 = (r51 + r52) + 1;     // Catch: java.lang.Exception -> L106
        int r55 = r54 + 1;     // Catch: java.lang.Exception -> L106
        int r56 = r7[r54] & 255;     // Catch: java.lang.Exception -> L106
        if ((r56 & 128) == 0) goto L85;
        int r57 = r56 & 127;     // Catch: java.lang.Exception -> L106
        int r58 = r55;
        int r59 = 0;
    L81:
        int r60 = r57 - 1;     // Catch: java.lang.Exception -> L106
        if (r57 <= 0) goto L86;
        r59 = (r59 << 8) + (r7[r58] & 255);     // Catch: java.lang.Exception -> L106
        r58 = r58 + 1;     // Catch: java.lang.Exception -> L106
        r57 = r60;
    L86:
        this.er = new byte[r59];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r58, this.er, 0, r59);     // Catch: java.lang.Exception -> L106
        int r61 = (r58 + r59) + 1;     // Catch: java.lang.Exception -> L106
        int r62 = r61 + 1;     // Catch: java.lang.Exception -> L106
        int r63 = r7[r61] & 255;     // Catch: java.lang.Exception -> L106
        if ((r63 & 128) == 0) goto L93;
        int r64 = r63 & 127;     // Catch: java.lang.Exception -> L106
        int r65 = r62;
        int r66 = 0;
    L89:
        int r67 = r64 - 1;     // Catch: java.lang.Exception -> L106
        if (r64 <= 0) goto L94;
        r66 = (r66 << 8) + (r7[r65] & 255);     // Catch: java.lang.Exception -> L106
        r65 = r65 + 1;     // Catch: java.lang.Exception -> L106
        r64 = r67;
    L94:
        this.yS = new byte[r66];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r65, this.yS, 0, r66);     // Catch: java.lang.Exception -> L106
        int r68 = (r65 + r66) + 1;     // Catch: java.lang.Exception -> L106
        int r69 = r68 + 1;     // Catch: java.lang.Exception -> L106
        int r70 = r7[r68] & 255;     // Catch: java.lang.Exception -> L106
        if ((r70 & 128) == 0) goto L101;
        int r71 = r70 & 127;     // Catch: java.lang.Exception -> L106
        int r72 = r69;
        int r73 = 0;
    L97:
        int r74 = r71 - 1;     // Catch: java.lang.Exception -> L106
        if (r71 <= 0) goto L102;
        r73 = (r73 << 8) + (r7[r72] & 255);     // Catch: java.lang.Exception -> L106
        r72 = r72 + 1;     // Catch: java.lang.Exception -> L106
        r71 = r74;
    L102:
        this.gW = new byte[r73];     // Catch: java.lang.Exception -> L106
        java.lang.System.arraycopy(r7, r72, this.gW, 0, r73);     // Catch: java.lang.Exception -> L106
        if (this.Mr == null) goto L105;
        this.BT = new java.math.BigInteger(this.Mr).bitLength();     // Catch: java.lang.Exception -> L106
    L105:
        return true;
    L101:
        r72 = r69;
        r73 = r70;
        goto L102
    L93:
        r65 = r62;
        r66 = r63;
        goto L94
    L85:
        r58 = r55;
        r59 = r56;
        goto L86
    L77:
        r51 = r48;
        r52 = r49;
        goto L78
    L69:
        r44 = r41;
        r45 = r42;
        goto L70
    L61:
        r37 = r34;
        r38 = r35;
        goto L62
    L53:
        r30 = r27;
        r31 = r28;
        goto L54
    L28:
        r4 = 2;
        goto L30
    L14:
        if (r7[0] == 48) goto L20;
        com.jcraft.jsch.Buffer r75 = new com.jcraft.jsch.Buffer(r7);     // Catch: java.lang.Exception -> L106
        this.U2 = r75.VH();     // Catch: java.lang.Exception -> L106
        this.a8 = r75.VH();     // Catch: java.lang.Exception -> L106
        this.Mr = r75.VH();     // Catch: java.lang.Exception -> L106
        r75.VH();     // Catch: java.lang.Exception -> L106
        this.lg = r75.VH();     // Catch: java.lang.Exception -> L106
        this.rN = r75.VH();     // Catch: java.lang.Exception -> L106
        if (this.Mr == null) goto L18;
        this.BT = new java.math.BigInteger(this.Mr).bitLength();     // Catch: java.lang.Exception -> L106
    L18:
        VH();     // Catch: java.lang.Exception -> L106
        gn();     // Catch: java.lang.Exception -> L106
        Zo();     // Catch: java.lang.Exception -> L106
        return true;
    L20:
        return false;
    }

    @Override
    byte[] FH() {
        return j3;
    }

    @Override
    public byte[] Hw() {
        byte[] r0 = super.Hw();
        if (r0 == null) goto L5;
        return r0;
    L5:
        byte[] r1 = this.U2;
        if (r1 != null) goto L10;
        return null;
    L10:
        return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r1, this.Mr}).DW;
    }

    @Override
    public void j6() {
        super.j6();
        com.jcraft.jsch.Util.DW(this.a8);
    }
}
