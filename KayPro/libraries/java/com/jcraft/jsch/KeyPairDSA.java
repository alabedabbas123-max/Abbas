package com.jcraft.jsch;

public class KeyPairDSA extends com.jcraft.jsch.KeyPair {
    private static final byte[] XL = null;
    private static final byte[] aM = null;
    private static final byte[] j3 = null;
    private byte[] Mr;
    private byte[] U2;
    private byte[] a8;
    private int er;
    private byte[] lg;
    private byte[] rN;

    static {
        XL = com.jcraft.jsch.Util.FH("-----BEGIN DSA PRIVATE KEY-----");
        aM = com.jcraft.jsch.Util.FH("-----END DSA PRIVATE KEY-----");
        j3 = com.jcraft.jsch.Util.FH("ssh-dss");
    }

    public KeyPairDSA(com.jcraft.jsch.JSch r8) {
        this(r8, null, null, null, null, null);
    }

    public KeyPairDSA(com.jcraft.jsch.JSch r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5, byte[] r6) {
        super(r1);
        this.er = 1024;
        this.Mr = r2;
        this.U2 = r3;
        this.a8 = r4;
        this.lg = r5;
        this.rN = r6;
        if (r2 == null) goto L6;
        this.er = new java.math.BigInteger(r2).bitLength();
        return;
    }

    static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r8, com.jcraft.jsch.Buffer r9) {
        byte[][] r10 = r9.j6(7, "invalid key format");
        com.jcraft.jsch.KeyPairDSA r0 = new com.jcraft.jsch.KeyPairDSA(r8, r10[1], r10[2], r10[3], r10[4], r10[5]);
        r0.gn = new java.lang.String(r10[6]);
        r0.VH = 0;
        return r0;
    }

    @Override
    public byte[] DW() {
        if (v5() == true) goto L7;
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer();
        r0.Hw(j3);
        r0.Hw(this.Mr);
        r0.Hw(this.U2);
        r0.Hw(this.a8);
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
    public byte[] DW(byte[] r6) {
        com.jcraft.jsch.SignatureDSA r0 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("signature.dss")).newInstance();     // Catch: java.lang.Exception -> L4
        r0.DW();     // Catch: java.lang.Exception -> L4
        r0.j6(this.rN, this.Mr, this.U2, this.a8);     // Catch: java.lang.Exception -> L4
        r0.DW(r6);     // Catch: java.lang.Exception -> L4
        return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r0.j6()}).DW;
    L4:
        return null;
    }

    @Override
    boolean FH(byte[] r7) {
    L82:
        return false;
    L4:
        if (this.VH != 1) goto L13;
        if (r7[0] == 48) goto L11;
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer(r7);     // Catch: java.lang.Exception -> L82
        r1.FH();     // Catch: java.lang.Exception -> L82
        this.Mr = r1.VH();     // Catch: java.lang.Exception -> L82
        this.a8 = r1.VH();     // Catch: java.lang.Exception -> L82
        this.U2 = r1.VH();     // Catch: java.lang.Exception -> L82
        this.lg = r1.VH();     // Catch: java.lang.Exception -> L82
        this.rN = r1.VH();     // Catch: java.lang.Exception -> L82
        if (this.Mr == null) goto L10;
        this.er = new java.math.BigInteger(this.Mr).bitLength();     // Catch: java.lang.Exception -> L82
    L10:
        return true;
    L11:
        return false;
    L13:
        if (this.VH != 2) goto L19;
        com.jcraft.jsch.Buffer r2 = new com.jcraft.jsch.Buffer(r7);     // Catch: java.lang.Exception -> L82
        r2.v5(r7.length);     // Catch: java.lang.Exception -> L82
        this.rN = r2.j6(1, "")[0];     // Catch: com.jcraft.jsch.JSchException -> L17 java.lang.Exception -> L82
        return true;
    L17:
        return false;
    L19:
        if (r7[0] == 48) goto L21;
        return false;
    L21:
        int r3 = r7[1] & 255;     // Catch: java.lang.Exception -> L82
        if ((r3 & 128) == 0) goto L28;
        int r4 = r3 & 127;     // Catch: java.lang.Exception -> L82
        int r5 = 2;
    L24:
        int r6 = r4 - 1;     // Catch: java.lang.Exception -> L82
        if (r4 <= 0) goto L30;
        int r8 = r5 + 1;     // Catch: java.lang.Exception -> L82
        byte r9 = r7[r5];     // Catch: java.lang.Exception -> L82
        r5 = r8;
        r4 = r6;
    L30:
        if (r7[r5] == 2) goto L32;
        return false;
    L32:
        int r10 = r5 + 1;     // Catch: java.lang.Exception -> L82
        int r11 = r10 + 1;     // Catch: java.lang.Exception -> L82
        int r12 = r7[r10] & 255;     // Catch: java.lang.Exception -> L82
        if ((r12 & 128) == 0) goto L39;
        int r13 = r12 & 127;     // Catch: java.lang.Exception -> L82
        int r14 = r11;
        int r15 = 0;
    L35:
        int r16 = r13 - 1;     // Catch: java.lang.Exception -> L82
        if (r13 <= 0) goto L37;
        r15 = (r15 << 8) + (r7[r14] & 255);     // Catch: java.lang.Exception -> L82
        r14 = r14 + 1;     // Catch: java.lang.Exception -> L82
        r13 = r16;
        goto L35
    L37:
        r12 = r15;
        r11 = r14;
    L39:
        int r17 = (r11 + r12) + 1;     // Catch: java.lang.Exception -> L82
        int r18 = r17 + 1;     // Catch: java.lang.Exception -> L82
        int r19 = r7[r17] & 255;     // Catch: java.lang.Exception -> L82
        if ((r19 & 128) == 0) goto L46;
        int r20 = r19 & 127;     // Catch: java.lang.Exception -> L82
        int r21 = r18;
        int r22 = 0;
    L42:
        int r23 = r20 - 1;     // Catch: java.lang.Exception -> L82
        if (r20 <= 0) goto L44;
        int r24 = r22 << 8;     // Catch: java.lang.Exception -> L82
        int r25 = r24 + (r7[r21] & 255);     // Catch: java.lang.Exception -> L82
        r21 = r21 + 1;     // Catch: java.lang.Exception -> L82
        r22 = r25;
        r20 = r23;
        goto L42
    L44:
        r19 = r22;
        r18 = r21;
    L46:
        this.Mr = new byte[r19];     // Catch: java.lang.Exception -> L82
        java.lang.System.arraycopy(r7, r18, this.Mr, 0, r19);     // Catch: java.lang.Exception -> L82
        int r26 = (r18 + r19) + 1;     // Catch: java.lang.Exception -> L82
        int r27 = r26 + 1;     // Catch: java.lang.Exception -> L82
        int r28 = r7[r26] & 255;     // Catch: java.lang.Exception -> L82
        if ((r28 & 128) == 0) goto L53;
        int r29 = r28 & 127;     // Catch: java.lang.Exception -> L82
        int r30 = r27;
        int r31 = 0;
    L49:
        int r32 = r29 - 1;     // Catch: java.lang.Exception -> L82
        if (r29 <= 0) goto L54;
        r31 = (r31 << 8) + (r7[r30] & 255);     // Catch: java.lang.Exception -> L82
        r30 = r30 + 1;     // Catch: java.lang.Exception -> L82
        r29 = r32;
    L54:
        this.U2 = new byte[r31];     // Catch: java.lang.Exception -> L82
        java.lang.System.arraycopy(r7, r30, this.U2, 0, r31);     // Catch: java.lang.Exception -> L82
        int r33 = (r30 + r31) + 1;     // Catch: java.lang.Exception -> L82
        int r34 = r33 + 1;     // Catch: java.lang.Exception -> L82
        int r35 = r7[r33] & 255;     // Catch: java.lang.Exception -> L82
        if ((r35 & 128) == 0) goto L61;
        int r36 = r35 & 127;     // Catch: java.lang.Exception -> L82
        int r37 = r34;
        int r38 = 0;
    L57:
        int r39 = r36 - 1;     // Catch: java.lang.Exception -> L82
        if (r36 <= 0) goto L62;
        r38 = (r38 << 8) + (r7[r37] & 255);     // Catch: java.lang.Exception -> L82
        r37 = r37 + 1;     // Catch: java.lang.Exception -> L82
        r36 = r39;
    L62:
        this.a8 = new byte[r38];     // Catch: java.lang.Exception -> L82
        java.lang.System.arraycopy(r7, r37, this.a8, 0, r38);     // Catch: java.lang.Exception -> L82
        int r40 = (r37 + r38) + 1;     // Catch: java.lang.Exception -> L82
        int r41 = r40 + 1;     // Catch: java.lang.Exception -> L82
        int r42 = r7[r40] & 255;     // Catch: java.lang.Exception -> L82
        if ((r42 & 128) == 0) goto L69;
        int r43 = r42 & 127;     // Catch: java.lang.Exception -> L82
        int r44 = r41;
        int r45 = 0;
    L65:
        int r46 = r43 - 1;     // Catch: java.lang.Exception -> L82
        if (r43 <= 0) goto L70;
        r45 = (r45 << 8) + (r7[r44] & 255);     // Catch: java.lang.Exception -> L82
        r44 = r44 + 1;     // Catch: java.lang.Exception -> L82
        r43 = r46;
    L70:
        this.lg = new byte[r45];     // Catch: java.lang.Exception -> L82
        java.lang.System.arraycopy(r7, r44, this.lg, 0, r45);     // Catch: java.lang.Exception -> L82
        int r47 = (r44 + r45) + 1;     // Catch: java.lang.Exception -> L82
        int r48 = r47 + 1;     // Catch: java.lang.Exception -> L82
        int r49 = r7[r47] & 255;     // Catch: java.lang.Exception -> L82
        if ((r49 & 128) == 0) goto L77;
        int r50 = r49 & 127;     // Catch: java.lang.Exception -> L82
        int r51 = r48;
        int r52 = 0;
    L73:
        int r53 = r50 - 1;     // Catch: java.lang.Exception -> L82
        if (r50 <= 0) goto L78;
        r52 = (r52 << 8) + (r7[r51] & 255);     // Catch: java.lang.Exception -> L82
        r51 = r51 + 1;     // Catch: java.lang.Exception -> L82
        r50 = r53;
    L78:
        this.rN = new byte[r52];     // Catch: java.lang.Exception -> L82
        java.lang.System.arraycopy(r7, r51, this.rN, 0, r52);     // Catch: java.lang.Exception -> L82
        if (this.Mr == null) goto L81;
        this.er = new java.math.BigInteger(this.Mr).bitLength();     // Catch: java.lang.Exception -> L82
    L81:
        return true;
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
        r5 = 2;
        goto L30
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
        byte[] r1 = this.Mr;
        if (r1 != null) goto L10;
        return null;
    L10:
        return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r1, this.U2, this.a8, this.lg}).DW;
    }

    byte[] Zo() {
        int r1 = ((((((((((((((((j6(1) + 1) + 1) + 1) + j6(this.Mr.length)) + this.Mr.length) + 1) + j6(this.U2.length)) + this.U2.length) + 1) + j6(this.a8.length)) + this.a8.length) + 1) + j6(this.lg.length)) + this.lg.length) + 1) + j6(this.rN.length)) + this.rN.length;
        byte[] r2 = new byte[(j6(r1) + 1) + r1];
        j6(r2, j6(r2, j6(r2, j6(r2, j6(r2, j6(r2, DW(r2, 0, r1), new byte[1]), this.Mr), this.U2), this.a8), this.lg), this.rN);
        return r2;
    }

    @Override
    public void j6() {
        super.j6();
        com.jcraft.jsch.Util.DW(this.rN);
    }
}
