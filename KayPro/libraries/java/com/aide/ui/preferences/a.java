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
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -102920910807992940L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-102920910807992940L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r9.startsWith("about:fire-away") == true) goto L10;
        return super.shouldOverrideUrlLoading(r8, r9);
    L10:
        throw new com.aide.ui.preferences.AboutActivity.a(this.FH, "test");     // Catch: java.lang.Throwable -> L11
    }
}
