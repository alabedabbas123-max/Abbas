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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -940411505960907633L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-940411505960907633L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 6675776932769082696L)
    private void j6() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -708310633090152661L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-708310633090152661L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.ui.U.sh() == false) goto L9;
        return;
    L9:
        if (getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false) == true) goto L20;
        new android.os.Handler().postDelayed(new com.aide.ui.activities.RunnableC1736h(this), 500);     // Catch: java.lang.Throwable -> L12
        return;
    }

    public static void j6(android.app.Activity r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, boolean r12) {
        if (j6 == false) goto L5;
        abcd.wu.j6(120160151750775380L, null, new java.lang.Object[]{r6, r7, r8, r9, r10, new java.lang.Integer(r11), new java.lang.Boolean(r12)});
    L5:
        android.content.Intent r0 = new android.content.Intent(r6, com.aide.ui.activities.AndroidTrainerActivity.class);
        r0.putExtra("EXTRA_FILE", r7);
        r0.putExtra("EXTRA_TITLE", r8);
        r0.putExtra("EXTRA_TEXT", r9);
        r0.putExtra("EXTRA_BUTTON", r10);
        r0.putExtra("EXTRA_DURATION", r11);
        r0.putExtra("EXTRA_PLAYGROUND", r12);
        r0.setFlags(268435456);
        r6.startActivity(r0);
    }

    @abcd.Interfacesu(method = 1435873900858969708L)
    private void j6(android.view.ViewGroup r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 483680181943988477L, this, r9);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(483680181943988477L, this, r9);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(this).inflate(com.almlkaide.kaypro.R.layout.trainer_toast, null);     // Catch: java.lang.Throwable -> L8
        r2.setVisibility(8);     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r3 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastTitle);     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r4 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastText);     // Catch: java.lang.Throwable -> L8
        android.widget.TextView r5 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.trainerToastButton);     // Catch: java.lang.Throwable -> L8
        r3.setText(getIntent().getStringExtra("EXTRA_TITLE"));     // Catch: java.lang.Throwable -> L8
        r4.setText(android.text.Html.fromHtml(getIntent().getStringExtra("EXTRA_TEXT")));     // Catch: java.lang.Throwable -> L8
        r5.setText(getIntent().getStringExtra("EXTRA_BUTTON"));     // Catch: java.lang.Throwable -> L8
        r3.setTextSize(com.aide.common.ClassG.gn(this));     // Catch: java.lang.Throwable -> L8
        r4.setTextSize(com.aide.common.ClassG.u7(this));     // Catch: java.lang.Throwable -> L8
        r5.setTextSize(com.aide.common.ClassG.v5(this));     // Catch: java.lang.Throwable -> L8
        r2.findViewById(com.almlkaide.kaypro.R.id.trainerToast).setOnClickListener(new com.aide.ui.activities.ViewOnClickListenera(this));     // Catch: java.lang.Throwable -> L8
        r2.findViewById(com.almlkaide.kaypro.R.id.trainerToast).setOnFocusChangeListener(new com.aide.ui.activities.ViewOnFocusChangeListenerb(this, r5));     // Catch: java.lang.Throwable -> L8
        android.widget.FrameLayout.LayoutParams r6 = new android.widget.FrameLayout.LayoutParams(-2, -2);     // Catch: java.lang.Throwable -> L8
        r6.gravity = 49;     // Catch: java.lang.Throwable -> L8
        r6.topMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L8
        r6.bottomMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L8
        r6.leftMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L8
        r6.rightMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);     // Catch: java.lang.Throwable -> L8
        r9.addView(r2, r6);     // Catch: java.lang.Throwable -> L8
        new android.os.Handler().postDelayed(new com.aide.ui.activities.Runnablef(this, r2), 2000);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1099128719266785416L)
    private void j6(android.view.ViewGroup r9, java.lang.String r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2208595084934995061L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2208595084934995061L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.activities.C1735g r0 = new com.aide.ui.activities.C1735g(this, r9, r10, r11, new com.aide.common.UndoManager());     // Catch: java.lang.Throwable -> L7
        r0.EQ();     // Catch: java.lang.Throwable -> L7
        r0.FH(false);     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.ui.activities.AndroidTrainerActivity r0) {
        r0.j6();
    }

    @Override
    public void onBackPressed() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1364438981659359404L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1364438981659359404L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onBackPressed();     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -517173054876414020L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-157609153277030587L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L8
        setContentView(com.almlkaide.kaypro.R.layout.trainer_app_android);     // Catch: java.lang.Throwable -> L8
        com.aide.common.ClassG.j6(findViewById(com.almlkaide.kaypro.R.id.trainerAppActivityLayout), true);     // Catch: java.lang.Throwable -> L8
        android.widget.FrameLayout r0 = (android.widget.FrameLayout) findViewById(com.almlkaide.kaypro.R.id.trainerAppActivityLayout);     // Catch: java.lang.Throwable -> L8
        java.lang.String r1 = getIntent().getStringExtra("EXTRA_FILE");     // Catch: java.lang.Throwable -> L8
        j6(r0, r1, new java.io.File(r1).getParentFile().getParentFile().getPath());     // Catch: java.lang.Throwable -> L8
        j6(r0);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -157609153277030587L, this, r10);
    L12:
        throw th;
    }
}
