package com.aide.uidesigner;

@abcd.Interfacexu
class X implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.X.class, 2051778340695604592L, -3477211946300348395L);
    }

    X(com.aide.uidesigner.ClassS r1) {
        this.FH = r1;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 3320432118450810909L)
    public void j62(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -3309017621433256523L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3309017621433256523L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (r5.length() != 0) goto L9;
        r5 = null;
    L9:
        this.FH.setViewID(r5);     // Catch: java.lang.Throwable -> L11
    }
}
