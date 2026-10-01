package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class m implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.webkit.JsResult FH;
    final com.aide.ui.htmluidesigner.q Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.m.class, -3499094272017024501L, 1074920916994843987L);
    }

    m(com.aide.ui.htmluidesigner.q r1, android.webkit.JsResult r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -2697388097892029232L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5149862818420718784L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5149862818420718784L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.cancel();     // Catch: java.lang.Throwable -> L8
    }
}
