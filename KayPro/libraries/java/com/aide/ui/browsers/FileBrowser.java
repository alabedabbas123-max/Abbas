package com.aide.ui.browsers;

@abcd.Interfacexu
public class FileBrowser extends android.widget.LinearLayout implements abcd.C1050mk.a, com.aide.ui.browsers.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2068764923731779201L)
    private com.aide.ui.Z FH;

    @abcd.Interfaceru(field = -1079241939401435432L)
    private com.aide.ui.Z Hw;

    @abcd.Interfaceru(field = 2016147934576052816L)
    private com.aide.ui.browsers.FileBrowser.a VH;

    @abcd.Interfaceru(field = -2456717333687695815L)
    protected android.view.View Zo;

    @abcd.Interfaceru(field = -4817546703576642376L)
    private com.aide.common.KeyStrokeDetector.a v5;

    @abcd.Interfacexu
    private class a extends com.aide.common.Abstractx<com.aide.ui.browsers.FileBrowser.b> {

        @abcd.Interfacetu
        private static boolean Hw;

        @abcd.Interfaceuu
        private static boolean v5;

        @abcd.Interfacevu
        final com.aide.ui.browsers.FileBrowser Zo;

        static {
            abcd.wu.j6(com.aide.ui.browsers.FileBrowser.a.class, 3980503035665525340L, 3980503035665525340L);
        }

        @abcd.Interfacesu(method = -120577119575832752L)
        private a(com.aide.ui.browsers.FileBrowser r6) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 8: {
                        th = $ex0;
                        if (v5 == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, -1681695123744951504L, null, r6);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Hw == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-1681695123744951504L, null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            this.Zo = r6;
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

        a(com.aide.ui.browsers.FileBrowser r8, com.aide.ui.browsers.g r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 7: {
                        th = $ex1;
                        if (v5 == false) { $pc1 = 11; continue $sw1; }
                        abcd.wu.j6(th, 4262387881960271932L, null, r8, r9);
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (Hw == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(4262387881960271932L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            this(r8);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            return com.almlkaide.kaypro.aide.filebrowser.FileBrowserAdapter.getView(this, r2, r3, r4);
        }

        @abcd.Interfacesu(method = 2266415186838480639L)
        public android.view.View getView_SOURCE(int r9, android.view.View r10, android.view.ViewGroup r11) {
            android.view.View r0 = null;
            com.aide.ui.browsers.FileBrowser.b r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 10: {
                        th = $ex2;
                        if (v5 == false) { $pc2 = 14; continue $sw2; }
                        abcd.wu.j6(th, 907316140778872848L, this, new java.lang.Integer(r9), r10, r11);
                        $pc2 = 14; continue $sw2;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (Hw == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(907316140778872848L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 10; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        if (r10 != null) { $pc2 = 7; continue $sw2; }
                        try {
                            r0 = android.view.LayoutInflater.from(this.Zo.getContext()).inflate(com.almlkaide.kaypro.R.layout.filebrowser_entry, r11, false);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 10; continue $sw2;
                        }
                        $pc2 = 8; continue $sw2;
                    }
                    case 8: {
                        try {
                            r1 = j6(r9);
                            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.filebrowserEntryName)).setText(r1.FH);
                            ((android.widget.ImageView) r0.findViewById(com.almlkaide.kaypro.R.id.filebrowserEntryFileImage)).setImageResource(r1.VH);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 10; continue $sw2;
                        }
                        return r0;
                    }
                    case 7: {
                        r0 = r10;
                        { $pc2 = 8; continue $sw2; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void notifyDataSetChanged() {
            com.almlkaide.kaypro.aide.filebrowser.FileBrowserAdapter.OnNotifyDataSetChanged(this);
        }

        public void notifyDataSetChanged_() {
            super.notifyDataSetChanged();
        }
    }

    @abcd.Interfacexu
    public class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2794120726679586235L)
        public java.lang.String FH;

        @abcd.Interfaceru(field = -2512171421590620000L)
        public boolean Hw;

        @abcd.Interfaceru(field = 2855063803438316545L)
        public int VH;

        @abcd.Interfaceru(field = 957591483313279661L)
        public abcd.InterfaceJl Zo;

        @abcd.Interfacevu
        final com.aide.ui.browsers.FileBrowser gn;

        @abcd.Interfaceru(field = -2795223587978491317L)
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.browsers.FileBrowser.b.class, -1173655237192759335L, -1173655237192759335L);
        }

        @abcd.Interfacesu(method = 548274873477771659L)
        public b(com.aide.ui.browsers.FileBrowser r8, abcd.InterfaceJl r9) {
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 3;
            $sw3: while (true) {
                switch ($pc3) {
                    case 9: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 13; continue $sw3; }
                        abcd.wu.j6(th, 2245128364824339345L, null, r8, r9);
                        $pc3 = 13; continue $sw3;
                    }
                    case 13: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc3 = 5; continue $sw3; }
                        try {
                            abcd.wu.j6(2245128364824339345L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 9; continue $sw3;
                        }
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        try {
                            this.gn = r8;
                            this.Zo = r9;
                            this.VH = r9.Zo();
                            r0 = r9.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 9; continue $sw3;
                        }
                        if (r0 == 0) { $pc3 = 16; continue $sw3; }
                        try {
                            this.FH = r8.getContext().getResources().getString(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 9; continue $sw3;
                        }
                        return;
                    }
                    case 16: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -8710999644725155271L)
        public b(com.aide.ui.browsers.FileBrowser r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 3;
            $sw4: while (true) {
                switch ($pc4) {
                    case 16: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 20; continue $sw4; }
                        abcd.wu.j6(th, -1391139599401946817L, null, r10, r11, r12, new java.lang.Boolean(r13));
                        $pc4 = 20; continue $sw4;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc4 = 5; continue $sw4; }
                        try {
                            abcd.wu.j6(-1391139599401946817L, null, r10, r11, r12, new java.lang.Boolean(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        try {
                            this.gn = r10;
                            this.v5 = r11;
                            this.FH = r12;
                            this.Hw = r13;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        if (this.Hw == false) { $pc4 = 9; continue $sw4; }
                        try {
                            this.VH = com.aide.ui.ca.j6(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        return;
                    }
                    case 9: {
                        if (DW() == false) { $pc4 = 12; continue $sw4; }
                        try {
                            this.VH = com.almlkaide.kaypro.R.drawable.folder_open;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        return;
                    }
                    case 12: {
                        if (com.aide.ui.browsers.FileBrowser.j6(r12) == false) { $pc4 = 14; continue $sw4; }
                        try {
                            this.VH = com.almlkaide.kaypro.R.drawable.folder_hidden;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        return;
                    }
                    case 14: {
                        try {
                            this.VH = com.almlkaide.kaypro.R.drawable.folder;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 640257875353174800L)
        public boolean DW() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 13: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 17; continue $sw5; }
                        abcd.wu.j6(th, 166256215873474176L, this);
                        $pc5 = 17; continue $sw5;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 7; continue $sw5; }
                        try {
                            abcd.wu.j6(166256215873474176L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 13; continue $sw5;
                        }
                        $pc5 = 7; continue $sw5;
                    }
                    case 7: {
                        if (this.Hw == true) { $pc5 = 11; continue $sw5; }
                        if (this.FH.equals("..") == false) { $pc5 = 11; continue $sw5; }
                        return true;
                    }
                    case 11: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -2918012092919777952L)
        public boolean j6() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 13: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 17; continue $sw6; }
                        abcd.wu.j6(th, -136595782536153700L, this);
                        $pc6 = 17; continue $sw6;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 7; continue $sw6; }
                        try {
                            abcd.wu.j6(-136595782536153700L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        $pc6 = 7; continue $sw6;
                    }
                    case 7: {
                        if (this.Hw == true) { $pc6 = 11; continue $sw6; }
                        if (DW() == true) { $pc6 = 11; continue $sw6; }
                        return true;
                    }
                    case 11: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.browsers.FileBrowser.class, 5630979006676181253L, 5630979006676181253L);
    }

    public FileBrowser(android.content.Context r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 138810922410404769L, null, r7);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(138810922410404769L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        super(r7);
                        this.FH = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.filebrowser_context_menu);
                        this.Hw = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.git_context_menu);
                        this.v5 = new com.aide.ui.M(com.aide.ui.V.v5());
                        VH();
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

    public FileBrowser(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, 2129274232320206664L, null, r8, r9);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(2129274232320206664L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        this.FH = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.filebrowser_context_menu);
                        this.Hw = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.git_context_menu);
                        this.v5 = new com.aide.ui.M(com.aide.ui.V.v5());
                        VH();
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

    static com.aide.ui.MainActivity DW(com.aide.ui.browsers.FileBrowser r0) {
        return r0.getActivity();
    }

    @abcd.Interfacesu(method = -627349660941032580L)
    private static boolean DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 20: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 24; continue $sw9; }
                    abcd.wu.j6(th, -703674388274086572L, null, r5);
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(-703674388274086572L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r5.startsWith(".") == false) { $pc9 = 9; continue $sw9; }
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    return true;
                }
                case 9: {
                    if ("bin".equals(r5) == true) { $pc9 = 18; continue $sw9; }
                    if ("obj".equals(r5) == true) { $pc9 = 18; continue $sw9; }
                    if ("build".equals(r5) == true) { $pc9 = 18; continue $sw9; }
                    if ("gradle".equals(r5) == true) { $pc9 = 18; continue $sw9; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.views.CustomKeysListView FH(com.aide.ui.browsers.FileBrowser r0) {
        return r0.getListView();
    }

    @abcd.Interfacesu(method = 911074248264933952L)
    private void FH(java.lang.String r6) {
        java.util.List<java.lang.String> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 16: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 21; continue $sw10; }
                    abcd.wu.j6(th, -3109423570381883200L, this, r6);
                    $pc10 = 21; continue $sw10;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 7; continue $sw10; }
                    try {
                        abcd.wu.j6(-3109423570381883200L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (com.aide.ui.U.vy().XL(r6) == true) { $pc10 = 24; continue $sw10; }
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    try {
                        com.aide.ui.U.J8().j6(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    return;
                }
                case 24: {
                    try {
                        r2 = abcd.Vl.Zo(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.io.IOException) { $pc10 = 23; continue $sw10; }
                        $pc10 = 16; continue $sw10;
                    }
                    if (r2.size() != 1) { $pc10 = 14; continue $sw10; }
                    if (abcd.Vl.J0(r2.get(0)) == false) { $pc10 = 14; continue $sw10; }
                    try {
                        r6 = r2.get(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.io.IOException) { $pc10 = 23; continue $sw10; }
                        $pc10 = 16; continue $sw10;
                    }
                    { $pc10 = 24; continue $sw10; }
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -989482440531988720L)
    private void VH() {
        android.view.LayoutInflater r2 = null;
        android.view.View r3 = null;
        android.view.View r4 = null;
        com.aide.ui.views.CustomKeysListView r5 = null;
        com.aide.ui.browsers.FileBrowser.a r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -1999760764677535384L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-1999760764677535384L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
                        r2 = android.view.LayoutInflater.from(getContext());
                        r3 = r2.inflate(com.almlkaide.kaypro.R.layout.filebrowser, null);
                        removeAllViews();
                        addView(r3);
                        r4 = r2.inflate(com.almlkaide.kaypro.R.layout.browser_header, null);
                        getListView().addHeaderView(r4, null, false);
                        com.aide.ui.U.J8().j6(this);
                        r5 = getListView();
                        r6 = new com.aide.ui.browsers.FileBrowser.a(this, null);
                        this.VH = r6;
                        r5.setAdapter(r6);
                        r5.setOnItemSelectedListener(new com.aide.ui.browsers.g(this, r5));
                        r5.setOnKeyEventListener(new com.aide.ui.browsers.h(this));
                        r5.setOnItemLongClickListener(new com.aide.ui.browsers.i(this, r5));
                        r5.setOnItemClickListener(new com.aide.ui.browsers.j(this, r5));
                        Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4376236547492012435L)
    private com.aide.ui.MainActivity getActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, 822834133376817263L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(822834133376817263L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return (com.aide.ui.MainActivity) getContext();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1016907955190792049L)
    private com.aide.ui.views.CustomKeysListView getListView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -2111039540909725115L, this);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-2111039540909725115L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    return (com.aide.ui.views.CustomKeysListView) findViewById(com.almlkaide.kaypro.R.id.filebrowserFileList);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.common.KeyStrokeDetector.a j6(com.aide.ui.browsers.FileBrowser r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -805950045585860875L)
    private void j6(android.view.View r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 245134816803786105L, this, r5);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(245134816803786105L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        this.Hw.j6(r5, true);
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

    @abcd.Interfacesu(method = 7816705123903312109L)
    private void j6(android.view.View r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 7: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 11; continue $sw15; }
                    abcd.wu.j6(th, 6106759169996863225L, this, r8, new java.lang.Boolean(r9));
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(6106759169996863225L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        this.FH.j6(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2805514445274551847L)
    private void j6(com.aide.ui.browsers.FileBrowser.b r5) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 15: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 19; continue $sw16; }
                    abcd.wu.j6(th, 3952524197357127117L, this, r5);
                    $pc16 = 19; continue $sw16;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(3952524197357127117L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 15; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    r2 = null;
                    if (r5 != null) { $pc16 = 9; continue $sw16; }
                    $pc16 = 13; continue $sw16;
                }
                case 13: {
                    try {
                        com.aide.ui.U.J8().DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 15; continue $sw16;
                    }
                    return;
                }
                case 9: {
                    if (r5.Hw == false) { $pc16 = 11; continue $sw16; }
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    try {
                        r2 = r5.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 15; continue $sw16;
                    }
                    { $pc16 = 13; continue $sw16; }
                }
                case 11: {
                    if (r5.j6() == false) { $pc16 = 13; continue $sw16; }
                    { $pc16 = 12; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, android.view.View r1, boolean r2) {
        r0.j6(r1, r2);
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, com.aide.ui.browsers.FileBrowser.b r1) {
        r0.j6(r1);
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, java.lang.String r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = 2705612155847635744L)
    private void j6(java.util.List<java.lang.String> r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, 545079867821223408L, this, r5);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(545079867821223408L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        java.util.Collections.sort(r5, new com.aide.ui.browsers.l(this));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(java.lang.String r0) {
        return DW(r0);
    }

    @Override
    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 7: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 11; continue $sw18; }
                    abcd.wu.j6(th, 4147634361030494472L, this);
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 14; continue $sw18; }
                    try {
                        abcd.wu.j6(4147634361030494472L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 7; continue $sw18;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, 577432211910011375L, this);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(577432211910011375L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    try {
                        Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw() {
        java.lang.Object r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 10: {
                    th = $ex20;
                    if (DW == false) { $pc20 = 14; continue $sw20; }
                    abcd.wu.j6(th, 418688876998056540L, this);
                    $pc20 = 14; continue $sw20;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(418688876998056540L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 10; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        r2 = getListView().getSelectedItem();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 10; continue $sw20;
                    }
                    if ((r2 instanceof com.aide.ui.browsers.FileBrowser.b) == false) { $pc20 = 17; continue $sw20; }
                    try {
                        j6((com.aide.ui.browsers.FileBrowser.b) r2);
                        j6(getListView().getSelectedView(), false);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 10; continue $sw20;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        java.lang.String r2 = null;
        com.aide.ui.views.CustomKeysListView r1 = null;
        android.widget.ImageView r0 = null;
        java.util.ArrayList r3 = null;
        java.lang.String r4 = null;
        java.util.Iterator<abcd.InterfaceJl> r5 = null;
        abcd.InterfaceJl r6 = null;
        java.util.List<java.lang.String> r7 = null;
        java.util.Iterator r8 = null;
        java.lang.String r9 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r2 = com.aide.ui.U.J8().j6();
                    com.aide.ui.U.J8().DW((java.lang.String) null);
                    r1 = getListView();
                    ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderLabel)).setText(r2);
                    ((android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderIcon)).setImageResource(com.almlkaide.kaypro.R.drawable.folder_open);
                    r0 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderMenuButton);
                    r0.setOnClickListener((android.view.View.OnClickListener) com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.k")).newInstance(new java.lang.Object[]{this, r0}).get());
                    r3 = new java.util.ArrayList();
                    r4 = abcd.Vl.EQ(r2);
                    if (r4 != null) { $pc21 = 40; continue $sw21; }
                    $pc21 = 8; continue $sw21;
                }
                case 8: {
                    r5 = com.aide.ui.V.j6().iterator();
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    if (r5.hasNext() == false) { $pc21 = 42; continue $sw21; }
                    r6 = r5.next();
                    if (r6.j6(false) == false) { $pc21 = 10; continue $sw21; }
                    r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r6}).get());
                    $pc21 = 26; continue $sw21;
                }
                case 26: {
                    e = $ex21;
                    throw new java.lang.NoClassDefFoundError(e.getMessage());
                }
                case 42: {
                    try {
                        r7 = abcd.Vl.Zo(r2);
                        r8 = ((java.util.List) com.blankj.utilcode.util.ReflectUtils.reflect("com.almlkaide.kaypro.aide.filebrowser.FileBrowserListener").method("sortList", new java.lang.Object[]{this, r7}).get()).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 33; continue $sw21;
                    }
                    $pc21 = 13; continue $sw21;
                }
                case 13: {
                    if (r8.hasNext() == false) { $pc21 = 14; continue $sw21; }
                    try {
                        r9 = (java.lang.String) r8.next();
                        r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r9, abcd.Vl.tp(r9), new java.lang.Boolean(abcd.Vl.J8(r9))}).get());
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 33; continue $sw21;
                    }
                    { $pc21 = 13; continue $sw21; }
                }
                case 35: {
                    e = $ex21;
                    try {
                        throw new java.lang.NoClassDefFoundError(e.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 33; continue $sw21;
                    }
                }
                case 14: {
                    this.VH.j6(r3);
                    return;
                }
                case 33: {
                    th = $ex21;
                    com.aide.common.ClassH.DW(th);
                    { $pc21 = 14; continue $sw21; }
                }
                case 40: {
                    r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r4, "..", new java.lang.Boolean(false)}).get());
                    $pc21 = 19; continue $sw21;
                }
                case 19: {
                    e = $ex21;
                    throw new java.lang.NoClassDefFoundError(e.getMessage());
                }
                case 16: {
                    e = $ex21;
                    throw new java.lang.NoClassDefFoundError(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo_() {
        java.lang.String r2 = null;
        com.aide.ui.views.CustomKeysListView r3 = null;
        android.widget.ImageView r4 = null;
        java.util.ArrayList r5 = null;
        java.lang.String r6 = null;
        java.util.Iterator<abcd.InterfaceJl> r7 = null;
        abcd.InterfaceJl r8 = null;
        java.util.List<java.lang.String> r9 = null;
        java.util.Iterator<java.lang.String> r10 = null;
        java.lang.String r11 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 25: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 30; continue $sw22; }
                    abcd.wu.j6(th, -2227529659476872952L, this);
                    $pc22 = 30; continue $sw22;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-2227529659476872952L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.J8().j6();
                        com.aide.ui.U.J8().DW(null);
                        r3 = getListView();
                        ((android.widget.TextView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderLabel)).setText(r2);
                        ((android.widget.ImageView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderIcon)).setImageResource(com.almlkaide.kaypro.R.drawable.folder_open);
                        r4 = (android.widget.ImageView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderMenuButton);
                        r4.setOnClickListener(new com.aide.ui.browsers.k(this, r4));
                        r5 = new java.util.ArrayList();
                        r6 = abcd.Vl.EQ(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    if (r6 == null) { $pc22 = 9; continue $sw22; }
                    try {
                        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r6, "..", false));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    $pc22 = 9; continue $sw22;
                }
                case 9: {
                    try {
                        r7 = com.aide.ui.V.j6().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    if (r7.hasNext() == false) { $pc22 = 32; continue $sw22; }
                    try {
                        r8 = r7.next();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    if (r8.j6(false) == false) { $pc22 = 11; continue $sw22; }
                    try {
                        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r8));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    { $pc22 = 11; continue $sw22; }
                }
                case 32: {
                    try {
                        r9 = abcd.Vl.Zo(r2);
                        j6(r9);
                        r10 = r9.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 21; continue $sw22; }
                        $pc22 = 25; continue $sw22;
                    }
                    $pc22 = 18; continue $sw22;
                }
                case 18: {
                    if (r10.hasNext() == false) { $pc22 = 23; continue $sw22; }
                    try {
                        r11 = r10.next();
                        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r11, abcd.Vl.tp(r11), abcd.Vl.J8(r11)));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 21; continue $sw22; }
                        $pc22 = 25; continue $sw22;
                    }
                    $pc22 = 23; continue $sw22;
                }
                case 23: {
                    try {
                        this.VH.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    return;
                }
                case 21: {
                    e = $ex22;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 25; continue $sw22;
                    }
                    { $pc22 = 23; continue $sw22; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (DW == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, -2499864083460946020L, this);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(-2499864083460946020L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    try {
                        getListView().requestFocus();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 3;
        $sw24: while (true) {
            switch ($pc24) {
                case 11: {
                    th = $ex24;
                    if (DW == false) { $pc24 = 15; continue $sw24; }
                    abcd.wu.j6(th, 1040104897247219712L, this, new java.lang.Integer(r8), r9);
                    $pc24 = 15; continue $sw24;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(1040104897247219712L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 11; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    if (com.aide.ui.U.lg().j3().j6(r8, r9, this.v5) == false) { $pc24 = 9; continue $sw24; }
                    return true;
                }
                case 9: {
                    return super.onKeyDown(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 11: {
                    th = $ex25;
                    if (DW == false) { $pc25 = 15; continue $sw25; }
                    abcd.wu.j6(th, -652052934278676315L, this, new java.lang.Integer(r8), r9);
                    $pc25 = 15; continue $sw25;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(-652052934278676315L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 11; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    if (com.aide.ui.U.lg().j3().DW(r8, r9, this.v5) == false) { $pc25 = 9; continue $sw25; }
                    return true;
                }
                case 9: {
                    return super.onKeyUp(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 8: {
                    th = $ex26;
                    if (DW == false) { $pc26 = 12; continue $sw26; }
                    abcd.wu.j6(th, -783517087055499885L, this);
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(-783517087055499885L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    try {
                        j6(this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
