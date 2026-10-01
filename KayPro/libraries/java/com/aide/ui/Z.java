package com.aide.ui;

@abcd.Interfacexu
public class Z {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2673557389408368568L)
    private int FH;

    @abcd.Interfaceru(field = 995749408906923615L)
    private com.aide.ui.MainActivity Hw;

    @abcd.Interfaceru(field = 2848292792606770712L)
    private boolean VH;

    @abcd.Interfaceru(field = -970253835911781660L)
    private android.widget.PopupMenu Zo;

    @abcd.Interfaceru(field = 1001059706434660995L)
    private android.view.ActionMode v5;

    static {
        abcd.wu.j6(com.aide.ui.Z.class, -583473860859722665L, -583473860859722665L);
    }

    public Z(com.aide.ui.MainActivity r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5203549328229951309L, null, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5203549328229951309L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw = r8;     // Catch: java.lang.Throwable -> L7
        this.FH = r9;     // Catch: java.lang.Throwable -> L7
    }

    static com.aide.ui.MainActivity DW(com.aide.ui.Z r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 3738585348802249921L)
    private void DW(android.view.MenuItem r9) {
    L35:
        th = move-exception;
        if (DW == false) goto L39;
        abcd.wu.j6(th, -1755407012901552465L, this, r9);
    L39:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1755407012901552465L, this, r9);     // Catch: java.lang.Throwable -> L35
    L6:
        int r2 = r9.getItemId();     // Catch: java.lang.Throwable -> L35
        int r3 = j6(r2);     // Catch: java.lang.Throwable -> L35
        abcd.InterfaceYl r4 = com.aide.ui.V.DW(r2);     // Catch: java.lang.Throwable -> L35
        boolean r6 = true;
        if (r2 != com.almlkaide.kaypro.R.id.editorMenuFix) goto L17;
        com.aide.engine.SyntaxError r5 = FH();     // Catch: java.lang.Throwable -> L35
        if (r5 != null) goto L11;
    L15:
        r6 = false;
    L16:
        r9.setVisible(r6);     // Catch: java.lang.Throwable -> L35
        return;
    L11:
        if (r5.tp == null) goto L15;
        if (r5.tp.length <= 0) goto L15;
    L17:
        if (r3 < 0) goto L26;
        com.aide.engine.SyntaxError r7 = FH();     // Catch: java.lang.Throwable -> L35
        if (r7 != null) goto L21;
    L25:
        r9.setVisible(false);     // Catch: java.lang.Throwable -> L35
        return;
    L21:
        if (r7.tp == null) goto L25;
        if (r7.tp.length <= r3) goto L25;
        r9.setTitle(r7.tp[r3]);     // Catch: java.lang.Throwable -> L35
        r9.setVisible(true);     // Catch: java.lang.Throwable -> L35
        return;
    L26:
        if (r4 == null) goto L44;
        r9.setEnabled(r4.isEnabled());     // Catch: java.lang.Throwable -> L35
        if ((r4 instanceof abcd.Interface_l) == false) goto L45;
        abcd.Interface_l r8 = (abcd.Interface_l) r4;     // Catch: java.lang.Throwable -> L35
        if (this.VH == false) goto L33;
        r6 = false;
    L33:
        r9.setVisible(r8.j6(r6));     // Catch: java.lang.Throwable -> L35
        return;
    L45:
        return;
    }

    static int FH(com.aide.ui.Z r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 5171501588721899172L)
    private com.aide.engine.SyntaxError FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5209578430772988200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5209578430772988200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Tl r2 = com.aide.ui.U.lg().J8().getCurrentFileSpan();     // Catch: java.lang.Throwable -> L8
        return com.aide.ui.U.we().DW(r2.FH, r2.Hw, r2.v5, r2.Zo, r2.VH);
    }

    @abcd.Interfacesu(method = 567630484326148628L)
    private int j6(int r5) {
    L21:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 229372328685032568L, this, new java.lang.Integer(r5));
    L25:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(229372328685032568L, this, r5);     // Catch: java.lang.Throwable -> L21
    L6:
        switch(r5) {
            case com.almlkaide.kaypro.R.id.editorMenuFix0: goto L19;
            case com.almlkaide.kaypro.R.id.editorMenuFix1: goto L17;
            case com.almlkaide.kaypro.R.id.editorMenuFix2: goto L15;
            case com.almlkaide.kaypro.R.id.editorMenuFix3: goto L13;
            case com.almlkaide.kaypro.R.id.editorMenuFix4: goto L11;
            case com.almlkaide.kaypro.R.id.editorMenuFix5: goto L9;
            default: goto L7;
        };
    L7:
        return -1;
    L9:
        return 5;
    L11:
        return 4;
    L13:
        return 3;
    L15:
        return 2;
    L17:
        return 1;
    L19:
        return 0;
    }

    static android.view.ActionMode j6(com.aide.ui.Z r0, android.view.ActionMode r1) {
        r0.v5 = r1;
        return r1;
    }

    static android.widget.PopupMenu j6(com.aide.ui.Z r0) {
        return r0.Zo;
    }

    static android.widget.PopupMenu j6(com.aide.ui.Z r0, android.widget.PopupMenu r1) {
        r0.Zo = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -3672315906798082425L)
    private boolean j6(android.view.Menu r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 2678924594937412665L, this, r6);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2678924594937412665L, this, r6);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = 0;
    L7:
        if (r2 >= r6.size()) goto L13;
        android.view.MenuItem r3 = r6.getItem(r2);     // Catch: java.lang.Throwable -> L15
        DW(r3);     // Catch: java.lang.Throwable -> L15
        if (r3.getSubMenu() == null) goto L12;
        j6(r3.getSubMenu());     // Catch: java.lang.Throwable -> L15
    L12:
        r2 = r2 + 1;
        goto L7
    L13:
        return true;
    }

    @abcd.Interfacesu(method = -1131019222019471785L)
    private boolean j6(android.view.MenuItem r6) {
    L22:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 1699403057877220933L, this, r6);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1699403057877220933L, this, r6);     // Catch: java.lang.Throwable -> L22
    L6:
        int r2 = r6.getItemId();     // Catch: java.lang.Throwable -> L22
        int r3 = j6(r2);     // Catch: java.lang.Throwable -> L22
        abcd.InterfaceYl r4 = com.aide.ui.V.DW(r2);     // Catch: java.lang.Throwable -> L22
        if (r3 < 0) goto L17;
        com.aide.engine.SyntaxError r5 = FH();     // Catch: java.lang.Throwable -> L22
        if (r5 != null) goto L11;
        return true;
    L11:
        if (r5.tp != null) goto L13;
        return true;
    L13:
        if (r5.tp.length <= r3) goto L30;
        com.aide.ui.U.lg().cb();     // Catch: java.lang.Throwable -> L22
        com.aide.ui.U.EQ().j6(r5, r3);     // Catch: java.lang.Throwable -> L22
        return true;
    L30:
        return true;
    L17:
        if (r4 == null) goto L20;
        abcd.F.j6("Quick Action Menu: " + r6.getTitle());     // Catch: java.lang.Throwable -> L22
        return r4.run();
    L20:
        return false;
    }

    static boolean j6(com.aide.ui.Z r0, android.view.Menu r1) {
        return r0.j6(r1);
    }

    static boolean j6(com.aide.ui.Z r0, android.view.MenuItem r1) {
        return r0.j6(r1);
    }

    public void DW() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1749789399746372621L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1749789399746372621L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.v5 == null) goto L17;
        this.v5.invalidate();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2241692135330717036L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2241692135330717036L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.v5 == null) goto L17;
        this.v5.finish();     // Catch: java.lang.Throwable -> L10
        this.v5 = null;     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6(android.view.View r8, boolean r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2252974524077968692L, this, r8, new java.lang.Boolean(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2252974524077968692L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L10
    L5:
        j6();     // Catch: java.lang.Throwable -> L10
        this.VH = r9;     // Catch: java.lang.Throwable -> L10
        if (this.Zo == null) goto L8;
        this.Zo.dismiss();     // Catch: java.lang.Throwable -> L10
    L8:
        new android.os.Handler().post(new com.aide.ui.X(this, r8));     // Catch: java.lang.Throwable -> L10
    }

    public void j6(boolean r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1095756205709844720L, this, new java.lang.Boolean(r5));
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1095756205709844720L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.v5 != null) goto L17;
        this.VH = r5;     // Catch: java.lang.Throwable -> L10
        this.v5 = this.Hw.startActionMode(new com.aide.ui.Y(this));     // Catch: java.lang.Throwable -> L10
        this.Hw.v5(true);     // Catch: java.lang.Throwable -> L10
        return;
    }
}
