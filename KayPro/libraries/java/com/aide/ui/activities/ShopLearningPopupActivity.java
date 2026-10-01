package com.aide.ui.activities;

@abcd.Interfacexu
public class ShopLearningPopupActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1648890656464033024L)
    protected android.view.View FH;

    @abcd.Interfaceru(field = -145199565606340211L)
    protected android.app.AlertDialog Hw;

    @abcd.Interfaceru(field = -2906509558531944073L)
    private boolean VH;

    @abcd.Interfaceru(field = -3290691849602782208L)
    private boolean Zo;

    @abcd.Interfaceru(field = 570808904931598968L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -770342233198451872L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = -2806950284000002567L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 1459202433236499672L)
    private java.util.Map<java.lang.String, abcd.yk.g> v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.ShopLearningPopupActivity.class, -1644854612305552056L, -1644854612305552056L);
    }

    public ShopLearningPopupActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 251381527023501224L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(251381527023501224L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = false;     // Catch: java.lang.Throwable -> L8
        this.gn = com.aide.ui.U.QX().FH();     // Catch: java.lang.Throwable -> L8
        this.u7 = com.aide.ui.U.QX().v5();     // Catch: java.lang.Throwable -> L8
        this.tp = com.aide.ui.U.QX().Hw();     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String DW(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.gn;
    }

    @abcd.Interfacesu(method = -4155866508563534464L)
    private void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3360686955730804231L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3360686955730804231L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r2.add(this.u7);     // Catch: java.lang.Throwable -> L8
        r2.add(this.gn);     // Catch: java.lang.Throwable -> L8
        r2.add(this.tp);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.QX().j6(r2, new com.aide.ui.activities.S(this));     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String FH(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.u7;
    }

    static boolean Hw(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.Zo;
    }

    static java.util.Map j6(com.aide.ui.activities.ShopLearningPopupActivity r0, java.util.Map r1) {
        r0.v5 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -3824587139495311140L)
    private void j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -3574152285907112547L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3574152285907112547L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningProgressBar).setVisibility(8);     // Catch: java.lang.Throwable -> L11
        android.widget.TextView r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningMonthlyButton);     // Catch: java.lang.Throwable -> L11
        android.widget.TextView r3 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningYearlyButton);     // Catch: java.lang.Throwable -> L11
        r2.setText(getString(com.almlkaide.kaypro.R.string.shop_learning_get_for_monthly, new java.lang.Object[]{this.v5.get(this.gn).Zo}));     // Catch: java.lang.Throwable -> L11
        r3.setText(getString(com.almlkaide.kaypro.R.string.shop_learning_get_for_monthly, new java.lang.Object[]{this.v5.get(this.tp).Zo}));     // Catch: java.lang.Throwable -> L11
        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningButtonsLayout)).setVisibility(0);     // Catch: java.lang.Throwable -> L11
        if (com.aide.ui.U.j6.equals("com.aide.web") == false) goto L9;
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTableWeb)).setVisibility(0);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTable)).setVisibility(0);     // Catch: java.lang.Throwable -> L11
    }

    static void j6(com.aide.ui.activities.ShopLearningPopupActivity r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = 568576774256598627L)
    private void j6(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -857512370244588672L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-857512370244588672L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningProgressBar).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningButtonsLayout)).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTable)).setVisibility(8);     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningPopupErrorMessage);     // Catch: java.lang.Throwable -> L8
        r2.setVisibility(0);     // Catch: java.lang.Throwable -> L8
        r2.setText(android.text.Html.fromHtml("<b>Error! Please verify that:</b><br><br>- the device is connected to the internet,<br>- the latest version of the Google Play Store is installed,<br>- you are signed in with a valid Google account.<br><br>More information about troubleshooting is available at:<br><br><a href='https://support.google.com/googleplay/digital-content/'>https://support.google.com/googleplay/digital-content/</a><br><br><em>Error details: " + r6 + "</em>"));     // Catch: java.lang.Throwable -> L8
        r2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());     // Catch: java.lang.Throwable -> L8
    }

    static boolean j6(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.VH;
    }

    static void v5(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        r0.j6();
    }

    @Override
    public void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L15
        if (j6 == false) goto L6;
        abcd.wu.j6(750925099234869120L, this, r10);     // Catch: java.lang.Throwable -> L15
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L15
        if (com.aide.ui.U.sh() == false) goto L10;
        finish();     // Catch: java.lang.Throwable -> L15
        return;
    L10:
        abcd.F.j6("LearningShopShownWithLinkId:" + getIntent().getStringExtra("EXTRA_LINKID"));     // Catch: java.lang.Throwable -> L15
        DW();     // Catch: java.lang.Throwable -> L15
        if (getIntent().getBooleanExtra("EXTRA_IS_OPTIONAL_OFFER", false) == false) goto L13;
        this.VH = true;     // Catch: java.lang.Throwable -> L15
    L13:
        com.aide.common.Abstractma.j6(this, new com.aide.ui.activities.O(this));     // Catch: java.lang.Throwable -> L15
        return;
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 750925099234869120L, this, r10);
    L19:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = 1214533184720117912L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3513975477806556353L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3513975477806556353L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    @Override
    @abcd.Interfacesu(method = 1385150945943265501L)
    protected void onDestroy() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3826420125858720432L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3826420125858720432L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onDestroy();     // Catch: java.lang.Throwable -> L8
        this.Zo = true;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onMenuItemSelected(int r8, android.view.MenuItem r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 485344467358204749L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(485344467358204749L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r9.getItemId() != 16908332) goto L10;
        setResult(-1);     // Catch: java.lang.Throwable -> L11
        finish();     // Catch: java.lang.Throwable -> L11
        return true;
    L10:
        return super.onMenuItemSelected(r8, r9);
    }

    @Override
    @abcd.Interfacesu(method = 1964767387675926309L)
    protected void onPause() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1912252036665293000L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1912252036665293000L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onPause();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.DW(this);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 2138940010856557825L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2077508132099743200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2077508132099743200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "shopLearningPopup");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -999748456836437847L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2149364903973298508L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2149364903973298508L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "shopLearningPopup");     // Catch: java.lang.Throwable -> L8
    }
}
