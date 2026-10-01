package com.aide.ui.preferences;

@abcd.Interfacexu
public class b {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.preferences.b.class, -4279537788465023376L, -4279537788465023376L);
    }

    public b() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -512342087741497743L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-512342087741497743L, null);
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

    public static void DW(android.content.Context r13, android.preference.PreferenceScreen r14) {
        abcd.Enumid[] r3 = null;
        int r5 = 0;
        android.preference.PreferenceCategory r7 = null;
        int r4 = 0;
        abcd.Enumid r8 = null;
        com.aide.ui.preferences.PremiumCheckBoxPreference r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 19: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 24; continue $sw1; }
                    abcd.wu.j6(th, -6390746408990753400L, null, r13, r14);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-6390746408990753400L, null, r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = abcd.Enumid.values();
                        r5 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    r7 = null;
                    r4 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r4 >= r5) { $pc1 = 18; continue $sw1; }
                    try {
                        r8 = r3[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r7 != null) { $pc1 = 11; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    try {
                        r7 = new android.preference.PreferenceCategory(r13);
                        r7.setTitle(r8.Zo());
                        r14.addPreference(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    try {
                        r9 = new com.aide.ui.preferences.PremiumCheckBoxPreference(r13);
                        r9.setKey(r8.VH());
                        r9.setTitle(r8.getName());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r8.j6(false).length() <= 0) { $pc1 = 16; continue $sw1; }
                    try {
                        r9.setSummary(("\"" + r8.j6(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + r8.j6(true).replace("\n", "\\n") + "\""));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    try {
                        r7.addPreference(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    r4 = r4 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 11: {
                    if (r7.getTitle().equals(r8.Zo()) == true) { $pc1 = 13; continue $sw1; }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(android.content.Context r13, android.preference.PreferenceScreen r14) {
        abcd.EnumMd[] r3 = null;
        int r5 = 0;
        android.preference.PreferenceCategory r7 = null;
        int r4 = 0;
        abcd.EnumMd r8 = null;
        com.aide.ui.preferences.PremiumCheckBoxPreference r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 19: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 24; continue $sw2; }
                    abcd.wu.j6(th, -6107569869657035195L, null, r13, r14);
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-6107569869657035195L, null, r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r3 = abcd.EnumMd.values();
                        r5 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    r7 = null;
                    r4 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r4 >= r5) { $pc2 = 18; continue $sw2; }
                    try {
                        r8 = r3[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    if (r7 != null) { $pc2 = 11; continue $sw2; }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        r7 = new android.preference.PreferenceCategory(r13);
                        r7.setTitle(r8.Zo());
                        r14.addPreference(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    try {
                        r9 = new com.aide.ui.preferences.PremiumCheckBoxPreference(r13);
                        r9.setKey(r8.VH());
                        r9.setTitle(r8.getName());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    if (r8.j6(false).length() <= 0) { $pc2 = 16; continue $sw2; }
                    try {
                        r9.setSummary(("\"" + r8.j6(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + r8.j6(true).replace("\n", "\\n") + "\""));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    try {
                        r7.addPreference(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    r4 = r4 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 11: {
                    if (r7.getTitle().equals(r8.Zo()) == true) { $pc2 = 13; continue $sw2; }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, android.preference.PreferenceScreen r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 18: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 22; continue $sw3; }
                    abcd.wu.j6(th, 1653182198676246961L, null, r7, r8);
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1653182198676246961L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (com.aide.ui.U.ef() == false) { $pc3 = 8; continue $sw3; }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    try {
                        FH(r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (com.aide.ui.U.ef() == false) { $pc3 = 15; continue $sw3; }
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    try {
                        DW(r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    return;
                }
                case 15: {
                    if (com.aide.ui.U.j6.equals("com.aide.ui") == true) { $pc3 = 16; continue $sw3; }
                    return;
                }
                case 8: {
                    if (com.aide.ui.U.j6.equals("com.aide.phonegap") == true) { $pc3 = 11; continue $sw3; }
                    if (com.aide.ui.U.j6.equals("com.aide.web") == false) { $pc3 = 13; continue $sw3; }
                    { $pc3 = 11; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
