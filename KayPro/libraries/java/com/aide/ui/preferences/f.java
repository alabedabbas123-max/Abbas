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
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 854338464725193640L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(854338464725193640L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        com.aide.ui.U.u7().j6(this.FH.getActivity());     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
