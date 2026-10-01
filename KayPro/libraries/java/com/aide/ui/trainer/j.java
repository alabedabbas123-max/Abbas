package com.aide.ui.trainer;

@abcd.Interfacexu
class j implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.j.class, 570594214568858707L, -1175270309998285132L);
    }

    j(java.lang.Runnable r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 16521227574251549L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -78260368499471349L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-78260368499471349L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.run();     // Catch: java.lang.Throwable -> L8
    }
}
