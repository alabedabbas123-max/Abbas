package abcd;

@abcd.Interfacexu
public class uh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -1303651809497087244L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -3729163413621129048L)
    private boolean tp;

    @abcd.Interfaceru(field = 905728849216926512L)
    private boolean u7;

    @abcd.Interfacexu
    private static class a extends android.widget.BaseExpandableListAdapter {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1323341255948861380L)
        private java.util.List<java.util.List<abcd.Sk.a>> FH;

        @abcd.Interfaceru(field = -388402737878013984L)
        private android.content.Context Hw;

        static {
            abcd.wu.j6(abcd.uh.a.class, 2026413306719904496L, 2026413306719904496L);
        }

        @abcd.Interfacesu(method = 20211823486828795L)
        public a(android.content.Context r8, java.util.List<java.util.List<abcd.Sk.a>> r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -232176595782541683L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-232176595782541683L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 105767470024301760L)
        private boolean DW(int r5) {
        L13:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, -1796781481611885296L, this, new java.lang.Integer(r5));
        L17:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1796781481611885296L, this, r5);     // Catch: java.lang.Throwable -> L13
        L6:
            java.lang.String r2 = j6(r5);     // Catch: java.lang.Throwable -> L13
            com.aide.ui.trainer.g.c r3 = com.aide.ui.U.SI().j6(r2);     // Catch: java.lang.Throwable -> L13
            if (r3 == null) goto L11;
            if (r3.EQ() <= 0) goto L11;
            return true;
        L11:
            return false;
        }

        @Override
        @abcd.Interfacesu(method = 794793089487503848L)
        public java.lang.Object getChild(int r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 368494523357027872L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(368494523357027872L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            return this.FH.get(r8).get(r9);
        }

        @Override
        @abcd.Interfacesu(method = 701830187821444539L)
        public long getChildId(int r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1408382048191777725L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L14;
            abcd.wu.j6(-1408382048191777725L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
            return 0;
        L14:
            return 0;
        }

        @Override
        @abcd.Interfacesu(method = 6364351508466026088L)
        public android.view.View getChildView(int r17, int r18, boolean r19, android.view.View r20, android.view.ViewGroup r21) {
        L26:
            th = th;
        L29:
            if (DW == false) goto L31;
            abcd.wu.j6(th, -488028546869095920L, this, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21);
        L31:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(-488028546869095920L, this, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21);     // Catch: java.lang.Throwable -> L26
        L7:
            if (r20 != null) goto L11;
            android.view.View r1 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.createproject_entry, r21, false);     // Catch: java.lang.Throwable -> L24
        L12:
            android.widget.TextView r2 = (android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryLabel);     // Catch: java.lang.Throwable -> L24
            android.widget.TextView r3 = (android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryDescription);     // Catch: java.lang.Throwable -> L24
            android.widget.ImageView r4 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryImage);     // Catch: java.lang.Throwable -> L24
            float r7 = 0.5f;
            if (j6(r17, r18) == false) goto L19;
            abcd.Sk.a r0 = (abcd.Sk.a) getChild(r17, 0);     // Catch: java.lang.Throwable -> L24
            r2.setText(com.almlkaide.kaypro.R.string.dialog_create_project_samples);     // Catch: java.lang.Throwable -> L24
            r3.setVisibility(8);     // Catch: java.lang.Throwable -> L24
            r4.setImageResource(r0.Zo);     // Catch: java.lang.Throwable -> L24
            if (r0.VH.tp == false) goto L17;
            float r6 = 1.0f;
        L18:
            r4.setAlpha(r6);     // Catch: java.lang.Throwable -> L24
            r2.setAlpha(r6);     // Catch: java.lang.Throwable -> L24
            r3.setAlpha(r6);     // Catch: java.lang.Throwable -> L24
        L23:
            return r1;
        L17:
            r6 = 0.5f;
            goto L18
        L19:
            abcd.Sk.a r5 = (abcd.Sk.a) getChild(r17, r18);     // Catch: java.lang.Throwable -> L24
            r2.setText(this.Hw.getResources().getString(com.almlkaide.kaypro.R.string.dialog_create_project_new, new java.lang.Object[]{r5.DW}));     // Catch: java.lang.Throwable -> L24
            r3.setVisibility(0);     // Catch: java.lang.Throwable -> L24
            r3.setText(r5.VH.FH);     // Catch: java.lang.Throwable -> L24
            r4.setImageResource(r5.Zo);     // Catch: java.lang.Throwable -> L24
            if (r5.VH.tp == false) goto L22;
            r7 = 1.0f;
        L22:
            r4.setAlpha(r7);     // Catch: java.lang.Throwable -> L24
            r2.setAlpha(r7);     // Catch: java.lang.Throwable -> L24
            r3.setAlpha(r7);     // Catch: java.lang.Throwable -> L24
        L24:
            th = th;
            goto L29
        L11:
            r1 = r20;
            goto L12
        }

        @Override
        @abcd.Interfacesu(method = 1000857738434594715L)
        public int getChildrenCount(int r5) {
        L9:
            th = move-exception;
            if (DW == false) goto L13;
            abcd.wu.j6(th, -4019972520800585109L, this, new java.lang.Integer(r5));
        L13:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-4019972520800585109L, this, r5);     // Catch: java.lang.Throwable -> L9
        L6:
            int r2 = this.FH.get(r5).size();     // Catch: java.lang.Throwable -> L9
            return r2 + (DW(r5) ? 1 : 0);
        }

        @Override
        @abcd.Interfacesu(method = 1677372005865966600L)
        public java.lang.Object getGroup(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 253952695918904880L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(253952695918904880L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH.get(r5);
        }

        @Override
        @abcd.Interfacesu(method = -191806811955904288L)
        public int getGroupCount() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3784194374910977664L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3784194374910977664L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH.size();
        }

        @Override
        @abcd.Interfacesu(method = -1809210473980745155L)
        public long getGroupId(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 828266266863184149L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(828266266863184149L, this, r5);     // Catch: java.lang.Throwable -> L8
        L7:
            return r5;
        }

        @Override
        @abcd.Interfacesu(method = 3385462561184511360L)
        public android.view.View getGroupView(int r10, boolean r11, android.view.View r12, android.view.ViewGroup r13) {
        L11:
            th = move-exception;
            if (DW == false) goto L15;
            abcd.wu.j6(th, -65666186829364800L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
        L15:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-65666186829364800L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);     // Catch: java.lang.Throwable -> L11
        L6:
            if (r12 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.designer_widgetlist_group, r13, false);     // Catch: java.lang.Throwable -> L11
        L9:
            abcd.Sk.a r0 = (abcd.Sk.a) getChild(r10, 0);     // Catch: java.lang.Throwable -> L11
            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.widgetlistGroupName)).setText(r0.VH.v5);     // Catch: java.lang.Throwable -> L11
            return r1;
        L8:
            r1 = r12;
            goto L9
        }

        @Override
        @abcd.Interfacesu(method = 894621544398910285L)
        public boolean hasStableIds() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2459711750389013565L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(2459711750389013565L, this);     // Catch: java.lang.Throwable -> L8
            return true;
        L15:
            return true;
        }

        @Override
        @abcd.Interfacesu(method = 1008571414591972456L)
        public boolean isChildSelectable(int r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -380257288707059008L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L14;
            abcd.wu.j6(-380257288707059008L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
            return true;
        L14:
            return true;
        }

        @abcd.Interfacesu(method = 327129985347280115L)
        public java.lang.String j6(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3273323525592575765L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3273323525592575765L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH.get(r5).get(0).VH.we;
        }

        @abcd.Interfacesu(method = 4718231339956844395L)
        public boolean j6(int r8, int r9) {
        L12:
            th = move-exception;
            if (DW == false) goto L16;
            abcd.wu.j6(th, 1312911586431383235L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L16:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(1312911586431383235L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
        L6:
            if (DW(r8) == false) goto L10;
            if (r9 != this.FH.get(r8).size()) goto L10;
            return true;
        L10:
            return false;
        }
    }

    static {
        abcd.wu.j6(abcd.uh.class, -465475316197143384L, -465475316197143384L);
    }

    public uh(java.lang.String r8, boolean r9) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -347134879684751796L, null, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-347134879684751796L, null, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.tp = true;     // Catch: java.lang.Throwable -> L7
        this.gn = r8;     // Catch: java.lang.Throwable -> L7
        this.u7 = r9;     // Catch: java.lang.Throwable -> L7
    }

    static java.lang.String DW(abcd.uh r0) {
        return r0.gn;
    }

    static void j6(abcd.uh r0) {
        r0.v5();
    }

    static boolean j6(abcd.uh r0, boolean r1) {
        r0.tp = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 2974001686858122248L)
    private void v5() {
    L14:
        th = move-exception;
        if (VH == false) goto L18;
        abcd.wu.j6(th, -719671444291015088L, this);
    L18:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-719671444291015088L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.u7 == false) goto L21;
        java.util.HashMap r2 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L14
        if (this.tp == false) goto L11;
        java.lang.String r3 = "cancelled";
    L12:
        r2.put("exit", r3);     // Catch: java.lang.Throwable -> L14
        abcd.F.j6("New user experience", r2);     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        r3 = "createContinued";
        goto L12
    }

    @Override
    @abcd.Interfacesu(method = 2888281673854544549L)
    protected android.app.Dialog j6(android.app.Activity r13) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2218568292298826557L, this, r13);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2218568292298826557L, this, r13);     // Catch: java.lang.Throwable -> L8
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r13);     // Catch: java.lang.Throwable -> L8
        java.util.List<java.util.List<abcd.Sk.a>> r9 = com.aide.ui.U.gW().j6();     // Catch: java.lang.Throwable -> L8
        com.almlkaide.kaypro.widget.CustomExpandableListView r3 = new com.almlkaide.kaypro.widget.CustomExpandableListView(r13);     // Catch: java.lang.Throwable -> L8
        r3.setCacheColorHint(0);     // Catch: java.lang.Throwable -> L8
        abcd.uh.a r6 = new abcd.uh.a(r13, r9);     // Catch: java.lang.Throwable -> L8
        r3.setAdapter(r6);     // Catch: java.lang.Throwable -> L8
        r2.setTitle(com.almlkaide.kaypro.R.string.dialog_create_project_title).setView(r3);     // Catch: java.lang.Throwable -> L8
        r2.setOnCancelListener(new abcd.DialogInterfaceOnCancelListenersh(this));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r4 = r2.create();     // Catch: java.lang.Throwable -> L8
        r3.setOnChildClickListener(new abcd.C1345th(this, r6, r4, r13, r9));     // Catch: java.lang.Throwable -> L8
        r3.expandGroup(0);     // Catch: java.lang.Throwable -> L8
        return r4;
    }
}
