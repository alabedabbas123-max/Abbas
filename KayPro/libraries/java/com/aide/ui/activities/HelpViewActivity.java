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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2309172973102533321L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2309172973102533321L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Zo = -1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.webkit.WebView DW(com.aide.ui.activities.HelpViewActivity r0) {
        return r0.v5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -4124444813984143425L)
    private void DW() {
        java.lang.String r2 = null;
        com.aide.ui.activities.Enumo r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 19: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 23; continue $sw1; }
                    abcd.wu.j6(th, -433104281240322048L, this);
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-433104281240322048L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if ((getIntent().getFlags() & 1048576) == 0) { $pc1 = 9; continue $sw1; }
                    return;
                }
                case 9: {
                    try {
                        r2 = getIntent().getExtras().getString("EXTRA_URL");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    try {
                        r3 = com.aide.ui.activities.Enumo.valueOf(getIntent().getExtras().getString("EXTRA_CAT"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 12; continue $sw1; }
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    try {
                        this.Zo = r3.U2();
                        getActionBar().setSelectedNavigationItem(r3.U2());
                        this.v5.getSettings().setJavaScriptEnabled(r3.a8());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r2 == null) { $pc1 = 16; continue $sw1; }
                    try {
                        r4 = r3.j6(r2);
                        this.v5.loadUrl(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    try {
                        this.v5.clearHistory();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    return;
                }
                case 16: {
                    try {
                        this.v5.loadUrl(r3.j3());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    { $pc1 = 17; continue $sw1; }
                }
                case 12: {
                    try {
                        r3 = com.aide.ui.activities.Enumo.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    { $pc1 = 13; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 9: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 13; continue $sw2; }
                    abcd.wu.j6(th, 783336897775448625L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(783336897775448625L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        abcd.wu.j6(this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    if (r9 != 1194684) { $pc2 = 16; continue $sw2; }
                    try {
                        com.aide.ui.U.QX().j6(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        android.webkit.WebView r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (Hw == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, 4563051634718463648L, this);
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(4563051634718463648L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = (android.webkit.WebView) findViewById(com.almlkaide.kaypro.R.id.helpViewWebView);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    if (r2.canGoBack() == false) { $pc3 = 9; continue $sw3; }
                    try {
                        r2.goBack();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    try {
                        super/*android.app.Activity*/.onBackPressed();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    @abcd.Interfacesu(method = -1243962678627493464L)
    protected void onCreate(android.os.Bundle r10) {
        java.lang.String[] r0 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    if (FH == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-535683229713776625L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                        requestWindowFeature(5);
                        getActionBar().setDisplayShowTitleEnabled(false);
                        getActionBar().setNavigationMode(1);
                        r0 = new java.lang.String[com.aide.ui.activities.Enumo.Mr().length];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    r3 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r3 >= r0.length) { $pc4 = 10; continue $sw4; }
                    try {
                        r0[r3] = com.aide.ui.activities.Enumo.Mr()[r3].Ws();
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    { $pc4 = 8; continue $sw4; }
                }
                case 10: {
                    try {
                        getActionBar().setListNavigationCallbacks(new android.widget.ArrayAdapter(this, 17367049, r0), new com.aide.ui.activities.B(this));
                        getActionBar().setSelectedNavigationItem(0);
                        setTitle("");
                        setContentView(com.almlkaide.kaypro.R.layout.helpview);
                        com.aide.common.ClassG.j6(findViewById(com.almlkaide.kaypro.R.id.helpViewFrame));
                        setProgressBarIndeterminate(true);
                        setProgressBarIndeterminateVisibility(true);
                        this.v5 = (android.webkit.WebView) findViewById(com.almlkaide.kaypro.R.id.helpViewWebView);
                        this.v5.getSettings().setUseWideViewPort(true);
                        this.v5.getSettings().setSupportZoom(true);
                        this.v5.getSettings().setBuiltInZoomControls(true);
                        this.v5.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.FAR);
                        this.v5.setWebViewClient(new com.aide.ui.activities.C(this));
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    return;
                }
                case 12: {
                    th = $ex4;
                    if (Hw == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, -535683229713776625L, this, r10);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 4246883783481954905L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (Hw == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, -2231715049981274736L, this, new java.lang.Integer(r8), r9);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-2231715049981274736L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    return com.aide.common.Abstractma.j6(this, r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 9: {
                    th = $ex6;
                    if (Hw == false) { $pc6 = 13; continue $sw6; }
                    abcd.wu.j6(th, 6088996351426187619L, this, r5);
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(6088996351426187619L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 9; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        getMenuInflater().inflate(com.almlkaide.kaypro.R.menu.help_options_menu, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 9; continue $sw6;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(android.content.Intent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (Hw == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -1676282784356261933L, this, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-1676282784356261933L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        abcd.wu.j6(this, r5);
                        super/*android.app.Activity*/.onNewIntent(r5);
                        setIntent(r5);
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(android.view.MenuItem r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 11: {
                    th = $ex8;
                    if (Hw == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, -8994775112172784L, this, r5);
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(-8994775112172784L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r5.getItemId() != com.almlkaide.kaypro.R.id.helpMenuDownload) { $pc8 = 18; continue $sw8; }
                    try {
                        com.aide.ui.U.u7().j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    return true;
                }
                case 18: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -170068004399276148L)
    protected void onPause() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (Hw == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 1160595785115516885L, this);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(1160595785115516885L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        super/*android.app.Activity*/.onPause();
                        com.aide.ui.U.DW(this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2112349889550443787L)
    protected void onResume() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (Hw == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 705312058813936840L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(705312058813936840L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        super/*android.app.Activity*/.onResume();
                        com.aide.ui.U.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 10523381429495844L)
    protected void onStart() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (Hw == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 1315287640735756793L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(1315287640735756793L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        super/*android.app.Activity*/.onStart();
                        abcd.F.DW(this, "Help");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 2258766971992624912L)
    protected void onStop() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (Hw == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, -2227506494451904515L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-2227506494451904515L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        super/*android.app.Activity*/.onStop();
                        abcd.F.j6(this, "Help");
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
