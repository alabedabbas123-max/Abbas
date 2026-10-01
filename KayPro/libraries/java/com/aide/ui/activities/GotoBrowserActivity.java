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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -362731200115586097L, null, r9, r10, r11);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-362731200115586097L, null, r9, r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.FH = r9;
                            super(r10, com.almlkaide.kaypro.R.layout.gotobrowser_entry, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 284351663703988889L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
            int r0 = 0;
            android.view.View r1 = null;
            com.aide.engine.SourceEntity r2 = null;
            android.widget.ImageView r3 = null;
            int r4 = 0;
            android.view.View r5 = null;
            java.lang.String r6 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 39: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 43; continue $sw1; }
                        abcd.wu.j6(th, -1355610482816193813L, this, new java.lang.Integer(r9), r10, r11);
                        $pc1 = 43; continue $sw1;
                    }
                    case 43: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(-1355610482816193813L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r0 = 0;
                        if (r10 != null) { $pc1 = 8; continue $sw1; }
                        try {
                            r1 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.gotobrowser_entry, r11, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        try {
                            r2 = getItem(r9);
                            r3 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryImage);
                            r4 = com.aide.ui.activities.ClassZ.j6[r2.EQ().ordinal()];
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        if (r4 == 1) { $pc1 = 28; continue $sw1; }
                        if (r4 == 2) { $pc1 = 24; continue $sw1; }
                        if (r4 != 3) { $pc1 = 16; continue $sw1; }
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.objects);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        $pc1 = 31; continue $sw1;
                    }
                    case 31: {
                        try {
                            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryName)).setText(com.aide.ui.activities.GotoBrowserActivity.j6(this.FH, r2));
                            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserEntryContainerName)).setText(com.aide.ui.activities.GotoBrowserActivity.DW(this.FH, r2));
                            r5 = r1.findViewById(com.almlkaide.kaypro.R.id.gotobrowserHelpButton);
                            r6 = r2.VH();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        if (r6 != null) { $pc1 = 35; continue $sw1; }
                        r0 = 8;
                        $pc1 = 35; continue $sw1;
                    }
                    case 35: {
                        try {
                            r5.setVisibility(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        if (r6 == null) { $pc1 = 38; continue $sw1; }
                        try {
                            r5.setOnClickListener(new com.aide.ui.activities.A(this, r6));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        $pc1 = 38; continue $sw1;
                    }
                    case 38: {
                        return r1;
                    }
                    case 16: {
                        if (r4 != 4) { $pc1 = 18; continue $sw1; }
                        try {
                            r3.setImageResource(com.aide.ui.ca.j6(r2.DW()));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 18: {
                        if (r4 == 5) { $pc1 = 20; continue $sw1; }
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.browser_empty);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 20: {
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.pakage);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 24: {
                        if (r2.XL() == false) { $pc1 = 26; continue $sw1; }
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_blue);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 26: {
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 28: {
                        if (r2.XL() == false) { $pc1 = 30; continue $sw1; }
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_red);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 30: {
                        try {
                            r3.setImageResource(com.almlkaide.kaypro.R.drawable.box_red);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 39; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 8: {
                        r1 = r10;
                        { $pc1 = 9; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.activities.GotoBrowserActivity.class, -667729815873843261L, -667729815873843261L);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    if (v5 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3117529652831659872L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        FH = 50;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    th = $ex2;
                    if (Zo == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -3117529652831659872L, null);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public GotoBrowserActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (Zo == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -1065574352003609532L, null);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-1065574352003609532L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.VH = new com.aide.common.sa(this, "Analyzing...");
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

    @abcd.Interfacesu(method = -2591126029782879488L)
    private java.lang.String DW(com.aide.engine.SourceEntity r6) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 10: {
                    th = $ex4;
                    if (Zo == false) { $pc4 = 14; continue $sw4; }
                    abcd.wu.j6(th, 1786028596531637535L, this, r6);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1786028596531637535L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r2 = "" + r6.we();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    if (r6.EQ() != com.aide.engine.SourceEntity.a.j6) { $pc4 = 17; continue $sw4; }
                    return r2 + "()";
                }
                case 17: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String DW(com.aide.ui.activities.GotoBrowserActivity r0, com.aide.engine.SourceEntity r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = 220831444424747475L)
    private void DW() {
        boolean r2 = false;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 15: {
                    th = $ex5;
                    if (Zo == false) { $pc5 = 19; continue $sw5; }
                    abcd.wu.j6(th, 2760982640077057004L, this);
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(2760982640077057004L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (((android.widget.Switch) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSwitch)).isChecked() == true) { $pc5 = 9; continue $sw5; }
                    r2 = true;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    try {
                        r3 = ((android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox)).getText().toString().trim();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    if (r2 == false) { $pc5 = 13; continue $sw5; }
                    try {
                        com.aide.ui.U.EQ().FH(r3, FH);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    return;
                }
                case 13: {
                    try {
                        com.aide.ui.U.EQ().DW(r3, FH);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    return;
                }
                case 9: {
                    r2 = false;
                    { $pc5 = 10; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(com.aide.ui.activities.GotoBrowserActivity r0) {
        r0.j6();
    }

    static com.aide.common.sa FH(com.aide.ui.activities.GotoBrowserActivity r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = 7110874651396888645L)
    private java.lang.String j6(com.aide.engine.SourceEntity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (Zo == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, 6517794786912804864L, this, r5);
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(6517794786912804864L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r5.EQ() != com.aide.engine.SourceEntity.a.QX) { $pc6 = 11; continue $sw6; }
                    return r5.J0();
                }
                case 11: {
                    return r5.Zo();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(com.aide.ui.activities.GotoBrowserActivity r0, com.aide.engine.SourceEntity r1) {
        return r0.DW(r1);
    }

    @abcd.Interfacesu(method = 2257502459156571825L)
    private void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (Zo == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 2471589248868387424L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(2471589248868387424L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        j6(true, null, null);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r8, boolean r9, int r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (Zo == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, 2766505377015924775L, null, r8, new java.lang.Boolean(r9), new java.lang.Integer(r10));
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(2766505377015924775L, null, r8, new java.lang.Boolean(r9), new java.lang.Integer(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent(r8, com.aide.ui.activities.GotoBrowserActivity.class);
                        r0.putExtra("EXTRA_SYMBOLS", r9);
                        r8.startActivityForResult(r0, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Intent r10) {
        abcd.Tl r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (Zo == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 3337005965849602700L, null, r10);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(3337005965849602700L, null, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r3 = new abcd.Tl(r10.getExtras().getString("FILEPATH"), r10.getExtras().getInt("STARTLINE_EXTRA"), r10.getExtras().getInt("STARTCOLUMN_EXTRA"), r10.getExtras().getInt("ENDLINE_EXTRA"), r10.getExtras().getInt("ENDCOLUMN_EXTRA"));
                        com.aide.ui.U.lg().j6(r3);
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
        android.widget.EditText r0 = null;
        android.content.Intent r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 7: {
                    th = $ex10;
                    if (Zo == false) { $pc10 = 11; continue $sw10; }
                    abcd.wu.j6(th, -6739619606312372215L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(-6739619606312372215L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        this.VH.j6();
                        r0 = (android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox);
                        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(r0.getWindowToken(), 0);
                        r1 = new android.content.Intent();
                        r1.putExtra("FILEPATH", r11);
                        r1.putExtra("STARTLINE_EXTRA", r12);
                        r1.putExtra("STARTCOLUMN_EXTRA", r13);
                        r1.putExtra("ENDLINE_EXTRA", r14);
                        r1.putExtra("ENDCOLUMN_EXTRA", r15);
                        setResult(-1, r1);
                        finish();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2340003444621195565L)
    private void j6(java.util.List<com.aide.engine.SourceEntity> r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 7: {
                    th = $ex11;
                    if (Zo == false) { $pc11 = 11; continue $sw11; }
                    abcd.wu.j6(th, 2244486950744045480L, this, r8, r9);
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(2244486950744045480L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        java.util.Collections.sort(r8, new com.aide.ui.activities.ClassY(this, r9));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3261344824627472499L)
    private void j6(boolean r9, java.util.List<com.aide.engine.SourceEntity> r10, java.lang.String r11) {
        android.widget.ListView r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 15: {
                    th = $ex12;
                    if (Zo == false) { $pc12 = 19; continue $sw12; }
                    abcd.wu.j6(th, 1325162695545548336L, this, new java.lang.Boolean(r9), r10, r11);
                    $pc12 = 19; continue $sw12;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(1325162695545548336L, this, new java.lang.Boolean(r9), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (r9 == false) { $pc12 = 8; continue $sw12; }
                    try {
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(8);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    return;
                }
                case 8: {
                    if (r10 != null) { $pc12 = 11; continue $sw12; }
                    try {
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(0);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);
                        ((android.widget.TextView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage)).setText("> " + FH + " matching items");
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    return;
                }
                case 11: {
                    if (r10.size() != 0) { $pc12 = 13; continue $sw12; }
                    try {
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(0);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(8);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);
                        ((android.widget.TextView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage)).setText("No matching items");
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    return;
                }
                case 13: {
                    try {
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserMessage).setVisibility(8);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList).setVisibility(0);
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserProgress).setVisibility(8);
                        j6(r10, r11);
                        r0 = (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSymbolList);
                        r0.setAdapter(new com.aide.ui.activities.GotoBrowserActivity.a(this, this, r10));
                        r0.setOnItemClickListener(new com.aide.ui.activities.C1750w(this, r0));
                        r0.setOnItemLongClickListener(new com.aide.ui.activities.C1751x(this, r0));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 586063925840635148L)
    protected void onCreate(android.os.Bundle r10) {
        android.widget.EditText r0 = null;
        android.widget.Switch r1 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    if (v5 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(196325810694803243L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                        setContentView(com.almlkaide.kaypro.R.layout.gotobrowser);
                        com.aide.ui.U.EQ().j6(new com.aide.ui.activities.Binders(this));
                        r0 = (android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox);
                        r0.addTextChangedListener(new com.aide.ui.activities.ClassT(this));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    if (Hw == null) { $pc13 = 9; continue $sw13; }
                    try {
                        r0.setText(Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    try {
                        r0.selectAll();
                        r1 = (android.widget.Switch) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSwitch);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    r3 = true;
                    if (getIntent().getExtras().getBoolean("EXTRA_SYMBOLS", true) == false) { $pc13 = 13; continue $sw13; }
                    r3 = false;
                    $pc13 = 13; continue $sw13;
                }
                case 13: {
                    try {
                        r1.setChecked(r3);
                        r1.setOnCheckedChangeListener(new com.aide.ui.activities.ClassU(this));
                        findViewById(com.almlkaide.kaypro.R.id.gotobrowserBackground).setOnClickListener(new com.aide.ui.activities.ViewOnClickListenerv(this));
                        j6();
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    return;
                }
                case 15: {
                    th = $ex13;
                    if (Zo == false) { $pc13 = 19; continue $sw13; }
                    abcd.wu.j6(th, 196325810694803243L, this, r10);
                    $pc13 = 19; continue $sw13;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -18491717931216936L)
    protected void onStart() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (Zo == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, -3147261160318311015L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-3147261160318311015L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        super.onStart();
                        abcd.F.DW(this, "Goto Browser");
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2333925357254539776L)
    protected void onStop() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (Zo == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, -2588966595220279479L, this);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(-2588966595220279479L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    try {
                        Hw = ((android.widget.EditText) findViewById(com.almlkaide.kaypro.R.id.gotobrowserSearchBox)).getText();
                        super.onStop();
                        abcd.F.j6(this, "Goto Browser");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
