package com.aide.common;

@abcd.Interfacexu
class L implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.N FH;

    static {
        abcd.wu.j6(com.aide.common.L.class, 5024868934807443193L, 4518637929903224889L);
    }

    L(com.aide.common.N r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1057966421903440552L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 1447334007669899869L, this, r8, new java.lang.Integer(r9));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1447334007669899869L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L9
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L9
        if (this.FH.J0 == null) goto L16;
        this.FH.J0.run();     // Catch: java.lang.Throwable -> L9
        return;
    }
}
