package com.aide.common;

@abcd.Interfacexu
class ga extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.util.List gn;
    final com.aide.common.ab tp;
    final java.util.List u7;

    static {
        abcd.wu.j6(com.aide.common.ga.class, 5024868934807443193L, -3958470541192293128L);
    }

    ga(java.util.List r1, java.util.List r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -3537804853451679195L)
    public android.app.Dialog j6(android.app.Activity r9) {
    L15:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, -76967748890346780L, this, r9);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-76967748890346780L, this, r9);     // Catch: java.lang.Throwable -> L15
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r9);     // Catch: java.lang.Throwable -> L15
        boolean[] r3 = new boolean[this.gn.size()];     // Catch: java.lang.Throwable -> L15
        int r5 = 0;
    L8:
        if (r5 >= r3.length) goto L10;
        r3[r5] = ((java.lang.Boolean) this.gn.get(r5)).booleanValue();     // Catch: java.lang.Throwable -> L15
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L15
        goto L8
    L10:
        r2.setCancelable(true).setMultiChoiceItems((java.lang.CharSequence[]) this.u7.toArray(new java.lang.CharSequence[0]), r3, new com.aide.common.DialogInterfaceOnMultiChoiceClickListenerfa(this)).setPositiveButton(r9.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenerea(this));     // Catch: java.lang.Throwable -> L15
        if (this.EQ == null) goto L13;
        r2.setTitle(this.EQ);     // Catch: java.lang.Throwable -> L15
    L13:
        android.app.AlertDialog r4 = r2.create();     // Catch: java.lang.Throwable -> L15
        r4.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L15
        return r4;
    }
}
