package com.aide.ui.activities;

@abcd.Interfacexu
public class ShopExpertPopupActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -930675309562200177L)
    protected android.view.View FH;

    @abcd.Interfaceru(field = -2119119461774766144L)
    protected android.app.AlertDialog Hw;

    @abcd.Interfaceru(field = 5366976392611420992L)
    private boolean VH;

    @abcd.Interfaceru(field = 3762013480276971719L)
    private boolean Zo;

    @abcd.Interfaceru(field = 5583605880781145664L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -4306460979491257433L)
    private java.util.Map<java.lang.String, abcd.yk.g> v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.ShopExpertPopupActivity.class, 2736360516742849000L, 2736360516742849000L);
    }

    public ShopExpertPopupActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -12569262285979784L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-12569262285979784L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = false;     // Catch: java.lang.Throwable -> L8
        this.gn = com.aide.ui.U.QX().DW();     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String DW(com.aide.ui.activities.ShopExpertPopupActivity r0) {
        return r0.gn;
    }

    @abcd.Interfacesu(method = 2311541783669101599L)
    private boolean DW() {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 3076552904736541895L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(3076552904736541895L, this);     // Catch: java.lang.Throwable -> L17
    L7:
        if (com.aide.ui.U.j6.equals("com.aide.ui") == true) goto L9;
    L15:
        return false;
    L9:
        if (com.aide.ui.U.U2().VH() == false) goto L11;
    L14:
        return true;
    L11:
        if (com.aide.ui.U.U2().we() == true) goto L14;
        if (com.aide.ui.U.U2().v5() == false) goto L15;
        goto L14
    }

    @abcd.Interfacesu(method = -1042469363296919745L)
    private void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -243475566083236273L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-243475566083236273L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r2.add(this.gn);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.QX().j6(r2, new com.aide.ui.activities.J(this));     // Catch: java.lang.Throwable -> L8
    }

    static boolean FH(com.aide.ui.activities.ShopExpertPopupActivity r0) {
        return r0.Zo;
    }

    static void Hw(com.aide.ui.activities.ShopExpertPopupActivity r0) {
        r0.j6();
    }

    static java.util.Map j6(com.aide.ui.activities.ShopExpertPopupActivity r0, java.util.Map r1) {
        r0.v5 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 4173175540750186213L)
    private void j6() {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, 1782624898899905565L, this);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1782624898899905565L, this);     // Catch: java.lang.Throwable -> L29
    L6:
        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertProgressBar).setVisibility(8);     // Catch: java.lang.Throwable -> L29
        android.widget.TextView r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupBuyButton);     // Catch: java.lang.Throwable -> L29
        if (DW() == false) goto L9;
        r2.setText(getString(com.almlkaide.kaypro.R.string.shop_expert_upgrade_for, new java.lang.Object[]{this.v5.get(this.gn).Zo}));     // Catch: java.lang.Throwable -> L29
        ((android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupFreeButton)).setText("No thanks");     // Catch: java.lang.Throwable -> L29
    L10:
        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertButtonsLayout)).setVisibility(0);     // Catch: java.lang.Throwable -> L29
        if (com.aide.ui.U.j6.equals("com.aide.web") == false) goto L14;
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableWeb)).setVisibility(0);     // Catch: java.lang.Throwable -> L29
        return;
    L14:
        if (DW() == false) goto L25;
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableUpgrade)).setVisibility(0);     // Catch: java.lang.Throwable -> L29
        if (com.aide.ui.U.U2().VH() == false) goto L19;
        ((android.widget.ImageView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableUpgradeCurrentPremiumImage)).setImageResource(com.almlkaide.kaypro.R.drawable.project_no_errors);     // Catch: java.lang.Throwable -> L29
    L19:
        if (com.aide.ui.U.U2().we() == false) goto L22;
        ((android.widget.ImageView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableUpgradeCurrentUIDesignerImage)).setImageResource(com.almlkaide.kaypro.R.drawable.project_no_errors);     // Catch: java.lang.Throwable -> L29
    L22:
        if (com.aide.ui.U.U2().v5() == false) goto L36;
        ((android.widget.ImageView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableUpgradeCurrentDebuggerImage)).setImageResource(com.almlkaide.kaypro.R.drawable.project_no_errors);     // Catch: java.lang.Throwable -> L29
        return;
    L36:
        return;
    L25:
        if (getIntent().getBooleanExtra("EXTRA_HILIGHT_ADS", false) == false) goto L27;
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTableNoAds)).setVisibility(0);     // Catch: java.lang.Throwable -> L29
        return;
    L27:
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTable)).setVisibility(0);     // Catch: java.lang.Throwable -> L29
        return;
    L9:
        r2.setText(getString(com.almlkaide.kaypro.R.string.shop_expert_get_for, new java.lang.Object[]{this.v5.get(this.gn).Zo}));     // Catch: java.lang.Throwable -> L29
        goto L10
    }

    static void j6(com.aide.ui.activities.ShopExpertPopupActivity r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = -2404079508397978944L)
    private void j6(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 256298635944194048L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(256298635944194048L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertProgressBar).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertButtonsLayout)).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertFeatureTable)).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupErrorMessage);     // Catch: java.lang.Throwable -> L8
        r2.setVisibility(0);     // Catch: java.lang.Throwable -> L8
        r2.setText(android.text.Html.fromHtml("<b>Error! Please verify that:</b><br><br>- the device is connected to the internet,<br>- the latest version of the Google Play Store is installed,<br>- you are signed in with a valid Google account.<br><br>More information about troubleshooting is available at:<br><br><a href='https://support.google.com/googleplay/digital-content/'>https://support.google.com/googleplay/digital-content/</a><br><br><em>Error details: " + r6 + "</em>"));     // Catch: java.lang.Throwable -> L8
        r2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());     // Catch: java.lang.Throwable -> L8
    }

    static boolean j6(com.aide.ui.activities.ShopExpertPopupActivity r0) {
        return r0.VH;
    }

    @Override
    public void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L15
        if (j6 == false) goto L6;
        abcd.wu.j6(-718495689195481568L, this, r10);     // Catch: java.lang.Throwable -> L15
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L15
        if (com.aide.ui.U.sh() == false) goto L10;
        finish();     // Catch: java.lang.Throwable -> L15
        return;
    L10:
        abcd.F.j6("ExpertShopShownWithLinkId:" + getIntent().getStringExtra("EXTRA_LINKID"));     // Catch: java.lang.Throwable -> L15
        FH();     // Catch: java.lang.Throwable -> L15
        if (getIntent().getBooleanExtra("EXTRA_IS_OPTIONAL_OFFER", false) == false) goto L13;
        this.VH = true;     // Catch: java.lang.Throwable -> L15
    L13:
        com.aide.common.Abstractma.j6(this, new com.aide.ui.activities.G(this));     // Catch: java.lang.Throwable -> L15
        return;
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -718495689195481568L, this, r10);
    L19:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = 6524253363815638935L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3988417443836372775L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3988417443836372775L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    @Override
    @abcd.Interfacesu(method = 142296625807106320L)
    protected void onDestroy() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1117204988007819368L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1117204988007819368L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onDestroy();     // Catch: java.lang.Throwable -> L8
        this.Zo = true;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onMenuItemSelected(int r8, android.view.MenuItem r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -177088230442008179L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-177088230442008179L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r9.getItemId() != 16908332) goto L10;
        setResult(-1);     // Catch: java.lang.Throwable -> L11
        finish();     // Catch: java.lang.Throwable -> L11
        return true;
    L10:
        return super.onMenuItemSelected(r8, r9);
    }

    @Override
    @abcd.Interfacesu(method = -622836588755920568L)
    protected void onPause() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 247105287845344736L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(247105287845344736L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onPause();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.DW(this);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -452860382737980480L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 400708521823072968L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(400708521823072968L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "ShopExpertPopup");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -2996306333913190684L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2265750987231910844L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2265750987231910844L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "ShopExpertPopup");     // Catch: java.lang.Throwable -> L8
    }
}
