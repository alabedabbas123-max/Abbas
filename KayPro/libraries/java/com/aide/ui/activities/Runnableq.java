package com.aide.ui.activities;

@abcd.Interfacexu
class Runnableq implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final java.lang.String Hw;
    final com.aide.ui.activities.Binders v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnableq.class, -667729815873843261L, -3645438587524209996L);
    }

    Runnableq(com.aide.ui.activities.Binders r1, java.util.List r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1122107774062869825L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1306346713029841333L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1306346713029841333L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.activities.GotoBrowserActivity.j6(this.v5.v5, false, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
