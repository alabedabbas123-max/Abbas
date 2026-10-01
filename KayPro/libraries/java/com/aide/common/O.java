package com.aide.common;

@abcd.Interfacexu
class O implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.S FH;

    static {
        abcd.wu.j6(com.aide.common.O.class, 5024868934807443193L, 4518921842048929017L);
    }

    O(com.aide.common.S r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 414443234559120615L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -1105875496172147304L, this, r8, new java.lang.Integer(r9));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1105875496172147304L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L9
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L9
        if (this.FH.we == null) goto L16;
        this.FH.we.run();     // Catch: java.lang.Throwable -> L9
        return;
    }
}
