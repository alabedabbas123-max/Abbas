package com.aide.common;

@abcd.Interfacexu
class C implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.H v5;

    static {
        abcd.wu.j6(com.aide.common.C.class, 5024868934807443193L, -5838555849388881920L);
    }

    C(com.aide.common.H r1, android.app.Activity r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 134833045889052693L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4015133962374094011L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4015133962374094011L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);     // Catch: java.lang.Throwable -> L7
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
        this.v5.gn.j6(this.Hw.getText().toString().trim());     // Catch: java.lang.Throwable -> L7
    }
}
