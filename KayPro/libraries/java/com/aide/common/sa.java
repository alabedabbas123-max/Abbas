package com.aide.common;

@abcd.Interfacexu
public class sa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 838758651928592592L)
    private final android.app.Activity FH;

    @abcd.Interfaceru(field = -1194706431140899040L)
    private final java.lang.String Hw;

    @abcd.Interfaceru(field = -1024908850174466719L)
    private java.lang.Runnable VH;

    @abcd.Interfaceru(field = -433778956045767207L)
    private android.os.Handler Zo;

    @abcd.Interfaceru(field = -265548789896474136L)
    private int gn;

    @abcd.Interfaceru(field = 597559973676931720L)
    private android.app.ProgressDialog v5;

    static {
        abcd.wu.j6(com.aide.common.sa.class, -443066808001349768L, -443066808001349768L);
    }

    public sa(android.app.Activity r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2259859479713448584L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2259859479713448584L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Zo = new android.os.Handler();     // Catch: java.lang.Throwable -> L7
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
        this.gn = 500;     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.common.sa r0) {
        r0.v5();
    }

    @abcd.Interfacesu(method = 4282309975616894155L)
    private void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1183668049773131675L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1183668049773131675L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = new android.app.ProgressDialog(this.FH);     // Catch: java.lang.Throwable -> L8
        this.v5.setMessage(this.Hw);     // Catch: java.lang.Throwable -> L8
        this.v5.setOnCancelListener(new com.aide.common.DialogInterfaceOnCancelListenerra(this));     // Catch: java.lang.Throwable -> L8
        this.v5.getWindow().clearFlags(2);     // Catch: java.lang.Throwable -> L8
        this.v5.show();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2790036783533969775L)
    protected void DW() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2001298607835609485L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-2001298607835609485L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2273123547971387904L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2273123547971387904L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6();     // Catch: java.lang.Throwable -> L8
        v5();     // Catch: java.lang.Throwable -> L8
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6258904993486479808L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6258904993486479808L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6();     // Catch: java.lang.Throwable -> L8
        this.VH = new com.aide.common.Runnableqa(this);     // Catch: java.lang.Throwable -> L8
        this.Zo.postDelayed(this.VH, this.gn);     // Catch: java.lang.Throwable -> L8
    }

    public void j6() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1950676336890241184L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1950676336890241184L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.VH == null) goto L10;
        this.Zo.removeCallbacks(this.VH);     // Catch: java.lang.Throwable -> L13
        this.VH = null;     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.v5 == null) goto L20;
        this.v5.dismiss();     // Catch: java.lang.Throwable -> L13
        this.v5 = null;     // Catch: java.lang.Throwable -> L13
        return;
    }
}
