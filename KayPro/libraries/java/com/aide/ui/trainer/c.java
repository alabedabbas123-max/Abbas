package com.aide.ui.trainer;

@abcd.Interfacexu
class c extends android.os.CountDownTimer {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.trainer.e FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.c.class, 221157201561947787L, -394521467029321005L);
    }

    c(com.aide.ui.trainer.e r1, long r2, long r4) {
        this.FH = r1;
        super(r2, r4);
    }

    @Override
    @abcd.Interfacesu(method = 1577978769006587560L)
    public void onFinish() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 775587791141888543L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(775587791141888543L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 37205383691188471L)
    public void onTick(long r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 6665312108696838696L, this, new java.lang.Long(r5));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6665312108696838696L, this, new java.lang.Long(r5));     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.ui.trainer.e.j6(this.FH) != null) goto L9;
        cancel();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        com.aide.ui.trainer.e.j6(this.FH).show();     // Catch: java.lang.Throwable -> L11
    }
}
