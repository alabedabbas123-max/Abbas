package com.aide.ui.activities;

@abcd.Interfacexu
class K implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.O FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.K.class, -1644854612305552056L, 1022382577088585320L);
    }

    K(com.aide.ui.activities.O r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 310412865284262144L)
    public void onCancel(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1527083684635010635L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1527083684635010635L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("Cancelled free version in learning shop.");     // Catch: java.lang.Throwable -> L8
        this.FH.gn.setResult(-1);     // Catch: java.lang.Throwable -> L8
        this.FH.gn.finish();     // Catch: java.lang.Throwable -> L8
    }
}
