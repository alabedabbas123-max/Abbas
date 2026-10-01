package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class i extends android.webkit.WebView {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.i.class, -3499094272017024501L, -3746765292644294208L);
    }

    i(com.aide.ui.htmluidesigner.WebDesignActivity r1, android.content.Context r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -657611775461375628L)
    protected void onScrollChanged(int r10, int r11, int r12, int r13) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 4155292460117247545L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4155292460117247545L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L12
    L5:
        super.onScrollChanged(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L12
        if (r11 != 0) goto L9;
        if (r13 <= 0) goto L9;
        com.aide.ui.htmluidesigner.WebDesignActivity.DW(this.FH).j6(true);     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        if (r11 <= 0) goto L19;
        com.aide.ui.htmluidesigner.WebDesignActivity.DW(this.FH).j6(false);     // Catch: java.lang.Throwable -> L12
        return;
    }
}
