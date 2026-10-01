package com.jcraft.jsch;

public abstract class KeyPair {
    static byte[][] DW;
    private static byte[] FH;
    private static final java.lang.String[] Hw = null;
    private static final java.lang.String[] Zo = null;
    private static final byte[] j6 = null;
    private static final java.lang.String[] v5 = null;
    private com.jcraft.jsch.HASH EQ;
    protected boolean J0;
    protected byte[] J8;
    private byte[] QX;
    int VH;
    private byte[] Ws;
    protected java.lang.String gn;
    private com.jcraft.jsch.Cipher tp;
    com.jcraft.jsch.JSch u7;
    private byte[] we;

    class ASN1 {
        int DW;
        int FH;
        final com.jcraft.jsch.KeyPair Hw;
        byte[] j6;

        ASN1(com.jcraft.jsch.KeyPair r3, byte[] r4) {
            this(r3, r4, 0, r4.length);
        }

        ASN1(com.jcraft.jsch.KeyPair r1, byte[] r2, int r3, int r4) {
            this.Hw = r1;
            this.j6 = r2;
            this.DW = r3;
            this.FH = r4;
            if ((r3 + r4) > r2.length) goto L6;
            return;
        L6:
            throw new com.jcraft.jsch.KeyPair.ASN1Exception(r1);
        }

        private int j6(int[] r7) {
            int r1 = r7[0];
            int r3 = r1 + 1;
            int r2 = this.j6[r1] & 255;
            if ((r2 & 128) == 0) goto L9;
            int r4 = r2 & 127;
            int r5 = 0;
        L5:
            int r6 = r4 - 1;
            if (r4 <= 0) goto L7;
            r5 = (this.j6[r3] & 255) + (r5 << 8);
            r4 = r6;
            r3 = r3 + 1;
            goto L5
        L7:
            r2 = r5;
        L9:
            r7[0] = r3;
            return r2;
        }

        com.jcraft.jsch.KeyPair.ASN1[] DW() {
            byte[] r0 = this.j6;
            int r1 = this.DW;
            byte r2 = r0[r1];
            int r4 = 0;
            int[] r3 = {r1 + 1};
            int r5 = j6(r3);
            if (r2 == 5) goto L5;
            int r6 = r3[0];
            java.util.Vector r7 = new java.util.Vector();
        L7:
            if (r5 <= 0) goto L8;
            int r8 = r6 + 1;
            r3[0] = r8;
            int r9 = j6(r3);
            int r10 = r3[0];
            int r11 = r10 - r8;
            r7.addElement(new com.jcraft.jsch.KeyPair.ASN1(this.Hw, this.j6, r8 - 1, (r11 + 1) + r9));
            r6 = r10 + r9;
            r5 = ((r5 - 1) - r11) - r9;
            goto L7
        L8:
            com.jcraft.jsch.KeyPair.ASN1[] r12 = new com.jcraft.jsch.KeyPair.ASN1[r7.size()];
        L10:
            if (r4 >= r7.size()) goto L11;
            r12[r4] = (com.jcraft.jsch.KeyPair.ASN1) r7.elementAt(r4);
            r4 = r4 + 1;
            goto L10
        L11:
            return r12;
        L5:
            return new com.jcraft.jsch.KeyPair.ASN1[0];
        }

        byte[] j6() {
            int[] r1 = {this.DW + 1};
            int r2 = j6(r1);
            byte[] r3 = new byte[r2];
            java.lang.System.arraycopy(this.j6, r1[0], r3, 0, r3.length);
            return r3;
        }
    }

    class ASN1Exception extends java.lang.Exception {
        final com.jcraft.jsch.KeyPair j6;

        ASN1Exception(com.jcraft.jsch.KeyPair r1) {
            this.j6 = r1;
        }
    }

    static {
        j6 = com.jcraft.jsch.Util.FH("\n");
        DW = new byte[][]{com.jcraft.jsch.Util.FH("Proc-Type: 4,ENCRYPTED"), com.jcraft.jsch.Util.FH("DEK-Info: DES-EDE3-CBC,")};
        FH = com.jcraft.jsch.Util.FH(" ");
        Hw = new java.lang.String[]{"PuTTY-User-Key-File-2: ", "Encryption: ", "Comment: ", "Public-Lines: "};
        v5 = new java.lang.String[]{"Private-Lines: "};
        Zo = new java.lang.String[]{"Private-MAC: "};
    }

    public KeyPair(com.jcraft.jsch.JSch r3) {
        this.VH = 0;
        this.gn = "no comment";
        this.u7 = null;
        this.J0 = false;
        this.J8 = null;
        this.Ws = null;
        this.QX = null;
        this.u7 = r3;
    }

    private com.jcraft.jsch.HASH VH() {
        this.EQ = (com.jcraft.jsch.HASH) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("md5")).newInstance();     // Catch: java.lang.Exception -> L5
        this.EQ.DW();     // Catch: java.lang.Exception -> L5
    L4:
        return this.EQ;
    }

    private com.jcraft.jsch.Cipher Zo() {
        this.tp = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("3des-cbc")).newInstance();     // Catch: java.lang.Exception -> L5
    L4:
        return this.tp;
    }

    private static byte j6(byte r2) {
        if (48 <= r2) goto L5;
    L9:
        int r3 = (r2 - 97) + 10;
    L8:
        return (byte) r3;
    L5:
        if (r2 > 57) goto L9;
        r3 = r2 - 48;
        goto L8
    }

    public static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r2, java.lang.String r3, java.lang.String r4) {
        byte[] r0 = com.jcraft.jsch.Util.DW(r3);     // Catch: java.io.IOException -> L19
        if (r4 != null) goto L5;
        java.lang.String r5 = java.lang.String.valueOf(r3) + ".pub";
    L24:
        byte[] r6 = com.jcraft.jsch.Util.DW(r5);     // Catch: java.io.IOException -> L8
    L26:
        com.jcraft.jsch.KeyPair r7 = j6(r2, r0, r6);     // Catch: java.lang.Throwable -> L14
        com.jcraft.jsch.Util.DW(r0);
        return r7;
    L14:
        th = move-exception;
        com.jcraft.jsch.Util.DW(r0);
        throw th;
    L8:
        e = move-exception;
        if (r4 != null) goto L18;
        r6 = null;
        goto L26
    L18:
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L5:
        r5 = r4;
    L19:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r10, byte[] r11) {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(r11);
        java.util.Hashtable r12 = new java.util.Hashtable();
    L4:
        if (j6(r0, r12) == true) goto L4;
        java.lang.String r1 = (java.lang.String) r12.get("PuTTY-User-Key-File-2");
        if (r1 != null) goto L8;
        return null;
    L8:
        byte[] r3 = j6(r0, java.lang.Integer.parseInt((java.lang.String) r12.get("Public-Lines")));
    L10:
        if (j6(r0, r12) == true) goto L10;
        byte[] r4 = j6(r0, java.lang.Integer.parseInt((java.lang.String) r12.get("Private-Lines")));
    L13:
        if (j6(r0, r12) == true) goto L13;
        byte[] r2 = com.jcraft.jsch.Util.DW(r4, 0, r4.length);
        byte[] r5 = com.jcraft.jsch.Util.DW(r3, 0, r3.length);
        if (r1.equals("ssh-rsa") == false) goto L18;
        com.jcraft.jsch.Buffer r6 = new com.jcraft.jsch.Buffer(r5);
        r6.v5(r5.length);
        r6.j6(new byte[r6.FH()]);
        byte[] r7 = new byte[r6.FH()];
        r6.j6(r7);
        byte[] r8 = new byte[r6.FH()];
        r6.j6(r8);
        com.jcraft.jsch.KeyPair r9 = new com.jcraft.jsch.KeyPairRSA(r10, r8, r7, null);
    L20:
        r9.J0 = !r12.get("Encryption").equals("none");
        r9.VH = 2;
        r9.gn = (java.lang.String) r12.get("Comment");
        if (r9.J0 == true) goto L23;
        r9.J8 = r2;
        r9.FH(r2);
    L31:
        return r9;
    L23:
        if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes256-cbc")) == false) goto L29;
        r9.tp = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes256-cbc")).newInstance();     // Catch: java.lang.Exception -> L26
        r9.Ws = new byte[r9.tp.FH()];     // Catch: java.lang.Exception -> L26
        r9.J8 = r2;
    L27:
        throw new com.jcraft.jsch.JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
    L29:
        throw new com.jcraft.jsch.JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
    L18:
        if (r1.equals("ssh-dss") == false) goto L32;
        com.jcraft.jsch.Buffer r13 = new com.jcraft.jsch.Buffer(r5);
        r13.v5(r5.length);
        r13.j6(new byte[r13.FH()]);
        byte[] r14 = new byte[r13.FH()];
        r13.j6(r14);
        byte[] r15 = new byte[r13.FH()];
        r13.j6(r15);
        byte[] r16 = new byte[r13.FH()];
        r13.j6(r16);
        byte[] r17 = new byte[r13.FH()];
        r13.j6(r17);
        r9 = new com.jcraft.jsch.KeyPairDSA(r10, r14, r15, r16, r17, null);
        goto L20
    L32:
        return null;
    }

    public static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r22, byte[] r23, byte[] r24) {
        byte[] r4 = new byte[8];
        int r8 = 3;
        if (r24 != null) goto L24;
        if (r23 == null) goto L24;
        if (r23.length <= 11) goto L24;
        if (r23[0] != 0) goto L24;
        if (r23[1] != 0) goto L24;
        if (r23[2] != 0) goto L24;
        if (r23[3] != 7) goto L24;
        com.jcraft.jsch.Buffer r2 = new com.jcraft.jsch.Buffer(r23);
        r2.v5(r23.length);
        java.lang.String r3 = new java.lang.String(r2.tp());
        r2.J0();
        if (r3.equals("ssh-rsa") == false) goto L19;
        return com.jcraft.jsch.KeyPairRSA.j6(r22, r2);
    L19:
        if (r3.equals("ssh-dss") == false) goto L23;
        return com.jcraft.jsch.KeyPairDSA.j6(r22, r2);
    L23:
        throw new com.jcraft.jsch.JSchException("privatekey: invalid key " + new java.lang.String(r23, 4, 7));
    L24:
        if (r23 != null) goto L469;
    L30:
        if (r23 == null) goto L32;
        int r11 = r23.length;     // Catch: java.lang.Exception -> L28
    L33:
        int r12 = 0;
    L35:
        if (r12 >= r11) goto L49;
        if (r23[r12] != 45) goto L457;
        int r14 = r12 + 4;     // Catch: java.lang.Exception -> L28
        if (r14 >= r11) goto L457;
        if (r23[r12 + 1] != 45) goto L457;
        if (r23[r12 + 2] != 45) goto L457;
        if (r23[r12 + 3] != 45) goto L457;
        if (r23[r14] == 45) goto L49;
    L457:
        r12 = r12 + 1;
        r8 = 3;
    L49:
        com.jcraft.jsch.Cipher r17 = null;
        int r15 = 0;
        boolean r16 = true;
        byte[] r18 = r4;
        char r5 = 0;
    L51:
        if (r12 >= r11) goto L52;
        if (r23[r12] != 66) goto L130;
        int r7 = r12 + 3;     // Catch: java.lang.Exception -> L28
        if (r7 >= r11) goto L130;
        if (r23[r12 + 1] != 69) goto L130;
        if (r23[r12 + 2] != 71) goto L130;
        if (r23[r7] != 73) goto L130;
        int r13 = r12 + 6;     // Catch: java.lang.Exception -> L28
        int r6 = r13 + 2;     // Catch: java.lang.Exception -> L28
        if (r6 >= r11) goto L128;
        if (r23[r13] != 68) goto L73;
        if (r23[r13 + 1] != 83) goto L73;
        if (r23[r6] != 65) goto L73;
        r5 = 1;
    L124:
        r12 = r13 + r8;     // Catch: java.lang.Exception -> L28
    L73:
        if (r23[r13] != 82) goto L80;
        if (r23[r13 + 1] != 83) goto L80;
        if (r23[r6] != 65) goto L80;
        r5 = 2;
    L80:
        if (r23[r13] == 83) goto L82;
    L86:
        int r9 = r13 + 6;     // Catch: java.lang.Exception -> L28
        if (r9 < r11) goto L89;
    L103:
        int r10 = r13 + 8;     // Catch: java.lang.Exception -> L28
        if (r10 >= r11) goto L126;
        if (r23[r13] != 69) goto L126;
        if (r23[r13 + 1] != 78) goto L126;
        if (r23[r6] != 67) goto L126;
        if (r23[r13 + 3] != 82) goto L126;
        if (r23[r13 + 4] != 89) goto L126;
        int r19 = r13 + 5;     // Catch: java.lang.Exception -> L28
        if (r23[r19] != 80) goto L126;
        if (r23[r9] != 84) goto L126;
        if (r23[r13 + 7] != 69) goto L126;
        if (r23[r10] != 68) goto L126;
        r13 = r19;
        r5 = 3;
        r15 = 3;
    L126:
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);     // Catch: java.lang.Exception -> L28
    L89:
        if (r23[r13] != 80) goto L103;
        if (r23[r13 + 1] != 82) goto L103;
        if (r23[r6] != 73) goto L103;
        int r20 = r13 + 3;     // Catch: java.lang.Exception -> L28
        if (r23[r20] != 86) goto L103;
        if (r23[r13 + 4] != 65) goto L103;
        if (r23[r13 + 5] != 84) goto L103;
        if (r23[r9] != 69) goto L103;
        r13 = r20;
        r5 = 3;
        r15 = 3;
        r16 = false;
        goto L124
    L82:
        if (r23[r13 + 1] != 83) goto L86;
        if (r23[r6] != 72) goto L86;
        r5 = 3;
        r15 = 1;
        goto L124
    L128:
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);     // Catch: java.lang.Exception -> L28
    L130:
        if (r23[r12] != 65) goto L153;
        int r21 = r12 + 7;     // Catch: java.lang.Exception -> L28
        if (r21 >= r11) goto L153;
        if (r23[r12 + 1] != 69) goto L153;
        if (r23[r12 + 2] != 83) goto L153;
        if (r23[r12 + 3] != 45) goto L153;
        if (r23[r12 + 4] != 50) goto L153;
        if (r23[r12 + 5] != 53) goto L153;
        if (r23[r12 + 6] != 54) goto L153;
        if (r23[r21] != 45) goto L153;
        r12 = r12 + 8;     // Catch: java.lang.Exception -> L28
        if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes256-cbc")) == false) goto L151;
        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes256-cbc")).newInstance();     // Catch: java.lang.Exception -> L28
        r18 = new byte[r17.FH()];     // Catch: java.lang.Exception -> L28
        goto L51
    L151:
        throw new com.jcraft.jsch.JSchException("privatekey: aes256-cbc is not available " + r23);     // Catch: java.lang.Exception -> L28
    L153:
        if (r23[r12] != 65) goto L176;
        int r25 = r12 + 7;     // Catch: java.lang.Exception -> L28
        if (r25 >= r11) goto L176;
        if (r23[r12 + 1] != 69) goto L176;
        if (r23[r12 + 2] != 83) goto L176;
        if (r23[r12 + 3] != 45) goto L176;
        if (r23[r12 + 4] != 49) goto L176;
        if (r23[r12 + 5] != 57) goto L176;
        if (r23[r12 + 6] != 50) goto L176;
        if (r23[r25] != 45) goto L176;
        r12 = r12 + 8;     // Catch: java.lang.Exception -> L28
        if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes192-cbc")) == false) goto L174;
        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes192-cbc")).newInstance();     // Catch: java.lang.Exception -> L28
        r18 = new byte[r17.FH()];     // Catch: java.lang.Exception -> L28
        goto L51
    L174:
        throw new com.jcraft.jsch.JSchException("privatekey: aes192-cbc is not available " + r23);     // Catch: java.lang.Exception -> L28
    L176:
        if (r23[r12] != 65) goto L199;
        int r26 = r12 + 7;     // Catch: java.lang.Exception -> L28
        if (r26 >= r11) goto L199;
        if (r23[r12 + 1] != 69) goto L199;
        if (r23[r12 + 2] != 83) goto L199;
        if (r23[r12 + 3] != 45) goto L199;
        if (r23[r12 + 4] != 49) goto L199;
        if (r23[r12 + 5] != 50) goto L199;
        if (r23[r12 + 6] != 56) goto L199;
        if (r23[r26] != 45) goto L199;
        r12 = r12 + 8;     // Catch: java.lang.Exception -> L28
        if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes128-cbc")) == false) goto L197;
        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes128-cbc")).newInstance();     // Catch: java.lang.Exception -> L28
        r18 = new byte[r17.FH()];     // Catch: java.lang.Exception -> L28
        goto L51
    L197:
        throw new com.jcraft.jsch.JSchException("privatekey: aes128-cbc is not available " + r23);     // Catch: java.lang.Exception -> L28
    L199:
        if (r23[r12] != 67) goto L214;
        int r27 = r12 + 3;     // Catch: java.lang.Exception -> L28
        if (r27 >= r11) goto L214;
        if (r23[r12 + 1] != 66) goto L214;
        if (r23[r12 + 2] != 67) goto L214;
        if (r23[r27] != 44) goto L214;
        r12 = r12 + 4;     // Catch: java.lang.Exception -> L28
        int r28 = 0;
    L210:
        if (r28 >= r18.length) goto L51;
        int r29 = r12 + 1;     // Catch: java.lang.Exception -> L28
        int r30 = (j6(r23[r12]) << 4) & 240;     // Catch: java.lang.Exception -> L28
        r12 = r29 + 1;     // Catch: java.lang.Exception -> L28
        r18[r28] = (byte) (r30 + (j6(r23[r29]) & 15));     // Catch: java.lang.Exception -> L28
        r28 = r28 + 1;     // Catch: java.lang.Exception -> L28
    L214:
        if (r23[r12] != 13) goto L221;
        int r31 = r12 + 1;     // Catch: java.lang.Exception -> L28
        if (r31 >= r23.length) goto L221;
        byte r32 = 10;
        if (r23[r31] != 10) goto L223;
        r12 = r31;
    L223:
        if (r23[r12] != r32) goto L455;
        int r33 = r12 + 1;     // Catch: java.lang.Exception -> L28
        if (r33 >= r23.length) goto L455;
        if (r23[r33] == r32) goto L228;
        if (r23[r33] != 13) goto L236;
        int r34 = r12 + 2;     // Catch: java.lang.Exception -> L28
        if (r34 >= r23.length) goto L236;
        if (r23[r34] != 10) goto L236;
        r12 = r12 + 3;     // Catch: java.lang.Exception -> L28
    L236:
        int r35 = r33;
    L238:
        if (r35 >= r23.length) goto L242;
        if (r23[r35] == 10) goto L242;
        if (r23[r35] == 58) goto L245;
        r35 = r35 + 1;
        r17 = r17;
        r8 = 3;
        goto L238
    L245:
        boolean r36 = true;
    L246:
        if (r36 == true) goto L455;
        if (r15 == r8) goto L249;
        r12 = r33;
        boolean r37 = false;
    L250:
        if (r23 == null) goto L292;
        if (r5 == 0) goto L291;
        int r38 = r12;
    L253:
        if (r38 >= r11) goto L258;
        if (r23[r38] == 45) goto L258;
        r38 = r38 + 1;     // Catch: java.lang.Exception -> L28
    L258:
        if ((r11 - r38) == 0) goto L288;
        int r39 = r38 - r12;     // Catch: java.lang.Exception -> L28
        if (r39 == 0) goto L288;
        byte[] r40 = new byte[r39];     // Catch: java.lang.Exception -> L28
        java.lang.System.arraycopy(r23, r12, r40, 0, r40.length);     // Catch: java.lang.Exception -> L28
        int r110 = r40.length;     // Catch: java.lang.Exception -> L28
        int r41 = 0;
    L262:
        if (r41 >= r110) goto L281;
        if (r40[r41] == 10) goto L267;
        if (r40[r41] == 45) goto L281;
        r41 = r41 + 1;     // Catch: java.lang.Exception -> L28
        goto L262
    L267:
        if (r40[r41 - 1] != 13) goto L269;
        boolean r111 = true;
    L270:
        int r112 = r41 + 1;     // Catch: java.lang.Exception -> L28
        if (r111 == false) goto L273;
        int r113 = 1;
    L274:
        java.lang.System.arraycopy(r40, r112, r40, r41 - r113, r110 - r112);     // Catch: java.lang.Exception -> L28
        if (r111 == false) goto L277;
        r110 = r110 - 1;     // Catch: java.lang.Exception -> L28
    L277:
        r110 = r110 - 1;     // Catch: java.lang.Exception -> L28
        goto L262
    L273:
        r113 = 0;
        goto L274
    L269:
        r111 = false;
    L281:
        int r42 = r41 - 0;     // Catch: java.lang.Exception -> L28
        if (r42 <= 0) goto L284;
        byte[] r43 = com.jcraft.jsch.Util.DW(r40, 0, r42);     // Catch: java.lang.Exception -> L28
    L285:
        com.jcraft.jsch.Util.DW(r40);     // Catch: java.lang.Exception -> L28
    L293:
        if (r43 != null) goto L295;
    L311:
        java.lang.String r44 = "";
        if (r24 != null) goto L472;
    L433:
        byte[] r45 = null;
    L434:
        com.jcraft.jsch.KeyPair r46 = null;
        if (r5 != 1) goto L438;
        r46 = new com.jcraft.jsch.KeyPairDSA(r22);
    L443:
        if (r46 == null) goto L453;
        r46.J0 = r37;
        r46.QX = r45;
        r46.VH = r15;
        r46.gn = r44;
        r46.tp = r17;
        if (r37 == false) goto L448;
        r46.J0 = true;
        r46.Ws = r18;
        r46.J8 = r43;
        goto L453
    L448:
        if (r46.FH(r43) == false) goto L452;
        r46.J0 = false;
        return r46;
    L452:
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
    L453:
        return r46;
    L438:
        if (r5 != 2) goto L441;
        r46 = new com.jcraft.jsch.KeyPairRSA(r22);
        goto L443
    L441:
        if (r15 != 3) goto L443;
        r46 = new com.jcraft.jsch.KeyPairPKCS8(r22);
        goto L443
    L472:
        int r114 = r24.length;     // Catch: java.lang.Exception -> L466
        if (r24.length <= 4) goto L383;
        if (r24[0] != 45) goto L383;
        int r115 = 1;
        if (r24[1] != 45) goto L383;
        if (r24[2] != 45) goto L383;
        if (r24[r8] != 45) goto L383;
        int r47 = 0;
    L324:
        r47 = r47 + r115;     // Catch: java.lang.Exception -> L466
        if (r24.length <= r47) goto L331;
        if (r24[r47] == 10) goto L331;
        r115 = 1;
    L331:
        if (r24.length > r47) goto L333;
        boolean r48 = false;
    L334:
        if (r48 == false) goto L335;
        if (r24[r47] != 10) goto L379;
        int r116 = r47 + 1;     // Catch: java.lang.Exception -> L466
        int r49 = r116;
    L340:
        if (r49 >= r24.length) goto L341;
        boolean r117 = r48;
        if (r24[r49] == 10) goto L344;
        if (r24[r49] == 58) goto L347;
        r49 = r49 + 1;
        r48 = r117;
        goto L340
    L347:
        boolean r50 = true;
    L348:
        if (r50 == true) goto L380;
        r47 = r116;
    L351:
        if (r24.length > r47) goto L353;
        r117 = false;
    L353:
        int r51 = r47;
    L354:
        if (r117 == false) goto L364;
        if (r51 >= r114) goto L364;
        if (r24[r51] == 10) goto L359;
        if (r24[r51] == 45) goto L364;
        r51 = r51 + 1;     // Catch: java.lang.Exception -> L466
        goto L354
    L359:
        java.lang.System.arraycopy(r24, r51 + 1, r24, r51, (r114 - r51) - 1);     // Catch: java.lang.Exception -> L466
        r114 = r114 - 1;     // Catch: java.lang.Exception -> L466
    L364:
        if (r117 == false) goto L433;
        r45 = com.jcraft.jsch.Util.DW(r24, r47, r51 - r47);     // Catch: java.lang.Exception -> L466
        if (r23 == null) goto L470;
        if (r5 != 3) goto L434;
    L470:
        if (r45[8] != 100) goto L373;
        r5 = 1;
        goto L434
    L373:
        if (r45[8] != 114) goto L434;
        r5 = 2;
    L380:
        r47 = r47 + 1;
        r48 = r117;
    L344:
        r50 = false;
        goto L348
    L341:
        r117 = r48;
        goto L344
    L379:
        r117 = r48;
        goto L380
    L335:
        r117 = r48;
        goto L351
    L333:
        r48 = true;
    L383:
        if (r24[0] != 115) goto L433;
        if (r24[1] != 115) goto L433;
        if (r24[2] != 104) goto L433;
        if (r24[3] != 45) goto L433;
        if (r23 == null) goto L392;
    L399:
        int r52 = 0;
    L400:
        if (r52 >= r114) goto L405;
        if (r24[r52] == 32) goto L405;
        r52 = r52 + 1;
    L405:
        int r53 = r52 + 1;     // Catch: java.lang.Exception -> L466
        if (r53 >= r114) goto L415;
        int r54 = r53;
    L408:
        if (r54 >= r114) goto L413;
        if (r24[r54] == 32) goto L413;
        r54 = r54 + 1;
    L413:
        byte[] r118 = com.jcraft.jsch.Util.DW(r24, r53, r54 - r53);     // Catch: java.lang.Exception -> L466
        r53 = r54;
    L416:
        int r55 = r53 + 1;
        if (r53 >= r114) goto L431;
        int r56 = r55;
    L419:
        if (r56 >= r114) goto L423;
        if (r24[r56] == 10) goto L423;
        r56 = r56 + 1;
    L423:
        if (r56 > 0) goto L425;
    L427:
        if (r55 >= r56) goto L431;
        r44 = new java.lang.String(r24, r55, r56 - r55);     // Catch: java.lang.Exception -> L465
        goto L431
    L425:
        if (r24[r56 - 1] != 13) goto L427;
        r56 = r56 - 1;     // Catch: java.lang.Exception -> L465
    L431:
        r45 = r118;
        goto L434
    L415:
        r118 = null;
        goto L416
    L392:
        if (r24.length <= 7) goto L399;
        if (r24[4] != 100) goto L397;
        r5 = 1;
        goto L399
    L397:
        if (r24[4] != 114) goto L399;
        r5 = 2;
        goto L399
    L295:
        if (r43.length <= 4) goto L311;
        if (r43[0] != 63) goto L311;
        if (r43[1] != 111) goto L311;
        if (r43[2] != (-7)) goto L311;
        if (r43[r8] != (-21)) goto L311;
        com.jcraft.jsch.Buffer r57 = new com.jcraft.jsch.Buffer(r43);     // Catch: java.lang.Exception -> L28
        r57.FH();     // Catch: java.lang.Exception -> L28
        r57.FH();     // Catch: java.lang.Exception -> L28
        r57.tp();     // Catch: java.lang.Exception -> L28
        java.lang.String r58 = com.jcraft.jsch.Util.j6(r57.tp());     // Catch: java.lang.Exception -> L28
        if (r58.equals("3des-cbc") == false) goto L307;
        r57.FH();     // Catch: java.lang.Exception -> L28
        r57.j6(new byte[r43.length - r57.gn()]);     // Catch: java.lang.Exception -> L28
        throw new com.jcraft.jsch.JSchException("unknown privatekey format: " + r23);     // Catch: java.lang.Exception -> L28
    L307:
        if (r58.equals("none") == false) goto L311;
        r57.FH();     // Catch: java.lang.Exception -> L28
        r57.FH();     // Catch: java.lang.Exception -> L28
        r43 = new byte[r43.length - r57.gn()];     // Catch: java.lang.Exception -> L28
        r57.j6(r43);     // Catch: java.lang.Exception -> L28
        r37 = false;
        goto L311
    L284:
        r43 = null;
    L288:
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);     // Catch: java.lang.Exception -> L28
    L291:
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);     // Catch: java.lang.Exception -> L28
    L292:
        r43 = null;
        goto L293
    L249:
        r12 = r33;
    L242:
        r36 = false;
        goto L246
    L228:
        r12 = r12 + 2;     // Catch: java.lang.Exception -> L28
    L455:
        r12 = r12 + 1;
        r17 = r17;
        r8 = 3;
    L221:
        r32 = 10;
    L52:
        r37 = r16;
        goto L250
    L32:
        r11 = 0;
        goto L33
    L469:
        com.jcraft.jsch.KeyPair r119 = j6(r22, r23);     // Catch: java.lang.Exception -> L28
        if (r119 == null) goto L30;
        return r119;
    L28:
        e = move-exception;
        if ((e instanceof com.jcraft.jsch.JSchException) == true) goto L463;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L463:
        throw ((com.jcraft.jsch.JSchException) e);
    }

    private static boolean j6(com.jcraft.jsch.Buffer r9, java.util.Hashtable r10) {
        byte[] r0 = r9.DW;
        int r1 = r9.FH;
        int r2 = r1;
    L3:
        java.lang.String r5 = null;
        if (r2 >= r0.length) goto L8;
        if (r0[r2] == 13) goto L8;
        if (r0[r2] == 58) goto L11;
        r2 = r2 + 1;
        goto L3
    L11:
        java.lang.String r3 = new java.lang.String(r0, r1, r2 - r1);
        int r4 = r2 + 1;
        if (r4 < r0.length) goto L14;
    L16:
        int r7 = r4;
    L18:
        if (r3 != null) goto L20;
        return false;
    L20:
        int r6 = r7;
    L22:
        if (r6 >= r0.length) goto L32;
        if (r0[r6] == 13) goto L26;
        r6 = r6 + 1;
        goto L22
    L26:
        r5 = new java.lang.String(r0, r7, r6 - r7);
        int r8 = r6 + 1;
        if (r8 < r0.length) goto L29;
    L31:
        r7 = r8;
        goto L32
    L29:
        if (r0[r8] != 10) goto L31;
        r8 = r8 + 1;
    L32:
        if (r5 == null) goto L34;
        r10.put(r3, r5);
        r9.FH = r7;
    L34:
        if (r3 == null) goto L37;
        if (r5 == null) goto L37;
        return true;
    L37:
        return false;
    L14:
        if (r0[r4] != 32) goto L16;
        r4 = r4 + 1;
    L8:
        r7 = r1;
        r3 = null;
        goto L18
    }

    private static byte[] j6(com.jcraft.jsch.Buffer r8, int r9) {
        byte[] r0 = r8.DW;
        int r1 = r8.FH;
        byte[] r2 = null;
    L3:
        int r3 = r9 - 1;
        if (r9 <= 0) goto L5;
        int r10 = r1;
    L10:
        if (r0.length <= r10) goto L11;
        int r4 = r10 + 1;
        if (r0[r10] == 13) goto L15;
        r10 = r4;
        goto L10
    L15:
        if (r2 != null) goto L18;
        int r5 = (r4 - r1) - 1;
        byte[] r6 = new byte[r5];
        java.lang.System.arraycopy(r0, r1, r6, 0, r5);
    L17:
        r2 = r6;
    L23:
        if (r0[r4] != 10) goto L25;
        r4 = r4 + 1;
    L25:
        r1 = r4;
        r9 = r3;
        goto L3
    L18:
        r6 = new byte[((r2.length + r4) - r1) - 1];
        java.lang.System.arraycopy(r2, 0, r6, 0, r2.length);
        java.lang.System.arraycopy(r0, r1, r6, r2.length, (r4 - r1) - 1);
        int r7 = 0;
    L20:
        if (r7 >= r2.length) goto L17;
        r2[r7] = 0;
        r7 = r7 + 1;
        goto L20
    L11:
        r4 = r10;
        goto L23
    L5:
        if (r2 == null) goto L7;
        r8.FH = r1;
    L7:
        return r2;
    }

    private byte[] j6(byte[] r7, byte[] r8, byte[] r9) {
        byte[] r10 = j6(r8, r9);     // Catch: java.lang.Exception -> L4
        this.tp.j6(1, r10, r9);     // Catch: java.lang.Exception -> L4
        com.jcraft.jsch.Util.DW(r10);     // Catch: java.lang.Exception -> L4
        byte[] r11 = new byte[r7.length];     // Catch: java.lang.Exception -> L4
        this.tp.j6(r7, 0, r7.length, r11, 0);     // Catch: java.lang.Exception -> L4
        return r11;
    L4:
        return null;
    }

    int DW(byte[] r3, int r4, int r5) {
        r3[r4] = 48;
        return j6(r3, r4 + 1, r5);
    }

    public abstract byte[] DW();

    public abstract byte[] DW(byte[] r1);

    abstract boolean FH(byte[] r1);

    abstract byte[] FH();

    public byte[] Hw() {
        return this.QX;
    }

    public void finalize() {
        j6();
    }

    int j6(int r3) {
        int r0 = 1;
        if (r3 > 127) goto L5;
        return 1;
    L5:
        if (r3 <= 0) goto L6;
        r3 = r3 >>> 8;
        r0 = r0 + 1;
        goto L5
    L6:
        return r0;
    }

    int j6(byte[] r5, int r6, int r7) {
        int r0 = j6(r7) - 1;
        if (r0 != 0) goto L6;
        int r1 = r6 + 1;
        r5[r6] = (byte) r7;
        return r1;
    L6:
        int r2 = r6 + 1;
        r5[r6] = (byte) (r0 | 128);
        int r8 = r2 + r0;
    L7:
        if (r0 <= 0) goto L8;
        r5[(r2 + r0) - 1] = (byte) (r7 & 255);
        r7 = r7 >>> 8;
        r0 = r0 - 1;
        goto L7
    L8:
        return r8;
    }

    int j6(byte[] r3, int r4, byte[] r5) {
        r3[r4] = 2;
        int r6 = j6(r3, r4 + 1, r5.length);
        java.lang.System.arraycopy(r5, 0, r3, r6, r5.length);
        return r6 + r5.length;
    }

    public void j6() {
        com.jcraft.jsch.Util.DW(this.we);
    }

    void j6(com.jcraft.jsch.KeyPair r2) {
        this.QX = r2.QX;
        this.VH = r2.VH;
        this.gn = r2.gn;
        this.tp = r2.tp;
    }

    public boolean j6(byte[] r5) {
        boolean r0 = this.J0;
        if (r0 == true) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        byte[] r1 = new byte[r5.length];
        java.lang.System.arraycopy(r5, 0, r1, 0, r1.length);
        byte[] r6 = j6(this.J8, r1, this.Ws);
        com.jcraft.jsch.Util.DW(r1);
        if (FH(r6) == false) goto L12;
        this.J0 = false;
    L12:
        return !this.J0;
    L7:
        return !r0;
    }

    synchronized byte[] j6(byte[] r9, byte[] r10) {
        monitor-enter(this);
    L48:
        th = move-exception;
        throw th;
    L4:
        if (this.tp != null) goto L7;
        this.tp = Zo();     // Catch: java.lang.Throwable -> L48
    L7:
        if (this.EQ != null) goto L9;
        this.EQ = VH();     // Catch: java.lang.Throwable -> L48
    L9:
        byte[] r0 = new byte[this.tp.j6()];     // Catch: java.lang.Throwable -> L48
        int r1 = this.EQ.j6();     // Catch: java.lang.Throwable -> L48
        int r2 = (r0.length / r1) * r1;     // Catch: java.lang.Throwable -> L48
        if ((r0.length % r1) != 0) goto L12;
        int r3 = 0;
    L13:
        byte[] r4 = new byte[r2 + r3];     // Catch: java.lang.Throwable -> L48
        byte[] r5 = null;
    L44:
        e = move-exception;
        java.lang.System.err.println(e);     // Catch: java.lang.Throwable -> L48
    L46:
        monitor-exit(this);
        return r0;
    L16:
        if (this.VH != 0) goto L29;
        byte[] r6 = null;
        int r7 = 0;
    L19:
        if ((r7 + r1) > r4.length) goto L20;
        if (r6 == null) goto L23;
        this.EQ.update(r6, 0, r6.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
    L23:
        this.EQ.update(r9, 0, r9.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        com.jcraft.jsch.HASH r8 = this.EQ;     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        int r11 = 8;
        if (r10.length > 8) goto L27;
        r11 = r10.length;     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
    L27:
        r8.update(r10, 0, r11);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r6 = this.EQ.FH();     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        java.lang.System.arraycopy(r6, 0, r4, r7, r6.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r7 = r7 + r6.length;     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        goto L19
    L20:
        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        goto L46
    L29:
        if (this.VH != 1) goto L38;
        int r12 = 0;
    L32:
        if ((r12 + r1) > r4.length) goto L33;
        if (r5 == null) goto L36;
        this.EQ.update(r5, 0, r5.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
    L36:
        this.EQ.update(r9, 0, r9.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r5 = this.EQ.FH();     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        java.lang.System.arraycopy(r5, 0, r4, r12, r5.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r12 = r12 + r5.length;     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        goto L32
    L33:
        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        goto L46
    L38:
        if (this.VH != 2) goto L46;
        com.jcraft.jsch.HASH r13 = (com.jcraft.jsch.HASH) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("sha-1")).newInstance();     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        byte[] r14 = new byte[4];     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r0 = new byte[40];     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        int r15 = 0;
    L40:
        if (r15 >= 2) goto L46;
        r13.DW();     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r14[3] = (byte) r15;     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r13.update(r14, 0, r14.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r13.update(r9, 0, r9.length);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        java.lang.System.arraycopy(r13.FH(), 0, r0, r15 * 20, 20);     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L48
        r15 = r15 + 1;
        goto L40
    L12:
        r3 = r1;
        goto L13
    }

    public boolean v5() {
        return this.J0;
    }
}
