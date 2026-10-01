package com.aide.ui;

@abcd.Interfacexu
class Runnableia implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Gk.a FH;

    @abcd.Interfacevu
    final com.aide.ui.LogCatConsole Hw;

    static {
        abcd.wu.j6(com.aide.ui.Runnableia.class, -3643350297993287765L, -3595474554498153820L);
    }

    Runnableia(com.aide.ui.LogCatConsole r1, abcd.Gk.a r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1909090655777661525L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4401853760120742387L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4401853760120742387L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.LogCatConsole.DW(this.Hw).j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
