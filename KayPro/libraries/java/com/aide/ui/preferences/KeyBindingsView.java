package com.aide.ui.preferences;

@abcd.Interfacexu
public class KeyBindingsView extends android.widget.LinearLayout {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    private class a extends android.widget.ArrayAdapter<com.aide.ui.preferences.KeyBindingsView.b> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.preferences.KeyBindingsView FH;

        static {
            abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.a.class, -85110081915062152L, -85110081915062152L);
        }

        @abcd.Interfacesu(method = 716251069793079569L)
        public a(com.aide.ui.preferences.KeyBindingsView r9, android.content.Context r10, java.util.List<com.aide.ui.preferences.KeyBindingsView.b> r11) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -1989058754971014735L, null, r9, r10, r11);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-1989058754971014735L, null, r9, r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.FH = r9;
                            super(r10, com.almlkaide.kaypro.R.layout.keybindings_entry, r11);
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
        @abcd.Interfacesu(method = -1307176661615581488L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
            android.view.View r0 = null;
            com.aide.ui.preferences.KeyBindingsView.b r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 10: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 14; continue $sw1; }
                        abcd.wu.j6(th, 367260434547404480L, this, new java.lang.Integer(r9), r10, r11);
                        $pc1 = 14; continue $sw1;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(367260434547404480L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        if (r10 != null) { $pc1 = 7; continue $sw1; }
                        try {
                            r0 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.keybindings_entry, r11, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        try {
                            r1 = getItem(r9);
                            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.keybindingsEntryName)).setText(r1.v5);
                            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.keybindingsEntryBinding)).setText(r1.Zo + " ");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        return r0;
                    }
                    case 7: {
                        r0 = r10;
                        { $pc1 = 8; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    @abcd.Interfacexu
    private class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -3293307229160954349L)
        public abcd.InterfaceWl FH;

        @abcd.Interfaceru(field = 715707312962544375L)
        public java.util.List<com.aide.common.ClassU> Hw;

        @abcd.Interfacevu
        final com.aide.ui.preferences.KeyBindingsView VH;

        @abcd.Interfaceru(field = -3026987576695201860L)
        public java.lang.String Zo;

        @abcd.Interfaceru(field = 2187688768040593059L)
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.b.class, 3651883812178991155L, 3651883812178991155L);
        }

        @abcd.Interfacesu(method = 7814178764726125920L)
        public b(com.aide.ui.preferences.KeyBindingsView r8, abcd.InterfaceWl r9) {
            java.util.Iterator<com.aide.common.ClassU> r0 = null;
            com.aide.common.ClassU r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 14: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 19; continue $sw2; }
                        abcd.wu.j6(th, 522210046249967881L, null, r8, r9);
                        $pc2 = 19; continue $sw2;
                    }
                    case 19: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(522210046249967881L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            this.VH = r8;
                            this.FH = r9;
                            this.v5 = r9.getName();
                            this.Hw = com.aide.ui.U.j3().j6(r9);
                            this.Zo = "";
                            r0 = this.Hw.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        if (r0.hasNext() == false) { $pc2 = 13; continue $sw2; }
                        try {
                            r1 = r0.next();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        if (this.Zo.length() <= 0) { $pc2 = 11; continue $sw2; }
                        try {
                            this.Zo += "\n";
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        try {
                            this.Zo += r1.toString();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        { $pc2 = 6; continue $sw2; }
                    }
                    case 13: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.class, 1069513486002832672L, 1069513486002832672L);
    }

    public KeyBindingsView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -2537849455460240208L, null, r6);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2537849455460240208L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        super(r6);
                        DW();
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

    public KeyBindingsView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, 6161331857279505075L, null, r8, r9);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(6161331857279505075L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        DW();
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

    public KeyBindingsView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, -991751434785633280L, null, r9, r10, new java.lang.Integer(r11));
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-991751434785633280L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
                        DW();
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

    @abcd.Interfacesu(method = 1963084175977521464L)
    private void DW() {
        android.view.View r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 873595125408844565L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(873595125408844565L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.keybindings, null);
                        removeAllViews();
                        addView(r2);
                        j6();
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

    public void j6() {
        java.util.ArrayList r2 = null;
        java.util.Iterator<abcd.InterfaceIl> r3 = null;
        abcd.InterfaceIl r4 = null;
        java.util.Iterator<abcd.InterfaceWl> r5 = null;
        android.widget.ListView r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 18: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 23; continue $sw7; }
                    abcd.wu.j6(th, 310341009200785584L, this);
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(310341009200785584L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r2 = new java.util.ArrayList();
                        r3 = com.aide.ui.V.DW().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc7 = 12; continue $sw7; }
                    try {
                        r4 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    if ((r4 instanceof abcd.InterfaceWl) == false) { $pc7 = 8; continue $sw7; }
                    try {
                        r2.add(new com.aide.ui.preferences.KeyBindingsView.b(this, (abcd.InterfaceWl) r4));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    { $pc7 = 8; continue $sw7; }
                }
                case 12: {
                    try {
                        r5 = com.aide.ui.U.lg().J8().getBasicEditorCommands().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    if (r5.hasNext() == false) { $pc7 = 16; continue $sw7; }
                    try {
                        r2.add(new com.aide.ui.preferences.KeyBindingsView.b(this, r5.next()));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    { $pc7 = 14; continue $sw7; }
                }
                case 16: {
                    try {
                        java.util.Collections.sort(r2, new com.aide.ui.preferences.h(this));
                        r6 = (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.keybindingsList);
                        r6.setAdapter(new com.aide.ui.preferences.KeyBindingsView.a(this, getContext(), r2));
                        r6.setOnItemClickListener(new com.aide.ui.preferences.j(this, r6));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
