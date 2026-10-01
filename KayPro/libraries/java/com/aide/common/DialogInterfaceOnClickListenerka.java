package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerka implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.la FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerka.class, 5024868934807443193L, 4521298969627423864L);
    }

    DialogInterfaceOnClickListenerka(com.aide.common.la r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 21529186890582355L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2127707248997716839L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2127707248997716839L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
        this.FH.u7.j6(java.lang.Integer.valueOf(r9));     // Catch: java.lang.Throwable -> L7
    }
}
