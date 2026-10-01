package com.aide.common;

@abcd.Interfacexu
class T implements android.widget.TextView.OnEditorActionListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.common.KeyStrokeEditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Y v5;

    static {
        abcd.wu.j6(com.aide.common.T.class, 5024868934807443193L, 4519301965193734920L);
    }

    T(com.aide.common.Y r1, android.app.Activity r2, com.aide.common.KeyStrokeEditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -993813909150269361L)
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -2495709819222243729L, this, r9, new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2495709819222243729L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r10 != 6) goto L8;
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L9
        this.v5.u7.j6(this.Hw.getKeyStroke());     // Catch: java.lang.Throwable -> L9
    L8:
        return false;
    }
}
