package abcd;

public final class IK {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final java.util.Map<java.lang.String, java.nio.charset.Charset> Hw = null;
    private static final byte[] j6 = null;
    private static final byte[] v5 = null;

    static {
        char r0 = 0;
        char r2 = 0;
        char r1 = 0;
        char r3 = 0;
        char r4 = 0;
        char r5 = 0;
        char r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    Hw = new java.util.HashMap();
                    Hw.put("latin-1", java.nio.charset.Charset.forName("ISO-8859-1"));
                    j6 = new byte[58];
                    java.util.Arrays.fill(j6, (byte) -1);
                    r0 = '0';
                    r2 = '0';
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r2 > '9') { $pc0 = 5; continue $sw0; }
                    j6[r2] = (byte) (r2 - '0');
                    r2 = (char) (r2 + 1);
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    DW = new byte[103];
                    java.util.Arrays.fill(DW, (byte) -1);
                    r1 = '0';
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r1 > '9') { $pc0 = 7; continue $sw0; }
                    DW[r1] = (byte) (r1 - '0');
                    r1 = (char) (r1 + 1);
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    r3 = 'a';
                    r4 = 'a';
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r4 > 'f') { $pc0 = 10; continue $sw0; }
                    DW[r4] = (byte) ((r4 - 'a') + 10);
                    r4 = (char) (r4 + 1);
                    { $pc0 = 9; continue $sw0; }
                }
                case 10: {
                    r5 = 'A';
                    r6 = 'A';
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r6 > 'F') { $pc0 = 13; continue $sw0; }
                    DW[r6] = (byte) ((r6 - 'A') + 10);
                    r6 = (char) (r6 + 1);
                    { $pc0 = 12; continue $sw0; }
                }
                case 13: {
                    FH = new byte[123];
                    FH[45] = 1;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r0 > '9') { $pc0 = 16; continue $sw0; }
                    FH[r0] = 1;
                    r0 = (char) (r0 + 1);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r5 > 'Z') { $pc0 = 18; continue $sw0; }
                    FH[r5] = 1;
                    r5 = (char) (r5 + 1);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r3 > 'z') { $pc0 = 19; continue $sw0; }
                    FH[r3] = 1;
                    r3 = (char) (r3 + 1);
                    { $pc0 = 18; continue $sw0; }
                }
                case 19: {
                    v5 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int DW(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r3.length;
                    if (r4 != 0) { $pc1 = 5; continue $sw1; }
                    r4 = r4 + 46;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r4 >= r0) { $pc1 = 11; continue $sw1; }
                    if (r3[r4] != 112) { $pc1 = 11; continue $sw1; }
                    r4 = r4 + 48;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return J0(r3, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int DW(byte[] r3, int r4, char r5) {
        int r0 = 0;
        int r1 = 0;
        char r6 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r3.length;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r4 >= r0) { $pc2 = 4; continue $sw2; }
                    r1 = r4 + 1;
                    r6 = r3[r4];
                    if (r6 == r5) { $pc2 = 11; continue $sw2; }
                    if (r6 == '\n') { $pc2 = 11; continue $sw2; }
                    r4 = r1;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r1;
                }
                case 4: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x001f -> B:18:0x0021). Please report as a decompilation issue!!! */
    public static final long DW(byte[] r7, int r8, abcd.EK r9) {
        long r0 = 0L;
        byte r2 = 0;
        int r3 = 0;
        byte r4 = 0;
        byte r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    r2 = 0;
                    try {
                        r3 = r7.length;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 29; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r8 >= r3) { $pc3 = 9; continue $sw3; }
                    if (r7[r8] != 32) { $pc3 = 9; continue $sw3; }
                    try {
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 29; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r8 < r3) { $pc3 = 11; continue $sw3; }
                    return 0;
                }
                case 11: {
                    try {
                        r4 = r7[r8];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 29; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 != 43) { $pc3 = 14; continue $sw3; }
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    try {
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 29; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (r8 >= r3) { $pc3 = 24; continue $sw3; }
                    try {
                        r5 = j6[r7[r8]];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 29; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 < 0) { $pc3 = 24; continue $sw3; }
                    r0 = (r0 * 10) + ((long) r5);
                    { $pc3 = 17; continue $sw3; }
                }
                case 14: {
                    if (r4 != 45) { $pc3 = 18; continue $sw3; }
                    r2 = -1;
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    if (r9 == null) { $pc3 = 26; continue $sw3; }
                    r9.j6 = r8;
                    $pc3 = 26; continue $sw3;
                }
                case 26: {
                    if (r2 < 0) { $pc3 = 28; continue $sw3; }
                    return r0;
                }
                case 28: {
                    return -r0;
                }
                case 29: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(java.nio.charset.Charset r0, byte[] r1, int r2, int r3) {
        java.nio.ByteBuffer r4 = null;
        java.nio.charset.Charset r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r4 = java.nio.ByteBuffer.wrap(r1, r2, r3 - r2);
                    r4.mark();
                    return j6(r4, abcd.hE.Zo);
                }
                case 5: {
                    r4.reset();
                    if (r0.equals(abcd.hE.Zo) == false) { $pc4 = 21; continue $sw4; }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    r5 = java.nio.charset.Charset.defaultCharset();
                    if (r5.equals(r0) == true) { $pc4 = 18; continue $sw4; }
                    if (r5.equals(abcd.hE.Zo) == true) { $pc4 = 18; continue $sw4; }
                    return j6(r4, r5);
                }
                case 16: {
                    r4.reset();
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    throw new java.nio.charset.CharacterCodingException();
                }
                case 21: {
                    return j6(r4, r0);
                }
                case 9: {
                    r4.reset();
                    { $pc4 = 10; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(byte[] r2, int r3, int r4) {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder(r4 - r3);
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r3 >= r4) { $pc5 = 5; continue $sw5; }
                    r0.append((char) (r2[r3] & 255));
                    r3 = r3 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 5: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.nio.charset.Charset DW(byte[] r3) {
        int r0 = 0;
        java.lang.String r4 = null;
        java.nio.charset.Charset r5 = null;
        java.nio.charset.Charset r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = Hw(r3, 0);
                    if (r0 < 0) { $pc6 = 5; continue $sw6; }
                    r4 = j6(abcd.hE.Zo, r3, r0, Zo(r3, r0) - 1);
                    return java.nio.charset.Charset.forName(r4);
                }
                case 14: {
                    e = $ex6;
                    r5 = j6(r4);
                    if (r5 == null) { $pc6 = 18; continue $sw6; }
                    return r5;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 9: {
                    e = $ex6;
                    r6 = j6(r4);
                    if (r6 == null) { $pc6 = 13; continue $sw6; }
                    return r6;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 5: {
                    return abcd.hE.Zo;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int EQ(byte[] r1, int r2) {
        int r3 = j6(r1, r2, null);
        int r4 = r3 % 100;
        return ((r3 / 100) * 60) + r4;
    }

    public static final int FH(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = r3.length;
                    if (r4 != 0) { $pc7 = 5; continue $sw7; }
                    r4 = r4 + 46;
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    if (r4 >= r0) { $pc7 = 10; continue $sw7; }
                    if (r3[r4] != 112) { $pc7 = 10; continue $sw7; }
                    r4 = r4 + 48;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r4 >= r0) { $pc7 = 15; continue $sw7; }
                    if (r3[r4] != 97) { $pc7 = 15; continue $sw7; }
                    r4 = Zo(r3, r4);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    return j6(r3, r4, abcd.wE.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int FH(byte[] r1, int r2, char r3) {
        int r0 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r2 != r1.length) { $pc8 = 5; continue $sw8; }
                    r2 = r2 - 1;
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    if (r2 < 0) { $pc8 = 6; continue $sw8; }
                    r0 = r2 - 1;
                    if (r1[r2] == r3) { $pc8 = 9; continue $sw8; }
                    r2 = r0;
                    { $pc8 = 5; continue $sw8; }
                }
                case 9: {
                    return r0;
                }
                case 6: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int FH(byte[] r3, int r4, int r5) {
        int r6 = 0;
        boolean r0 = false;
        int r7 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r5 != 0) { $pc9 = 5; continue $sw9; }
                    r6 = r4 - 1;
                    r3[r6] = 48;
                    return r6;
                }
                case 5: {
                    if (r5 >= 0) { $pc9 = 7; continue $sw9; }
                    r0 = true;
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    if (r0 == false) { $pc9 = 10; continue $sw9; }
                    r5 = -r5;
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (r5 == 0) { $pc9 = 11; continue $sw9; }
                    r4 = r4 - 1;
                    r3[r4] = v5[r5 % 10];
                    r5 = r5 / 10;
                    { $pc9 = 10; continue $sw9; }
                }
                case 11: {
                    if (r0 == false) { $pc9 = 17; continue $sw9; }
                    r7 = r4 - 1;
                    r3[r7] = 45;
                    return r7;
                }
                case 17: {
                    return r4;
                }
                case 7: {
                    r0 = false;
                    { $pc9 = 8; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int Hw(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = r3.length;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r4 >= r0) { $pc10 = 12; continue $sw10; }
                    if (r3[r4] == 10) { $pc10 = 7; continue $sw10; }
                    if (r3[r4] == 101) { $pc10 = 12; continue $sw10; }
                    r4 = Zo(r3, r4);
                    { $pc10 = 3; continue $sw10; }
                }
                case 7: {
                    return -1;
                }
                case 12: {
                    return j6(r3, r4, abcd.wE.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.CK Hw(byte[] r3, int r4, int r5) {
        abcd.CK r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new abcd.CK((r5 - r4) / 36);
                    r0.j6(1, Integer.MIN_VALUE);
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r4 >= r5) { $pc11 = 4; continue $sw11; }
                    r0.j6(r4);
                    r4 = Zo(r3, r4);
                    { $pc11 = 3; continue $sw11; }
                }
                case 4: {
                    r0.j6(r5);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int J0(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = r3.length;
                    if (r4 != 0) { $pc12 = 6; continue $sw12; }
                    r4 = r4 + 48;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (r4 >= r0) { $pc12 = 11; continue $sw12; }
                    if (r3[r4] == 10) { $pc12 = 11; continue $sw12; }
                    r4 = Zo(r3, r4);
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    if (r4 < r0) { $pc12 = 13; continue $sw12; }
                    return -1;
                }
                case 13: {
                    if (r3[r4] == 10) { $pc12 = 15; continue $sw12; }
                    return -1;
                }
                case 15: {
                    return r4 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int VH(byte[] r3, int r4) {
        byte[] r0 = null;
        int r1 = 0;
        int r5 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = DW;
                    r1 = ((((r0[r3[r4]] << 4) | r0[r3[r4 + 1]]) << 4) | r0[r3[r4 + 2]]) << 4;
                    r5 = r0[r3[r4 + 3]] | r1;
                    if (r5 < 0) { $pc13 = 6; continue $sw13; }
                    return r5;
                }
                case 6: {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int Zo(byte[] r1, int r2) {
        return j6(r1, r2, '\n');
    }

    public static final int gn(byte[] r3, int r4) {
        byte[] r0 = null;
        int r1 = 0;
        byte r5 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = DW;
                    r1 = (((((((((((r0[r3[r4]] << 4) | r0[r3[r4 + 1]]) << 4) | r0[r3[r4 + 2]]) << 4) | r0[r3[r4 + 3]]) << 4) | r0[r3[r4 + 4]]) << 4) | r0[r3[r4 + 5]]) << 4) | r0[r3[r4 + 6]];
                    r5 = r0[r3[r4 + 7]];
                    if (r1 < 0) { $pc14 = 8; continue $sw14; }
                    if (r5 < 0) { $pc14 = 8; continue $sw14; }
                    return r5 | (r1 << 4);
                }
                case 8: {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int j6(byte r1) {
        byte r2 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r2 = DW[r1];
                    if (r2 < 0) { $pc15 = 6; continue $sw15; }
                    return r2;
                }
                case 6: {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte[] r2, char r3, int r4) {
        java.lang.Throwable $ex16 = null;
        int $pc16 = 2;
        $sw16: while (true) {
            switch ($pc16) {
                case 2: {
                    if (r4 < 0) { $pc16 = 7; continue $sw16; }
                    if (r2[r4] != 32) { $pc16 = 7; continue $sw16; }
                    r4 = r4 - 1;
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    if (r4 < 0) { $pc16 = 12; continue $sw16; }
                    if (r2[r4] == r3) { $pc16 = 12; continue $sw16; }
                    r4 = r4 - 1;
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int j6(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = r3.length;
                    if (r4 != 0) { $pc17 = 5; continue $sw17; }
                    r4 = r4 + 46;
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    if (r4 >= r0) { $pc17 = 11; continue $sw17; }
                    if (r3[r4] != 112) { $pc17 = 11; continue $sw17; }
                    r4 = r4 + 48;
                    $pc17 = 11; continue $sw17;
                }
                case 11: {
                    return j6(r3, r4, abcd.wE.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int j6(byte[] r2, int r3, char r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = r2.length;
                    $pc18 = 3; continue $sw18;
                }
                case 3: {
                    if (r3 >= r0) { $pc18 = 4; continue $sw18; }
                    r1 = r3 + 1;
                    if (r2[r3] == r4) { $pc18 = 7; continue $sw18; }
                    r3 = r1;
                    { $pc18 = 3; continue $sw18; }
                }
                case 7: {
                    return r1;
                }
                case 4: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x002f -> B:18:0x001d). Please report as a decompilation issue!!! */
    public static final int j6(byte[] r5, int r6, abcd.EK r7) {
        int r0 = 0;
        int r1 = 0;
        byte r2 = 0;
        byte r3 = 0;
        byte r4 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = 0;
                    try {
                        r1 = r5.length;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc19 = 27; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r6 >= r1) { $pc19 = 9; continue $sw19; }
                    if (r5[r6] != 32) { $pc19 = 9; continue $sw19; }
                    try {
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc19 = 27; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc19 = 9; continue $sw19;
                }
                case 9: {
                    if (r6 < r1) { $pc19 = 11; continue $sw19; }
                    return 0;
                }
                case 11: {
                    try {
                        r2 = r5[r6];
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc19 = 27; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 != 43) { $pc19 = 15; continue $sw19; }
                    r6 = r6 + 1;
                    $pc19 = 20; continue $sw19;
                }
                case 20: {
                    r3 = 0;
                    $pc19 = 21; continue $sw19;
                }
                case 21: {
                    if (r6 < r1) { $pc19 = 36; continue $sw19; }
                    $pc19 = 28; continue $sw19;
                }
                case 28: {
                    if (r7 == null) { $pc19 = 30; continue $sw19; }
                    r7.j6 = r6;
                    $pc19 = 30; continue $sw19;
                }
                case 30: {
                    if (r3 < 0) { $pc19 = 32; continue $sw19; }
                    return r0;
                }
                case 32: {
                    return -r0;
                }
                case 36: {
                    try {
                        r4 = j6[r5[r6]];
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc19 = 33; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 < 0) { $pc19 = 28; continue $sw19; }
                    r0 = (r0 * 10) + r4;
                    $pc19 = 18; continue $sw19;
                }
                case 18: {
                    r6 = r6 + 1;
                    { $pc19 = 21; continue $sw19; }
                }
                case 15: {
                    if (r2 != 45) { $pc19 = 20; continue $sw19; }
                    r3 = -1;
                    throw new java.lang.IllegalStateException();
                }
                case 27: {
                    r3 = 0;
                    { $pc19 = 28; continue $sw19; }
                }
                case 33: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int j6(byte[] r4, int r5, byte[] r6) {
        int r0 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if ((r6.length + r5) <= r4.length) { $pc20 = 5; continue $sw20; }
                    return -1;
                }
                case 5: {
                    r0 = 0;
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (r0 >= r6.length) { $pc20 = 8; continue $sw20; }
                    if (r4[r5] != r6[r0]) { $pc20 = 11; continue $sw20; }
                    r0 = r0 + 1;
                    r5 = r5 + 1;
                    { $pc20 = 7; continue $sw20; }
                }
                case 11: {
                    return -1;
                }
                case 8: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.nio.ByteBuffer r1, java.nio.charset.Charset r2) {
        java.nio.charset.CharsetDecoder r3 = r2.newDecoder();
        r3.onMalformedInput(java.nio.charset.CodingErrorAction.REPORT);
        r3.onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT);
        return r3.decode(r1).toString();
    }

    public static java.lang.String j6(java.nio.charset.Charset r0, byte[] r1, int r2, int r3) {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    return DW(r0, r1, r2, r3);
                }
                case 5: {
                    return DW(r1, r2, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static java.lang.String j6(byte[] r1, int r2, int r3) {
        return j6(abcd.hE.Zo, r1, r2, r3);
    }

    private static java.nio.charset.Charset j6(java.lang.String r1) {
        return Hw.get(abcd.NK.Hw(r1));
    }

    public static abcd.KE tp(byte[] r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.String r6 = null;
        java.lang.String r12 = null;
        java.lang.String r5 = null;
        abcd.EK r13 = null;
        long r4 = 0L;
        int r9 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = Zo(r10, r11);
                    r1 = DW(r10, r11, '<');
                    r2 = DW(r10, r1, '>');
                    if (r2 >= r0) { $pc22 = 5; continue $sw22; }
                    r3 = j6(r10, r1, r2 - 1);
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    r6 = r3;
                    if (r1 >= r0) { $pc22 = 9; continue $sw22; }
                    r12 = j6(r10, r11, r1 - 2);
                    $pc22 = 10; continue $sw22;
                }
                case 10: {
                    r5 = r12;
                    r13 = new abcd.EK();
                    if (r2 >= r0) { $pc22 = 13; continue $sw22; }
                    r4 = DW(r10, r2 + 1, r13);
                    r9 = EQ(r10, r13.j6);
                    $pc22 = 15; continue $sw22;
                }
                case 15: {
                    return new abcd.KE(r5, r6, r4 * 1000, r9);
                }
                case 13: {
                    r4 = 0;
                    r9 = 0;
                    { $pc22 = 15; continue $sw22; }
                }
                case 9: {
                    r12 = j6(r10, r11, r0);
                    { $pc22 = 10; continue $sw22; }
                }
                case 5: {
                    r3 = "invalid";
                    { $pc22 = 6; continue $sw22; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.KE u7(byte[] r12, int r13) {
        java.nio.charset.Charset r0 = null;
        int r1 = 0;
        int r3 = 0;
        int r2 = 0;
        java.lang.String r7 = null;
        int r14 = 0;
        java.lang.String r8 = null;
        int r15 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = DW(r12);
                    r1 = DW(r12, r13, '<');
                    r3 = DW(r12, r1, '>');
                    if (r1 < r12.length) { $pc23 = 5; continue $sw23; }
                    $pc23 = 27; continue $sw23;
                }
                case 27: {
                    return null;
                }
                case 5: {
                    if (r12[r1] == 10) { $pc23 = 27; continue $sw23; }
                    if (r3 >= (r12.length - 1)) { $pc23 = 9; continue $sw23; }
                    $pc23 = 11; continue $sw23;
                }
                case 11: {
                    r2 = r1 - 2;
                    if (r2 >= r13) { $pc23 = 14; continue $sw23; }
                    $pc23 = 16; continue $sw23;
                }
                case 16: {
                    r2 = r1 - 1;
                    $pc23 = 17; continue $sw23;
                }
                case 17: {
                    r7 = j6(r0, r12, r13, r2);
                    r14 = r3 - 1;
                    r8 = j6(r0, r12, r1, r14);
                    r15 = j6(r12, ' ', Zo(r12, r14) - 2) + 1;
                    if (r15 <= r3) { $pc23 = 20; continue $sw23; }
                    r4 = r15 - 1;
                    r5 = java.lang.Math.max(r3, j6(r12, ' ', r4) + 1);
                    if (r5 < r4) { $pc23 = 26; continue $sw23; }
                    return new abcd.KE(r7, r8, 0, 0);
                }
                case 26: {
                    return new abcd.KE(r7, r8, DW(r12, r5, null) * 1000, EQ(r12, r15));
                }
                case 20: {
                    return new abcd.KE(r7, r8, 0, 0);
                }
                case 14: {
                    if (r12[r2] != 32) { $pc23 = 16; continue $sw23; }
                    $pc23 = 9; continue $sw23;
                }
                case 9: {
                    if (r12[r3 - 1] == 62) { $pc23 = 11; continue $sw23; }
                    { $pc23 = 11; continue $sw23; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int v5(byte[] r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = r4.length;
                    r1 = r5;
                    $pc24 = 4; continue $sw24;
                }
                case 4: {
                    if (r1 >= r0) { $pc24 = 9; continue $sw24; }
                    if (r4[r1] == 10) { $pc24 = 9; continue $sw24; }
                    r1 = Zo(r4, r1);
                    $pc24 = 9; continue $sw24;
                }
                case 9: {
                    if (r1 <= 0) { $pc24 = 15; continue $sw24; }
                    if (r5 >= r1) { $pc24 = 15; continue $sw24; }
                    if (r4[r1 - 1] != 10) { $pc24 = 15; continue $sw24; }
                    r1 = r1 - 1;
                    $pc24 = 15; continue $sw24;
                }
                case 15: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final int we(byte[] r1, int r2) {
        return FH(r1, r2, '\n');
    }
}
