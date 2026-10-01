package com.aide.common;

@abcd.Interfacexu
class N extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.Runnable EQ;
    final java.lang.Runnable J0;
    final java.lang.String J8;
    final java.lang.String gn;
    final java.lang.String tp;
    final boolean u7;
    final java.lang.String we;

    static {
        abcd.wu.j6(com.aide.common.N.class, 5024868934807443193L, -3957994031737887603L);
    }

    N(java.lang.String r1, boolean r2, java.lang.String r3, java.lang.Runnable r4, java.lang.String r5, java.lang.Runnable r6, java.lang.String r7) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
        this.J0 = r6;
        this.J8 = r7;
    }

    @Override
    @abcd.Interfacesu(method = -2376518919812464035L)
    public android.app.Dialog j6(android.app.Activity r6) {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, 386175114217446220L, this, r6);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(386175114217446220L, this, r6);     // Catch: java.lang.Throwable -> L16
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r6);     // Catch: java.lang.Throwable -> L16
        r2.setMessage(this.gn).setCancelable(this.u7);     // Catch: java.lang.Throwable -> L16
        r2.setPositiveButton(this.tp, new com.aide.common.K(this));     // Catch: java.lang.Throwable -> L16
        if (this.we == null) goto L9;
        r2.setNegativeButton(this.we, new com.aide.common.L(this));     // Catch: java.lang.Throwable -> L16
    L9:
        r2.setOnCancelListener(new com.aide.common.M(this));     // Catch: java.lang.Throwable -> L16
        if (this.J8 == null) goto L12;
        r2.setTitle(this.J8);     // Catch: java.lang.Throwable -> L16
    L12:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L16
        if (this.u7 == false) goto L15;
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L16
    L15:
        return r3;
    }
}
