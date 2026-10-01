package com.aide.ui;

@abcd.Interfacexu
public class aa {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 3417054187342388200L)
    private static android.content.Context j6;

    static {
        abcd.wu.j6(com.aide.ui.aa.class, 480679063369465845L, 480679063369465845L);
    }

    public aa() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -3306790757542697732L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3306790757542697732L, null);
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

    public static java.lang.String BT() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (FH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 940932671106983727L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(940932671106983727L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return ef().getString("app_language", "default");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.content.Context r7, android.content.SharedPreferences.OnSharedPreferenceChangeListener r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -2237353505197559952L, null, r7, r8);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-2237353505197559952L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        Hw(j6).unregisterOnSharedPreferenceChangeListener(r8);
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

    public static void DW(java.lang.String r7) {
        android.content.SharedPreferences r4 = null;
        android.content.SharedPreferences.Editor r5 = null;
        java.util.Set<java.lang.String> r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (FH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 2018674844428176585L, null, r7);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2018674844428176585L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(j6);
                        r5 = r4.edit();
                        r6 = r4.getStringSet("intel_libs_warned_projects", new java.util.HashSet());
                        r6.add(r7);
                        r5.putStringSet("intel_libs_warned_projects", r6);
                        r5.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(boolean r5) {
        android.content.SharedPreferences.Editor r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1566447609235003872L, null, new java.lang.Boolean(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1566447609235003872L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r3 = ef().edit();
                        r3.putBoolean("trainer_voice", r5);
                        r3.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
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
                    if (FH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -3777844239107300655L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-3777844239107300655L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return ef().getBoolean("complete_after_letter", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (FH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -5239206207633216000L, null, r6);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-5239206207633216000L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return Hw(r6).getBoolean("send_analytics_data", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (FH == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -3073219316032118856L, null);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-3073219316032118856L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return ef().getBoolean("browser_swipe", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -649079287232705280L)
    private static int FH(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (FH == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -1102431900638387781L, null, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-1102431900638387781L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return com.aide.common.ClassG.j6(r5, 14);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(java.lang.String r5) {
        android.content.SharedPreferences.Editor r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (FH == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -3023428463941171305L, null, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-3023428463941171305L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r3 = ef().edit();
                        r3.putString("user_keystore", r5);
                        r3.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (FH == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 6979242308255709779L, null);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(6979242308255709779L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return ef().getBoolean("complete_all_types", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 14;
        $sw11: while (true) {
            switch ($pc11) {
                case 14: {
                    th = $ex11;
                    if (FH == false) { $pc11 = 18; continue $sw11; }
                    abcd.wu.j6(th, 4401739661892457984L, null);
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc11 = 7; continue $sw11; }
                    try {
                        abcd.wu.j6(4401739661892457984L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 14; continue $sw11;
                    }
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    if (com.aide.ui.U.dx() == false) { $pc11 = 19; continue $sw11; }
                    return 5;
                }
                case 19: {
                    return java.lang.Integer.parseInt(ef().getString("autosafe_time", "-1"));
                }
                case 12: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 534994003005623856L)
    private static android.content.SharedPreferences Hw(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (FH == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, 52723629260042395L, null, r5);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(52723629260042395L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return android.preference.PreferenceManager.getDefaultSharedPreferences(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Hw(java.lang.String r5) {
        android.content.SharedPreferences.Editor r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (FH == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -1554192697156476832L, null, r5);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-1554192697156476832L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        r3 = ef().edit();
                        r3.putString("local_doc_dir_path", r5);
                        r3.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (FH == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 1929840242518963776L, null);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(1929840242518963776L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return ef().getBoolean("trainer_sound", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (FH == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, 2196232330926342261L, null);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(2196232330926342261L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return ef().getBoolean("trainer_voice", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean KD() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (FH == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -3284377389251581129L, null);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-3284377389251581129L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    return ef().getBoolean("send_analytics_data", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int Mr() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 10;
        $sw17: while (true) {
            switch ($pc17) {
                case 10: {
                    th = $ex17;
                    if (FH == false) { $pc17 = 14; continue $sw17; }
                    abcd.wu.j6(th, -2107437416648218704L, null);
                    $pc17 = 14; continue $sw17;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc17 = 17; continue $sw17; }
                    try {
                        abcd.wu.j6(-2107437416648218704L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    $pc17 = 17; continue $sw17;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("html_indentation_size", "2"));
                }
                case 8: {
                    return 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int P8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (FH == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 3679176581644527315L, null);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc18 = 15; continue $sw18; }
                    try {
                        abcd.wu.j6(3679176581644527315L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    return 1000;
                }
                case 15: {
                    return 1000;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String QX() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (FH == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, 4263462807678454935L, null);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(4263462807678454935L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    return ef().getString("git_dot_ssh_dir", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean SI() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (FH == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, -1043557988735804048L, null);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(-1043557988735804048L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    return ef().getBoolean("run_as_root", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Integer> U2() {
        java.util.HashMap r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 8: {
                    th = $ex21;
                    if (FH == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, -3530845519441695840L, null);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-3530845519441695840L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        r3 = new java.util.HashMap();
                        r3.put("Java", java.lang.Integer.valueOf(er()));
                        r3.put("JavaScript", java.lang.Integer.valueOf(gW()));
                        r3.put("XML", java.lang.Integer.valueOf(sG()));
                        r3.put("HTML", java.lang.Integer.valueOf(Mr()));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 10;
        $sw22: while (true) {
            switch ($pc22) {
                case 10: {
                    th = $ex22;
                    if (FH == false) { $pc22 = 14; continue $sw22; }
                    abcd.wu.j6(th, 5107163184652813356L, null);
                    $pc22 = 14; continue $sw22;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc22 = 17; continue $sw22; }
                    try {
                        abcd.wu.j6(5107163184652813356L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    $pc22 = 17; continue $sw22;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("cpp_indentation_size", "4"));
                }
                case 8: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean Ws() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (FH == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, 2173117525636686720L, null);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(2173117525636686720L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    return ef().getBoolean("force_soft_keyboard", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean XL() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 8: {
                    th = $ex24;
                    if (FH == false) { $pc24 = 12; continue $sw24; }
                    abcd.wu.j6(th, -430656149389117224L, null);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(-430656149389117224L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    return ef().getBoolean("git_keep_ssh_session_info", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> Zo() {
        java.util.HashMap r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 8: {
                    th = $ex25;
                    if (FH == false) { $pc25 = 12; continue $sw25; }
                    abcd.wu.j6(th, 7588154889979986512L, null);
                    $pc25 = 12; continue $sw25;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(7588154889979986512L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    try {
                        r3 = new java.util.HashMap();
                        r3.put("Java", rN());
                        r3.put("JavaScript", yS());
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean a8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 8: {
                    th = $ex26;
                    if (FH == false) { $pc26 = 12; continue $sw26; }
                    abcd.wu.j6(th, 378799975405072375L, null);
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(378799975405072375L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    return ef().getBoolean("use_spaces_for_tabs", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String aM() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 8: {
                    th = $ex27;
                    if (FH == false) { $pc27 = 12; continue $sw27; }
                    abcd.wu.j6(th, 254784319546006012L, null);
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(254784319546006012L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    return ef().getString("git_user_email", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String cb() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 12: {
                    th = $ex28;
                    if (FH == false) { $pc28 = 16; continue $sw28; }
                    abcd.wu.j6(th, -385192645559649280L, null);
                    $pc28 = 16; continue $sw28;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc28 = 8; continue $sw28; }
                    try {
                        abcd.wu.j6(-385192645559649280L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 12; continue $sw28;
                    }
                    $pc28 = 8; continue $sw28;
                }
                case 8: {
                    if (ef().getBoolean("use_user_keystore", false) == false) { $pc28 = 11; continue $sw28; }
                    return ef().getString("user_keystore", "").trim();
                }
                case 11: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int cn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 10;
        $sw29: while (true) {
            switch ($pc29) {
                case 10: {
                    th = $ex29;
                    if (FH == false) { $pc29 = 14; continue $sw29; }
                    abcd.wu.j6(th, 2374018288218094375L, null);
                    $pc29 = 14; continue $sw29;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc29 = 17; continue $sw29; }
                    try {
                        abcd.wu.j6(2374018288218094375L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 10; continue $sw29;
                    }
                    $pc29 = 17; continue $sw29;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("tabsize", "4"));
                }
                case 8: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String dx() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 8: {
                    th = $ex30;
                    if (FH == false) { $pc30 = 12; continue $sw30; }
                    abcd.wu.j6(th, -6116185992377498525L, null);
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(-6116185992377498525L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    return ef().getString("user_m2repositories", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5534343383408724303L)
    private static android.content.SharedPreferences ef() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if (FH == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, 467253668715616776L, null);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(467253668715616776L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    return Hw(j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int ei() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 10;
        $sw32: while (true) {
            switch ($pc32) {
                case 10: {
                    th = $ex32;
                    if (FH == false) { $pc32 = 14; continue $sw32; }
                    abcd.wu.j6(th, -3085243704335756051L, null);
                    $pc32 = 14; continue $sw32;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc32 = 17; continue $sw32; }
                    try {
                        abcd.wu.j6(-3085243704335756051L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 10; continue $sw32;
                    }
                    $pc32 = 17; continue $sw32;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("max_single_imports", "100"));
                }
                case 8: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int er() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 10;
        $sw33: while (true) {
            switch ($pc33) {
                case 10: {
                    th = $ex33;
                    if (FH == false) { $pc33 = 14; continue $sw33; }
                    abcd.wu.j6(th, -2237108322076730267L, null);
                    $pc33 = 14; continue $sw33;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc33 = 17; continue $sw33; }
                    try {
                        abcd.wu.j6(-2237108322076730267L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 10; continue $sw33;
                    }
                    $pc33 = 17; continue $sw33;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("java_indentation_size", "4"));
                }
                case 8: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int gW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 10;
        $sw34: while (true) {
            switch ($pc34) {
                case 10: {
                    th = $ex34;
                    if (FH == false) { $pc34 = 14; continue $sw34; }
                    abcd.wu.j6(th, -658339769779281096L, null);
                    $pc34 = 14; continue $sw34;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc34 = 17; continue $sw34; }
                    try {
                        abcd.wu.j6(-658339769779281096L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 10; continue $sw34;
                    }
                    $pc34 = 17; continue $sw34;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("js_indentation_size", "4"));
                }
                case 8: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 8: {
                    th = $ex35;
                    if (FH == false) { $pc35 = 12; continue $sw35; }
                    abcd.wu.j6(th, -141058983325704852L, null);
                    $pc35 = 12; continue $sw35;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(-141058983325704852L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 8; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    return ef().getBoolean("git_create_for_projects", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j3() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 8: {
                    th = $ex36;
                    if (FH == false) { $pc36 = 12; continue $sw36; }
                    abcd.wu.j6(th, -246558571514946033L, null);
                    $pc36 = 12; continue $sw36;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(-246558571514946033L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 8; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    return ef().getString("git_user_name", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, android.content.SharedPreferences.OnSharedPreferenceChangeListener r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 3;
        $sw37: while (true) {
            switch ($pc37) {
                case 7: {
                    th = $ex37;
                    if (FH == false) { $pc37 = 11; continue $sw37; }
                    abcd.wu.j6(th, 149547865968935471L, null, r7, r8);
                    $pc37 = 11; continue $sw37;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc37 = 5; continue $sw37; }
                    try {
                        abcd.wu.j6(149547865968935471L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 7; continue $sw37;
                    }
                    $pc37 = 5; continue $sw37;
                }
                case 5: {
                    try {
                        Hw(j6).registerOnSharedPreferenceChangeListener(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 7; continue $sw37;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r7, java.util.List<java.lang.String> r8) {
        android.content.SharedPreferences.Editor r0 = null;
        int r2 = 0;
        abcd.Enumid[] r1 = null;
        int r3 = 0;
        int r4 = 0;
        abcd.Enumid r5 = null;
        abcd.EnumMd[] r6 = null;
        int r9 = 0;
        abcd.EnumMd r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 3;
        $sw38: while (true) {
            switch ($pc38) {
                case 17: {
                    th = $ex38;
                    if (FH == false) { $pc38 = 22; continue $sw38; }
                    abcd.wu.j6(th, -301007177741209940L, null, r7, r8);
                    $pc38 = 22; continue $sw38;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc38 = 5; continue $sw38; }
                    try {
                        abcd.wu.j6(-301007177741209940L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    $pc38 = 5; continue $sw38;
                }
                case 5: {
                    try {
                        r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(j6).edit();
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    r2 = 0;
                    if ("Java".equals(r7) == false) { $pc38 = 11; continue $sw38; }
                    try {
                        r1 = abcd.Enumid.values();
                        r3 = r1.length;
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    r4 = 0;
                    $pc38 = 8; continue $sw38;
                }
                case 8: {
                    if (r4 >= r3) { $pc38 = 11; continue $sw38; }
                    try {
                        r5 = r1[r4];
                        r0.putBoolean(r5.VH(), r8.contains(r5.getName()));
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    $pc38 = 11; continue $sw38;
                }
                case 11: {
                    if ("JavaScript".equals(r7) == false) { $pc38 = 15; continue $sw38; }
                    try {
                        r6 = abcd.EnumMd.values();
                        r9 = r6.length;
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    $pc38 = 13; continue $sw38;
                }
                case 13: {
                    if (r2 >= r9) { $pc38 = 15; continue $sw38; }
                    try {
                        r10 = r6[r2];
                        r0.putBoolean(r10.VH(), r8.contains(r10.getName()));
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    $pc38 = 15; continue $sw38;
                }
                case 15: {
                    try {
                        r0.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 17; continue $sw38;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(boolean r5) {
        android.content.SharedPreferences.Editor r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = 4;
        $sw39: while (true) {
            switch ($pc39) {
                case 8: {
                    th = $ex39;
                    if (FH == false) { $pc39 = 12; continue $sw39; }
                    abcd.wu.j6(th, -7596170990134917183L, null, new java.lang.Boolean(r5));
                    $pc39 = 12; continue $sw39;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc39 = 6; continue $sw39; }
                    try {
                        abcd.wu.j6(-7596170990134917183L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 8; continue $sw39;
                    }
                    $pc39 = 6; continue $sw39;
                }
                case 6: {
                    try {
                        r3 = ef().edit();
                        r3.putBoolean("trainer_sound", r5);
                        r3.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 8; continue $sw39;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex40 = null;
        int $pc40 = 4;
        $sw40: while (true) {
            switch ($pc40) {
                case 8: {
                    th = $ex40;
                    if (FH == false) { $pc40 = 12; continue $sw40; }
                    abcd.wu.j6(th, -3261086782531761064L, null);
                    $pc40 = 12; continue $sw40;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc40 = 6; continue $sw40; }
                    try {
                        abcd.wu.j6(-3261086782531761064L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 8; continue $sw40;
                    }
                    $pc40 = 6; continue $sw40;
                }
                case 6: {
                    return ef().getBoolean("complete_after_dot", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.content.Context r15) {
        boolean r7 = false;
        android.content.SharedPreferences r6 = null;
        android.content.SharedPreferences.Editor r8 = null;
        abcd.Enumid[] r9 = null;
        int r10 = 0;
        int r11 = 0;
        abcd.Enumid r12 = null;
        abcd.EnumMd[] r13 = null;
        int r14 = 0;
        int r16 = 0;
        abcd.EnumMd r17 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = 4;
        $sw41: while (true) {
            switch ($pc41) {
                case 29: {
                    th = $ex41;
                    if (FH == false) { $pc41 = 34; continue $sw41; }
                    abcd.wu.j6(th, -1758713947606532160L, null, r15);
                    $pc41 = 34; continue $sw41;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc41 = 6; continue $sw41; }
                    try {
                        abcd.wu.j6(-1758713947606532160L, null, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    $pc41 = 6; continue $sw41;
                }
                case 6: {
                    try {
                        j6 = r15;
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    r7 = false;
                    try {
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_codestyle, false);
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_dropbox, false);
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_sourcecontrol, false);
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_editor, false);
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_application, false);
                        android.preference.PreferenceManager.setDefaultValues(r15, com.almlkaide.kaypro.R.xml.preferences_compiler, false);
                        r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r15);
                        r8 = r6.edit();
                        r9 = abcd.Enumid.values();
                        r10 = r9.length;
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    r11 = 0;
                    $pc41 = 7; continue $sw41;
                }
                case 7: {
                    if (r11 >= r10) { $pc41 = 12; continue $sw41; }
                    try {
                        r12 = r9[r11];
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    if (r6.contains(r12.VH()) == true) { $pc41 = 11; continue $sw41; }
                    try {
                        r8.putBoolean(r12.VH(), abcd.Enumid.Hw().contains(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    $pc41 = 11; continue $sw41;
                }
                case 11: {
                    try {
                        r11 = r11 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    { $pc41 = 7; continue $sw41; }
                }
                case 12: {
                    try {
                        r13 = abcd.EnumMd.values();
                        r14 = r13.length;
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    r16 = 0;
                    $pc41 = 13; continue $sw41;
                }
                case 13: {
                    if (r16 >= r14) { $pc41 = 19; continue $sw41; }
                    try {
                        r17 = r13[r16];
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    if (r6.contains(r17.VH()) == true) { $pc41 = 17; continue $sw41; }
                    try {
                        r8.putBoolean(r17.VH(), abcd.EnumMd.Hw().contains(r17));
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    $pc41 = 17; continue $sw41;
                }
                case 17: {
                    try {
                        r16 = r16 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    { $pc41 = 13; continue $sw41; }
                }
                case 19: {
                    if (r6.contains("git_dot_ssh_dir") == true) { $pc41 = 22; continue $sw41; }
                    try {
                        r8.putString("git_dot_ssh_dir", new java.io.File(abcd.Vl.VH(), ".ssh").getPath());
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    $pc41 = 22; continue $sw41;
                }
                case 22: {
                    if (r6.contains("editor_font_size") == true) { $pc41 = 25; continue $sw41; }
                    try {
                        r8.putString("editor_font_size", FH(r15) + "");
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    r7 = true;
                    $pc41 = 25; continue $sw41;
                }
                case 25: {
                    if (r6.contains("editor_tabs") == true) { $pc41 = 27; continue $sw41; }
                    try {
                        r8.putBoolean("editor_tabs", true);
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    $pc41 = 27; continue $sw41;
                }
                case 27: {
                    try {
                        r8.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 29; continue $sw41;
                    }
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = 4;
        $sw42: while (true) {
            switch ($pc42) {
                case 8: {
                    th = $ex42;
                    if (FH == false) { $pc42 = 12; continue $sw42; }
                    abcd.wu.j6(th, 385582699326382839L, null, r6);
                    $pc42 = 12; continue $sw42;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc42 = 6; continue $sw42; }
                    try {
                        abcd.wu.j6(385582699326382839L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 8; continue $sw42;
                    }
                    $pc42 = 6; continue $sw42;
                }
                case 6: {
                    return ef().getStringSet("intel_libs_warned_projects", java.util.Collections.emptySet()).contains(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean lg() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex43 = null;
        int $pc43 = 4;
        $sw43: while (true) {
            switch ($pc43) {
                case 11: {
                    th = $ex43;
                    if (FH == false) { $pc43 = 15; continue $sw43; }
                    abcd.wu.j6(th, -1866735274213651336L, null);
                    $pc43 = 15; continue $sw43;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc43 = 7; continue $sw43; }
                    try {
                        abcd.wu.j6(-1866735274213651336L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 11; continue $sw43;
                    }
                    $pc43 = 7; continue $sw43;
                }
                case 7: {
                    if (com.aide.ui.U.dx() == false) { $pc43 = 9; continue $sw43; }
                    return true;
                }
                case 9: {
                    return ef().getBoolean("light_theme", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean nw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex44 = null;
        int $pc44 = 4;
        $sw44: while (true) {
            switch ($pc44) {
                case 8: {
                    th = $ex44;
                    if (FH == false) { $pc44 = 12; continue $sw44; }
                    abcd.wu.j6(th, 7462582116003675684L, null);
                    $pc44 = 12; continue $sw44;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc44 = 6; continue $sw44; }
                    try {
                        abcd.wu.j6(7462582116003675684L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex44 = $t;
                        $pc44 = 8; continue $sw44;
                    }
                    $pc44 = 6; continue $sw44;
                }
                case 6: {
                    return ef().getBoolean("native_build_parallel", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.List<java.lang.String> rN() {
        java.util.ArrayList r3 = null;
        abcd.Enumid[] r4 = null;
        int r5 = 0;
        int r7 = 0;
        abcd.Enumid r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex45 = null;
        int $pc45 = 4;
        $sw45: while (true) {
            switch ($pc45) {
                case 13: {
                    th = $ex45;
                    if (FH == false) { $pc45 = 18; continue $sw45; }
                    abcd.wu.j6(th, -23443534234028304L, null);
                    $pc45 = 18; continue $sw45;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc45 = 6; continue $sw45; }
                    try {
                        abcd.wu.j6(-23443534234028304L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 13; continue $sw45;
                    }
                    $pc45 = 6; continue $sw45;
                }
                case 6: {
                    try {
                        r3 = new java.util.ArrayList();
                        r4 = abcd.Enumid.values();
                        r5 = r4.length;
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 13; continue $sw45;
                    }
                    r7 = 0;
                    $pc45 = 7; continue $sw45;
                }
                case 7: {
                    if (r7 >= r5) { $pc45 = 12; continue $sw45; }
                    try {
                        r8 = r4[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 13; continue $sw45;
                    }
                    if (ef().getBoolean(r8.VH(), false) == false) { $pc45 = 11; continue $sw45; }
                    try {
                        r3.add(r8.name());
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 13; continue $sw45;
                    }
                    $pc45 = 11; continue $sw45;
                }
                case 11: {
                    r7 = r7 + 1;
                    { $pc45 = 7; continue $sw45; }
                }
                case 12: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean ro() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex46 = null;
        int $pc46 = 4;
        $sw46: while (true) {
            switch ($pc46) {
                case 8: {
                    th = $ex46;
                    if (FH == false) { $pc46 = 12; continue $sw46; }
                    abcd.wu.j6(th, -4503613780028743347L, null);
                    $pc46 = 12; continue $sw46;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc46 = 6; continue $sw46; }
                    try {
                        abcd.wu.j6(-4503613780028743347L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 8; continue $sw46;
                    }
                    $pc46 = 6; continue $sw46;
                }
                case 6: {
                    return ef().getBoolean("editor_tabs", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int sG() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex47 = null;
        int $pc47 = 10;
        $sw47: while (true) {
            switch ($pc47) {
                case 10: {
                    th = $ex47;
                    if (FH == false) { $pc47 = 14; continue $sw47; }
                    abcd.wu.j6(th, -4297796710664064520L, null);
                    $pc47 = 14; continue $sw47;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc47 = 17; continue $sw47; }
                    try {
                        abcd.wu.j6(-4297796710664064520L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex47 = $t;
                        $pc47 = 10; continue $sw47;
                    }
                    $pc47 = 17; continue $sw47;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("xml_indentation_size", "4"));
                }
                case 8: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String sh() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex48 = null;
        int $pc48 = 4;
        $sw48: while (true) {
            switch ($pc48) {
                case 8: {
                    th = $ex48;
                    if (FH == false) { $pc48 = 12; continue $sw48; }
                    abcd.wu.j6(th, 394558037932236720L, null);
                    $pc48 = 12; continue $sw48;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc48 = 6; continue $sw48; }
                    try {
                        abcd.wu.j6(394558037932236720L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex48 = $t;
                        $pc48 = 8; continue $sw48;
                    }
                    $pc48 = 6; continue $sw48;
                }
                case 6: {
                    return ef().getString("user_androidjar", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex49 = null;
        int $pc49 = 10;
        $sw49: while (true) {
            switch ($pc49) {
                case 10: {
                    th = $ex49;
                    if (FH == false) { $pc49 = 14; continue $sw49; }
                    abcd.wu.j6(th, -2718147785048677520L, null);
                    $pc49 = 14; continue $sw49;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc49 = 15; continue $sw49; }
                    try {
                        abcd.wu.j6(-2718147785048677520L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex49 = $t;
                        $pc49 = 10; continue $sw49;
                    }
                    $pc49 = 15; continue $sw49;
                }
                case 15: {
                    return java.lang.Integer.parseInt(ef().getString("editor_font_size", "10"));
                }
                case 8: {
                    return FH(j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex50 = null;
        int $pc50 = 10;
        $sw50: while (true) {
            switch ($pc50) {
                case 10: {
                    th = $ex50;
                    if (FH == false) { $pc50 = 14; continue $sw50; }
                    abcd.wu.j6(th, -5073543638064685608L, null);
                    $pc50 = 14; continue $sw50;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc50 = 17; continue $sw50; }
                    try {
                        abcd.wu.j6(-5073543638064685608L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex50 = $t;
                        $pc50 = 10; continue $sw50;
                    }
                    $pc50 = 17; continue $sw50;
                }
                case 17: {
                    return java.lang.Integer.parseInt(ef().getString("css_indentation_size", "2"));
                }
                case 8: {
                    return 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void v5(java.lang.String r5) {
        android.content.SharedPreferences.Editor r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex51 = null;
        int $pc51 = 4;
        $sw51: while (true) {
            switch ($pc51) {
                case 8: {
                    th = $ex51;
                    if (FH == false) { $pc51 = 12; continue $sw51; }
                    abcd.wu.j6(th, 34090245869341544L, null, r5);
                    $pc51 = 12; continue $sw51;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc51 = 6; continue $sw51; }
                    try {
                        abcd.wu.j6(34090245869341544L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 8; continue $sw51;
                    }
                    $pc51 = 6; continue $sw51;
                }
                case 6: {
                    try {
                        r3 = ef().edit();
                        r3.putString("user_androidjar", r5);
                        r3.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 8; continue $sw51;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex52 = null;
        int $pc52 = 4;
        $sw52: while (true) {
            switch ($pc52) {
                case 8: {
                    th = $ex52;
                    if (FH == false) { $pc52 = 12; continue $sw52; }
                    abcd.wu.j6(th, -4584856093610713047L, null);
                    $pc52 = 12; continue $sw52;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc52 = 6; continue $sw52; }
                    try {
                        abcd.wu.j6(-4584856093610713047L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 8; continue $sw52;
                    }
                    $pc52 = 6; continue $sw52;
                }
                case 6: {
                    return ef().getBoolean("auto_sync_dropbox", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String vy() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex53 = null;
        int $pc53 = 4;
        $sw53: while (true) {
            switch ($pc53) {
                case 8: {
                    th = $ex53;
                    if (FH == false) { $pc53 = 12; continue $sw53; }
                    abcd.wu.j6(th, 1847300521903980000L, null);
                    $pc53 = 12; continue $sw53;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc53 = 6; continue $sw53; }
                    try {
                        abcd.wu.j6(1847300521903980000L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 8; continue $sw53;
                    }
                    $pc53 = 6; continue $sw53;
                }
                case 6: {
                    return ef().getString("local_doc_dir_path", null);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex54 = null;
        int $pc54 = 4;
        $sw54: while (true) {
            switch ($pc54) {
                case 8: {
                    th = $ex54;
                    if (FH == false) { $pc54 = 12; continue $sw54; }
                    abcd.wu.j6(th, -179801648103059120L, null);
                    $pc54 = 12; continue $sw54;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc54 = 6; continue $sw54; }
                    try {
                        abcd.wu.j6(-179801648103059120L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 8; continue $sw54;
                    }
                    $pc54 = 6; continue $sw54;
                }
                case 6: {
                    return ef().getBoolean("optimze_dex", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.List<java.lang.String> yS() {
        java.util.ArrayList r3 = null;
        abcd.EnumMd[] r4 = null;
        int r5 = 0;
        int r7 = 0;
        abcd.EnumMd r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex55 = null;
        int $pc55 = 4;
        $sw55: while (true) {
            switch ($pc55) {
                case 13: {
                    th = $ex55;
                    if (FH == false) { $pc55 = 18; continue $sw55; }
                    abcd.wu.j6(th, -1201739983827008737L, null);
                    $pc55 = 18; continue $sw55;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc55 = 6; continue $sw55; }
                    try {
                        abcd.wu.j6(-1201739983827008737L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 13; continue $sw55;
                    }
                    $pc55 = 6; continue $sw55;
                }
                case 6: {
                    try {
                        r3 = new java.util.ArrayList();
                        r4 = abcd.EnumMd.values();
                        r5 = r4.length;
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 13; continue $sw55;
                    }
                    r7 = 0;
                    $pc55 = 7; continue $sw55;
                }
                case 7: {
                    if (r7 >= r5) { $pc55 = 12; continue $sw55; }
                    try {
                        r8 = r4[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 13; continue $sw55;
                    }
                    if (ef().getBoolean(r8.VH(), false) == false) { $pc55 = 11; continue $sw55; }
                    try {
                        r3.add(r8.name());
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 13; continue $sw55;
                    }
                    $pc55 = 11; continue $sw55;
                }
                case 11: {
                    r7 = r7 + 1;
                    { $pc55 = 7; continue $sw55; }
                }
                case 12: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
