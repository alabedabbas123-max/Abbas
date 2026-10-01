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
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 19: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, -64329166240410464L, this, r6);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-64329166240410464L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.htmluidesigner.b.j6[r6.messageLevel().ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (r2 != 3) { $pc0 = 10; continue $sw0; }
                    try {
                        android.util.Log.d("console.log", r6.message());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return true;
                }
                case 10: {
                    if (r2 != 4) { $pc0 = 12; continue $sw0; }
                    try {
                        android.util.Log.e("console.log", r6.message());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return true;
                }
                case 12: {
                    if (r2 == 5) { $pc0 = 14; continue $sw0; }
                    try {
                        android.util.Log.i("console.log", r6.message());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return true;
                }
                case 14: {
                    try {
                        android.util.Log.w("console.log", r6.message());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2925631351221743685L)
    public boolean onJsAlert(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 6028504839843014140L, this, r10, r11, r12, r13);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(6028504839843014140L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        com.aide.common.Abstractma.j6(this.FH, null, r12, new com.aide.ui.htmluidesigner.k(this, r13));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -5335534847409547795L)
    public boolean onJsConfirm(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, android.webkit.JsResult r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1846931186399642184L, this, r10, r11, r12, r13);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(1846931186399642184L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        com.aide.common.Abstractma.j6(this.FH, null, r12, "Ok", new com.aide.ui.htmluidesigner.l(this, r13), "Cancel", new com.aide.ui.htmluidesigner.m(this, r13), new com.aide.ui.htmluidesigner.n(this, r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -6101972117426808133L)
    public boolean onJsPrompt(android.webkit.WebView r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, android.webkit.JsPromptResult r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -6408234271488165328L, this, r11, r12, r13, r14, r15);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-6408234271488165328L, this, r11, r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        com.aide.common.Abstractma.j6(this.FH, null, r13, r14, new com.aide.ui.htmluidesigner.o(this, r15), new com.aide.ui.htmluidesigner.p(this, r15));
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
