package com.aide.ui.preferences;

@abcd.Interfacexu
public class AboutActivity extends com.almlkaide.kaypro.app.base.BaseActivity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    private class a extends java.lang.RuntimeException {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.preferences.AboutActivity FH;

        static {
            abcd.wu.j6(com.aide.ui.preferences.AboutActivity.a.class, 5575741101544787088L, 5575741101544787088L);
        }

        @abcd.Interfacesu(method = -5955057125685462665L)
        public a(com.aide.ui.preferences.AboutActivity r8, java.lang.String r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 2850133146999382920L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(2850133146999382920L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r8;     // Catch: java.lang.Throwable -> L7
            super(r9);     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.preferences.AboutActivity.class, -276713602380952000L, -276713602380952000L);
    }

    public AboutActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2050741202738764032L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2050741202738764032L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 42771676995091539L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-196565785100227957L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onCreate(r10);     // Catch: java.lang.Throwable -> L8
        setContentView(com.almlkaide.kaypro.R.layout.about);     // Catch: java.lang.Throwable -> L8
        android.webkit.WebView r0 = (android.webkit.WebView) findViewById(com.almlkaide.kaypro.R.id.aboutWebView);     // Catch: java.lang.Throwable -> L8
        r0.loadUrl("file:///android_asset/license.html");     // Catch: java.lang.Throwable -> L8
        r0.setWebViewClient(new com.aide.ui.preferences.a(this));     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -196565785100227957L, this, r10);
    L12:
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -3048323203018338671L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -961780475002909575L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-961780475002909575L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "About");     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -647763648644063023L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1659134853741421225L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1659134853741421225L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "About");     // Catch: java.lang.Throwable -> L8
    }
}
