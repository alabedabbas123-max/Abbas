package com.aide.appwizard.runtime;

@abcd.Interfacexu
public class AppWizardActivity extends android.support.v4.app.FragmentActivity {

    @abcd.Interfaceuu
    private static boolean QX;

    @abcd.Interfacetu
    private static boolean Ws;

    @abcd.Interfaceru(field = 4440613061035158561L)
    private int Mr;

    @abcd.Interfaceru(field = -2142756852662875449L)
    private int U2;

    @abcd.Interfaceru(field = 2121405043696021132L)
    private com.aide.appwizard.runtime.i XL;

    @abcd.Interfaceru(field = 2041331091804216544L)
    private int a8;

    @abcd.Interfaceru(field = 1605170051601202373L)
    private android.support.v4.view.ViewPager aM;

    @abcd.Interfaceru(field = -3194336168128748356L)
    private android.support.v4.app.C1621a j3;

    @abcd.Interfaceru(field = 4835849651240155008L)
    private int lg;

    @abcd.Interfacexu
    private class a extends android.support.v4.app.B {

        @abcd.Interfacetu
        private static boolean gn;

        @abcd.Interfaceuu
        private static boolean u7;

        @abcd.Interfacevu
        final com.aide.appwizard.runtime.AppWizardActivity tp;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.AppWizardActivity.a.class, -2243073932312828817L, -2243073932312828817L);
        }

        @abcd.Interfacesu(method = 44400021518034733L)
        public a(com.aide.appwizard.runtime.AppWizardActivity r8, android.support.v4.app.r r9) {
        L7:
            th = move-exception;
            if (u7 == false) goto L11;
            abcd.wu.j6(th, -2714844480168061760L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (gn == false) goto L5;
            abcd.wu.j6(-2714844480168061760L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.tp = r8;     // Catch: java.lang.Throwable -> L7
            super(r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1100054622525150321L)
        public android.support.v4.app.Fragment FH(int r5) {
        L8:
            th = move-exception;
            if (u7 == false) goto L12;
            abcd.wu.j6(th, -40336300518430488L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (gn == false) goto L6;
            abcd.wu.j6(-40336300518430488L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.tp.j6(this.tp.gn().DW().get(r5));
        }

        @Override
        @abcd.Interfacesu(method = 2464209949339270260L)
        public int j6() {
        L12:
            th = move-exception;
            if (u7 == false) goto L16;
            abcd.wu.j6(th, -398534843712094271L, this);
        L16:
            throw th;
        L4:
            if (gn == false) goto L7;
            abcd.wu.j6(-398534843712094271L, this);     // Catch: java.lang.Throwable -> L12
        L7:
            if (this.tp.gn().v5().Zo() == false) goto L11;
            return this.tp.gn().DW().size() - 1;
        L11:
            return this.tp.gn().DW().size();
        }

        @Override
        @abcd.Interfacesu(method = 2207935775976430581L)
        public java.lang.CharSequence j6(int r5) {
        L8:
            th = move-exception;
            if (u7 == false) goto L12;
            abcd.wu.j6(th, -3314340961772855280L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (gn == false) goto L6;
            abcd.wu.j6(-3314340961772855280L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.tp.gn().DW().get(r5).v5();
        }
    }

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.AppWizardActivity.class, 4889396902212038425L, 4889396902212038425L);
    }

    public AppWizardActivity() {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, -2678318645468510820L, null);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-2678318645468510820L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static int DW(com.aide.appwizard.runtime.AppWizardActivity r0) {
        return r0.lg;
    }

    @abcd.Interfacesu(method = 135217460552704416L)
    private void DW(android.view.ViewGroup r7) {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, -7199730336797981575L, this, r7);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-7199730336797981575L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        this.aM = new android.support.v4.view.ViewPager(this);     // Catch: java.lang.Throwable -> L8
        this.aM.setId(this.U2);     // Catch: java.lang.Throwable -> L8
        r7.addView(this.aM);     // Catch: java.lang.Throwable -> L8
        android.support.v4.view.PagerTitleStrip r2 = new android.support.v4.view.PagerTitleStrip(this);     // Catch: java.lang.Throwable -> L8
        r2.setPadding(0, (int) (getResources().getDisplayMetrics().density * 4.0f), 0, (int) (getResources().getDisplayMetrics().density * 4.0f));     // Catch: java.lang.Throwable -> L8
        android.support.v4.view.ViewPager.LayoutParams r3 = new android.support.v4.view.ViewPager.LayoutParams();     // Catch: java.lang.Throwable -> L8
        ((android.view.ViewGroup.LayoutParams) r3).height = -2;     // Catch: java.lang.Throwable -> L8
        ((android.view.ViewGroup.LayoutParams) r3).width = -1;     // Catch: java.lang.Throwable -> L8
        r3.DW = 48;     // Catch: java.lang.Throwable -> L8
        this.aM.addView(r2, r3);     // Catch: java.lang.Throwable -> L8
        r2.setTextColor(-1);     // Catch: java.lang.Throwable -> L8
        r2.setBackgroundColor(-13388315);     // Catch: java.lang.Throwable -> L8
        this.aM.setAdapter(new com.aide.appwizard.runtime.AppWizardActivity.a(this, FH()));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 3916506246259301795L)
    private android.graphics.drawable.Drawable FH(int r6) {
    L14:
        th = move-exception;
        if (QX == false) goto L18;
        abcd.wu.j6(th, 3123731290581633536L, this, new java.lang.Integer(r6));
    L18:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(3123731290581633536L, this, r6);     // Catch: java.lang.Throwable -> L14
    L6:
        android.util.TypedValue r2 = new android.util.TypedValue();     // Catch: java.lang.Throwable -> L14
        getTheme().resolveAttribute(r6, r2, true);     // Catch: java.lang.Throwable -> L14
        if (r2.type < 28) goto L13;
        if (r2.type > 31) goto L13;
        return new android.graphics.drawable.ColorDrawable(r2.data);
    L13:
        return getResources().getDrawable(r2.resourceId);
    }

    static android.support.v4.view.ViewPager FH(com.aide.appwizard.runtime.AppWizardActivity r0) {
        return r0.aM;
    }

    @abcd.Interfacesu(method = 750002358391124184L)
    private void FH(android.view.ViewGroup r8) {
    L15:
        th = move-exception;
        if (QX == false) goto L20;
        abcd.wu.j6(th, -5920069004729770929L, this, r8);
    L20:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-5920069004729770929L, this, r8);     // Catch: java.lang.Throwable -> L15
    L6:
        this.aM = new android.support.v4.view.ViewPager(this);     // Catch: java.lang.Throwable -> L15
        this.aM.setId(this.U2);     // Catch: java.lang.Throwable -> L15
        r8.addView(this.aM);     // Catch: java.lang.Throwable -> L15
        this.aM.setAdapter(new com.aide.appwizard.runtime.AppWizardActivity.a(this, FH()));     // Catch: java.lang.Throwable -> L15
        this.aM.setOnPageChangeListener(new com.aide.appwizard.runtime.e(this));     // Catch: java.lang.Throwable -> L15
        getActionBar().removeAllTabs();     // Catch: java.lang.Throwable -> L15
        if (gn().v5().Zo() == false) goto L9;
        int r2 = gn().DW().size() - 1;     // Catch: java.lang.Throwable -> L15
    L10:
        int r3 = 0;
    L11:
        if (r3 >= r2) goto L14;
        getActionBar().addTab(getActionBar().newTab().setText(gn().DW().get(r3).v5()).setTabListener(new com.aide.appwizard.runtime.f(this)));     // Catch: java.lang.Throwable -> L15
        r3 = r3 + 1;
        goto L11
    L14:
        return;
    L9:
        r2 = gn().DW().size();     // Catch: java.lang.Throwable -> L15
        goto L10
    }

    @abcd.Interfacesu(method = 3436022485134047196L)
    private int J0() {
    L32:
        th = move-exception;
        if (QX == false) goto L36;
        abcd.wu.j6(th, 1584847606066486241L, this);
    L36:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(1584847606066486241L, this);     // Catch: java.lang.Throwable -> L32
    L6:
        int r2 = com.aide.appwizard.runtime.g.j6[gn().FH().ordinal()];     // Catch: java.lang.Throwable -> L32
        if (r2 != 1) goto L9;
        return 16973931;
    L9:
        if (r2 != 2) goto L11;
        return 16973934;
    L11:
        if (r2 != 3) goto L13;
        return j6("style", "Theme_Holo_Light_Holo_ActionBar");
    L13:
        if (r2 != 4) goto L15;
        return 16974105;
    L15:
        if (r2 != 6) goto L17;
        return 16974123;
    L17:
        if (r2 == 7) goto L20;
        return 16974120;
    L20:
        return 16974143;
    }

    static int j6(com.aide.appwizard.runtime.AppWizardActivity r0) {
        return r0.Mr;
    }

    static int j6(com.aide.appwizard.runtime.AppWizardActivity r0, java.lang.String r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1827825947259090291L)
    private int j6(java.lang.String r8, java.lang.String r9) {
    L9:
        th = move-exception;
        if (QX == false) goto L13;
        abcd.wu.j6(th, 420339270553659600L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (Ws == false) goto L16;
        abcd.wu.j6(420339270553659600L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L16:
        return ((java.lang.Integer) java.lang.Class.forName(getPackageName() + ".R$" + r8).getField(r9).get(null)).intValue();
    L7:
        return 0;
    }

    @abcd.Interfacesu(method = 382958970435673868L)
    private android.view.ViewGroup j6(android.view.ViewGroup r12) {
    L10:
        th = move-exception;
        if (QX == false) goto L14;
        abcd.wu.j6(th, -3486509791395187989L, this, r12);
    L14:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-3486509791395187989L, this, r12);     // Catch: java.lang.Throwable -> L10
    L6:
        getActionBar().setDisplayHomeAsUpEnabled(true);     // Catch: java.lang.Throwable -> L10
        getActionBar().setHomeButtonEnabled(true);     // Catch: java.lang.Throwable -> L10
        android.support.v4.widget.DrawerLayout r2 = new android.support.v4.widget.DrawerLayout(this);     // Catch: java.lang.Throwable -> L10
        r12.addView(r2, new android.view.ViewGroup.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L10
        android.widget.FrameLayout r4 = new android.widget.FrameLayout(this);     // Catch: java.lang.Throwable -> L10
        r4.setId(this.lg);     // Catch: java.lang.Throwable -> L10
        r2.addView(r4, new android.support.v4.widget.DrawerLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L10
        android.widget.LinearLayout r5 = new android.widget.LinearLayout(this);     // Catch: java.lang.Throwable -> L10
        r5.setId(this.a8);     // Catch: java.lang.Throwable -> L10
        android.support.v4.widget.DrawerLayout.LayoutParams r6 = new android.support.v4.widget.DrawerLayout.LayoutParams((int) (getResources().getDisplayMetrics().density * 240.0f), -1);     // Catch: java.lang.Throwable -> L10
        r6.j6 = 8388611;     // Catch: java.lang.Throwable -> L10
        r5.setDividerDrawable(new android.graphics.drawable.ColorDrawable(0));     // Catch: java.lang.Throwable -> L10
        r5.setBackgroundDrawable(FH(16842836));     // Catch: java.lang.Throwable -> L10
        r2.addView(r5, r6);     // Catch: java.lang.Throwable -> L10
        this.j3 = new android.support.v4.app.C1621a(this, r2, j6("drawable", "ic_drawer"), 17039370, 17039370);     // Catch: java.lang.Throwable -> L10
        r2.setDrawerListener(this.j3);     // Catch: java.lang.Throwable -> L10
        r2.gn(3);     // Catch: java.lang.Throwable -> L10
        java.util.List<com.aide.appwizard.runtime.i.c> r7 = gn().DW();     // Catch: java.lang.Throwable -> L10
        if (r7.size() <= 0) goto L9;
        android.support.v4.app.D r8 = FH().j6();     // Catch: java.lang.Throwable -> L10
        r8.DW(this.a8, j6(r7.get(r7.size() - 1)));     // Catch: java.lang.Throwable -> L10
        r8.j6();     // Catch: java.lang.Throwable -> L10
    L9:
        return r2;
    }

    @abcd.Interfacesu(method = 551749953960359007L)
    protected org.w3c.dom.Document EQ() {
    L10:
        th = move-exception;
        if (QX == false) goto L14;
        abcd.wu.j6(th, -2326812830081695072L, this);
    L14:
        throw th;
    L4:
        if (Ws == false) goto L15;
        abcd.wu.j6(-2326812830081695072L, this);     // Catch: java.lang.Throwable -> L10
    L15:
        java.io.InputStream r2 = getAssets().open("app.xml");     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L10
        org.w3c.dom.Document r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r2);     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L10
        r2.close();     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L10
        return r3;
    L8:
        return null;
    }

    public com.aide.appwizard.runtime.i.b gn() {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, -3921777451163500401L, this);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-3921777451163500401L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return u7().FH();
    }

    @abcd.Interfacesu(method = 119869449320762656L)
    protected android.support.v4.app.Fragment j6(com.aide.appwizard.runtime.i.c r5) {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, 68235050826564721L, this, r5);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(68235050826564721L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.appwizard.runtime.a(this, r5);
    }

    @abcd.Interfacesu(method = -510094280826418400L)
    protected void j6(org.w3c.dom.Document r8, int r9) {
    L6:
        th = move-exception;
        if (QX == false) goto L10;
        abcd.wu.j6(th, -19515046685372375L, this, r8, new java.lang.Integer(r9));
    L10:
        throw th;
    L3:
        if (Ws == false) goto L13;
        abcd.wu.j6(-19515046685372375L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    public void onConfigurationChanged(android.content.res.Configuration r5) {
    L10:
        th = move-exception;
        if (QX == false) goto L14;
        abcd.wu.j6(th, 401967580491910236L, this, r5);
    L14:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(401967580491910236L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onConfigurationChanged(r5);     // Catch: java.lang.Throwable -> L10
        if (this.j3 == null) goto L17;
        this.j3.j6(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = 510272475998754393L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (Ws == false) goto L6;
        abcd.wu.j6(604454705597673144L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        this.XL = new com.aide.appwizard.runtime.i(this);     // Catch: java.lang.Throwable -> L8
        setTheme(J0());     // Catch: java.lang.Throwable -> L8
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L8
        getWindow().setSoftInputMode(2);     // Catch: java.lang.Throwable -> L8
        we();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, 604454705597673144L, this, r10);
    L12:
        throw th;
    }

    @Override
    public boolean onMenuItemSelected(int r8, android.view.MenuItem r9) {
    L13:
        th = move-exception;
        if (QX == false) goto L17;
        abcd.wu.j6(th, 195488587954688263L, this, new java.lang.Integer(r8), r9);
    L17:
        throw th;
    L3:
        if (Ws == false) goto L6;
        abcd.wu.j6(195488587954688263L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L13
    L6:
        if (this.j3 != null) goto L8;
    L11:
        return super.onMenuItemSelected(r8, r9);
    L8:
        if (this.j3.j6(r9) == false) goto L11;
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -2286225256301685413L)
    protected void onPostCreate(android.os.Bundle r5) {
    L10:
        th = move-exception;
        if (QX == false) goto L14;
        abcd.wu.j6(th, -1600831397720718308L, this, r5);
    L14:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-1600831397720718308L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onPostCreate(r5);     // Catch: java.lang.Throwable -> L10
        if (this.j3 == null) goto L17;
        this.j3.j6();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = 457496376154196775L)
    protected int tp() {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, -1052025443468376552L, this);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-1052025443468376552L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.LinearLayout r2 = new android.widget.LinearLayout(this);     // Catch: java.lang.Throwable -> L8
        r2.setId(1000);     // Catch: java.lang.Throwable -> L8
        setContentView(r2);     // Catch: java.lang.Throwable -> L8
        return r2.getId();
    }

    public com.aide.appwizard.runtime.i u7() {
    L8:
        th = move-exception;
        if (QX == false) goto L12;
        abcd.wu.j6(th, -2424561696355265220L, this);
    L12:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-2424561696355265220L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.XL;
    }

    public void we() {
    L37:
        th = move-exception;
        if (QX == false) goto L42;
        abcd.wu.j6(th, -62837885833334721L, this);
    L42:
        throw th;
    L4:
        if (Ws == false) goto L6;
        abcd.wu.j6(-62837885833334721L, this);     // Catch: java.lang.Throwable -> L37
    L6:
        this.j3 = null;     // Catch: java.lang.Throwable -> L37
        this.aM = null;     // Catch: java.lang.Throwable -> L37
        this.U2 = 1001;     // Catch: java.lang.Throwable -> L37
        this.a8 = 1002;     // Catch: java.lang.Throwable -> L37
        this.lg = 1003;     // Catch: java.lang.Throwable -> L37
        this.Mr = tp();     // Catch: java.lang.Throwable -> L37
        android.view.ViewGroup r2 = (android.view.ViewGroup) findViewById(this.Mr);     // Catch: java.lang.Throwable -> L37
        getActionBar().setDisplayShowTitleEnabled(gn().tp());     // Catch: java.lang.Throwable -> L37
        setTitle(gn().Hw());     // Catch: java.lang.Throwable -> L37
        if (gn().Zo() == false) goto L9;
        getActionBar().show();     // Catch: java.lang.Throwable -> L37
    L10:
        int r4 = 0;
        if (gn().gn() == false) goto L13;
        r2.setSystemUiVisibility(4);     // Catch: java.lang.Throwable -> L37
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new com.aide.appwizard.runtime.b(this));     // Catch: java.lang.Throwable -> L37
    L15:
        switch(com.aide.appwizard.runtime.g.DW[gn().v5().ordinal()]) {
            case 1: goto L35;
            case 2: goto L34;
            case 3: goto L29;
            case 4: goto L25;
            case 5: goto L24;
            case 6: goto L23;
            case 7: goto L20;
            case 8: goto L17;
            default: goto L47;
        };     // Catch: java.lang.Throwable -> L37
    L17:
        getActionBar().setNavigationMode(0);     // Catch: java.lang.Throwable -> L37
        j6(r2);     // Catch: java.lang.Throwable -> L37
        if (gn().DW().size() <= 0) goto L48;
        android.support.v4.app.D r3 = FH().j6();     // Catch: java.lang.Throwable -> L37
        r3.DW(this.lg, j6(gn().DW().get(0)));     // Catch: java.lang.Throwable -> L37
        r3.j6();     // Catch: java.lang.Throwable -> L37
        return;
    L48:
        return;
    L20:
        getActionBar().setNavigationMode(0);     // Catch: java.lang.Throwable -> L37
        getActionBar().setDisplayHomeAsUpEnabled(false);     // Catch: java.lang.Throwable -> L37
        getActionBar().setHomeButtonEnabled(false);     // Catch: java.lang.Throwable -> L37
        if (gn().DW().size() <= 0) goto L50;
        android.support.v4.app.D r5 = FH().j6();     // Catch: java.lang.Throwable -> L37
        r5.DW(this.Mr, j6(gn().DW().get(0)));     // Catch: java.lang.Throwable -> L37
        r5.j6();     // Catch: java.lang.Throwable -> L37
        return;
    L50:
        return;
    L23:
        getActionBar().setNavigationMode(0);     // Catch: java.lang.Throwable -> L37
        DW(j6(r2));     // Catch: java.lang.Throwable -> L37
        return;
    L24:
        getActionBar().setNavigationMode(0);     // Catch: java.lang.Throwable -> L37
        getActionBar().setDisplayHomeAsUpEnabled(false);     // Catch: java.lang.Throwable -> L37
        getActionBar().setHomeButtonEnabled(false);     // Catch: java.lang.Throwable -> L37
        DW(r2);     // Catch: java.lang.Throwable -> L37
        return;
    L25:
        getActionBar().setNavigationMode(1);     // Catch: java.lang.Throwable -> L37
        j6(r2);     // Catch: java.lang.Throwable -> L37
        getActionBar().removeAllTabs();     // Catch: java.lang.Throwable -> L37
        java.util.ArrayList r6 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L37
        int r7 = gn().DW().size() - 1;     // Catch: java.lang.Throwable -> L37
    L26:
        if (r4 >= r7) goto L28;
        r6.add(gn().DW().get(r4).v5());     // Catch: java.lang.Throwable -> L37
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L37
        goto L26
    L28:
        getActionBar().setListNavigationCallbacks(new android.widget.ArrayAdapter(getActionBar().getThemedContext(), 17367043, 16908308, r6), new com.aide.appwizard.runtime.d(this));     // Catch: java.lang.Throwable -> L37
        return;
    L29:
        getActionBar().setNavigationMode(1);     // Catch: java.lang.Throwable -> L37
        getActionBar().setDisplayHomeAsUpEnabled(false);     // Catch: java.lang.Throwable -> L37
        getActionBar().setHomeButtonEnabled(false);     // Catch: java.lang.Throwable -> L37
        getActionBar().removeAllTabs();     // Catch: java.lang.Throwable -> L37
        java.util.ArrayList r8 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L37
        java.util.Iterator<com.aide.appwizard.runtime.i.c> r9 = gn().DW().iterator();     // Catch: java.lang.Throwable -> L37
    L31:
        if (r9.hasNext() == false) goto L33;
        r8.add(r9.next().v5());     // Catch: java.lang.Throwable -> L37
        goto L31
    L33:
        getActionBar().setListNavigationCallbacks(new android.widget.ArrayAdapter(getActionBar().getThemedContext(), 17367043, 16908308, r8), new com.aide.appwizard.runtime.c(this));     // Catch: java.lang.Throwable -> L37
        return;
    L34:
        getActionBar().setNavigationMode(2);     // Catch: java.lang.Throwable -> L37
        FH(j6(r2));     // Catch: java.lang.Throwable -> L37
        return;
    L35:
        getActionBar().setNavigationMode(2);     // Catch: java.lang.Throwable -> L37
        getActionBar().setDisplayHomeAsUpEnabled(false);     // Catch: java.lang.Throwable -> L37
        getActionBar().setHomeButtonEnabled(false);     // Catch: java.lang.Throwable -> L37
        FH(r2);     // Catch: java.lang.Throwable -> L37
        return;
    L47:
        return;
    L13:
        r2.setSystemUiVisibility(0);     // Catch: java.lang.Throwable -> L37
        goto L15
    L9:
        getActionBar().hide();     // Catch: java.lang.Throwable -> L37
        goto L10
    }
}
