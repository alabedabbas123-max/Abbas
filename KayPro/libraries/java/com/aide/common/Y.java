package com.aide.common;

@abcd.Interfacexu
class Y extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final com.aide.common.ClassU gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;

    static {
        abcd.wu.j6(com.aide.common.Y.class, 5024868934807443193L, -3958184635531839695L);
    }

    Y(com.aide.common.ClassU r1, com.aide.common.ab r2, java.lang.String r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 2538487364002070459L)
    public android.app.Dialog j6(android.app.Activity r8) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -4965164946137233320L, this, r8);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4965164946137233320L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        com.aide.common.KeyStrokeEditText r2 = new com.aide.common.KeyStrokeEditText(r8);     // Catch: java.lang.Throwable -> L11
        r2.setKeyStroke(this.gn);     // Catch: java.lang.Throwable -> L11
        r2.setOnEditorActionListener(new com.aide.common.T(this, r8, r2));     // Catch: java.lang.Throwable -> L11
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L11
        r3.setView(r2).setMessage(this.tp).setCancelable(true).setPositiveButton(r8.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.W(this, r8, r2)).setNegativeButton(r8.getResources().getString(com.aide.ui.Ra.dialog_cancel), new com.aide.common.V(this, r8, r2)).setNeutralButton("Default", new com.aide.common.U(this, r8, r2));     // Catch: java.lang.Throwable -> L11
        if (this.EQ == null) goto L9;
        r3.setTitle(this.EQ);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r4 = r3.create();     // Catch: java.lang.Throwable -> L11
        r4.setOnShowListener(new com.aide.common.X(this, r8, r2));     // Catch: java.lang.Throwable -> L11
        return r4;
    }
}
