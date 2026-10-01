package com.aide.ui.preferences;

@abcd.Interfacexu
class d implements android.preference.Preference.OnPreferenceClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.CompilerPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.d.class, -428726247933224307L, 1948815317632948041L);
    }

    d(com.aide.ui.preferences.CompilerPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1093435592300743992L)
    public boolean onPreferenceClick(android.preference.Preference r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 389735033394155904L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(389735033394155904L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        com.aide.ui.U.u7().DW(this.FH.getActivity());     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
