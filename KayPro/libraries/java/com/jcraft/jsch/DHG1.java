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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.gn != 1) { $pc0 = 6; continue $sw0; }
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
                    this.EQ = r2;
                    this.we = r3;
                    this.J0 = r4;
                    this.J8 = r5;
                    try {
                        this.DW = (com.jcraft.jsch.HASH) java.lang.Class.forName(r1.DW("sha-1")).newInstance();
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
                        this.tp = (com.jcraft.jsch.DH) java.lang.Class.forName(r1.DW("dh")).newInstance();
                        this.tp.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.tp.FH(VH);
                    this.tp.j6(Zo);
                    this.Ws = this.tp.j6();
                    this.XL.DW();
                    this.QX.j6((byte) 30);
                    this.QX.FH(this.Ws);
                    r1.DW(this.XL);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc1 = 12; continue $sw1; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXDH_INIT sent");
                    com.jcraft.jsch.JSch.v5().j6(1, "expecting SSH_MSG_KEXDH_REPLY");
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    this.u7 = 31;
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
    public boolean j6(com.jcraft.jsch.Buffer r13) {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r14 = null;
        byte[] r2 = null;
        byte[] r3 = null;
        int r4 = 0;
        java.lang.String r5 = null;
        int r6 = 0;
        byte[] r7 = null;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r15 = 0;
        int r16 = 0;
        byte[] r17 = null;
        int r18 = 0;
        byte[] r19 = null;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        byte[] r27 = null;
        com.jcraft.jsch.SignatureRSA r28 = null;
        boolean r110 = false;
        byte[] r29 = null;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        byte[] r37 = null;
        int r38 = 0;
        byte[] r39 = null;
        int r40 = 0;
        int r111 = 0;
        int r41 = 0;
        int r42 = 0;
        int r43 = 0;
        int r112 = 0;
        int r44 = 0;
        byte[] r45 = null;
        int r113 = 0;
        byte[] r46 = null;
        int r47 = 0;
        int r114 = 0;
        int r48 = 0;
        int r115 = 0;
        int r49 = 0;
        int r116 = 0;
        int r50 = 0;
        byte[] r117 = null;
        int r118 = 0;
        byte[] r51 = null;
        int r52 = 0;
        int r53 = 0;
        int r119 = 0;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int r57 = 0;
        byte[] r58 = null;
        com.jcraft.jsch.SignatureDSA r59 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.u7 == 31) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r13.FH();
                    r13.j6();
                    r0 = r13.j6();
                    if (r0 == 31) { $pc2 = 9; continue $sw2; }
                    java.lang.System.err.println("type: must be 31 " + r0);
                    return false;
                }
                case 9: {
                    this.v5 = r13.tp();
                    r1 = r13.Zo();
                    r14 = r13.tp();
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
                    r2 = new byte[this.QX.Hw()];
                    this.QX.j6(r2);
                    this.DW.update(r2, 0, r2.length);
                    this.Hw = this.DW.FH();
                    r3 = this.v5;
                    r4 = ((((r3[0] << 24) & (-16777216)) | ((r3[1] << 16) & 16711680)) | ((r3[2] << 8) & 65280)) | (r3[3] & 255);
                    r5 = com.jcraft.jsch.Util.j6(r3, 4, r4);
                    r6 = 4 + r4;
                    if (r5.equals("ssh-rsa") == false) { $pc2 = 24; continue $sw2; }
                    this.gn = 0;
                    r7 = this.v5;
                    r8 = r6 + 1;
                    r9 = r8 + 1;
                    r10 = ((r7[r8] << 16) & 16711680) | ((r7[r6] << 24) & (-16777216));
                    r11 = r9 + 1;
                    r12 = r10 | ((r7[r9] << 8) & 65280);
                    r15 = r11 + 1;
                    r16 = r12 | (r7[r11] & 255);
                    r17 = new byte[r16];
                    java.lang.System.arraycopy(r7, r15, r17, 0, r16);
                    r18 = r15 + r16;
                    r19 = this.v5;
                    r20 = r18 + 1;
                    r21 = (-16777216) & (r19[r18] << 24);
                    r22 = r20 + 1;
                    r23 = ((r19[r20] << 16) & 16711680) | r21;
                    r24 = r22 + 1;
                    r25 = r24 + 1;
                    r26 = (r23 | ((r19[r22] << 8) & 65280)) | (r19[r24] & 255);
                    r27 = new byte[r26];
                    java.lang.System.arraycopy(r19, r25, r27, 0, r26);
                    try {
                        r28 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(this.j6.DW("signature.rsa")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 17; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r28.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 15; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r28.j6(r17, r27);
                    r28.DW(this.Hw);
                    r110 = r28.j6(r14);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc2 = 38; continue $sw2; }
                    com.jcraft.jsch.JSch.v5().j6(1, "ssh_rsa_verify: signature " + r110);
                    $pc2 = 38; continue $sw2;
                }
                case 38: {
                    this.u7 = 0;
                    return r110;
                }
                case 15: {
                    e = e;
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    java.lang.System.err.println(e);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    e = e;
                    r28 = null;
                    { $pc2 = 19; continue $sw2; }
                }
                case 24: {
                    if (r5.equals("ssh-dss") == false) { $pc2 = 37; continue $sw2; }
                    this.gn = 1;
                    r29 = this.v5;
                    r30 = r6 + 1;
                    r31 = r30 + 1;
                    r32 = ((r29[r30] << 16) & 16711680) | ((r29[r6] << 24) & (-16777216));
                    r33 = r31 + 1;
                    r34 = r32 | ((r29[r31] << 8) & 65280);
                    r35 = r33 + 1;
                    r36 = r34 | (r29[r33] & 255);
                    r37 = new byte[r36];
                    java.lang.System.arraycopy(r29, r35, r37, 0, r36);
                    r38 = r35 + r36;
                    r39 = this.v5;
                    r40 = r38 + 1;
                    r111 = r40 + 1;
                    r41 = ((r39[r40] << 16) & 16711680) | ((r39[r38] << 24) & (-16777216));
                    r42 = r111 + 1;
                    r43 = r41 | ((r39[r111] << 8) & 65280);
                    r112 = r42 + 1;
                    r44 = r43 | (r39[r42] & 255);
                    r45 = new byte[r44];
                    java.lang.System.arraycopy(r39, r112, r45, 0, r44);
                    r113 = r112 + r44;
                    r46 = this.v5;
                    r47 = r113 + 1;
                    r114 = r47 + 1;
                    r48 = ((r46[r47] << 16) & 16711680) | ((r46[r113] << 24) & (-16777216));
                    r115 = r114 + 1;
                    r49 = r48 | ((r46[r114] << 8) & 65280);
                    r116 = r115 + 1;
                    r50 = r49 | (r46[r115] & 255);
                    r117 = new byte[r50];
                    java.lang.System.arraycopy(r46, r116, r117, 0, r50);
                    r118 = r116 + r50;
                    r51 = this.v5;
                    r52 = r118 + 1;
                    r53 = (-16777216) & (r51[r118] << 24);
                    r119 = r52 + 1;
                    r54 = ((r51[r52] << 16) & 16711680) | r53;
                    r55 = r119 + 1;
                    r56 = r55 + 1;
                    r57 = (r54 | ((r51[r119] << 8) & 65280)) | (r51[r55] & 255);
                    r58 = new byte[r57];
                    java.lang.System.arraycopy(r51, r56, r58, 0, r57);
                    try {
                        r59 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(this.j6.DW("signature.dss")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r59.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 29; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    r59.DW(r58, r37, r45, r117);
                    r59.DW(this.Hw);
                    r110 = r59.j6(r14);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc2 = 38; continue $sw2; }
                    com.jcraft.jsch.JSch.v5().j6(1, "ssh_dss_verify: signature " + r110);
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    e = e;
                    $pc2 = 33; continue $sw2;
                }
                case 33: {
                    java.lang.System.err.println(e);
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    e = e;
                    r59 = null;
                    { $pc2 = 33; continue $sw2; }
                }
                case 37: {
                    java.lang.System.err.println("unknown alg");
                    r110 = false;
                    { $pc2 = 38; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
