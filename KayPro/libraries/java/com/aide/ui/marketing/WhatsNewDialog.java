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
        L13:
            th = move-exception;
            if (DW == false) goto L18;
            abcd.wu.j6(th, 186003988000272072L, null, r10);
        L18:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(186003988000272072L, null, r10);     // Catch: java.lang.Throwable -> L13
        L6:
            this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
            this.Hw = r10;     // Catch: java.lang.Throwable -> L13
            this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
            com.aide.ui.marketing.a.C0047a[] r3 = com.aide.ui.marketing.a.j6;     // Catch: java.lang.Throwable -> L13
            int r4 = r3.length;     // Catch: java.lang.Throwable -> L13
            int r5 = 0;
        L7:
            if (r5 >= r4) goto L12;
            com.aide.ui.marketing.a.C0047a r6 = r3[r5];     // Catch: java.lang.Throwable -> L13
            if (r6.Hw.equals(r10.getPackageName()) == false) goto L11;
            this.FH.add(r6);     // Catch: java.lang.Throwable -> L13
        L11:
            r5 = r5 + 1;
            goto L7
        }

        @Override
        @abcd.Interfacesu(method = -998587396990188468L)
        public int getCount() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 203782999691271672L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(203782999691271672L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH.size();
        }

        @Override
        @abcd.Interfacesu(method = -818842149512929085L)
        public java.lang.Object getItem(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -203887610944724343L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-203887610944724343L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH.get(r5);
        }

        @Override
        @abcd.Interfacesu(method = 1027768060609764804L)
        public long getItemId(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -284809481799784528L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(-284809481799784528L, this, r5);     // Catch: java.lang.Throwable -> L8
        L7:
            return r5;
        }

        @Override
        @abcd.Interfacesu(method = 2742632277161757635L)
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        L46:
            th = th;
        L49:
            if (DW == false) goto L52;
            abcd.wu.j6(th, -2030958202756261779L, this, new java.lang.Integer(r17), r18, r19);
        L52:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2030958202756261779L, this, new java.lang.Integer(r17), r18, r19);     // Catch: java.lang.Throwable -> L46
        L6:
            int r1 = 0;
            if (r18 != null) goto L11;
            android.view.View r2 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.dialog_whatsnew_item, r19, false);     // Catch: java.lang.Throwable -> L44
        L12:
            com.aide.ui.marketing.a.C0047a r3 = this.FH.get(r17);     // Catch: java.lang.Throwable -> L44
            android.widget.TextView r4 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemHeader);     // Catch: java.lang.Throwable -> L44
            if (r17 != 0) goto L15;
            java.lang.String r5 = "What's new";
        L16:
            r4.setText(r5);     // Catch: java.lang.Throwable -> L44
            if (r17 > 1) goto L19;
            int r10 = 0;
        L20:
            r4.setVisibility(r10);     // Catch: java.lang.Throwable -> L44
            ((android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemIcon)).setImageResource(r3.FH);     // Catch: java.lang.Throwable -> L44
            android.widget.TextView r6 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemTitle);     // Catch: java.lang.Throwable -> L44
            r6.setText(r3.v5);     // Catch: java.lang.Throwable -> L44
            if (r17 == 0) goto L23;
            int r11 = 0;
        L24:
            r6.setVisibility(r11);     // Catch: java.lang.Throwable -> L44
            android.widget.TextView r7 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemSubTitle);     // Catch: java.lang.Throwable -> L44
            r7.setText(r3.Zo);     // Catch: java.lang.Throwable -> L44
            if (r17 == 0) goto L27;
            int r12 = 0;
        L28:
            r7.setVisibility(r12);     // Catch: java.lang.Throwable -> L44
            android.widget.TextView r8 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.whatsNewItemText);     // Catch: java.lang.Throwable -> L44
            java.util.List<java.lang.String> r9 = r3.j6(this.Hw);     // Catch: java.lang.Throwable -> L44
            java.lang.String r13 = com.aide.ui.marketing.WhatsNewDialog.j6(this.Hw) + "<br/>";     // Catch: java.lang.Throwable -> L44
            int r14 = 0;
        L30:
            if (r14 >= r9.size()) goto L38;
            java.lang.String r15 = r9.get(r14);     // Catch: java.lang.Throwable -> L44
            int r16 = r15.indexOf(58);     // Catch: java.lang.Throwable -> L44
            if (r16 <= 0) goto L34;
            java.lang.StringBuilder r110 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L44
            r110.append("<b>");     // Catch: java.lang.Throwable -> L44
            int r111 = r16 + 1;     // Catch: java.lang.Throwable -> L44
            r110.append(r15.substring(0, r111));     // Catch: java.lang.Throwable -> L44
            r110.append("</b>");     // Catch: java.lang.Throwable -> L44
            r110.append(r15.substring(r111, r15.length()));     // Catch: java.lang.Throwable -> L44
            r15 = r110.toString();     // Catch: java.lang.Throwable -> L44
        L34:
            r13 = r13 + r15;     // Catch: java.lang.Throwable -> L44
            if (r14 >= (r9.size() - 1)) goto L37;
            r13 = r13 + "<br/>";     // Catch: java.lang.Throwable -> L44
        L37:
            r14 = r14 + 1;     // Catch: java.lang.Throwable -> L44
            goto L30
        L38:
            r8.setText(android.text.Html.fromHtml(r13));     // Catch: java.lang.Throwable -> L44
            if (r17 == 0) goto L42;
            r1 = 8;
        L42:
            r8.setVisibility(r1);     // Catch: java.lang.Throwable -> L44
            return r2;
        L27:
            r12 = 8;
            goto L28
        L23:
            r11 = 8;
            goto L24
        L19:
            r10 = 8;
            goto L20
        L15:
            r5 = "New app";
        L44:
            th = th;
            goto L49
        L11:
            r2 = r18;
            goto L12
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
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 7208584723108103456L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(7208584723108103456L, null);     // Catch: java.lang.Throwable -> L8
        L6:
        }

        public void j6(java.lang.Runnable r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -815380942762689705L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-815380942762689705L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r5;     // Catch: java.lang.Throwable -> L8
        }

        @Override
        public void onCancel(android.content.DialogInterface r5) {
        L10:
            th = move-exception;
            if (DW == false) goto L14;
            abcd.wu.j6(th, 382626563866172984L, this, r5);
        L14:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(382626563866172984L, this, r5);     // Catch: java.lang.Throwable -> L10
        L6:
            super.onCancel(r5);     // Catch: java.lang.Throwable -> L10
            if (this.FH == null) goto L17;
            this.FH.run();     // Catch: java.lang.Throwable -> L10
            return;
        }

        @Override
        public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -798208688367902808L, this, r7);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-798208688367902808L, this, r7);     // Catch: java.lang.Throwable -> L8
        L6:
            android.widget.ListView r2 = new android.widget.ListView(getActivity());     // Catch: java.lang.Throwable -> L8
            r2.setAdapter(new com.aide.ui.marketing.WhatsNewDialog.PromotedAppListAdapter(getActivity()));     // Catch: java.lang.Throwable -> L8
            android.app.AlertDialog r3 = new android.app.AlertDialog.Builder(getActivity()).setView(r2).create();     // Catch: java.lang.Throwable -> L8
            r3.setButton(-1, getString(com.almlkaide.kaypro.R.string.dialog_ok), new com.aide.ui.marketing.b(this));     // Catch: java.lang.Throwable -> L8
            return r3;
        }

        @Override
        public void onDismiss(android.content.DialogInterface r5) {
        L10:
            th = move-exception;
            if (DW == false) goto L14;
            abcd.wu.j6(th, 346956988329055000L, this, r5);
        L14:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(346956988329055000L, this, r5);     // Catch: java.lang.Throwable -> L10
        L6:
            super.onDismiss(r5);     // Catch: java.lang.Throwable -> L10
            if (this.FH == null) goto L17;
            this.FH.run();     // Catch: java.lang.Throwable -> L10
            return;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.marketing.WhatsNewDialog.class, -255305077619933835L, -255305077619933835L);
    }

    public WhatsNewDialog() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -525653038800917577L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-525653038800917577L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -2947093802115670708L)
    private static int DW(android.content.Context r6) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 2906833643844366216L, null, r6);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L17;
        abcd.wu.j6(2906833643844366216L, null, r6);     // Catch: java.lang.Throwable -> L10
    L17:
        return r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0).versionCode;
    L9:
        return 0;
    }

    public static boolean DW(android.app.Activity r7, java.lang.Runnable r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 289004669114347340L, null, r7, r8);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(289004669114347340L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r7.getSharedPreferences("WhatsNew", 0).getInt("ShownVersion", 0) == DW(r7)) goto L10;
        j6(r7, r8);     // Catch: java.lang.Throwable -> L11
        return true;
    L10:
        return false;
    }

    @abcd.Interfacesu(method = 2221147667588553088L)
    private static java.lang.String FH(android.content.Context r6) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1418512836848854824L, null, r6);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L17;
        abcd.wu.j6(-1418512836848854824L, null, r6);     // Catch: java.lang.Throwable -> L10
    L17:
        return r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0).versionName;
    L8:
        return "";
    }

    static java.lang.String j6(android.content.Context r0) {
        return FH(r0);
    }

    public static void j6(android.app.Activity r7, java.lang.Runnable r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6088108755233122051L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6088108755233122051L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        r7.getSharedPreferences("WhatsNew", 0).edit().putInt("ShownVersion", DW(r7)).commit();     // Catch: java.lang.Throwable -> L7
        com.aide.ui.marketing.WhatsNewDialog.WhatsNewDialogFragment r0 = new com.aide.ui.marketing.WhatsNewDialog.WhatsNewDialogFragment();     // Catch: java.lang.Throwable -> L7
        r0.j6(r8);     // Catch: java.lang.Throwable -> L7
        r0.show(r7.getFragmentManager(), "whatsnew");     // Catch: java.lang.Throwable -> L7
    }
}
