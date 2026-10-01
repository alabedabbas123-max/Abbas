package com.aide.ui.preferences;

@abcd.Interfacexu
class c implements android.preference.Preference.OnPreferenceClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.CompilerPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.c.class, -428726247933224307L, 1948674964407329400L);
    }

    c(com.aide.ui.preferences.CompilerPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -5457426926717136700L)
    public boolean onPreferenceClick(android.preference.Preference r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 619451628614520645L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(619451628614520645L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        com.aide.ui.U.aM().j6(this.FH.getActivity());     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
