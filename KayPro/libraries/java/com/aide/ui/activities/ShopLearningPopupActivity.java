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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 251381527023501224L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(251381527023501224L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.VH = false;
                        this.gn = com.aide.ui.U.QX().FH();
                        this.u7 = com.aide.ui.U.QX().v5();
                        this.tp = com.aide.ui.U.QX().Hw();
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

    static java.lang.String DW(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.gn;
    }

    @abcd.Interfacesu(method = -4155866508563534464L)
    private void DW() {
        java.util.HashSet r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 3360686955730804231L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3360686955730804231L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                        r2.add(this.u7);
                        r2.add(this.gn);
                        r2.add(this.tp);
                        com.aide.ui.U.QX().j6(r2, new com.aide.ui.activities.S(this));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.widget.TextView r2 = null;
        android.widget.TextView r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, -3574152285907112547L, this);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3574152285907112547L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningProgressBar).setVisibility(8);
                        r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningMonthlyButton);
                        r3 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningYearlyButton);
                        r2.setText(getString(com.almlkaide.kaypro.R.string.shop_learning_get_for_monthly, new java.lang.Object[]{this.v5.get(this.gn).Zo}));
                        r3.setText(getString(com.almlkaide.kaypro.R.string.shop_learning_get_for_monthly, new java.lang.Object[]{this.v5.get(this.tp).Zo}));
                        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningButtonsLayout)).setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    if (com.aide.ui.U.j6.equals("com.aide.web") == false) { $pc2 = 9; continue $sw2; }
                    try {
                        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTableWeb)).setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    return;
                }
                case 9: {
                    try {
                        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTable)).setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.activities.ShopLearningPopupActivity r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = 568576774256598627L)
    private void j6(java.lang.String r6) {
        android.widget.TextView r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -857512370244588672L, this, r6);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-857512370244588672L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningProgressBar).setVisibility(8);
                        ((android.view.ViewGroup) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningButtonsLayout)).setVisibility(8);
                        ((android.widget.TableLayout) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFeatureTable)).setVisibility(8);
                        r2 = (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningPopupErrorMessage);
                        r2.setVisibility(0);
                        r2.setText(android.text.Html.fromHtml("<b>Error! Please verify that:</b><br><br>- the device is connected to the internet,<br>- the latest version of the Google Play Store is installed,<br>- you are signed in with a valid Google account.<br><br>More information about troubleshooting is available at:<br><br><a href='https://support.google.com/googleplay/digital-content/'>https://support.google.com/googleplay/digital-content/</a><br><br><em>Error details: " + r6 + "</em>"));
                        r2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        return r0.VH;
    }

    static void v5(com.aide.ui.activities.ShopLearningPopupActivity r0) {
        r0.j6();
    }

    @Override
    public void onCreate(android.os.Bundle r10) {
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
                        $pc4 = 15; continue $sw4;
                    }
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(750925099234869120L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (com.aide.ui.U.sh() == false) { $pc4 = 10; continue $sw4; }
                    try {
                        finish();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    return;
                }
                case 10: {
                    try {
                        abcd.F.j6("LearningShopShownWithLinkId:" + getIntent().getStringExtra("EXTRA_LINKID"));
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (getIntent().getBooleanExtra("EXTRA_IS_OPTIONAL_OFFER", false) == false) { $pc4 = 13; continue $sw4; }
                    try {
                        this.VH = true;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    try {
                        com.aide.common.Abstractma.j6(this, new com.aide.ui.activities.O(this));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    return;
                }
                case 15: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 19; continue $sw4; }
                    abcd.wu.j6(th, 750925099234869120L, this, r10);
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1214533184720117912L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, -3513975477806556353L, this, new java.lang.Integer(r8), r9);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-3513975477806556353L, this, new java.lang.Integer(r8), r9);
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

    @Override
    @abcd.Interfacesu(method = 1385150945943265501L)
    protected void onDestroy() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 3826420125858720432L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(3826420125858720432L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        super.onDestroy();
                        this.Zo = true;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onMenuItemSelected(int r8, android.view.MenuItem r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 15; continue $sw7; }
                    abcd.wu.j6(th, 485344467358204749L, this, new java.lang.Integer(r8), r9);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(485344467358204749L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r9.getItemId() != 16908332) { $pc7 = 10; continue $sw7; }
                    try {
                        setResult(-1);
                        finish();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    return true;
                }
                case 10: {
                    return super.onMenuItemSelected(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1964767387675926309L)
    protected void onPause() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 1912252036665293000L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(1912252036665293000L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        super.onPause();
                        com.aide.ui.U.DW(this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2138940010856557825L)
    protected void onStart() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 2077508132099743200L, this);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(2077508132099743200L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        super.onStart();
                        abcd.F.DW(this, "shopLearningPopup");
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

    @Override
    @abcd.Interfacesu(method = -999748456836437847L)
    protected void onStop() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -2149364903973298508L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-2149364903973298508L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        super.onStop();
                        abcd.F.j6(this, "shopLearningPopup");
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
}
