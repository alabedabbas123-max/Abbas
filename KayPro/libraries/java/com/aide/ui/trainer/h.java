package com.aide.ui.trainer;

@abcd.Interfacexu
class h implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ab FH;
    final com.aide.ui.trainer.g.c Hw;

    static {
        abcd.wu.j6(com.aide.ui.trainer.h.class, 570594214568858707L, -1175094988323168544L);
    }

    h(com.aide.common.ab r1, com.aide.ui.trainer.g.c r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 47781758105842233L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 588739095509461479L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(588739095509461479L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6(this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
