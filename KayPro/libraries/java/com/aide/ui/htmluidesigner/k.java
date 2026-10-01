package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class k implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.webkit.JsResult FH;
    final com.aide.ui.htmluidesigner.q Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.k.class, -3499094272017024501L, 1074880532275067307L);
    }

    k(com.aide.ui.htmluidesigner.q r1, android.webkit.JsResult r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 645707047415835597L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5156911790469373092L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5156911790469373092L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.confirm();     // Catch: java.lang.Throwable -> L8
    }
}
