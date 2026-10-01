package com.aide.appwizard;

@abcd.Interfacexu
public class AppWizardDesignActivity extends com.aide.appwizard.runtime.AppWizardActivity implements com.aide.common.UndoManager.a {

    @abcd.Interfaceuu
    private static boolean er;

    @abcd.Interfacetu
    private static boolean rN;

    @abcd.Interfaceru(field = -5352084308253688415L)
    private boolean BT;

    @abcd.Interfaceru(field = 2620692931698923016L)
    private com.aide.common.UndoManager gW;

    @abcd.Interfaceru(field = -2805678668597169024L)
    private com.aide.appwizard.B yS;

    static {
        abcd.wu.j6(com.aide.appwizard.AppWizardDesignActivity.class, 2913940607094183125L, 2913940607094183125L);
    }

    public AppWizardDesignActivity() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -6904562788031962339L, null);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-6904562788031962339L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.yS = new com.aide.appwizard.B(this);     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.common.UndoManager DW(com.aide.appwizard.AppWizardDesignActivity r0) {
        return r0.gW;
    }

    @abcd.Interfacesu(method = 250922864455321960L)
    private org.w3c.dom.Document DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -707556527892343976L, this, r5);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-707556527892343976L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream(r5.getBytes());     // Catch: java.lang.Throwable -> L8
        org.w3c.dom.Document r3 = com.aide.common.pa.j6(r2);     // Catch: java.lang.Throwable -> L8
        r2.close();     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    @abcd.Interfacesu(method = -796916692242759036L)
    private void DW(boolean r6) {
    L14:
        th = move-exception;
        if (er == false) goto L19;
        abcd.wu.j6(th, -596202950687543532L, this, new java.lang.Boolean(r6));
    L19:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-596202950687543532L, this, r6);     // Catch: java.lang.Throwable -> L14
    L6:
        android.content.SharedPreferences.Editor r2 = getSharedPreferences("AppWizard", 0).edit();     // Catch: java.lang.Throwable -> L14
        r2.putBoolean("PREF_APPWIZARD_EDITMODE", r6);     // Catch: java.lang.Throwable -> L14
        r2.commit();     // Catch: java.lang.Throwable -> L14
        java.util.Iterator<android.support.v4.app.Fragment> r3 = FH().FH().iterator();     // Catch: java.lang.Throwable -> L14
    L8:
        if (r3.hasNext() == false) goto L12;
        android.support.v4.app.Fragment r4 = r3.next();     // Catch: java.lang.Throwable -> L14
        if ((r4 instanceof com.aide.appwizard.h) == false) goto L8;
        ((com.aide.appwizard.h) r4).OW();     // Catch: java.lang.Throwable -> L14
        goto L8
    L12:
        aM();     // Catch: java.lang.Throwable -> L14
    }

    @abcd.Interfacesu(method = -914337038102759600L)
    private void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -377184259200432992L, this, r5);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-377184259200432992L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        java.io.FileWriter r2 = new java.io.FileWriter(XL());     // Catch: java.lang.Throwable -> L8
        r2.write(r5);     // Catch: java.lang.Throwable -> L8
        r2.close();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4106308932470283168L)
    private java.lang.String XL() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 168272603472369888L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(168272603472369888L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return J0() + "/assets/app.xml";
    }

    @abcd.Interfacesu(method = 1624984027671534292L)
    private void aM() {
    L16:
        th = move-exception;
        if (er == false) goto L20;
        abcd.wu.j6(th, -2205098022962184540L, this);
    L20:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-2205098022962184540L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        android.widget.ImageView r2 = (android.widget.ImageView) findViewById(com.aide.ui.Na.appwizardModeButton);     // Catch: java.lang.Throwable -> L16
        if (QX() == false) goto L9;
        r2.setImageResource(com.aide.ui.R$drawable.ic_menu_edit);     // Catch: java.lang.Throwable -> L16
    L10:
        android.view.View r3 = findViewById(com.aide.ui.Na.appwizardEditButtonLayout);     // Catch: java.lang.Throwable -> L16
        if (QX() == false) goto L13;
        int r4 = 0;
    L14:
        r3.setVisibility(r4);     // Catch: java.lang.Throwable -> L16
        findViewById(com.aide.ui.Na.appwizardUndoButton).setEnabled(this.gW.DW());     // Catch: java.lang.Throwable -> L16
        findViewById(com.aide.ui.Na.appwizardRedoButton).setEnabled(this.gW.j6());     // Catch: java.lang.Throwable -> L16
        return;
    L13:
        r4 = 8;
        goto L14
    L9:
        r2.setImageResource(com.aide.ui.R$drawable.ic_menu_view);     // Catch: java.lang.Throwable -> L16
        goto L10
    }

    @abcd.Interfacesu(method = 2102742534531679011L)
    private void j3() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 2597880133305324571L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(2597880133305324571L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        aM();     // Catch: java.lang.Throwable -> L8
        findViewById(com.aide.ui.Na.appwizardModeButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerb(this));     // Catch: java.lang.Throwable -> L8
        findViewById(com.aide.ui.Na.appwizardEditButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerc(this));     // Catch: java.lang.Throwable -> L8
        findViewById(com.aide.ui.Na.appwizardUndoButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerd(this));     // Catch: java.lang.Throwable -> L8
        findViewById(com.aide.ui.Na.appwizardRedoButton).setOnClickListener(new com.aide.appwizard.e(this));     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.appwizard.B j6(com.aide.appwizard.AppWizardDesignActivity r0) {
        return r0.yS;
    }

    static void j6(com.aide.appwizard.AppWizardDesignActivity r0, boolean r1) {
        r0.DW(r1);
    }

    @Override
    public void DW() {
    L10:
        th = move-exception;
        if (er == false) goto L14;
        abcd.wu.j6(th, 264662972645095557L, this);
    L14:
        throw th;
    L4:
        if (rN == false) goto L7;
        abcd.wu.j6(264662972645095557L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.BT == false) goto L17;
        aM();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = 3098058398552670469L)
    protected org.w3c.dom.Document EQ() {
    L10:
        th = move-exception;
        if (er == false) goto L14;
        abcd.wu.j6(th, 2461068550482008733L, this);
    L14:
        throw th;
    L4:
        if (rN == false) goto L17;
        abcd.wu.j6(2461068550482008733L, this);     // Catch: java.lang.Throwable -> L10
    L17:
        java.lang.String r2 = com.aide.appwizard.D.j6(XL());     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L10
        this.gW.j6(XL(), r2, 0);     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L10
        return DW(r2);
    L8:
        return null;
    }

    public java.lang.String FH(int r6) {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -8245276577243568135L, this, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-8245276577243568135L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String r3 = "fragment" + (r6 + 1);     // Catch: java.lang.Throwable -> L8
        gn().j6(r6).j6(r3);     // Catch: java.lang.Throwable -> L8
        return j6(r3);
    }

    public java.lang.String J0() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 3608242947054295088L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(3608242947054295088L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.appwizard.D.j6() + "/AppProjects/AppWizard";
    }

    public java.lang.String J8() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 4545960354605069604L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(4545960354605069604L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return J0() + "/res";
    }

    public boolean QX() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -641302897837442405L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-641302897837442405L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getSharedPreferences("AppWizard", 0).getBoolean("PREF_APPWIZARD_EDITMODE", true);
    }

    public com.aide.common.UndoManager Ws() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 3962180854406689681L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(3962180854406689681L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gW;
    }

    @Override
    @abcd.Interfacesu(method = 691631376643698848L)
    protected android.support.v4.app.Fragment j6(com.aide.appwizard.runtime.i.c r5) {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 6502358185241633248L, this, r5);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(6502358185241633248L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.appwizard.h.j6(r5);
    }

    public java.lang.String j6(java.lang.String r5) {
    L11:
        th = move-exception;
        if (er == false) goto L15;
        abcd.wu.j6(th, -6130386242084568387L, this, r5);
    L15:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-6130386242084568387L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5 == null) goto L9;
        return J8() + "/layout/" + r5 + ".xml";
    L9:
        return null;
    }

    @Override
    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
    L9:
        th = move-exception;
        if (er == false) goto L13;
        abcd.wu.j6(th, 3682180538294556312L, this, r9, r10, new java.lang.Integer(r11));
    L13:
        throw th;
    L3:
        if (rN == false) goto L6;
        abcd.wu.j6(3682180538294556312L, this, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L9
    L6:
        if (r9.equals(XL()) == false) goto L18;
        FH(r10);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L9
        u7().j6(DW(r10), r11);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L9
        return;
    L19:
        return;
    }

    @Override
    @abcd.Interfacesu(method = -970430955756054336L)
    protected void j6(org.w3c.dom.Document r8, int r9) {
    L7:
        th = move-exception;
        if (er == false) goto L11;
        abcd.wu.j6(th, 29282458577692672L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (rN == false) goto L13;
        abcd.wu.j6(29282458577692672L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L13:
        java.lang.String r0 = new com.aide.appwizard.C().j6(r8);     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L7
        this.gW.DW(XL(), r0, r9);     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L7
        new java.io.File(XL()).getParentFile().mkdirs();     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L7
        FH(r0);     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 604787746086475155L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L14
        if (rN == false) goto L6;
        abcd.wu.j6(396469608976986363L, this, r10);     // Catch: java.lang.Throwable -> L14
    L6:
        android.util.Log.d(getPackageName(), "onCreate()");     // Catch: java.lang.Throwable -> L14
        if (abcd.F.DW() == true) goto L9;
        abcd.F.j6(this, new com.aide.appwizard.ClassA(this));     // Catch: java.lang.Throwable -> L14
    L9:
        this.gW = new com.aide.common.UndoManager();     // Catch: java.lang.Throwable -> L14
        this.gW.j6(this);     // Catch: java.lang.Throwable -> L14
        if (r10 == null) goto L12;
        this.gW.j6(r10);     // Catch: java.lang.Throwable -> L14
    L12:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L14
        return;
    L14:
        th = move-exception;
        if (er == false) goto L18;
        abcd.wu.j6(th, 396469608976986363L, this, r10);
    L18:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = 1056534037715966656L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (er == false) goto L11;
        abcd.wu.j6(th, -1250959508217015936L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (rN == false) goto L5;
        abcd.wu.j6(-1250959508217015936L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 4377392057228154327L, this, r5);
    L12:
        throw th;
    L4:
        if (rN == false) goto L15;
        abcd.wu.j6(4377392057228154327L, this, r5);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    @abcd.Interfacesu(method = 2647583274613300205L)
    protected void onDestroy() {
    L10:
        th = move-exception;
        if (er == false) goto L14;
        abcd.wu.j6(th, -1804378661955014315L, this);
    L14:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-1804378661955014315L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onDestroy();     // Catch: java.lang.Throwable -> L10
        if (this.gW == null) goto L17;
        this.gW.DW(this);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1731010988790436612L)
    protected void onSaveInstanceState(android.os.Bundle r5) {
    L10:
        th = move-exception;
        if (er == false) goto L14;
        abcd.wu.j6(th, 5908860950119534476L, this, r5);
    L14:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(5908860950119534476L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onSaveInstanceState(r5);     // Catch: java.lang.Throwable -> L10
        if (this.gW == null) goto L17;
        this.gW.DW(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = -6095803384248157827L)
    protected int tp() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, 4667213631028605525L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(4667213631028605525L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        setContentView(com.aide.ui.Oa.appwizard);     // Catch: java.lang.Throwable -> L8
        return com.aide.ui.Na.appwizardContentContainer;
    }

    @Override
    public void we() {
    L8:
        th = move-exception;
        if (er == false) goto L12;
        abcd.wu.j6(th, -836416611662812612L, this);
    L12:
        throw th;
    L4:
        if (rN == false) goto L6;
        abcd.wu.j6(-836416611662812612L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.we();     // Catch: java.lang.Throwable -> L8
        this.BT = true;     // Catch: java.lang.Throwable -> L8
        j3();     // Catch: java.lang.Throwable -> L8
    }
}
