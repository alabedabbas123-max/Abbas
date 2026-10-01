package com.crashlytics.android.core;

final class Ba {
    static byte[] DW(java.io.File r1) {
        java.io.File r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2 = j6(r1, ".dmp");
                    if (r2 != null) { $pc0 = 6; continue $sw0; }
                    return new byte[0];
                }
                case 6: {
                    return Hw(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] DW(java.io.File r1, android.content.Context r2) {
        byte[] r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3 = FH(r1);
                    if (r3 != null) { $pc1 = 5; continue $sw1; }
                    return null;
                }
                case 5: {
                    if (r3.length != 0) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return j6(r2, new java.lang.String(r3));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] FH(java.io.File r2) {
        java.io.FileInputStream r0 = null;
        java.io.FileInputStream r1 = null;
        byte[] r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = null;
                    try {
                        r1 = new java.io.FileInputStream(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 12; continue $sw2; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 9; continue $sw2;
                    }
                    try {
                        r3 = j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 18; continue $sw2; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc2 = 19; continue $sw2; }
                        $pc2 = 7; continue $sw2;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1);
                    return r3;
                }
                case 7: {
                    th = th;
                    r0 = r1;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    io.fabric.sdk.android.services.common.i.j6(r0);
                    throw th;
                }
                case 16: {
                    io.fabric.sdk.android.services.common.i.j6(r1);
                    return null;
                }
                case 13: {
                    io.fabric.sdk.android.services.common.i.j6(r1);
                    return null;
                }
                case 15: {
                    r1 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 12: {
                    r1 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 9: {
                    th = th;
                    { $pc2 = 10; continue $sw2; }
                }
                case 18: {
                    throw new java.lang.IllegalStateException();
                }
                case 19: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] FH(java.io.File r3, android.content.Context r4) {
        java.io.BufferedReader r0 = null;
        byte[] r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3.exists() == true) { $pc3 = 17; continue $sw3; }
                    return null;
                }
                case 17: {
                    try {
                        r0 = new java.io.BufferedReader(new java.io.FileReader(r3));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    try {
                        r5 = new com.crashlytics.android.core.ClassC(r4, new com.crashlytics.android.core.Pa()).j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r0);
                    return r5;
                }
                case 9: {
                    th = th;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    io.fabric.sdk.android.services.common.i.j6(r0);
                    throw th;
                }
                case 11: {
                    th = th;
                    r0 = null;
                    { $pc3 = 13; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] Hw(java.io.File r0) {
        return FH(r0);
    }

    private static java.io.File j6(java.io.File r4, java.lang.String r5) {
        java.io.File[] r6 = null;
        int r0 = 0;
        int r1 = 0;
        java.io.File r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = r4.listFiles();
                    r0 = r6.length;
                    r1 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 >= r0) { $pc4 = 8; continue $sw4; }
                    r2 = r6[r1];
                    if (r2.getName().endsWith(r5) == true) { $pc4 = 6; continue $sw4; }
                    r1 = r1 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 6: {
                    return r2;
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] j6(android.content.Context r2, java.lang.String r3) {
        return new com.crashlytics.android.core.ClassC(r2, new com.crashlytics.android.core.Pa()).j6(r3);
    }

    static byte[] j6(java.io.File r1) {
        java.io.File r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = j6(r1, ".device_info");
                    if (r2 != null) { $pc5 = 6; continue $sw5; }
                    return null;
                }
                case 6: {
                    return FH(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] j6(java.io.File r1, android.content.Context r2) {
        java.io.File r0 = null;
        java.io.File r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = j6(r1, ".maps");
                    if (r0 != null) { $pc6 = 5; continue $sw6; }
                    r3 = j6(r1, ".binary_libs");
                    if (r3 != null) { $pc6 = 9; continue $sw6; }
                    return null;
                }
                case 9: {
                    return DW(r3, r2);
                }
                case 5: {
                    return FH(r0, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] j6(java.io.InputStream r4) {
        byte[] r0 = null;
        java.io.ByteArrayOutputStream r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new byte[1024];
                    r1 = new java.io.ByteArrayOutputStream();
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r2 = r4.read(r0);
                    if (r2 == (-1)) { $pc7 = 7; continue $sw7; }
                    r1.write(r0, 0, r2);
                    { $pc7 = 3; continue $sw7; }
                }
                case 7: {
                    return r1.toByteArray();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
