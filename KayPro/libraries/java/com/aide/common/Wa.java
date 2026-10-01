package com.aide.common;

@abcd.Interfacexu
public class Wa extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 852334662417406287L)
    private java.util.List<com.aide.common.Wa.b> EQ;

    @abcd.Interfaceru(field = 4467224011380171255L)
    private boolean J0;

    @abcd.Interfaceru(field = 1313548479097149320L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = 1376079892474421016L)
    private java.lang.Runnable tp;

    @abcd.Interfaceru(field = 3167226184868558561L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 852363936661789968L)
    private java.util.List<com.aide.common.Wa.b> we;

    @abcd.Interfacexu
    private class a extends android.widget.ArrayAdapter<com.aide.common.Wa.b> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.common.Wa FH;

        static {
            abcd.wu.j6(com.aide.common.Wa.a.class, -1920580939227879948L, -1920580939227879948L);
        }

        @abcd.Interfacesu(method = -762977782197840731L)
        public a(com.aide.common.Wa r9, android.content.Context r10, java.util.List<com.aide.common.Wa.b> r11) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -3233666482377458640L, null, r9, r10, r11);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-3233666482377458640L, null, r9, r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.FH = r9;
                            super(r10, com.aide.ui.Oa.share_dialog_entry, r11);
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
        @abcd.Interfacesu(method = 61108183099295076L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
            int r0 = 0;
            android.view.View r1 = null;
            com.aide.common.Wa.b r2 = null;
            android.widget.ImageView r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 17: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 21; continue $sw1; }
                        abcd.wu.j6(th, -2464494226770077829L, this, new java.lang.Integer(r9), r10, r11);
                        $pc1 = 21; continue $sw1;
                    }
                    case 21: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(-2464494226770077829L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 17; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r0 = 0;
                        if (r10 != null) { $pc1 = 8; continue $sw1; }
                        try {
                            r1 = android.view.LayoutInflater.from(getContext()).inflate(com.aide.ui.Oa.share_dialog_entry, r11, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 17; continue $sw1;
                        }
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        try {
                            r2 = getItem(r9);
                            ((android.widget.TextView) r1.findViewById(com.aide.ui.Na.shareDialogEntryText)).setText(com.aide.common.Wa.b.FH(r2));
                            r3 = (android.widget.ImageView) r1.findViewById(com.aide.ui.Na.shareDialogEntryImage);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 17; continue $sw1;
                        }
                        if (com.aide.common.Wa.b.Hw(r2) == 0) { $pc1 = 13; continue $sw1; }
                        try {
                            r3.setImageResource(com.aide.common.Wa.b.Hw(r2));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 17; continue $sw1;
                        }
                        $pc1 = 13; continue $sw1;
                    }
                    case 13: {
                        if (com.aide.common.Wa.b.Hw(r2) != 0) { $pc1 = 15; continue $sw1; }
                        r0 = 4;
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        try {
                            r3.setVisibility(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 17; continue $sw1;
                        }
                        return r1;
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

    @abcd.Interfacexu
    private static class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 611777262837127248L)
        private java.lang.String FH;

        @abcd.Interfaceru(field = 14503234024262487L)
        private int Hw;

        @abcd.Interfaceru(field = -2511215346923541216L)
        private boolean Zo;

        @abcd.Interfaceru(field = -2824136486033556131L)
        private java.lang.Runnable v5;

        static {
            abcd.wu.j6(com.aide.common.Wa.b.class, 3079107121431465755L, 3079107121431465755L);
        }

        @abcd.Interfacesu(method = -121672730670420976L)
        public b(int r8, java.lang.String r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 7: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 11; continue $sw2; }
                        abcd.wu.j6(th, 2186024998602728309L, null, new java.lang.Integer(r8), r9);
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(2186024998602728309L, null, new java.lang.Integer(r8), r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            this.Hw = r8;
                            this.FH = r9;
                            this.v5 = null;
                            this.Zo = true;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -1440297190966276825L)
        public b(int r9, java.lang.String r10, java.lang.Runnable r11) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 3;
            $sw3: while (true) {
                switch ($pc3) {
                    case 7: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 11; continue $sw3; }
                        abcd.wu.j6(th, -1792560872477880192L, null, new java.lang.Integer(r9), r10, r11);
                        $pc3 = 11; continue $sw3;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc3 = 5; continue $sw3; }
                        try {
                            abcd.wu.j6(-1792560872477880192L, null, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        try {
                            this.Hw = r9;
                            this.FH = r10;
                            this.v5 = r11;
                            this.Zo = false;
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 8050462813539910400L)
        public b(int r10, java.lang.String r11, java.lang.Runnable r12, boolean r13) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 7: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 11; continue $sw4; }
                        abcd.wu.j6(th, 820461152477372975L, null, new java.lang.Integer(r10), r11, r12, new java.lang.Boolean(r13));
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(820461152477372975L, null, new java.lang.Integer(r10), r11, r12, new java.lang.Boolean(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            this.Hw = r10;
                            this.FH = r11;
                            this.v5 = r12;
                            this.Zo = r13;
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

        static java.lang.Runnable DW(com.aide.common.Wa.b r0) {
            return r0.v5;
        }

        static java.lang.String FH(com.aide.common.Wa.b r0) {
            return r0.FH;
        }

        static int Hw(com.aide.common.Wa.b r0) {
            return r0.Hw;
        }

        static boolean j6(com.aide.common.Wa.b r0) {
            return r0.Zo;
        }
    }

    static {
        abcd.wu.j6(com.aide.common.Wa.class, 1991841546302420120L, 1991841546302420120L);
    }

    @abcd.Interfacesu(method = 3331726599380969868L)
    private Wa(java.lang.String r11, java.lang.String r12, java.util.List<com.aide.common.Wa.b> r13, java.util.List<com.aide.common.Wa.b> r14, java.lang.Runnable r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, -1131598358534696472L, null, r11, r12, r13, r14, r15);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-1131598358534696472L, null, r11, r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        this.gn = r11;
                        this.u7 = r12;
                        this.tp = r15;
                        this.EQ = r13;
                        this.we = r14;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List DW(com.aide.common.Wa r0) {
        return r0.we;
    }

    public static void DW(android.app.Activity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 11: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 15; continue $sw6; }
                    abcd.wu.j6(th, -3118589333291844288L, null, r5);
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(-3118589333291844288L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (com.aide.common.ClassG.j6() == false) { $pc6 = 9; continue $sw6; }
                    try {
                        com.aide.common.Ha.Hw(r5, "101304250883271700981");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                case 9: {
                    try {
                        com.aide.common.Ha.FH(r5, "104927725094165066286");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.lang.Runnable r12) {
        java.util.ArrayList r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, 1055564674100857780L, null, r9, r10, r11, r12);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(1055564674100857780L, null, r9, r10, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r4 = new java.util.ArrayList();
                        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, r9.getResources().getString(com.aide.ui.Ra.dialog_community_ask), new com.aide.common.Ua(r9)));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    if (r12 == null) { $pc7 = 8; continue $sw7; }
                    try {
                        r4.add(new com.aide.common.Wa.b(0, r9.getResources().getString(com.aide.ui.Ra.trainer_skip_lesson) + " ↷", r12, true));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    try {
                        r4.add(new com.aide.common.Wa.b(0, r9.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));
                        com.aide.common.Abstractma.j6(r9, new com.aide.common.Wa(r10, r11, r4, null, null));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
        java.util.ArrayList r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (VH == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -3842855386415390224L, null, r10, r11, r12, r13, r14);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-3842855386415390224L, null, r10, r11, r12, r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r4 = new java.util.ArrayList();
                        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "Google+", new com.aide.common.Ia(r10, r12, r13)));
                        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_twitter, "Twitter", new com.aide.common.Ja(r10, r12, r13)));
                        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_facebook, "Facebook", new com.aide.common.Ka(r10, r12, r13)));
                        r4.add(new com.aide.common.Wa.b(0, r10.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));
                        com.aide.common.Abstractma.j6(r10, new com.aide.common.Wa(r11, "\"" + r12 + "\"", r4, null, r14));
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

    public static void FH(android.app.Activity r10) {
        java.util.ArrayList r7 = null;
        java.util.ArrayList r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 11: {
                    th = $ex9;
                    if (VH == false) { $pc9 = 15; continue $sw9; }
                    abcd.wu.j6(th, -1266575227871095392L, null, r10);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-1266575227871095392L, null, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r7 = new java.util.ArrayList();
                        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "Google+", new com.aide.common.Na(r10)));
                        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_twitter, "Twitter", new com.aide.common.Oa(r10)));
                        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_facebook, "Facebook", new com.aide.common.Pa(r10)));
                        r8 = new java.util.ArrayList(r7);
                        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "G+ Community", new com.aide.common.Qa(r10)));
                        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_google_groups, "Google Group", new com.aide.common.Ra(r10)));
                        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_email, "Email", new com.aide.common.Sa(r10)));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    if (com.aide.common.ClassG.j6() == true) { $pc9 = 9; continue $sw9; }
                    try {
                        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_market, r10.getResources().getString(com.aide.ui.Ra.dialog_community_rate), new com.aide.common.Ta(r10)));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    try {
                        r7.add(new com.aide.common.Wa.b(0, r10.getResources().getString(com.aide.ui.Ra.dialog_community_more)));
                        com.aide.common.Abstractma.j6(r10, new com.aide.common.Wa(r10.getResources().getString(com.aide.ui.Ra.dialog_community_title), r10.getResources().getString(com.aide.ui.Ra.dialog_community_message), r7, r8, null));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean FH(com.aide.common.Wa r0) {
        return r0.J0;
    }

    static java.lang.Runnable j6(com.aide.common.Wa r0) {
        return r0.tp;
    }

    public static void j6(android.app.Activity r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Runnable r20) {
        java.util.ArrayList r12 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (Zo == false) { $pc10 = 5; continue $sw10; }
                    abcd.wu.j6(-1943874245814127263L, null, new java.lang.Object[]{r15, r16, r17, r18, r19, r20});
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    r12 = new java.util.ArrayList();
                    r12.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_market, r15.getResources().getString(com.aide.ui.Ra.dialog_community_rate), new com.aide.common.Va(r15, r18, r19)));
                    r12.add(new com.aide.common.Wa.b(0, r15.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));
                    com.aide.common.Abstractma.j6(r15, new com.aide.common.Wa(r16, r17, r12, null, r20));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.common.Wa r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    @Override
    @abcd.Interfacesu(method = 1133240333989313256L)
    protected android.app.Dialog j6(android.app.Activity r8) {
        android.widget.LinearLayout r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        android.app.AlertDialog r4 = null;
        android.widget.ListView r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (VH == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 1342505932466576631L, this, r8);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(1342505932466576631L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        r2 = (android.widget.LinearLayout) android.view.LayoutInflater.from(r8).inflate(com.aide.ui.Oa.share_dialog, null);
                        r3 = new android.app.AlertDialog.Builder(r8);
                        r3.setView(r2).setCancelable(true).setTitle(this.gn);
                        r4 = r3.create();
                        r4.setCanceledOnTouchOutside(true);
                        r4.setOnCancelListener(new com.aide.common.La(this));
                        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.shareDialogMessage)).setText(this.u7);
                        r5 = (android.widget.ListView) r2.findViewById(com.aide.ui.Na.shareDialogList);
                        r5.setAdapter(new com.aide.common.Wa.a(this, r8, this.EQ));
                        r5.setOnItemClickListener(new com.aide.common.Ma(this, r5, r8, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
