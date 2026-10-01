package com.aide.ui.activities;

@abcd.Interfacexu
class Runnablep implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.Binders FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnablep.class, -667729815873843261L, -3645355651115015653L);
    }

    Runnablep(com.aide.ui.activities.Binders r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1469787027410780785L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1309041912870389880L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1309041912870389880L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.activities.GotoBrowserActivity.j6(this.FH.v5, false, null, null);     // Catch: java.lang.Throwable -> L8
    }
}
