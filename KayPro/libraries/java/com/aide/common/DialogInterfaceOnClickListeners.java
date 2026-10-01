package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListeners implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ClassT FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListeners.class, 2649604467815608996L, 3888014486649578475L);
    }

    DialogInterfaceOnClickListeners(com.aide.common.ClassT r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 808654690366390892L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 64443593181810564L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(64443593181810564L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.ClassT.v5(this.FH).j6(0, null);     // Catch: java.lang.Throwable -> L7
    }
}
