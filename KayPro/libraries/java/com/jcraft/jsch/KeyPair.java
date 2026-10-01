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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.Hw = r1;
                        this.j6 = r2;
                        this.DW = r3;
                        this.FH = r4;
                        if ((r3 + r4) > r2.length) { $pc0 = 6; continue $sw0; }
                        return;
                    }
                    case 6: {
                        throw new com.jcraft.jsch.KeyPair.ASN1Exception(r1);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private int j6(int[] r7) {
            int r1 = 0;
            int r3 = 0;
            int r2 = 0;
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r1 = r7[0];
                        r3 = r1 + 1;
                        r2 = this.j6[r1] & 255;
                        if ((r2 & 128) == 0) { $pc1 = 9; continue $sw1; }
                        r4 = r2 & 127;
                        r5 = 0;
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r6 = r4 - 1;
                        if (r4 <= 0) { $pc1 = 7; continue $sw1; }
                        r5 = (this.j6[r3] & 255) + (r5 << 8);
                        r4 = r6;
                        r3 = r3 + 1;
                        { $pc1 = 5; continue $sw1; }
                    }
                    case 7: {
                        r2 = r5;
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        r7[0] = r3;
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        com.jcraft.jsch.KeyPair.ASN1[] DW() {
            byte[] r0 = null;
            int r1 = 0;
            byte r2 = 0;
            int r4 = 0;
            int[] r3 = null;
            int r5 = 0;
            int r6 = 0;
            java.util.Vector r7 = null;
            int r8 = 0;
            int r9 = 0;
            int r10 = 0;
            int r11 = 0;
            com.jcraft.jsch.KeyPair.ASN1[] r12 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.j6;
                        r1 = this.DW;
                        r2 = r0[r1];
                        r4 = 0;
                        r3 = new int[]{r1 + 1};
                        r5 = j6(r3);
                        if (r2 == 5) { $pc2 = 5; continue $sw2; }
                        r6 = r3[0];
                        r7 = new java.util.Vector();
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        if (r5 <= 0) { $pc2 = 8; continue $sw2; }
                        r8 = r6 + 1;
                        r3[0] = r8;
                        r9 = j6(r3);
                        r10 = r3[0];
                        r11 = r10 - r8;
                        r7.addElement(new com.jcraft.jsch.KeyPair.ASN1(this.Hw, this.j6, r8 - 1, (r11 + 1) + r9));
                        r6 = r10 + r9;
                        r5 = ((r5 - 1) - r11) - r9;
                        { $pc2 = 7; continue $sw2; }
                    }
                    case 8: {
                        r12 = new com.jcraft.jsch.KeyPair.ASN1[r7.size()];
                        $pc2 = 10; continue $sw2;
                    }
                    case 10: {
                        if (r4 >= r7.size()) { $pc2 = 11; continue $sw2; }
                        r12[r4] = (com.jcraft.jsch.KeyPair.ASN1) r7.elementAt(r4);
                        r4 = r4 + 1;
                        { $pc2 = 10; continue $sw2; }
                    }
                    case 11: {
                        return r12;
                    }
                    case 5: {
                        return new com.jcraft.jsch.KeyPair.ASN1[0];
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        this.EQ = (com.jcraft.jsch.HASH) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("md5")).newInstance();
                        this.EQ.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 5; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    return this.EQ;
                }
                case 5: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private com.jcraft.jsch.Cipher Zo() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        this.tp = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("3des-cbc")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 5; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    return this.tp;
                }
                case 5: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte j6(byte r2) {
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (48 <= r2) { $pc5 = 5; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    r3 = (r2 - 97) + 10;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return (byte) r3;
                }
                case 5: {
                    if (r2 > 57) { $pc5 = 9; continue $sw5; }
                    r3 = r2 - 48;
                    { $pc5 = 8; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r2, java.lang.String r3, java.lang.String r4) {
        byte[] r0 = null;
        java.lang.String r5 = null;
        byte[] r6 = null;
        com.jcraft.jsch.KeyPair r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        r0 = com.jcraft.jsch.Util.DW(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 19; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 != null) { $pc6 = 5; continue $sw6; }
                    r5 = java.lang.String.valueOf(r3) + ".pub";
                    $pc6 = 24; continue $sw6;
                }
                case 24: {
                    try {
                        r6 = com.jcraft.jsch.Util.DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 8; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 26; continue $sw6;
                }
                case 26: {
                    try {
                        r7 = j6(r2, r0, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 14; continue $sw6;
                    }
                    com.jcraft.jsch.Util.DW(r0);
                    return r7;
                }
                case 14: {
                    th = $ex6;
                    com.jcraft.jsch.Util.DW(r0);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    e = $ex6;
                    if (r4 != null) { $pc6 = 18; continue $sw6; }
                    r6 = null;
                    { $pc6 = 26; continue $sw6; }
                }
                case 18: {
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 5: {
                    r5 = r4;
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    e = $ex6;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r10, byte[] r11) {
        com.jcraft.jsch.Buffer r0 = null;
        java.util.Hashtable r12 = null;
        java.lang.String r1 = null;
        byte[] r3 = null;
        byte[] r4 = null;
        byte[] r2 = null;
        byte[] r5 = null;
        com.jcraft.jsch.Buffer r6 = null;
        byte[] r7 = null;
        byte[] r8 = null;
        com.jcraft.jsch.KeyPair r9 = null;
        com.jcraft.jsch.Buffer r13 = null;
        byte[] r14 = null;
        byte[] r15 = null;
        byte[] r16 = null;
        byte[] r17 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new com.jcraft.jsch.Buffer(r11);
                    r12 = new java.util.Hashtable();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (j6(r0, r12) == true) { $pc7 = 4; continue $sw7; }
                    r1 = (java.lang.String) r12.get("PuTTY-User-Key-File-2");
                    if (r1 != null) { $pc7 = 8; continue $sw7; }
                    return null;
                }
                case 8: {
                    r3 = j6(r0, java.lang.Integer.parseInt((java.lang.String) r12.get("Public-Lines")));
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (j6(r0, r12) == true) { $pc7 = 10; continue $sw7; }
                    r4 = j6(r0, java.lang.Integer.parseInt((java.lang.String) r12.get("Private-Lines")));
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    if (j6(r0, r12) == true) { $pc7 = 13; continue $sw7; }
                    r2 = com.jcraft.jsch.Util.DW(r4, 0, r4.length);
                    r5 = com.jcraft.jsch.Util.DW(r3, 0, r3.length);
                    if (r1.equals("ssh-rsa") == false) { $pc7 = 18; continue $sw7; }
                    r6 = new com.jcraft.jsch.Buffer(r5);
                    r6.v5(r5.length);
                    r6.j6(new byte[r6.FH()]);
                    r7 = new byte[r6.FH()];
                    r6.j6(r7);
                    r8 = new byte[r6.FH()];
                    r6.j6(r8);
                    r9 = new com.jcraft.jsch.KeyPairRSA(r10, r8, r7, null);
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    r9.J0 = !r12.get("Encryption").equals("none");
                    r9.VH = 2;
                    r9.gn = (java.lang.String) r12.get("Comment");
                    if (r9.J0 == true) { $pc7 = 23; continue $sw7; }
                    r9.J8 = r2;
                    r9.FH(r2);
                    $pc7 = 31; continue $sw7;
                }
                case 31: {
                    return r9;
                }
                case 23: {
                    if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes256-cbc")) == false) { $pc7 = 29; continue $sw7; }
                    try {
                        r9.tp = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes256-cbc")).newInstance();
                        r9.Ws = new byte[r9.tp.FH()];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 26; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r9.J8 = r2;
                    $pc7 = 27; continue $sw7;
                }
                case 27: {
                    throw new com.jcraft.jsch.JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
                }
                case 29: {
                    throw new com.jcraft.jsch.JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
                }
                case 18: {
                    if (r1.equals("ssh-dss") == false) { $pc7 = 32; continue $sw7; }
                    r13 = new com.jcraft.jsch.Buffer(r5);
                    r13.v5(r5.length);
                    r13.j6(new byte[r13.FH()]);
                    r14 = new byte[r13.FH()];
                    r13.j6(r14);
                    r15 = new byte[r13.FH()];
                    r13.j6(r15);
                    r16 = new byte[r13.FH()];
                    r13.j6(r16);
                    r17 = new byte[r13.FH()];
                    r13.j6(r17);
                    r9 = new com.jcraft.jsch.KeyPairDSA(r10, r14, r15, r16, r17, null);
                    { $pc7 = 20; continue $sw7; }
                }
                case 32: {
                    return null;
                }
                case 26: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.jcraft.jsch.KeyPair j6(com.jcraft.jsch.JSch r22, byte[] r23, byte[] r24) {
        byte[] r4 = null;
        int r8 = 0;
        com.jcraft.jsch.Buffer r2 = null;
        java.lang.String r3 = null;
        int r11 = 0;
        int r12 = 0;
        int r14 = 0;
        com.jcraft.jsch.Cipher r17 = null;
        int r15 = 0;
        boolean r16 = false;
        byte[] r18 = null;
        char r5 = 0;
        int r7 = 0;
        int r13 = 0;
        int r6 = 0;
        int r9 = 0;
        int r10 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        byte r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        boolean r36 = false;
        boolean r37 = false;
        int r38 = 0;
        int r39 = 0;
        byte[] r40 = null;
        int r110 = 0;
        int r41 = 0;
        boolean r111 = false;
        int r112 = 0;
        int r113 = 0;
        int r42 = 0;
        byte[] r43 = null;
        java.lang.String r44 = null;
        byte[] r45 = null;
        com.jcraft.jsch.KeyPair r46 = null;
        int r114 = 0;
        int r115 = 0;
        int r47 = 0;
        boolean r48 = false;
        int r116 = 0;
        int r49 = 0;
        boolean r117 = false;
        boolean r50 = false;
        int r51 = 0;
        int r52 = 0;
        int r53 = 0;
        int r54 = 0;
        byte[] r118 = null;
        int r55 = 0;
        int r56 = 0;
        com.jcraft.jsch.Buffer r57 = null;
        java.lang.String r58 = null;
        com.jcraft.jsch.KeyPair r119 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r4 = new byte[8];
                    r8 = 3;
                    if (r24 != null) { $pc8 = 24; continue $sw8; }
                    if (r23 == null) { $pc8 = 24; continue $sw8; }
                    if (r23.length <= 11) { $pc8 = 24; continue $sw8; }
                    if (r23[0] != 0) { $pc8 = 24; continue $sw8; }
                    if (r23[1] != 0) { $pc8 = 24; continue $sw8; }
                    if (r23[2] != 0) { $pc8 = 24; continue $sw8; }
                    if (r23[3] != 7) { $pc8 = 24; continue $sw8; }
                    r2 = new com.jcraft.jsch.Buffer(r23);
                    r2.v5(r23.length);
                    r3 = new java.lang.String(r2.tp());
                    r2.J0();
                    if (r3.equals("ssh-rsa") == false) { $pc8 = 19; continue $sw8; }
                    return com.jcraft.jsch.KeyPairRSA.j6(r22, r2);
                }
                case 19: {
                    if (r3.equals("ssh-dss") == false) { $pc8 = 23; continue $sw8; }
                    return com.jcraft.jsch.KeyPairDSA.j6(r22, r2);
                }
                case 23: {
                    throw new com.jcraft.jsch.JSchException("privatekey: invalid key " + new java.lang.String(r23, 4, 7));
                }
                case 24: {
                    if (r23 != null) { $pc8 = 469; continue $sw8; }
                    $pc8 = 30; continue $sw8;
                }
                case 30: {
                    if (r23 == null) { $pc8 = 32; continue $sw8; }
                    try {
                        r11 = r23.length;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 33; continue $sw8;
                }
                case 33: {
                    r12 = 0;
                    $pc8 = 35; continue $sw8;
                }
                case 35: {
                    if (r12 >= r11) { $pc8 = 49; continue $sw8; }
                    if (r23[r12] != 45) { $pc8 = 457; continue $sw8; }
                    try {
                        r14 = r12 + 4;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r14 >= r11) { $pc8 = 457; continue $sw8; }
                    if (r23[r12 + 1] != 45) { $pc8 = 457; continue $sw8; }
                    if (r23[r12 + 2] != 45) { $pc8 = 457; continue $sw8; }
                    if (r23[r12 + 3] != 45) { $pc8 = 457; continue $sw8; }
                    if (r23[r14] == 45) { $pc8 = 49; continue $sw8; }
                    $pc8 = 457; continue $sw8;
                }
                case 457: {
                    r12 = r12 + 1;
                    r8 = 3;
                    $pc8 = 49; continue $sw8;
                }
                case 49: {
                    r17 = null;
                    r15 = 0;
                    r16 = true;
                    r18 = r4;
                    r5 = 0;
                    $pc8 = 51; continue $sw8;
                }
                case 51: {
                    if (r12 >= r11) { $pc8 = 52; continue $sw8; }
                    if (r23[r12] != 66) { $pc8 = 130; continue $sw8; }
                    try {
                        r7 = r12 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 >= r11) { $pc8 = 130; continue $sw8; }
                    if (r23[r12 + 1] != 69) { $pc8 = 130; continue $sw8; }
                    if (r23[r12 + 2] != 71) { $pc8 = 130; continue $sw8; }
                    if (r23[r7] != 73) { $pc8 = 130; continue $sw8; }
                    try {
                        r13 = r12 + 6;
                        r6 = r13 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6 >= r11) { $pc8 = 128; continue $sw8; }
                    if (r23[r13] != 68) { $pc8 = 73; continue $sw8; }
                    if (r23[r13 + 1] != 83) { $pc8 = 73; continue $sw8; }
                    if (r23[r6] != 65) { $pc8 = 73; continue $sw8; }
                    r5 = 1;
                    $pc8 = 124; continue $sw8;
                }
                case 124: {
                    try {
                        r12 = r13 + r8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 73; continue $sw8;
                }
                case 73: {
                    if (r23[r13] != 82) { $pc8 = 80; continue $sw8; }
                    if (r23[r13 + 1] != 83) { $pc8 = 80; continue $sw8; }
                    if (r23[r6] != 65) { $pc8 = 80; continue $sw8; }
                    r5 = 2;
                    $pc8 = 80; continue $sw8;
                }
                case 80: {
                    if (r23[r13] == 83) { $pc8 = 82; continue $sw8; }
                    $pc8 = 86; continue $sw8;
                }
                case 86: {
                    try {
                        r9 = r13 + 6;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9 < r11) { $pc8 = 89; continue $sw8; }
                    $pc8 = 103; continue $sw8;
                }
                case 103: {
                    try {
                        r10 = r13 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r10 >= r11) { $pc8 = 126; continue $sw8; }
                    if (r23[r13] != 69) { $pc8 = 126; continue $sw8; }
                    if (r23[r13 + 1] != 78) { $pc8 = 126; continue $sw8; }
                    if (r23[r6] != 67) { $pc8 = 126; continue $sw8; }
                    if (r23[r13 + 3] != 82) { $pc8 = 126; continue $sw8; }
                    if (r23[r13 + 4] != 89) { $pc8 = 126; continue $sw8; }
                    try {
                        r19 = r13 + 5;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23[r19] != 80) { $pc8 = 126; continue $sw8; }
                    if (r23[r9] != 84) { $pc8 = 126; continue $sw8; }
                    if (r23[r13 + 7] != 69) { $pc8 = 126; continue $sw8; }
                    if (r23[r10] != 68) { $pc8 = 126; continue $sw8; }
                    r13 = r19;
                    r5 = 3;
                    r15 = 3;
                    $pc8 = 126; continue $sw8;
                }
                case 126: {
                    try {
                        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 89: {
                    if (r23[r13] != 80) { $pc8 = 103; continue $sw8; }
                    if (r23[r13 + 1] != 82) { $pc8 = 103; continue $sw8; }
                    if (r23[r6] != 73) { $pc8 = 103; continue $sw8; }
                    try {
                        r20 = r13 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23[r20] != 86) { $pc8 = 103; continue $sw8; }
                    if (r23[r13 + 4] != 65) { $pc8 = 103; continue $sw8; }
                    if (r23[r13 + 5] != 84) { $pc8 = 103; continue $sw8; }
                    if (r23[r9] != 69) { $pc8 = 103; continue $sw8; }
                    r13 = r20;
                    r5 = 3;
                    r15 = 3;
                    r16 = false;
                    { $pc8 = 124; continue $sw8; }
                }
                case 82: {
                    if (r23[r13 + 1] != 83) { $pc8 = 86; continue $sw8; }
                    if (r23[r6] != 72) { $pc8 = 86; continue $sw8; }
                    r5 = 3;
                    r15 = 1;
                    { $pc8 = 124; continue $sw8; }
                }
                case 128: {
                    try {
                        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 130: {
                    if (r23[r12] != 65) { $pc8 = 153; continue $sw8; }
                    try {
                        r21 = r12 + 7;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r21 >= r11) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 1] != 69) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 2] != 83) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 3] != 45) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 4] != 50) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 5] != 53) { $pc8 = 153; continue $sw8; }
                    if (r23[r12 + 6] != 54) { $pc8 = 153; continue $sw8; }
                    if (r23[r21] != 45) { $pc8 = 153; continue $sw8; }
                    try {
                        r12 = r12 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes256-cbc")) == false) { $pc8 = 151; continue $sw8; }
                    try {
                        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes256-cbc")).newInstance();
                        r18 = new byte[r17.FH()];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 51; continue $sw8; }
                }
                case 151: {
                    try {
                        throw new com.jcraft.jsch.JSchException("privatekey: aes256-cbc is not available " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 153: {
                    if (r23[r12] != 65) { $pc8 = 176; continue $sw8; }
                    try {
                        r25 = r12 + 7;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r25 >= r11) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 1] != 69) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 2] != 83) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 3] != 45) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 4] != 49) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 5] != 57) { $pc8 = 176; continue $sw8; }
                    if (r23[r12 + 6] != 50) { $pc8 = 176; continue $sw8; }
                    if (r23[r25] != 45) { $pc8 = 176; continue $sw8; }
                    try {
                        r12 = r12 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes192-cbc")) == false) { $pc8 = 174; continue $sw8; }
                    try {
                        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes192-cbc")).newInstance();
                        r18 = new byte[r17.FH()];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 51; continue $sw8; }
                }
                case 174: {
                    try {
                        throw new com.jcraft.jsch.JSchException("privatekey: aes192-cbc is not available " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 176: {
                    if (r23[r12] != 65) { $pc8 = 199; continue $sw8; }
                    try {
                        r26 = r12 + 7;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r26 >= r11) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 1] != 69) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 2] != 83) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 3] != 45) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 4] != 49) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 5] != 50) { $pc8 = 199; continue $sw8; }
                    if (r23[r12 + 6] != 56) { $pc8 = 199; continue $sw8; }
                    if (r23[r26] != 45) { $pc8 = 199; continue $sw8; }
                    try {
                        r12 = r12 + 8;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (com.jcraft.jsch.Session.j6(com.jcraft.jsch.JSch.DW("aes128-cbc")) == false) { $pc8 = 197; continue $sw8; }
                    try {
                        r17 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("aes128-cbc")).newInstance();
                        r18 = new byte[r17.FH()];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 51; continue $sw8; }
                }
                case 197: {
                    try {
                        throw new com.jcraft.jsch.JSchException("privatekey: aes128-cbc is not available " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 199: {
                    if (r23[r12] != 67) { $pc8 = 214; continue $sw8; }
                    try {
                        r27 = r12 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r27 >= r11) { $pc8 = 214; continue $sw8; }
                    if (r23[r12 + 1] != 66) { $pc8 = 214; continue $sw8; }
                    if (r23[r12 + 2] != 67) { $pc8 = 214; continue $sw8; }
                    if (r23[r27] != 44) { $pc8 = 214; continue $sw8; }
                    try {
                        r12 = r12 + 4;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r28 = 0;
                    $pc8 = 210; continue $sw8;
                }
                case 210: {
                    if (r28 >= r18.length) { $pc8 = 51; continue $sw8; }
                    try {
                        r29 = r12 + 1;
                        r30 = (j6(r23[r12]) << 4) & 240;
                        r12 = r29 + 1;
                        r18[r28] = (byte) (r30 + (j6(r23[r29]) & 15));
                        r28 = r28 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 214; continue $sw8;
                }
                case 214: {
                    if (r23[r12] != 13) { $pc8 = 221; continue $sw8; }
                    try {
                        r31 = r12 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r31 >= r23.length) { $pc8 = 221; continue $sw8; }
                    r32 = 10;
                    if (r23[r31] != 10) { $pc8 = 223; continue $sw8; }
                    r12 = r31;
                    $pc8 = 223; continue $sw8;
                }
                case 223: {
                    if (r23[r12] != r32) { $pc8 = 455; continue $sw8; }
                    try {
                        r33 = r12 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r33 >= r23.length) { $pc8 = 455; continue $sw8; }
                    if (r23[r33] == r32) { $pc8 = 228; continue $sw8; }
                    if (r23[r33] != 13) { $pc8 = 236; continue $sw8; }
                    try {
                        r34 = r12 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r34 >= r23.length) { $pc8 = 236; continue $sw8; }
                    if (r23[r34] != 10) { $pc8 = 236; continue $sw8; }
                    try {
                        r12 = r12 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 236; continue $sw8;
                }
                case 236: {
                    r35 = r33;
                    $pc8 = 238; continue $sw8;
                }
                case 238: {
                    if (r35 >= r23.length) { $pc8 = 242; continue $sw8; }
                    if (r23[r35] == 10) { $pc8 = 242; continue $sw8; }
                    if (r23[r35] == 58) { $pc8 = 245; continue $sw8; }
                    r35 = r35 + 1;
                    r17 = r17;
                    r8 = 3;
                    { $pc8 = 238; continue $sw8; }
                }
                case 245: {
                    r36 = true;
                    $pc8 = 246; continue $sw8;
                }
                case 246: {
                    if (r36 == true) { $pc8 = 455; continue $sw8; }
                    if (r15 == r8) { $pc8 = 249; continue $sw8; }
                    r12 = r33;
                    r37 = false;
                    $pc8 = 250; continue $sw8;
                }
                case 250: {
                    if (r23 == null) { $pc8 = 292; continue $sw8; }
                    if (r5 == 0) { $pc8 = 291; continue $sw8; }
                    r38 = r12;
                    $pc8 = 253; continue $sw8;
                }
                case 253: {
                    if (r38 >= r11) { $pc8 = 258; continue $sw8; }
                    if (r23[r38] == 45) { $pc8 = 258; continue $sw8; }
                    try {
                        r38 = r38 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 258; continue $sw8;
                }
                case 258: {
                    if ((r11 - r38) == 0) { $pc8 = 288; continue $sw8; }
                    try {
                        r39 = r38 - r12;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r39 == 0) { $pc8 = 288; continue $sw8; }
                    try {
                        r40 = new byte[r39];
                        java.lang.System.arraycopy(r23, r12, r40, 0, r40.length);
                        r110 = r40.length;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r41 = 0;
                    $pc8 = 262; continue $sw8;
                }
                case 262: {
                    if (r41 >= r110) { $pc8 = 281; continue $sw8; }
                    if (r40[r41] == 10) { $pc8 = 267; continue $sw8; }
                    if (r40[r41] == 45) { $pc8 = 281; continue $sw8; }
                    try {
                        r41 = r41 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 262; continue $sw8; }
                }
                case 267: {
                    if (r40[r41 - 1] != 13) { $pc8 = 269; continue $sw8; }
                    r111 = true;
                    $pc8 = 270; continue $sw8;
                }
                case 270: {
                    try {
                        r112 = r41 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r111 == false) { $pc8 = 273; continue $sw8; }
                    r113 = 1;
                    $pc8 = 274; continue $sw8;
                }
                case 274: {
                    try {
                        java.lang.System.arraycopy(r40, r112, r40, r41 - r113, r110 - r112);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r111 == false) { $pc8 = 277; continue $sw8; }
                    try {
                        r110 = r110 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 277; continue $sw8;
                }
                case 277: {
                    try {
                        r110 = r110 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 262; continue $sw8; }
                }
                case 273: {
                    r113 = 0;
                    { $pc8 = 274; continue $sw8; }
                }
                case 269: {
                    r111 = false;
                    $pc8 = 281; continue $sw8;
                }
                case 281: {
                    try {
                        r42 = r41 - 0;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r42 <= 0) { $pc8 = 284; continue $sw8; }
                    try {
                        r43 = com.jcraft.jsch.Util.DW(r40, 0, r42);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 285; continue $sw8;
                }
                case 285: {
                    try {
                        com.jcraft.jsch.Util.DW(r40);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 293; continue $sw8;
                }
                case 293: {
                    if (r43 != null) { $pc8 = 295; continue $sw8; }
                    $pc8 = 311; continue $sw8;
                }
                case 311: {
                    r44 = "";
                    if (r24 != null) { $pc8 = 472; continue $sw8; }
                    $pc8 = 433; continue $sw8;
                }
                case 433: {
                    r45 = null;
                    $pc8 = 434; continue $sw8;
                }
                case 434: {
                    r46 = null;
                    if (r5 != 1) { $pc8 = 438; continue $sw8; }
                    r46 = new com.jcraft.jsch.KeyPairDSA(r22);
                    $pc8 = 443; continue $sw8;
                }
                case 443: {
                    if (r46 == null) { $pc8 = 453; continue $sw8; }
                    r46.J0 = r37;
                    r46.QX = r45;
                    r46.VH = r15;
                    r46.gn = r44;
                    r46.tp = r17;
                    if (r37 == false) { $pc8 = 448; continue $sw8; }
                    r46.J0 = true;
                    r46.Ws = r18;
                    r46.J8 = r43;
                    { $pc8 = 453; continue $sw8; }
                }
                case 448: {
                    if (r46.FH(r43) == false) { $pc8 = 452; continue $sw8; }
                    r46.J0 = false;
                    return r46;
                }
                case 452: {
                    throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
                }
                case 453: {
                    return r46;
                }
                case 438: {
                    if (r5 != 2) { $pc8 = 441; continue $sw8; }
                    r46 = new com.jcraft.jsch.KeyPairRSA(r22);
                    { $pc8 = 443; continue $sw8; }
                }
                case 441: {
                    if (r15 != 3) { $pc8 = 443; continue $sw8; }
                    r46 = new com.jcraft.jsch.KeyPairPKCS8(r22);
                    { $pc8 = 443; continue $sw8; }
                }
                case 472: {
                    try {
                        r114 = r24.length;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r24.length <= 4) { $pc8 = 383; continue $sw8; }
                    if (r24[0] != 45) { $pc8 = 383; continue $sw8; }
                    r115 = 1;
                    if (r24[1] != 45) { $pc8 = 383; continue $sw8; }
                    if (r24[2] != 45) { $pc8 = 383; continue $sw8; }
                    if (r24[r8] != 45) { $pc8 = 383; continue $sw8; }
                    r47 = 0;
                    $pc8 = 324; continue $sw8;
                }
                case 324: {
                    try {
                        r47 = r47 + r115;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r24.length <= r47) { $pc8 = 331; continue $sw8; }
                    if (r24[r47] == 10) { $pc8 = 331; continue $sw8; }
                    r115 = 1;
                    $pc8 = 331; continue $sw8;
                }
                case 331: {
                    if (r24.length > r47) { $pc8 = 333; continue $sw8; }
                    r48 = false;
                    $pc8 = 334; continue $sw8;
                }
                case 334: {
                    if (r48 == false) { $pc8 = 335; continue $sw8; }
                    if (r24[r47] != 10) { $pc8 = 379; continue $sw8; }
                    try {
                        r116 = r47 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r49 = r116;
                    $pc8 = 340; continue $sw8;
                }
                case 340: {
                    if (r49 >= r24.length) { $pc8 = 341; continue $sw8; }
                    r117 = r48;
                    if (r24[r49] == 10) { $pc8 = 344; continue $sw8; }
                    if (r24[r49] == 58) { $pc8 = 347; continue $sw8; }
                    r49 = r49 + 1;
                    r48 = r117;
                    { $pc8 = 340; continue $sw8; }
                }
                case 347: {
                    r50 = true;
                    $pc8 = 348; continue $sw8;
                }
                case 348: {
                    if (r50 == true) { $pc8 = 380; continue $sw8; }
                    r47 = r116;
                    $pc8 = 351; continue $sw8;
                }
                case 351: {
                    if (r24.length > r47) { $pc8 = 353; continue $sw8; }
                    r117 = false;
                    $pc8 = 353; continue $sw8;
                }
                case 353: {
                    r51 = r47;
                    $pc8 = 354; continue $sw8;
                }
                case 354: {
                    if (r117 == false) { $pc8 = 364; continue $sw8; }
                    if (r51 >= r114) { $pc8 = 364; continue $sw8; }
                    if (r24[r51] == 10) { $pc8 = 359; continue $sw8; }
                    if (r24[r51] == 45) { $pc8 = 364; continue $sw8; }
                    try {
                        r51 = r51 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 354; continue $sw8; }
                }
                case 359: {
                    try {
                        java.lang.System.arraycopy(r24, r51 + 1, r24, r51, (r114 - r51) - 1);
                        r114 = r114 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 364; continue $sw8;
                }
                case 364: {
                    if (r117 == false) { $pc8 = 433; continue $sw8; }
                    try {
                        r45 = com.jcraft.jsch.Util.DW(r24, r47, r51 - r47);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23 == null) { $pc8 = 470; continue $sw8; }
                    if (r5 != 3) { $pc8 = 434; continue $sw8; }
                    $pc8 = 470; continue $sw8;
                }
                case 470: {
                    if (r45[8] != 100) { $pc8 = 373; continue $sw8; }
                    r5 = 1;
                    { $pc8 = 434; continue $sw8; }
                }
                case 373: {
                    if (r45[8] != 114) { $pc8 = 434; continue $sw8; }
                    r5 = 2;
                    $pc8 = 380; continue $sw8;
                }
                case 380: {
                    r47 = r47 + 1;
                    r48 = r117;
                    $pc8 = 344; continue $sw8;
                }
                case 344: {
                    r50 = false;
                    { $pc8 = 348; continue $sw8; }
                }
                case 341: {
                    r117 = r48;
                    { $pc8 = 344; continue $sw8; }
                }
                case 379: {
                    r117 = r48;
                    { $pc8 = 380; continue $sw8; }
                }
                case 335: {
                    r117 = r48;
                    { $pc8 = 351; continue $sw8; }
                }
                case 333: {
                    r48 = true;
                    $pc8 = 383; continue $sw8;
                }
                case 383: {
                    if (r24[0] != 115) { $pc8 = 433; continue $sw8; }
                    if (r24[1] != 115) { $pc8 = 433; continue $sw8; }
                    if (r24[2] != 104) { $pc8 = 433; continue $sw8; }
                    if (r24[3] != 45) { $pc8 = 433; continue $sw8; }
                    if (r23 == null) { $pc8 = 392; continue $sw8; }
                    $pc8 = 399; continue $sw8;
                }
                case 399: {
                    r52 = 0;
                    $pc8 = 400; continue $sw8;
                }
                case 400: {
                    if (r52 >= r114) { $pc8 = 405; continue $sw8; }
                    if (r24[r52] == 32) { $pc8 = 405; continue $sw8; }
                    r52 = r52 + 1;
                    $pc8 = 405; continue $sw8;
                }
                case 405: {
                    try {
                        r53 = r52 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r53 >= r114) { $pc8 = 415; continue $sw8; }
                    r54 = r53;
                    $pc8 = 408; continue $sw8;
                }
                case 408: {
                    if (r54 >= r114) { $pc8 = 413; continue $sw8; }
                    if (r24[r54] == 32) { $pc8 = 413; continue $sw8; }
                    r54 = r54 + 1;
                    $pc8 = 413; continue $sw8;
                }
                case 413: {
                    try {
                        r118 = com.jcraft.jsch.Util.DW(r24, r53, r54 - r53);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 466; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r53 = r54;
                    $pc8 = 416; continue $sw8;
                }
                case 416: {
                    r55 = r53 + 1;
                    if (r53 >= r114) { $pc8 = 431; continue $sw8; }
                    r56 = r55;
                    $pc8 = 419; continue $sw8;
                }
                case 419: {
                    if (r56 >= r114) { $pc8 = 423; continue $sw8; }
                    if (r24[r56] == 10) { $pc8 = 423; continue $sw8; }
                    r56 = r56 + 1;
                    $pc8 = 423; continue $sw8;
                }
                case 423: {
                    if (r56 > 0) { $pc8 = 425; continue $sw8; }
                    $pc8 = 427; continue $sw8;
                }
                case 427: {
                    if (r55 >= r56) { $pc8 = 431; continue $sw8; }
                    try {
                        r44 = new java.lang.String(r24, r55, r56 - r55);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 465; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 431; continue $sw8; }
                }
                case 425: {
                    if (r24[r56 - 1] != 13) { $pc8 = 427; continue $sw8; }
                    try {
                        r56 = r56 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 465; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 431; continue $sw8;
                }
                case 431: {
                    r45 = r118;
                    { $pc8 = 434; continue $sw8; }
                }
                case 415: {
                    r118 = null;
                    { $pc8 = 416; continue $sw8; }
                }
                case 392: {
                    if (r24.length <= 7) { $pc8 = 399; continue $sw8; }
                    if (r24[4] != 100) { $pc8 = 397; continue $sw8; }
                    r5 = 1;
                    { $pc8 = 399; continue $sw8; }
                }
                case 397: {
                    if (r24[4] != 114) { $pc8 = 399; continue $sw8; }
                    r5 = 2;
                    { $pc8 = 399; continue $sw8; }
                }
                case 295: {
                    if (r43.length <= 4) { $pc8 = 311; continue $sw8; }
                    if (r43[0] != 63) { $pc8 = 311; continue $sw8; }
                    if (r43[1] != 111) { $pc8 = 311; continue $sw8; }
                    if (r43[2] != (-7)) { $pc8 = 311; continue $sw8; }
                    if (r43[r8] != (-21)) { $pc8 = 311; continue $sw8; }
                    try {
                        r57 = new com.jcraft.jsch.Buffer(r43);
                        r57.FH();
                        r57.FH();
                        r57.tp();
                        r58 = com.jcraft.jsch.Util.j6(r57.tp());
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r58.equals("3des-cbc") == false) { $pc8 = 307; continue $sw8; }
                    try {
                        r57.FH();
                        r57.j6(new byte[r43.length - r57.gn()]);
                        throw new com.jcraft.jsch.JSchException("unknown privatekey format: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 307: {
                    if (r58.equals("none") == false) { $pc8 = 311; continue $sw8; }
                    try {
                        r57.FH();
                        r57.FH();
                        r43 = new byte[r43.length - r57.gn()];
                        r57.j6(r43);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r37 = false;
                    { $pc8 = 311; continue $sw8; }
                }
                case 284: {
                    r43 = null;
                    $pc8 = 288; continue $sw8;
                }
                case 288: {
                    try {
                        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 291: {
                    try {
                        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 292: {
                    r43 = null;
                    { $pc8 = 293; continue $sw8; }
                }
                case 249: {
                    r12 = r33;
                    $pc8 = 242; continue $sw8;
                }
                case 242: {
                    r36 = false;
                    { $pc8 = 246; continue $sw8; }
                }
                case 228: {
                    try {
                        r12 = r12 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 455; continue $sw8;
                }
                case 455: {
                    r12 = r12 + 1;
                    r17 = r17;
                    r8 = 3;
                    $pc8 = 221; continue $sw8;
                }
                case 221: {
                    r32 = 10;
                    $pc8 = 52; continue $sw8;
                }
                case 52: {
                    r37 = r16;
                    { $pc8 = 250; continue $sw8; }
                }
                case 32: {
                    r11 = 0;
                    { $pc8 = 33; continue $sw8; }
                }
                case 469: {
                    try {
                        r119 = j6(r22, r23);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 28; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r119 == null) { $pc8 = 30; continue $sw8; }
                    return r119;
                }
                case 28: {
                    e = $ex8;
                    if ((e instanceof com.jcraft.jsch.JSchException) == true) { $pc8 = 463; continue $sw8; }
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 463: {
                    throw ((com.jcraft.jsch.JSchException) e);
                }
                case 465: {
                    $pc8 = 466; continue $sw8;
                }
                case 466: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(com.jcraft.jsch.Buffer r9, java.util.Hashtable r10) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.String r5 = null;
        java.lang.String r3 = null;
        int r4 = 0;
        int r7 = 0;
        int r6 = 0;
        int r8 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r9.DW;
                    r1 = r9.FH;
                    r2 = r1;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    r5 = null;
                    if (r2 >= r0.length) { $pc9 = 8; continue $sw9; }
                    if (r0[r2] == 13) { $pc9 = 8; continue $sw9; }
                    if (r0[r2] == 58) { $pc9 = 11; continue $sw9; }
                    r2 = r2 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 11: {
                    r3 = new java.lang.String(r0, r1, r2 - r1);
                    r4 = r2 + 1;
                    if (r4 < r0.length) { $pc9 = 14; continue $sw9; }
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    r7 = r4;
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    if (r3 != null) { $pc9 = 20; continue $sw9; }
                    return false;
                }
                case 20: {
                    r6 = r7;
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    if (r6 >= r0.length) { $pc9 = 32; continue $sw9; }
                    if (r0[r6] == 13) { $pc9 = 26; continue $sw9; }
                    r6 = r6 + 1;
                    { $pc9 = 22; continue $sw9; }
                }
                case 26: {
                    r5 = new java.lang.String(r0, r7, r6 - r7);
                    r8 = r6 + 1;
                    if (r8 < r0.length) { $pc9 = 29; continue $sw9; }
                    $pc9 = 31; continue $sw9;
                }
                case 31: {
                    r7 = r8;
                    { $pc9 = 32; continue $sw9; }
                }
                case 29: {
                    if (r0[r8] != 10) { $pc9 = 31; continue $sw9; }
                    r8 = r8 + 1;
                    $pc9 = 32; continue $sw9;
                }
                case 32: {
                    if (r5 == null) { $pc9 = 34; continue $sw9; }
                    r10.put(r3, r5);
                    r9.FH = r7;
                    $pc9 = 34; continue $sw9;
                }
                case 34: {
                    if (r3 == null) { $pc9 = 37; continue $sw9; }
                    if (r5 == null) { $pc9 = 37; continue $sw9; }
                    return true;
                }
                case 37: {
                    return false;
                }
                case 14: {
                    if (r0[r4] != 32) { $pc9 = 16; continue $sw9; }
                    r4 = r4 + 1;
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    r7 = r1;
                    r3 = null;
                    { $pc9 = 18; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] j6(com.jcraft.jsch.Buffer r8, int r9) {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r2 = null;
        int r3 = 0;
        int r10 = 0;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        int r7 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = r8.DW;
                    r1 = r8.FH;
                    r2 = null;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    r3 = r9 - 1;
                    if (r9 <= 0) { $pc10 = 5; continue $sw10; }
                    r10 = r1;
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    if (r0.length <= r10) { $pc10 = 11; continue $sw10; }
                    r4 = r10 + 1;
                    if (r0[r10] == 13) { $pc10 = 15; continue $sw10; }
                    r10 = r4;
                    { $pc10 = 10; continue $sw10; }
                }
                case 15: {
                    if (r2 != null) { $pc10 = 18; continue $sw10; }
                    r5 = (r4 - r1) - 1;
                    r6 = new byte[r5];
                    java.lang.System.arraycopy(r0, r1, r6, 0, r5);
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    r2 = r6;
                    $pc10 = 23; continue $sw10;
                }
                case 23: {
                    if (r0[r4] != 10) { $pc10 = 25; continue $sw10; }
                    r4 = r4 + 1;
                    $pc10 = 25; continue $sw10;
                }
                case 25: {
                    r1 = r4;
                    r9 = r3;
                    { $pc10 = 3; continue $sw10; }
                }
                case 18: {
                    r6 = new byte[((r2.length + r4) - r1) - 1];
                    java.lang.System.arraycopy(r2, 0, r6, 0, r2.length);
                    java.lang.System.arraycopy(r0, r1, r6, r2.length, (r4 - r1) - 1);
                    r7 = 0;
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    if (r7 >= r2.length) { $pc10 = 17; continue $sw10; }
                    r2[r7] = 0;
                    r7 = r7 + 1;
                    { $pc10 = 20; continue $sw10; }
                }
                case 11: {
                    r4 = r10;
                    { $pc10 = 23; continue $sw10; }
                }
                case 5: {
                    if (r2 == null) { $pc10 = 7; continue $sw10; }
                    r8.FH = r1;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(byte[] r7, byte[] r8, byte[] r9) {
        byte[] r10 = null;
        byte[] r11 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        r10 = j6(r8, r9);
                        this.tp.j6(1, r10, r9);
                        com.jcraft.jsch.Util.DW(r10);
                        r11 = new byte[r7.length];
                        this.tp.j6(r7, 0, r7.length, r11, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 4; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r11;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = 1;
                    if (r3 > 127) { $pc12 = 5; continue $sw12; }
                    return 1;
                }
                case 5: {
                    if (r3 <= 0) { $pc12 = 6; continue $sw12; }
                    r3 = r3 >>> 8;
                    r0 = r0 + 1;
                    { $pc12 = 5; continue $sw12; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(byte[] r5, int r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r8 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = j6(r7) - 1;
                    if (r0 != 0) { $pc13 = 6; continue $sw13; }
                    r1 = r6 + 1;
                    r5[r6] = (byte) r7;
                    return r1;
                }
                case 6: {
                    r2 = r6 + 1;
                    r5[r6] = (byte) (r0 | 128);
                    r8 = r2 + r0;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r0 <= 0) { $pc13 = 8; continue $sw13; }
                    r5[(r2 + r0) - 1] = (byte) (r7 & 255);
                    r7 = r7 >>> 8;
                    r0 = r0 - 1;
                    { $pc13 = 7; continue $sw13; }
                }
                case 8: {
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        boolean r0 = false;
        byte[] r1 = null;
        byte[] r6 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.J0;
                    if (r0 == true) { $pc14 = 5; continue $sw14; }
                    return true;
                }
                case 5: {
                    if (r5 == null) { $pc14 = 7; continue $sw14; }
                    r1 = new byte[r5.length];
                    java.lang.System.arraycopy(r5, 0, r1, 0, r1.length);
                    r6 = j6(this.J8, r1, this.Ws);
                    com.jcraft.jsch.Util.DW(r1);
                    if (FH(r6) == false) { $pc14 = 12; continue $sw14; }
                    this.J0 = false;
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    return !this.J0;
                }
                case 7: {
                    return !r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized byte[] j6(byte[] r9, byte[] r10) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        byte[] r5 = null;
        byte[] r6 = null;
        int r7 = 0;
        com.jcraft.jsch.HASH r8 = null;
        int r11 = 0;
        int r12 = 0;
        com.jcraft.jsch.HASH r13 = null;
        byte[] r14 = null;
        int r15 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    monitor-enter(this);
                    $pc15 = 48; continue $sw15;
                }
                case 48: {
                    th = $ex15;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.tp != null) { $pc15 = 7; continue $sw15; }
                    try {
                        this.tp = Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (this.EQ != null) { $pc15 = 9; continue $sw15; }
                    try {
                        this.EQ = VH();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    try {
                        r0 = new byte[this.tp.j6()];
                        r1 = this.EQ.j6();
                        r2 = (r0.length / r1) * r1;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 48; continue $sw15;
                    }
                    if ((r0.length % r1) != 0) { $pc15 = 12; continue $sw15; }
                    r3 = 0;
                    $pc15 = 13; continue $sw15;
                }
                case 13: {
                    try {
                        r4 = new byte[r2 + r3];
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 48; continue $sw15;
                    }
                    r5 = null;
                    $pc15 = 44; continue $sw15;
                }
                case 44: {
                    e = $ex15;
                    try {
                        java.lang.System.err.println(e);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 46; continue $sw15;
                }
                case 46: {
                    monitor-exit(this);
                    return r0;
                }
                case 16: {
                    if (this.VH != 0) { $pc15 = 29; continue $sw15; }
                    r6 = null;
                    r7 = 0;
                    $pc15 = 19; continue $sw15;
                }
                case 19: {
                    if ((r7 + r1) > r4.length) { $pc15 = 20; continue $sw15; }
                    if (r6 == null) { $pc15 = 23; continue $sw15; }
                    try {
                        this.EQ.update(r6, 0, r6.length);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 23; continue $sw15;
                }
                case 23: {
                    try {
                        this.EQ.update(r9, 0, r9.length);
                        r8 = this.EQ;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    r11 = 8;
                    if (r10.length > 8) { $pc15 = 27; continue $sw15; }
                    try {
                        r11 = r10.length;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 27; continue $sw15;
                }
                case 27: {
                    try {
                        r8.update(r10, 0, r11);
                        r6 = this.EQ.FH();
                        java.lang.System.arraycopy(r6, 0, r4, r7, r6.length);
                        r7 = r7 + r6.length;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    { $pc15 = 19; continue $sw15; }
                }
                case 20: {
                    try {
                        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    { $pc15 = 46; continue $sw15; }
                }
                case 29: {
                    if (this.VH != 1) { $pc15 = 38; continue $sw15; }
                    r12 = 0;
                    $pc15 = 32; continue $sw15;
                }
                case 32: {
                    if ((r12 + r1) > r4.length) { $pc15 = 33; continue $sw15; }
                    if (r5 == null) { $pc15 = 36; continue $sw15; }
                    try {
                        this.EQ.update(r5, 0, r5.length);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    $pc15 = 36; continue $sw15;
                }
                case 36: {
                    try {
                        this.EQ.update(r9, 0, r9.length);
                        r5 = this.EQ.FH();
                        java.lang.System.arraycopy(r5, 0, r4, r12, r5.length);
                        r12 = r12 + r5.length;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    { $pc15 = 32; continue $sw15; }
                }
                case 33: {
                    try {
                        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    { $pc15 = 46; continue $sw15; }
                }
                case 38: {
                    if (this.VH != 2) { $pc15 = 46; continue $sw15; }
                    try {
                        r13 = (com.jcraft.jsch.HASH) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("sha-1")).newInstance();
                        r14 = new byte[4];
                        r0 = new byte[40];
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    r15 = 0;
                    $pc15 = 40; continue $sw15;
                }
                case 40: {
                    if (r15 >= 2) { $pc15 = 46; continue $sw15; }
                    try {
                        r13.DW();
                        r14[3] = (byte) r15;
                        r13.update(r14, 0, r14.length);
                        r13.update(r9, 0, r9.length);
                        java.lang.System.arraycopy(r13.FH(), 0, r0, r15 * 20, 20);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 44; continue $sw15; }
                        $pc15 = 48; continue $sw15;
                    }
                    r15 = r15 + 1;
                    { $pc15 = 40; continue $sw15; }
                }
                case 12: {
                    r3 = r1;
                    { $pc15 = 13; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5() {
        return this.J0;
    }
}
