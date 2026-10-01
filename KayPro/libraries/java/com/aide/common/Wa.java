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
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -3233666482377458640L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-3233666482377458640L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.aide.ui.Oa.share_dialog_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 61108183099295076L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L17:
            th = move-exception;
            if (DW == false) goto L21;
            abcd.wu.j6(th, -2464494226770077829L, this, new java.lang.Integer(r9), r10, r11);
        L21:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-2464494226770077829L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L17
        L5:
            int r0 = 0;
            if (r10 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(getContext()).inflate(com.aide.ui.Oa.share_dialog_entry, r11, false);     // Catch: java.lang.Throwable -> L17
        L9:
            com.aide.common.Wa.b r2 = getItem(r9);     // Catch: java.lang.Throwable -> L17
            ((android.widget.TextView) r1.findViewById(com.aide.ui.Na.shareDialogEntryText)).setText(com.aide.common.Wa.b.FH(r2));     // Catch: java.lang.Throwable -> L17
            android.widget.ImageView r3 = (android.widget.ImageView) r1.findViewById(com.aide.ui.Na.shareDialogEntryImage);     // Catch: java.lang.Throwable -> L17
            if (com.aide.common.Wa.b.Hw(r2) == 0) goto L13;
            r3.setImageResource(com.aide.common.Wa.b.Hw(r2));     // Catch: java.lang.Throwable -> L17
        L13:
            if (com.aide.common.Wa.b.Hw(r2) != 0) goto L15;
            r0 = 4;
        L15:
            r3.setVisibility(r0);     // Catch: java.lang.Throwable -> L17
            return r1;
        L8:
            r1 = r10;
            goto L9
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
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 2186024998602728309L, null, new java.lang.Integer(r8), r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(2186024998602728309L, null, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            this.v5 = null;     // Catch: java.lang.Throwable -> L7
            this.Zo = true;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -1440297190966276825L)
        public b(int r9, java.lang.String r10, java.lang.Runnable r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1792560872477880192L, null, new java.lang.Integer(r9), r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1792560872477880192L, null, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r9;     // Catch: java.lang.Throwable -> L7
            this.FH = r10;     // Catch: java.lang.Throwable -> L7
            this.v5 = r11;     // Catch: java.lang.Throwable -> L7
            this.Zo = false;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 8050462813539910400L)
        public b(int r10, java.lang.String r11, java.lang.Runnable r12, boolean r13) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 820461152477372975L, null, new java.lang.Integer(r10), r11, r12, new java.lang.Boolean(r13));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(820461152477372975L, null, new java.lang.Integer(r10), r11, r12, new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r10;     // Catch: java.lang.Throwable -> L7
            this.FH = r11;     // Catch: java.lang.Throwable -> L7
            this.v5 = r12;     // Catch: java.lang.Throwable -> L7
            this.Zo = r13;     // Catch: java.lang.Throwable -> L7
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
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -1131598358534696472L, null, r11, r12, r13, r14, r15);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-1131598358534696472L, null, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
    L5:
        this.gn = r11;     // Catch: java.lang.Throwable -> L7
        this.u7 = r12;     // Catch: java.lang.Throwable -> L7
        this.tp = r15;     // Catch: java.lang.Throwable -> L7
        this.EQ = r13;     // Catch: java.lang.Throwable -> L7
        this.we = r14;     // Catch: java.lang.Throwable -> L7
    }

    static java.util.List DW(com.aide.common.Wa r0) {
        return r0.we;
    }

    public static void DW(android.app.Activity r5) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -3118589333291844288L, null, r5);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-3118589333291844288L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.common.ClassG.j6() == false) goto L9;
        com.aide.common.Ha.Hw(r5, "101304250883271700981");     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        com.aide.common.Ha.FH(r5, "104927725094165066286");     // Catch: java.lang.Throwable -> L11
    }

    public static void DW(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.lang.Runnable r12) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, 1055564674100857780L, null, r9, r10, r11, r12);
    L14:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(1055564674100857780L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L10
    L5:
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L10
        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, r9.getResources().getString(com.aide.ui.Ra.dialog_community_ask), new com.aide.common.Ua(r9)));     // Catch: java.lang.Throwable -> L10
        if (r12 == null) goto L8;
        r4.add(new com.aide.common.Wa.b(0, r9.getResources().getString(com.aide.ui.Ra.trainer_skip_lesson) + " ↷", r12, true));     // Catch: java.lang.Throwable -> L10
    L8:
        r4.add(new com.aide.common.Wa.b(0, r9.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));     // Catch: java.lang.Throwable -> L10
        com.aide.common.Abstractma.j6(r9, new com.aide.common.Wa(r10, r11, r4, null, null));     // Catch: java.lang.Throwable -> L10
    }

    public static void DW(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -3842855386415390224L, null, r10, r11, r12, r13, r14);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-3842855386415390224L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "Google+", new com.aide.common.Ia(r10, r12, r13)));     // Catch: java.lang.Throwable -> L8
        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_twitter, "Twitter", new com.aide.common.Ja(r10, r12, r13)));     // Catch: java.lang.Throwable -> L8
        r4.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_facebook, "Facebook", new com.aide.common.Ka(r10, r12, r13)));     // Catch: java.lang.Throwable -> L8
        r4.add(new com.aide.common.Wa.b(0, r10.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));     // Catch: java.lang.Throwable -> L8
        com.aide.common.Abstractma.j6(r10, new com.aide.common.Wa(r11, "\"" + r12 + "\"", r4, null, r14));     // Catch: java.lang.Throwable -> L8
    }

    public static void FH(android.app.Activity r10) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -1266575227871095392L, null, r10);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1266575227871095392L, null, r10);     // Catch: java.lang.Throwable -> L11
    L6:
        java.util.ArrayList r7 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "Google+", new com.aide.common.Na(r10)));     // Catch: java.lang.Throwable -> L11
        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_twitter, "Twitter", new com.aide.common.Oa(r10)));     // Catch: java.lang.Throwable -> L11
        r7.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_facebook, "Facebook", new com.aide.common.Pa(r10)));     // Catch: java.lang.Throwable -> L11
        java.util.ArrayList r8 = new java.util.ArrayList(r7);     // Catch: java.lang.Throwable -> L11
        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_googleplus, "G+ Community", new com.aide.common.Qa(r10)));     // Catch: java.lang.Throwable -> L11
        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_google_groups, "Google Group", new com.aide.common.Ra(r10)));     // Catch: java.lang.Throwable -> L11
        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_email, "Email", new com.aide.common.Sa(r10)));     // Catch: java.lang.Throwable -> L11
        if (com.aide.common.ClassG.j6() == true) goto L9;
        r8.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_market, r10.getResources().getString(com.aide.ui.Ra.dialog_community_rate), new com.aide.common.Ta(r10)));     // Catch: java.lang.Throwable -> L11
    L9:
        r7.add(new com.aide.common.Wa.b(0, r10.getResources().getString(com.aide.ui.Ra.dialog_community_more)));     // Catch: java.lang.Throwable -> L11
        com.aide.common.Abstractma.j6(r10, new com.aide.common.Wa(r10.getResources().getString(com.aide.ui.Ra.dialog_community_title), r10.getResources().getString(com.aide.ui.Ra.dialog_community_message), r7, r8, null));     // Catch: java.lang.Throwable -> L11
    }

    static boolean FH(com.aide.common.Wa r0) {
        return r0.J0;
    }

    static java.lang.Runnable j6(com.aide.common.Wa r0) {
        return r0.tp;
    }

    public static void j6(android.app.Activity r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Runnable r20) {
        if (Zo == false) goto L5;
        abcd.wu.j6(-1943874245814127263L, null, new java.lang.Object[]{r15, r16, r17, r18, r19, r20});
    L5:
        java.util.ArrayList r12 = new java.util.ArrayList();
        r12.add(new com.aide.common.Wa.b(com.aide.ui.R$drawable.community_market, r15.getResources().getString(com.aide.ui.Ra.dialog_community_rate), new com.aide.common.Va(r15, r18, r19)));
        r12.add(new com.aide.common.Wa.b(0, r15.getResources().getString(com.aide.ui.Ra.dialog_community_continue) + " ≫"));
        com.aide.common.Abstractma.j6(r15, new com.aide.common.Wa(r16, r17, r12, null, r20));
    }

    static boolean j6(com.aide.common.Wa r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    @Override
    @abcd.Interfacesu(method = 1133240333989313256L)
    protected android.app.Dialog j6(android.app.Activity r8) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1342505932466576631L, this, r8);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1342505932466576631L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.LinearLayout r2 = (android.widget.LinearLayout) android.view.LayoutInflater.from(r8).inflate(com.aide.ui.Oa.share_dialog, null);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L8
        r3.setView(r2).setCancelable(true).setTitle(this.gn);     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r4 = r3.create();     // Catch: java.lang.Throwable -> L8
        r4.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L8
        r4.setOnCancelListener(new com.aide.common.La(this));     // Catch: java.lang.Throwable -> L8
        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.shareDialogMessage)).setText(this.u7);     // Catch: java.lang.Throwable -> L8
        android.widget.ListView r5 = (android.widget.ListView) r2.findViewById(com.aide.ui.Na.shareDialogList);     // Catch: java.lang.Throwable -> L8
        r5.setAdapter(new com.aide.common.Wa.a(this, r8, this.EQ));     // Catch: java.lang.Throwable -> L8
        r5.setOnItemClickListener(new com.aide.common.Ma(this, r5, r8, r4));     // Catch: java.lang.Throwable -> L8
        return r4;
    }
}
