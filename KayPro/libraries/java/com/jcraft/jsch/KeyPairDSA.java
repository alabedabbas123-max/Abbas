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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    this.er = 1024;
                    this.Mr = r2;
                    this.U2 = r3;
                    this.a8 = r4;
                    this.lg = r5;
                    this.rN = r6;
                    if (r2 == null) { $pc0 = 6; continue $sw0; }
                    this.er = new java.math.BigInteger(r2).bitLength();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        com.jcraft.jsch.Buffer r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (v5() == true) { $pc1 = 7; continue $sw1; }
                    r0 = new com.jcraft.jsch.Buffer();
                    r0.Hw(j3);
                    r0.Hw(this.Mr);
                    r0.Hw(this.U2);
                    r0.Hw(this.a8);
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
    public byte[] DW(byte[] r6) {
        com.jcraft.jsch.SignatureDSA r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r0 = (com.jcraft.jsch.SignatureDSA) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("signature.dss")).newInstance();
                        r0.DW();
                        r0.j6(this.rN, this.Mr, this.U2, this.a8);
                        r0.DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 4; continue $sw2; }
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
        com.jcraft.jsch.Buffer r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r8 = 0;
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
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 82: {
                    return false;
                }
                case 4: {
                    if (this.VH != 1) { $pc3 = 13; continue $sw3; }
                    if (r7[0] == 48) { $pc3 = 11; continue $sw3; }
                    try {
                        r1 = new com.jcraft.jsch.Buffer(r7);
                        r1.FH();
                        this.Mr = r1.VH();
                        this.a8 = r1.VH();
                        this.U2 = r1.VH();
                        this.lg = r1.VH();
                        this.rN = r1.VH();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Mr == null) { $pc3 = 10; continue $sw3; }
                    try {
                        this.er = new java.math.BigInteger(this.Mr).bitLength();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return true;
                }
                case 11: {
                    return false;
                }
                case 13: {
                    if (this.VH != 2) { $pc3 = 19; continue $sw3; }
                    try {
                        r2 = new com.jcraft.jsch.Buffer(r7);
                        r2.v5(r7.length);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        this.rN = r2.j6(1, "")[0];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc3 = 17; continue $sw3; }
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 17: {
                    return false;
                }
                case 19: {
                    if (r7[0] == 48) { $pc3 = 21; continue $sw3; }
                    return false;
                }
                case 21: {
                    try {
                        r3 = r7[1] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r3 & 128) == 0) { $pc3 = 28; continue $sw3; }
                    try {
                        r4 = r3 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5 = 2;
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    try {
                        r6 = r4 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 <= 0) { $pc3 = 30; continue $sw3; }
                    try {
                        r8 = r5 + 1;
                        r9 = r7[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5 = r8;
                    r4 = r6;
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    if (r7[r5] == 2) { $pc3 = 32; continue $sw3; }
                    return false;
                }
                case 32: {
                    try {
                        r10 = r5 + 1;
                        r11 = r10 + 1;
                        r12 = r7[r10] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r12 & 128) == 0) { $pc3 = 39; continue $sw3; }
                    try {
                        r13 = r12 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r14 = r11;
                    r15 = 0;
                    $pc3 = 35; continue $sw3;
                }
                case 35: {
                    try {
                        r16 = r13 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13 <= 0) { $pc3 = 37; continue $sw3; }
                    try {
                        r15 = (r15 << 8) + (r7[r14] & 255);
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = r16;
                    { $pc3 = 35; continue $sw3; }
                }
                case 37: {
                    r12 = r15;
                    r11 = r14;
                    $pc3 = 39; continue $sw3;
                }
                case 39: {
                    try {
                        r17 = (r11 + r12) + 1;
                        r18 = r17 + 1;
                        r19 = r7[r17] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r19 & 128) == 0) { $pc3 = 46; continue $sw3; }
                    try {
                        r20 = r19 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r21 = r18;
                    r22 = 0;
                    $pc3 = 42; continue $sw3;
                }
                case 42: {
                    try {
                        r23 = r20 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r20 <= 0) { $pc3 = 44; continue $sw3; }
                    try {
                        r24 = r22 << 8;
                        r25 = r24 + (r7[r21] & 255);
                        r21 = r21 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r22 = r25;
                    r20 = r23;
                    { $pc3 = 42; continue $sw3; }
                }
                case 44: {
                    r19 = r22;
                    r18 = r21;
                    $pc3 = 46; continue $sw3;
                }
                case 46: {
                    try {
                        this.Mr = new byte[r19];
                        java.lang.System.arraycopy(r7, r18, this.Mr, 0, r19);
                        r26 = (r18 + r19) + 1;
                        r27 = r26 + 1;
                        r28 = r7[r26] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r28 & 128) == 0) { $pc3 = 53; continue $sw3; }
                    try {
                        r29 = r28 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r30 = r27;
                    r31 = 0;
                    $pc3 = 49; continue $sw3;
                }
                case 49: {
                    try {
                        r32 = r29 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r29 <= 0) { $pc3 = 54; continue $sw3; }
                    try {
                        r31 = (r31 << 8) + (r7[r30] & 255);
                        r30 = r30 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r29 = r32;
                    $pc3 = 54; continue $sw3;
                }
                case 54: {
                    try {
                        this.U2 = new byte[r31];
                        java.lang.System.arraycopy(r7, r30, this.U2, 0, r31);
                        r33 = (r30 + r31) + 1;
                        r34 = r33 + 1;
                        r35 = r7[r33] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r35 & 128) == 0) { $pc3 = 61; continue $sw3; }
                    try {
                        r36 = r35 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r37 = r34;
                    r38 = 0;
                    $pc3 = 57; continue $sw3;
                }
                case 57: {
                    try {
                        r39 = r36 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r36 <= 0) { $pc3 = 62; continue $sw3; }
                    try {
                        r38 = (r38 << 8) + (r7[r37] & 255);
                        r37 = r37 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r36 = r39;
                    $pc3 = 62; continue $sw3;
                }
                case 62: {
                    try {
                        this.a8 = new byte[r38];
                        java.lang.System.arraycopy(r7, r37, this.a8, 0, r38);
                        r40 = (r37 + r38) + 1;
                        r41 = r40 + 1;
                        r42 = r7[r40] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r42 & 128) == 0) { $pc3 = 69; continue $sw3; }
                    try {
                        r43 = r42 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r44 = r41;
                    r45 = 0;
                    $pc3 = 65; continue $sw3;
                }
                case 65: {
                    try {
                        r46 = r43 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r43 <= 0) { $pc3 = 70; continue $sw3; }
                    try {
                        r45 = (r45 << 8) + (r7[r44] & 255);
                        r44 = r44 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r43 = r46;
                    $pc3 = 70; continue $sw3;
                }
                case 70: {
                    try {
                        this.lg = new byte[r45];
                        java.lang.System.arraycopy(r7, r44, this.lg, 0, r45);
                        r47 = (r44 + r45) + 1;
                        r48 = r47 + 1;
                        r49 = r7[r47] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r49 & 128) == 0) { $pc3 = 77; continue $sw3; }
                    try {
                        r50 = r49 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r51 = r48;
                    r52 = 0;
                    $pc3 = 73; continue $sw3;
                }
                case 73: {
                    try {
                        r53 = r50 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r50 <= 0) { $pc3 = 78; continue $sw3; }
                    try {
                        r52 = (r52 << 8) + (r7[r51] & 255);
                        r51 = r51 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r50 = r53;
                    $pc3 = 78; continue $sw3;
                }
                case 78: {
                    try {
                        this.rN = new byte[r52];
                        java.lang.System.arraycopy(r7, r51, this.rN, 0, r52);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Mr == null) { $pc3 = 81; continue $sw3; }
                    try {
                        this.er = new java.math.BigInteger(this.Mr).bitLength();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 82; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 81; continue $sw3;
                }
                case 81: {
                    return true;
                }
                case 77: {
                    r51 = r48;
                    r52 = r49;
                    { $pc3 = 78; continue $sw3; }
                }
                case 69: {
                    r44 = r41;
                    r45 = r42;
                    { $pc3 = 70; continue $sw3; }
                }
                case 61: {
                    r37 = r34;
                    r38 = r35;
                    { $pc3 = 62; continue $sw3; }
                }
                case 53: {
                    r30 = r27;
                    r31 = r28;
                    { $pc3 = 54; continue $sw3; }
                }
                case 28: {
                    r5 = 2;
                    { $pc3 = 30; continue $sw3; }
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
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = super.Hw();
                    if (r0 == null) { $pc4 = 5; continue $sw4; }
                    return r0;
                }
                case 5: {
                    r1 = this.Mr;
                    if (r1 != null) { $pc4 = 10; continue $sw4; }
                    return null;
                }
                case 10: {
                    return com.jcraft.jsch.Buffer.j6(new byte[][]{j3, r1, this.U2, this.a8, this.lg}).DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
