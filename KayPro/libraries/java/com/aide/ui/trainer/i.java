package com.aide.ui.trainer;

@abcd.Interfacexu
class i implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.i.class, 570594214568858707L, -1175182649162758485L);
    }

    i(java.lang.Runnable r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 152281594197672605L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -539198099954736712L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-539198099954736712L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.run();     // Catch: java.lang.Throwable -> L8
    }
}
