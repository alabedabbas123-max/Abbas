package com.aide.uidesigner;

@abcd.Interfacexu
class U implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.W FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.U.class, 2051778340695604592L, 4489685352655330365L);
    }

    U(com.aide.uidesigner.W r1) {
        this.FH = r1;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 2502723265103708763L)
    public void j62(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1317124347317994117L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1317124347317994117L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (r5.length() != 0) goto L9;
        this.FH.FH.setStyle(null);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.FH.FH.setStyle(r5);     // Catch: java.lang.Throwable -> L11
    }
}
