package com.aide.ui.activities;

@abcd.Interfacexu
public class AndroidTrainerActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.activities.AndroidTrainerActivity.class, 309968735317025088L, 309968735317025088L);
    }

    public AndroidTrainerActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -940411505960907633L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-940411505960907633L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6675776932769082696L)
    private void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, -708310633090152661L, this);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-708310633090152661L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (com.aide.ui.U.sh() == false) { $pc1 = 9; continue $sw1; }
                    return;
                }
                case 9: {
                    if (getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false) == true) { $pc1 = 20; continue $sw1; }
                    try {
                        new android.os.Handler().postDelayed(new com.aide.ui.activities.RunnableC1736h(this), 500);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, boolean r12) {
        android.content.Intent r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    abcd.wu.j6(120160151750775380L, null, new java.lang.Object[]{r6, r7, r8, r9, r10, new java.lang.Integer(r11), new java.lang.Boolean(r12)});
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = new android.content.Intent(r6, com.aide.ui.activities.AndroidTrainerActivity.class);
                    r0.putExtra("EXTRA_FILE", r7);
                    r0.putExtra("EXTRA_TITLE", r8);
                    r0.putExtra("EXTRA_TEXT", r9);
                    r0.putExtra("EXTRA_BUTTON", r10);
                    r0.putExtra("EXTRA_DURATION", r11);
                    r0.putExtra("EXTRA_PLAYGROUND", r12);
                    r0.setFlags(268435456);
                    r6.startActivity(r0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1435873900858969708L)
    private void j6(android.view.ViewGroup r9) {
        android.view.View r2 = null;
        android.widget.TextView r3 = null;
        android.widget.TextView r4 = null;
        android.widget.TextView r5 = null;
        android.widget.FrameLayout.LayoutParams r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 483680181943988477L, this, r9);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(483680181943988477L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(this).inflate(com.almlkaide.kaypro.R.layout.trainer_toast, null);
                        r2.setVisibility(8);
                        r3 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastTitle);
                        r4 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastText);
                        r5 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastButton);
                        r3.setText(getIntent().getStringExtra("EXTRA_TITLE"));
                        r4.setText(android.text.Html.fromHtml(getIntent().getStringExtra("EXTRA_TEXT")));
                        r5.setText(getIntent().getStringExtra("EXTRA_BUTTON"));
                        r3.setTextSize(com.aide.common.ClassG.gn(this));
                        r4.setTextSize(com.aide.common.ClassG.u7(this));
                        r5.setTextSize(com.aide.common.ClassG.v5(this));
                        r2.findViewById(com.almlkaide.kaypro.R.id.trainerToast).setOnClickListener(new com.aide.ui.activities.ViewOnClickListenera(this));
                        r2.findViewById(com.almlkaide.kaypro.R.id.trainerToast).setOnFocusChangeListener(new com.aide.ui.activities.ViewOnFocusChangeListenerb(this, r5));
                        r6 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        r6.gravity = 49;
                        r6.topMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
                        r6.bottomMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
                        r6.leftMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
                        r6.rightMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
                        r9.addView(r2, r6);
                        new android.os.Handler().postDelayed(new com.aide.ui.activities.Runnablef(this, r2), 2000);
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

    @abcd.Interfacesu(method = -1099128719266785416L)
    private void j6(android.view.ViewGroup r9, java.lang.String r10, java.lang.String r11) {
        com.aide.ui.activities.C1735g r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, -2208595084934995061L, this, r9, r10, r11);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-2208595084934995061L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        r0 = new com.aide.ui.activities.C1735g(this, r9, r10, r11, new com.aide.common.UndoManager());
                        r0.EQ();
                        r0.FH(false);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.activities.AndroidTrainerActivity r0) {
        r0.j6();
    }

    @Override
    public void onBackPressed() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1364438981659359404L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1364438981659359404L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        super.onBackPressed();
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -517173054876414020L)
    protected void onCreate(android.os.Bundle r10) {
        android.widget.FrameLayout r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-157609153277030587L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                        setContentView(com.almlkaide.kaypro.R.layout.trainer_app_android);
                        com.aide.common.ClassG.j6(findViewById(com.almlkaide.kaypro.R.id.trainerAppActivityLayout), true);
                        r0 = (android.widget.FrameLayout) findViewById(com.almlkaide.kaypro.R.id.trainerAppActivityLayout);
                        r1 = getIntent().getStringExtra("EXTRA_FILE");
                        j6(r0, r1, new java.io.File(r1).getParentFile().getParentFile().getPath());
                        j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -157609153277030587L, this, r10);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
