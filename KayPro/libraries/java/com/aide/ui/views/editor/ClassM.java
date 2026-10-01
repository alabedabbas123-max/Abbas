package com.aide.ui.views.editor;

@abcd.Interfacexu
public class ClassM {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1393634085644501664L)
    private java.util.Timer FH;

    @abcd.Interfaceru(field = 1649463631844912792L)
    private com.aide.ui.views.editor.OConsole Hw;

    @abcd.Interfaceru(field = -2777933818021222731L)
    private int VH;

    @abcd.Interfaceru(field = 1358268596901866496L)
    private boolean Zo;

    @abcd.Interfaceru(field = -808073286918699120L)
    private boolean v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassM.class, 108167760189617513L, 108167760189617513L);
    }

    public ClassM() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3887315777533480359L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3887315777533480359L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this(500);     // Catch: java.lang.Throwable -> L8
    }

    public ClassM(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 333024907548941836L, null, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(333024907548941836L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = true;     // Catch: java.lang.Throwable -> L8
        this.Zo = true;     // Catch: java.lang.Throwable -> L8
        this.VH = r6;     // Catch: java.lang.Throwable -> L8
    }

    static boolean DW(com.aide.ui.views.editor.ClassM r0) {
        return r0.v5;
    }

    static com.aide.ui.views.editor.OConsole FH(com.aide.ui.views.editor.ClassM r0) {
        return r0.Hw;
    }

    static boolean j6(com.aide.ui.views.editor.ClassM r0) {
        return r0.Zo;
    }

    static boolean j6(com.aide.ui.views.editor.ClassM r0, boolean r1) {
        r0.v5 = r1;
        return r1;
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1570498758634184064L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1570498758634184064L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6();     // Catch: java.lang.Throwable -> L8
        this.v5 = true;     // Catch: java.lang.Throwable -> L8
        this.FH = new java.util.Timer("Caret", true);     // Catch: java.lang.Throwable -> L8
        this.FH.scheduleAtFixedRate(new com.aide.ui.views.editor.ClassL(this), 1000, this.VH);     // Catch: java.lang.Throwable -> L8
    }

    public void j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2983281144138703763L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2983281144138703763L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.FH == null) goto L9;
        this.FH.cancel();     // Catch: java.lang.Throwable -> L11
        this.FH = null;     // Catch: java.lang.Throwable -> L11
    L9:
        this.v5 = false;     // Catch: java.lang.Throwable -> L11
    }

    public void j6(com.aide.ui.views.editor.OConsole r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 8777876193714367L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(8777876193714367L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r5;     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.ui.views.editor.ClassY r6, float r7, float r8, float r9, float r10, boolean r11, com.aide.ui.views.editor.ClassJ r12) {
        if (j6 == false) goto L6;
        abcd.wu.j6(2282581153751480824L, this, new java.lang.Object[]{r6, new java.lang.Float(r7), new java.lang.Float(r8), new java.lang.Float(r9), new java.lang.Float(r10), new java.lang.Boolean(r11), r12});
    L6:
        if (this.v5 == true) goto L8;
        return;
    L8:
        if (r6.j6() == null) goto L14;
        if (r11 == true) goto L15;
        com.aide.ui.views.editor.ClassJ r13 = r6.FH();
        r6.j6(r12);
        r6.FH(r7, r8, this.Hw.getFontHeight() / 20.0f, r10);
        r6.j6(r13);
        return;
    L15:
        return;
    }

    public void j6(boolean r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 471271574312139995L, this, new java.lang.Boolean(r5));
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(471271574312139995L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        this.Zo = r5;     // Catch: java.lang.Throwable -> L10
        this.v5 = true;     // Catch: java.lang.Throwable -> L10
        if (this.Hw.isShown() == false) goto L17;
        this.Hw.QX();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
