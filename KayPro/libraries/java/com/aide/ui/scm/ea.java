package com.aide.ui.scm;

@abcd.Interfacexu
class ea implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final com.aide.ui.scm.ua.a Hw;

    static {
        abcd.wu.j6(com.aide.ui.scm.ea.class, 873297534694796477L, -1032799987952423960L);
    }

    ea(com.aide.ui.scm.ua.a r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 127472594771567329L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2446222350851367613L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2446222350851367613L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.scm.ua.a.FH(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.scm.ua.a.Hw(this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
