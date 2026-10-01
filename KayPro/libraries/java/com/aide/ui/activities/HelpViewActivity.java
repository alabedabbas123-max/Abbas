package com.aide.ui.activities;

@abcd.Interfacexu
public class HelpViewActivity extends com.aide.ui.ThemedActionbarActivity {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 595896484329092100L)
    private int Zo;

    @abcd.Interfaceru(field = 2698718083271816821L)
    private android.webkit.WebView v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.HelpViewActivity.class, 1721226910917733920L, 1721226910917733920L);
    }

    public HelpViewActivity() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2309172973102533321L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2309172973102533321L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = -1;     // Catch: java.lang.Throwable -> L8
    }

    static android.webkit.WebView DW(com.aide.ui.activities.HelpViewActivity r0) {
        return r0.v5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -4124444813984143425L)
    private void DW() {
    L19:
        th = move-exception;
        if (Hw == false) goto L23;
        abcd.wu.j6(th, -433104281240322048L, this);
    L23:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-433104281240322048L, this);     // Catch: java.lang.Throwable -> L19
    L7:
        if ((getIntent().getFlags() & 1048576) == 0) goto L9;
        return;
    L9:
        java.lang.String r2 = getIntent().getExtras().getString("EXTRA_URL");     // Catch: java.lang.Throwable -> L19
        com.aide.ui.activities.Enumo r3 = com.aide.ui.activities.Enumo.valueOf(getIntent().getExtras().getString("EXTRA_CAT"));     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L19
    L13:
        this.Zo = r3.U2();     // Catch: java.lang.Throwable -> L19
        getActionBar().setSelectedNavigationItem(r3.U2());     // Catch: java.lang.Throwable -> L19
        this.v5.getSettings().setJavaScriptEnabled(r3.a8());     // Catch: java.lang.Throwable -> L19
        if (r2 == null) goto L16;
        java.lang.String r4 = r3.j6(r2);     // Catch: java.lang.Throwable -> L19
        this.v5.loadUrl(r4);     // Catch: java.lang.Throwable -> L19
    L17:
        this.v5.clearHistory();     // Catch: java.lang.Throwable -> L19
        return;
    L16:
        this.v5.loadUrl(r3.j3());     // Catch: java.lang.Throwable -> L19
        goto L17
    L12:
        r3 = com.aide.ui.activities.Enumo.j6;     // Catch: java.lang.Throwable -> L19
        goto L13
    }

    static int j6(com.aide.ui.activities.HelpViewActivity r0) {
        return r0.Zo;
    }

    static int j6(com.aide.ui.activities.HelpViewActivity r0, int r1) {
        r0.Zo = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 5707193758910450548L)
    protected void onActivityResult(int r9, int r10, android.content.Intent r11) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 783336897775448625L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(783336897775448625L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L5:
        abcd.wu.j6(this, r9, r10, r11);     // Catch: java.lang.Throwable -> L9
        if (r9 != 1194684) goto L16;
        com.aide.ui.U.QX().j6(r11);     // Catch: java.lang.Throwable -> L9
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 4563051634718463648L, this);
    L15:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(4563051634718463648L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        android.webkit.WebView r2 = (android.webkit.WebView) findViewById(com.almlkaide.kaypro.R.id.helpViewWebView);     // Catch: java.lang.Throwable -> L11
        if (r2.canGoBack() == false) goto L9;
        r2.goBack();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        super/*android.app.Activity*/.onBackPressed();     // Catch: java.lang.Throwable -> L11
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    @abcd.Interfacesu(method = -1243962678627493464L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L12
        if (FH == false) goto L6;
        abcd.wu.j6(-535683229713776625L, this, r10);     // Catch: java.lang.Throwable -> L12
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L12
        requestWindowFeature(5);     // Catch: java.lang.Throwable -> L12
        getActionBar().setDisplayShowTitleEnabled(false);     // Catch: java.lang.Throwable -> L12
        getActionBar().setNavigationMode(1);     // Catch: java.lang.Throwable -> L12
        java.lang.String[] r0 = new java.lang.String[com.aide.ui.activities.Enumo.Mr().length];     // Catch: java.lang.Throwable -> L12
        int r3 = 0;
    L8:
        if (r3 >= r0.length) goto L10;
        r0[r3] = com.aide.ui.activities.Enumo.Mr()[r3].Ws();     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        getActionBar().setListNavigationCallbacks(new android.widget.ArrayAdapter(this, 17367049, r0), new com.aide.ui.activities.B(this));     // Catch: java.lang.Throwable -> L12
        getActionBar().setSelectedNavigationItem(0);     // Catch: java.lang.Throwable -> L12
        setTitle("");     // Catch: java.lang.Throwable -> L12
        setContentView(com.almlkaide.kaypro.R.layout.helpview);     // Catch: java.lang.Throwable -> L12
        com.aide.common.ClassG.j6(findViewById(com.almlkaide.kaypro.R.id.helpViewFrame));     // Catch: java.lang.Throwable -> L12
        setProgressBarIndeterminate(true);     // Catch: java.lang.Throwable -> L12
        setProgressBarIndeterminateVisibility(true);     // Catch: java.lang.Throwable -> L12
        this.v5 = (android.webkit.WebView) findViewById(com.almlkaide.kaypro.R.id.helpViewWebView);     // Catch: java.lang.Throwable -> L12
        this.v5.getSettings().setUseWideViewPort(true);     // Catch: java.lang.Throwable -> L12
        this.v5.getSettings().setSupportZoom(true);     // Catch: java.lang.Throwable -> L12
        this.v5.getSettings().setBuiltInZoomControls(true);     // Catch: java.lang.Throwable -> L12
        this.v5.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.FAR);     // Catch: java.lang.Throwable -> L12
        this.v5.setWebViewClient(new com.aide.ui.activities.C(this));     // Catch: java.lang.Throwable -> L12
        DW();     // Catch: java.lang.Throwable -> L12
        return;
    L12:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -535683229713776625L, this, r10);
    L17:
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 4246883783481954905L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -2231715049981274736L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-2231715049981274736L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 6088996351426187619L, this, r5);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(6088996351426187619L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        getMenuInflater().inflate(com.almlkaide.kaypro.R.menu.help_options_menu, r5);     // Catch: java.lang.Throwable -> L9
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(android.content.Intent r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -1676282784356261933L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1676282784356261933L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.wu.j6(this, r5);     // Catch: java.lang.Throwable -> L8
        super/*android.app.Activity*/.onNewIntent(r5);     // Catch: java.lang.Throwable -> L8
        setIntent(r5);     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(android.view.MenuItem r5) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -8994775112172784L, this, r5);
    L15:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-8994775112172784L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (r5.getItemId() != com.almlkaide.kaypro.R.id.helpMenuDownload) goto L18;
        com.aide.ui.U.u7().j6(this);     // Catch: java.lang.Throwable -> L11
        return true;
    L18:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -170068004399276148L)
    protected void onPause() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1160595785115516885L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1160595785115516885L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onPause();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.DW(this);     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2112349889550443787L)
    protected void onResume() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 705312058813936840L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(705312058813936840L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onResume();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.j6(this);     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 10523381429495844L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1315287640735756793L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1315287640735756793L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "Help");     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 2258766971992624912L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2227506494451904515L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2227506494451904515L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "Help");     // Catch: java.lang.Throwable -> L8
    }
}
