package com.aide.common;

@abcd.Interfacexu
public class ClassJ {

    @abcd.Interfaceru(field = 2232362214247671792L)
    private static final char[] DW = null;

    @abcd.Interfaceru(field = 2232468409789294999L)
    private static final byte[] FH = null;

    @abcd.Interfacetu
    private static boolean Hw;

    @abcd.Interfaceru(field = -2038483916975259315L)
    private static final java.lang.String j6 = null;

    @abcd.Interfaceuu
    private static boolean v5;

    static {
        char r4 = 0;
        int r5 = 0;
        int r6 = 0;
        char r7 = 0;
        char r8 = 0;
        char[] r9 = null;
        int r10 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.common.ClassJ.class, 3652670998646084835L, 3652670998646084835L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    if (Hw == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(817984480114782529L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = java.lang.System.getProperty("line.separator");
                        DW = new char[64];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    r4 = 'A';
                    r5 = 0;
                    r6 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r4 > 'Z') { $pc0 = 10; continue $sw0; }
                    try {
                        DW[r6] = r4;
                        r4 = (char) (r4 + 1);
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    r7 = 'a';
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r7 > 'z') { $pc0 = 14; continue $sw0; }
                    try {
                        DW[r6] = r7;
                        r7 = (char) (r7 + 1);
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    { $pc0 = 12; continue $sw0; }
                }
                case 14: {
                    r8 = '0';
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r8 > '9') { $pc0 = 18; continue $sw0; }
                    try {
                        DW[r6] = r8;
                        r8 = (char) (r8 + 1);
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    { $pc0 = 16; continue $sw0; }
                }
                case 18: {
                    try {
                        DW[r6] = '+';
                        r9 = DW;
                        r9[r6 + 1] = '/';
                        FH = new byte[128];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    r10 = 0;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r10 >= FH.length) { $pc0 = 22; continue $sw0; }
                    try {
                        FH[r10] = -1;
                        r10 = r10 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (r5 >= 64) { $pc0 = 25; continue $sw0; }
                    try {
                        FH[DW[r5]] = (byte) r5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    r5 = r5 + 1;
                    { $pc0 = 22; continue $sw0; }
                }
                case 25: {
                    return;
                }
                case 26: {
                    th = $ex0;
                    if (v5 == false) { $pc0 = 31; continue $sw0; }
                    abcd.wu.j6(th, 817984480114782529L, null);
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -486250662208906560L)
    private ClassJ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (v5 == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 3560877588869042785L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3560877588869042785L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (v5 == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 144228122012975121L, null, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(144228122012975121L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return j6(r5.toCharArray());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(char[] r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (v5 == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -580864727814534699L, null, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-580864727814534699L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return j6(r5, 0, r5.length);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(char[] r12, int r13, int r14) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        char r6 = 0;
        int r7 = 0;
        char r8 = 0;
        char r9 = 0;
        int r10 = 0;
        char r11 = 0;
        int r15 = 0;
        char r16 = 0;
        byte r17 = 0;
        byte r18 = 0;
        byte r19 = 0;
        byte r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 45: {
                    th = $ex4;
                    if (v5 == false) { $pc4 = 50; continue $sw4; }
                    abcd.wu.j6(th, -1329082667528528781L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
                    $pc4 = 50; continue $sw4;
                }
                case 50: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1329082667528528781L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if ((r14 % 4) != 0) { $pc4 = 44; continue $sw4; }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r14 <= 0) { $pc4 = 11; continue $sw4; }
                    if (r12[(r13 + r14) - 1] != '=') { $pc4 = 11; continue $sw4; }
                    try {
                        r14 = r14 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    try {
                        r0 = (r14 * 3) / 4;
                        r1 = new byte[r0];
                        r2 = r13 + r14;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    r3 = r13;
                    r4 = 0;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    if (r3 >= r2) { $pc4 = 42; continue $sw4; }
                    try {
                        r5 = r3 + 1;
                        r6 = r12[r3];
                        r7 = r5 + 1;
                        r8 = r12[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    r9 = 'A';
                    if (r7 >= r2) { $pc4 = 16; continue $sw4; }
                    try {
                        r10 = r7 + 1;
                        r11 = r12[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    if (r10 >= r2) { $pc4 = 21; continue $sw4; }
                    try {
                        r15 = r10 + 1;
                        r16 = r12[r10];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    r10 = r15;
                    r9 = r16;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    if (r6 > 127) { $pc4 = 41; continue $sw4; }
                    if (r8 > 127) { $pc4 = 41; continue $sw4; }
                    if (r11 > 127) { $pc4 = 41; continue $sw4; }
                    if (r9 > 127) { $pc4 = 41; continue $sw4; }
                    try {
                        r17 = FH[r6];
                        r18 = FH[r8];
                        r19 = FH[r11];
                        r20 = FH[r9];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r17 < 0) { $pc4 = 39; continue $sw4; }
                    if (r18 < 0) { $pc4 = 39; continue $sw4; }
                    if (r19 < 0) { $pc4 = 39; continue $sw4; }
                    if (r20 < 0) { $pc4 = 39; continue $sw4; }
                    try {
                        r21 = (r17 << 2) | (r18 >>> 4);
                        r22 = ((r18 & 15) << 4) | (r19 >>> 2);
                        r23 = ((r19 & 3) << 6) | r20;
                        r24 = r4 + 1;
                        r1[r4] = (byte) r21;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r24 >= r0) { $pc4 = 33; continue $sw4; }
                    try {
                        r25 = r24 + 1;
                        r1[r24] = (byte) r22;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 34; continue $sw4;
                }
                case 34: {
                    if (r25 >= r0) { $pc4 = 36; continue $sw4; }
                    try {
                        r4 = r25 + 1;
                        r1[r25] = (byte) r23;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 37; continue $sw4;
                }
                case 37: {
                    r3 = r10;
                    { $pc4 = 12; continue $sw4; }
                }
                case 36: {
                    r4 = r25;
                    { $pc4 = 37; continue $sw4; }
                }
                case 33: {
                    r25 = r24;
                    $pc4 = 39; continue $sw4;
                }
                case 39: {
                    try {
                        throw new java.lang.IllegalArgumentException("Illegal character in Base64 encoded data.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                }
                case 41: {
                    try {
                        throw new java.lang.IllegalArgumentException("Illegal character in Base64 encoded data.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                }
                case 16: {
                    r10 = r7;
                    r11 = 'A';
                    { $pc4 = 17; continue $sw4; }
                }
                case 42: {
                    return r1;
                }
                case 44: {
                    try {
                        throw new java.lang.IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static char[] j6(byte[] r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (v5 == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -11316083948896048L, null, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-11316083948896048L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return j6(r5, 0, r5.length);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static char[] j6(byte[] r12, int r13, int r14) {
        int r0 = 0;
        char[] r1 = null;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        char r21 = 0;
        char r22 = 0;
        int r23 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 24: {
                    th = $ex6;
                    if (v5 == false) { $pc6 = 29; continue $sw6; }
                    abcd.wu.j6(th, 77141844226625856L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
                    $pc6 = 29; continue $sw6;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(77141844226625856L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        r0 = ((r14 * 4) + 2) / 3;
                        r1 = new char[((r14 + 2) / 3) * 4];
                        r2 = r13 + r14;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    r4 = r13;
                    r5 = 0;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r4 >= r2) { $pc6 = 23; continue $sw6; }
                    try {
                        r6 = r4 + 1;
                        r7 = r12[r4] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    if (r6 >= r2) { $pc6 = 10; continue $sw6; }
                    try {
                        r8 = r6 + 1;
                        r9 = r12[r6] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r8 >= r2) { $pc6 = 13; continue $sw6; }
                    try {
                        r10 = r8 + 1;
                        r11 = r12[r8] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    try {
                        r15 = r7 >>> 2;
                        r16 = ((r7 & 3) << 4) | (r9 >>> 4);
                        r17 = ((r9 & 15) << 2) | (r11 >>> 6);
                        r18 = r11 & 63;
                        r19 = r5 + 1;
                        r1[r5] = DW[r15];
                        r20 = r19 + 1;
                        r1[r19] = DW[r16];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    r21 = '=';
                    if (r20 >= r0) { $pc6 = 17; continue $sw6; }
                    try {
                        r22 = DW[r17];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    try {
                        r1[r20] = r22;
                        r23 = r20 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    if (r23 >= r0) { $pc6 = 21; continue $sw6; }
                    try {
                        r21 = DW[r18];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    try {
                        r1[r23] = r21;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    r5 = r23 + 1;
                    r4 = r10;
                    { $pc6 = 6; continue $sw6; }
                }
                case 17: {
                    r22 = '=';
                    { $pc6 = 18; continue $sw6; }
                }
                case 13: {
                    r10 = r8;
                    r11 = 0;
                    { $pc6 = 14; continue $sw6; }
                }
                case 10: {
                    r8 = r6;
                    r9 = 0;
                    { $pc6 = 11; continue $sw6; }
                }
                case 23: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
