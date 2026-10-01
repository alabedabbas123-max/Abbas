package com.aide.common;

@abcd.Interfacexu
class Ua implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    static {
        abcd.wu.j6(com.aide.common.Ua.class, 1991841546302420120L, -5453420743064404704L);
    }

    Ua(android.app.Activity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 949481473298366385L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1193292265881512353L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1193292265881512353L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Wa.DW(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
