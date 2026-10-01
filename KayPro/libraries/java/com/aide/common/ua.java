package com.aide.common;

@abcd.Interfacexu
public class ua extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -4474188977449737717L)
    private java.util.List<com.aide.common.ua.a> gn;

    @abcd.Interfaceru(field = -3015550881795457128L)
    private java.lang.String u7;

    public interface a {
        boolean DW();

        java.lang.String FH();

        java.lang.String getName();

        int j6();

        void run();
    }

    @abcd.Interfacexu
    private static class b extends android.widget.ArrayAdapter<com.aide.common.ua.a> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        static {
            abcd.wu.j6(com.aide.common.ua.b.class, -2051543434084569271L, -2051543434084569271L);
        }

        @abcd.Interfacesu(method = -8452035402067150608L)
        public b(android.content.Context r8, java.util.List<com.aide.common.ua.a> r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -552356801102747168L, null, r8, r9);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-552356801102747168L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            super(r8, com.aide.ui.Oa.propertydialog_entry, r9);
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
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            android.view.View r0 = getView_SOURCE(r2, r3, r4);
            com.almlkaide.kaypro.aide.uidesign.TextTranslation.translationWidgetmenuEntryName(r0);
            return r0;
        }

        @abcd.Interfacesu(method = -1281641125723598655L)
        public android.view.View getView_SOURCE(int r9, android.view.View r10, android.view.ViewGroup r11) {
            int r0 = 0;
            android.view.View r1 = null;
            com.aide.common.ua.a r2 = null;
            java.lang.String r3 = null;
            android.view.View r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 16: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 20; continue $sw1; }
                        abcd.wu.j6(th, 902087801372589832L, this, new java.lang.Integer(r9), r10, r11);
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(902087801372589832L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r0 = 0;
                        if (r10 != null) { $pc1 = 8; continue $sw1; }
                        try {
                            r1 = android.view.LayoutInflater.from(getContext()).inflate(com.aide.ui.Oa.propertydialog_entry, r11, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        try {
                            r2 = getItem(r9);
                            ((android.widget.TextView) r1.findViewById(com.aide.ui.Na.widgetmenuEntryName)).setText(android.text.Html.fromHtml(r2.getName()));
                            ((android.widget.ImageView) r1.findViewById(com.aide.ui.Na.widgetmenuEntryImage)).setImageResource(com.aide.common.ClassG.FH(getContext(), r2.j6()));
                            r3 = r2.FH();
                            r4 = r1.findViewById(com.aide.ui.Na.widgetmenuHelpButton);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        if (r3 != null) { $pc1 = 12; continue $sw1; }
                        r0 = 8;
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        try {
                            r4.setVisibility(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        if (r3 == null) { $pc1 = 15; continue $sw1; }
                        try {
                            r4.setOnClickListener(new com.aide.common.ViewOnClickListenerva(this, r3));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
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

    static {
        abcd.wu.j6(com.aide.common.ua.class, -5728075795338140784L, -5728075795338140784L);
    }

    public ua(java.lang.String r8, java.util.List<? extends com.aide.common.ua.a> r9) {
        java.util.Iterator<? extends com.aide.common.ua.a> r0 = null;
        com.aide.common.ua.a r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 18; continue $sw2; }
                    abcd.wu.j6(th, 6861621606217403563L, null, r8, r9);
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(6861621606217403563L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.u7 = r8;
                        this.gn = new java.util.ArrayList();
                        r0 = r9.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r0.hasNext() == false) { $pc2 = 12; continue $sw2; }
                    try {
                        r1 = r0.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    if (r1.DW() == false) { $pc2 = 6; continue $sw2; }
                    try {
                        this.gn.add(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    { $pc2 = 6; continue $sw2; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List j6(com.aide.common.ua r0) {
        return r0.gn;
    }

    @Override
    @abcd.Interfacesu(method = -732187598988876800L)
    protected android.app.Dialog j6(android.app.Activity r7) {
        android.widget.ListView r2 = null;
        android.app.AlertDialog r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 743108399929493893L, this, r7);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(743108399929493893L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = new android.widget.ListView(r7);
                        r2.setAdapter(new com.aide.common.ua.b(r7, this.gn));
                        r3 = new android.app.AlertDialog.Builder(r7).setCancelable(true).setView(r2).setTitle(this.u7).create();
                        r3.setCanceledOnTouchOutside(true);
                        r2.setOnItemClickListener(new com.aide.common.ta(this, r3));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
