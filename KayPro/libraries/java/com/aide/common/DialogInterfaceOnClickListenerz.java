package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerz implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.J FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerz.class, 5024868934807443193L, 4518257828228626216L);
    }

    DialogInterfaceOnClickListenerz(com.aide.common.J r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 338766582562489125L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -94133498456795715L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-94133498456795715L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
        this.FH.tp.run();     // Catch: java.lang.Throwable -> L7
    }
}
