package com.aide.uidesigner;

@abcd.Interfacexu
class ca implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.uidesigner.ClassS Hw;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ca.class, 2051778340695604592L, 2148618001439564160L);
    }

    ca(android.app.Activity r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 5996794367510936527L)
    public void j62(java.lang.String r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -3676945501268453043L, this, r7);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3676945501268453043L, this, r7);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r7.equals("View...") == false) goto L10;
        com.aide.uidesigner.ka.j6(this.FH, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (r7.equals("id...") == false) goto L12;
        java.util.ArrayList r2 = new java.util.ArrayList(this.Hw.getAllIDs());     // Catch: java.lang.Throwable -> L14
        java.util.Collections.sort(r2);     // Catch: java.lang.Throwable -> L14
        com.aide.common.Abstractma.j6(this.FH, this.v5.FH.j6(), r2, new com.aide.uidesigner.ba(this));     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        this.Hw.j6(this.v5, null);     // Catch: java.lang.Throwable -> L14
    }
}
