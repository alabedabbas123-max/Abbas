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
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -552356801102747168L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-552356801102747168L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, com.aide.ui.Oa.propertydialog_entry, r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            android.view.View r0 = getView_SOURCE(r2, r3, r4);
            com.almlkaide.kaypro.aide.uidesign.TextTranslation.translationWidgetmenuEntryName(r0);
            return r0;
        }

        @abcd.Interfacesu(method = -1281641125723598655L)
        public android.view.View getView_SOURCE(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 902087801372589832L, this, new java.lang.Integer(r9), r10, r11);
        L20:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(902087801372589832L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L16
        L5:
            int r0 = 0;
            if (r10 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(getContext()).inflate(com.aide.ui.Oa.propertydialog_entry, r11, false);     // Catch: java.lang.Throwable -> L16
        L9:
            com.aide.common.ua.a r2 = getItem(r9);     // Catch: java.lang.Throwable -> L16
            ((android.widget.TextView) r1.findViewById(com.aide.ui.Na.widgetmenuEntryName)).setText(android.text.Html.fromHtml(r2.getName()));     // Catch: java.lang.Throwable -> L16
            ((android.widget.ImageView) r1.findViewById(com.aide.ui.Na.widgetmenuEntryImage)).setImageResource(com.aide.common.ClassG.FH(getContext(), r2.j6()));     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r2.FH();     // Catch: java.lang.Throwable -> L16
            android.view.View r4 = r1.findViewById(com.aide.ui.Na.widgetmenuHelpButton);     // Catch: java.lang.Throwable -> L16
            if (r3 != null) goto L12;
            r0 = 8;
        L12:
            r4.setVisibility(r0);     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            r4.setOnClickListener(new com.aide.common.ViewOnClickListenerva(this, r3));     // Catch: java.lang.Throwable -> L16
        L15:
            return r1;
        L8:
            r1 = r10;
            goto L9
        }
    }

    static {
        abcd.wu.j6(com.aide.common.ua.class, -5728075795338140784L, -5728075795338140784L);
    }

    public ua(java.lang.String r8, java.util.List<? extends com.aide.common.ua.a> r9) {
    L13:
        th = move-exception;
        if (VH == false) goto L18;
        abcd.wu.j6(th, 6861621606217403563L, null, r8, r9);
    L18:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(6861621606217403563L, null, r8, r9);     // Catch: java.lang.Throwable -> L13
    L5:
        this.u7 = r8;     // Catch: java.lang.Throwable -> L13
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L13
        java.util.Iterator<? extends com.aide.common.ua.a> r0 = r9.iterator();     // Catch: java.lang.Throwable -> L13
    L6:
        if (r0.hasNext() == false) goto L12;
        com.aide.common.ua.a r1 = r0.next();     // Catch: java.lang.Throwable -> L13
        if (r1.DW() == false) goto L6;
        this.gn.add(r1);     // Catch: java.lang.Throwable -> L13
        goto L6
    }

    static java.util.List j6(com.aide.common.ua r0) {
        return r0.gn;
    }

    @Override
    @abcd.Interfacesu(method = -732187598988876800L)
    protected android.app.Dialog j6(android.app.Activity r7) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 743108399929493893L, this, r7);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(743108399929493893L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.ListView r2 = new android.widget.ListView(r7);     // Catch: java.lang.Throwable -> L8
        r2.setAdapter(new com.aide.common.ua.b(r7, this.gn));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r3 = new android.app.AlertDialog.Builder(r7).setCancelable(true).setView(r2).setTitle(this.u7).create();     // Catch: java.lang.Throwable -> L8
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L8
        r2.setOnItemClickListener(new com.aide.common.ta(this, r3));     // Catch: java.lang.Throwable -> L8
        return r3;
    }
}
