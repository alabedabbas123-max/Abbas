package com.aide.uidesigner;

@abcd.Interfacexu
class Runnablem implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;
    final android.view.animation.TranslateAnimation Hw;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.Runnablem.class, -2761603648942096159L, 1467865334420444229L);
    }

    Runnablem(com.aide.uidesigner.XmlLayoutDesignActivity r1, android.view.View r2, android.view.animation.TranslateAnimation r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -1247581826716242836L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2263316793570582067L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2263316793570582067L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.j6();     // Catch: java.lang.Throwable -> L8
        this.FH.setVisibility(0);     // Catch: java.lang.Throwable -> L8
        this.FH.startAnimation(this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
