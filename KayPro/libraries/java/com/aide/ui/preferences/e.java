package com.aide.ui.preferences;

@abcd.Interfacexu
class e implements android.preference.Preference.OnPreferenceClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.CompilerPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.e.class, -428726247933224307L, 1948955670862629976L);
    }

    e(com.aide.ui.preferences.CompilerPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2817226545656366976L)
    public boolean onPreferenceClick(android.preference.Preference r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, 159816435729805689L, this, r5);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(159816435729805689L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.U.rN().Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
