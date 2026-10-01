package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class j extends android.webkit.WebViewClient {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.j.class, -3499094272017024501L, -3746849830615376421L);
    }

    j(com.aide.ui.htmluidesigner.WebDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 5471001393546355796L)
    public void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 4183806540953912584L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4183806540953912584L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L5:
        super.onPageFinished(r8, r9);     // Catch: java.lang.Throwable -> L9
        if (com.aide.ui.htmluidesigner.WebDesignActivity.FH(this.FH) == false) goto L16;
        this.FH.DW();     // Catch: java.lang.Throwable -> L9
        return;
    }

    @Override
    @abcd.Interfacesu(method = -4915973142547744908L)
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3822537109747323856L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3822537109747323856L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        if (r9.startsWith(com.aide.ui.htmluidesigner.WebDesignActivity.j6()) == false) goto L9;
        return false;
    L9:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r9));     // Catch: java.lang.Throwable -> L12
        this.FH.startActivity(r0);     // Catch: java.lang.Throwable -> L12
        return true;
    }
}
