package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class r implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity.a Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.r.class, 38387212539063993L, 1714142117894140152L);
    }

    r(com.aide.ui.htmluidesigner.WebDesignActivity.a r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2709414434374600596L)
    public void onClick(android.view.View r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2157579063481270471L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2157579063481270471L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.Intent r2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(com.aide.ui.htmluidesigner.WebDesignActivity.a.j6(this.Hw)));     // Catch: java.lang.Throwable -> L8
        this.FH.startActivity(r2);     // Catch: java.lang.Throwable -> L8
    }
}
