package com.aide.ui;

@abcd.Interfacexu
class Q implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    static {
        abcd.wu.j6(com.aide.ui.Q.class, -453326632858448869L, 457042280351436384L);
    }

    Q(java.lang.Runnable r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 745571020612975260L)
    public void run() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -6989045231720881980L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-6989045231720881980L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (com.aide.ui.U.sh() == false) goto L20;
        return;
    L20:
        this.FH.run();     // Catch: java.lang.Throwable -> L11
    L22:
        return;
    L11:
        th = move-exception;
        com.aide.common.ClassH.DW(th);     // Catch: java.lang.Throwable -> L14
    }
}
