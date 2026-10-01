package com.aide.uidesigner;

@abcd.Interfacexu
class F implements com.aide.common.ab<com.aide.uidesigner.ClassB> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.G FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.F.class, -2150908242116545680L, -111713646803298768L);
    }

    F(com.aide.uidesigner.G r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -4337124943033321380L)
    public void j62(com.aide.uidesigner.ClassB r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -449178619979846040L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-449178619979846040L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.FH.DW(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(com.aide.uidesigner.ClassB r1) {
        j62(r1);
    }
}
