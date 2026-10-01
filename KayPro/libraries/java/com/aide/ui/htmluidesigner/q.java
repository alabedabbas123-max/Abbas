package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class q extends android.webkit.WebChromeClient {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.q.class, -3499094272017024501L, -3746934368582395340L);
    }

    q(com.aide.ui.htmluidesigner.WebDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2014706269434322863L)
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r6) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -64329166240410464L, this, r6);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-64329166240410464L, this, r6);     // Catch: java.lang.Throwable -> L19
    L6:
        int r2 = com.aide.ui.htmluidesigner.b.j6[r6.messageLevel().ordinal()];     // Catch: java.lang.Throwable -> L19
        if (r2 != 3) goto L10;
        android.util.Log.d("console.log", r6.message());     // Catch: java.lang.Throwable -> L19
        return true;
    L10:
        if (r2 != 4) goto L12;
        android.util.Log.e("console.log", r6.message());     // Catch: java.lang.Throwable -> L19
        return true;
    L12:
        if (r2 == 5) goto L14;
        android.util.Log.i("console.log", r6.message());     // Catch: java.lang.Throwable -> L19
        return true;
    L14:
        android.util.Log.w("console.log", r6.message());     // Catch: java.lang.Throwable -> L19
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -2925631351221743685L)
    public boolean onJsAlert(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6028504839843014140L, this, r10, r11, r12, r13);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6028504839843014140L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L8
    L5:
        com.aide.common.Abstractma.j6(this.FH, null, r12, new com.aide.ui.htmluidesigner.k(this, r13));     // Catch: java.lang.Throwable -> L8
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -5335534847409547795L)
    public boolean onJsConfirm(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1846931186399642184L, this, r10, r11, r12, r13);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1846931186399642184L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L8
    L5:
        com.aide.common.Abstractma.j6(this.FH, null, r12, "Ok", new com.aide.ui.htmluidesigner.l(this, r13), "Cancel", new com.aide.ui.htmluidesigner.m(this, r13), new com.aide.ui.htmluidesigner.n(this, r13));     // Catch: java.lang.Throwable -> L8
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -6101972117426808133L)
    public boolean onJsPrompt(android.webkit.WebView r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, android.webkit.JsPromptResult r15) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6408234271488165328L, this, r11, r12, r13, r14, r15);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6408234271488165328L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L8
    L5:
        com.aide.common.Abstractma.j6(this.FH, null, r13, r14, new com.aide.ui.htmluidesigner.o(this, r15), new com.aide.ui.htmluidesigner.p(this, r15));     // Catch: java.lang.Throwable -> L8
        return true;
    }
}
