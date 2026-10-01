package com.aide.ui;

@abcd.Interfacexu
class S implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.T FH;

    static {
        abcd.wu.j6(com.aide.ui.S.class, -453326632858448869L, 58481658203938788L);
    }

    S(com.aide.ui.T r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -108329289364888992L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -114968441803585188L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-114968441803585188L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        this.FH.Hw.dismiss();     // Catch: java.lang.Throwable -> L10
        if (this.FH.v5 == null) goto L17;
        this.FH.v5.run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
