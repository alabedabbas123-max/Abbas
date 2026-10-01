package com.aide.uidesigner;

@abcd.Interfacexu
class ia implements com.aide.common.ab<java.lang.Integer> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final com.aide.uidesigner.ClassS Hw;
    final java.lang.String VH;
    final android.app.Activity Zo;
    final java.util.ArrayList gn;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ia.class, 2051778340695604592L, 2148930717460011288L);
    }

    ia(java.util.List r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3, android.app.Activity r4, java.lang.String r5, java.util.ArrayList r6) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
        this.gn = r6;
    }

    @abcd.Interfacesu(method = 2227168565746557160L)
    public void j62(java.lang.Integer r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1445056508723827032L, this, r7);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1445056508723827032L, this, r7);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.String r2 = (java.lang.String) this.FH.get(r7.intValue());     // Catch: java.lang.Throwable -> L14
        if (r2.equals("none") == false) goto L10;
        this.Hw.j6(this.v5, null);     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (r2.equals("other...") == false) goto L12;
        com.aide.uidesigner.ka.j6(this.Zo, this.Hw, this.v5, this.VH);     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        this.Hw.j6(this.v5, (java.lang.String) this.gn.get(r7.intValue()));     // Catch: java.lang.Throwable -> L14
    }

    @Override
    public void j6(java.lang.Integer r1) {
        j62(r1);
    }
}
