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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 2542227171076479600L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(2542227171076479600L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Hw.setProgressBarIndeterminateVisibility(false);
                        super.onPageFinished(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1108096552979537905L)
    public void onPageStarted(android.webkit.WebView r9, java.lang.String r10, android.graphics.Bitmap r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 2965531130095893129L, this, r9, r10, r11);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(2965531130095893129L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        this.Hw.setProgressBarIndeterminateVisibility(true);
                        super.onPageStarted(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2062492683820917712L)
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r8, java.lang.String r9) {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.String r2 = null;
        java.util.zip.ZipFile r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.String r6 = null;
        java.util.zip.ZipEntry r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 31; continue $sw2; }
                    abcd.wu.j6(th, 3187824047861788856L, this, r8, r9);
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 33; continue $sw2; }
                    try {
                        abcd.wu.j6(3187824047861788856L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 33; continue $sw2;
                }
                case 33: {
                    try {
                        r0 = r9.toLowerCase(java.util.Locale.US);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (r0.startsWith("file:") == false) { $pc2 = 23; continue $sw2; }
                    try {
                        r1 = r0.indexOf(".zip/");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (r1 == (-1)) { $pc2 = 23; continue $sw2; }
                    try {
                        r2 = r9.substring(5, r1 + 4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (this.FH.containsKey(r2) == true) { $pc2 = 12; continue $sw2; }
                    try {
                        com.aide.common.ClassH.j6("Loading zip file:" + r2);
                        this.FH.put(r2, new java.util.zip.ZipFile(r2));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        r3 = this.FH.get(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (r3 == null) { $pc2 = 23; continue $sw2; }
                    try {
                        r4 = r1 + 5;
                        r5 = java.lang.Math.max(r9.indexOf(35), r9.indexOf("?"));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (r5 >= 0) { $pc2 = 17; continue $sw2; }
                    try {
                        r6 = r9.substring(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    try {
                        r7 = r3.getEntry(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    if (r7 == null) { $pc2 = 23; continue $sw2; }
                    return new android.webkit.WebResourceResponse(null, null, r3.getInputStream(r7));
                }
                case 17: {
                    try {
                        r6 = r9.substring(r4, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 24; continue $sw2; }
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    return super.shouldInterceptRequest(r8, r9);
                }
                case 24: {
                    e = $ex2;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    return super.shouldInterceptRequest(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 49162854828881136L)
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 463494916433972288L, this, r8, r9);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(463494916433972288L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        r8.loadUrl(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
