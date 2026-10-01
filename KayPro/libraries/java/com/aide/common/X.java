package com.aide.common;

@abcd.Interfacexu
class X implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.common.KeyStrokeEditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Y v5;

    static {
        abcd.wu.j6(com.aide.common.X.class, 5024868934807443193L, 4519686778025153200L);
    }

    X(com.aide.common.Y r1, android.app.Activity r2, com.aide.common.KeyStrokeEditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 31190422741758280L)
    public void onShow(android.content.DialogInterface r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 23183029202919651L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(23183029202919651L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).showSoftInput(this.Hw, 1);     // Catch: java.lang.Throwable -> L8
        this.Hw.selectAll();     // Catch: java.lang.Throwable -> L8
    }
}
