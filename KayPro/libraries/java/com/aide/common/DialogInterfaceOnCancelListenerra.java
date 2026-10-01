package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnCancelListenerra implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.sa FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnCancelListenerra.class, -443066808001349768L, 1940976261388132632L);
    }

    DialogInterfaceOnCancelListenerra(com.aide.common.sa r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1116083363829508152L)
    public void onCancel(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -315687090912726544L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-315687090912726544L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.DW();     // Catch: java.lang.Throwable -> L8
    }
}
