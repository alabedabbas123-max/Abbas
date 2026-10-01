package com.aide.ui.activities;

@abcd.Interfacexu
public class GotoBrowserActivity extends com.aide.ui.ThemedGotoActivity {

    @abcd.Interfaceru(field = 2965950475927668947L)
    private static int FH;

    @abcd.Interfaceru(field = 2954397894246891213L)
    private static java.lang.CharSequence Hw;

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfacetu
    private static boolean v5;

    @abcd.Interfaceru(field = 2208308117521503907L)
    private com.aide.common.sa VH;

    @abcd.Interfacexu
    private class a extends android.widget.ArrayAdapter<com.aide.engine.SourceEntity> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.activities.GotoBrowserActivity FH;

        static {
            abcd.wu.j6(com.aide.ui.activities.GotoBrowserActivity.a.class, -2653611534896104011L, -2653611534896104011L);
        }

        @abcd.Interfacesu(method = -1140655428716802929L)
        public a(com.aide.ui.activities.GotoBrowserActivity r9, android.content.Context r10, java.util.List<com.aide.engine.SourceEntity> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -362731200115586097L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-362731200115586097L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.almlkaide.kaypro.R.layout.gotobrowser_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 284351663703988889L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L39:
            th = move-exception;
            if (DW == false) goto L43;
            abcd.wu.j6(th, -1355610482816193813L, this, new java.lang.Integer(r9), r10, r11);
        L43:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1355610482816193813L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L39
        L5:
            int r0 = 0;
            if (r10 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.gotobrowser_entry, r11, false);     // Catch: java.lang.Throwable -> L39
        L9:
            com.aide.engine.SourceEntity r2 = getItem(r9);     // Catch: java.lang.Throwable -> L39
            android.widget.ImageView r3 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryImage);     // Catch: java.lang.Throwable -> L39
            int r4 = com.aide.ui.activities.ClassZ.j6[r2.EQ().ordinal()];     // Catch: java.lang.Throwable -> L39
            if (r4 == 1) goto L28;
            if (r4 == 2) goto L24;
            if (r4 != 3) goto L16;
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.objects);     // Catch: java.lang.Throwable -> L39
        L31:
            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryName)).setText(com.aide.ui.activities.GotoBrowserActivity.j6(this.FH, r2));     // Catch: java.lang.Throwable -> L39
            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryContainerName)).setText(com.aide.ui.activities.GotoBrowserActivity.DW(this.FH, r2));     // Catch: java.lang.Throwable -> L39
            android.view.View r5 = r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserHelpButton);     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = r2.VH();     // Catch: java.lang.Throwable -> L39
            if (r6 != null) goto L35;
            r0 = 8;
        L35:
            r5.setVisibility(r0);     // Catch: java.lang.Throwable -> L39
            if (r6 == null) goto L38;
            r5.setOnClickListener(new com.aide.ui.activities.A(this, r6));     // Catch: java.lang.Throwable -> L39
        L38:
            return r1;
        L16:
            if (r4 != 4) goto L18;
            r3.setImageResource(com.aide.ui.ca.j6(r2.DW()));     // Catch: java.lang.Throwable -> L39
            goto L31
        L18:
            if (r4 == 5) goto L20;
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.browser_empty);     // Catch: java.lang.Throwable -> L39
            goto L31
        L20:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.pakage);     // Catch: java.lang.Throwable -> L39
            goto L31
        L24:
            if (r2.XL() == false) goto L26;
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_blue);     // Catch: java.lang.Throwable -> L39
            goto L31
        L26:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);     // Catch: java.lang.Throwable -> L39
            goto L31
        L28:
            if (r2.XL() == false) goto L30;
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_red);     // Catch: java.lang.Throwable -> L39
            goto L31
        L30:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_red);     // Catch: java.lang.Throwable -> L39
            goto L31
        L8:
            r1 = r10;
            goto L9
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.activities.GotoBrowserActivity.class, -667729815873843261L, -667729815873843261L);     // Catch: java.lang.Throwable -> L8
        if (v5 == false) goto L6;
        abcd.wu.j6(-3117529652831659872L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        FH = 50;     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -3117529652831659872L, null);
    L12:
        throw th;
    }

    public GotoBrowserActivity() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -1065574352003609532L, null);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(-1065574352003609532L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = new com.aide.common.sa(this, "Analyzing...");     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2591126029782879488L)
    private java.lang.String DW(com.aide.engine.SourceEntity r6) {
    L10:
        th = move-exception;
        if (Zo == false) goto L14;
        abcd.wu.j6(th, 1786028596531637535L, this, r6);
    L14:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(1786028596531637535L, this, r6);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r2 = "" + r6.we();     // Catch: java.lang.Throwable -> L10
        if (r6.EQ() != com.aide.engine.SourceEntity.a.j6) goto L17;
        return r2 + "()";
    L17:
        return r2;
    }

    static java.lang.String DW(com.aide.ui.activities.GotoBrowserActivity r0, com.aide.engine.SourceEntity r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = 220831444424747475L)
    private void DW() {
    L15:
        th = move-exception;
        if (Zo == false) goto L19;
        abcd.wu.j6(th, 2760982640077057004L, this);
    L19:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(2760982640077057004L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (((android.widget.Switch) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSwitch)).isChecked() == true) goto L9;
        boolean r2 = true;
    L10:
        java.lang.String r3 = ((android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox)).getText().toString().trim();     // Catch: java.lang.Throwable -> L15
        if (r2 == false) goto L13;
        com.aide.ui.U.EQ().FH(r3, FH);     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        com.aide.ui.U.EQ().DW(r3, FH);     // Catch: java.lang.Throwable -> L15
        return;
    L9:
        r2 = false;
        goto L10
    }

    static void DW(com.aide.ui.activities.GotoBrowserActivity r0) {
        r0.j6();
    }

    static com.aide.common.sa FH(com.aide.ui.activities.GotoBrowserActivity r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = 7110874651396888645L)
    private java.lang.String j6(com.aide.engine.SourceEntity r5) {
    L12:
        th = move-exception;
        if (Zo == false) goto L16;
        abcd.wu.j6(th, 6517794786912804864L, this, r5);
    L16:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(6517794786912804864L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (r5.EQ() != com.aide.engine.SourceEntity.a.QX) goto L11;
        return r5.J0();
    L11:
        return r5.Zo();
    }

    static java.lang.String j6(com.aide.ui.activities.GotoBrowserActivity r0, com.aide.engine.SourceEntity r1) {
        return r0.DW(r1);
    }

    @abcd.Interfacesu(method = 2257502459156571825L)
    private void j6() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 2471589248868387424L, this);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(2471589248868387424L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(true, null, null);     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(android.app.Activity r8, boolean r9, int r10) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, 2766505377015924775L, null, r8, new java.lang.Boolean(r9), new java.lang.Integer(r10));
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(2766505377015924775L, null, r8, new java.lang.Boolean(r9), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent(r8, com.aide.ui.activities.GotoBrowserActivity.class);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_SYMBOLS", r9);     // Catch: java.lang.Throwable -> L7
        r8.startActivityForResult(r0, r10);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.content.Intent r10) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 3337005965849602700L, null, r10);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(3337005965849602700L, null, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Tl r3 = new abcd.Tl(r10.getExtras().getString("FILEPATH"), r10.getExtras().getInt("STARTLINE_EXTRA"), r10.getExtras().getInt("STARTCOLUMN_EXTRA"), r10.getExtras().getInt("ENDLINE_EXTRA"), r10.getExtras().getInt("ENDCOLUMN_EXTRA"));     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.lg().j6(r3);     // Catch: java.lang.Throwable -> L8
    }

    static void j6(com.aide.ui.activities.GotoBrowserActivity r0) {
        r0.DW();
    }

    static void j6(com.aide.ui.activities.GotoBrowserActivity r0, java.lang.String r1, int r2, int r3, int r4, int r5) {
        r0.j6(r1, r2, r3, r4, r5);
    }

    static void j6(com.aide.ui.activities.GotoBrowserActivity r0, boolean r1, java.util.List r2, java.lang.String r3) {
        r0.j6(r1, r2, r3);
    }

    @abcd.Interfacesu(method = -541891891794149156L)
    private void j6(java.lang.String r11, int r12, int r13, int r14, int r15) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, -6739619606312372215L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(-6739619606312372215L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        this.VH.j6();     // Catch: java.lang.Throwable -> L7
        android.widget.EditText r0 = (android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox);     // Catch: java.lang.Throwable -> L7
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(r0.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L7
        android.content.Intent r1 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r1.putExtra("FILEPATH", r11);     // Catch: java.lang.Throwable -> L7
        r1.putExtra("STARTLINE_EXTRA", r12);     // Catch: java.lang.Throwable -> L7
        r1.putExtra("STARTCOLUMN_EXTRA", r13);     // Catch: java.lang.Throwable -> L7
        r1.putExtra("ENDLINE_EXTRA", r14);     // Catch: java.lang.Throwable -> L7
        r1.putExtra("ENDCOLUMN_EXTRA", r15);     // Catch: java.lang.Throwable -> L7
        setResult(-1, r1);     // Catch: java.lang.Throwable -> L7
        finish();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 2340003444621195565L)
    private void j6(java.util.List<com.aide.engine.SourceEntity> r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, 2244486950744045480L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(2244486950744045480L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.Collections.sort(r8, new com.aide.ui.activities.ClassY(this, r9));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 3261344824627472499L)
    private void j6(boolean r9, java.util.List<com.aide.engine.SourceEntity> r10, java.lang.String r11) {
    L15:
        th = move-exception;
        if (Zo == false) goto L19;
        abcd.wu.j6(th, 1325162695545548336L, this, new java.lang.Boolean(r9), r10, r11);
    L19:
        throw th;
    L3:
        if (v5 == false) goto L6;
        abcd.wu.j6(1325162695545548336L, this, new java.lang.Boolean(r9), r10, r11);     // Catch: java.lang.Throwable -> L15
    L6:
        if (r9 == false) goto L8;
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(0);     // Catch: java.lang.Throwable -> L15
        return;
    L8:
        if (r10 != null) goto L11;
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(0);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        ((android.widget.TextView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage)).setText("> " + FH + " matching items");     // Catch: java.lang.Throwable -> L15
        return;
    L11:
        if (r10.size() != 0) goto L13;
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(0);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        ((android.widget.TextView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage)).setText("No matching items");     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(0);     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);     // Catch: java.lang.Throwable -> L15
        j6(r10, r11);     // Catch: java.lang.Throwable -> L15
        android.widget.ListView r0 = (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList);     // Catch: java.lang.Throwable -> L15
        r0.setAdapter(new com.aide.ui.activities.GotoBrowserActivity.a(this, this, r10));     // Catch: java.lang.Throwable -> L15
        r0.setOnItemClickListener(new com.aide.ui.activities.C1750w(this, r0));     // Catch: java.lang.Throwable -> L15
        r0.setOnItemLongClickListener(new com.aide.ui.activities.C1751x(this, r0));     // Catch: java.lang.Throwable -> L15
    }

    @Override
    @abcd.Interfacesu(method = 586063925840635148L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L15
        if (v5 == false) goto L6;
        abcd.wu.j6(196325810694803243L, this, r10);     // Catch: java.lang.Throwable -> L15
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L15
        setContentView(com.almlkaide.kaypro.R.layout.gotobrowser);     // Catch: java.lang.Throwable -> L15
        com.aide.ui.U.EQ().j6(new com.aide.ui.activities.Binders(this));     // Catch: java.lang.Throwable -> L15
        android.widget.EditText r0 = (android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox);     // Catch: java.lang.Throwable -> L15
        r0.addTextChangedListener(new com.aide.ui.activities.ClassT(this));     // Catch: java.lang.Throwable -> L15
        if (Hw == null) goto L9;
        r0.setText(Hw);     // Catch: java.lang.Throwable -> L15
    L9:
        r0.selectAll();     // Catch: java.lang.Throwable -> L15
        android.widget.Switch r1 = (android.widget.Switch) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSwitch);     // Catch: java.lang.Throwable -> L15
        boolean r3 = true;
        if (getIntent().getExtras().getBoolean("EXTRA_SYMBOLS", true) == false) goto L13;
        r3 = false;
    L13:
        r1.setChecked(r3);     // Catch: java.lang.Throwable -> L15
        r1.setOnCheckedChangeListener(new com.aide.ui.activities.ClassU(this));     // Catch: java.lang.Throwable -> L15
        findViewById(com.almlkaide.kaypro.R.id.gotobrowserBackground).setOnClickListener(new com.aide.ui.activities.ViewOnClickListenerv(this));     // Catch: java.lang.Throwable -> L15
        j6();     // Catch: java.lang.Throwable -> L15
        DW();     // Catch: java.lang.Throwable -> L15
        return;
    L15:
        th = move-exception;
        if (Zo == false) goto L19;
        abcd.wu.j6(th, 196325810694803243L, this, r10);
    L19:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = -18491717931216936L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -3147261160318311015L, this);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(-3147261160318311015L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "Goto Browser");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 2333925357254539776L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -2588966595220279479L, this);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(-2588966595220279479L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        Hw = ((android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox)).getText();     // Catch: java.lang.Throwable -> L8
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "Goto Browser");     // Catch: java.lang.Throwable -> L8
    }
}
