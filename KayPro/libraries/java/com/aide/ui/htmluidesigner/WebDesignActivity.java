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
        L7:
            th = move-exception;
            if (VH == false) goto L11;
            abcd.wu.j6(th, -2901061174046266013L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (Zo == false) goto L5;
            abcd.wu.j6(-2901061174046266013L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.gn = r9;     // Catch: java.lang.Throwable -> L7
            this.u7 = r8;     // Catch: java.lang.Throwable -> L7
        }

        static java.lang.String j6(com.aide.ui.htmluidesigner.WebDesignActivity.a r0) {
            return r0.gn;
        }

        @Override
        @abcd.Interfacesu(method = -2070628545634662144L)
        protected android.app.Dialog j6(android.app.Activity r8) {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, -1199774234025757488L, this, r8);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(-1199774234025757488L, this, r8);     // Catch: java.lang.Throwable -> L8
        L6:
            android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L8
            android.widget.TextView r3 = new android.widget.TextView(r8);     // Catch: java.lang.Throwable -> L8
            r3.setText(android.text.Html.fromHtml(this.u7 + "<br/><br/><a href='" + this.gn + "'>" + this.gn + "</a><br/>"));     // Catch: java.lang.Throwable -> L8
            r3.setOnClickListener(new com.aide.ui.htmluidesigner.r(this, r8));     // Catch: java.lang.Throwable -> L8
            r3.setTextIsSelectable(true);     // Catch: java.lang.Throwable -> L8
            int r5 = (int) (r8.getResources().getDisplayMetrics().density * 10.0f);     // Catch: java.lang.Throwable -> L8
            r3.setPadding(r5, r5, r5, r5);     // Catch: java.lang.Throwable -> L8
            r3.setTextSize(16.0f);     // Catch: java.lang.Throwable -> L8
            r2.setTitle("Cast website").setView(r3).setCancelable(true);     // Catch: java.lang.Throwable -> L8
            r2.setPositiveButton("Ok", new com.aide.ui.htmluidesigner.s(this));     // Catch: java.lang.Throwable -> L8
            r2.setOnCancelListener(new com.aide.ui.htmluidesigner.t(this));     // Catch: java.lang.Throwable -> L8
            android.app.AlertDialog r4 = r2.create();     // Catch: java.lang.Throwable -> L8
            r4.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L8
            return r4;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.WebDesignActivity.class, -3499094272017024501L, -3499094272017024501L);
    }

    public WebDesignActivity() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -5953242354169964285L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5953242354169964285L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static com.aide.ui.Ga DW(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 2879326529423927345L)
    private void FH() {
    L16:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, 1556292254019140232L, this);
    L20:
        throw th;
    L4:
        if (DW == false) goto L22;
        abcd.wu.j6(1556292254019140232L, this);     // Catch: java.lang.Throwable -> L16
    L22:
        java.lang.String r2 = VH();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        java.lang.String r3 = this.v5.getUrl();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        if (r3.startsWith(r2) == false) goto L14;
        android.net.wifi.WifiInfo r4 = ((android.net.wifi.WifiManager) getSystemService("wifi")).getConnectionInfo();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        if (r4 != null) goto L11;
    L13:
        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("Click the url to open the website in a browser. Connect to WiFi to view it on other devices & computers!", r3));     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        return;
    L11:
        if (r4.getIpAddress() == 0) goto L13;
        java.lang.String r5 = r4.getSSID();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("On other devices & computers connected to WiFi " + r5 + " open this url in a browser:", j6(android.text.format.Formatter.formatIpAddress(r4.getIpAddress())) + r3.substring(r2.length(), r3.length())));     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        return;
    L14:
        com.aide.common.Abstractma.j6(this, new com.aide.ui.htmluidesigner.WebDesignActivity.a("Click the url to open the website in a browser:", r3));     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L16
        return;
    }

    static boolean FH(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        return r0.gn();
    }

    @abcd.Interfacesu(method = -1458319245334160300L)
    private android.webkit.WebView Hw() {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 2053900376652388495L, this);
    L15:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2053900376652388495L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        this.v5 = new com.aide.ui.htmluidesigner.i(this, this);     // Catch: java.lang.Throwable -> L11
        this.v5.setInitialScale(100);     // Catch: java.lang.Throwable -> L11
        this.v5.setVerticalScrollBarEnabled(false);     // Catch: java.lang.Throwable -> L11
        this.v5.getSettings().setJavaScriptEnabled(true);     // Catch: java.lang.Throwable -> L11
        this.v5.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);     // Catch: java.lang.Throwable -> L11
        this.v5.getSettings().setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);     // Catch: java.lang.Throwable -> L11
        if (gn() == false) goto L9;
        this.v5.getSettings().setDefaultFontSize(50);     // Catch: java.lang.Throwable -> L11
    L9:
        this.v5.setBackgroundColor(-1);     // Catch: java.lang.Throwable -> L11
        this.v5.setWebViewClient(new com.aide.ui.htmluidesigner.j(this));     // Catch: java.lang.Throwable -> L11
        this.v5.setWebChromeClient(new com.aide.ui.htmluidesigner.q(this));     // Catch: java.lang.Throwable -> L11
        u7();     // Catch: java.lang.Throwable -> L11
        return this.v5;
    }

    @abcd.Interfacesu(method = 5726675564485915300L)
    private static java.lang.String VH() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2407819341255377881L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L15;
        abcd.wu.j6(-2407819341255377881L, null);     // Catch: java.lang.Throwable -> L8
        return "http://localhost:8099";
    L15:
        return "http://localhost:8099";
    }

    @abcd.Interfacesu(method = 870793874919017181L)
    private boolean Zo() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1975681526819419692L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1975681526819419692L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getIntent().getBooleanExtra("EXTRA_SPEAK", false);
    }

    @abcd.Interfacesu(method = -131022295859982840L)
    private boolean gn() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1603331555027750733L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1603331555027750733L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getIntent().getBooleanExtra("EXTRA_TRAINER", false);
    }

    static java.lang.String j6() {
        return VH();
    }

    @abcd.Interfacesu(method = -2558788555575818880L)
    private static java.lang.String j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -7427145648992777001L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7427145648992777001L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return "http://" + r5 + ":8099";
    }

    @abcd.Interfacesu(method = -3131291178940568589L)
    private static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
    L15:
        th = move-exception;
        if (FH == false) goto L19;
        abcd.wu.j6(th, 1872629192254666108L, null, r7, r8);
    L19:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1872629192254666108L, null, r7, r8);     // Catch: java.lang.Throwable -> L15
    L5:
        java.lang.String r0 = VH();     // Catch: java.lang.Throwable -> L15
        if (r8 != null) goto L8;
    L14:
        return r0;
    L8:
        if (r8.startsWith(r7 + "/") == false) goto L14;
        java.lang.String r1 = r8.substring(r7.length(), r8.length());     // Catch: java.lang.Throwable -> L15
        if (r1.equals("/index.html") == false) goto L12;
        return r0;
    L12:
        return r0 + r1;
    }

    public static void j6(android.app.Activity r9, java.lang.String r10, java.lang.String r11, int r12) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 2918971442360294453L, null, r9, r10, r11, new java.lang.Integer(r12));
    L16:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(2918971442360294453L, null, r9, r10, r11, new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L12
    L5:
        android.content.Intent r0 = new android.content.Intent(r9, com.aide.ui.htmluidesigner.WebDesignActivity.class);     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_FILE", r11);     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_ROOTDIR", r10);     // Catch: java.lang.Throwable -> L12
        if (r12 != 0) goto L8;
    L10:
        r0.addFlags(268435456);     // Catch: java.lang.Throwable -> L12
        r0.addFlags(4096);     // Catch: java.lang.Throwable -> L12
        r0.addFlags(134217728);     // Catch: java.lang.Throwable -> L12
        r9.startActivity(r0);     // Catch: java.lang.Throwable -> L12
        return;
    L8:
        if (com.aide.ui.U.dx() == false) goto L10;
        com.aide.ui.trainer.g.a r1 = com.aide.ui.U.SI().Zo();     // Catch: java.lang.Throwable -> L12
        com.aide.ui.trainer.g.d r2 = com.aide.ui.U.SI().VH();     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER", true);     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_SOUND", com.aide.ui.aa.J0());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_SPEAK", com.aide.ui.aa.J8());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_HEADER", r1.J0());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_LOCALE", r2.Zo());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_OUTPUT", r2.v5());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_FAIL", r2.u7());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_FAIL_BUTTON", com.aide.ui.U.SI().tp());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_SUCCESS", r2.we());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_FAIL_TITLE", com.aide.ui.U.SI().EQ());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_SUCCESS_TITLE", com.aide.ui.U.SI().J0());     // Catch: java.lang.Throwable -> L12
        r0.putExtra("EXTRA_TRAINER_SUCCESS_BUTTON", com.aide.ui.U.SI().Ws());     // Catch: java.lang.Throwable -> L12
        r9.startActivityForResult(r0, r12);     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 3451948554442587264L)
    private static void j6(android.content.Context r5) {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -4442935562221138605L, null, r5);
    L14:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-4442935562221138605L, null, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (j6 == true) goto L17;
        j6 = true;     // Catch: java.lang.Throwable -> L10
        new java.lang.Thread(new com.aide.ui.htmluidesigner.h(r5)).start();     // Catch: java.lang.Throwable -> L10
        return;
    }

    static void j6(com.aide.ui.htmluidesigner.WebDesignActivity r0) {
        r0.FH();
    }

    @abcd.Interfacesu(method = 1313535455702950312L)
    private void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Runnable r13) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 639433531962649685L, this, r10, r11, r12, r13);
    L15:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(639433531962649685L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
    L5:
        android.view.View r0 = findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTask);     // Catch: java.lang.Throwable -> L11
        r0.setVisibility(4);     // Catch: java.lang.Throwable -> L11
        android.widget.TextView r1 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnMessage);     // Catch: java.lang.Throwable -> L11
        android.widget.TextView r2 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTitle);     // Catch: java.lang.Throwable -> L11
        android.widget.TextView r3 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderButton);     // Catch: java.lang.Throwable -> L11
        if (r11.length() != 0) goto L8;
        r1.setVisibility(8);     // Catch: java.lang.Throwable -> L11
    L9:
        r2.setText(r10);     // Catch: java.lang.Throwable -> L11
        r3.setText(r12);     // Catch: java.lang.Throwable -> L11
        r2.setTextSize(com.aide.common.ClassG.gn(this));     // Catch: java.lang.Throwable -> L11
        r1.setTextSize(com.aide.common.ClassG.u7(this));     // Catch: java.lang.Throwable -> L11
        r3.setTextSize(com.aide.common.ClassG.v5(this));     // Catch: java.lang.Throwable -> L11
        r0.findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTaskInner).setOnClickListener(new com.aide.ui.htmluidesigner.f(this, r13));     // Catch: java.lang.Throwable -> L11
        android.view.ViewGroup.LayoutParams r4 = r1.getLayoutParams();     // Catch: java.lang.Throwable -> L11
        r4.width = com.aide.common.ClassG.FH(this);     // Catch: java.lang.Throwable -> L11
        r1.requestLayout();     // Catch: java.lang.Throwable -> L11
        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r1.setText(android.text.Html.fromHtml(r11));     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    @abcd.Interfacesu(method = 66725981216540235L)
    private void u7() {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, -1618281148865463480L, this);
    L14:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1618281148865463480L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if ((getIntent().getFlags() & 1048576) != 0) goto L17;
        java.lang.String r2 = getIntent().getExtras().getString("EXTRA_FILE");     // Catch: java.lang.Throwable -> L10
        java.lang.String r3 = getIntent().getExtras().getString("EXTRA_ROOTDIR");     // Catch: java.lang.Throwable -> L10
        com.aide.ui.htmluidesigner.v.j6(r3);     // Catch: java.lang.Throwable -> L10
        java.lang.String r4 = j6(r3, r2);     // Catch: java.lang.Throwable -> L10
        this.v5.clearCache(true);     // Catch: java.lang.Throwable -> L10
        this.v5.loadUrl(r4);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = 582755054678652556L)
    private boolean v5() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2263785667772760911L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2263785667772760911L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getIntent().getBooleanExtra("EXTRA_SOUND", true);
    }

    @abcd.Interfacesu(method = 3747395533637398641L)
    protected void DW() {
    L14:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, 1814892078833058000L, this);
    L18:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(1814892078833058000L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (v5() == false) goto L10;
        this.Zo.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L14
    L10:
        if (Zo() == false) goto L12;
        this.u7.j6(getIntent().getStringExtra("EXTRA_TRAINER_LOCALE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"));     // Catch: java.lang.Throwable -> L14
    L12:
        android.view.View r2 = findViewById(com.almlkaide.kaypro.R.id.webpreviewHeaderLearnTask);     // Catch: java.lang.Throwable -> L14
        r2.setVisibility(0);     // Catch: java.lang.Throwable -> L14
        com.aide.ui.htmluidesigner.g r10 = new com.aide.ui.htmluidesigner.g(this, 0.0f, 0.0f, -(getResources().getDisplayMetrics().density * 150.0f), 0.0f, r2);     // Catch: java.lang.Throwable -> L14
        r10.setDuration(500);     // Catch: java.lang.Throwable -> L14
        r2.startAnimation(r10);     // Catch: java.lang.Throwable -> L14
    }

    @Override
    @abcd.Interfacesu(method = -238370663926711912L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L14
        if (DW == false) goto L6;
        abcd.wu.j6(-76625178632247691L, this, r10);     // Catch: java.lang.Throwable -> L14
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L14
        com.b.light(this, com.almlkaide.kaypro.R.style.ActivityThemeWebDesigner);     // Catch: java.lang.Throwable -> L14
        if (abcd.F.DW() == true) goto L9;
        abcd.F.j6(this, new com.aide.ui.htmluidesigner.c(this));     // Catch: java.lang.Throwable -> L14
    L9:
        setContentView(com.almlkaide.kaypro.R.layout.webpreview);     // Catch: java.lang.Throwable -> L14
        this.Hw = new com.aide.ui.Ga(this, com.almlkaide.kaypro.R.id.webpreviewMasterButton);     // Catch: java.lang.Throwable -> L14
        this.Hw.j6(true);     // Catch: java.lang.Throwable -> L14
        this.Hw.j6(new com.aide.ui.htmluidesigner.d(this));     // Catch: java.lang.Throwable -> L14
        if (gn() == false) goto L12;
        j6(getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_TITLE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_BUTTON"), new com.aide.ui.htmluidesigner.e(this));     // Catch: java.lang.Throwable -> L14
        this.Zo = new android.media.SoundPool(1, 3, 0);     // Catch: java.lang.Throwable -> L14
        this.VH = this.Zo.load(this, com.almlkaide.kaypro.R.raw.success_task, 1);     // Catch: java.lang.Throwable -> L14
        this.gn = this.Zo.load(this, com.almlkaide.kaypro.R.raw.fail, 1);     // Catch: java.lang.Throwable -> L14
        this.u7 = new com.aide.common.TextToSpeechHelper(this);     // Catch: java.lang.Throwable -> L14
    L12:
        Hw();     // Catch: java.lang.Throwable -> L14
        ((android.widget.LinearLayout) findViewById(com.almlkaide.kaypro.R.id.webpreviewContainer)).addView(this.v5);     // Catch: java.lang.Throwable -> L14
        j6(getApplicationContext());     // Catch: java.lang.Throwable -> L14
        return;
    L14:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, -76625178632247691L, this, r10);
    L18:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = 1634571109133628921L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 1763781467364598428L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1763781467364598428L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    @Override
    public void onNewIntent(android.content.Intent r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2017283692228724775L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2017283692228724775L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.wu.j6(this, r5);     // Catch: java.lang.Throwable -> L8
        super.onNewIntent(r5);     // Catch: java.lang.Throwable -> L8
        setIntent(r5);     // Catch: java.lang.Throwable -> L8
        u7();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -1143911317196569920L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -260415272884044105L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-260415272884044105L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "Web Designer");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 2604483284993757264L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 798557868445315083L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(798557868445315083L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "Web Designer");     // Catch: java.lang.Throwable -> L8
    }
}
