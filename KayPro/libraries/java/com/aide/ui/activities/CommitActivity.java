package com.aide.ui.activities;

@abcd.Interfacexu
public class CommitActivity extends com.aide.ui.ThemedActionbarActivity implements abcd.Nk.c {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1860140884001339537L)
    private java.util.List<com.aide.ui.scm.ModifiedFile> VH;

    @abcd.Interfaceru(field = -4573602223556083713L)
    private java.util.BitSet Zo;

    @abcd.Interfaceru(field = 3908301051900349051L)
    private java.util.Map<com.aide.ui.scm.ModifiedFile, java.lang.String> gn;

    @abcd.Interfaceru(field = 2200025663354098413L)
    private com.aide.ui.activities.CommitActivity.b tp;

    @abcd.Interfaceru(field = 896409499289029603L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = -110267484240190671L)
    private int v5;

    @abcd.Interfacexu
    private class a implements com.aide.ui.scm.ua.c {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 232694712276091440L)
        private java.util.List<com.aide.ui.scm.ModifiedFile> FH;

        @abcd.Interfacevu
        final com.aide.ui.activities.CommitActivity Hw;

        static {
            abcd.wu.j6(com.aide.ui.activities.CommitActivity.a.class, -1252510624615490640L, -1252510624615490640L);
        }

        @abcd.Interfacesu(method = 4785286223013924837L)
        public a(com.aide.ui.activities.CommitActivity r8, java.util.List<com.aide.ui.scm.ModifiedFile> r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -3475036826855383127L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-3475036826855383127L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 3695286855610061117L)
        public void DW() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -6739926192803213168L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L14;
            abcd.wu.j6(-6739926192803213168L, this);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        @abcd.Interfacesu(method = 3428729857066074000L)
        public void j6() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1856368176842195397L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L14;
            abcd.wu.j6(1856368176842195397L, this);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        public void j6(java.lang.Void r1) {
            j62(r1);
        }

        @abcd.Interfacesu(method = 1172470380798674992L)
        public void j62(java.lang.Void r8) {
        L21:
            th = move-exception;
            if (DW == false) goto L26;
            abcd.wu.j6(th, 203290584117318357L, this, r8);
        L26:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(203290584117318357L, this, r8);     // Catch: java.lang.Throwable -> L21
        L6:
            java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L21
            java.util.Iterator<com.aide.ui.scm.ModifiedFile> r4 = this.FH.iterator();     // Catch: java.lang.Throwable -> L21
        L8:
            if (r4.hasNext() == false) goto L10;
            r2.add(r4.next().FH);     // Catch: java.lang.Throwable -> L21
            goto L8
        L10:
            java.util.Iterator r5 = com.aide.ui.activities.CommitActivity.VH(this.Hw).iterator();     // Catch: java.lang.Throwable -> L21
        L12:
            if (r5.hasNext() == false) goto L17;
            com.aide.ui.scm.ModifiedFile r6 = (com.aide.ui.scm.ModifiedFile) r5.next();     // Catch: java.lang.Throwable -> L21
            if (r2.contains(r6.FH) == true) goto L12;
            r3.add(r6);     // Catch: java.lang.Throwable -> L21
            goto L12
        L17:
            if (r3.isEmpty() == false) goto L19;
            this.Hw.finish();     // Catch: java.lang.Throwable -> L21
            return;
        L19:
            com.aide.ui.activities.CommitActivity.j6(this.Hw, r3);     // Catch: java.lang.Throwable -> L21
            com.aide.ui.activities.CommitActivity.gn(this.Hw);     // Catch: java.lang.Throwable -> L21
        }
    }

    @abcd.Interfacexu
    private class b extends android.widget.ArrayAdapter<com.aide.ui.scm.ModifiedFile> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.activities.CommitActivity FH;

        static {
            abcd.wu.j6(com.aide.ui.activities.CommitActivity.b.class, -101481753451122000L, -101481753451122000L);
        }

        @abcd.Interfacesu(method = 4014173672748299424L)
        public b(com.aide.ui.activities.CommitActivity r9, android.content.Context r10, java.util.List<com.aide.ui.scm.ModifiedFile> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 3303678785540339440L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(3303678785540339440L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.almlkaide.kaypro.R.layout.commitbrowser_modifiedfile_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1902762099796157136L)
        public int getItemViewType(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3177169133445017557L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-3177169133445017557L, this, r5);     // Catch: java.lang.Throwable -> L8
            return -1;
        L15:
            return -1;
        }

        @Override
        @abcd.Interfacesu(method = 429360526179701497L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L35:
            th = move-exception;
            if (DW == false) goto L39;
            abcd.wu.j6(th, -304633343366157672L, this, new java.lang.Integer(r9), r10, r11);
        L39:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-304633343366157672L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L35
        L6:
            if (((com.aide.ui.scm.ModifiedFileListEntry) r10) != null) goto L34;
            boolean r2 = false;
            com.aide.ui.scm.ModifiedFileListEntry r0 = (com.aide.ui.scm.ModifiedFileListEntry) android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.commitbrowser_modifiedfile_entry, r11, false);     // Catch: java.lang.Throwable -> L35
            r0.setOnCheckedChangeListener(new com.aide.ui.activities.ClassN(this, r9));     // Catch: java.lang.Throwable -> L35
            r0.setChecked(com.aide.ui.activities.CommitActivity.v5(this.FH).get(r9));     // Catch: java.lang.Throwable -> L35
            if (r9 != com.aide.ui.activities.CommitActivity.Zo(this.FH)) goto L10;
            r2 = true;
        L10:
            r0.setSelectedForDiff(r2);     // Catch: java.lang.Throwable -> L35
            com.aide.ui.scm.ModifiedFile r1 = getItem(r9);     // Catch: java.lang.Throwable -> L35
            android.widget.ImageView r3 = (android.widget.ImageView) r0.findViewById(com.almlkaide.kaypro.R.id.modifiedFileImage);     // Catch: java.lang.Throwable -> L35
            if (r1.FH() == false) goto L13;
        L30:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.file_modfieid);     // Catch: java.lang.Throwable -> L35
        L31:
            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.modifiedFileName)).setText(new java.io.File(r1.FH).getName() + " (" + r1.j6() + ")");     // Catch: java.lang.Throwable -> L35
            return r0;
        L13:
            if (r1.Zo() == true) goto L30;
            if (r1.DW() == false) goto L18;
        L29:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.file_new);     // Catch: java.lang.Throwable -> L35
            goto L31
        L18:
            if (r1.gn() == true) goto L29;
            if (r1.VH() == false) goto L23;
        L28:
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.file_removed);     // Catch: java.lang.Throwable -> L35
            goto L31
        L23:
            if (r1.v5() == true) goto L28;
            if (r1.Hw() == false) goto L31;
            r3.setImageResource(com.almlkaide.kaypro.R.drawable.file_conflict);     // Catch: java.lang.Throwable -> L35
            goto L31
        L34:
            throw new java.lang.IllegalStateException();     // Catch: java.lang.Throwable -> L35
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.activities.CommitActivity.class, -48774866763899575L, -48774866763899575L);
    }

    public CommitActivity() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1344877463565618520L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1344877463565618520L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String DW(com.aide.ui.activities.CommitActivity r0) {
        return r0.u7;
    }

    static java.util.Map FH(com.aide.ui.activities.CommitActivity r0) {
        return r0.gn;
    }

    @abcd.Interfacesu(method = 4641848345532975639L)
    private com.aide.ui.scm.ModifiedFile Hw() {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, 2481139892125095204L, this);
    L16:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(2481139892125095204L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.v5 >= 0) goto L10;
        return null;
    L10:
        return (com.aide.ui.scm.ModifiedFile) v5().getItemAtPosition(this.v5);
    }

    static com.aide.ui.scm.ModifiedFile Hw(com.aide.ui.activities.CommitActivity r0) {
        return r0.Hw();
    }

    static java.util.List VH(com.aide.ui.activities.CommitActivity r0) {
        return r0.VH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -4360025328490278369L)
    private void VH() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2162376948136733328L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2162376948136733328L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.ListView r2 = v5();     // Catch: java.lang.Throwable -> L8
        this.tp = new com.aide.ui.activities.CommitActivity.b(this, this, this.VH);     // Catch: java.lang.Throwable -> L8
        this.v5 = -1;     // Catch: java.lang.Throwable -> L8
        r2.setAdapter(this.tp);     // Catch: java.lang.Throwable -> L8
        this.Zo = new java.util.BitSet();     // Catch: java.lang.Throwable -> L8
        this.Zo.set(0, this.VH.size());     // Catch: java.lang.Throwable -> L8
        j6(0);     // Catch: java.lang.Throwable -> L8
    }

    static int Zo(com.aide.ui.activities.CommitActivity r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -5546979520683605221L)
    private java.util.List<com.aide.ui.scm.ModifiedFile> Zo() {
    L14:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, -992170330850370672L, this);
    L19:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-992170330850370672L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L14
        android.widget.ListView r3 = v5();     // Catch: java.lang.Throwable -> L14
        int r4 = 0;
    L7:
        if (r4 >= r3.getCount()) goto L13;
        if (this.Zo.get(r4) == false) goto L12;
        r2.add((com.aide.ui.scm.ModifiedFile) r3.getItemAtPosition(r4));     // Catch: java.lang.Throwable -> L14
    L12:
        r4 = r4 + 1;
        goto L7
    L13:
        return r2;
    }

    static void gn(com.aide.ui.activities.CommitActivity r0) {
        r0.VH();
    }

    static java.util.List j6(com.aide.ui.activities.CommitActivity r0) {
        return r0.Zo();
    }

    static java.util.List j6(com.aide.ui.activities.CommitActivity r0, java.util.List r1) {
        r0.VH = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -2487064588927000425L)
    private void j6(int r7) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1296764622072073508L, this, new java.lang.Integer(r7));
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1296764622072073508L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.ListView r2 = v5();     // Catch: java.lang.Throwable -> L8
        this.v5 = r7;     // Catch: java.lang.Throwable -> L8
        this.tp.notifyDataSetChanged();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.scm.ModifiedFile r3 = (com.aide.ui.scm.ModifiedFile) r2.getItemAtPosition(r7);     // Catch: java.lang.Throwable -> L8
        j6(r3);     // Catch: java.lang.Throwable -> L8
        FH().scrollTo(0, 0);     // Catch: java.lang.Throwable -> L8
        android.view.View r4 = FH().getHeaderView();     // Catch: java.lang.Throwable -> L8
        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.commitHeaderFileName)).setText(abcd.Vl.tp(r3.FH));     // Catch: java.lang.Throwable -> L8
        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.commitHeaderDirectoryName)).setText(abcd.Vl.EQ(r3.FH));     // Catch: java.lang.Throwable -> L8
        ((android.widget.ImageView) r4.findViewById(com.almlkaide.kaypro.R.id.commitHeaderFileIcon)).setImageResource(com.aide.ui.ca.j6(r3.FH));     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(android.app.Activity r8, com.aide.ui.scm.GitStatus r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -1274326430554226181L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-1274326430554226181L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent(r8, com.aide.ui.activities.CommitActivity.class);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("GITSTATUS", r9);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("GITBRANCH", r10);     // Catch: java.lang.Throwable -> L7
        r8.startActivity(r0);     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.ui.activities.CommitActivity r0, int r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = -781535969160181209L)
    private void j6(com.aide.ui.scm.ModifiedFile r7) {
    L40:
        th = move-exception;
        if (Hw == false) goto L44;
        abcd.wu.j6(th, -304809964004122200L, this, r7);
    L44:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-304809964004122200L, this, r7);     // Catch: java.lang.Throwable -> L40
    L6:
        com.aide.ui.scm.DiffView r2 = DW();     // Catch: java.lang.Throwable -> L40
        r2.a8();     // Catch: java.lang.Throwable -> L40
        if (r7.v5() == true) goto L21;
        if (r7.VH() == true) goto L21;
        if (abcd.Vl.we(r7.FH) == false) goto L21;
        if (r7.DW() == false) goto L15;
    L18:
        r2.setInformationalContent("New binary file");     // Catch: java.lang.Throwable -> L40
        return;
    L15:
        if (r7.gn() == true) goto L18;
        r2.setInformationalContent("Binary files differ");     // Catch: java.lang.Throwable -> L40
        return;
    L21:
        if (r7.DW() == false) goto L23;
    L38:
        r2.j6(null, r7.FH, r7.FH);     // Catch: java.lang.Throwable -> L40
        return;
    L23:
        if (r7.gn() == true) goto L38;
        if (this.gn.containsKey(r7) == true) goto L28;
        r2.lg();     // Catch: java.lang.Throwable -> L40
        com.aide.ui.U.Ws().j6(r7.FH, new com.aide.ui.activities.C1740l(this, r7));     // Catch: java.lang.Throwable -> L40
        return;
    L28:
        if (abcd.Vl.we(this.gn.get(r7)) == true) goto L30;
        r2.j6(this.gn.get(r7), r7.FH, r7.FH);     // Catch: java.lang.Throwable -> L40
        return;
    L30:
        if (r7.VH() == false) goto L32;
    L35:
        r2.setInformationalContent("Removed binary file");     // Catch: java.lang.Throwable -> L40
        return;
    L32:
        if (r7.v5() == true) goto L35;
        r2.setInformationalContent("Modified binary file");     // Catch: java.lang.Throwable -> L40
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2682489893020576736L)
    private android.widget.ListView v5() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2113281990456422175L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2113281990456422175L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.modifiedFilesList);
    }

    static java.util.BitSet v5(com.aide.ui.activities.CommitActivity r0) {
        return r0.Zo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.aide.ui.scm.DiffView DW() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2802579302195771616L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2802579302195771616L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.scm.DiffView) findViewById(com.almlkaide.kaypro.R.id.commitDiffView);
    }

    public void DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -793173584264308136L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-793173584264308136L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.j6(new com.aide.ui.activities.RunnableC1741m(this, r5));     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.aide.ui.views.CodeEditTextScrollView FH() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2266889942350166848L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2266889942350166848L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.views.CodeEditTextScrollView) findViewById(com.almlkaide.kaypro.R.id.commitDifferencesScrollView);
    }

    @Override
    public void j6(com.aide.engine.FileHighlightings r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2511446171184497259L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2511446171184497259L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        DW().j6(r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1338867733697592056L)
    protected void onActivityResult(int r9, int r10, android.content.Intent r11) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 1524858660306079687L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(1524858660306079687L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L5:
        abcd.wu.j6(this, r9, r10, r11);     // Catch: java.lang.Throwable -> L9
        if (r9 != 1194684) goto L16;
        com.aide.ui.U.QX().j6(r11);     // Catch: java.lang.Throwable -> L9
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    @abcd.Interfacesu(method = -1080814916814235612L)
    protected void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L17
        if (FH == false) goto L6;
        abcd.wu.j6(-422406117937911731L, this, r10);     // Catch: java.lang.Throwable -> L17
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L17
        setContentView(com.almlkaide.kaypro.R.layout.commitbrowser);     // Catch: java.lang.Throwable -> L17
        com.aide.common.ClassG.j6(findViewById(com.almlkaide.kaypro.R.id.commitFrame));     // Catch: java.lang.Throwable -> L17
        android.app.ActionBar r0 = getActionBar();     // Catch: java.lang.Throwable -> L17
        if (r0 == null) goto L15;
        java.lang.String r1 = getIntent().getStringExtra("GITBRANCH");     // Catch: java.lang.Throwable -> L17
        if (r1.startsWith("refs/heads/") == false) goto L12;
        r1 = r1.substring(11);     // Catch: java.lang.Throwable -> L17
    L14:
        r0.setSubtitle("Branch '" + r1 + "'");     // Catch: java.lang.Throwable -> L17
        goto L15
    L12:
        if (r1.startsWith("refs/") == false) goto L14;
        r1 = r1.substring(5);     // Catch: java.lang.Throwable -> L17
    L15:
        com.aide.ui.views.SplitView r2 = (com.aide.ui.views.SplitView) findViewById(com.almlkaide.kaypro.R.id.commitSplitView);     // Catch: java.lang.Throwable -> L17
        r2.openSplit(r2.splitHorizontalByDefault(), false);     // Catch: java.lang.Throwable -> L17
        r2.setSwipeEnabled(true);     // Catch: java.lang.Throwable -> L17
        com.aide.ui.scm.GitStatus r3 = (com.aide.ui.scm.GitStatus) getIntent().getExtras().getParcelable("GITSTATUS");     // Catch: java.lang.Throwable -> L17
        this.u7 = r3.FH;     // Catch: java.lang.Throwable -> L17
        android.widget.ListView r4 = v5();     // Catch: java.lang.Throwable -> L17
        r4.setChoiceMode(1);     // Catch: java.lang.Throwable -> L17
        r4.setOnItemClickListener(new com.aide.ui.activities.ClassI(this, r4));     // Catch: java.lang.Throwable -> L17
        r4.setOnItemLongClickListener(new com.aide.ui.activities.ClassJ(this, r4));     // Catch: java.lang.Throwable -> L17
        com.aide.ui.U.er().j6(this);     // Catch: java.lang.Throwable -> L17
        this.VH = r3.Hw;     // Catch: java.lang.Throwable -> L17
        VH();     // Catch: java.lang.Throwable -> L17
        return;
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, -422406117937911731L, this, r10);
    L21:
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 5107533303540126515L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 1022199586962951852L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(1022199586962951852L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.common.Abstractma.j6(this, r8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, -3198675749903694651L, this, r5);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3198675749903694651L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        getMenuInflater().inflate(com.almlkaide.kaypro.R.menu.commit_options_menu, r5);     // Catch: java.lang.Throwable -> L9
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 2711118586902023440L)
    protected void onDestroy() {
    L12:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -2677466469117353517L, this);
    L17:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2677466469117353517L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        super/*android.app.Activity*/.onDestroy();     // Catch: java.lang.Throwable -> L12
        com.aide.ui.U.er().DW(this);     // Catch: java.lang.Throwable -> L12
        java.util.Iterator<java.lang.String> r2 = this.gn.values().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        new java.io.File(r2.next()).delete();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(android.view.MenuItem r8) {
    L16:
        th = move-exception;
        if (Hw == false) goto L20;
        abcd.wu.j6(th, 1788518605786105744L, this, r8);
    L20:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(1788518605786105744L, this, r8);     // Catch: java.lang.Throwable -> L16
    L7:
        switch(r8.getItemId()) {
            case com.almlkaide.kaypro.R.id.commitMenuCommit: goto L12;
            case com.almlkaide.kaypro.R.id.commitMenuDiscard: goto L9;
            default: goto L15;
        };     // Catch: java.lang.Throwable -> L16
    L9:
        com.aide.common.Abstractma.j6(this, "Git discard", "Really discard the selected changes?", new com.aide.ui.activities.RunnableC1739k(this), null);     // Catch: java.lang.Throwable -> L16
        return true;
    L15:
        return super/*android.app.Activity*/.onOptionsItemSelected(r8);
    L12:
        if (com.aide.ui.U.U2().j6(com.aide.ui.U.VH(), "git_commit") == false) goto L14;
        com.aide.common.Abstractma.j6(this, new abcd.ii());     // Catch: java.lang.Throwable -> L16
    L14:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2642198037502627512L)
    protected void onPause() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -33752200746373725L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-33752200746373725L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onPause();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.DW(this);     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -741081188029750209L)
    protected void onResume() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1783445337206150100L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1783445337206150100L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onResume();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.j6(this);     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2476503859650274536L)
    protected void onStart() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 112583673103187055L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(112583673103187055L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStart();     // Catch: java.lang.Throwable -> L8
        abcd.F.DW(this, "Commit");     // Catch: java.lang.Throwable -> L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = 350423884828505712L)
    protected void onStop() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -1986428507550199485L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1986428507550199485L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super/*android.app.Activity*/.onStop();     // Catch: java.lang.Throwable -> L8
        abcd.F.j6(this, "Commit");     // Catch: java.lang.Throwable -> L8
    }
}
