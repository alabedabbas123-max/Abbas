package com.aide.uidesigner;

@abcd.Interfacexu
class fa implements com.aide.common.ab<java.lang.Integer> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.ArrayList FH;
    final com.aide.uidesigner.ClassS Hw;
    final java.lang.String[] Zo;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.fa.class, 2051778340695604592L, 2148774359431502901L);
    }

    fa(java.util.ArrayList r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3, java.lang.String[] r4) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
    }

    @abcd.Interfacesu(method = 863213966894867924L)
    public void j62(java.lang.Integer r7) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2933095158329763920L, this, r7);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2933095158329763920L, this, r7);     // Catch: java.lang.Throwable -> L11
    L7:
        if (((java.lang.String) this.FH.get(r7.intValue())).equals("none") == false) goto L9;
        this.Hw.j6(this.v5, null);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.Hw.j6(this.v5, this.Zo[r7.intValue()]);     // Catch: java.lang.Throwable -> L11
    }

    @Override
    public void j6(java.lang.Integer r1) {
        j62(r1);
    }
}
