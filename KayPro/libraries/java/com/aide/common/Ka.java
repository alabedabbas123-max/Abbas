package com.aide.common;

@abcd.Interfacexu
class Ka implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final java.lang.String Hw;
    final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.common.Ka.class, 1991841546302420120L, 4295728741347103973L);
    }

    Ka(android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    @abcd.Interfacesu(method = -1417385123606171936L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -197754020620649909L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-197754020620649909L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Ha.DW(this.FH, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L8
    }
}
