package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerha implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ia FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerha.class, 5024868934807443193L, 4520822574916532912L);
    }

    DialogInterfaceOnClickListenerha(com.aide.common.ia r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -797167275361479497L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3066319009640289360L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3066319009640289360L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
        this.FH.u7.j6(java.lang.Integer.valueOf(r9));     // Catch: java.lang.Throwable -> L7
    }
}
