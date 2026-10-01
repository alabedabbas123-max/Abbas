package com.aide.ui.browsers;

@abcd.Interfacexu
public class FileBrowser extends android.widget.LinearLayout implements abcd.C1050mk.a, com.aide.ui.browsers.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2068764923731779201L)
    private com.aide.ui.Z FH;

    @abcd.Interfaceru(field = -1079241939401435432L)
    private com.aide.ui.Z Hw;

    @abcd.Interfaceru(field = 2016147934576052816L)
    private com.aide.ui.browsers.FileBrowser.a VH;

    @abcd.Interfaceru(field = -2456717333687695815L)
    protected android.view.View Zo;

    @abcd.Interfaceru(field = -4817546703576642376L)
    private com.aide.common.KeyStrokeDetector.a v5;

    @abcd.Interfacexu
    private class a extends com.aide.common.Abstractx<com.aide.ui.browsers.FileBrowser.b> {

        @abcd.Interfacetu
        private static boolean Hw;

        @abcd.Interfaceuu
        private static boolean v5;

        @abcd.Interfacevu
        final com.aide.ui.browsers.FileBrowser Zo;

        static {
            abcd.wu.j6(com.aide.ui.browsers.FileBrowser.a.class, 3980503035665525340L, 3980503035665525340L);
        }

        @abcd.Interfacesu(method = -120577119575832752L)
        private a(com.aide.ui.browsers.FileBrowser r6) {
        L8:
            th = move-exception;
            if (v5 == false) goto L12;
            abcd.wu.j6(th, -1681695123744951504L, null, r6);
        L12:
            throw th;
        L4:
            if (Hw == false) goto L6;
            abcd.wu.j6(-1681695123744951504L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Zo = r6;     // Catch: java.lang.Throwable -> L8
        }

        a(com.aide.ui.browsers.FileBrowser r8, com.aide.ui.browsers.g r9) {
        L7:
            th = move-exception;
            if (v5 == false) goto L11;
            abcd.wu.j6(th, 4262387881960271932L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (Hw == false) goto L5;
            abcd.wu.j6(4262387881960271932L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            return com.almlkaide.kaypro.aide.filebrowser.FileBrowserAdapter.getView(this, r2, r3, r4);
        }

        @abcd.Interfacesu(method = 2266415186838480639L)
        public android.view.View getView_SOURCE(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L10:
            th = move-exception;
            if (v5 == false) goto L14;
            abcd.wu.j6(th, 907316140778872848L, this, new java.lang.Integer(r9), r10, r11);
        L14:
            throw th;
        L3:
            if (Hw == false) goto L5;
            abcd.wu.j6(907316140778872848L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L10
        L5:
            if (r10 != null) goto L7;
            android.view.View r0 = android.view.LayoutInflater.from(this.Zo.getContext()).inflate(com.almlkaide.kaypro.R.layout.filebrowser_entry, r11, false);     // Catch: java.lang.Throwable -> L10
        L8:
            com.aide.ui.browsers.FileBrowser.b r1 = j6(r9);     // Catch: java.lang.Throwable -> L10
            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.filebrowserEntryName)).setText(r1.FH);     // Catch: java.lang.Throwable -> L10
            ((android.widget.ImageView) r0.findViewById(com.almlkaide.kaypro.R.id.filebrowserEntryFileImage)).setImageResource(r1.VH);     // Catch: java.lang.Throwable -> L10
            return r0;
        L7:
            r0 = r10;
            goto L8
        }

        @Override
        public void notifyDataSetChanged() {
            com.almlkaide.kaypro.aide.filebrowser.FileBrowserAdapter.OnNotifyDataSetChanged(this);
        }

        public void notifyDataSetChanged_() {
            super.notifyDataSetChanged();
        }
    }

    @abcd.Interfacexu
    public class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2794120726679586235L)
        public java.lang.String FH;

        @abcd.Interfaceru(field = -2512171421590620000L)
        public boolean Hw;

        @abcd.Interfaceru(field = 2855063803438316545L)
        public int VH;

        @abcd.Interfaceru(field = 957591483313279661L)
        public abcd.InterfaceJl Zo;

        @abcd.Interfacevu
        final com.aide.ui.browsers.FileBrowser gn;

        @abcd.Interfaceru(field = -2795223587978491317L)
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.browsers.FileBrowser.b.class, -1173655237192759335L, -1173655237192759335L);
        }

        @abcd.Interfacesu(method = 548274873477771659L)
        public b(com.aide.ui.browsers.FileBrowser r8, abcd.InterfaceJl r9) {
        L9:
            th = move-exception;
            if (DW == false) goto L13;
            abcd.wu.j6(th, 2245128364824339345L, null, r8, r9);
        L13:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(2245128364824339345L, null, r8, r9);     // Catch: java.lang.Throwable -> L9
        L5:
            this.gn = r8;     // Catch: java.lang.Throwable -> L9
            this.Zo = r9;     // Catch: java.lang.Throwable -> L9
            this.VH = r9.Zo();     // Catch: java.lang.Throwable -> L9
            int r0 = r9.DW();     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L16;
            this.FH = r8.getContext().getResources().getString(r0);     // Catch: java.lang.Throwable -> L9
            return;
        }

        @abcd.Interfacesu(method = -8710999644725155271L)
        public b(com.aide.ui.browsers.FileBrowser r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1391139599401946817L, null, r10, r11, r12, new java.lang.Boolean(r13));
        L20:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1391139599401946817L, null, r10, r11, r12, new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L16
        L5:
            this.gn = r10;     // Catch: java.lang.Throwable -> L16
            this.v5 = r11;     // Catch: java.lang.Throwable -> L16
            this.FH = r12;     // Catch: java.lang.Throwable -> L16
            this.Hw = r13;     // Catch: java.lang.Throwable -> L16
            if (this.Hw == false) goto L9;
            this.VH = com.aide.ui.ca.j6(r11);     // Catch: java.lang.Throwable -> L16
            return;
        L9:
            if (DW() == false) goto L12;
            this.VH = com.almlkaide.kaypro.R.drawable.folder_open;     // Catch: java.lang.Throwable -> L16
            return;
        L12:
            if (com.aide.ui.browsers.FileBrowser.j6(r12) == false) goto L14;
            this.VH = com.almlkaide.kaypro.R.drawable.folder_hidden;     // Catch: java.lang.Throwable -> L16
            return;
        L14:
            this.VH = com.almlkaide.kaypro.R.drawable.folder;     // Catch: java.lang.Throwable -> L16
        }

        @abcd.Interfacesu(method = 640257875353174800L)
        public boolean DW() {
        L13:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, 166256215873474176L, this);
        L17:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(166256215873474176L, this);     // Catch: java.lang.Throwable -> L13
        L7:
            if (this.Hw == true) goto L11;
            if (this.FH.equals("..") == false) goto L11;
            return true;
        L11:
            return false;
        }

        @abcd.Interfacesu(method = -2918012092919777952L)
        public boolean j6() {
        L13:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, -136595782536153700L, this);
        L17:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(-136595782536153700L, this);     // Catch: java.lang.Throwable -> L13
        L7:
            if (this.Hw == true) goto L11;
            if (DW() == true) goto L11;
            return true;
        L11:
            return false;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.browsers.FileBrowser.class, 5630979006676181253L, 5630979006676181253L);
    }

    public FileBrowser(android.content.Context r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 138810922410404769L, null, r7);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(138810922410404769L, null, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r7);     // Catch: java.lang.Throwable -> L8
        this.FH = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.filebrowser_context_menu);     // Catch: java.lang.Throwable -> L8
        this.Hw = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.git_context_menu);     // Catch: java.lang.Throwable -> L8
        this.v5 = new com.aide.ui.M(com.aide.ui.V.v5());     // Catch: java.lang.Throwable -> L8
        VH();     // Catch: java.lang.Throwable -> L8
    }

    public FileBrowser(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2129274232320206664L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2129274232320206664L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.FH = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.filebrowser_context_menu);     // Catch: java.lang.Throwable -> L7
        this.Hw = new com.aide.ui.Z(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.menu.git_context_menu);     // Catch: java.lang.Throwable -> L7
        this.v5 = new com.aide.ui.M(com.aide.ui.V.v5());     // Catch: java.lang.Throwable -> L7
        VH();     // Catch: java.lang.Throwable -> L7
    }

    static com.aide.ui.MainActivity DW(com.aide.ui.browsers.FileBrowser r0) {
        return r0.getActivity();
    }

    @abcd.Interfacesu(method = -627349660941032580L)
    private static boolean DW(java.lang.String r5) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -703674388274086572L, null, r5);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-703674388274086572L, null, r5);     // Catch: java.lang.Throwable -> L20
    L7:
        if (r5.startsWith(".") == false) goto L9;
    L18:
        return true;
    L9:
        if ("bin".equals(r5) == true) goto L18;
        if ("obj".equals(r5) == true) goto L18;
        if ("build".equals(r5) == true) goto L18;
        if ("gradle".equals(r5) == true) goto L18;
        return false;
    }

    static com.aide.ui.views.CustomKeysListView FH(com.aide.ui.browsers.FileBrowser r0) {
        return r0.getListView();
    }

    @abcd.Interfacesu(method = 911074248264933952L)
    private void FH(java.lang.String r6) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -3109423570381883200L, this, r6);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3109423570381883200L, this, r6);     // Catch: java.lang.Throwable -> L16
    L7:
        if (com.aide.ui.U.vy().XL(r6) == true) goto L24;
    L14:
        com.aide.ui.U.J8().j6(r6);     // Catch: java.lang.Throwable -> L16
        return;
    L24:
        java.util.List<java.lang.String> r2 = abcd.Vl.Zo(r6);     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L16
        if (r2.size() != 1) goto L14;
        if (abcd.Vl.J0(r2.get(0)) == false) goto L14;
        r6 = r2.get(0);     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L16
        goto L24
    }

    @abcd.Interfacesu(method = -989482440531988720L)
    private void VH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1999760764677535384L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1999760764677535384L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L8
        android.view.LayoutInflater r2 = android.view.LayoutInflater.from(getContext());     // Catch: java.lang.Throwable -> L8
        android.view.View r3 = r2.inflate(com.almlkaide.kaypro.R.layout.filebrowser, null);     // Catch: java.lang.Throwable -> L8
        removeAllViews();     // Catch: java.lang.Throwable -> L8
        addView(r3);     // Catch: java.lang.Throwable -> L8
        android.view.View r4 = r2.inflate(com.almlkaide.kaypro.R.layout.browser_header, null);     // Catch: java.lang.Throwable -> L8
        getListView().addHeaderView(r4, null, false);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.J8().j6(this);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.views.CustomKeysListView r5 = getListView();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.browsers.FileBrowser.a r6 = new com.aide.ui.browsers.FileBrowser.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.VH = r6;     // Catch: java.lang.Throwable -> L8
        r5.setAdapter(r6);     // Catch: java.lang.Throwable -> L8
        r5.setOnItemSelectedListener(new com.aide.ui.browsers.g(this, r5));     // Catch: java.lang.Throwable -> L8
        r5.setOnKeyEventListener(new com.aide.ui.browsers.h(this));     // Catch: java.lang.Throwable -> L8
        r5.setOnItemLongClickListener(new com.aide.ui.browsers.i(this, r5));     // Catch: java.lang.Throwable -> L8
        r5.setOnItemClickListener(new com.aide.ui.browsers.j(this, r5));     // Catch: java.lang.Throwable -> L8
        Zo();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4376236547492012435L)
    private com.aide.ui.MainActivity getActivity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 822834133376817263L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(822834133376817263L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.MainActivity) getContext();
    }

    @abcd.Interfacesu(method = 1016907955190792049L)
    private com.aide.ui.views.CustomKeysListView getListView() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2111039540909725115L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2111039540909725115L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.views.CustomKeysListView) findViewById(com.almlkaide.kaypro.R.id.filebrowserFileList);
    }

    static com.aide.common.KeyStrokeDetector.a j6(com.aide.ui.browsers.FileBrowser r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -805950045585860875L)
    private void j6(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 245134816803786105L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(245134816803786105L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.j6(r5, true);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 7816705123903312109L)
    private void j6(android.view.View r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6106759169996863225L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6106759169996863225L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -2805514445274551847L)
    private void j6(com.aide.ui.browsers.FileBrowser.b r5) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 3952524197357127117L, this, r5);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3952524197357127117L, this, r5);     // Catch: java.lang.Throwable -> L15
    L6:
        java.lang.String r2 = null;
        if (r5 != null) goto L9;
    L13:
        com.aide.ui.U.J8().DW(r2);     // Catch: java.lang.Throwable -> L15
        return;
    L9:
        if (r5.Hw == false) goto L11;
    L12:
        r2 = r5.v5;     // Catch: java.lang.Throwable -> L15
        goto L13
    L11:
        if (r5.j6() == false) goto L13;
        goto L12
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, android.view.View r1, boolean r2) {
        r0.j6(r1, r2);
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, com.aide.ui.browsers.FileBrowser.b r1) {
        r0.j6(r1);
    }

    static void j6(com.aide.ui.browsers.FileBrowser r0, java.lang.String r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = 2705612155847635744L)
    private void j6(java.util.List<java.lang.String> r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 545079867821223408L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(545079867821223408L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.Collections.sort(r5, new com.aide.ui.browsers.l(this));     // Catch: java.lang.Throwable -> L8
    }

    static boolean j6(java.lang.String r0) {
        return DW(r0);
    }

    @Override
    public void DW() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4147634361030494472L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(4147634361030494472L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 577432211910011375L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(577432211910011375L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        Zo();     // Catch: java.lang.Throwable -> L8
    }

    public void Hw() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 418688876998056540L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(418688876998056540L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.Object r2 = getListView().getSelectedItem();     // Catch: java.lang.Throwable -> L10
        if ((r2 instanceof com.aide.ui.browsers.FileBrowser.b) == false) goto L17;
        j6((com.aide.ui.browsers.FileBrowser.b) r2);     // Catch: java.lang.Throwable -> L10
        j6(getListView().getSelectedView(), false);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void Zo() {
        java.lang.String r2 = com.aide.ui.U.J8().j6();
        com.aide.ui.U.J8().DW((java.lang.String) null);
        com.aide.ui.views.CustomKeysListView r1 = getListView();
        ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderLabel)).setText(r2);
        ((android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderIcon)).setImageResource(com.almlkaide.kaypro.R.drawable.folder_open);
        android.widget.ImageView r0 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.browserHeaderMenuButton);
        r0.setOnClickListener((android.view.View.OnClickListener) com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.k")).newInstance(new java.lang.Object[]{this, r0}).get());
        java.util.ArrayList r3 = new java.util.ArrayList();
        java.lang.String r4 = abcd.Vl.EQ(r2);
        if (r4 != null) goto L40;
    L8:
        java.util.Iterator<abcd.InterfaceJl> r5 = com.aide.ui.V.j6().iterator();
    L10:
        if (r5.hasNext() == false) goto L42;
        abcd.InterfaceJl r6 = r5.next();
        if (r6.j6(false) == false) goto L10;
        r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r6}).get());
    L26:
        e = move-exception;
        throw new java.lang.NoClassDefFoundError(e.getMessage());
    L42:
        java.util.List<java.lang.String> r7 = abcd.Vl.Zo(r2);     // Catch: java.lang.Throwable -> L33
        java.util.Iterator r8 = ((java.util.List) com.blankj.utilcode.util.ReflectUtils.reflect("com.almlkaide.kaypro.aide.filebrowser.FileBrowserListener").method("sortList", new java.lang.Object[]{this, r7}).get()).iterator();     // Catch: java.lang.Throwable -> L33
    L13:
        if (r8.hasNext() == false) goto L14;
        java.lang.String r9 = (java.lang.String) r8.next();     // Catch: java.lang.Throwable -> L33
        r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r9, abcd.Vl.tp(r9), new java.lang.Boolean(abcd.Vl.J8(r9))}).get());     // Catch: java.lang.Throwable -> L33
        goto L13
    L35:
        e = move-exception;
        throw new java.lang.NoClassDefFoundError(e.getMessage());     // Catch: java.lang.Throwable -> L33
    L14:
        this.VH.j6(r3);
        return;
    L33:
        th = move-exception;
        com.aide.common.ClassH.DW(th);
        goto L14
    L40:
        r3.add(com.blankj.utilcode.util.ReflectUtils.reflect(java.lang.Class.forName("com.aide.ui.browsers.FileBrowser$b")).newInstance(new java.lang.Object[]{this, r4, "..", new java.lang.Boolean(false)}).get());
    L19:
        e = move-exception;
        throw new java.lang.NoClassDefFoundError(e.getMessage());
    L16:
        e = move-exception;
        throw new java.lang.NoClassDefFoundError(e.getMessage());
    }

    public void Zo_() {
    L25:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, -2227529659476872952L, this);
    L30:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2227529659476872952L, this);     // Catch: java.lang.Throwable -> L25
    L6:
        java.lang.String r2 = com.aide.ui.U.J8().j6();     // Catch: java.lang.Throwable -> L25
        com.aide.ui.U.J8().DW(null);     // Catch: java.lang.Throwable -> L25
        com.aide.ui.views.CustomKeysListView r3 = getListView();     // Catch: java.lang.Throwable -> L25
        ((android.widget.TextView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderLabel)).setText(r2);     // Catch: java.lang.Throwable -> L25
        ((android.widget.ImageView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderIcon)).setImageResource(com.almlkaide.kaypro.R.drawable.folder_open);     // Catch: java.lang.Throwable -> L25
        android.widget.ImageView r4 = (android.widget.ImageView) r3.findViewById(com.almlkaide.kaypro.R.id.browserHeaderMenuButton);     // Catch: java.lang.Throwable -> L25
        r4.setOnClickListener(new com.aide.ui.browsers.k(this, r4));     // Catch: java.lang.Throwable -> L25
        java.util.ArrayList r5 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L25
        java.lang.String r6 = abcd.Vl.EQ(r2);     // Catch: java.lang.Throwable -> L25
        if (r6 == null) goto L9;
        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r6, "..", false));     // Catch: java.lang.Throwable -> L25
    L9:
        java.util.Iterator<abcd.InterfaceJl> r7 = com.aide.ui.V.j6().iterator();     // Catch: java.lang.Throwable -> L25
    L11:
        if (r7.hasNext() == false) goto L32;
        abcd.InterfaceJl r8 = r7.next();     // Catch: java.lang.Throwable -> L25
        if (r8.j6(false) == false) goto L11;
        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r8));     // Catch: java.lang.Throwable -> L25
        goto L11
    L32:
        java.util.List<java.lang.String> r9 = abcd.Vl.Zo(r2);     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L25
        j6(r9);     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L25
        java.util.Iterator<java.lang.String> r10 = r9.iterator();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L25
    L18:
        if (r10.hasNext() == false) goto L23;
        java.lang.String r11 = r10.next();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L25
        r5.add(new com.aide.ui.browsers.FileBrowser.b(this, r11, abcd.Vl.tp(r11), abcd.Vl.J8(r11)));     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L25
    L23:
        this.VH.j6(r5);     // Catch: java.lang.Throwable -> L25
        return;
    L21:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L25
        goto L23
    }

    @Override
    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2499864083460946020L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2499864083460946020L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getListView().requestFocus();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1040104897247219712L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1040104897247219712L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (com.aide.ui.U.lg().j3().j6(r8, r9, this.v5) == false) goto L9;
        return true;
    L9:
        return super.onKeyDown(r8, r9);
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -652052934278676315L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-652052934278676315L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (com.aide.ui.U.lg().j3().DW(r8, r9, this.v5) == false) goto L9;
        return true;
    L9:
        return super.onKeyUp(r8, r9);
    }

    public void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -783517087055499885L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-783517087055499885L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(this.Zo);     // Catch: java.lang.Throwable -> L8
    }
}
