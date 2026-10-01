package com.aide.ui.activities;

@abcd.Interfacexu
class D implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.G FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.D.class, 2736360516742849000L, 1814836171870059184L);
    }

    D(com.aide.ui.activities.G r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -607682528172217303L)
    public void onCancel(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2294398261060179957L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2294398261060179957L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("Cancelled free version in expert shop.");     // Catch: java.lang.Throwable -> L8
        this.FH.gn.setResult(-1);     // Catch: java.lang.Throwable -> L8
        this.FH.gn.finish();     // Catch: java.lang.Throwable -> L8
    }
}
