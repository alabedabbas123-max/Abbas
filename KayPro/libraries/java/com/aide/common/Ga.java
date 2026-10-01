package com.aide.common;

@abcd.Interfacexu
class Ga implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;
    final java.lang.String Hw;

    static {
        abcd.wu.j6(com.aide.common.Ga.class, 2278315543554812120L, 3881293302026470225L);
    }

    Ga(android.content.Context r1, java.lang.String r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 291534569916151815L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1503200473810598400L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1503200473810598400L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.Toast r2 = com.almlkaide.kaypro.util.Toasty.toast(this.FH, "Long press to paste: \"" + this.Hw + "\"", 1);     // Catch: java.lang.Throwable -> L8
        r2.setGravity(49, 0, 20);     // Catch: java.lang.Throwable -> L8
        r2.show();     // Catch: java.lang.Throwable -> L8
    }
}
