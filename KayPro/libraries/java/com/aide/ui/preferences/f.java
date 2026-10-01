package com.aide.ui.preferences;

@abcd.Interfacexu
class f implements android.preference.Preference.OnPreferenceClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.EditorPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.f.class, 3965846732176511403L, 295909702281894656L);
    }

    f(com.aide.ui.preferences.EditorPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2299810909030169535L)
    public boolean onPreferenceClick(android.preference.Preference r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, 854338464725193640L, this, r5);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(854338464725193640L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.U.u7().j6(this.FH.getActivity());
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
