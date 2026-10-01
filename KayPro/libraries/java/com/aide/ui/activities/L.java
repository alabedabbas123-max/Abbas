package com.aide.ui.activities;

@abcd.Interfacexu
class L implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.O FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.L.class, -1644854612305552056L, 1022505447717925389L);
    }

    L(com.aide.ui.activities.O r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -8291303271658995439L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1304071724318871640L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1304071724318871640L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("Clicked on Free Version in learning shop.");     // Catch: java.lang.Throwable -> L8
        this.FH.gn.Hw.dismiss();     // Catch: java.lang.Throwable -> L8
        this.FH.gn.setResult(-1);     // Catch: java.lang.Throwable -> L8
        this.FH.gn.finish();     // Catch: java.lang.Throwable -> L8
    }
}
