package com.aide.uidesigner;

@abcd.Interfacexu
public class XmlLayoutDesignActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 4840273480200028632L)
    private boolean EQ;

    @abcd.Interfaceru(field = 4966722040749927987L)
    private android.widget.LinearLayout FH;

    @abcd.Interfaceru(field = 1865376215420291139L)
    private android.widget.LinearLayout Hw;

    @abcd.Interfaceru(field = 4375633138514648325L)
    private boolean J0;

    @abcd.Interfaceru(field = 1215947056675035136L)
    private com.aide.common.TextToSpeechHelper J8;

    @abcd.Interfaceru(field = -3018703937080657747L)
    private int QX;

    @abcd.Interfaceru(field = 1166478388400933504L)
    private com.aide.uidesigner.Pa VH;

    @abcd.Interfaceru(field = 2743830470480381408L)
    private android.media.SoundPool Ws;

    @abcd.Interfaceru(field = -4985243385237931320L)
    private android.support.v4.app.C1621a Zo;

    @abcd.Interfaceru(field = 2413866931227350580L)
    private com.aide.common.UndoManager gn;

    @abcd.Interfaceru(field = 1148128536734063587L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 2100281338259306461L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = -873838181706193039L)
    private boolean v5;

    @abcd.Interfaceru(field = -285618392490262860L)
    private boolean we;

    @abcd.Interfacexu
    private static class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 160377123568282023L)
        public java.io.File FH;

        @abcd.Interfaceru(field = -2927531815922255904L)
        public boolean Hw;

        @abcd.Interfaceru(field = 181577619684888240L)
        public com.aide.uidesigner.ClassS v5;

        static {
            abcd.wu.j6(com.aide.uidesigner.XmlLayoutDesignActivity.a.class, -655267986816388145L, -655267986816388145L);
        }

        @abcd.Interfacesu(method = 71703956017126511L)
        public a(com.aide.uidesigner.ClassS r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2414617053795948336L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2414617053795948336L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.v5 = r6;     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = 81815974186999143L)
        public a(java.io.File r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2575077022016584760L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2575077022016584760L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r6;     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -238013890881052909L)
        public a(boolean r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -964021694512917180L, null, new java.lang.Boolean(r6));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-964021694512917180L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw = true;     // Catch: java.lang.Throwable -> L8
        }
    }

    @abcd.Interfacexu
    private class b extends android.widget.ArrayAdapter<com.aide.uidesigner.XmlLayoutDesignActivity.a> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.uidesigner.XmlLayoutDesignActivity FH;

        static {
            abcd.wu.j6(com.aide.uidesigner.XmlLayoutDesignActivity.b.class, 1672437279430558904L, 1672437279430558904L);
        }

        @abcd.Interfacesu(method = 1159378966533570068L)
        public b(com.aide.uidesigner.XmlLayoutDesignActivity r9, android.content.Context r10, java.util.List<com.aide.uidesigner.XmlLayoutDesignActivity.a> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -31329099779967120L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-31329099779967120L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.aide.ui.Oa.designer_viewlist_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            android.view.View r0 = getView_SOURCE(r2, r3, r4);
            com.almlkaide.kaypro.aide.uidesign.TextTranslation.translationDesignerViewlistEntryName(r0);
            return r0;
        }

        @abcd.Interfacesu(method = 1748395012633134525L)
        public android.view.View getView_SOURCE(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L33:
            th = move-exception;
            if (DW == false) goto L37;
            abcd.wu.j6(th, 445735583216114936L, this, new java.lang.Integer(r9), r10, r11);
        L37:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(445735583216114936L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L33
        L5:
            int r0 = 0;
            if (r10 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(getContext()).inflate(com.aide.ui.Oa.designer_viewlist_entry, r11, false);     // Catch: java.lang.Throwable -> L33
        L9:
            com.aide.uidesigner.XmlLayoutDesignActivity.a r2 = getItem(r9);     // Catch: java.lang.Throwable -> L33
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r1.findViewById(com.aide.ui.Na.designerViewlistentryViewLayout);     // Catch: java.lang.Throwable -> L33
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r1.findViewById(com.aide.ui.Na.designerViewlistentryFileLayout);     // Catch: java.lang.Throwable -> L33
            if (r2.v5 == null) goto L17;
            r3.setVisibility(0);     // Catch: java.lang.Throwable -> L33
            r4.setVisibility(8);     // Catch: java.lang.Throwable -> L33
            r3.setPadding((int) (((r2.v5.getDepth() * 20) + 5) * getContext().getResources().getDisplayMetrics().density), 0, 0, 0);     // Catch: java.lang.Throwable -> L33
            ((android.widget.TextView) r1.findViewById(com.aide.ui.Na.designerViewlistEntryName)).setText(r2.v5.getNodeName());     // Catch: java.lang.Throwable -> L33
            android.widget.ImageView r5 = (android.widget.ImageView) r1.findViewById(com.aide.ui.Na.designerViewlistEntryImage);     // Catch: java.lang.Throwable -> L33
            if (r2.v5.Zo() == false) goto L14;
            int r6 = com.aide.ui.R$drawable.objects;     // Catch: java.lang.Throwable -> L33
        L15:
            r5.setImageResource(r6);     // Catch: java.lang.Throwable -> L33
        L32:
            return r1;
        L14:
            r6 = com.aide.ui.R$drawable.box_blue;     // Catch: java.lang.Throwable -> L33
            goto L15
        L17:
            if (r2.FH == null) goto L31;
            r3.setVisibility(8);     // Catch: java.lang.Throwable -> L33
            r4.setVisibility(0);     // Catch: java.lang.Throwable -> L33
            r4.setPadding(0, 0, 0, 0);     // Catch: java.lang.Throwable -> L33
            android.widget.RadioButton r7 = (android.widget.RadioButton) r1.findViewById(com.aide.ui.Na.designerViewlistentryFileRadioButton);     // Catch: java.lang.Throwable -> L33
            r7.setFocusable(false);     // Catch: java.lang.Throwable -> L33
            r7.setFocusableInTouchMode(false);     // Catch: java.lang.Throwable -> L33
            r7.setChecked(com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.FH).equals(r2.FH.getPath()));     // Catch: java.lang.Throwable -> L33
            if (com.aide.uidesigner.XmlLayoutDesignActivity.Zo(this.FH) == false) goto L21;
            int r8 = 0;
        L22:
            r7.setVisibility(r8);     // Catch: java.lang.Throwable -> L33
            android.widget.TextView r12 = (android.widget.TextView) r1.findViewById(com.aide.ui.Na.designerViewlistentryFileName);     // Catch: java.lang.Throwable -> L33
            r12.setText(r2.FH.getName());     // Catch: java.lang.Throwable -> L33
            if (com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.FH).equals(r2.FH.getPath()) == false) goto L25;
            r12.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);     // Catch: java.lang.Throwable -> L33
        L26:
            ((android.widget.ImageView) r1.findViewById(com.aide.ui.Na.designerViewlistFileImage)).setImageResource(com.aide.ui.R$drawable.file_type_xml);     // Catch: java.lang.Throwable -> L33
            android.widget.ImageView r13 = (android.widget.ImageView) r1.findViewById(com.aide.ui.Na.designerViewlistentryDelete);     // Catch: java.lang.Throwable -> L33
            if (com.aide.uidesigner.XmlLayoutDesignActivity.Zo(this.FH) == true) goto L30;
            r0 = 8;
        L30:
            r13.setVisibility(r0);     // Catch: java.lang.Throwable -> L33
            r13.setOnClickListener(new com.aide.uidesigner.r(this, r2));     // Catch: java.lang.Throwable -> L33
            goto L32
        L25:
            r12.setTypeface(android.graphics.Typeface.DEFAULT);     // Catch: java.lang.Throwable -> L33
            goto L26
        L21:
            r8 = 8;
            goto L22
        L31:
            r3.setVisibility(8);     // Catch: java.lang.Throwable -> L33
            r4.setVisibility(0);     // Catch: java.lang.Throwable -> L33
            r4.setPadding(0, 0, 0, (int) (getContext().getResources().getDisplayMetrics().density * 10.0f));     // Catch: java.lang.Throwable -> L33
            android.widget.RadioButton r14 = (android.widget.RadioButton) r1.findViewById(com.aide.ui.Na.designerViewlistentryFileRadioButton);     // Catch: java.lang.Throwable -> L33
            r14.setFocusable(false);     // Catch: java.lang.Throwable -> L33
            r14.setFocusableInTouchMode(false);     // Catch: java.lang.Throwable -> L33
            r14.setVisibility(4);     // Catch: java.lang.Throwable -> L33
            android.widget.TextView r15 = (android.widget.TextView) r1.findViewById(com.aide.ui.Na.designerViewlistentryFileName);     // Catch: java.lang.Throwable -> L33
            r15.setText("New layout...");     // Catch: java.lang.Throwable -> L33
            r15.setTypeface(android.graphics.Typeface.DEFAULT);     // Catch: java.lang.Throwable -> L33
            ((android.widget.ImageView) r1.findViewById(com.aide.ui.Na.designerViewlistFileImage)).setImageResource(com.aide.common.ClassG.FH(getContext(), com.aide.ui.Ma.icon_add));     // Catch: java.lang.Throwable -> L33
            ((android.widget.ImageView) r1.findViewById(com.aide.ui.Na.designerViewlistentryDelete)).setVisibility(8);     // Catch: java.lang.Throwable -> L33
            goto L32
        L8:
            r1 = r10;
            goto L9
        }
    }

    static {
        abcd.wu.j6(com.aide.uidesigner.XmlLayoutDesignActivity.class, -2761603648942096159L, -2761603648942096159L);
    }

    public XmlLayoutDesignActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 317603236017144393L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(317603236017144393L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static int DW(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.VH();
    }

    @abcd.Interfacesu(method = -7771534887487600625L)
    private void DW() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 4118730363111407664L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4118730363111407664L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r2 = VH();     // Catch: java.lang.Throwable -> L16
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L10;
        this.FH.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L16
        this.VH.FH(false);     // Catch: java.lang.Throwable -> L16
        return;
    L10:
        int r3 = getResources().getDisplayMetrics().heightPixels;     // Catch: java.lang.Throwable -> L16
        int r4 = getResources().getDisplayMetrics().widthPixels;     // Catch: java.lang.Throwable -> L16
        float r5 = getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L16
        int r6 = (int) (300.0f * r5);
        int r7 = (int) (r5 * 500.0f);
        double r8 = r4;
        java.lang.Double.isNaN(r8);
        int r9 = java.lang.Math.min(r6, (int) (r8 * 0.8d));     // Catch: java.lang.Throwable -> L16
        double r10 = r3;
        java.lang.Double.isNaN(r10);
        this.FH.setLayoutParams(new android.widget.LinearLayout.LayoutParams(r9, java.lang.Math.min(r7, (int) (r10 * 0.8d))));     // Catch: java.lang.Throwable -> L16
        this.VH.FH(true);     // Catch: java.lang.Throwable -> L16
    }

    static void DW(com.aide.uidesigner.XmlLayoutDesignActivity r0, java.lang.String r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = 1148746375309046600L)
    private void DW(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1988525399015426011L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1988525399015426011L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r2 = Zo().edit();     // Catch: java.lang.Throwable -> L8
        r2.putBoolean("PREF_XMLDESIGNER_EDITMODE", r5);     // Catch: java.lang.Throwable -> L8
        r2.commit();     // Catch: java.lang.Throwable -> L8
        invalidateOptionsMenu();     // Catch: java.lang.Throwable -> L8
        this.VH.DW(r5);     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
        this.Hw.invalidate();     // Catch: java.lang.Throwable -> L8
    }

    public static boolean DW(android.content.Intent r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 982952188059374765L, null, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(982952188059374765L, null, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5.getIntExtra("EXTRA_TRAINER_ACTION", 0) != 2) goto L18;
        return true;
    L18:
        return false;
    }

    static android.widget.LinearLayout EQ(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 5348860367439485536L)
    private void EQ() {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -4301200312177752165L, this);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4301200312177752165L, this);     // Catch: java.lang.Throwable -> L27
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L27
        if (this.EQ == false) goto L13;
        java.util.Iterator<java.io.File> r3 = com.aide.uidesigner.ClassE.DW(this.tp).iterator();     // Catch: java.lang.Throwable -> L27
    L10:
        if (r3.hasNext() == false) goto L12;
        r2.add(new com.aide.uidesigner.XmlLayoutDesignActivity.a(r3.next()));     // Catch: java.lang.Throwable -> L27
        goto L10
    L12:
        r2.add(new com.aide.uidesigner.XmlLayoutDesignActivity.a(true));     // Catch: java.lang.Throwable -> L27
    L14:
        java.util.Iterator<com.aide.uidesigner.ClassS> r4 = this.VH.VH().iterator();     // Catch: java.lang.Throwable -> L27
    L16:
        if (r4.hasNext() == false) goto L18;
        r2.add(new com.aide.uidesigner.XmlLayoutDesignActivity.a(r4.next()));     // Catch: java.lang.Throwable -> L27
        goto L16
    L18:
        android.widget.ListView r5 = (android.widget.ListView) findViewById(com.aide.ui.Na.designerViewList);     // Catch: java.lang.Throwable -> L27
        com.aide.uidesigner.XmlLayoutDesignActivity.b r6 = (com.aide.uidesigner.XmlLayoutDesignActivity.b) r5.getAdapter();     // Catch: java.lang.Throwable -> L27
        if (r6 != null) goto L21;
        r5.setAdapter(new com.aide.uidesigner.XmlLayoutDesignActivity.b(this, this, r2));     // Catch: java.lang.Throwable -> L27
        return;
    L21:
        r6.clear();     // Catch: java.lang.Throwable -> L27
        java.util.Iterator r7 = r2.iterator();     // Catch: java.lang.Throwable -> L27
    L23:
        if (r7.hasNext() == false) goto L38;
        r6.add((com.aide.uidesigner.XmlLayoutDesignActivity.a) r7.next());     // Catch: java.lang.Throwable -> L27
        goto L23
    L38:
        return;
    L13:
        r2.add(new com.aide.uidesigner.XmlLayoutDesignActivity.a(new java.io.File(this.u7)));     // Catch: java.lang.Throwable -> L27
        goto L14
    }

    static java.lang.String FH(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.tp;
    }

    static java.lang.String FH(com.aide.uidesigner.XmlLayoutDesignActivity r0, java.lang.String r1) {
        r0.u7 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -4611225767320523641L)
    private void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2557315280227105200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2557315280227105200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new com.aide.common.UndoManager();     // Catch: java.lang.Throwable -> L8
        this.VH = new com.aide.uidesigner.C1906p(this, this.FH, this.u7, this.tp, this.gn);     // Catch: java.lang.Throwable -> L8
        this.VH.EQ();     // Catch: java.lang.Throwable -> L8
        this.VH.DW(gn());     // Catch: java.lang.Throwable -> L8
        invalidateOptionsMenu();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -601743210400560885L)
    private void FH(java.lang.String r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -730222573312612864L, this, r7);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-730222573312612864L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(this, "Delete Layout " + new java.io.File(r7).getName(), "Really delete this layout?", new com.aide.uidesigner.Runnableq(this, r7), null);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -4185070579887678832L)
    private void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2144504596351403857L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2144504596351403857L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(this, "New Layout", "File name:", com.aide.uidesigner.ClassE.Hw(this.tp), new com.aide.uidesigner.ClassG(this));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2217545679529319433L)
    private void Hw(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3768646549735579200L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3768646549735579200L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r2 = Zo().edit();     // Catch: java.lang.Throwable -> L8
        r2.putString("PREF_XMLDESIGNER_FILE", r5);     // Catch: java.lang.Throwable -> L8
        r2.commit();     // Catch: java.lang.Throwable -> L8
    }

    static boolean Hw(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.J0;
    }

    @abcd.Interfacesu(method = 3418299374238413203L)
    private int VH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 941876135859681792L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(941876135859681792L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (tp() == false) goto L10;
        return 2;
    L10:
        return Zo().getInt("XMLDESIGNER_VIEW", 0);
    }

    static void VH(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        r0.Hw();
    }

    @abcd.Interfacesu(method = 4960998049049120544L)
    private android.content.SharedPreferences Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4653799470037588875L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4653799470037588875L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getSharedPreferences("UIDesigner", 0);
    }

    static boolean Zo(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.EQ;
    }

    static com.aide.uidesigner.Pa gn(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = 1620170775722338785L)
    private boolean gn() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2086566987541327368L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2086566987541327368L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (tp() == false) goto L9;
        return true;
    L9:
        return Zo().getBoolean("PREF_XMLDESIGNER_EDITMODE", true);
    }

    @abcd.Interfacesu(method = -2739815803349256684L)
    private void j6(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 322216959422449251L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(322216959422449251L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.SharedPreferences.Editor r2 = Zo().edit();     // Catch: java.lang.Throwable -> L8
        r2.putInt("XMLDESIGNER_VIEW", r5);     // Catch: java.lang.Throwable -> L8
        r2.commit();     // Catch: java.lang.Throwable -> L8
        recreate();     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(android.app.Activity r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String[] r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29) {
        if (j6 == false) goto L5;
        abcd.wu.j6(6674677492620172341L, null, new java.lang.Object[]{r18, r19, r20, new java.lang.Integer(r21), r22, r23, r24, r25, r26, r27, new java.lang.Boolean(r28), new java.lang.Boolean(r29)});
    L5:
        android.content.Intent r12 = new android.content.Intent(r18, com.aide.uidesigner.XmlLayoutDesignActivity.class);
        r12.putExtra("EXTRA_FILE", r20);
        r12.putExtra("EXTRA_LANGUAGE", r19);
        r12.putExtra("EXTRA_LICENSED", false);
        r12.putExtra("EXTRA_STANDALONE", false);
        r12.putExtra("EXTRA_TRAINER", true);
        r12.putExtra("EXTRA_TRAINER_SOUND", r29);
        r12.putExtra("EXTRA_TRAINER_TASK", r24);
        r12.putExtra("EXTRA_TRAINER_TITILE", r25);
        r12.putExtra("EXTRA_TRAINER_BUTTON", r26);
        r12.putExtra("EXTRA_HEADER", r22);
        r12.putExtra("EXTRA_TRAINER_LOCALE", r23);
        r12.putExtra("EXTRA_TRAINER_SPEAK", r28);
        r12.putExtra("EXTRA_TRAINER_RUN_BUTTON", r27);
        r18.startActivityForResult(r12, r21);
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4655927776951850399L, null, r10, r11, r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4655927776951850399L, null, r10, r11, r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent(r10, com.aide.uidesigner.XmlLayoutDesignActivity.class);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_FILE", r12);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_LANGUAGE", r11);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_LICENSED", r13);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_STANDALONE", r14);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_TRAINER", false);     // Catch: java.lang.Throwable -> L7
        r10.startActivity(r0);     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.uidesigner.XmlLayoutDesignActivity r0, int r1) {
        r0.j6(r1);
    }

    static void j6(com.aide.uidesigner.XmlLayoutDesignActivity r0, com.aide.uidesigner.ClassS r1) {
        r0.j6(r1);
    }

    static void j6(com.aide.uidesigner.XmlLayoutDesignActivity r0, java.lang.String r1) {
        r0.Hw(r1);
    }

    static void j6(com.aide.uidesigner.XmlLayoutDesignActivity r0, boolean r1) {
        r0.DW(r1);
    }

    @abcd.Interfacesu(method = 1500446066029470160L)
    private void j6(com.aide.uidesigner.ClassS r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2986909770819511215L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2986909770819511215L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.L.j6(this, r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 1603590713233841349L)
    private void j6(boolean r11) {
    L53:
        th = move-exception;
        if (DW == false) goto L57;
        abcd.wu.j6(th, 4747711472338436256L, this, new java.lang.Boolean(r11));
    L57:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4747711472338436256L, this, r11);     // Catch: java.lang.Throwable -> L53
    L6:
        android.content.Intent r4 = getIntent();     // Catch: java.lang.Throwable -> L53
        android.os.Bundle r5 = r4.getExtras();     // Catch: java.lang.Throwable -> L53
        if (r5 != null) goto L9;
    L11:
        boolean r8 = false;
    L12:
        this.we = r8;     // Catch: java.lang.Throwable -> L53
        if (r5 != null) goto L15;
    L18:
        boolean r9 = true;
    L19:
        this.EQ = r9;     // Catch: java.lang.Throwable -> L53
        if (this.EQ == true) goto L22;
        this.u7 = r5.getString("EXTRA_FILE");     // Catch: java.lang.Throwable -> L53
        this.tp = new java.io.File(this.u7).getParentFile().getParentFile().getPath();     // Catch: java.lang.Throwable -> L53
        this.J0 = false;     // Catch: java.lang.Throwable -> L53
    L48:
        if (this.EQ == false) goto L51;
        if (r11 == false) goto L51;
        ((android.support.v4.widget.DrawerLayout) findViewById(com.aide.ui.Na.designerDrawer)).gn(3);     // Catch: java.lang.Throwable -> L53
    L51:
        FH();     // Catch: java.lang.Throwable -> L53
        return;
    L22:
        if (r5 != null) goto L24;
    L30:
        if (r5 == null) goto L37;
        if ("android.intent.action.SEND".equals(r4.getAction()) == false) goto L37;
        if (r5.getString("android.intent.extra.TEXT") == null) goto L37;
        this.tp = com.aide.uidesigner.ClassE.j6();     // Catch: java.lang.Throwable -> L53
        this.J0 = true;     // Catch: java.lang.Throwable -> L53
        this.u7 = com.aide.uidesigner.ClassE.j6(this.tp, com.aide.uidesigner.ClassE.Hw(this.tp), r5.getString("android.intent.extra.TEXT"));     // Catch: java.lang.Throwable -> L53
        Hw(this.u7);     // Catch: java.lang.Throwable -> L53
    L37:
        if (r4.getData() != null) goto L39;
    L41:
        this.tp = com.aide.uidesigner.ClassE.j6();     // Catch: java.lang.Throwable -> L53
        this.J0 = true;     // Catch: java.lang.Throwable -> L53
        this.u7 = v5();     // Catch: java.lang.Throwable -> L53
        if (this.u7 != null) goto L44;
    L45:
        this.u7 = com.aide.uidesigner.ClassE.j6(this.tp);     // Catch: java.lang.Throwable -> L53
        Hw(this.u7);     // Catch: java.lang.Throwable -> L53
        goto L48
    L44:
        if (new java.io.File(this.u7).exists() == true) goto L48;
    L39:
        if (r4.getData().getPath() == null) goto L41;
        this.u7 = r4.getData().getPath();     // Catch: java.lang.Throwable -> L53
        this.tp = new java.io.File(this.u7).getParentFile().getParentFile().getPath();     // Catch: java.lang.Throwable -> L53
        this.J0 = false;     // Catch: java.lang.Throwable -> L53
        goto L48
    L24:
        if ("android.intent.action.SEND".equals(r4.getAction()) == false) goto L30;
        if ((r5.get("android.intent.extra.STREAM") instanceof android.net.Uri) == false) goto L30;
        android.net.Uri r0 = (android.net.Uri) r5.get("android.intent.extra.STREAM");     // Catch: java.lang.Throwable -> L53
        this.tp = com.aide.uidesigner.ClassE.j6();     // Catch: java.lang.Throwable -> L53
        this.J0 = true;     // Catch: java.lang.Throwable -> L53
        this.u7 = com.aide.uidesigner.ClassE.j6(this.tp, com.aide.uidesigner.ClassE.j6(this, r0));     // Catch: java.lang.Throwable -> L53
        Hw(this.u7);     // Catch: java.lang.Throwable -> L53
        com.aide.uidesigner.ClassE.j6(getContentResolver().openInputStream(r0), new java.io.FileOutputStream(this.u7));     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L53
        goto L48
    L15:
        if (r5.getBoolean("EXTRA_STANDALONE", true) == true) goto L18;
        r9 = false;
        goto L19
    L9:
        if (r5.getBoolean("EXTRA_LICENSED", false) == false) goto L11;
        r8 = true;
        goto L12
    }

    public static boolean j6(android.content.Intent r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -7718219145977109L, null, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7718219145977109L, null, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        if (r5.getIntExtra("EXTRA_TRAINER_ACTION", 0) == 1) goto L19;
        return false;
    L19:
        return true;
    }

    static boolean j6(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.v5;
    }

    static java.lang.String tp(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.u7;
    }

    @abcd.Interfacesu(method = -3811695516517225743L)
    private boolean tp() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2204103601395761520L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2204103601395761520L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getIntent().getBooleanExtra("EXTRA_TRAINER", false);
    }

    @abcd.Interfacesu(method = -1295442216652418380L)
    private boolean u7() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 594429352433892185L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(594429352433892185L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (com.aide.common.ClassG.J8(this) == false) goto L11;
        if (tp() == false) goto L11;
        return true;
    L11:
        return false;
    }

    static boolean u7(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        return r0.we;
    }

    @abcd.Interfacesu(method = 1625358447267223047L)
    private java.lang.String v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3445881825537904200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3445881825537904200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return Zo().getString("PREF_XMLDESIGNER_FILE", null);
    }

    static void v5(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        r0.FH();
    }

    static void we(com.aide.uidesigner.XmlLayoutDesignActivity r0) {
        r0.EQ();
    }

    public void DW(java.lang.String r6) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1116992656810310019L, this, r6);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1116992656810310019L, this, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.EQ == false) goto L9;
        android.content.Intent r3 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L11
        r3.setData(android.net.Uri.parse("http://developer.android.google.cn/reference/" + r6));     // Catch: java.lang.Throwable -> L11
        startActivity(r3);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        com.aide.common.ClassB.j6(this, r6, "");     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = -479213952664765824L)
    protected void j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2261819999189357899L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2261819999189357899L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (getIntent().getBooleanExtra("EXTRA_TRAINER_SPEAK", false) == false) goto L10;
        this.J8 = new com.aide.common.TextToSpeechHelper(this);     // Catch: java.lang.Throwable -> L13
        this.J8.j6(getIntent().getStringExtra("EXTRA_TRAINER_LOCALE"), getIntent().getStringExtra("EXTRA_TRAINER_TASK"));     // Catch: java.lang.Throwable -> L13
    L10:
        if (getIntent().getBooleanExtra("EXTRA_TRAINER_SOUND", false) == false) goto L20;
        this.Ws = new android.media.SoundPool(1, 3, 0);     // Catch: java.lang.Throwable -> L13
        this.QX = this.Ws.load(this, com.aide.ui.Qa.task, 1);     // Catch: java.lang.Throwable -> L13
        this.Ws.play(this.QX, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L13
        return;
    }

    @abcd.Interfacesu(method = 6466911814307301349L)
    void j6(int r8, int r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -4669300708406981136L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L18:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4669300708406981136L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L14
    L6:
        if (this.EQ == true) goto L9;
        com.aide.common.ClassA.j6(this, this.u7, r8, r9);     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L23;
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: android.content.ActivityNotFoundException -> L19 java.lang.Throwable -> L14
        r0.setDataAndType(android.net.Uri.fromFile(new java.io.File(this.u7)), "application/xml");     // Catch: android.content.ActivityNotFoundException -> L19 java.lang.Throwable -> L14
        startActivity(r0);     // Catch: android.content.ActivityNotFoundException -> L19 java.lang.Throwable -> L14
        return;
    L25:
        return;
    }

    @abcd.Interfacesu(method = 3100256022261034688L)
    protected void j6(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -278986221012046405L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-278986221012046405L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        this.u7 = r5;     // Catch: java.lang.Throwable -> L11
        if (this.J0 == false) goto L9;
        Hw(this.u7);     // Catch: java.lang.Throwable -> L11
    L9:
        FH();     // Catch: java.lang.Throwable -> L11
    }

    @Override
    @abcd.Interfacesu(method = -3629933031033118461L)
    protected void onActivityResult(int r9, int r10, android.content.Intent r11) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -3973454068843531608L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3973454068843531608L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L11
    L5:
        abcd.wu.j6(this, r9, r10, r11);     // Catch: java.lang.Throwable -> L11
        if (r10 == (-1)) goto L8;
        return;
    L8:
        if (r9 != 3424345) goto L19;
        com.aide.uidesigner.ka.j6(this, r11);     // Catch: java.lang.Throwable -> L11
        return;
    }

    @Override
    public void onConfigurationChanged(android.content.res.Configuration r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -503973084807997920L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-503973084807997920L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        super.onConfigurationChanged(r5);     // Catch: java.lang.Throwable -> L11
        if (this.Zo == null) goto L9;
        this.Zo.j6(r5);     // Catch: java.lang.Throwable -> L11
    L9:
        DW();     // Catch: java.lang.Throwable -> L11
    }

    @Override
    @abcd.Interfacesu(method = -301854185837294919L)
    protected void onCreate(android.os.Bundle r17) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L44
        if (j6 == false) goto L6;
        abcd.wu.j6(343863625835381040L, this, r17);     // Catch: java.lang.Throwable -> L44
    L6:
        boolean r0 = false;
        this.v5 = false;     // Catch: java.lang.Throwable -> L44
        if (abcd.F.DW() == true) goto L9;
        abcd.F.j6(this, new com.aide.uidesigner.ClassH(this));     // Catch: java.lang.Throwable -> L44
    L9:
        com.aide.common.ClassG.j6(this, getIntent().getStringExtra("EXTRA_LANGUAGE"));     // Catch: java.lang.Throwable -> L44
        int r1 = VH();     // Catch: java.lang.Throwable -> L44
        if (r1 == 0) goto L16;
        if (r1 == 1) goto L15;
        if (r1 == 2) goto L16;
        if (r1 == 3) goto L15;
    L17:
        com.aide.common.ClassG.j6(this);     // Catch: java.lang.Throwable -> L44
        super.onCreate(r17);     // Catch: java.lang.Throwable -> L44
        setContentView(com.aide.ui.Oa.designer);     // Catch: java.lang.Throwable -> L44
        com.aide.common.ClassG.DW(this);     // Catch: java.lang.Throwable -> L44
        if (tp() == true) goto L21;
        com.aide.common.ClassG.j6(findViewById(com.aide.ui.Na.designerFrame));     // Catch: java.lang.Throwable -> L44
    L21:
        if (tp() == true) goto L23;
    L25:
        getActionBar().setDisplayHomeAsUpEnabled(true);     // Catch: java.lang.Throwable -> L44
        getActionBar().setHomeButtonEnabled(true);     // Catch: java.lang.Throwable -> L44
        if (tp() == false) goto L28;
        com.aide.common.Za.j6(getActionBar(), com.aide.ui.R$drawable.ic_launcher, getIntent().getStringArrayExtra("EXTRA_HEADER"));     // Catch: java.lang.Throwable -> L44
    L30:
        if (tp() == false) goto L35;
        android.view.View r14 = findViewById(com.aide.ui.Na.designerHeaderLearnTask);     // Catch: java.lang.Throwable -> L44
        r14.setVisibility(0);     // Catch: java.lang.Throwable -> L44
        android.widget.TextView r2 = (android.widget.TextView) r14.findViewById(com.aide.ui.Na.designerHeaderLearnTaskText);     // Catch: java.lang.Throwable -> L44
        android.widget.TextView r3 = (android.widget.TextView) r14.findViewById(com.aide.ui.Na.designerHeaderLearnTaskTitle);     // Catch: java.lang.Throwable -> L44
        android.widget.TextView r15 = (android.widget.TextView) r14.findViewById(com.aide.ui.Na.designerHeaderLearnButton);     // Catch: java.lang.Throwable -> L44
        r3.setText(getIntent().getStringExtra("EXTRA_TRAINER_TITILE"));     // Catch: java.lang.Throwable -> L44
        r2.setText(android.text.Html.fromHtml(getIntent().getStringExtra("EXTRA_TRAINER_TASK")));     // Catch: java.lang.Throwable -> L44
        r15.setText(getIntent().getStringExtra("EXTRA_TRAINER_BUTTON"));     // Catch: java.lang.Throwable -> L44
        r3.setTextSize(com.aide.common.ClassG.VH(this));     // Catch: java.lang.Throwable -> L44
        r2.setTextSize(com.aide.common.ClassG.u7(this));     // Catch: java.lang.Throwable -> L44
        r15.setTextSize(com.aide.common.ClassG.v5(this));     // Catch: java.lang.Throwable -> L44
        com.aide.uidesigner.ClassJ r7 = new com.aide.uidesigner.ClassJ(this, 0.0f, 0.0f, -(getResources().getDisplayMetrics().density * 150.0f), 0.0f, r14);     // Catch: java.lang.Throwable -> L44
        r7.setDuration(500);     // Catch: java.lang.Throwable -> L44
        r14.setVisibility(4);     // Catch: java.lang.Throwable -> L44
        findViewById(com.aide.ui.Na.designerHeaderLearnTaskInner).setOnClickListener(new com.aide.uidesigner.ViewOnClickListenerk(this));     // Catch: java.lang.Throwable -> L44
        findViewById(com.aide.ui.Na.designerHeaderLearnTaskInner).setOnFocusChangeListener(new com.aide.uidesigner.ViewOnFocusChangeListenerl(this, r15));     // Catch: java.lang.Throwable -> L44
        if (u7() == false) goto L34;
        float r4 = getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L44
        int r5 = (int) (48.0f * r4);     // Catch: java.lang.Throwable -> L44
        int r6 = (int) (r4 * 27.0f);     // Catch: java.lang.Throwable -> L44
        findViewById(com.aide.ui.Na.designerHeaderLearnTaskInner).setPadding(r5, r6, r5, 0);     // Catch: java.lang.Throwable -> L44
        findViewById(com.aide.ui.Na.designerContent).setPadding(r5, 0, r5, r6);     // Catch: java.lang.Throwable -> L44
    L34:
        r14.postDelayed(new com.aide.uidesigner.Runnablem(this, r14, r7), 500);     // Catch: java.lang.Throwable -> L44
    L36:
        this.Hw = new android.widget.LinearLayout(this);     // Catch: java.lang.Throwable -> L44
        ((android.view.ViewGroup) findViewById(com.aide.ui.Na.designerContent)).addView(this.Hw);     // Catch: java.lang.Throwable -> L44
        this.Hw.setClipChildren(false);     // Catch: java.lang.Throwable -> L44
        this.Hw.setGravity(17);     // Catch: java.lang.Throwable -> L44
        this.FH = new android.widget.LinearLayout(this);     // Catch: java.lang.Throwable -> L44
        this.Hw.addView(this.FH);     // Catch: java.lang.Throwable -> L44
        this.FH.setClipChildren(false);     // Catch: java.lang.Throwable -> L44
        this.FH.setGravity(17);     // Catch: java.lang.Throwable -> L44
        ((android.widget.ListView) findViewById(com.aide.ui.Na.designerViewList)).setOnItemClickListener(new com.aide.uidesigner.C1902n(this));     // Catch: java.lang.Throwable -> L44
        if (r17 != null) goto L39;
        r0 = true;
    L39:
        j6(r0);     // Catch: java.lang.Throwable -> L44
        if (r17 == null) goto L42;
        this.gn.j6(r17);     // Catch: java.lang.Throwable -> L44
    L42:
        DW();     // Catch: java.lang.Throwable -> L44
        this.v5 = true;     // Catch: java.lang.Throwable -> L44
        return;
    L35:
        findViewById(com.aide.ui.Na.designerHeaderLearnTask).setVisibility(8);     // Catch: java.lang.Throwable -> L44
        goto L36
    L28:
        getActionBar().setDisplayShowTitleEnabled(false);     // Catch: java.lang.Throwable -> L44
        getActionBar().setNavigationMode(1);     // Catch: java.lang.Throwable -> L44
        getActionBar().setListNavigationCallbacks(new android.widget.ArrayAdapter(this, 17367049, new java.lang.String[]{"Light Theme Small", "Dark Theme Small", "Light Theme", "Dark Theme"}), new com.aide.uidesigner.ClassI(this));     // Catch: java.lang.Throwable -> L44
        getActionBar().setSelectedNavigationItem(VH());     // Catch: java.lang.Throwable -> L44
        android.support.v4.widget.DrawerLayout r8 = (android.support.v4.widget.DrawerLayout) findViewById(com.aide.ui.Na.designerDrawer);     // Catch: java.lang.Throwable -> L44
        this.Zo = new android.support.v4.app.C1621a(this, r8, com.aide.ui.R$drawable.ic_drawer, 17039370, 17039370);     // Catch: java.lang.Throwable -> L44
        r8.setDrawerListener(this.Zo);     // Catch: java.lang.Throwable -> L44
        goto L30
    L23:
        if (com.aide.common.ClassG.J8(this) == false) goto L25;
        getActionBar().hide();     // Catch: java.lang.Throwable -> L44
    L15:
        com.b.dark(this, com.aide.ui.Sa.ActivityThemeDesignerDark);     // Catch: java.lang.Throwable -> L44
    L16:
        com.b.light(this, com.aide.ui.Sa.ActivityThemeDesignerLight);     // Catch: java.lang.Throwable -> L44
    L44:
        th = move-exception;
        if (DW == false) goto L48;
        abcd.wu.j6(th, 343863625835381040L, this, r17);
    L48:
        throw th;
    }

    @Override
    @abcd.Interfacesu(method = -1566542784329733100L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1083749354085402675L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1083749354085402675L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 1558005764010364404L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1558005764010364404L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        getMenuInflater().inflate(com.aide.ui.Pa.designer_options_menu, r5);     // Catch: java.lang.Throwable -> L9
        return true;
    }

    @Override
    @abcd.Interfacesu(method = 2636488433289278799L)
    protected void onDestroy() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3941399178897184680L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3941399178897184680L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        super.onDestroy();     // Catch: java.lang.Throwable -> L12
        if (this.gn != null) goto L9;
        return;
    L9:
        if (this.VH == null) goto L20;
        this.gn.DW(this.VH);     // Catch: java.lang.Throwable -> L12
        return;
    }

    @Override
    public boolean onMenuItemSelected(int r8, android.view.MenuItem r9) {
    L38:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, 579721820562543825L, this, new java.lang.Integer(r8), r9);
    L42:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(579721820562543825L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L38
    L6:
        if (this.Zo == null) goto L11;
        if (this.Zo.j6(r9) == false) goto L11;
        return true;
    L11:
        if (r9.getItemId() != 16908332) goto L14;
        finish();     // Catch: java.lang.Throwable -> L38
    L37:
        return false;
    L14:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuRun) goto L17;
        abcd.F.j6("UI Designer Menu: Run");     // Catch: java.lang.Throwable -> L38
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L38
        r0.putExtra("EXTRA_TRAINER_ACTION", 2);     // Catch: java.lang.Throwable -> L38
        setResult(-1, r0);     // Catch: java.lang.Throwable -> L38
        finish();     // Catch: java.lang.Throwable -> L38
        goto L37
    L17:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuShowBorders) goto L20;
        abcd.F.j6("UI Designer Menu: Edit mode");     // Catch: java.lang.Throwable -> L38
        DW(true);     // Catch: java.lang.Throwable -> L38
        goto L37
    L20:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuHideBorders) goto L23;
        abcd.F.j6("UI Designer Menu: Preview mode");     // Catch: java.lang.Throwable -> L38
        DW(false);     // Catch: java.lang.Throwable -> L38
        goto L37
    L23:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuUndo) goto L26;
        abcd.F.j6("UI Designer Menu: Undo");     // Catch: java.lang.Throwable -> L38
        this.gn.Hw();     // Catch: java.lang.Throwable -> L38
        goto L37
    L26:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuRedo) goto L29;
        abcd.F.j6("UI Designer Menu: Redo");     // Catch: java.lang.Throwable -> L38
        this.gn.FH();     // Catch: java.lang.Throwable -> L38
        goto L37
    L29:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuPaste) goto L32;
        abcd.F.j6("UI Designer Menu: Paste");     // Catch: java.lang.Throwable -> L38
        this.VH.J8();     // Catch: java.lang.Throwable -> L38
        goto L37
    L32:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuCopy) goto L35;
        abcd.F.j6("UI Designer Menu: Copy");     // Catch: java.lang.Throwable -> L38
        this.VH.FH();     // Catch: java.lang.Throwable -> L38
        goto L37
    L35:
        if (r9.getItemId() != com.aide.ui.Na.designerMenuShare) goto L37;
        abcd.F.j6("UI Designer Menu: Share");     // Catch: java.lang.Throwable -> L38
        this.VH.Ws();     // Catch: java.lang.Throwable -> L38
        goto L37
    }

    @Override
    public void onNewIntent(android.content.Intent r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2646735273978184600L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2646735273978184600L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        abcd.wu.j6(this, r5);     // Catch: java.lang.Throwable -> L10
        super.onNewIntent(r5);     // Catch: java.lang.Throwable -> L10
        setIntent(r5);     // Catch: java.lang.Throwable -> L10
        if ((r5.getFlags() & 1048576) != 0) goto L17;
        j6(false);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1325171931558528711L)
    protected void onPostCreate(android.os.Bundle r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -3115384343603133000L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3115384343603133000L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onPostCreate(r5);     // Catch: java.lang.Throwable -> L10
        if (this.Zo == null) goto L17;
        this.Zo.j6();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    public boolean onPrepareOptionsMenu(android.view.Menu r7) {
    L43:
        th = move-exception;
        if (DW == false) goto L47;
        abcd.wu.j6(th, 766139218176781215L, this, r7);
    L47:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(766139218176781215L, this, r7);     // Catch: java.lang.Throwable -> L43
    L6:
        super.onPrepareOptionsMenu(r7);     // Catch: java.lang.Throwable -> L43
        r7.findItem(com.aide.ui.Na.designerMenuRun).setVisible(tp());     // Catch: java.lang.Throwable -> L43
        r7.findItem(com.aide.ui.Na.designerMenuRun).setTitle(getIntent().getStringExtra("EXTRA_TRAINER_RUN_BUTTON"));     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r2 = r7.findItem(com.aide.ui.Na.designerMenuHideBorders);     // Catch: java.lang.Throwable -> L43
        boolean r4 = false;
        if (tp() == false) goto L9;
    L11:
        boolean r3 = false;
    L12:
        r2.setVisible(r3);     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r5 = r7.findItem(com.aide.ui.Na.designerMenuShowBorders);     // Catch: java.lang.Throwable -> L43
        if (tp() == false) goto L15;
    L17:
        boolean r6 = false;
    L18:
        r5.setVisible(r6);     // Catch: java.lang.Throwable -> L43
        r7.findItem(com.aide.ui.Na.designerMenuUndo).setEnabled(this.gn.DW());     // Catch: java.lang.Throwable -> L43
        r7.findItem(com.aide.ui.Na.designerMenuRedo).setEnabled(this.gn.j6());     // Catch: java.lang.Throwable -> L43
        r7.findItem(com.aide.ui.Na.designerMenuPaste).setEnabled(this.VH.j6());     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r8 = r7.findItem(com.aide.ui.Na.designerMenuPaste);     // Catch: java.lang.Throwable -> L43
        if (tp() == true) goto L21;
        boolean r9 = true;
    L22:
        r8.setVisible(r9);     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r10 = r7.findItem(com.aide.ui.Na.designerMenuCopy);     // Catch: java.lang.Throwable -> L43
        if (this.we == false) goto L25;
    L27:
        boolean r11 = false;
    L28:
        r10.setEnabled(r11);     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r12 = r7.findItem(com.aide.ui.Na.designerMenuCopy);     // Catch: java.lang.Throwable -> L43
        if (tp() == true) goto L31;
        boolean r13 = true;
    L32:
        r12.setVisible(r13);     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r14 = r7.findItem(com.aide.ui.Na.designerMenuShare);     // Catch: java.lang.Throwable -> L43
        if (this.we == false) goto L35;
    L37:
        boolean r15 = false;
    L38:
        r14.setEnabled(r15);     // Catch: java.lang.Throwable -> L43
        android.view.MenuItem r16 = r7.findItem(com.aide.ui.Na.designerMenuShare);     // Catch: java.lang.Throwable -> L43
        if (tp() == true) goto L41;
        r4 = true;
    L41:
        r16.setVisible(r4);     // Catch: java.lang.Throwable -> L43
        return true;
    L35:
        if (this.VH.gn().length() <= 0) goto L37;
        r15 = true;
        goto L38
    L31:
        r13 = false;
        goto L32
    L25:
        if (this.VH.gn().length() <= 0) goto L27;
        r11 = true;
        goto L28
    L21:
        r9 = false;
        goto L22
    L15:
        if (gn() == true) goto L17;
        r6 = true;
        goto L18
    L9:
        if (gn() == false) goto L11;
        r3 = true;
        goto L12
    }

    @Override
    @abcd.Interfacesu(method = -248554044617252616L)
    protected void onSaveInstanceState(android.os.Bundle r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1860774887918352761L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1860774887918352761L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        super.onSaveInstanceState(r5);     // Catch: java.lang.Throwable -> L10
        if (this.gn == null) goto L17;
        this.gn.DW(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1879237792138112021L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3376680340583093256L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3376680340583093256L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "Android UI Designer");     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -1769010584960722785L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1721432164350374988L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1721432164350374988L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "Android UI Designer");     // Catch: java.lang.Throwable -> L8
    }
}
