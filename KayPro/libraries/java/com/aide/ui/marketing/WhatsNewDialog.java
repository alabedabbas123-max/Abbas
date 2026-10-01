package com.aide.ui.marketing;

@abcd.Interfacexu
public class WhatsNewDialog {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    private static class PromotedAppListAdapter extends android.widget.BaseAdapter {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -1662646477918381740L)
        private java.util.List<com.aide.ui.marketing.a.C0047a> FH;

        @abcd.Interfaceru(field = -3095391488788896379L)
        private android.content.Context Hw;

        static {
            abcd.wu.j6(com.aide.ui.marketing.WhatsNewDialog.PromotedAppListAdapter.class, -997865427726906315L, -997865427726906315L);
        }

        @abcd.Interfacesu(method = -84514163150598336L)
        public PromotedAppListAdapter(android.content.Context r10) {
            com.aide.ui.marketing.a.C0047a[] r3 = null;
            int r4 = 0;
            int r5 = 0;
            com.aide.ui.marketing.a.C0047a r6 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 13: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 18; continue $sw0; }
                        abcd.wu.j6(th, 186003988000272072L, null, r10);
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(186003988000272072L, null, r10);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            this.FH = new java.util.ArrayList();
                            this.Hw = r10;
                            this.FH = new java.util.ArrayList();
                            r3 = com.aide.ui.marketing.a.j6;
                            r4 = r3.length;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        r5 = 0;
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        if (r5 >= r4) { $pc0 = 12; continue $sw0; }
                        try {
                            r6 = r3[r5];
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        if (r6.Hw.equals(r10.getPackageName()) == false) { $pc0 = 11; continue $sw0; }
                        try {
                            this.FH.add(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        r5 = r5 + 1;
                        { $pc0 = 7; continue $sw0; }
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -998587396990188468L)
        public int getCount() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 8: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 12; continue $sw1; }
                        abcd.wu.j6(th, 203782999691271672L, this);
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(203782999691271672L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        return this.FH.size();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -818842149512929085L)
        public java.lang.Object getItem(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, -203887610944724343L, this, new java.lang.Integer(r5));
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-203887610944724343L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        return this.FH.get(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 1027768060609764804L)
        public long getItemId(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 8: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 12; continue $sw3; }
                        abcd.wu.j6(th, -284809481799784528L, this, new java.lang.Integer(r5));
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 7; continue $sw3; }
                        try {
                            abcd.wu.j6(-284809481799784528L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 8; continue $sw3;
                        }
                        $pc3 = 7; continue $sw3;
                    }
                    case 7: {
                        return r5;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 2742632277161757635L)
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
            int r1 = 0;
            android.view.View r2 = null;
            com.aide.ui.marketing.a.C0047a r3 = null;
            android.widget.TextView r4 = null;
            java.lang.String r5 = null;
            int r10 = 0;
            android.widget.TextView r6 = null;
            int r11 = 0;
            android.widget.TextView r7 = null;
            int r12 = 0;
            android.widget.TextView r8 = null;
            java.util.List<java.lang.String> r9 = null;
            java.lang.String r13 = null;
            int r14 = 0;
            java.lang.String r15 = null;
            int r16 = 0;
            java.lang.StringBuilder r110 = null;
            int r111 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 46: {
                        th = th;
                        $pc4 = 49; continue $sw4;
                    }
                    case 49: {
                        if (DW == false) { $pc4 = 52; continue $sw4; }
                        abcd.wu.j6(th, -2030958202756261779L, this, new java.lang.Integer(r17), r18, r19);
                        $pc4 = 52; continue $sw4;
                    }
                    case 52: {
                        throw th;
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(-2030958202756261779L, this, new java.lang.Integer(r17), r18, r19);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 46; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        r1 = 0;
                        if (r18 != null) { $pc4 = 11; continue $sw4; }
                        try {
                            r2 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.dialog_whatsnew_item, r19, false);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        try {
                            r3 = this.FH.get(r17);
                            r4 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemHeader);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r17 != 0) { $pc4 = 15; continue $sw4; }
                        r5 = "What's new";
                        $pc4 = 16; continue $sw4;
                    }
                    case 16: {
                        try {
                            r4.setText(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r17 > 1) { $pc4 = 19; continue $sw4; }
                        r10 = 0;
                        $pc4 = 20; continue $sw4;
                    }
                    case 20: {
                        try {
                            r4.setVisibility(r10);
                            ((android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemIcon)).setImageResource(r3.FH);
                            r6 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemTitle);
                            r6.setText(r3.v5);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r17 == 0) { $pc4 = 23; continue $sw4; }
                        r11 = 0;
                        $pc4 = 24; continue $sw4;
                    }
                    case 24: {
                        try {
                            r6.setVisibility(r11);
                            r7 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemSubTitle);
                            r7.setText(r3.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r17 == 0) { $pc4 = 27; continue $sw4; }
                        r12 = 0;
                        $pc4 = 28; continue $sw4;
                    }
                    case 28: {
                        try {
                            r7.setVisibility(r12);
                            r8 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemText);
                            r9 = r3.j6(this.Hw);
                            r13 = com.aide.ui.marketing.WhatsNewDialog.j6(this.Hw) + "<br/>";
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        r14 = 0;
                        $pc4 = 30; continue $sw4;
                    }
                    case 30: {
                        if (r14 >= r9.size()) { $pc4 = 38; continue $sw4; }
                        try {
                            r15 = r9.get(r14);
                            r16 = r15.indexOf(58);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r16 <= 0) { $pc4 = 34; continue $sw4; }
                        try {
                            r110 = new java.lang.StringBuilder();
                            r110.append("<b>");
                            r111 = r16 + 1;
                            r110.append(r15.substring(0, r111));
                            r110.append("</b>");
                            r110.append(r15.substring(r111, r15.length()));
                            r15 = r110.toString();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        $pc4 = 34; continue $sw4;
                    }
                    case 34: {
                        try {
                            r13 = r13 + r15;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r14 >= (r9.size() - 1)) { $pc4 = 37; continue $sw4; }
                        try {
                            r13 = r13 + "<br/>";
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        $pc4 = 37; continue $sw4;
                    }
                    case 37: {
                        try {
                            r14 = r14 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        { $pc4 = 30; continue $sw4; }
                    }
                    case 38: {
                        try {
                            r8.setText(android.text.Html.fromHtml(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        if (r17 == 0) { $pc4 = 42; continue $sw4; }
                        r1 = 8;
                        $pc4 = 42; continue $sw4;
                    }
                    case 42: {
                        try {
                            r8.setVisibility(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 44; continue $sw4;
                        }
                        return r2;
                    }
                    case 27: {
                        r12 = 8;
                        { $pc4 = 28; continue $sw4; }
                    }
                    case 23: {
                        r11 = 8;
                        { $pc4 = 24; continue $sw4; }
                    }
                    case 19: {
                        r10 = 8;
                        { $pc4 = 20; continue $sw4; }
                    }
                    case 15: {
                        r5 = "New app";
                        $pc4 = 11; continue $sw4;
                    }
                    case 44: {
                        th = th;
                        { $pc4 = 49; continue $sw4; }
                    }
                    case 11: {
                        r2 = r18;
                        { $pc4 = 12; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    @abcd.Interfacexu
    public static class WhatsNewDialogFragment extends android.app.DialogFragment {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -3943248633608171213L)
        private java.lang.Runnable FH;

        static {
            abcd.wu.j6(com.aide.ui.marketing.WhatsNewDialog.WhatsNewDialogFragment.class, -4063958327321650800L, -4063958327321650800L);
        }

        public WhatsNewDialogFragment() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 8: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 12; continue $sw5; }
                        abcd.wu.j6(th, 7208584723108103456L, null);
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(7208584723108103456L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 8; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(java.lang.Runnable r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 8: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 12; continue $sw6; }
                        abcd.wu.j6(th, -815380942762689705L, this, r5);
                        $pc6 = 12; continue $sw6;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-815380942762689705L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        try {
                            this.FH = r5;
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

        @Override
        public void onCancel(android.content.DialogInterface r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 10: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 14; continue $sw7; }
                        abcd.wu.j6(th, 382626563866172984L, this, r5);
                        $pc7 = 14; continue $sw7;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(382626563866172984L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 10; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        try {
                            super.onCancel(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 10; continue $sw7;
                        }
                        if (this.FH == null) { $pc7 = 17; continue $sw7; }
                        try {
                            this.FH.run();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 10; continue $sw7;
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

        @Override
        public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            android.widget.ListView r2 = null;
            android.app.AlertDialog r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 4;
            $sw8: while (true) {
                switch ($pc8) {
                    case 8: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 12; continue $sw8; }
                        abcd.wu.j6(th, -798208688367902808L, this, r7);
                        $pc8 = 12; continue $sw8;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(-798208688367902808L, this, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 8; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        try {
                            r2 = new android.widget.ListView(getActivity());
                            r2.setAdapter(new com.aide.ui.marketing.WhatsNewDialog.PromotedAppListAdapter(getActivity()));
                            r3 = new android.app.AlertDialog.Builder(getActivity()).setView(r2).create();
                            r3.setButton(-1, getString(com.almlkaide.kaypro.R.string.dialog_ok), new com.aide.ui.marketing.b(this));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 8; continue $sw8;
                        }
                        return r3;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void onDismiss(android.content.DialogInterface r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 4;
            $sw9: while (true) {
                switch ($pc9) {
                    case 10: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 14; continue $sw9; }
                        abcd.wu.j6(th, 346956988329055000L, this, r5);
                        $pc9 = 14; continue $sw9;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(346956988329055000L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 10; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        try {
                            super.onDismiss(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 10; continue $sw9;
                        }
                        if (this.FH == null) { $pc9 = 17; continue $sw9; }
                        try {
                            this.FH.run();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 10; continue $sw9;
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
    }

    static {
        abcd.wu.j6(com.aide.ui.marketing.WhatsNewDialog.class, -255305077619933835L, -255305077619933835L);
    }

    public WhatsNewDialog() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -525653038800917577L, null);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-525653038800917577L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2947093802115670708L)
    private static int DW(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 10: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 14; continue $sw11; }
                    abcd.wu.j6(th, 2906833643844366216L, null, r6);
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 17; continue $sw11; }
                    try {
                        abcd.wu.j6(2906833643844366216L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 10; continue $sw11;
                    }
                    $pc11 = 17; continue $sw11;
                }
                case 17: {
                    return r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0).versionCode;
                }
                case 9: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(android.app.Activity r7, java.lang.Runnable r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 11: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 15; continue $sw12; }
                    abcd.wu.j6(th, 289004669114347340L, null, r7, r8);
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(289004669114347340L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (r7.getSharedPreferences("WhatsNew", 0).getInt("ShownVersion", 0) == DW(r7)) { $pc12 = 10; continue $sw12; }
                    try {
                        j6(r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2221147667588553088L)
    private static java.lang.String FH(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 10: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 14; continue $sw13; }
                    abcd.wu.j6(th, -1418512836848854824L, null, r6);
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 17; continue $sw13; }
                    try {
                        abcd.wu.j6(-1418512836848854824L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 10; continue $sw13;
                    }
                    $pc13 = 17; continue $sw13;
                }
                case 17: {
                    return r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0).versionName;
                }
                case 8: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(android.content.Context r0) {
        return FH(r0);
    }

    public static void j6(android.app.Activity r7, java.lang.Runnable r8) {
        com.aide.ui.marketing.WhatsNewDialog.WhatsNewDialogFragment r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 3;
        $sw14: while (true) {
            switch ($pc14) {
                case 7: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 11; continue $sw14; }
                    abcd.wu.j6(th, 6088108755233122051L, null, r7, r8);
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc14 = 5; continue $sw14; }
                    try {
                        abcd.wu.j6(6088108755233122051L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 7; continue $sw14;
                    }
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    try {
                        r7.getSharedPreferences("WhatsNew", 0).edit().putInt("ShownVersion", DW(r7)).commit();
                        r0 = new com.aide.ui.marketing.WhatsNewDialog.WhatsNewDialogFragment();
                        r0.j6(r8);
                        r0.show(r7.getFragmentManager(), "whatsnew");
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 7; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
