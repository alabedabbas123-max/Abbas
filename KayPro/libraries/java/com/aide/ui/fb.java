package com.aide.ui;

@abcd.Interfacexu
class fb implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.LinearLayout Hw;

    @abcd.Interfacevu
    final com.aide.ui.hb v5;

    static {
        abcd.wu.j6(com.aide.ui.fb.class, -1144715414290518888L, 5656425135155951800L);
    }

    fb(com.aide.ui.hb r1, android.app.Activity r2, android.widget.LinearLayout r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1364481211284778080L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -24162740371744296L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-24162740371744296L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.hb.j6(this.v5, false);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.hb.j6(this.v5, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
