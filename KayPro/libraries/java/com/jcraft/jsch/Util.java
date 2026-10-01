package com.jcraft.jsch;

class Util {
    private static java.lang.String[] DW;
    static final byte[] FH = null;
    private static final byte[] j6 = null;

    static {
        j6 = FH("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
        DW = new java.lang.String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        FH = FH("");
    }

    Util() {
    }

    private static byte DW(byte r4) {
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != 61) { $pc0 = 5; continue $sw0; }
                    return 0;
                }
                case 5: {
                    r1 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = j6;
                    if (r1 >= r2.length) { $pc0 = 8; continue $sw0; }
                    if (r4 == r2[r1]) { $pc0 = 12; continue $sw0; }
                    r1 = r1 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 12: {
                    return (byte) r1;
                }
                case 8: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(byte[] r3) {
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 4; continue $sw1; }
                    return;
                }
                case 4: {
                    r1 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r1 >= r3.length) { $pc1 = 7; continue $sw1; }
                    r3[r1] = 0;
                    r1 = r1 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(byte[] r3, int r4, byte[] r5, int r6) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5.length <= 0) { $pc2 = 19; continue $sw2; }
                    if (r5[0] != 46) { $pc2 = 19; continue $sw2; }
                    if (r3.length > 0) { $pc2 = 9; continue $sw2; }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    return false;
                }
                case 9: {
                    if (r3[0] != 46) { $pc2 = 17; continue $sw2; }
                    if (r3.length != 2) { $pc2 = 16; continue $sw2; }
                    if (r3[1] != 42) { $pc2 = 16; continue $sw2; }
                    return true;
                }
                case 16: {
                    return j6(r3, r4 + 1, r5, r6 + 1);
                }
                case 19: {
                    return j6(r3, r4, r5, r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean DW(byte[] r1, byte[] r2) {
        return DW(r1, 0, r2, 0);
    }

    static byte[] DW(java.lang.String r4) {
        java.lang.String r5 = null;
        java.io.File r0 = null;
        java.io.FileInputStream r1 = null;
        byte[] r6 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r5 = j6(r4);
                    r0 = new java.io.File(r5);
                    r1 = new java.io.FileInputStream(r5);
                    try {
                        r6 = new byte[(int) r0.length()];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    r2 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    try {
                        r3 = r1.read(r6, r2, r6.length - r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    if (r3 <= 0) { $pc3 = 6; continue $sw3; }
                    r2 = r2 + r3;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    r1.close();
                    return r6;
                }
                case 10: {
                    th = $ex3;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] DW(java.lang.String r0, java.lang.String r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r0 != null) { $pc4 = 9; continue $sw4; }
                    return null;
                }
                case 9: {
                    return r0.getBytes(r1);
                }
                case 8: {
                    return r0.getBytes();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] DW(byte[] r9, int r10, int r11) {
        byte[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r4 = 0;
        int r6 = 0;
        byte[] r12 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r0 = new byte[r11];
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = r10;
                    r3 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r2 >= (r10 + r11)) { $pc5 = 12; continue $sw5; }
                    try {
                        r5 = r2 + 1;
                        r0[r3] = (byte) ((DW(r9[r2]) << 2) | ((DW(r9[r5]) & 48) >>> 4));
                        r4 = r2 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9[r4] == 61) { $pc5 = 8; continue $sw5; }
                    try {
                        r0[r3 + 1] = (byte) (((DW(r9[r5]) & 15) << 4) | ((DW(r9[r4]) & 60) >>> 2));
                        r6 = r2 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9[r6] == 61) { $pc5 = 11; continue $sw5; }
                    try {
                        r0[r3 + 2] = (byte) (((DW(r9[r4]) & 3) << 6) | (DW(r9[r6]) & 63));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = r3 + 3;
                    r2 = r2 + 4;
                    { $pc5 = 4; continue $sw5; }
                }
                case 11: {
                    try {
                        r3 = r3 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 12; continue $sw5; }
                }
                case 8: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    try {
                        r12 = new byte[r3];
                        java.lang.System.arraycopy(r0, 0, r12, 0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc5 = 16; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r12;
                }
                case 16: {
                    e = $ex5;
                    throw new com.jcraft.jsch.JSchException("fromBase64: invalid base64 data", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String FH(byte[] r6) {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.StringBuilder r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    r1 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r1 >= r6.length) { $pc6 = 6; continue $sw6; }
                    r2 = java.lang.Integer.toHexString(r6[r1] & 255);
                    r3 = new java.lang.StringBuilder("0x");
                    if (r2.length() != 1) { $pc6 = 10; continue $sw6; }
                    r4 = "0";
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    r3.append(r4);
                    r3.append(r2);
                    r0.append(r3.toString());
                    r1 = r1 + 1;
                    if (r1 >= r6.length) { $pc6 = 4; continue $sw6; }
                    r0.append(":");
                    { $pc6 = 4; continue $sw6; }
                }
                case 10: {
                    r4 = "";
                    { $pc6 = 11; continue $sw6; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] FH(java.lang.String r1) {
        return DW(r1, "UTF-8");
    }

    static byte[] FH(byte[] r10, int r11, int r12) {
        byte[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r6 = 0;
        int r7 = 0;
        byte[] r8 = null;
        int r9 = 0;
        int r5 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r2 = 0;
        byte[] r20 = null;
        int r110 = 0;
        int r111 = 0;
        byte[] r112 = null;
        int r113 = 0;
        int r21 = 0;
        byte[] r22 = null;
        int r114 = 0;
        int r23 = 0;
        int r115 = 0;
        int r24 = 0;
        int r116 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new byte[r12 * 2];
                    r1 = ((r12 / 3) * 3) + r11;
                    r3 = r11;
                    r4 = 0;
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r3 >= r1) { $pc7 = 5; continue $sw7; }
                    r6 = (r10[r3] >>> 2) & 63;
                    r7 = r4 + 1;
                    r8 = j6;
                    r0[r4] = r8[r6];
                    r9 = r3 + 1;
                    r5 = ((r10[r3] & 3) << 4) | ((r10[r9] >>> 4) & 15);
                    r13 = r7 + 1;
                    r0[r7] = r8[r5];
                    r14 = r3 + 2;
                    r15 = ((r10[r9] & 15) << 2) | ((r10[r14] >>> 6) & 3);
                    r16 = r13 + 1;
                    r0[r13] = r8[r15];
                    r17 = r10[r14] & 63;
                    r0[r16] = r8[r17];
                    r3 = r3 + 3;
                    r4 = r16 + 1;
                    { $pc7 = 4; continue $sw7; }
                }
                case 5: {
                    r18 = (r11 + r12) - r1;
                    if (r18 != 1) { $pc7 = 8; continue $sw7; }
                    r19 = (r10[r3] >>> 2) & 63;
                    r2 = r4 + 1;
                    r20 = j6;
                    r0[r4] = r20[r19];
                    r110 = r2 + 1;
                    r0[r2] = r20[((r10[r3] & 3) << 4) & 63];
                    r111 = r110 + 1;
                    r0[r110] = 61;
                    r4 = r111 + 1;
                    r0[r111] = 61;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r112 = new byte[r4];
                    java.lang.System.arraycopy(r0, 0, r112, 0, r4);
                    return r112;
                }
                case 8: {
                    if (r18 != 2) { $pc7 = 10; continue $sw7; }
                    r113 = (r10[r3] >>> 2) & 63;
                    r21 = r4 + 1;
                    r22 = j6;
                    r0[r4] = r22[r113];
                    r114 = (r10[r3] & 3) << 4;
                    r23 = r3 + 1;
                    r115 = r114 | ((r10[r23] >>> 4) & 15);
                    r24 = r21 + 1;
                    r0[r21] = r22[r115];
                    r116 = r24 + 1;
                    r0[r24] = r22[((r10[r23] & 15) << 2) & 63];
                    r4 = r116 + 1;
                    r0[r116] = 61;
                    { $pc7 = 10; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String Hw(java.lang.String r3) {
        byte[] r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = FH(r3);
                    r1 = Hw(r0);
                    if (r0.length != r1.length) { $pc8 = 6; continue $sw8; }
                    return r3;
                }
                case 6: {
                    return j6(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] Hw(byte[] r5) {
        int r2 = 0;
        int r0 = 0;
        int r3 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = r5.length;
                    r0 = 0;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r0 >= r2) { $pc9 = 10; continue $sw9; }
                    if (r5[r0] == 92) { $pc9 = 7; continue $sw9; }
                    r0 = r0 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 7: {
                    r3 = r0 + 1;
                    if (r3 == r2) { $pc9 = 10; continue $sw9; }
                    java.lang.System.arraycopy(r5, r3, r5, r0, r5.length - r3);
                    r2 = r2 - 1;
                    r0 = r3;
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (r2 != r5.length) { $pc9 = 12; continue $sw9; }
                    return r5;
                }
                case 12: {
                    r1 = new byte[r2];
                    java.lang.System.arraycopy(r5, 0, r1, 0, r2);
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte r3) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (((byte) (r3 & 128)) != 0) { $pc10 = 6; continue $sw10; }
                    return 1;
                }
                case 6: {
                    if (((byte) (r3 & 224)) != (-64)) { $pc10 = 10; continue $sw10; }
                    return 2;
                }
                case 10: {
                    if (((byte) (r3 & 240)) != (-32)) { $pc10 = 13; continue $sw10; }
                    return 3;
                }
                case 13: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(com.jcraft.jsch.HASH r4, byte[] r5) {
        int r1 = 0;
        byte[] r6 = null;
        java.lang.StringBuffer r7 = null;
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        r4.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = 0;
                    try {
                        r4.update(r5, 0, r5.length);
                        r6 = r4.FH();
                        r7 = new java.lang.StringBuffer();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r1 >= r6.length) { $pc11 = 5; continue $sw11; }
                    try {
                        r0 = r6[r1] & 255;
                        r7.append(DW[(r0 >>> 4) & 15]);
                        r7.append(DW[r0 & 15]);
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 >= r6.length) { $pc11 = 4; continue $sw11; }
                    try {
                        r7.append(":");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc11 = 4; continue $sw11; }
                }
                case 5: {
                    return r7.toString();
                }
                case 11: {
                    return "???";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(java.lang.String r2) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r2.startsWith("~") == false) { $pc12 = 10; continue $sw12; }
                    return r2.replace("~", java.lang.System.getProperty("user.home"));
                }
                case 10: {
                    return r2;
                }
                case 11: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(java.lang.String r7, java.lang.String[] r8) {
        java.lang.String[] r9 = null;
        java.lang.String r3 = null;
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r9 = j6(r7, ",");
                    r3 = null;
                    r2 = 0;
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r2 >= r9.length) { $pc13 = 5; continue $sw13; }
                    r4 = 0;
                    $pc13 = 8; continue $sw13;
                }
                case 8: {
                    if (r4 >= r8.length) { $pc13 = 9; continue $sw13; }
                    if (r9[r2].equals(r8[r4]) == true) { $pc13 = 14; continue $sw13; }
                    r4 = r4 + 1;
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    r2 = r2 + 1;
                    { $pc13 = 4; continue $sw13; }
                }
                case 9: {
                    if (r3 != null) { $pc13 = 11; continue $sw13; }
                    r3 = r9[r2];
                    { $pc13 = 14; continue $sw13; }
                }
                case 11: {
                    r3 = java.lang.String.valueOf(r3) + "," + r9[r2];
                    { $pc13 = 14; continue $sw13; }
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(byte[] r3) {
        return j6(r3, 0, r3.length, "UTF-8");
    }

    static java.lang.String j6(byte[] r1, int r2, int r3) {
        return j6(r1, r2, r3, "UTF-8");
    }

    static java.lang.String j6(byte[] r1, int r2, int r3, java.lang.String r4) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    return new java.lang.String(r1, r2, r3, r4);
                }
                case 5: {
                    return new java.lang.String(r1, r2, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(byte[] r2, java.lang.String r3) {
        return j6(r2, 0, r2.length, r3);
    }

    static java.net.Socket j6(final java.lang.String r4, final int r5, int r6) {
        java.net.Socket[] r1 = null;
        java.lang.Exception[] r0 = null;
        java.lang.Thread r2 = null;
        java.lang.String r7 = null;
        java.lang.String r8 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (r6 == 0) { $pc15 = 23; continue $sw15; }
                    r1 = new java.net.Socket[1];
                    r0 = new java.lang.Exception[1];
                    r2 = new java.lang.Thread(new com.jcraft.jsch.Util.AnonymousClass1(r1, r4, r5, r0));
                    r2.setName("Opening Socket " + r4);
                    r2.start();
                    try {
                        r2.join(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc15 = 11; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = "timeout: ";
                    $pc15 = 13; continue $sw15;
                }
                case 13: {
                    if (r1[0] != null) { $pc15 = 15; continue $sw15; }
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    r8 = r7 + "socket is not established";
                    if (r0[0] == null) { $pc15 = 21; continue $sw15; }
                    r8 = r0[0].toString();
                    $pc15 = 21; continue $sw15;
                }
                case 21: {
                    r2.interrupt();
                    throw new com.jcraft.jsch.JSchException(r8, r0[0]);
                }
                case 15: {
                    if (r1[0].isConnected() == false) { $pc15 = 18; continue $sw15; }
                    return r1[0];
                }
                case 11: {
                    r7 = "";
                    { $pc15 = 13; continue $sw15; }
                }
                case 23: {
                    return new java.net.Socket(r4, r5);
                }
                case 5: {
                    e = $ex15;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r9, int r10, byte[] r11, int r12) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        byte r8 = 0;
        int r13 = 0;
        byte r1 = 0;
        int r14 = 0;
        int r15 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = r9.length;
                    if (r0 != 0) { $pc16 = 5; continue $sw16; }
                    return false;
                }
                case 5: {
                    r2 = r11.length;
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    if (r10 >= r0) { $pc16 = 71; continue $sw16; }
                    if (r12 >= r2) { $pc16 = 71; continue $sw16; }
                    if (r9[r10] == 92) { $pc16 = 12; continue $sw16; }
                    if (r9[r10] == 42) { $pc16 = 21; continue $sw16; }
                    if (r9[r10] == 63) { $pc16 = 60; continue $sw16; }
                    if (r9[r10] != r11[r12]) { $pc16 = 64; continue $sw16; }
                    r10 = r10 + j6(r9[r10]);
                    r12 = r12 + j6(r11[r12]);
                    if (r12 < r2) { $pc16 = 7; continue $sw16; }
                    if (r10 >= r0) { $pc16 = 68; continue $sw16; }
                    if (r9[r10] != 42) { $pc16 = 7; continue $sw16; }
                    $pc16 = 68; continue $sw16;
                }
                case 68: {
                    return true;
                }
                case 64: {
                    return false;
                }
                case 60: {
                    r10 = r10 + 1;
                    r3 = j6(r11[r12]);
                    $pc16 = 61; continue $sw16;
                }
                case 61: {
                    r12 = r12 + r3;
                    { $pc16 = 7; continue $sw16; }
                }
                case 21: {
                    r5 = r10;
                    $pc16 = 22; continue $sw16;
                }
                case 22: {
                    if (r5 >= r0) { $pc16 = 27; continue $sw16; }
                    if (r9[r5] != 42) { $pc16 = 27; continue $sw16; }
                    r5 = r5 + 1;
                    $pc16 = 27; continue $sw16;
                }
                case 27: {
                    if (r0 != r5) { $pc16 = 29; continue $sw16; }
                    return true;
                }
                case 29: {
                    r8 = r9[r5];
                    if (r8 != 63) { $pc16 = 37; continue $sw16; }
                    $pc16 = 31; continue $sw16;
                }
                case 31: {
                    if (r12 >= r2) { $pc16 = 32; continue $sw16; }
                    if (j6(r9, r5, r11, r12) == true) { $pc16 = 35; continue $sw16; }
                    r12 = r12 + j6(r11[r12]);
                    { $pc16 = 31; continue $sw16; }
                }
                case 35: {
                    return true;
                }
                case 32: {
                    return false;
                }
                case 37: {
                    if (r8 != 92) { $pc16 = 50; continue $sw16; }
                    r13 = r5 + 1;
                    if (r13 != r0) { $pc16 = 41; continue $sw16; }
                    return false;
                }
                case 41: {
                    r1 = r9[r13];
                    $pc16 = 42; continue $sw16;
                }
                case 42: {
                    if (r12 >= r2) { $pc16 = 43; continue $sw16; }
                    if (r1 != r11[r12]) { $pc16 = 49; continue $sw16; }
                    if (j6(r9, j6(r1) + r13, r11, j6(r11[r12]) + r12) == false) { $pc16 = 49; continue $sw16; }
                    return true;
                }
                case 49: {
                    r12 = r12 + j6(r11[r12]);
                    { $pc16 = 42; continue $sw16; }
                }
                case 43: {
                    return false;
                }
                case 50: {
                    if (r12 >= r2) { $pc16 = 51; continue $sw16; }
                    if (r8 != r11[r12]) { $pc16 = 57; continue $sw16; }
                    if (j6(r9, r5, r11, r12) == false) { $pc16 = 57; continue $sw16; }
                    return true;
                }
                case 57: {
                    r12 = r12 + j6(r11[r12]);
                    { $pc16 = 50; continue $sw16; }
                }
                case 51: {
                    return false;
                }
                case 12: {
                    r14 = r10 + 1;
                    if (r14 == r0) { $pc16 = 14; continue $sw16; }
                    if (r9[r14] != r11[r12]) { $pc16 = 17; continue $sw16; }
                    r10 = r14 + j6(r9[r14]);
                    r3 = j6(r11[r12]);
                    { $pc16 = 61; continue $sw16; }
                }
                case 17: {
                    return false;
                }
                case 14: {
                    return false;
                }
                case 71: {
                    if (r10 != r0) { $pc16 = 74; continue $sw16; }
                    if (r12 != r2) { $pc16 = 74; continue $sw16; }
                    return true;
                }
                case 74: {
                    if (r12 >= r2) { $pc16 = 76; continue $sw16; }
                    $pc16 = 83; continue $sw16;
                }
                case 83: {
                    return false;
                }
                case 76: {
                    if (r9[r10] != 42) { $pc16 = 83; continue $sw16; }
                    $pc16 = 77; continue $sw16;
                }
                case 77: {
                    if (r10 >= r0) { $pc16 = 78; continue $sw16; }
                    r15 = r10 + 1;
                    if (r9[r10] != 42) { $pc16 = 114; continue $sw16; }
                    r10 = r15;
                    { $pc16 = 77; continue $sw16; }
                }
                case 114: {
                    return false;
                }
                case 78: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(byte[] r5, byte[] r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = r5.length;
                    if (r0 == r6.length) { $pc17 = 5; continue $sw17; }
                    return false;
                }
                case 5: {
                    r1 = 0;
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r1 >= r0) { $pc17 = 7; continue $sw17; }
                    if (r5[r1] != r6[r1]) { $pc17 = 11; continue $sw17; }
                    r1 = r1 + 1;
                    { $pc17 = 6; continue $sw17; }
                }
                case 11: {
                    return false;
                }
                case 7: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String[] j6(java.lang.String r6, java.lang.String r7) {
        byte[] r0 = null;
        java.util.Vector r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.String[] r8 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (r6 != null) { $pc18 = 5; continue $sw18; }
                    return null;
                }
                case 5: {
                    r0 = FH(r6);
                    r1 = new java.util.Vector();
                    r2 = 0;
                    r3 = 0;
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    r4 = r6.indexOf(r7, r3);
                    if (r4 < 0) { $pc18 = 9; continue $sw18; }
                    r1.addElement(j6(r0, r3, r4 - r3));
                    r3 = r4 + 1;
                    { $pc18 = 6; continue $sw18; }
                }
                case 9: {
                    r1.addElement(j6(r0, r3, r0.length - r3));
                    r8 = new java.lang.String[r1.size()];
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    if (r2 >= r8.length) { $pc18 = 12; continue $sw18; }
                    r8[r2] = (java.lang.String) r1.elementAt(r2);
                    r2 = r2 + 1;
                    { $pc18 = 11; continue $sw18; }
                }
                case 12: {
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
