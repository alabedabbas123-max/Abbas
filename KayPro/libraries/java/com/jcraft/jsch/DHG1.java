package com.jcraft.jsch;

public class DHG1 extends com.jcraft.jsch.KeyExchange {
    static final byte[] VH = null;
    static final byte[] Zo = null;
    byte[] EQ;
    byte[] J0;
    byte[] J8;
    private com.jcraft.jsch.Buffer QX;
    byte[] Ws;
    private com.jcraft.jsch.Packet XL;
    private int gn;
    com.jcraft.jsch.DH tp;
    private int u7;
    byte[] we;

    static {
        Zo = new byte[]{2};
        VH = new byte[]{0, -1, -1, -1, -1, -1, -1, -1, -1, -55, 15, -38, -94, 33, 104, -62, 52, -60, -58, 98, -117, -128, -36, 28, -47, 41, 2, 78, 8, -118, 103, -52, 116, 2, 11, -66, -90, 59, 19, -101, 34, 81, 74, 8, 121, -114, 52, 4, -35, -17, -107, 25, -77, -51, 58, 67, 27, 48, 43, 10, 109, -14, 95, 20, 55, 79, -31, 53, 109, 109, 81, -62, 69, -28, -123, -75, 118, 98, 94, 126, -58, -12, 76, 66, -23, -90, 55, -19, 107, 11, -1, 92, -74, -12, 6, -73, -19, -18, 56, 107, -5, 90, -119, -97, -91, -82, -97, 36, 17, 124, 75, 31, -26, 73, 40, 102, 81, -20, -26, 83, -127, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    public DHG1() {
        this.gn = 0;
    }

    @Override
    public int VH() {
        return this.u7;
    }

    @Override
    public java.lang.String Zo() {
        if (this.gn != 1) goto L6;
        return "DSA";
    L6:
        return "RSA";
    }

    @Override
    public void j6(com.jcraft.jsch.Session r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5) {
        this.j6 = r1;
        this.EQ = r2;
        this.we = r3;
        this.J0 = r4;
        this.J8 = r5;
        this.DW = (com.jcraft.jsch.HASH) java.lang.Class.forName(r1.DW("sha-1")).newInstance();     // Catch: java.lang.Exception -> L5
        this.DW.DW();     // Catch: java.lang.Exception -> L5
    L7:
        this.QX = new com.jcraft.jsch.Buffer();
        this.XL = new com.jcraft.jsch.Packet(this.QX);
        this.tp = (com.jcraft.jsch.DH) java.lang.Class.forName(r1.DW("dh")).newInstance();     // Catch: java.lang.Exception -> L14
        this.tp.DW();     // Catch: java.lang.Exception -> L14
        this.tp.FH(VH);
        this.tp.j6(Zo);
        this.Ws = this.tp.j6();
        this.XL.DW();
        this.QX.j6((byte) 30);
        this.QX.FH(this.Ws);
        r1.DW(this.XL);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L12;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXDH_INIT sent");
        com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEXDH_REPLY");
    L12:
        this.u7 = 31;
        return;
    L14:
        e = move-exception;
        throw e;
    L5:
        e = move-exception;
        java.lang.System.err.println(e);
        goto L7
    }

    @Override
    public boolean j6(com.jcraft.jsch.Buffer r13) {
        if (this.u7 == 31) goto L5;
        return false;
    L5:
        r13.FH();
        r13.j6();
        int r0 = r13.j6();
        if (r0 == 31) goto L9;
        java.lang.System.err.println("type: must be 31 " + r0);
        return false;
    L9:
        this.v5 = r13.tp();
        byte[] r1 = r13.Zo();
        byte[] r14 = r13.tp();
        this.tp.DW(r1);
        this.FH = j6(this.tp.FH());
        this.QX.we();
        this.QX.Hw(this.we);
        this.QX.Hw(this.EQ);
        this.QX.Hw(this.J8);
        this.QX.Hw(this.J0);
        this.QX.Hw(this.v5);
        this.QX.FH(this.Ws);
        this.QX.FH(r1);
        this.QX.FH(this.FH);
        byte[] r2 = new byte[this.QX.Hw()];
        this.QX.j6(r2);
        this.DW.update(r2, 0, r2.length);
        this.Hw = this.DW.FH();
        byte[] r3 = this.v5;
        int r4 = ((((r3[0] << 24) & (-16777216)) | ((r3[1] << 16) & 16711680)) | ((r3[2] << 8) & 65280)) | (r3[3] & 255);
        java.lang.String r5 = com.jcraft.jsch.Util.j6(r3, 4, r4);
        int r6 = 4 + r4;
        if (r5.equals("ssh-rsa") == false) goto L24;
        this.gn = 0;
        byte[] r7 = this.v5;
        int r8 = r6 + 1;
        int r9 = r8 + 1;
        int r10 = ((r7[r8] << 16) & 16711680) | ((r7[r6] << 24) & (-16777216));
        int r11 = r9 + 1;
        int r12 = r10 | ((r7[r9] << 8) & 65280);
        int r15 = r11 + 1;
        int r16 = r12 | (r7[r11] & 255);
        byte[] r17 = new byte[r16];
        java.lang.System.arraycopy(r7, r15, r17, 0, r16);
        int r18 = r15 + r16;
        byte[] r19 = this.v5;
        int r20 = r18 + 1;
        int r21 = (-16777216) & (r19[r18] << 24);
        int r22 = r20 + 1;
        int r23 = ((r19[r20] << 16) & 16711680) | r21;
        int r24 = r22 + 1;
        int r25 = r24 + 1;
        int r26 = (r23 | ((r19[r22] << 8) & 65280)) | (r19[r24] & 255);
        byte[] r27 = new byte[r26];
        java.lang.System.arraycopy(r19, r25, r27, 0, r26);
        com.jcraft.jsch.SignatureRSA r28 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(this.j6.DW("signature.rsa")).newInstance();     // Catch: java.lang.Exception -> L17
        r28.DW();     // Catch: java.lang.Exception -> L15
    L20:
        r28.j6(r17, r27);
        r28.DW(this.Hw);
        boolean r110 = r28.j6(r14);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L38;
        com.jcraft.jsch.JSch.v5().j6(1, "ssh_rsa_verify: signature " + r110);
    L38:
        this.u7 = 0;
        return r110;
    L15:
        e = e;
    L19:
        java.lang.System.err.println(e);
    L17:
        e = e;
        r28 = null;
        goto L19
    L24:
        if (r5.equals("ssh-dss") == false) goto L37;
        this.gn = 1;
        byte[] r29 = this.v5;
        int r30 = r6 + 1;
        int r31 = r30 + 1;
        int r32 = ((r29[r30] << 16) & 16711680) | ((r29[r6] << 24) & (-16777216));
        int r33 = r31 + 1;
        int r34 = r32 | ((r29[r31] << 8) & 65280);
        int r35 = r33 + 1;
        int r36 = r34 | (r29[r33] & 255);
        byte[] r37 = new byte[r36];
        java.lang.System.arraycopy(r29, r35, r37, 0, r36);
        int r38 = r35 + r36;
        byte[] r39 = this.v5;
        int r40 = r38 + 1;
        int r111 = r40 + 1;
        int r41 = ((r39[r40] << 16) & 16711680) | ((r39[r38] << 24) & (-16777216));
        int r42 = r111 + 1;
        int r43 = r41 | ((r39[r111] << 8) & 65280);
        int r112 = r42 + 1;
        int r44 = r43 | (r39[r42] & 255);
        byte[] r45 = new byte[r44];
        java.lang.System.arraycopy(r39, r112, r45, 0, r44);
        int r113 = r112 + r44;
        byte[] r46 = this.v5;
        int r47 = r113 + 1;
        int r114 = r47 + 1;
        int r48 = ((r46[r47] << 16) & 16711680) | ((r46[r113] << 24) & (-16777216));
        int r115 = r114 + 1;
        int r49 = r48 | ((r46[r114] << 8) & 65280);
        int r116 = r115 + 1;
        int r50 = r49 | (r46[r115] & 255);
        byte[] r117 = new byte[r50];
        java.lang.System.arraycopy(r46, r116, r117, 0, r50);
        int r118 = r116 + r50;
        byte[] r51 = this.v5;
        int r52 = r118 + 1;
        int r53 = (-16777216) & (r51[r118] << 24);
        int r119 = r52 + 1;
        int r54 = ((r51[r52] << 16) & 16711680) | r53;
        int r55 = r119 + 1;
        int r56 = r55 + 1;
        int r57 = (r54 | ((r51[r119] << 8) & 65280)) | (r51[r55] & 255);
        byte[] r58 = new byte[r57];
        java.lang.System.arraycopy(r51, r56, r58, 0, r57);
        com.jcraft.jsch.SignatureDSA r59 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(this.j6.DW("signature.dss")).newInstance();     // Catch: java.lang.Exception -> L31
        r59.DW();     // Catch: java.lang.Exception -> L29
    L34:
        r59.DW(r58, r37, r45, r117);
        r59.DW(this.Hw);
        r110 = r59.j6(r14);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L38;
        com.jcraft.jsch.JSch.v5().j6(1, "ssh_dss_verify: signature " + r110);
    L29:
        e = e;
    L33:
        java.lang.System.err.println(e);
    L31:
        e = e;
        r59 = null;
        goto L33
    L37:
        java.lang.System.err.println("unknown alg");
        r110 = false;
        goto L38
    }
}
