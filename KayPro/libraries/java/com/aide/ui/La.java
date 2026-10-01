package com.aide.ui;

@abcd.Interfacexu
public class La {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1727286895245966352L)
    private com.aide.ui.MainActivity FH;

    @abcd.Interfaceru(field = 691657283612899184L)
    private android.view.View Hw;

    @abcd.Interfaceru(field = -5821078094900747817L)
    private android.view.KeyCharacterMap VH;

    @abcd.Interfaceru(field = -2990837279321786944L)
    private boolean Zo;

    @abcd.Interfaceru(field = 3030609248821693084L)
    private java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.ui.La.class, -1995725694195156355L, -1995725694195156355L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public La(com.aide.ui.MainActivity r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1405509376429968439L, null, r7);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1405509376429968439L, null, r7);     // Catch: java.lang.Throwable -> L14
    L6:
        this.v5 = "";     // Catch: java.lang.Throwable -> L14
        this.FH = r7;     // Catch: java.lang.Throwable -> L14
        android.view.ViewGroup r3 = (android.view.ViewGroup) r7.findViewById(com.almlkaide.kaypro.R.id.mainQuickKeyBarContainer);     // Catch: java.lang.Throwable -> L14
        this.Hw = android.view.LayoutInflater.from(r7).inflate(com.almlkaide.kaypro.R.layout.quickkeysbar, r3);     // Catch: java.lang.Throwable -> L14
        if (com.aide.common.ClassG.DW(r7) >= 360.0f) goto L9;
    L11:
        boolean r4 = false;
    L12:
        DW(r4);     // Catch: java.lang.Throwable -> L14
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButton).setOnClickListener(new com.aide.ui.Ia(this));     // Catch: java.lang.Throwable -> L14
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarCloseButton).setOnClickListener(new com.aide.ui.Ja(this));     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        if (com.aide.common.ClassG.J0(r7) == false) goto L11;
        r4 = true;
        goto L12
    }

    static com.aide.ui.MainActivity DW(com.aide.ui.La r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = -1256956778787942960L)
    private void DW(boolean r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 358316072962785888L, this, new java.lang.Boolean(r8));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(358316072962785888L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        this.Zo = r8;     // Catch: java.lang.Throwable -> L11
        if (r8 == false) goto L9;
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButtonContainer).setVisibility(8);     // Catch: java.lang.Throwable -> L11
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarKeysContainer).setVisibility(0);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButtonContainer).setVisibility(0);     // Catch: java.lang.Throwable -> L11
        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarKeysContainer).setVisibility(8);     // Catch: java.lang.Throwable -> L11
    }

    static android.view.KeyCharacterMap j6(com.aide.ui.La r0) {
        return r0.VH;
    }

    static android.view.KeyCharacterMap j6(com.aide.ui.La r0, android.view.KeyCharacterMap r1) {
        r0.VH = r1;
        return r1;
    }

    static void j6(com.aide.ui.La r0, boolean r1) {
        r0.DW(r1);
    }

    private float v5() {
        float r1 = 60.0f;
        float r2 = com.aide.common.ClassG.DW(this.FH) / 12.0f;
        if (r2 > 60.0f) goto L5;
        r1 = r2;
    L5:
        if (r1 >= 30.0f) goto L9;
        return 30.0f;
    L9:
        return r1;
    }

    public int j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 36864782005627680L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(36864782005627680L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.Zo == false) goto L11;
        return (int) (this.FH.getResources().getDisplayMetrics().density * 40.0f);
    L11:
        return 0;
    }

    public void j6(java.lang.String r9) {
        java.lang.String r1 = com.almlkaide.kaypro.aide.AdvancedSetting.getEditorQuickKey();
        if (this.Hw == null) goto L10;
        if (r1 != null) goto L6;
        return;
    L6:
        if (this.v5.equals(r1) == true) goto L23;
        this.v5 = r1;
        android.view.LayoutInflater r3 = android.view.LayoutInflater.from(this.FH);
        android.view.ViewGroup r0 = (android.view.ViewGroup) this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarList);
        r0.removeAllViews();
        int r4 = com.almlkaide.kaypro.util.Utils.dp2px(40);
        java.lang.String[] r5 = r1.split("\n");
        int r2 = 0;
    L8:
        int r6 = r2;
        if (r6 >= r5.length) goto L24;
        java.lang.String r7 = r5[r6];
        if (r7.length() == 0) goto L17;
        android.widget.TextView r8 = (android.widget.TextView) r3.inflate(com.almlkaide.kaypro.R.layout.quickkeysbar_key, (android.view.ViewGroup) null);
        if ("#sp".equals(r7) == false) goto L18;
        r8.setText("→");
        r8.setOnClickListener(new com.aide.ui.Ka(this, "\t"));
    L16:
        r0.addView(r8, -2, r4);
        goto L17
    L18:
        r8.setText(r7);
        r8.setOnClickListener(new com.aide.ui.Ka(this, r7));
    L17:
        r2 = r6 + 1;
        goto L8
    L24:
        return;
    L23:
        return;
    }

    public void j6(boolean r1) {
        com.almlkaide.kaypro.aide.util.QuickKey.setQuickBarVisibility(this, r1);
    }

    public void j6_(boolean r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1122274774010560960L, this, new java.lang.Boolean(r5));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1122274774010560960L, this, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.Hw == null) goto L21;
        android.view.View r2 = this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBar);     // Catch: java.lang.Throwable -> L14
        if (r5 == false) goto L11;
        int r3 = 0;
    L12:
        r2.setVisibility(r3);     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        r3 = 8;
        goto L12
    }
}
