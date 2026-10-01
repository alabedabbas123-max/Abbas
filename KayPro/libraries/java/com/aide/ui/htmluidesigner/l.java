package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class l implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.webkit.JsResult FH;
    final com.aide.ui.htmluidesigner.q Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.l.class, -3499094272017024501L, 1074900724632924000L);
    }

    l(com.aide.ui.htmluidesigner.q r1, android.webkit.JsResult r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 789952750991647500L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5153387546541458483L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5153387546541458483L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.confirm();     // Catch: java.lang.Throwable -> L8
    }
}
