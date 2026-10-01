package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenery implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.J FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenery.class, 5024868934807443193L, 4518161630902389525L);
    }

    DialogInterfaceOnClickListenery(com.aide.common.J r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 653834745199599049L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 718816909278993756L, this, r8, new java.lang.Integer(r9));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(718816909278993756L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
