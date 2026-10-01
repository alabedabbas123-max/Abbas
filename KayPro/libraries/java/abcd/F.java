package abcd;

@abcd.Interfacexu
public final class F {

    @abcd.Interfaceru(field = -2978191133919069431L)
    private static abcd.G DW;

    @abcd.Interfaceru(field = 5439055544819666505L)
    private static com.google.firebase.analytics.FirebaseAnalytics FH;

    @abcd.Interfaceru(field = -4694706514906550408L)
    private static boolean Hw;

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfaceru(field = -4035392214186612805L)
    private static java.lang.String j6;

    @abcd.Interfacetu
    private static boolean v5;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.F.class, 5610107662420460160L, 5610107662420460160L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (v5 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1404809298436198767L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = "unknown";
                        Hw = false;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (Zo == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1404809298436198767L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1836758413888555827L)
    private F() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Zo == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -3127245079101136995L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-3127245079101136995L, null);
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

    public static void DW(android.app.Activity r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (Zo == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 1418056004630788889L, null, r7, r8);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(1418056004630788889L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        j6(r7, r8, null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (Zo == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, -3005592755486308344L, null, r5);
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-3005592755486308344L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (FH() == true) { $pc3 = 9; continue $sw3; }
                    return;
                }
                case 9: {
                    try {
                        VH("startSession");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(java.lang.String r6) {
        android.os.Bundle r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 11: {
                    th = $ex4;
                    if (Zo == false) { $pc4 = 15; continue $sw4; }
                    abcd.wu.j6(th, 1585715275549250560L, null, r6);
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(1585715275549250560L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (FH() == true) { $pc4 = 9; continue $sw4; }
                    return;
                }
                case 9: {
                    try {
                        VH("logLevelEnd: " + r6);
                        r3 = new android.os.Bundle();
                        r3.putString("level_name", r6);
                        FH.j6("level_end", r3);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (Zo == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 3963217086836114455L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(3963217086836114455L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(java.lang.String r6) {
        android.os.Bundle r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 11: {
                    th = $ex6;
                    if (Zo == false) { $pc6 = 15; continue $sw6; }
                    abcd.wu.j6(th, 2923279749780514351L, null, r6);
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(2923279749780514351L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (FH() == true) { $pc6 = 9; continue $sw6; }
                    return;
                }
                case 9: {
                    try {
                        VH("logLevelStart: " + r6);
                        r3 = new android.os.Bundle();
                        r3.putString("level_name", r6);
                        FH.j6("level_start", r3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 300248079910346667L)
    private static boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 16: {
                    th = $ex7;
                    if (Zo == false) { $pc7 = 20; continue $sw7; }
                    abcd.wu.j6(th, 880104102092781125L, null);
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc7 = 7; continue $sw7; }
                    try {
                        abcd.wu.j6(880104102092781125L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 16; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (Hw == false) { $pc7 = 15; continue $sw7; }
                    try {
                        FH.j6(DW.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 16; continue $sw7;
                    }
                    if (DW.j6() == true) { $pc7 = 12; continue $sw7; }
                    return false;
                }
                case 12: {
                    return true;
                }
                case 15: {
                    try {
                        throw new java.lang.IllegalStateException("Analytics not initialized");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 16; continue $sw7;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Hw(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (Zo == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -557607551129886915L, null, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-557607551129886915L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        FH.j6("a4_os_arch", r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4725891368456651679L)
    private static void VH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 7: {
                    th = $ex9;
                    if (Zo == false) { $pc9 = 11; continue $sw9; }
                    abcd.wu.j6(th, -5053611035144370651L, null, r5);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc9 = 14; continue $sw9; }
                    try {
                        abcd.wu.j6(-5053611035144370651L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Zo(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 7: {
                    th = $ex10;
                    if (Zo == false) { $pc10 = 11; continue $sw10; }
                    abcd.wu.j6(th, -3319366860714454768L, null, r5);
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc10 = 14; continue $sw10; }
                    try {
                        abcd.wu.j6(-3319366860714454768L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 7: {
                    th = $ex11;
                    if (Zo == false) { $pc11 = 11; continue $sw11; }
                    abcd.wu.j6(th, 3335519145276727024L, null, r8, r9, r10);
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(3335519145276727024L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    return "market://details?id=" + r9 + "&referrer=utm_source%3D" + r8 + "%26utm_medium%3Dinapplink%26utm_campaign%3D" + r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 12: {
                    th = $ex12;
                    if (Zo == false) { $pc12 = 16; continue $sw12; }
                    abcd.wu.j6(th, -5328824661013866912L, null);
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(-5328824661013866912L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (Hw == false) { $pc12 = 11; continue $sw12; }
                    try {
                        FH.j6(DW.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    return;
                }
                case 11: {
                    try {
                        throw new java.lang.IllegalStateException("Analytics not initialized");
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (Zo == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 3767195592705722720L, null, r7, r8);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc13 = 5; continue $sw13; }
                    try {
                        abcd.wu.j6(3767195592705722720L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    if (FH() == false) { $pc13 = 7; continue $sw13; }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 3;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (Zo == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 103294852219814992L, null, r8, r9, r10);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc14 = 5; continue $sw14; }
                    try {
                        abcd.wu.j6(103294852219814992L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    if (FH() == false) { $pc14 = 7; continue $sw14; }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 11: {
                    th = $ex15;
                    if (Zo == false) { $pc15 = 15; continue $sw15; }
                    abcd.wu.j6(th, 1176169637272847721L, null, r5);
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(1176169637272847721L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 11; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (FH() == true) { $pc15 = 9; continue $sw15; }
                    return;
                }
                case 9: {
                    try {
                        VH("endSession");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 11; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, abcd.G r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 12: {
                    th = $ex16;
                    if (Zo == false) { $pc16 = 16; continue $sw16; }
                    abcd.wu.j6(th, 1341088318444806360L, null, r7, r8);
                    $pc16 = 16; continue $sw16;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc16 = 5; continue $sw16; }
                    try {
                        abcd.wu.j6(1341088318444806360L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 12; continue $sw16;
                    }
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    if (r8 == null) { $pc16 = 11; continue $sw16; }
                    try {
                        VH("initialize");
                        DW = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 12; continue $sw16;
                    }
                    try {
                        j6 = r7.getPackageManager().getPackageInfo(r7.getPackageName(), 0).versionName;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc16 = 17; continue $sw16; }
                        $pc16 = 12; continue $sw16;
                    }
                    $pc16 = 8; continue $sw16;
                }
                case 8: {
                    try {
                        FH = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r7);
                        Hw = true;
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 12; continue $sw16;
                    }
                    return;
                }
                case 11: {
                    try {
                        throw new java.lang.IllegalArgumentException("Arguments may not be null");
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 12; continue $sw16;
                    }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, double r11, java.lang.String r13) {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (v5 == false) { $pc17 = 6; continue $sw17; }
                    abcd.wu.j6(1354123103448276800L, null, new java.lang.Object[]{r5, r6, r7, r8, r9, r10, new java.lang.Double(r11), r13});
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (FH() == false) { $pc17 = 7; continue $sw17; }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r6) {
        android.os.Bundle r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 11: {
                    th = $ex18;
                    if (Zo == false) { $pc18 = 15; continue $sw18; }
                    abcd.wu.j6(th, 839696905947546655L, null, r6);
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc18 = 7; continue $sw18; }
                    try {
                        abcd.wu.j6(839696905947546655L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 11; continue $sw18;
                    }
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    if (FH() == true) { $pc18 = 9; continue $sw18; }
                    return;
                }
                case 9: {
                    try {
                        VH("logEvent: " + r6);
                        r3 = new android.os.Bundle();
                        r3.putString("event_name", r6);
                        FH.j6("a4_legacy_event", r3);
                        com.crashlytics.android.Crashlytics.log("event: " + r6);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 11; continue $sw18;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        android.os.Bundle r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 10: {
                    th = $ex19;
                    if (Zo == false) { $pc19 = 14; continue $sw19; }
                    abcd.wu.j6(th, 57942326873086708L, null, r7, r8);
                    $pc19 = 14; continue $sw19;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(57942326873086708L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    if (FH() == true) { $pc19 = 8; continue $sw19; }
                    return;
                }
                case 8: {
                    try {
                        VH("logEvent: " + r7);
                        r0 = new android.os.Bundle();
                        r0.putString("event_name", r7);
                        FH.j6("a4_legacy_event", r0);
                        com.crashlytics.android.Crashlytics.log("event: " + r7);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void v5(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (Zo == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, 1476114258858077195L, null, r5);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(1476114258858077195L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        com.crashlytics.android.Crashlytics.log("page view: " + r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
