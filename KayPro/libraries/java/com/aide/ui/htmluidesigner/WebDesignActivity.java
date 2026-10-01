package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
public class WebDesignActivity extends android.app.Activity {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 6577032889972560872L)
    private static boolean j6;

    @abcd.Interfaceru(field = 4966628203112386280L)
    private com.aide.ui.Ga Hw;

    @abcd.Interfaceru(field = 309005370924587264L)
    private int VH;

    @abcd.Interfaceru(field = -2718664421428973211L)
    private android.media.SoundPool Zo;

    @abcd.Interfaceru(field = -1925779392293430723L)
    private int gn;

    @abcd.Interfaceru(field = -1313135296908675915L)
    private com.aide.common.TextToSpeechHelper u7;

    @abcd.Interfaceru(field = -1684814670795789999L)
    private android.webkit.WebView v5;

    @abcd.Interfacexu
    private static class a extends com.aide.common.Abstractma {

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;

        @abcd.Interfaceru(field = -2376394068490292307L)
        private java.lang.String gn;

        @abcd.Interfaceru(field = -2382867821182742457L)
        private java.lang.String u7;

        static {
            abcd.wu.j6(com.aide.ui.htmluidesigner.WebDesignActivity.a.class, 38387212539063993L, 38387212539063993L);
        }

        @abcd.Interfacesu(method = -149569162899669693L)
        public a(java.lang.String r8, java.lang.String r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (VH == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -2901061174046266013L, null, r8, r9);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (Zo == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-2901061174046266013L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.gn = r9;
                            this.u7 = r8;
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

        static java.lang.String j6(com.aide.ui.htmluidesigner.WebDesignActivity.a r0) {
            return r0.gn;
        }

        @Override
        @abcd.Interfacesu(method = -2070628545634662144L)
        protected android.app.Dialog j6(android.app.Activity r8) {
            android.app.AlertDialog.Builder r2 = null;
            android.widget.TextView r3 = null;
            int r5 = 0;
            android.app.AlertDialog r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 8: {
                        th = $ex1;
                        if (VH == false) { $pc1 = 12; continue $sw1; }
                        abcd.wu.j6(th, -1199774234025757488L, this, r8);
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Zo == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-1199774234025757488L, this, r8);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            r2 = new android.app.AlertDialog.Builder(r8);
                            r3 = new android.widget.TextView(r8);
                            r3.setText(android.text.Html.fromHtml(this.u7 + "<br/><br/><a href='" + this.gn + "'>" + this.gn + "</a><br/>"));
                            r3.setOnClickListener(new com.aide.ui.htmluidesigner.r(this, r8));
                            r3.setTextIsSelectable(true);
                            r5 = (int) (r8.getResources().getDisplayMetrics().density * 10.0f);
                            r3.setPadding(r5, r5, r5, r5);
                            r3.setTextSize(16.0f);
                            r2.setTitle("Cast website").setView(r3).setCancelable(true);
                            r2.setPositiveButton("Ok", new com.aide.ui.htmluidesigner.s(this));
                            r2.setOnCancelListener(new com.aide.ui.htmluidesigner.t(this));
                            r4 = r2.create();
                            r4.setCanceledOnTouchOutside(true);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        return r4;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.WebDesignActivity.class, -3499094272017024501L, -3499094272017024501L);
    }

    public WebDesignActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -5953242354169964285L, null);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-5953242354169964285L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.Ga DW(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 2879326529423927345L)
    private void FH() {
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        android.net.wifi.WifiInfo r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 16: {
                    th = $ex3;
                    if (FH == false) { $pc3 = 20; continue $sw3; }
                    abcd.wu.j6(th, 1556292254019140232L, this);
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc3 = 22; continue $sw3; }
                    try {
                        abcd.wu.j6(1556292254019140232L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    try {
                        r2 = VH();
                        r3 = this.v5.getUrl();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 21; continue $sw3; }
                        $pc3 = 16; continue $sw3;
                    }
                    if (r3.startsWith(r2) == false) { $pc3 = 14; continue $sw3; }
                    try {
                        r4 = ((android.net.wifi.WifiManager) getSystemService("wifi")).getConnectionInfo();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 21; continue $sw3; }
                        $pc3 = 16; continue $sw3;
                    }
                    if (r4 != null) { $pc3 = 11; continue $sw3; }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    try {
                        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("Click the url to open the website in a browser. Connect to WiFi to view it on other devices & computers!", r3));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 21; continue $sw3; }
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 11: {
                    if (r4.getIpAddress() == 0) { $pc3 = 13; continue $sw3; }
                    try {
                        r5 = r4.getSSID();
                        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("On other devices & computers connected to WiFi " + r5 + " open this url in a browser:", j6(android.text.format.Formatter.formatIpAddress(r4.getIpAddress())) + r3.substring(r2.length(), r3.length())));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 21; continue $sw3; }
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 14: {
                    try {
                        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("Click the url to open the website in a browser:", r3));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 21; continue $sw3; }
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean FH(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        return r0.gn();
    }

    @abcd.Interfacesu(method = -1458319245334160300L)
    private android.webkit.WebView Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 11: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 15; continue $sw4; }
                    abcd.wu.j6(th, 2053900376652388495L, this);
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2053900376652388495L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.v5 = new com.aide.ui.htmluidesigner.i(this, this);
                        this.v5.setInitialScale(100);
                        this.v5.setVerticalScrollBarEnabled(false);
                        this.v5.getSettings().setJavaScriptEnabled(true);
                        this.v5.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                        this.v5.getSettings().setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    if (gn() == false) { $pc4 = 9; continue $sw4; }
                    try {
                        this.v5.getSettings().setDefaultFontSize(50);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    try {
                        this.v5.setBackgroundColor(-1);
                        this.v5.setWebViewClient(new com.aide.ui.htmluidesigner.j(this));
                        this.v5.setWebChromeClient(new com.aide.ui.htmluidesigner.q(this));
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5726675564485915300L)
    private static java.lang.String VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (FH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -2407819341255377881L, null);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc5 = 15; continue $sw5; }
                    try {
                        abcd.wu.j6(-2407819341255377881L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return "http://localhost:8099";
                }
                case 15: {
                    return "http://localhost:8099";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 870793874919017181L)
    private boolean Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (FH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -1975681526819419692L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1975681526819419692L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return getIntent().getBooleanExtra("EXTRA_SPEAK", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -131022295859982840L)
    private boolean gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (FH == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 1603331555027750733L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(1603331555027750733L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return getIntent().getBooleanExtra("EXTRA_TRAINER", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6() {
        return VH();
    }

    @abcd.Interfacesu(method = -2558788555575818880L)
    private static java.lang.String j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (FH == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -7427145648992777001L, null, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-7427145648992777001L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return "http://" + r5 + ":8099";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3131291178940568589L)
    private static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 15: {
                    th = $ex9;
                    if (FH == false) { $pc9 = 19; continue $sw9; }
                    abcd.wu.j6(th, 1872629192254666108L, null, r7, r8);
                    $pc9 = 19; continue $sw9;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(1872629192254666108L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 15; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = VH();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 15; continue $sw9;
                    }
                    if (r8 != null) { $pc9 = 8; continue $sw9; }
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    return r0;
                }
                case 8: {
                    if (r8.startsWith(r7 + "/") == false) { $pc9 = 14; continue $sw9; }
                    try {
                        r1 = r8.substring(r7.length(), r8.length());
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 15; continue $sw9;
                    }
                    if (r1.equals("/index.html") == false) { $pc9 = 12; continue $sw9; }
                    return r0;
                }
                case 12: {
                    return r0 + r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r9, java.lang.String r10, java.lang.String r11, int r12) {
        android.content.Intent r0 = null;
        com.aide.ui.trainer.g.a r1 = null;
        com.aide.ui.trainer.g.d r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 12: {
                    th = $ex10;
                    if (FH == false) { $pc10 = 16; continue $sw10; }
                    abcd.wu.j6(th, 2918971442360294453L, null, r9, r10, r11, new java.lang.Integer(r12));
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(2918971442360294453L, null, r9, r10, r11, new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent(r9, com.aide.ui.htmluidesigner.WebDesignActivity.class);
                        r0.putExtra("EXTRA_FILE", r11);
                        r0.putExtra("EXTRA_ROOTDIR", r10);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    if (r12 != 0) { $pc10 = 8; continue $sw10; }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    try {
                        r0.addFlags(268435456);
                        r0.addFlags(4096);
                        r0.addFlags(134217728);
                        r9.startActivity(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    return;
                }
                case 8: {
                    if (com.aide.ui.U.dx() == false) { $pc10 = 10; continue $sw10; }
                    try {
                        r1 = com.aide.ui.U.SI().Zo();
                        r2 = com.aide.ui.U.SI().VH();
                        r0.putExtra("EXTRA_TRAINER", true);
                        r0.putExtra("EXTRA_SOUND", com.aide.ui.aa.J0());
                        r0.putExtra("EXTRA_SPEAK", com.aide.ui.aa.J8());
                        r0.putExtra("EXTRA_HEADER", r1.J0());
                        r0.putExtra("EXTRA_TRAINER_LOCALE", r2.Zo());
                        r0.putExtra("EXTRA_TRAINER_OUTPUT", r2.v5());
                        r0.putExtra("EXTRA_TRAINER_FAIL", r2.u7());
                        r0.putExtra("EXTRA_TRAINER_FAIL_BUTTON", com.aide.ui.U.SI().tp());
                        r0.putExtra("EXTRA_TRAINER_SUCCESS", r2.we());
                        r0.putExtra("EXTRA_TRAINER_FAIL_TITLE", com.aide.ui.U.SI().EQ());
                        r0.putExtra("EXTRA_TRAINER_SUCCESS_TITLE", com.aide.ui.U.SI().J0());
                        r0.putExtra("EXTRA_TRAINER_SUCCESS_BUTTON", com.aide.ui.U.SI().Ws());
                        r9.startActivityForResult(r0, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3451948554442587264L)
    private static void j6(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 10: {
                    th = $ex11;
                    if (FH == false) { $pc11 = 14; continue $sw11; }
                    abcd.wu.j6(th, -4442935562221138605L, null, r5);
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc11 = 7; continue $sw11; }
                    try {
                        abcd.wu.j6(-4442935562221138605L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 10; continue $sw11;
                    }
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    if (j6 == true) { $pc11 = 17; continue $sw11; }
                    try {
                        j6 = true;
                        new java.lang.Thread(new com.aide.ui.htmluidesigner.h(r5)).start();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 10; continue $sw11;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        r0.FH();
    }

    @abcd.Interfacesu(method = 1313535455702950312L)
    private void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Runnable r13) {
        android.view.View r0 = null;
        android.widget.TextView r1 = null;
        android.widget.TextView r2 = null;
        android.widget.TextView r3 = null;
        android.view.ViewGroup.LayoutParams r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 11: {
                    th = $ex12;
                    if (FH == false) { $pc12 = 15; continue $sw12; }
                    abcd.wu.j6(th, 639433531962649685L, this, r10, r11, r12, r13);
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(639433531962649685L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    try {
                        r0 = findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTask);
                        r0.setVisibility(4);
                        r1 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnMessage);
                        r2 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTitle);
                        r3 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderButton);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    if (r11.length() != 0) { $pc12 = 8; continue $sw12; }
                    try {
                        r1.setVisibility(8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    try {
                        r2.setText(r10);
                        r3.setText(r12);
                        r2.setTextSize(com.aide.common.ClassG.gn(this));
                        r1.setTextSize(com.aide.common.ClassG.u7(this));
                        r3.setTextSize(com.aide.common.ClassG.v5(this));
                        r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTaskInner).setOnClickListener(new com.aide.ui.htmluidesigner.f(this, r13));
                        r4 = r1.getLayoutParams();
                        r4.width = com.aide.common.ClassG.FH(this);
                        r1.requestLayout();
                        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    return;
                }
                case 8: {
                    try {
                        r1.setText(android.text.Html.fromHtml(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    { $pc12 = 9; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 66725981216540235L)
    private void u7() {
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 10: {
                    th = $ex13;
                    if (FH == false) { $pc13 = 14; continue $sw13; }
                    abcd.wu.j6(th, -1618281148865463480L, this);
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(-1618281148865463480L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 10; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if ((getIntent().getFlags() & 1048576) != 0) { $pc13 = 17; continue $sw13; }
                    try {
                        r2 = getIntent().getExtras().getString("EXTRA_FILE");
                        r3 = getIntent().getExtras().getString("EXTRA_ROOTDIR");
                        com.aide.ui.htmluidesigner.v.j6(r3);
                        r4 = j6(r3, r2);
                        this.v5.clearCache(true);
                        this.v5.loadUrl(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 10; continue $sw13;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 582755054678652556L)
    private boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (FH == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, -2263785667772760911L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-2263785667772760911L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return getIntent().getBooleanExtra("EXTRA_SOUND", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3747395533637398641L)
    protected void DW() {
        android.view.View r2 = null;
        com.aide.ui.htmluidesigner.g r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 14: {
                    th = $ex15;
                    if (FH == false) { $pc15 = 18; continue $sw15; }
                    abcd.wu.j6(th, 1814892078833058000L, this);
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(1814892078833058000L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (v5() == false) { $pc15 = 10; continue $sw15; }
                    try {
                        this.Zo.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    if (Zo() == false) { $pc15 = 12; continue $sw15; }
                    try {
                        this.u7.j6(getIntent().getStringExtra("EXTRA_TRAINER_LOCALE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    try {
                        r2 = findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTask);
                        r2.setVisibility(0);
                        r10 = new com.aide.ui.htmluidesigner.g(this, 0.0f, 0.0f, -(getResources().getDisplayMetrics().density * 150.0f), 0.0f, r2);
                        r10.setDuration(500);
                        r2.startAnimation(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -238370663926711912L)
    protected void onCreate(android.os.Bundle r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    if (DW == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-76625178632247691L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                        com.b.light(this, com.almlkaide.kaypro.R.style.ActivityThemeWebDesigner);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    if (abcd.F.DW() == true) { $pc16 = 9; continue $sw16; }
                    try {
                        abcd.F.j6(this, new com.aide.ui.htmluidesigner.c(this));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    try {
                        setContentView(com.almlkaide.kaypro.R.layout.webpreview);
                        this.Hw = new com.aide.ui.Ga(this, com.almlkaide.kaypro.R.id.webpreviewMasterButton);
                        this.Hw.j6(true);
                        this.Hw.j6(new com.aide.ui.htmluidesigner.d(this));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    if (gn() == false) { $pc16 = 12; continue $sw16; }
                    try {
                        j6(getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_TITLE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_BUTTON"), new com.aide.ui.htmluidesigner.e(this));
                        this.Zo = new android.media.SoundPool(1, 3, 0);
                        this.VH = this.Zo.load(this, com.almlkaide.kaypro.R.raw.success_task, 1);
                        this.gn = this.Zo.load(this, com.almlkaide.kaypro.R.raw.fail, 1);
                        this.u7 = new com.aide.common.TextToSpeechHelper(this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    try {
                        Hw();
                        ((android.widget.LinearLayout) findViewById(com.almlkaide.kaypro.R.id.webpreviewContainer)).addView(this.v5);
                        j6(getApplicationContext());
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 14; continue $sw16;
                    }
                    return;
                }
                case 14: {
                    th = $ex16;
                    if (FH == false) { $pc16 = 18; continue $sw16; }
                    abcd.wu.j6(th, -76625178632247691L, this, r10);
                    $pc16 = 18; continue $sw16;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1634571109133628921L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 7: {
                    th = $ex17;
                    if (FH == false) { $pc17 = 11; continue $sw17; }
                    abcd.wu.j6(th, 1763781467364598428L, this, new java.lang.Integer(r8), r9);
                    $pc17 = 11; continue $sw17;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc17 = 5; continue $sw17; }
                    try {
                        abcd.wu.j6(1763781467364598428L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 7; continue $sw17;
                    }
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    return com.aide.common.Abstractma.j6(this, r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onNewIntent(android.content.Intent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (FH == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, -2017283692228724775L, this, r5);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(-2017283692228724775L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    try {
                        abcd.wu.j6(this, r5);
                        super.onNewIntent(r5);
                        setIntent(r5);
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1143911317196569920L)
    protected void onStart() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (FH == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, -260415272884044105L, this);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(-260415272884044105L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    try {
                        super.onStart();
                        abcd.F.DW(this, "Web Designer");
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2604483284993757264L)
    protected void onStop() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (FH == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, 798557868445315083L, this);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(798557868445315083L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        super.onStop();
                        abcd.F.j6(this, "Web Designer");
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
