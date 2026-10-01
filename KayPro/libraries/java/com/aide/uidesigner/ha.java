package com.aide.uidesigner;

@abcd.Interfacexu
class ha implements com.aide.common.ab<java.lang.Integer> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final com.aide.uidesigner.ClassS Hw;
    final java.util.ArrayList VH;
    final android.app.Activity Zo;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ha.class, 2051778340695604592L, 2148878598113111865L);
    }

    ha(java.util.List r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3, android.app.Activity r4, java.util.ArrayList r5) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
    }

    @abcd.Interfacesu(method = -5811126370284434680L)
    public void j62(java.lang.Integer r7) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 3339260184219208879L, this, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3339260184219208879L, this, r7);     // Catch: java.lang.Throwable -> L17
    L6:
        java.lang.String r2 = (java.lang.String) this.FH.get(r7.intValue());     // Catch: java.lang.Throwable -> L17
        if (r2.equals("none") == false) goto L10;
        this.Hw.j6(this.v5, null);     // Catch: java.lang.Throwable -> L17
        return;
    L10:
        if (r2.equals("other...") == false) goto L13;
        com.aide.uidesigner.ka.j6(this.Zo, this.Hw, this.v5, "@drawable/");     // Catch: java.lang.Throwable -> L17
        return;
    L13:
        if (r2.equals("add...") == false) goto L15;
        com.aide.uidesigner.ka.Hw(this.Zo, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L17
        return;
    L15:
        this.Hw.j6(this.v5, (java.lang.String) this.VH.get(r7.intValue()));     // Catch: java.lang.Throwable -> L17
    }

    @Override
    public void j6(java.lang.Integer r1) {
        j62(r1);
    }
}
