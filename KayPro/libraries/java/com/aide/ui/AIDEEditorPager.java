package com.aide.ui;

@abcd.Interfacexu
public class AIDEEditorPager extends android.support.v4.view.ViewPager implements abcd.Nk.b {

    @abcd.Interfaceuu
    private static boolean CU;

    @abcd.Interfacetu
    private static boolean et;

    @abcd.Interfaceru(field = 4110765797799949155L)
    private boolean Eq;

    @abcd.Interfaceru(field = 62378907484387941L)
    private com.aide.ui.Z FN;

    @abcd.Interfaceru(field = -2827123451527359705L)
    private java.util.List<android.view.View> Xa;

    @abcd.Interfaceru(field = 1942339783957629808L)
    private boolean aq;

    @abcd.Interfaceru(field = -3745113740630994609L)
    private com.aide.ui.AIDEEditorPager.b hz;

    @abcd.Interfaceru(field = -186450538640107392L)
    private com.aide.ui.Z jO;

    @abcd.Interfacexu
    private class a extends android.support.v4.view.o {

        @abcd.Interfacetu
        private static boolean FH;

        @abcd.Interfaceuu
        private static boolean Hw;

        @abcd.Interfacevu
        final com.aide.ui.AIDEEditorPager Zo;

        @abcd.Interfaceru(field = 1734308432541792000L)
        private int v5;

        static {
            abcd.wu.j6(com.aide.ui.AIDEEditorPager.a.class, 32783461666032959L, 32783461666032959L);
        }

        @abcd.Interfacesu(method = -435585985877999616L)
        private a(com.aide.ui.AIDEEditorPager r6) {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, 7764045007650786648L, null, r6);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(7764045007650786648L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Zo = r6;     // Catch: java.lang.Throwable -> L8
            this.v5 = -1;     // Catch: java.lang.Throwable -> L8
        }

        a(com.aide.ui.AIDEEditorPager r8, com.aide.ui.I r9) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -2310187377818858000L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-2310187377818858000L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1731899642332452200L)
        public void DW(android.view.ViewGroup r5) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -1931214750316077600L, this, r5);
        L11:
            throw th;
        L4:
            if (FH == false) goto L14;
            abcd.wu.j6(-1931214750316077600L, this, r5);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        @abcd.Interfacesu(method = -169537386689274492L)
        public void DW(android.view.ViewGroup r9, int r10, java.lang.Object r11) {
        L9:
            th = move-exception;
            if (Hw == false) goto L13;
            abcd.wu.j6(th, -409663537831745400L, this, r9, new java.lang.Integer(r10), r11);
        L13:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-409663537831745400L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
        L5:
            super.DW(r9, r10, r11);     // Catch: java.lang.Throwable -> L9
            if (this.v5 == r10) goto L16;
            this.v5 = r10;     // Catch: java.lang.Throwable -> L9
            com.aide.ui.AIDEEditorPager.j6(this.Zo).FH(r10);     // Catch: java.lang.Throwable -> L9
            this.Zo.J0();     // Catch: java.lang.Throwable -> L9
            com.aide.ui.AIDEEditorPager.FH(this.Zo);     // Catch: java.lang.Throwable -> L9
            return;
        }

        @Override
        @abcd.Interfacesu(method = -389485419121463148L)
        public android.os.Parcelable FH() {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, 1416795068786350000L, this);
        L12:
            throw th;
        L4:
            if (FH == false) goto L15;
            abcd.wu.j6(1416795068786350000L, this);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        @abcd.Interfacesu(method = 3150305639815453849L)
        public int j6() {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, 281679459614279595L, this);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(281679459614279595L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return com.aide.ui.AIDEEditorPager.DW(this.Zo).size();
        }

        @Override
        @abcd.Interfacesu(method = 5324982504951635225L)
        public int j6(java.lang.Object r5) {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -4792400459250777373L, this, r5);
        L12:
            throw th;
        L4:
            if (FH == false) goto L15;
            abcd.wu.j6(-4792400459250777373L, this, r5);     // Catch: java.lang.Throwable -> L8
            return -2;
        L15:
            return -2;
        }

        @Override
        @abcd.Interfacesu(method = -3234117411395396361L)
        public java.lang.Object j6(android.view.ViewGroup r8, int r9) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -5635023214831935419L, this, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-5635023214831935419L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            android.view.View r0 = (android.view.View) com.aide.ui.AIDEEditorPager.DW(this.Zo).get(r9);     // Catch: java.lang.Throwable -> L7
            r8.addView(r0, 0);     // Catch: java.lang.Throwable -> L7
            return r0;
        }

        @Override
        @abcd.Interfacesu(method = 2100574655861808035L)
        public void j6(android.os.Parcelable r8, java.lang.ClassLoader r9) {
        L6:
            th = move-exception;
            if (Hw == false) goto L10;
            abcd.wu.j6(th, 3015344875449318185L, this, r8, r9);
        L10:
            throw th;
        L3:
            if (FH == false) goto L13;
            abcd.wu.j6(3015344875449318185L, this, r8, r9);     // Catch: java.lang.Throwable -> L6
            return;
        }

        @Override
        @abcd.Interfacesu(method = 12345882910875371L)
        public void j6(android.view.ViewGroup r5) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, 2075053557139822105L, this, r5);
        L11:
            throw th;
        L4:
            if (FH == false) goto L14;
            abcd.wu.j6(2075053557139822105L, this, r5);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        @abcd.Interfacesu(method = 180947580669192288L)
        public void j6(android.view.ViewGroup r9, int r10, java.lang.Object r11) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, 93013581847579968L, this, r9, new java.lang.Integer(r10), r11);
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(93013581847579968L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
        L5:
            r9.removeView((android.view.View) r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1599161336885820960L)
        public boolean j6(android.view.View r8, java.lang.Object r9) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -1070268061041679192L, this, r8, r9);
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-1070268061041679192L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            return r8.equals(r9);
        }
    }

    public interface b {
        void DW(boolean r1);

        void j6(boolean r1);
    }

    static {
        abcd.wu.j6(com.aide.ui.AIDEEditorPager.class, -3968052299060732145L, -3968052299060732145L);
    }

    public AIDEEditorPager(android.content.Context r6) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -2327530196293463352L, null, r6);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-2327530196293463352L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        this.Xa = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        vy();     // Catch: java.lang.Throwable -> L8
    }

    public AIDEEditorPager(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (CU == false) goto L11;
        abcd.wu.j6(th, 2325282957063932451L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (et == false) goto L5;
        abcd.wu.j6(2325282957063932451L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.Xa = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L7
        vy();     // Catch: java.lang.Throwable -> L7
    }

    static java.util.List DW(com.aide.ui.AIDEEditorPager r0) {
        return r0.Xa;
    }

    static void FH(com.aide.ui.AIDEEditorPager r0) {
        r0.P8();
    }

    static boolean Hw(com.aide.ui.AIDEEditorPager r0) {
        return r0.aq;
    }

    @abcd.Interfacesu(method = -725214844213758433L)
    private void P8() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -5838888106998695628L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-5838888106998695628L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        postDelayed(new com.aide.ui.J(this), 50);     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.ui.AIDEEditor Zo(com.aide.ui.AIDEEditorPager r0) {
        return r0.getCurrentEditor();
    }

    @abcd.Interfacesu(method = -2847929895977267580L)
    private com.aide.ui.MainActivity getActivity() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -4455515549936592835L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-4455515549936592835L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.MainActivity) getContext();
    }

    @abcd.Interfacesu(method = -2291175875694898539L)
    private com.aide.ui.AIDEEditor getCurrentEditor() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, 5525922798284042128L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(5525922798284042128L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        int r2 = getCurrentItem();     // Catch: java.lang.Throwable -> L12
        if (r2 >= 0) goto L10;
        return null;
    L10:
        return v5(r2);
    }

    @abcd.Interfacesu(method = -3739317940005358299L)
    private java.util.List<com.aide.ui.AIDEEditor> getEditors() {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 1110780279051436880L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(1110780279051436880L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
        int r3 = 0;
    L7:
        if (r3 >= this.Xa.size()) goto L11;
        r2.add(v5(r3));     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;
        goto L7
    L11:
        return r2;
    }

    static com.aide.ui.MainActivity j6(com.aide.ui.AIDEEditorPager r0) {
        return r0.getActivity();
    }

    @abcd.Interfacesu(method = 1119496026323642780L)
    private void setVisible(boolean r8) {
    L20:
        th = move-exception;
        if (CU == false) goto L24;
        abcd.wu.j6(th, 681408503601796425L, this, new java.lang.Boolean(r8));
    L24:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(681408503601796425L, this, r8);     // Catch: java.lang.Throwable -> L20
    L6:
        android.view.View r2 = getRootView();     // Catch: java.lang.Throwable -> L20
        if (r2 == null) goto L27;
        android.view.View r3 = r2.findViewById(com.almlkaide.kaypro.R.id.mainCodePageView);     // Catch: java.lang.Throwable -> L20
        int r4 = 0;
        if (r3 == null) goto L14;
        if (r8 == false) goto L12;
        int r6 = 0;
    L13:
        r3.setVisibility(r6);     // Catch: java.lang.Throwable -> L20
        goto L14
    L12:
        r6 = 4;
    L14:
        android.view.View r5 = r2.findViewById(com.almlkaide.kaypro.R.id.mainCodeEmptyView);     // Catch: java.lang.Throwable -> L20
        if (r5 == null) goto L28;
        if (r8 == false) goto L18;
        r4 = 4;
    L18:
        r5.setVisibility(r4);     // Catch: java.lang.Throwable -> L20
        return;
    L28:
        return;
    }

    @abcd.Interfacesu(method = 1266192317842681600L)
    private int v5(java.lang.String r5) {
    L15:
        th = move-exception;
        if (CU == false) goto L20;
        abcd.wu.j6(th, 516864804174630681L, this, r5);
    L20:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(516864804174630681L, this, r5);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = 0;
    L7:
        if (r2 >= this.Xa.size()) goto L13;
        if (v5(r2).getFilePath().equals(r5) == true) goto L11;
        r2 = r2 + 1;
        goto L7
    L11:
        return r2;
    L13:
        return -1;
    }

    @abcd.Interfacesu(method = 2048619140906672037L)
    private com.aide.ui.AIDEEditor v5(int r5) {
    L13:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, -508718026962789640L, this, new java.lang.Integer(r5));
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-508718026962789640L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r5 >= 0) goto L8;
        return null;
    L8:
        if (r5 >= this.Xa.size()) goto L20;
        return (com.aide.ui.AIDEEditor) this.Xa.get(r5).findViewById(com.almlkaide.kaypro.R.id.editorCodeEditor);
    L20:
        return null;
    }

    static com.aide.ui.AIDEEditorPager.b v5(com.aide.ui.AIDEEditorPager r0) {
        return r0.hz;
    }

    @abcd.Interfacesu(method = 1670636860199870979L)
    private void vy() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -49468382738060160L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L16;
        abcd.wu.j6(-49468382738060160L, this);     // Catch: java.lang.Throwable -> L10
    L16:
        java.lang.reflect.Field r3 = getClass().getSuperclass().getDeclaredField("mTouchSlop");     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L10
        r3.setAccessible(true);     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L10
        r3.setInt(this, 10);     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L10
    L8:
        com.aide.ui.U.er().j6(this);     // Catch: java.lang.Throwable -> L10
        setAdapter(new com.aide.ui.AIDEEditorPager.a(this, null));     // Catch: java.lang.Throwable -> L10
        setVisible(false);     // Catch: java.lang.Throwable -> L10
        setPageMargin(1);     // Catch: java.lang.Throwable -> L10
        android.content.res.TypedArray r2 = getContext().obtainStyledAttributes(new int[]{com.almlkaide.kaypro.R.attr.color_page_separator});     // Catch: java.lang.Throwable -> L10
        int r4 = r2.getColor(0, -1);     // Catch: java.lang.Throwable -> L10
        r2.recycle();     // Catch: java.lang.Throwable -> L10
        setPageMarginDrawable(new android.graphics.drawable.ColorDrawable(r4));     // Catch: java.lang.Throwable -> L10
        this.FN = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.editor_context_menu);     // Catch: java.lang.Throwable -> L10
        this.jO = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.editor_small_context_menu);     // Catch: java.lang.Throwable -> L10
    }

    public void BT() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -35821069183976632L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-35821069183976632L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().U2();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public com.aide.engine.SyntaxError DW(int r8, int r9) {
    L11:
        th = move-exception;
        if (CU == false) goto L15;
        abcd.wu.j6(th, -1405419191101373240L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (et == false) goto L6;
        abcd.wu.j6(-1405419191101373240L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L11
    L6:
        if (getCurrentEditor() == null) goto L9;
        return getCurrentEditor().VH(r8, r9);
    L9:
        return null;
    }

    public void DW(android.graphics.Rect r6) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, 4251233344251637540L, this, r6);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(4251233344251637540L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.jO.j6(com.aide.ui.U.lg().j6(r6), false);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void DW(java.lang.String r5) {
    L13:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, -1400278428347051728L, this, r5);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-1400278428347051728L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        int r2 = v5(r5);     // Catch: java.lang.Throwable -> L13
        if (r2 < 0) goto L20;
        v5(r2).vy();     // Catch: java.lang.Throwable -> L13
        this.Xa.remove(r2);     // Catch: java.lang.Throwable -> L13
        getAdapter().DW();     // Catch: java.lang.Throwable -> L13
        if (this.Xa.size() != 0) goto L11;
        setVisible(false);     // Catch: java.lang.Throwable -> L13
    L11:
        getActivity().DW(r2);     // Catch: java.lang.Throwable -> L13
        P8();     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void EQ() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 780224998977217513L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(780224998977217513L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().er();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    public abcd.Nk.a FH(java.lang.String r7) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -809262280428190280L, this, r7);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-809262280428190280L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.editor, null);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.AIDEEditor r3 = (com.aide.ui.AIDEEditor) r2.findViewById(com.almlkaide.kaypro.R.id.editorCodeEditor);     // Catch: java.lang.Throwable -> L8
        r3.setIdentifierClickingEnabled(this.Eq);     // Catch: java.lang.Throwable -> L8
        abcd.Nk.a r4 = r3.DW(r7);     // Catch: java.lang.Throwable -> L8
        setVisible(true);     // Catch: java.lang.Throwable -> L8
        getActivity().DW(r7);     // Catch: java.lang.Throwable -> L8
        P8();     // Catch: java.lang.Throwable -> L8
        this.Xa.add(r2);     // Catch: java.lang.Throwable -> L8
        getAdapter().DW();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.j6().j6((android.view.ViewGroup) r2.findViewById(com.almlkaide.kaypro.R.id.editorAdView));     // Catch: java.lang.Throwable -> L8
        return r4;
    }

    public void Hw(int r5) {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -540574527668917748L, this, new java.lang.Integer(r5));
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-540574527668917748L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().v5(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean Hw(java.lang.String r7) {
    L17:
        th = move-exception;
        if (CU == false) goto L22;
        abcd.wu.j6(th, -817482676079940175L, this, r7);
    L22:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-817482676079940175L, this, r7);     // Catch: java.lang.Throwable -> L17
    L7:
        if (isInTouchMode() == true) goto L9;
        return false;
    L9:
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = getFileEditors().iterator();     // Catch: java.lang.Throwable -> L17
    L11:
        if (r2.hasNext() == false) goto L16;
        com.aide.ui.AIDEEditor r4 = r2.next();     // Catch: java.lang.Throwable -> L17
        if (r4.getFilePath().equals(r7) == false) goto L11;
        return r4.BT();
    L16:
        return false;
    }

    public void J0() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -1015538955786159961L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-1015538955786159961L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FN.j6();     // Catch: java.lang.Throwable -> L8
    }

    public void J8() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -5194196322130619073L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-5194196322130619073L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().yS();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void Mr() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 6384961641449778976L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(6384961641449778976L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().P8();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean QX() {
    L13:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 1658251684764146059L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(1658251684764146059L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (getCurrentEditor() == null) goto L11;
        if (getCurrentEditor().J8() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public void U2() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 1014759006384677232L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(1014759006384677232L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().ei();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void VH() {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 2293961989768193472L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(2293961989768193472L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = getEditors().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().lg();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public boolean Ws() {
    L14:
        th = move-exception;
        if (CU == false) goto L18;
        abcd.wu.j6(th, 4160120989318578856L, this);
    L18:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(4160120989318578856L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (getCurrentEditor() != null) goto L9;
        return false;
    L9:
        if (this.aq == false) goto L22;
        if (com.aide.ui.U.lg().BT() == true) goto L23;
        return true;
    L23:
        return false;
    L22:
        return false;
    }

    public boolean XL() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -379449575989442992L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-379449575989442992L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.aq;
    }

    public void Zo() {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 2644577955547819992L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(2644577955547819992L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = getEditors().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().a8();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public void a8() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 3332296791282577503L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(3332296791282577503L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().nw();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean aM() {
    L13:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 2048632136247108465L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(2048632136247108465L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (getCurrentEditor() == null) goto L11;
        if (getCurrentEditor().Ws() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public void er() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -649726320705564440L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-649726320705564440L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FN.DW();     // Catch: java.lang.Throwable -> L8
    }

    public void gW() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -1916459344037069000L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-1916459344037069000L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().ro();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public java.util.List<abcd.InterfaceWl> getBasicEditorCommands() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -3972918752254847731L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-3972918752254847731L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.AIDEEditor(getContext()).getBasicEditorCommands();
    }

    public int getCurrentFileLineCount() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, -225860294565125472L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-225860294565125472L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getCurrentEditor() == null) goto L10;
        return getCurrentEditor().getLineCount();
    L10:
        return 0;
    }

    public abcd.Tl getCurrentFileSpan() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, 4551961522323479439L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(4551961522323479439L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        com.aide.ui.AIDEEditor r2 = getCurrentEditor();     // Catch: java.lang.Throwable -> L12
        if (r2 != null) goto L11;
        return new abcd.Tl(null, 0, 0, 0, 0);
    L11:
        return new abcd.Tl(r2.getFilePath(), r2.getSelectionStartLine(), r2.getSelectionStartColumn(), r2.getSelectionEndLine(), r2.getSelectionEndColumn());
    }

    public java.util.List<com.aide.ui.AIDEEditor> getFileEditors() {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 1528262923862780856L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(1528262923862780856L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
        int r3 = 0;
    L7:
        if (r3 >= this.Xa.size()) goto L11;
        r2.add(v5(r3));     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;
        goto L7
    L11:
        return r2;
    }

    public java.lang.String getQuickKeys() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, -1376812708265644991L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-1376812708265644991L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getCurrentEditor() == null) goto L10;
        return getCurrentEditor().getQuickKeys();
    L10:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public java.lang.String getSelectionContent() {
        long r0 = -5289718353106690437(0xb697252f19361e7b, double:-1.0135438488571354E-45);
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, r0, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-5289718353106690437L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getCurrentEditor() == null) goto L10;
        r0 = getCurrentEditor().getSelectionContent();     // Catch: java.lang.Throwable -> L12
        return r0;
    L10:
        return "";
    }

    public int getTabSize() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, -3885336373270508880L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-3885336373270508880L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getCurrentEditor() == null) goto L10;
        return getCurrentEditor().getTabSize();
    L10:
        return 4;
    }

    @Override
    public java.lang.String getVisibleFile() {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, -24152535680889696L, this);
    L16:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-24152535680889696L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getCurrentEditor() == null) goto L10;
        return getCurrentEditor().getFilePath();
    L10:
        return null;
    }

    public void gn() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -56275003118808747L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-56275003118808747L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().v5();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j3() {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, 186786251967279293L, this);
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(186786251967279293L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = getEditors().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().vy();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public void j6(int r10, int r11, int r12, int r13) {
    L12:
        th = move-exception;
        if (CU == false) goto L16;
        abcd.wu.j6(th, -6141611920267008L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L16:
        throw th;
    L3:
        if (et == false) goto L5;
        abcd.wu.j6(-6141611920267008L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L12
    L5:
        com.aide.ui.AIDEEditor r0 = getCurrentEditor();     // Catch: java.lang.Throwable -> L12
        if (r0 == null) goto L19;
        r0.j6(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L12
        if (r10 != r12) goto L20;
        if (r11 != r13) goto L21;
        r0.tp();     // Catch: java.lang.Throwable -> L12
        return;
    L21:
        return;
    L20:
        return;
    }

    public void j6(int r11, int r12, int r13, int r14, java.lang.String r15) {
    L9:
        th = move-exception;
        if (CU == false) goto L13;
        abcd.wu.j6(th, -2445237505802021280L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);
    L13:
        throw th;
    L3:
        if (et == false) goto L6;
        abcd.wu.j6(-2445237505802021280L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);     // Catch: java.lang.Throwable -> L9
    L6:
        if (getCurrentEditor() == null) goto L16;
        getCurrentEditor().j6(r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void j6(android.graphics.Rect r6) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -136839033270134995L, this, r6);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-136839033270134995L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FN.j6(com.aide.ui.U.lg().j6(r6), false);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(java.lang.String r7) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -1444283412869684527L, this, r7);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-1444283412869684527L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        int r2 = v5(r7);     // Catch: java.lang.Throwable -> L8
        setCurrentItem(r2);     // Catch: java.lang.Throwable -> L8
        postDelayed(new com.aide.ui.I(this, r2), 10);     // Catch: java.lang.Throwable -> L8
        we();     // Catch: java.lang.Throwable -> L8
        getActivity().FH(r2);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r20, java.lang.String r21, int r22, boolean r23, java.lang.String r24, java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28, int r29, boolean r30) {
        if (et == false) goto L6;
        abcd.wu.j6(2707615534692109569L, this, new java.lang.Object[]{r20, r21, new java.lang.Integer(r22), new java.lang.Boolean(r23), r24, r25, new java.lang.Boolean(r26), r27, r28, new java.lang.Integer(r29), new java.lang.Boolean(r30)});
    L6:
        J8();
        com.aide.ui.U.er().VH(r20);
        java.util.Iterator<com.aide.ui.AIDEEditor> r1 = getFileEditors().iterator();
    L8:
        if (r1.hasNext() == false) goto L17;
        com.aide.ui.AIDEEditor r5 = r1.next();
        if (r20 != null) goto L12;
    L15:
        r5.j6(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
        goto L8
    L12:
        if (r5.getFilePath().equals(r20) == true) goto L15;
        r5.j6(r21, r22, r23, null, null, false, null, null, -1, false);
        goto L8
    }

    public void j6(java.lang.String r9, java.lang.String r10, java.lang.String... r11) {
    L13:
        th = move-exception;
        if (CU == false) goto L18;
        abcd.wu.j6(th, -1098722210504450208L, this, r9, r10, r11);
    L18:
        throw th;
    L3:
        if (et == false) goto L5;
        abcd.wu.j6(-1098722210504450208L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L13
    L5:
        java.util.Iterator<com.aide.ui.AIDEEditor> r0 = getFileEditors().iterator();     // Catch: java.lang.Throwable -> L13
    L6:
        if (r0.hasNext() == false) goto L12;
        com.aide.ui.AIDEEditor r1 = r0.next();     // Catch: java.lang.Throwable -> L13
        if (r1.getFilePath().equals(r9) == false) goto L6;
        r1.j6(r10, r11);     // Catch: java.lang.Throwable -> L13
        goto L6
    }

    public boolean j6(int r9, int r10, java.lang.String r11) {
    L11:
        th = move-exception;
        if (CU == false) goto L15;
        abcd.wu.j6(th, 2495713666394815992L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L15:
        throw th;
    L3:
        if (et == false) goto L6;
        abcd.wu.j6(2495713666394815992L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L11
    L6:
        if (getCurrentEditor() == null) goto L9;
        return getCurrentEditor().j6(r9, r10, r11);
    L9:
        return false;
    }

    public void lg() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -1416860636590944465L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-1416860636590944465L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().XL();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
    L18:
        th = move-exception;
        if (CU == false) goto L22;
        abcd.wu.j6(th, -8549092096721281600L, this, r5);
    L22:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-8549092096721281600L, this, r5);     // Catch: java.lang.Throwable -> L18
    L7:
        if (com.aide.common.ClassG.j6(r5) == false) goto L10;
        return false;
    L10:
        if (r5.getAction() == 0) goto L12;
    L16:
        return super.onInterceptTouchEvent(r5);
    L12:
        if (getCurrentEditor() == null) goto L16;
        if (getCurrentEditor().j6(r5) == false) goto L16;
        return false;
    }

    @Override
    @abcd.Interfacesu(method = -912574882686596080L)
    protected void onMeasure(int r8, int r9) {
    L19:
        th = move-exception;
        if (CU == false) goto L23;
        abcd.wu.j6(th, -1583680889294933121L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L23:
        throw th;
    L3:
        if (et == false) goto L5;
        abcd.wu.j6(-1583680889294933121L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L19
    L5:
        super.onMeasure(r8, r9);     // Catch: java.lang.Throwable -> L19
        float r0 = com.aide.common.ClassG.tp(getContext());     // Catch: java.lang.Throwable -> L19
        if (r0 > 0.0f) goto L8;
        return;
    L8:
        if ((com.aide.common.ClassG.j6(getContext()) - r0) > 100.0f) goto L10;
    L12:
        boolean r1 = false;
    L14:
        if (this.aq == r1) goto L27;
        this.aq = r1;     // Catch: java.lang.Throwable -> L19
        if (this.hz == null) goto L28;
        this.hz.j6(r1);     // Catch: java.lang.Throwable -> L19
        postDelayed(new com.aide.ui.K(this), 100);     // Catch: java.lang.Throwable -> L19
        return;
    L28:
        return;
    L27:
        return;
    L10:
        if (com.aide.common.ClassG.we(com.aide.ui.U.Zo()) == false) goto L12;
        r1 = true;
        goto L14
    }

    public void rN() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -39506849449129540L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-39506849449129540L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().aM();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void setIdentifierClickingEnabled(boolean r5) {
    L12:
        th = move-exception;
        if (CU == false) goto L17;
        abcd.wu.j6(th, -1421886350040106071L, this, new java.lang.Boolean(r5));
    L17:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-1421886350040106071L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        this.Eq = r5;     // Catch: java.lang.Throwable -> L12
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = getEditors().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().setIdentifierClickingEnabled(r5);     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public void setSoftKeyboardListener(com.aide.ui.AIDEEditorPager.b r5) {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, 511012280314397544L, this, r5);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(511012280314397544L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.hz = r5;     // Catch: java.lang.Throwable -> L8
    }

    public void tp() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 66923386446924335L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(66923386446924335L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().VH();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void u7() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, 312650716103187904L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(312650716103187904L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().Zo();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void we() {
    L10:
        th = move-exception;
        if (CU == false) goto L14;
        abcd.wu.j6(th, -1783991656068023368L, this);
    L14:
        throw th;
    L4:
        if (et == false) goto L7;
        abcd.wu.j6(-1783991656068023368L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (getCurrentEditor() == null) goto L17;
        getCurrentEditor().SI();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void yS() {
    L8:
        th = move-exception;
        if (CU == false) goto L12;
        abcd.wu.j6(th, -1667600134837398976L, this);
    L12:
        throw th;
    L4:
        if (et == false) goto L6;
        abcd.wu.j6(-1667600134837398976L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FN.j6(true);     // Catch: java.lang.Throwable -> L8
    }
}
