package com.aide.common;

@abcd.Interfacexu
class G implements android.widget.TextView.OnEditorActionListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.H Zo;
    final android.app.AlertDialog[] v5;

    static {
        abcd.wu.j6(com.aide.common.G.class, 5024868934807443193L, -5839023809280946272L);
    }

    G(com.aide.common.H r1, android.app.Activity r2, android.widget.EditText r3, android.app.AlertDialog[] r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = 424286445554509608L)
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -3840513526520815705L, this, r9, new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3840513526520815705L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r10 != 6) goto L8;
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L9
        this.v5[0].dismiss();     // Catch: java.lang.Throwable -> L9
        this.Zo.gn.j6(this.Hw.getText().toString().trim());     // Catch: java.lang.Throwable -> L9
    L8:
        return false;
    }
}
