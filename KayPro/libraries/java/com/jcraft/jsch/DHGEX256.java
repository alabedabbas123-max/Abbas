package com.jcraft.jsch;

public class DHGEX256 extends com.jcraft.jsch.KeyExchange {
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

    public DHGEX256() {
        this.u7 = 0;
    }

    @Override
    public int VH() {
        return this.tp;
    }

    @Override
    public java.lang.String Zo() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.u7 != 1) { $pc0 = 6; continue $sw0; }
                    return "DSA";
                }
                case 6: {
                    return "RSA";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(com.jcraft.jsch.Session r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.j6 = r1;
                    this.we = r2;
                    this.J0 = r3;
                    this.J8 = r4;
                    this.Ws = r5;
                    try {
                        this.DW = (com.jcraft.jsch.HASH) java.lang.Class.forName(r1.DW("sha-256")).newInstance();
                        this.DW.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 5; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    this.QX = new com.jcraft.jsch.Buffer();
                    this.XL = new com.jcraft.jsch.Packet(this.QX);
                    try {
                        this.EQ = (com.jcraft.jsch.DH) java.lang.Class.forName(r1.DW("dh")).newInstance();
                        this.EQ.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.XL.DW();
                    this.QX.j6((byte) 34);
                    this.QX.FH(Zo);
                    this.QX.FH(VH);
                    this.QX.FH(gn);
                    r1.DW(this.XL);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc1 = 12; continue $sw1; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEX_DH_GEX_REQUEST(" + Zo + "<" + VH + "<" + gn + ") sent");
                    com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    this.tp = 31;
                    return;
                }
                case 14: {
                    e = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 5: {
                    e = $ex1;
                    java.lang.System.err.println(e);
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(com.jcraft.jsch.Buffer r12) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        byte[] r13 = null;
        byte[] r3 = null;
        byte[] r4 = null;
        int r5 = 0;
        java.lang.String r6 = null;
        int r7 = 0;
        byte[] r8 = null;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        byte[] r18 = null;
        int r19 = 0;
        byte[] r20 = null;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        byte[] r28 = null;
        com.jcraft.jsch.SignatureRSA r29 = null;
        boolean r110 = false;
        byte[] r30 = null;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        byte[] r38 = null;
        int r39 = 0;
        byte[] r40 = null;
        int r41 = 0;
        int r42 = 0;
        int r43 = 0;
        int r44 = 0;
        int r45 = 0;
        int r46 = 0;
        int r47 = 0;
        int r48 = 0;
        byte[] r49 = null;
        int r50 = 0;
        byte[] r51 = null;
        int r52 = 0;
        int r111 = 0;
        int r53 = 0;
        int r54 = 0;
        int r55 = 0;
        int r112 = 0;
        int r56 = 0;
        byte[] r57 = null;
        int r113 = 0;
        byte[] r58 = null;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
        int r62 = 0;
        int r63 = 0;
        int r64 = 0;
        byte[] r65 = null;
        com.jcraft.jsch.SignatureDSA r66 = null;
        int r67 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.tp;
                    if (r0 == 31) { $pc2 = 41; continue $sw2; }
                    if (r0 == 33) { $pc2 = 6; continue $sw2; }
                    return false;
                }
                case 6: {
                    r12.FH();
                    r12.j6();
                    r1 = r12.j6();
                    if (r1 == 33) { $pc2 = 10; continue $sw2; }
                    java.lang.System.err.println("type: must be SSH_MSG_KEX_DH_GEX_REPLY " + r1);
                    return false;
                }
                case 10: {
                    this.v5 = r12.tp();
                    r2 = r12.Zo();
                    r13 = r12.tp();
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
                    r3 = new byte[this.QX.Hw()];
                    this.QX.j6(r3);
                    this.DW.update(r3, 0, r3.length);
                    this.Hw = this.DW.FH();
                    r4 = this.v5;
                    r5 = ((((r4[0] << 24) & (-16777216)) | ((r4[1] << 16) & 16711680)) | ((r4[2] << 8) & 65280)) | (r4[3] & 255);
                    r6 = com.jcraft.jsch.Util.j6(r4, 4, r5);
                    r7 = 4 + r5;
                    if (r6.equals("ssh-rsa") == false) { $pc2 = 25; continue $sw2; }
                    this.u7 = 0;
                    r8 = this.v5;
                    r9 = r7 + 1;
                    r10 = r9 + 1;
                    r11 = ((r8[r9] << 16) & 16711680) | ((r8[r7] << 24) & (-16777216));
                    r14 = r10 + 1;
                    r15 = r11 | ((r8[r10] << 8) & 65280);
                    r16 = r14 + 1;
                    r17 = r15 | (r8[r14] & 255);
                    r18 = new byte[r17];
                    java.lang.System.arraycopy(r8, r16, r18, 0, r17);
                    r19 = r16 + r17;
                    r20 = this.v5;
                    r21 = r19 + 1;
                    r22 = (-16777216) & (r20[r19] << 24);
                    r23 = r21 + 1;
                    r24 = ((r20[r21] << 16) & 16711680) | r22;
                    r25 = r23 + 1;
                    r26 = r25 + 1;
                    r27 = (r24 | ((r20[r23] << 8) & 65280)) | (r20[r25] & 255);
                    r28 = new byte[r27];
                    java.lang.System.arraycopy(r20, r26, r28, 0, r27);
                    try {
                        r29 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(this.j6.DW("signature.rsa")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 18; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r29.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    r29.j6(r18, r28);
                    r29.DW(this.Hw);
                    r110 = r29.j6(r13);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc2 = 39; continue $sw2; }
                    com.jcraft.jsch.JSch.v5().j6(1, "ssh_rsa_verify: signature " + r110);
                    $pc2 = 39; continue $sw2;
                }
                case 39: {
                    this.tp = 0;
                    return r110;
                }
                case 16: {
                    e = e;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    java.lang.System.err.println(e);
                    $pc2 = 25; continue $sw2;
                }
                case 18: {
                    e = e;
                    r29 = null;
                    { $pc2 = 20; continue $sw2; }
                }
                case 25: {
                    if (r6.equals("ssh-dss") == false) { $pc2 = 38; continue $sw2; }
                    this.u7 = 1;
                    r30 = this.v5;
                    r31 = r7 + 1;
                    r32 = r31 + 1;
                    r33 = ((r30[r31] << 16) & 16711680) | ((r30[r7] << 24) & (-16777216));
                    r34 = r32 + 1;
                    r35 = r33 | ((r30[r32] << 8) & 65280);
                    r36 = r34 + 1;
                    r37 = r35 | (r30[r34] & 255);
                    r38 = new byte[r37];
                    java.lang.System.arraycopy(r30, r36, r38, 0, r37);
                    r39 = r36 + r37;
                    this.aM = r38;
                    r40 = this.v5;
                    r41 = r39 + 1;
                    r42 = (r40[r39] << 24) & (-16777216);
                    r43 = r41 + 1;
                    r44 = ((r40[r41] << 16) & 16711680) | r42;
                    r45 = r43 + 1;
                    r46 = r44 | ((r40[r43] << 8) & 65280);
                    r47 = r45 + 1;
                    r48 = r46 | (r40[r45] & 255);
                    r49 = new byte[r48];
                    java.lang.System.arraycopy(r40, r47, r49, 0, r48);
                    r50 = r47 + r48;
                    r51 = this.v5;
                    r52 = r50 + 1;
                    r111 = r52 + 1;
                    r53 = ((r51[r52] << 16) & 16711680) | ((r51[r50] << 24) & (-16777216));
                    r54 = r111 + 1;
                    r55 = r53 | ((r51[r111] << 8) & 65280);
                    r112 = r54 + 1;
                    r56 = r55 | (r51[r54] & 255);
                    r57 = new byte[r56];
                    java.lang.System.arraycopy(r51, r112, r57, 0, r56);
                    r113 = r112 + r56;
                    this.j3 = r57;
                    r58 = this.v5;
                    r59 = r113 + 1;
                    r60 = r59 + 1;
                    r61 = ((r58[r59] << 16) & 16711680) | ((-16777216) & (r58[r113] << 24));
                    r62 = r60 + 1;
                    r63 = r62 + 1;
                    r64 = (r61 | ((r58[r60] << 8) & 65280)) | (r58[r62] & 255);
                    r65 = new byte[r64];
                    java.lang.System.arraycopy(r58, r63, r65, 0, r64);
                    try {
                        r66 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(this.j6.DW("signature.dss")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 32; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r66.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 30; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 35; continue $sw2;
                }
                case 35: {
                    r66.DW(r65, this.aM, r49, this.j3);
                    r66.DW(this.Hw);
                    r110 = r66.j6(r13);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc2 = 39; continue $sw2; }
                    com.jcraft.jsch.JSch.v5().j6(1, "ssh_dss_verify: signature " + r110);
                    $pc2 = 34; continue $sw2;
                }
                case 30: {
                    e = e;
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    java.lang.System.err.println(e);
                    $pc2 = 38; continue $sw2;
                }
                case 32: {
                    e = e;
                    r66 = null;
                    { $pc2 = 34; continue $sw2; }
                }
                case 38: {
                    java.lang.System.err.println("unknown alg");
                    r110 = false;
                    { $pc2 = 39; continue $sw2; }
                }
                case 41: {
                    r12.FH();
                    r12.j6();
                    r67 = r12.j6();
                    if (r67 == 31) { $pc2 = 45; continue $sw2; }
                    java.lang.System.err.println("type: must be SSH_MSG_KEX_DH_GEX_GROUP " + r67);
                    return false;
                }
                case 45: {
                    this.aM = r12.Zo();
                    this.j3 = r12.Zo();
                    this.EQ.FH(this.aM);
                    this.EQ.j6(this.j3);
                    this.Mr = this.EQ.j6();
                    this.XL.DW();
                    this.QX.j6((byte) 32);
                    this.QX.FH(this.Mr);
                    this.j6.DW(this.XL);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc2 = 48; continue $sw2; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEX_DH_GEX_INIT sent");
                    com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEX_DH_GEX_REPLY");
                    $pc2 = 48; continue $sw2;
                }
                case 48: {
                    this.tp = 33;
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
