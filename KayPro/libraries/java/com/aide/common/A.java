package com.aide.common;

@abcd.Interfacexu
class A extends android.widget.EditText {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.app.AlertDialog[] Hw;

    @abcd.Interfacevu
    final com.aide.common.H v5;

    static {
        abcd.wu.j6(com.aide.common.A.class, 5024868934807443193L, -5838321869418469980L);
    }

    A(com.aide.common.H r1, android.content.Context r2, android.app.Activity r3, android.app.AlertDialog[] r4) {
        this.v5 = r1;
        this.FH = r3;
        this.Hw = r4;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = 901225170902436924L)
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 980333327092953015L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(980333327092953015L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r8 != 66) goto L9;
        return true;
    L9:
        return super.onKeyDown(r8, r9);
    }

    @Override
    @abcd.Interfacesu(method = -318824384747203335L)
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -429576779136611040L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-429576779136611040L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r8 != 66) goto L10;
        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);     // Catch: java.lang.Throwable -> L11
        this.Hw[0].dismiss();     // Catch: java.lang.Throwable -> L11
        this.v5.gn.j6(getText().toString().trim());     // Catch: java.lang.Throwable -> L11
        return true;
    L10:
        return super.onKeyUp(r8, r9);
    }
}
