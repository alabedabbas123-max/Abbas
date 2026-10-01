package com.aide.uidesigner;

@abcd.Interfacexu
class da implements com.aide.common.ab<com.aide.uidesigner.ClassS> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;
    final android.app.Activity v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.da.class, 2051778340695604592L, 2148670120766147113L);
    }

    da(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, android.app.Activity r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @abcd.Interfacesu(method = 434870954962979600L)
    public void j62(com.aide.uidesigner.ClassS r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -4791861369533368800L, this, r7);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4791861369533368800L, this, r7);     // Catch: java.lang.Throwable -> L12
    L7:
        if (r7.getViewID() != null) goto L9;
        this.FH.j6(this.Hw, r7, r7.EQ());     // Catch: java.lang.Throwable -> L12
    L10:
        com.almlkaide.kaypro.util.Toasty.toast(this.v5, "View was selected for attribute " + this.Hw.FH.j6(), 0).show();     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        this.FH.j6(this.Hw, null, r7.getViewID());     // Catch: java.lang.Throwable -> L12
        goto L10
    }

    @Override
    public void j6(com.aide.uidesigner.ClassS r1) {
        j62(r1);
    }
}
