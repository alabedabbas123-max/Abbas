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
        android.view.ViewGroup r3 = null;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, -1405509376429968439L, null, r7);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1405509376429968439L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.v5 = "";
                        this.FH = r7;
                        r3 = (android.view.ViewGroup) r7.findViewById(com.almlkaide.kaypro.R.id.mainQuickKeyBarContainer);
                        this.Hw = android.view.LayoutInflater.from(r7).inflate(com.almlkaide.kaypro.R.layout.quickkeysbar, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (com.aide.common.ClassG.DW(r7) >= 360.0f) { $pc0 = 9; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r4 = false;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        DW(r4);
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButton).setOnClickListener(new com.aide.ui.Ia(this));
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarCloseButton).setOnClickListener(new com.aide.ui.Ja(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    if (com.aide.common.ClassG.J0(r7) == false) { $pc0 = 11; continue $sw0; }
                    r4 = true;
                    { $pc0 = 12; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.MainActivity DW(com.aide.ui.La r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = -1256956778787942960L)
    private void DW(boolean r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, 358316072962785888L, this, new java.lang.Boolean(r8));
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(358316072962785888L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.Zo = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (r8 == false) { $pc1 = 9; continue $sw1; }
                    try {
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButtonContainer).setVisibility(8);
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarKeysContainer).setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                case 9: {
                    try {
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarOpenButtonContainer).setVisibility(0);
                        this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarKeysContainer).setVisibility(8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        float r1 = 0.0f;
        float r2 = 0.0f;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = 60.0f;
                    r2 = com.aide.common.ClassG.DW(this.FH) / 12.0f;
                    if (r2 > 60.0f) { $pc2 = 5; continue $sw2; }
                    r1 = r2;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r1 >= 30.0f) { $pc2 = 9; continue $sw2; }
                    return 30.0f;
                }
                case 9: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, 36864782005627680L, this);
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(36864782005627680L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (this.Zo == false) { $pc3 = 11; continue $sw3; }
                    return (int) (this.FH.getResources().getDisplayMetrics().density * 40.0f);
                }
                case 11: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r9) {
        java.lang.String r1 = null;
        android.view.LayoutInflater r3 = null;
        android.view.ViewGroup r0 = null;
        int r4 = 0;
        java.lang.String[] r5 = null;
        int r2 = 0;
        int r6 = 0;
        java.lang.String r7 = null;
        android.widget.TextView r8 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = com.almlkaide.kaypro.aide.AdvancedSetting.getEditorQuickKey();
                    if (this.Hw == null) { $pc4 = 10; continue $sw4; }
                    if (r1 != null) { $pc4 = 6; continue $sw4; }
                    return;
                }
                case 6: {
                    if (this.v5.equals(r1) == true) { $pc4 = 23; continue $sw4; }
                    this.v5 = r1;
                    r3 = android.view.LayoutInflater.from(this.FH);
                    r0 = (android.view.ViewGroup) this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBarList);
                    r0.removeAllViews();
                    r4 = com.almlkaide.kaypro.util.Utils.dp2px(40);
                    r5 = r1.split("\n");
                    r2 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r6 = r2;
                    if (r6 >= r5.length) { $pc4 = 24; continue $sw4; }
                    r7 = r5[r6];
                    if (r7.length() == 0) { $pc4 = 17; continue $sw4; }
                    r8 = (android.widget.TextView) r3.inflate(com.almlkaide.kaypro.R.layout.quickkeysbar_key, (android.view.ViewGroup) null);
                    if ("#sp".equals(r7) == false) { $pc4 = 18; continue $sw4; }
                    r8.setText("→");
                    r8.setOnClickListener(new com.aide.ui.Ka(this, "\t"));
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    r0.addView(r8, -2, r4);
                    { $pc4 = 17; continue $sw4; }
                }
                case 18: {
                    r8.setText(r7);
                    r8.setOnClickListener(new com.aide.ui.Ka(this, r7));
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    r2 = r6 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 24: {
                    return;
                }
                case 23: {
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        com.almlkaide.kaypro.aide.util.QuickKey.setQuickBarVisibility(this, r1);
    }

    public void j6_(boolean r5) {
        android.view.View r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 14: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 18; continue $sw5; }
                    abcd.wu.j6(th, 1122274774010560960L, this, new java.lang.Boolean(r5));
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(1122274774010560960L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (this.Hw == null) { $pc5 = 21; continue $sw5; }
                    try {
                        r2 = this.Hw.findViewById(com.almlkaide.kaypro.R.id.quickKeyBar);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    if (r5 == false) { $pc5 = 11; continue $sw5; }
                    r3 = 0;
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    try {
                        r2.setVisibility(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    return;
                }
                case 11: {
                    r3 = 8;
                    { $pc5 = 12; continue $sw5; }
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
