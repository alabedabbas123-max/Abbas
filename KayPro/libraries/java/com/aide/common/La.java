package com.aide.common;

@abcd.Interfacexu
class La implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.Wa FH;

    static {
        abcd.wu.j6(com.aide.common.La.class, 1991841546302420120L, 4295814352200809480L);
    }

    La(com.aide.common.Wa r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1344767388138720175L)
    public void onCancel(android.content.DialogInterface r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -5555600766420419235L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5555600766420419235L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.common.Wa.j6(this.FH) == null) goto L17;
        com.aide.common.Wa.j6(this.FH).run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
