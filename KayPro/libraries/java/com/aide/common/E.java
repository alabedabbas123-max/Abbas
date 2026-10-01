package com.aide.common;

@abcd.Interfacexu
class E implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.H FH;

    static {
        abcd.wu.j6(com.aide.common.E.class, 5024868934807443193L, -5838789829343040684L);
    }

    E(com.aide.common.H r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -161106994163449719L)
    public void onCancel(android.content.DialogInterface r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1990164680577781344L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1990164680577781344L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH.J0 == null) goto L17;
        this.FH.J0.run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
