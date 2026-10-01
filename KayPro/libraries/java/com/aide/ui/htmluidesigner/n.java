package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class n implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.webkit.JsResult FH;
    final com.aide.ui.htmluidesigner.q Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.n.class, -3499094272017024501L, 1074941109360827268L);
    }

    n(com.aide.ui.htmluidesigner.q r1, android.webkit.JsResult r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2315834711352482040L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5146337606107153995L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5146337606107153995L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.cancel();     // Catch: java.lang.Throwable -> L8
    }
}
