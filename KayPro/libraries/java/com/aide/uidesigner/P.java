package com.aide.uidesigner;

@abcd.Interfacexu
class P implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.P.class, 2051778340695604592L, -3476833526870713440L);
    }

    P(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -8245536693385977396L)
    public void j62(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -4310754117006148479L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4310754117006148479L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (r5.length() != 0) goto L9;
        r5 = null;
    L9:
        this.FH.j6(this.Hw, r5);     // Catch: java.lang.Throwable -> L11
    }
}
