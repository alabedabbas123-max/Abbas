package com.aide.common;

@abcd.Interfacexu
class S extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.lang.Runnable J0;
    final java.lang.String J8;
    final java.lang.String gn;
    final java.lang.Runnable tp;
    final java.lang.String u7;
    final java.lang.Runnable we;

    static {
        abcd.wu.j6(com.aide.common.S.class, 5024868934807443193L, -3958089333636895296L);
    }

    S(java.lang.String r1, java.lang.String r2, java.lang.Runnable r3, java.lang.String r4, java.lang.Runnable r5, java.lang.Runnable r6, java.lang.String r7) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
        this.J0 = r6;
        this.J8 = r7;
    }

    @Override
    @abcd.Interfacesu(method = 2456860913533244495L)
    public android.app.Dialog j6(android.app.Activity r8) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -2248646446936728765L, this, r8);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2248646446936728765L, this, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r8);     // Catch: java.lang.Throwable -> L11
        r2.setMessage(this.gn).setCancelable(true).setPositiveButton(this.u7, new com.aide.common.P(this)).setNegativeButton(this.EQ, new com.aide.common.O(this));     // Catch: java.lang.Throwable -> L11
        r2.setOnCancelListener(new com.aide.common.Q(this));     // Catch: java.lang.Throwable -> L11
        if (this.J8 == null) goto L9;
        r2.setTitle(this.J8);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L11
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L11
        return r3;
    }
}
