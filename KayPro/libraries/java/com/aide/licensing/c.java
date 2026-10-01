package com.aide.licensing;

@abcd.Interfacexu
class c implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final java.lang.String Hw;
    final com.aide.licensing.d.a Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.licensing.c.class, -90332927685326755L, 684254400747100216L);
    }

    c(com.aide.licensing.d.a r1, int r2, java.lang.String r3, java.lang.String r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -944092842990203347L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4328069808734210520L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4328069808734210520L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.licensing.d.j6(this.Zo.Zo, 0);     // Catch: java.lang.Throwable -> L8
        com.aide.licensing.d.j6(this.Zo.Zo, com.aide.licensing.d.a.j6(this.Zo), this.FH, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L8
    }
}
