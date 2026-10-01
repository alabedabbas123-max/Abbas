package com.aide.ui.preferences;

@abcd.Interfacexu
class g implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.KeyBindingsPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.g.class, 341889297030401769L, 159513137324753568L);
    }

    g(com.aide.ui.preferences.KeyBindingsPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1328183033938220000L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -851003983592724299L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-851003983592724299L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        com.aide.ui.U.j3().DW();     // Catch: java.lang.Throwable -> L10
        android.view.View r2 = this.FH.getView();     // Catch: java.lang.Throwable -> L10
        if ((r2 instanceof com.aide.ui.preferences.KeyBindingsView) == false) goto L17;
        ((com.aide.ui.preferences.KeyBindingsView) r2).j6();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
