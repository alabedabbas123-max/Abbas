package com.aide.common;

@abcd.Interfacexu
class M implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.N FH;

    static {
        abcd.wu.j6(com.aide.common.M.class, 5024868934807443193L, 4518734129192032520L);
    }

    M(com.aide.common.N r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -406075861921701252L)
    public void onCancel(android.content.DialogInterface r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -6982874719391048976L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6982874719391048976L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        r5.dismiss();     // Catch: java.lang.Throwable -> L10
        if (this.FH.J0 == null) goto L17;
        this.FH.J0.run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
