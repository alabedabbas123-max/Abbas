package com.aide.ui.views;

@abcd.Interfacexu
class e implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditText.c FH;

    static {
        abcd.wu.j6(com.aide.ui.views.e.class, 2358818556014640983L, 157055811690113679L);
    }

    e(com.aide.ui.views.CodeEditText.c r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 234803935760915021L)
    public void run() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1268670401927613468L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1268670401927613468L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        com.aide.ui.views.CodeEditText.c.j6(this.FH, true);     // Catch: java.lang.Throwable -> L11
        int r9 = com.aide.ui.views.CodeEditText.c.j6(this.FH, com.aide.ui.views.CodeEditText.c.DW(this.FH), com.aide.ui.views.CodeEditText.c.FH(this.FH));     // Catch: java.lang.Throwable -> L11
        int r2 = com.aide.ui.views.CodeEditText.c.DW(this.FH, com.aide.ui.views.CodeEditText.c.DW(this.FH), com.aide.ui.views.CodeEditText.c.FH(this.FH));     // Catch: java.lang.Throwable -> L11
        if (r9 <= 0) goto L18;
        if (r2 <= 0) goto L19;
        this.FH.performHapticFeedback(0, 1);     // Catch: java.lang.Throwable -> L11
        com.aide.ui.views.CodeEditText.j6(this.FH.PH, r9, com.aide.ui.views.CodeEditText.c.j6(this.FH, r9, r2), r9, com.aide.ui.views.CodeEditText.c.DW(this.FH, r9, r2), com.aide.ui.views.CodeEditText.v5(this.FH.PH));     // Catch: java.lang.Throwable -> L11
        return;
    L19:
        return;
    }
}
