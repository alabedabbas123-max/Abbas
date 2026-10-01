package com.aide.appwizard;

@abcd.Interfacexu
public class D {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.appwizard.D.class, 2080007746348708736L, 2080007746348708736L);
    }

    public D() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 592590467621090840L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(592590467621090840L, null);
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

    public static java.lang.String j6() {
        java.lang.String r0 = null;
        java.io.File r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = null;
                    $pc1 = 16; continue $sw1;
                }
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, -981198410316821352L, r0);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-981198410316821352L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = android.os.Environment.getExternalStorageDirectory();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    if (r3.exists() == false) { $pc1 = 10; continue $sw1; }
                    try {
                        r0 = r3.getPath();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return r0;
                }
                case 10: {
                    return "/mnt/sdcard";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r9) {
        java.lang.StringBuffer r4 = null;
        java.io.BufferedReader r5 = null;
        char[] r6 = null;
        int r7 = 0;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 29: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 34; continue $sw2; }
                    abcd.wu.j6(th, -2651439463917296211L, null, r9);
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-2651439463917296211L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r9 != null) { $pc2 = 49; continue $sw2; }
                    return "";
                }
                case 49: {
                    try {
                        r4 = new java.lang.StringBuffer();
                        r5 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(r9), "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 22; continue $sw2; }
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 47; continue $sw2;
                }
                case 47: {
                    try {
                        r6 = new char[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 38; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        r7 = r5.read(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 38; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    if (r7 == (-1)) { $pc2 = 15; continue $sw2; }
                    try {
                        r4.append(java.lang.String.valueOf(r6, 0, r7));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 38; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    { $pc2 = 12; continue $sw2; }
                }
                case 15: {
                    try {
                        r5.close();
                        r3 = r4.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 38; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 36; continue $sw2; }
                        $pc2 = 29; continue $sw2;
                    }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    return r3;
                }
                case 18: {
                    th = th;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    if (r5 != null) { $pc2 = 40; continue $sw2; }
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                }
                case 40: {
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 37; continue $sw2; }
                        $pc2 = 29; continue $sw2;
                    }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    if (r5 != null) { $pc2 = 44; continue $sw2; }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    return "";
                }
                case 44: {
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        $pc2 = 29; continue $sw2;
                    }
                    throw new java.lang.IllegalStateException();
                }
                case 22: {
                    r5 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 20: {
                    th = th;
                    r5 = null;
                    { $pc2 = 26; continue $sw2; }
                }
                case 36: {
                    throw new java.lang.IllegalStateException();
                }
                case 37: {
                    throw new java.lang.IllegalStateException();
                }
                case 38: {
                    throw new java.lang.IllegalStateException();
                }
                case 39: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
