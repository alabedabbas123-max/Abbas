package com.aide.ui;

@abcd.Interfacexu
class T implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;
    final android.app.ProgressDialog Hw;
    final java.lang.Runnable v5;

    static {
        abcd.wu.j6(com.aide.ui.T.class, -453326632858448869L, 457071312915294115L);
    }

    T(java.lang.Runnable r1, android.app.ProgressDialog r2, java.lang.Runnable r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    @abcd.Interfacesu(method = -502197465834385985L)
    public void run() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -116600052537112547L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L17;
        abcd.wu.j6(-116600052537112547L, this);     // Catch: java.lang.Throwable -> L12
    L17:
        this.FH.run();     // Catch: java.lang.Throwable -> L9
        com.aide.ui.U.j6(new com.aide.ui.S(this));     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        th = move-exception;
        com.aide.ui.U.j6(new com.aide.ui.S(this));     // Catch: java.lang.Throwable -> L12
        throw th;     // Catch: java.lang.Throwable -> L12
    }
}
