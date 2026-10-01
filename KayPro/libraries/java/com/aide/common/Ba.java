package com.aide.common;

@abcd.Interfacexu
class Ba implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.Ba.class, -6420951009284476296L, 7362756807052165497L);
    }

    Ba(com.aide.common.Fa r1, android.app.Activity r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -741523471882601213L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1808075720639021869L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1808075720639021869L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L7
        com.aide.common.Fa.DW(this.v5).run();     // Catch: java.lang.Throwable -> L7
    }
}
