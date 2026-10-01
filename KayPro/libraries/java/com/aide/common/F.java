package com.aide.common;

@abcd.Interfacexu
class F implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.H v5;

    static {
        abcd.wu.j6(com.aide.common.F.class, 5024868934807443193L, -5838906819314025125L);
    }

    F(com.aide.common.H r1, android.app.Activity r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -203263860497548620L)
    public void onShow(android.content.DialogInterface r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1384233909731588091L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1384233909731588091L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).showSoftInput(this.Hw, 1);     // Catch: java.lang.Throwable -> L8
        this.Hw.selectAll();     // Catch: java.lang.Throwable -> L8
    }
}
