package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class e implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.e.class, -3499094272017024501L, -3746427140719332416L);
    }

    e(com.aide.ui.htmluidesigner.WebDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2044489348268516001L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2449826315172788244L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2449826315172788244L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.Intent r2 = new android.content.Intent();     // Catch: java.lang.Throwable -> L8
        r2.putExtra("EXTRA_TRAINER_ACTION", true);     // Catch: java.lang.Throwable -> L8
        this.FH.setResult(-1, r2);     // Catch: java.lang.Throwable -> L8
        this.FH.finish();     // Catch: java.lang.Throwable -> L8
    }
}
