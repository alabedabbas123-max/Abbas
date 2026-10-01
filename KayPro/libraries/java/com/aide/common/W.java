package com.aide.common;

@abcd.Interfacexu
class W implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.common.KeyStrokeEditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Y v5;

    static {
        abcd.wu.j6(com.aide.common.W.class, 5024868934807443193L, 4519590574811203689L);
    }

    W(com.aide.common.Y r1, android.app.Activity r2, com.aide.common.KeyStrokeEditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -474917893937840045L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 75752972867770851L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(75752972867770851L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L7
        this.v5.u7.j6(this.Hw.getKeyStroke());     // Catch: java.lang.Throwable -> L7
    }
}
