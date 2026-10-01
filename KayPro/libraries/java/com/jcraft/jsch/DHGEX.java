package com.jcraft.jsch;

public class DHGEX extends com.jcraft.jsch.KeyExchange {
    static int VH = 1024;
    static int Zo = 1024;
    static int gn = 1024;
    com.jcraft.jsch.DH EQ;
    byte[] J0;
    byte[] J8;
    private byte[] Mr;
    private com.jcraft.jsch.Buffer QX;
    byte[] Ws;
    private com.jcraft.jsch.Packet XL;
    private byte[] aM;
    private byte[] j3;
    private int tp;
    private int u7;
    byte[] we;

    public DHGEX() {
        this.u7 = 0;
    }

    @Override
    public int VH() {
        return this.tp;
    }

    @Override
    public java.lang.String Zo() {
        if (this.u7 != 1) goto L6;
        return "DSA";
    L6:
        return "RSA";
    }

    @Override
    public void j6(com.jcraft.jsch.Session r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5) {
        this.j6 = r1;
        this.we = r2;
        this.J0 = r3;
        this.J8 = r4;
        this.Ws = r5;
        this.DW = (com.jcraft.jsch.HASH) java.lang.Class.forName(r1.DW("sha-1")).newInstance();     // Catch: java.lang.Exception -> L5
        this.DW.DW();     // Catch: java.lang.Exception -> L5
    L7:
        this.QX = new com.jcraft.jsch.Buffer();
        this.XL = new com.jcraft.jsch.Packet(this.QX);
        this.EQ = (com.jcraft.jsch.DH) java.lang.Class.forName(r1.DW("dh")).newInstance();     // Catch: java.lang.Exception -> L14
        this.EQ.DW();     // Catch: java.lang.Exception -> L14
        this.XL.DW();
        this.QX.j6((byte) 34);
        this.QX.FH(Zo);
        this.QX.FH(VH);
        this.QX.FH(gn);
        r1.DW(this.XL);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L12;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEX_DH_GEX_REQUEST(" + Zo + "<" + VH + "<" + gn + ") sent");
        com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
    L12:
        this.tp = 31;
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
    public boolean j6(com.jcraft.jsch.Buffer r12) {
        int r0 = this.tp;
        if (r0 == 31) goto L41;
        if (r0 == 33) goto L6;
        return false;
    L6:
        r12.FH();
        r12.j6();
        int r1 = r12.j6();
        if (r1 == 33) goto L10;
        java.lang.System.err.println("type: must be SSH_MSG_KEX_DH_GEX_REPLY " + r1);
        return false;
    L10:
        this.v5 = r12.tp();
        byte[] r2 = r12.Zo();
        byte[] r13 = r12.tp();
        this.EQ.DW(r2);
        this.FH = j6(this.EQ.FH());
        this.QX.we();
        this.QX.Hw(this.J0);
        this.QX.Hw(this.we);
        this.QX.Hw(this.Ws);
        this.QX.Hw(this.J8);
        this.QX.Hw(this.v5);
        this.QX.FH(Zo);
        this.QX.FH(VH);
        this.QX.FH(gn);
        this.QX.FH(this.aM);
        this.QX.FH(this.j3);
        this.QX.FH(this.Mr);
        this.QX.FH(r2);
        this.QX.FH(this.FH);
        byte[] r3 = new byte[this.QX.Hw()];
        this.QX.j6(r3);
        this.DW.update(r3, 0, r3.length);
        this.Hw = this.DW.FH();
        byte[] r4 = this.v5;
        int r5 = ((((r4[0] << 24) & (-16777216)) | ((r4[1] << 16) & 16711680)) | ((r4[2] << 8) & 65280)) | (r4[3] & 255);
        java.lang.String r6 = com.jcraft.jsch.Util.j6(r4, 4, r5);
        int r7 = 4 + r5;
        if (r6.equals("ssh-rsa") == false) goto L25;
        this.u7 = 0;
        byte[] r8 = this.v5;
        int r9 = r7 + 1;
        int r10 = r9 + 1;
        int r11 = ((r8[r9] << 16) & 16711680) | ((r8[r7] << 24) & (-16777216));
        int r14 = r10 + 1;
        int r15 = r11 | ((r8[r10] << 8) & 65280);
        int r16 = r14 + 1;
        int r17 = r15 | (r8[r14] & 255);
        byte[] r18 = new byte[r17];
        java.lang.System.arraycopy(r8, r16, r18, 0, r17);
        int r19 = r16 + r17;
        byte[] r20 = this.v5;
        int r21 = r19 + 1;
        int r22 = (-16777216) & (r20[r19] << 24);
        int r23 = r21 + 1;
        int r24 = ((r20[r21] << 16) & 16711680) | r22;
        int r25 = r23 + 1;
        int r26 = r25 + 1;
        int r27 = (r24 | ((r20[r23] << 8) & 65280)) | (r20[r25] & 255);
        byte[] r28 = new byte[r27];
        java.lang.System.arraycopy(r20, r26, r28, 0, r27);
        com.jcraft.jsch.SignatureRSA r29 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(this.j6.DW("signature.rsa")).newInstance();     // Catch: java.lang.Exception -> L18
        r29.DW();     // Catch: java.lang.Exception -> L16
    L21:
        r29.j6(r18, r28);
        r29.DW(this.Hw);
        boolean r110 = r29.j6(r13);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L39;
        com.jcraft.jsch.JSch.v5().j6(1, "ssh_rsa_verify: signature " + r110);
    L39:
        this.tp = 0;
        return r110;
    L16:
        e = e;
    L20:
        java.lang.System.err.println(e);
    L18:
        e = e;
        r29 = null;
        goto L20
    L25:
        if (r6.equals("ssh-dss") == false) goto L38;
        this.u7 = 1;
        byte[] r30 = this.v5;
        int r31 = r7 + 1;
        int r32 = r31 + 1;
        int r33 = ((r30[r31] << 16) & 16711680) | ((r30[r7] << 24) & (-16777216));
        int r34 = r32 + 1;
        int r35 = r33 | ((r30[r32] << 8) & 65280);
        int r36 = r34 + 1;
        int r37 = r35 | (r30[r34] & 255);
        byte[] r38 = new byte[r37];
        java.lang.System.arraycopy(r30, r36, r38, 0, r37);
        int r39 = r36 + r37;
        this.aM = r38;
        byte[] r40 = this.v5;
        int r41 = r39 + 1;
        int r42 = (r40[r39] << 24) & (-16777216);
        int r43 = r41 + 1;
        int r44 = ((r40[r41] << 16) & 16711680) | r42;
        int r45 = r43 + 1;
        int r46 = r44 | ((r40[r43] << 8) & 65280);
        int r47 = r45 + 1;
        int r48 = r46 | (r40[r45] & 255);
        byte[] r49 = new byte[r48];
        java.lang.System.arraycopy(r40, r47, r49, 0, r48);
        int r50 = r47 + r48;
        byte[] r51 = this.v5;
        int r52 = r50 + 1;
        int r111 = r52 + 1;
        int r53 = ((r51[r52] << 16) & 16711680) | ((r51[r50] << 24) & (-16777216));
        int r54 = r111 + 1;
        int r55 = r53 | ((r51[r111] << 8) & 65280);
        int r112 = r54 + 1;
        int r56 = r55 | (r51[r54] & 255);
        byte[] r57 = new byte[r56];
        java.lang.System.arraycopy(r51, r112, r57, 0, r56);
        int r113 = r112 + r56;
        this.j3 = r57;
        byte[] r58 = this.v5;
        int r59 = r113 + 1;
        int r60 = r59 + 1;
        int r61 = ((r58[r59] << 16) & 16711680) | ((-16777216) & (r58[r113] << 24));
        int r62 = r60 + 1;
        int r63 = r62 + 1;
        int r64 = (r61 | ((r58[r60] << 8) & 65280)) | (r58[r62] & 255);
        byte[] r65 = new byte[r64];
        java.lang.System.arraycopy(r58, r63, r65, 0, r64);
        com.jcraft.jsch.SignatureDSA r66 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(this.j6.DW("signature.dss")).newInstance();     // Catch: java.lang.Exception -> L32
        r66.DW();     // Catch: java.lang.Exception -> L30
    L35:
        r66.DW(r65, this.aM, r49, this.j3);
        r66.DW(this.Hw);
        r110 = r66.j6(r13);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L39;
        com.jcraft.jsch.JSch.v5().j6(1, "ssh_dss_verify: signature " + r110);
    L30:
        e = e;
    L34:
        java.lang.System.err.println(e);
    L32:
        e = e;
        r66 = null;
        goto L34
    L38:
        java.lang.System.err.println("unknown alg");
        r110 = false;
        goto L39
    L41:
        r12.FH();
        r12.j6();
        int r67 = r12.j6();
        if (r67 == 31) goto L45;
        java.lang.System.err.println("type: must be SSH_MSG_KEX_DH_GEX_GROUP " + r67);
        return false;
    L45:
        this.aM = r12.Zo();
        this.j3 = r12.Zo();
        this.EQ.FH(this.aM);
        this.EQ.j6(this.j3);
        this.Mr = this.EQ.j6();
        this.XL.DW();
        this.QX.j6((byte) 32);
        this.QX.FH(this.Mr);
        this.j6.DW(this.XL);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L48;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEX_DH_GEX_INIT sent");
        com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEX_DH_GEX_REPLY");
    L48:
        this.tp = 33;
        return true;
    }
}
