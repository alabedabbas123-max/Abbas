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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    this.BT = 1024;
                    this.Mr = r2;
                    this.U2 = r3;
                    this.a8 = r4;
                    if (r2 == null) { $pc0 = 6; continue $sw0; }
                    this.BT = new java.math.BigInteger(r2).bitLength();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] VH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.er != null) { $pc1 = 6; continue $sw1; }
                    this.er = new java.math.BigInteger(this.a8).mod(new java.math.BigInteger(this.lg).subtract(java.math.BigInteger.ONE)).toByteArray();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.er;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] Zo() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.gW != null) { $pc2 = 6; continue $sw2; }
                    this.gW = new java.math.BigInteger(this.rN).modInverse(new java.math.BigInteger(this.lg)).toByteArray();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.gW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] gn() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.yS != null) { $pc3 = 6; continue $sw3; }
                    this.yS = new java.math.BigInteger(this.a8).mod(new java.math.BigInteger(this.rN).subtract(java.math.BigInteger.ONE)).toByteArray();
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return this.yS;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        com.jcraft.jsch.Buffer r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (v5() == true) { $pc4 = 7; continue $sw4; }
                    r0 = new com.jcraft.jsch.Buffer();
                    r0.Hw(j3);
                    r0.Hw(this.Mr);
                    r0.Hw(this.U2);
                    r0.Hw(this.a8);
                    r0.Hw(Zo());
                    r0.Hw(this.lg);
                    r0.Hw(this.rN);
                    r0.Hw(com.jcraft.jsch.Util.FH(this.gn));
                    r1 = new byte[r0.Hw()];
                    r0.j6(r1, 0, r1.length);
                    return r1;
                }
                case 7: {
                    throw new com.jcraft.jsch.JSchException("key is encrypted.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] DW(byte[] r4) {
        com.jcraft.jsch.SignatureRSA r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r0 = (com.jcraft.jsch.SignatureRSA) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("signature.rsa")).newInstance();
                        r0.DW();
                        r0.DW(this.a8, this.Mr);
                        r0.DW(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 4; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r0.j6()}).DW;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean FH(byte[] r7) {
        com.jcraft.jsch.Buffer r1 = null;
        byte[][] r8 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        byte r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        int r40 = 0;
        int r41 = 0;
        int r42 = 0;
        int r43 = 0;
        int r44 = 0;
        int r45 = 0;
        int r46 = 0;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        int r50 = 0;
        int r51 = 0;
        int r52 = 0;
        int r53 = 0;
        int r54 = 0;
        int r55 = 0;
        int r56 = 0;
        int r57 = 0;
        int r58 = 0;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
        int r62 = 0;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        int r67 = 0;
        int r68 = 0;
        int r69 = 0;
        int r70 = 0;
        int r71 = 0;
        int r72 = 0;
        int r73 = 0;
        int r74 = 0;
        com.jcraft.jsch.Buffer r75 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 106: {
                    return false;
                }
                case 4: {
                    if (this.VH != 2) { $pc6 = 12; continue $sw6; }
                    try {
                        r1 = new com.jcraft.jsch.Buffer(r7);
                        r1.v5(r7.length);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r8 = r1.j6(4, "");
                        this.a8 = r8[0];
                        this.lg = r8[1];
                        this.rN = r8[2];
                        this.gW = r8[3];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc6 = 10; continue $sw6; }
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        VH();
                        gn();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 10: {
                    return false;
                }
                case 12: {
                    if (this.VH == 1) { $pc6 = 14; continue $sw6; }
                    try {
                        r2 = r7[1] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r2 & 128) == 0) { $pc6 = 28; continue $sw6; }
                    try {
                        r3 = r2 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = 2;
                    $pc6 = 24; continue $sw6;
                }
                case 24: {
                    try {
                        r5 = r3 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 <= 0) { $pc6 = 30; continue $sw6; }
                    try {
                        r6 = r4 + 1;
                        r9 = r7[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = r6;
                    r3 = r5;
                    $pc6 = 30; continue $sw6;
                }
                case 30: {
                    if (r7[r4] == 2) { $pc6 = 32; continue $sw6; }
                    return false;
                }
                case 32: {
                    try {
                        r10 = r4 + 1;
                        r11 = r10 + 1;
                        r12 = r7[r10] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r12 & 128) == 0) { $pc6 = 39; continue $sw6; }
                    try {
                        r13 = r12 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r14 = r11;
                    r15 = 0;
                    $pc6 = 35; continue $sw6;
                }
                case 35: {
                    try {
                        r16 = r13 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13 <= 0) { $pc6 = 37; continue $sw6; }
                    try {
                        r15 = (r15 << 8) + (r7[r14] & 255);
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = r16;
                    { $pc6 = 35; continue $sw6; }
                }
                case 37: {
                    r12 = r15;
                    r11 = r14;
                    $pc6 = 39; continue $sw6;
                }
                case 39: {
                    try {
                        r17 = (r11 + r12) + 1;
                        r18 = r17 + 1;
                        r19 = r7[r17] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r19 & 128) == 0) { $pc6 = 46; continue $sw6; }
                    try {
                        r20 = r19 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r21 = r18;
                    r22 = 0;
                    $pc6 = 42; continue $sw6;
                }
                case 42: {
                    try {
                        r23 = r20 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r20 <= 0) { $pc6 = 44; continue $sw6; }
                    try {
                        r24 = r22 << 8;
                        r25 = r24 + (r7[r21] & 255);
                        r21 = r21 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r22 = r25;
                    r20 = r23;
                    { $pc6 = 42; continue $sw6; }
                }
                case 44: {
                    r19 = r22;
                    r18 = r21;
                    $pc6 = 46; continue $sw6;
                }
                case 46: {
                    try {
                        this.Mr = new byte[r19];
                        java.lang.System.arraycopy(r7, r18, this.Mr, 0, r19);
                        r26 = (r18 + r19) + 1;
                        r27 = r26 + 1;
                        r28 = r7[r26] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r28 & 128) == 0) { $pc6 = 53; continue $sw6; }
                    try {
                        r29 = r28 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r30 = r27;
                    r31 = 0;
                    $pc6 = 49; continue $sw6;
                }
                case 49: {
                    try {
                        r32 = r29 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r29 <= 0) { $pc6 = 54; continue $sw6; }
                    try {
                        r31 = (r31 << 8) + (r7[r30] & 255);
                        r30 = r30 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r29 = r32;
                    $pc6 = 54; continue $sw6;
                }
                case 54: {
                    try {
                        this.U2 = new byte[r31];
                        java.lang.System.arraycopy(r7, r30, this.U2, 0, r31);
                        r33 = (r30 + r31) + 1;
                        r34 = r33 + 1;
                        r35 = r7[r33] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r35 & 128) == 0) { $pc6 = 61; continue $sw6; }
                    try {
                        r36 = r35 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r37 = r34;
                    r38 = 0;
                    $pc6 = 57; continue $sw6;
                }
                case 57: {
                    try {
                        r39 = r36 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r36 <= 0) { $pc6 = 62; continue $sw6; }
                    try {
                        r38 = (r38 << 8) + (r7[r37] & 255);
                        r37 = r37 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r36 = r39;
                    $pc6 = 62; continue $sw6;
                }
                case 62: {
                    try {
                        this.a8 = new byte[r38];
                        java.lang.System.arraycopy(r7, r37, this.a8, 0, r38);
                        r40 = (r37 + r38) + 1;
                        r41 = r40 + 1;
                        r42 = r7[r40] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r42 & 128) == 0) { $pc6 = 69; continue $sw6; }
                    try {
                        r43 = r42 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r44 = r41;
                    r45 = 0;
                    $pc6 = 65; continue $sw6;
                }
                case 65: {
                    try {
                        r46 = r43 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r43 <= 0) { $pc6 = 70; continue $sw6; }
                    try {
                        r45 = (r45 << 8) + (r7[r44] & 255);
                        r44 = r44 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r43 = r46;
                    $pc6 = 70; continue $sw6;
                }
                case 70: {
                    try {
                        this.lg = new byte[r45];
                        java.lang.System.arraycopy(r7, r44, this.lg, 0, r45);
                        r47 = (r44 + r45) + 1;
                        r48 = r47 + 1;
                        r49 = r7[r47] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r49 & 128) == 0) { $pc6 = 77; continue $sw6; }
                    try {
                        r50 = r49 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r51 = r48;
                    r52 = 0;
                    $pc6 = 73; continue $sw6;
                }
                case 73: {
                    try {
                        r53 = r50 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r50 <= 0) { $pc6 = 78; continue $sw6; }
                    try {
                        r52 = (r52 << 8) + (r7[r51] & 255);
                        r51 = r51 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r50 = r53;
                    $pc6 = 78; continue $sw6;
                }
                case 78: {
                    try {
                        this.rN = new byte[r52];
                        java.lang.System.arraycopy(r7, r51, this.rN, 0, r52);
                        r54 = (r51 + r52) + 1;
                        r55 = r54 + 1;
                        r56 = r7[r54] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r56 & 128) == 0) { $pc6 = 85; continue $sw6; }
                    try {
                        r57 = r56 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r58 = r55;
                    r59 = 0;
                    $pc6 = 81; continue $sw6;
                }
                case 81: {
                    try {
                        r60 = r57 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r57 <= 0) { $pc6 = 86; continue $sw6; }
                    try {
                        r59 = (r59 << 8) + (r7[r58] & 255);
                        r58 = r58 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r57 = r60;
                    $pc6 = 86; continue $sw6;
                }
                case 86: {
                    try {
                        this.er = new byte[r59];
                        java.lang.System.arraycopy(r7, r58, this.er, 0, r59);
                        r61 = (r58 + r59) + 1;
                        r62 = r61 + 1;
                        r63 = r7[r61] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r63 & 128) == 0) { $pc6 = 93; continue $sw6; }
                    try {
                        r64 = r63 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r65 = r62;
                    r66 = 0;
                    $pc6 = 89; continue $sw6;
                }
                case 89: {
                    try {
                        r67 = r64 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r64 <= 0) { $pc6 = 94; continue $sw6; }
                    try {
                        r66 = (r66 << 8) + (r7[r65] & 255);
                        r65 = r65 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r64 = r67;
                    $pc6 = 94; continue $sw6;
                }
                case 94: {
                    try {
                        this.yS = new byte[r66];
                        java.lang.System.arraycopy(r7, r65, this.yS, 0, r66);
                        r68 = (r65 + r66) + 1;
                        r69 = r68 + 1;
                        r70 = r7[r68] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r70 & 128) == 0) { $pc6 = 101; continue $sw6; }
                    try {
                        r71 = r70 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r72 = r69;
                    r73 = 0;
                    $pc6 = 97; continue $sw6;
                }
                case 97: {
                    try {
                        r74 = r71 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r71 <= 0) { $pc6 = 102; continue $sw6; }
                    try {
                        r73 = (r73 << 8) + (r7[r72] & 255);
                        r72 = r72 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r71 = r74;
                    $pc6 = 102; continue $sw6;
                }
                case 102: {
                    try {
                        this.gW = new byte[r73];
                        java.lang.System.arraycopy(r7, r72, this.gW, 0, r73);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Mr == null) { $pc6 = 105; continue $sw6; }
                    try {
                        this.BT = new java.math.BigInteger(this.Mr).bitLength();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 105; continue $sw6;
                }
                case 105: {
                    return true;
                }
                case 101: {
                    r72 = r69;
                    r73 = r70;
                    { $pc6 = 102; continue $sw6; }
                }
                case 93: {
                    r65 = r62;
                    r66 = r63;
                    { $pc6 = 94; continue $sw6; }
                }
                case 85: {
                    r58 = r55;
                    r59 = r56;
                    { $pc6 = 86; continue $sw6; }
                }
                case 77: {
                    r51 = r48;
                    r52 = r49;
                    { $pc6 = 78; continue $sw6; }
                }
                case 69: {
                    r44 = r41;
                    r45 = r42;
                    { $pc6 = 70; continue $sw6; }
                }
                case 61: {
                    r37 = r34;
                    r38 = r35;
                    { $pc6 = 62; continue $sw6; }
                }
                case 53: {
                    r30 = r27;
                    r31 = r28;
                    { $pc6 = 54; continue $sw6; }
                }
                case 28: {
                    r4 = 2;
                    { $pc6 = 30; continue $sw6; }
                }
                case 14: {
                    if (r7[0] == 48) { $pc6 = 20; continue $sw6; }
                    try {
                        r75 = new com.jcraft.jsch.Buffer(r7);
                        this.U2 = r75.VH();
                        this.a8 = r75.VH();
                        this.Mr = r75.VH();
                        r75.VH();
                        this.lg = r75.VH();
                        this.rN = r75.VH();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Mr == null) { $pc6 = 18; continue $sw6; }
                    try {
                        this.BT = new java.math.BigInteger(this.Mr).bitLength();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    try {
                        VH();
                        gn();
                        Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 106; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    byte[] FH() {
        return j3;
    }

    @Override
    public byte[] Hw() {
        byte[] r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = super.Hw();
                    if (r0 == null) { $pc7 = 5; continue $sw7; }
                    return r0;
                }
                case 5: {
                    r1 = this.U2;
                    if (r1 != null) { $pc7 = 10; continue $sw7; }
                    return null;
                }
                case 10: {
                    return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r1, this.Mr}).DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
        super.j6();
        com.jcraft.jsch.Util.DW(this.a8);
    }
}
