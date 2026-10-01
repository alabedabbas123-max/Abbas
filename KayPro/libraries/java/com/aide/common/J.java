package com.aide.common;

@abcd.Interfacexu
class J extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.lang.String gn;
    final java.lang.Runnable tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.common.J.class, 5024868934807443193L, -3957898729834816616L);
    }

    J(java.lang.String r1, java.lang.String r2, java.lang.Runnable r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -864884099276615355L)
    public android.app.Dialog j6(android.app.Activity r8) {
    L14:
        th = move-exception;
        if (VH == false) goto L18;
        abcd.wu.j6(th, 400819676430452160L, this, r8);
    L18:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(400819676430452160L, this, r8);     // Catch: java.lang.Throwable -> L14
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L14
        r2.setMessage(this.gn).setCancelable(true).setPositiveButton(r8.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenery(this));     // Catch: java.lang.Throwable -> L14
        if (this.u7 == null) goto L10;
        r2 = r2.setNegativeButton(this.u7, new com.aide.common.DialogInterfaceOnClickListenerz(this));     // Catch: java.lang.Throwable -> L14
    L10:
        if (this.EQ == null) goto L12;
        r2 = r2.setTitle(this.EQ);     // Catch: java.lang.Throwable -> L14
    L12:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L14
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L14
        return r3;
    }
}
