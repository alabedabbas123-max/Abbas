package com.aide.ui.activities;

@abcd.Interfacexu
class aa implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.support.v4.widget.DrawerLayout FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.aa.class, 3404442532748635224L, -1331471971261592167L);
    }

    aa(com.aide.ui.activities.TrainerCourseActivity r1, android.support.v4.widget.DrawerLayout r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -4039329949657071501L)
    public void onFocusChange(android.view.View r8, boolean r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 4802211412874791428L, this, r8, new java.lang.Boolean(r9));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(4802211412874791428L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L9
    L6:
        if (this.FH.Zo(3) == true) goto L16;
        com.aide.ui.activities.TrainerCourseActivity.j6(this.Hw);     // Catch: java.lang.Throwable -> L9
        return;
    }
}
