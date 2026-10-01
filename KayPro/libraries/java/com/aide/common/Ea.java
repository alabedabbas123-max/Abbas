package com.aide.common;

@abcd.Interfacexu
class Ea implements android.widget.TextView.OnEditorActionListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.Ea.class, -6420951009284476296L, 7363122391034149488L);
    }

    Ea(com.aide.common.Fa r1, android.app.Activity r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 570657690056460832L)
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -6959638322589074139L, this, r9, new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6959638322589074139L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r10 != 6) goto L8;
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L9
        com.aide.common.Fa.Hw(this.v5).dismiss();     // Catch: java.lang.Throwable -> L9
        com.aide.common.Fa.FH(this.v5).j6(this.Hw.getText().toString().trim());     // Catch: java.lang.Throwable -> L9
    L8:
        return false;
    }
}
