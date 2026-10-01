package com.aide.ui.trainer;

@abcd.Interfacexu
class m implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.m.class, 570594214568858707L, -1175533292480485309L);
    }

    m(java.lang.Runnable r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -78397579374058689L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -290158671951185392L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-290158671951185392L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.run();     // Catch: java.lang.Throwable -> L8
    }
}
