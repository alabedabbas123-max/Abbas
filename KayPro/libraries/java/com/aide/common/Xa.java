package com.aide.common;

@abcd.Interfacexu
public class Xa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.Xa.class, -711442613965315275L, -711442613965315275L);
    }

    public Xa() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5202972984187072409L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5202972984187072409L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(java.io.InputStream r7, byte[] r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -7482175249959446385L, null, r7, r8);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-7482175249959446385L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return j6(r7, r8, 0, r8.length);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(java.io.InputStream r9, byte[] r10, int r11, int r12) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 16: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 21; continue $sw2; }
                    abcd.wu.j6(th, 2497325975796263005L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(2497325975796263005L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r0 >= r12) { $pc2 = 15; continue $sw2; }
                    try {
                        r1 = r9.read(r10, r11 + r0, r12 - r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 16; continue $sw2;
                    }
                    if (r1 == (-1)) { $pc2 = 10; continue $sw2; }
                    r0 = r0 + r1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 10: {
                    if (r0 > 0) { $pc2 = 27; continue $sw2; }
                    return -1;
                }
                case 27: {
                    return r0;
                }
                case 15: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.io.InputStream r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 370504340859600000L, null, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(370504340859600000L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return j6(new java.io.InputStreamReader(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.io.Reader r8) {
        java.io.BufferedReader r3 = null;
        java.lang.StringBuilder r4 = null;
        char[] r5 = null;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, 698705286827615665L, null, r8);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(698705286827615665L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r3 = new java.io.BufferedReader(r8);
                        r4 = new java.lang.StringBuilder();
                        r5 = new char[8192];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    try {
                        r6 = r3.read(r5, 0, r5.length);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    if (r6 <= 0) { $pc4 = 10; continue $sw4; }
                    try {
                        r4.append(r5, 0, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    { $pc4 = 7; continue $sw4; }
                }
                case 10: {
                    return r4.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r7, java.io.OutputStream r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, 6971637334206136032L, null, r7, r8);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(6971637334206136032L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        j6(r7, r8, true);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r8, java.io.OutputStream r9, boolean r10) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 23: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 28; continue $sw6; }
                    abcd.wu.j6(th, 1437261948199776069L, null, r8, r9, new java.lang.Boolean(r10));
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(1437261948199776069L, null, r8, r9, new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        r0 = new byte[4096];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    $pc6 = 31; continue $sw6;
                }
                case 31: {
                    try {
                        r1 = r8.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    if (r1 == (-1)) { $pc6 = 10; continue $sw6; }
                    try {
                        r9.write(r0, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r10 == false) { $pc6 = 12; continue $sw6; }
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    if (r10 == false) { $pc6 = 35; continue $sw6; }
                    try {
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    return;
                }
                case 35: {
                    return;
                }
                case 19: {
                    th = $ex6;
                    if (r10 == false) { $pc6 = 22; continue $sw6; }
                    try {
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                }
                case 15: {
                    th = $ex6;
                    if (r10 == false) { $pc6 = 18; continue $sw6; }
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.Reader r7, java.io.Writer r8) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 19: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 24; continue $sw7; }
                    abcd.wu.j6(th, -8207949121622678776L, null, r7, r8);
                    $pc7 = 24; continue $sw7;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(-8207949121622678776L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 19; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r0 = new char[4096];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 19; continue $sw7;
                    }
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    try {
                        r1 = r7.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 13; continue $sw7;
                    }
                    if (r1 == (-1)) { $pc7 = 10; continue $sw7; }
                    try {
                        r8.write(r0, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 13; continue $sw7;
                    }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    try {
                        r7.close();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 16; continue $sw7;
                    }
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 19; continue $sw7;
                    }
                    return;
                }
                case 13: {
                    th = $ex7;
                    try {
                        r7.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 16; continue $sw7;
                    }
                }
                case 16: {
                    th = $ex7;
                    try {
                        r8.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 19; continue $sw7;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.io.InputStream r7, java.io.InputStream r8) {
        byte[] r1 = null;
        byte[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 27: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 32; continue $sw8; }
                    abcd.wu.j6(th, -3912056261930219600L, null, r7, r8);
                    $pc8 = 32; continue $sw8;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 35; continue $sw8; }
                    try {
                        abcd.wu.j6(-3912056261930219600L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    $pc8 = 35; continue $sw8;
                }
                case 35: {
                    try {
                        r1 = new byte[8192];
                        r0 = new byte[8192];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 24; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    try {
                        r2 = j6(r7, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 24; continue $sw8;
                    }
                    if (r2 != j6(r8, r0)) { $pc8 = 10; continue $sw8; }
                    if (r2 == (-1)) { $pc8 = 14; continue $sw8; }
                    r3 = 0;
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    if (r3 >= r2) { $pc8 = 7; continue $sw8; }
                    if (r1[r3] != r0[r3]) { $pc8 = 21; continue $sw8; }
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    { $pc8 = 18; continue $sw8; }
                }
                case 21: {
                    try {
                        r7.close();
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    return false;
                }
                case 14: {
                    try {
                        r7.close();
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    return true;
                }
                case 10: {
                    try {
                        r7.close();
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    return false;
                }
                case 24: {
                    th = $ex8;
                    try {
                        r7.close();
                        r8.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
