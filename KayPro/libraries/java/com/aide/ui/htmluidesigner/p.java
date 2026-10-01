package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class p implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.webkit.JsPromptResult FH;
    final com.aide.ui.htmluidesigner.q Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.p.class, -3499094272017024501L, 1074981494104983712L);
    }

    p(com.aide.ui.htmluidesigner.q r1, android.webkit.JsPromptResult r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -406622161014985551L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5142811909600764116L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5142811909600764116L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.cancel();     // Catch: java.lang.Throwable -> L8
    }
}
