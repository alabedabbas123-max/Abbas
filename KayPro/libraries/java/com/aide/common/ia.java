package com.aide.common;

@abcd.Interfacexu
class ia extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.util.List gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;

    static {
        abcd.wu.j6(com.aide.common.ia.class, 5024868934807443193L, -3958565843070984351L);
    }

    ia(java.util.List r1, com.aide.common.ab r2, java.lang.String r3) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
    }

    @Override
    @abcd.Interfacesu(method = -3021180994019088999L)
    public android.app.Dialog j6(android.app.Activity r8) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -2548067668697914160L, this, r8);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2548067668697914160L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L11
        r2.setCancelable(true).setItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), new com.aide.common.DialogInterfaceOnClickListenerha(this));     // Catch: java.lang.Throwable -> L11
        if (this.tp == null) goto L9;
        r2.setTitle(this.tp);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L11
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L11
        return r3;
    }
}
