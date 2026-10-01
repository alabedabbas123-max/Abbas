package com.aide.common;

@abcd.Interfacexu
class da extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.util.List gn;
    final com.aide.common.ab tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.common.da.class, 5024868934807443193L, -3958375239309538611L);
    }

    da(java.util.List r1, java.lang.String r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 2304848254897192840L)
    public android.app.Dialog j6(android.app.Activity r9) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 456209340131499376L, this, r9);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(456209340131499376L, this, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r9);     // Catch: java.lang.Throwable -> L11
        int r3 = this.gn.indexOf(this.u7);     // Catch: java.lang.Throwable -> L11
        r2.setCancelable(true).setSingleChoiceItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), r3, new com.aide.common.DialogInterfaceOnClickListenerca(this)).setPositiveButton(r9.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenerba(this));     // Catch: java.lang.Throwable -> L11
        if (this.EQ == null) goto L9;
        r2.setTitle(this.EQ);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r4 = r2.create();     // Catch: java.lang.Throwable -> L11
        r4.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L11
        return r4;
    }
}
