package com.aide.ui.preferences;

@abcd.Interfacexu
class a extends android.webkit.WebViewClient {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.AboutActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.a.class, -276713602380952000L, -1135282720185906047L);
    }

    a(com.aide.ui.preferences.AboutActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1575582404901419537L)
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -102920910807992940L, this, r8, r9);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-102920910807992940L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r9.startsWith("about:fire-away") == true) { $pc0 = 10; continue $sw0; }
                    return super.shouldOverrideUrlLoading(r8, r9);
                }
                case 10: {
                    try {
                        throw new com.aide.ui.preferences.AboutActivity.a(this.FH, "test");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
