package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerea implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ga FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerea.class, 5024868934807443193L, 4520442404914297257L);
    }

    DialogInterfaceOnClickListenerea(com.aide.common.ga r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 939821529682376064L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1704067078611090717L, this, r8, new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1704067078611090717L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L16
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L16
        android.util.SparseBooleanArray r1 = ((android.app.AlertDialog) r8).getListView().getCheckedItemPositions();     // Catch: java.lang.Throwable -> L16
        if (r1 == null) goto L14;
        int r2 = 0;
    L9:
        if (r2 >= this.FH.u7.size()) goto L14;
        if (r1.get(r2) == false) goto L13;
        r0.add(java.lang.Integer.valueOf(r2));     // Catch: java.lang.Throwable -> L16
    L13:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L16
    L14:
        this.FH.tp.j6(r0);     // Catch: java.lang.Throwable -> L16
    }
}
