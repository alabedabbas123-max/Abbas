package com.aide.ui.scm;

@abcd.Interfacexu
class da implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final int Hw;
    final com.aide.ui.scm.ua.a v5;

    static {
        abcd.wu.j6(com.aide.ui.scm.da.class, 873297534694796477L, -1032746071531138359L);
    }

    da(com.aide.ui.scm.ua.a r1, java.lang.String r2, int r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1662744910059815776L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1117794967926390359L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1117794967926390359L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.scm.ua.a.DW(this.v5, this.FH);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.scm.ua.a.DW(this.v5, this.Hw);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.scm.ua.a.Hw(this.v5);     // Catch: java.lang.Throwable -> L8
    }
}
