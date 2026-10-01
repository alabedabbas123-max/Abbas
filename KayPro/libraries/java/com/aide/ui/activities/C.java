package com.aide.ui.activities;

@abcd.Interfacexu
class C extends android.webkit.WebViewClient {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2680131499878197312L)
    private java.util.Map<java.lang.String, java.util.zip.ZipFile> FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.HelpViewActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.C.class, 1721226910917733920L, 2633621312026298256L);
    }

    C(com.aide.ui.activities.HelpViewActivity r1) {
        this.Hw = r1;
        this.FH = new java.util.HashMap();
    }

    @Override
    @abcd.Interfacesu(method = 1605468893116744920L)
    public void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2542227171076479600L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2542227171076479600L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw.setProgressBarIndeterminateVisibility(false);     // Catch: java.lang.Throwable -> L7
        super.onPageFinished(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -1108096552979537905L)
    public void onPageStarted(android.webkit.WebView r9, java.lang.String r10, android.graphics.Bitmap r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2965531130095893129L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2965531130095893129L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw.setProgressBarIndeterminateVisibility(true);     // Catch: java.lang.Throwable -> L7
        super.onPageStarted(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = 2062492683820917712L)
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r8, java.lang.String r9) {
    L27:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 3187824047861788856L, this, r8, r9);
    L31:
        throw th;
    L3:
        if (j6 == false) goto L33;
        abcd.wu.j6(3187824047861788856L, this, r8, r9);     // Catch: java.lang.Throwable -> L27
    L33:
        java.lang.String r0 = r9.toLowerCase(java.util.Locale.US);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (r0.startsWith("file:") == false) goto L23;
        int r1 = r0.indexOf(".zip/");     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (r1 == (-1)) goto L23;
        java.lang.String r2 = r9.substring(5, r1 + 4);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (this.FH.containsKey(r2) == true) goto L12;
        com.aide.common.ClassH.j6("Loading zip file:" + r2);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        this.FH.put(r2, new java.util.zip.ZipFile(r2));     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
    L12:
        java.util.zip.ZipFile r3 = this.FH.get(r2);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (r3 == null) goto L23;
        int r4 = r1 + 5;     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        int r5 = java.lang.Math.max(r9.indexOf(35), r9.indexOf("?"));     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (r5 >= 0) goto L17;
        java.lang.String r6 = r9.substring(r4);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
    L18:
        java.util.zip.ZipEntry r7 = r3.getEntry(r6);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
        if (r7 == null) goto L23;
        return new android.webkit.WebResourceResponse(null, null, r3.getInputStream(r7));
    L17:
        r6 = r9.substring(r4, r5);     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L27
    L23:
        return super.shouldInterceptRequest(r8, r9);
    L24:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L27
        return super.shouldInterceptRequest(r8, r9);
    }

    @Override
    @abcd.Interfacesu(method = 49162854828881136L)
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 463494916433972288L, this, r8, r9);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(463494916433972288L, this, r8, r9);     // Catch: java.lang.Throwable -> L8
    L5:
        r8.loadUrl(r9);     // Catch: java.lang.Throwable -> L8
        return true;
    }
}
