package com.aide.ui.browsers;

@abcd.Interfacexu
public class LogCatBrowser extends android.widget.LinearLayout implements abcd.Gk.b, com.aide.ui.browsers.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2213379967895764992L)
    private boolean FH;

    @abcd.Interfaceru(field = 818110698334428443L)
    private boolean Hw;

    static {
        abcd.wu.j6(com.aide.ui.browsers.LogCatBrowser.class, 7477716827155690953L, 7477716827155690953L);
    }

    public LogCatBrowser(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3391270462590117360L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3391270462590117360L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        QX();     // Catch: java.lang.Throwable -> L8
    }

    public LogCatBrowser(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4840727608924488435L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4840727608924488435L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        QX();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -154818912667366899L)
    private void QX() {
    L23:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, -234241693491009035L, this);
    L27:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-234241693491009035L, this);     // Catch: java.lang.Throwable -> L23
    L6:
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L23
        android.view.View r2 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.logcatbrowser, null);     // Catch: java.lang.Throwable -> L23
        removeAllViews();     // Catch: java.lang.Throwable -> L23
        addView(r2);     // Catch: java.lang.Throwable -> L23
        android.widget.ImageView r3 = (android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.logcatHeaderMenuButton);     // Catch: java.lang.Throwable -> L23
        r3.setOnClickListener(new com.aide.ui.browsers.m(this, r3));     // Catch: java.lang.Throwable -> L23
        boolean r5 = false;
        android.content.SharedPreferences r4 = getContext().getSharedPreferences("Logcat", 0);     // Catch: java.lang.Throwable -> L23
        int r6 = r4.getInt("FilterType", -1);     // Catch: java.lang.Throwable -> L23
        java.lang.String r7 = r4.getString("FilterValue", "");     // Catch: java.lang.Throwable -> L23
        if (r6 < 0) goto L9;
        r5 = true;
    L9:
        this.Hw = r5;     // Catch: java.lang.Throwable -> L23
        if (r6 == 0) goto L20;
        if (r6 != 1) goto L13;
        getConsole().v5(r7);     // Catch: java.lang.Throwable -> L23
    L21:
        com.aide.ui.U.a8().j6(this);     // Catch: java.lang.Throwable -> L23
        return;
    L13:
        if (r6 != 2) goto L15;
        getConsole().Hw(r7);     // Catch: java.lang.Throwable -> L23
        goto L21
    L15:
        if (r6 != 3) goto L21;
        getConsole().DW(r7);     // Catch: java.lang.Throwable -> L23
        goto L21
    L20:
        getConsole().FH(r7);     // Catch: java.lang.Throwable -> L23
        goto L21
    }

    @abcd.Interfacesu(method = 364511122984474760L)
    private void XL() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -3598202661913812744L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3598202661913812744L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        abcd.Gk r2 = com.aide.ui.U.a8();     // Catch: java.lang.Throwable -> L14
        if (isShown() == true) goto L9;
    L11:
        boolean r3 = false;
    L12:
        r2.j6(r3);     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        if (this.FH == true) goto L11;
        r3 = true;
        goto L12
    }

    @abcd.Interfacesu(method = 882312505897087104L)
    private com.aide.ui.LogCatConsole getConsole() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1552867225769129280L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1552867225769129280L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.LogCatConsole) findViewById(com.almlkaide.kaypro.R.id.logcatConsole);
    }

    static com.aide.ui.LogCatConsole j6(com.aide.ui.browsers.LogCatBrowser r0) {
        return r0.getConsole();
    }

    @abcd.Interfacesu(method = -1044960461859182555L)
    private void j6(int r8, java.lang.String r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1816673659634517117L, this, new java.lang.Integer(r8), r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1816673659634517117L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L10
    L5:
        boolean r2 = false;
        android.content.SharedPreferences.Editor r0 = getContext().getSharedPreferences("Logcat", 0).edit();     // Catch: java.lang.Throwable -> L10
        r0.putInt("FilterType", r8);     // Catch: java.lang.Throwable -> L10
        r0.putString("FilterValue", r9);     // Catch: java.lang.Throwable -> L10
        r0.commit();     // Catch: java.lang.Throwable -> L10
        if (r8 < 0) goto L8;
        r2 = true;
    L8:
        this.Hw = r2;     // Catch: java.lang.Throwable -> L10
    }

    static void j6(com.aide.ui.browsers.LogCatBrowser r0, int r1, java.lang.String r2) {
        r0.j6(r1, r2);
    }

    @Override
    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2240505120460587047L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2240505120460587047L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        XL();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.a8().Zo();     // Catch: java.lang.Throwable -> L8
    }

    public void EQ() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2005681202283578379L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2005681202283578379L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().er();     // Catch: java.lang.Throwable -> L8
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3706890429276918991L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3706890429276918991L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().a8();     // Catch: java.lang.Throwable -> L8
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 385753486758046632L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(385753486758046632L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(-1, "");     // Catch: java.lang.Throwable -> L8
        getConsole().lg();     // Catch: java.lang.Throwable -> L8
    }

    public boolean J0() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3205440259059028185L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3205440259059028185L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public void J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2186967230605215707L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2186967230605215707L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = true;     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
    }

    public void VH() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -3258117951479065443L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3258117951479065443L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r2 = com.aide.ui.U.vy().J0();     // Catch: java.lang.Throwable -> L10
        if (abcd.C0790gj.P8(r2) == false) goto L17;
        java.lang.String r3 = abcd.C0790gj.FH(r2, com.aide.ui.U.vy().tp());     // Catch: java.lang.Throwable -> L10
        j6(3, r3);     // Catch: java.lang.Throwable -> L10
        getConsole().DW(r3);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void Ws() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 836057295500169096L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(836057295500169096L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = false;     // Catch: java.lang.Throwable -> L8
        XL();     // Catch: java.lang.Throwable -> L8
    }

    public void Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -240674225994284784L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-240674225994284784L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().v5();     // Catch: java.lang.Throwable -> L8
    }

    public void gn() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3641153637260431752L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3641153637260431752L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Priority", getConsole().getAllPriortities(), new com.aide.ui.browsers.p(this));     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2534558566514297031L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2534558566514297031L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().gn();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(abcd.Gk.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4444229387523971408L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4444229387523971408L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().j6(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 238041878469925768L)
    protected void onVisibilityChanged(android.view.View r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -286682196272051320L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-286682196272051320L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        super.onVisibilityChanged(r8, r9);     // Catch: java.lang.Throwable -> L7
        XL();     // Catch: java.lang.Throwable -> L7
    }

    public void tp() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3258842333447503116L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3258842333447503116L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Tag", getConsole().getAllTags(), new com.aide.ui.browsers.o(this));     // Catch: java.lang.Throwable -> L8
    }

    public void u7() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2216493261410518929L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2216493261410518929L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Process", getConsole().getAllProcesses(), new com.aide.ui.browsers.n(this));     // Catch: java.lang.Throwable -> L8
    }

    public void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -131349981993044319L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-131349981993044319L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getConsole().rN();     // Catch: java.lang.Throwable -> L8
    }

    public boolean we() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3874567268021625792L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3874567268021625792L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }
}
