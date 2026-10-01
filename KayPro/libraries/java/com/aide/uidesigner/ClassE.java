package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassE {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassE.class, -2705139259622029791L, -2705139259622029791L);
    }

    public ClassE() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1931914286760774756L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1931914286760774756L, null);
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

    public static java.lang.String DW() {
        java.lang.String r0 = null;
        java.io.File r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = null;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, 4676949321758339140L, r0);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(4676949321758339140L, null);
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

    public static java.lang.String DW(android.content.Context r8, android.net.Uri r9) {
        android.database.Cursor r1 = null;
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 15: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, -6732646976338307100L, null, r8, r9);
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-6732646976338307100L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if ("content".equals(r9.getScheme()) == false) { $pc2 = 11; continue $sw2; }
                    try {
                        r1 = r8.getContentResolver().query(r9, new java.lang.String[]{"_data"}, null, null, null);
                        r0 = r1.getColumnIndexOrThrow("_data");
                        r1.moveToFirst();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    return r1.getString(r0);
                }
                case 11: {
                    if ("file".equals(r9.getScheme()) == true) { $pc2 = 13; continue $sw2; }
                    return null;
                }
                case 13: {
                    return r9.getPath();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.List<java.io.File> DW(java.lang.String r10) {
        java.util.ArrayList r3 = null;
        java.io.File[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.io.File r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 16: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 21; continue $sw3; }
                    abcd.wu.j6(th, -5637595544212521960L, null, r10);
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-5637595544212521960L, null, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r3 = new java.util.ArrayList();
                        r4 = new java.io.File(r10, "layout").listFiles();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    if (r4 == null) { $pc3 = 14; continue $sw3; }
                    try {
                        r5 = r4.length;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    r6 = 0;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r6 >= r5) { $pc3 = 14; continue $sw3; }
                    try {
                        r7 = r4[r6];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    if (r7.getName().endsWith(".xml") == false) { $pc3 = 13; continue $sw3; }
                    try {
                        r3.add(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    try {
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    try {
                        java.util.Collections.sort(r3, new com.aide.uidesigner.ClassD());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String FH(java.lang.String r9) {
        java.lang.StringBuffer r4 = null;
        java.io.BufferedReader r5 = null;
        char[] r6 = null;
        int r7 = 0;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 29: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 34; continue $sw4; }
                    abcd.wu.j6(th, 6076388906223223763L, null, r9);
                    $pc4 = 34; continue $sw4;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(6076388906223223763L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 29; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r9 != null) { $pc4 = 49; continue $sw4; }
                    return "";
                }
                case 49: {
                    try {
                        r4 = new java.lang.StringBuffer();
                        r5 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(r9), "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 22; continue $sw4; }
                        $pc4 = 20; continue $sw4;
                    }
                    $pc4 = 47; continue $sw4;
                }
                case 47: {
                    try {
                        r6 = new char[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 38; continue $sw4; }
                        $pc4 = 18; continue $sw4;
                    }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    try {
                        r7 = r5.read(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 38; continue $sw4; }
                        $pc4 = 18; continue $sw4;
                    }
                    if (r7 == (-1)) { $pc4 = 15; continue $sw4; }
                    try {
                        r4.append(java.lang.String.valueOf(r6, 0, r7));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 38; continue $sw4; }
                        $pc4 = 18; continue $sw4;
                    }
                    { $pc4 = 12; continue $sw4; }
                }
                case 15: {
                    try {
                        r5.close();
                        r3 = r4.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 38; continue $sw4; }
                        $pc4 = 18; continue $sw4;
                    }
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 36; continue $sw4; }
                        $pc4 = 29; continue $sw4;
                    }
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    return r3;
                }
                case 18: {
                    th = th;
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    if (r5 != null) { $pc4 = 40; continue $sw4; }
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 29; continue $sw4;
                    }
                }
                case 40: {
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 37; continue $sw4; }
                        $pc4 = 29; continue $sw4;
                    }
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    if (r5 != null) { $pc4 = 44; continue $sw4; }
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    return "";
                }
                case 44: {
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 39; continue $sw4; }
                        $pc4 = 29; continue $sw4;
                    }
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    r5 = null;
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    th = th;
                    r5 = null;
                    { $pc4 = 26; continue $sw4; }
                }
                case 36: {
                    $pc4 = 37; continue $sw4;
                }
                case 37: {
                    $pc4 = 38; continue $sw4;
                }
                case 38: {
                    $pc4 = 39; continue $sw4;
                }
                case 39: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Hw(java.lang.String r9) {
        java.io.File r4 = null;
        int r5 = 0;
        java.lang.StringBuilder r7 = null;
        int r8 = 0;
        java.io.File r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 17; continue $sw5; }
                    abcd.wu.j6(th, -269436893562331629L, null, r9);
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-269436893562331629L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r4 = new java.io.File(r9, "layout");
                        r4.mkdirs();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    r5 = 1;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    try {
                        r7 = new java.lang.StringBuilder();
                        r7.append("layout");
                        r8 = r5 + 1;
                        r7.append(r5);
                        r7.append(".xml");
                        r6 = new java.io.File(r4, r7.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    if (r6.exists() == false) { $pc5 = 9; continue $sw5; }
                    r5 = r8;
                    { $pc5 = 7; continue $sw5; }
                }
                case 9: {
                    return r6.getName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static long j6(java.io.InputStream r7, java.io.OutputStream r8) {
        long r0 = 0L;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 11: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, -3843410740143351909L, null, r7, r8);
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(-3843410740143351909L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r0 = 0;
                    try {
                        r2 = new byte[1000];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r3 = r7.read(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    if (r3 == (-1)) { $pc6 = 9; continue $sw6; }
                    try {
                        r0 = r0 + ((long) r3);
                        r8.write(r2, 0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    { $pc6 = 6; continue $sw6; }
                }
                case 9: {
                    try {
                        r7.close();
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 764067844874393001L, null);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(764067844874393001L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return DW() + "/AppProjects/UIDesigns/res";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(android.content.Context r7, android.net.Uri r8) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 10: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 14; continue $sw8; }
                    abcd.wu.j6(th, -759348599259927288L, null, r7, r8);
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-759348599259927288L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = DW(r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    if (r0 != null) { $pc8 = 8; continue $sw8; }
                    return null;
                }
                case 8: {
                    return r0.substring(r0.lastIndexOf("/") + 1, r0.length());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r9) {
        java.io.File[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.io.File r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 17: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 22; continue $sw9; }
                    abcd.wu.j6(th, -1488321909622508240L, null, r9);
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-1488321909622508240L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r3 = new java.io.File(r9, "layout").listFiles();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    if (r3 == null) { $pc9 = 16; continue $sw9; }
                    try {
                        r4 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    r5 = 0;
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    if (r5 >= r4) { $pc9 = 16; continue $sw9; }
                    try {
                        r6 = r3[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    if (r6.getName().endsWith(".xml") == true) { $pc9 = 13; continue $sw9; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    { $pc9 = 9; continue $sw9; }
                }
                case 13: {
                    return r6.getPath();
                }
                case 16: {
                    return j6(r9, Hw(r9));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 7: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 11; continue $sw10; }
                    abcd.wu.j6(th, -413584676189093376L, null, r7, r8);
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(-413584676189093376L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    return j6(r7, r8, "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        java.lang.String r6 = null;
        java.io.File r0 = null;
        java.io.File r1 = null;
        java.io.FileWriter r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 17: {
                    th = $ex11;
                    r6 = r9;
                    if (DW == false) { $pc11 = 21; continue $sw11; }
                    abcd.wu.j6(th, -484412775610803360L, null, r8, r6, r10);
                    $pc11 = 21; continue $sw11;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 24; continue $sw11; }
                    try {
                        abcd.wu.j6(-484412775610803360L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 17; continue $sw11;
                    }
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    try {
                        r0 = new java.io.File(r8, "layout");
                        r0.mkdirs();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    if (r9 != null) { $pc11 = 8; continue $sw11; }
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    try {
                        r9 = Hw(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    try {
                        r1 = new java.io.File(r0, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    if (r1.exists() == false) { $pc11 = 13; continue $sw11; }
                    try {
                        r1 = new java.io.File(r0, Hw(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    try {
                        r2 = new java.io.FileWriter(r1);
                        r2.write(r10);
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    return r1.getPath();
                }
                case 8: {
                    if (r9.trim().length() != 0) { $pc11 = 10; continue $sw11; }
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
