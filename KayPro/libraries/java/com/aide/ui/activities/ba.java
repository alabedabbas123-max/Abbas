package com.aide.ui.activities;

@abcd.Interfacexu
class ba implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.support.v4.widget.DrawerLayout FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ba.class, 3404442532748635224L, -1331501972898162400L);
    }

    ba(com.aide.ui.activities.TrainerCourseActivity r1, android.support.v4.widget.DrawerLayout r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1453208691491436792L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -502325787831773624L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-502325787831773624L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.gn(3);     // Catch: java.lang.Throwable -> L8
    }
}
