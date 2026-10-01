package com.aide.ui;

@abcd.Interfacexu
public class Wa implements android.widget.TextView.OnEditorActionListener, android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2856654799166001724L)
    private com.aide.ui.MainActivity FH;

    @abcd.Interfaceru(field = -873728695165267460L)
    private com.aide.ui.Wa.a Hw;

    @abcd.Interfacexu
    private static final enum a extends java.lang.Enum<com.aide.ui.Wa.a> {

        @abcd.Interfaceru(field = 979718225046031252L)
        public static final com.aide.ui.Wa.a DW = null;
        private static final com.aide.ui.Wa.a[] FH = null;

        @abcd.Interfacetu
        private static boolean Hw;

        @abcd.Interfaceru(field = 321872534947219456L)
        public static final com.aide.ui.Wa.a j6 = null;

        @abcd.Interfaceuu
        private static boolean v5;

        static {
            abcd.wu.j6(com.aide.ui.Wa.a.class, -611917518981659772L, -611917518981659772L);     // Catch: java.lang.Throwable -> L8
            if (Hw == false) goto L6;
            abcd.wu.j6(650004198289303536L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.ui.Wa.a("SearchText", 0);     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.ui.Wa.a("GotoLine", 1);     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.ui.Wa.a[]{j6, DW};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (v5 == false) goto L12;
            abcd.wu.j6(th, 650004198289303536L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = 4835669440747304653L)
        private a(java.lang.String r8, int r9) {
        L7:
            th = move-exception;
            if (v5 == false) goto L11;
            abcd.wu.j6(th, -1610697626669369072L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (Hw == false) goto L5;
            abcd.wu.j6(-1610697626669369072L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -589479185567369004L)
        public static com.aide.ui.Wa.a valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (v5 == false) goto L12;
            abcd.wu.j6(th, 312068642041344164L, null, r5);
        L12:
            throw th;
        L4:
            if (Hw == false) goto L6;
            abcd.wu.j6(312068642041344164L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.ui.Wa.a) java.lang.Enum.valueOf(com.aide.ui.Wa.a.class, r5);
        }

        @abcd.Interfacesu(method = 1448844711171726224L)
        public static com.aide.ui.Wa.a[] values() {
        L8:
            th = move-exception;
            if (v5 == false) goto L12;
            abcd.wu.j6(th, -731096026613321408L, null);
        L12:
            throw th;
        L4:
            if (Hw == false) goto L6;
            abcd.wu.j6(-731096026613321408L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.ui.Wa.a[]) FH.clone();
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.Wa.class, -2007863676330719029L, -2007863676330719029L);
    }

    public Wa(com.aide.ui.MainActivity r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2676664242965614655L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2676664242965614655L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 908772998941528865L)
    private android.widget.EditText VH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1051988327678915607L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1051988327678915607L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.EditText) this.FH.findViewById(com.almlkaide.kaypro.R.id.mainSearchBox);
    }

    @abcd.Interfacesu(method = -1172976542416807328L)
    private android.widget.TextView Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2347757156696269632L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2347757156696269632L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.TextView) this.FH.findViewById(com.almlkaide.kaypro.R.id.mainSearchLabel);
    }

    @abcd.Interfacesu(method = -2718220835833240407L)
    private java.lang.String gn() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3504126648477615027L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3504126648477615027L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return VH().getText().toString().trim();
    }

    static com.aide.ui.MainActivity j6(com.aide.ui.Wa r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 5624431811808888969L)
    private void j6(com.aide.ui.Wa.a r9) {
    L27:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, -2356194826711060039L, this, r9);
    L31:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2356194826711060039L, this, r9);     // Catch: java.lang.Throwable -> L27
    L6:
        this.Hw = r9;     // Catch: java.lang.Throwable -> L27
        v5().setVisibility(0);     // Catch: java.lang.Throwable -> L27
        android.widget.TextView r2 = Zo();     // Catch: java.lang.Throwable -> L27
        int r3 = com.aide.ui.Va.j6[r9.ordinal()];     // Catch: java.lang.Throwable -> L27
        if (r3 == 1) goto L11;
        if (r3 != 2) goto L12;
        r2.setText("Search:");     // Catch: java.lang.Throwable -> L27
    L12:
        android.widget.EditText r4 = VH();     // Catch: java.lang.Throwable -> L27
        int r5 = com.aide.ui.Va.j6[r9.ordinal()];     // Catch: java.lang.Throwable -> L27
        if (r5 == 1) goto L18;
        if (r5 != 2) goto L19;
        r4.setText("");     // Catch: java.lang.Throwable -> L27
    L19:
        r4.requestFocus();     // Catch: java.lang.Throwable -> L27
        r4.selectAll();     // Catch: java.lang.Throwable -> L27
        int r6 = com.aide.ui.Va.j6[r9.ordinal()];     // Catch: java.lang.Throwable -> L27
        if (r6 == 1) goto L24;
        if (r6 != 2) goto L25;
        r4.setImeOptions(268435461);     // Catch: java.lang.Throwable -> L27
        r4.setInputType(145);     // Catch: java.lang.Throwable -> L27
    L25:
        r4.setOnEditorActionListener(this);     // Catch: java.lang.Throwable -> L27
        r4.removeTextChangedListener(this);     // Catch: java.lang.Throwable -> L27
        r4.addTextChangedListener(this);     // Catch: java.lang.Throwable -> L27
        r4.postDelayed(new com.aide.ui.Ua(this, r4), 100);     // Catch: java.lang.Throwable -> L27
        return;
    L24:
        r4.setImeOptions(268435456);     // Catch: java.lang.Throwable -> L27
        r4.setInputType(2);     // Catch: java.lang.Throwable -> L27
        goto L25
    L18:
        r4.setText(this.FH.J8().getCurrentFileSpan().Hw + "");     // Catch: java.lang.Throwable -> L27
        goto L19
    L11:
        r2.setText("Line:");     // Catch: java.lang.Throwable -> L27
        goto L12
    }

    @abcd.Interfacesu(method = -550558580243829861L)
    private android.view.View v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1629885294752293521L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1629885294752293521L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.findViewById(com.almlkaide.kaypro.R.id.mainSearchBarNoTabs);
    }

    public boolean DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1471703476885190928L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1471703476885190928L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (v5().getVisibility() != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4816076190168786375L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4816076190168786375L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(com.aide.ui.Wa.a.DW);     // Catch: java.lang.Throwable -> L8
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2176621492821851544L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2176621492821851544L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(com.aide.ui.Wa.a.j6);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void afterTextChanged(android.text.Editable r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 4899151677048121605L, this, r6);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4899151677048121605L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = com.aide.ui.Va.j6[this.Hw.ordinal()];     // Catch: java.lang.Throwable -> L15
        if (r2 != 1) goto L9;
        int r3 = java.lang.Integer.parseInt(gn());     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L15
        this.FH.J8().j6(r3, 1, r3, 1);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L15
        return;
    L26:
        return;
    L9:
        if (r2 != 2) goto L24;
        this.FH.J8().j6(1, 1, gn());     // Catch: java.lang.Throwable -> L15
        return;
    }

    @Override
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -2604237186746708576L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-2604237186746708576L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1812646537608449744L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1812646537608449744L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        v5().setVisibility(8);     // Catch: java.lang.Throwable -> L8
        this.FH.J8().we();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -24074650895163640L, this, r9, new java.lang.Integer(r10), r11);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-24074650895163640L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L19
    L6:
        if (r11 != null) goto L8;
    L9:
        int r1 = com.aide.ui.Va.j6[this.Hw.ordinal()];     // Catch: java.lang.Throwable -> L19
        if (r1 != 1) goto L12;
        j6();     // Catch: java.lang.Throwable -> L19
    L18:
        return true;
    L12:
        if (r1 != 2) goto L18;
        com.aide.ui.AIDEEditorPager r2 = this.FH.J8();     // Catch: java.lang.Throwable -> L19
        abcd.Tl r3 = r2.getCurrentFileSpan();     // Catch: java.lang.Throwable -> L19
        if (r2.j6(r3.Hw, r3.v5 + 1, gn()) == true) goto L18;
        this.FH.J8().j6(1, 1, gn());     // Catch: java.lang.Throwable -> L19
        goto L18
    L8:
        if (r11.getAction() != 0) goto L18;
        goto L9
    }

    @Override
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 6441842211837994332L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(6441842211837994332L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
