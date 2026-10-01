package com.aide.ui.trainer;

@abcd.Interfacexu
class b implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;

    @abcd.Interfacevu
    final com.aide.ui.trainer.e Hw;

    static {
        abcd.wu.j6(com.aide.ui.trainer.b.class, 221157201561947787L, -394478940297065920L);
    }

    b(com.aide.ui.trainer.e r1, android.content.Context r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1517561572773370031L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 747930846576700325L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(747930846576700325L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.ui.trainer.e.j6(this.Hw, this.FH) == false) goto L17;
        android.media.MediaPlayer.create(this.FH, com.almlkaide.kaypro.R.raw.success_task).start();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
