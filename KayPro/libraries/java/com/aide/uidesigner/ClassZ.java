package com.aide.uidesigner;

@abcd.Interfacexu
class ClassZ implements com.aide.common.ab<com.aide.uidesigner.ClassB> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.A FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassZ.class, -2150908242116545680L, -111923101435714449L);
    }

    ClassZ(com.aide.uidesigner.A r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -1900228308837539023L)
    public void j62(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -28055762614283177L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-28055762614283177L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.FH.v5(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(com.aide.uidesigner.ClassB r1) {
        j62(r1);
    }
}
