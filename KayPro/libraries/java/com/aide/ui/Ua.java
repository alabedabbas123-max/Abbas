package com.aide.ui;

@abcd.Interfacexu
class Ua implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final com.aide.ui.Wa Hw;

    static {
        abcd.wu.j6(com.aide.ui.Ua.class, -2007863676330719029L, 5684436469974629952L);
    }

    Ua(com.aide.ui.Wa r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1898972765737693760L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 911452756204883580L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(911452756204883580L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.view.inputmethod.InputMethodManager) com.aide.ui.Wa.j6(this.Hw).getSystemService("input_method")).showSoftInput(this.FH, 1);     // Catch: java.lang.Throwable -> L8
        this.FH.postDelayed(new com.aide.ui.Ta(this), 300);     // Catch: java.lang.Throwable -> L8
    }
}
