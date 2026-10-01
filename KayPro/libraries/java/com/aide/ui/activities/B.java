package com.aide.ui.activities;

@abcd.Interfacexu
class B implements android.app.ActionBar.OnNavigationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.HelpViewActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.B.class, 1721226910917733920L, 2633498567436976501L);
    }

    B(com.aide.ui.activities.HelpViewActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 5524384594919569775L)
    public boolean onNavigationItemSelected(int r8, long r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -526981627819788264L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-526981627819788264L, this, new java.lang.Integer(r8), new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r8 == com.aide.ui.activities.HelpViewActivity.j6(this.FH)) goto L17;
        com.aide.ui.activities.HelpViewActivity.j6(this.FH, r8);     // Catch: java.lang.Throwable -> L10
        com.aide.ui.activities.Enumo r0 = com.aide.ui.activities.Enumo.Mr()[r8];     // Catch: java.lang.Throwable -> L10
        com.aide.ui.activities.HelpViewActivity.DW(this.FH).getSettings().setJavaScriptEnabled(r0.a8());     // Catch: java.lang.Throwable -> L10
        com.aide.ui.activities.HelpViewActivity.DW(this.FH).loadUrl(r0.j3());     // Catch: java.lang.Throwable -> L10
        com.aide.ui.activities.HelpViewActivity.DW(this.FH).clearHistory();     // Catch: java.lang.Throwable -> L10
        return true;
    L17:
        return true;
    }
}
