package com.aide.common;

@abcd.Interfacexu
class Runnablem implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ClassN FH;

    static {
        abcd.wu.j6(com.aide.common.Runnablem.class, 1009115569069974369L, 4951476194642365813L);
    }

    Runnablem(com.aide.common.ClassN r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1761068182524048525L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1222688143799863455L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1222688143799863455L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.common.ClassN.j6(this.FH) == false) goto L17;
        com.aide.common.ClassN.j6(this.FH, false);     // Catch: java.lang.Throwable -> L10
        com.aide.common.ClassN.DW(this.FH);     // Catch: java.lang.Throwable -> L10
        return;
    }
}
