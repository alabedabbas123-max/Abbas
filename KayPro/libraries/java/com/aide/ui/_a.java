package com.aide.ui;

@abcd.Interfacexu
class _a implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    static {
        abcd.wu.j6(com.aide.ui._a.class, -1144715414290518888L, -5081862705202739575L);
    }

    _a(android.app.Activity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1619673078899615364L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2860847286781901524L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2860847286781901524L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.ib.j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
