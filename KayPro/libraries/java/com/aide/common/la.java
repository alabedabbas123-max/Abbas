package com.aide.common;

@abcd.Interfacexu
class la extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.Runnable EQ;
    final java.util.List gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;
    final java.lang.String we;

    static {
        abcd.wu.j6(com.aide.common.la.class, 5024868934807443193L, -3958661144945612280L);
    }

    la(java.util.List r1, com.aide.common.ab r2, java.lang.String r3, java.lang.Runnable r4, java.lang.String r5) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
    }

    @Override
    @abcd.Interfacesu(method = -2296044638408974725L)
    public android.app.Dialog j6(android.app.Activity r8) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 595647118095645911L, this, r8);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(595647118095645911L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L11
        r2.setCancelable(true).setItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), new com.aide.common.DialogInterfaceOnClickListenerka(this)).setPositiveButton(this.tp, new com.aide.common.DialogInterfaceOnClickListenerja(this));     // Catch: java.lang.Throwable -> L11
        if (this.we == null) goto L9;
        r2.setTitle(this.we);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L11
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L11
        return r3;
    }
}
