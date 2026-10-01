package com.aide.common;

@abcd.Interfacexu
class aa extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final boolean gn;
    final com.aide.common.ab tp;
    final java.util.List u7;

    static {
        abcd.wu.j6(com.aide.common.aa.class, 5024868934807443193L, -3958279937422720800L);
    }

    aa(boolean r1, java.util.List r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 1010893011337355800L)
    public android.app.Dialog j6(android.app.Activity r7) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -1758519470366775573L, this, r7);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1758519470366775573L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r7);     // Catch: java.lang.Throwable -> L11
        r2.setCancelable(this.gn).setItems((java.lang.CharSequence[]) this.u7.toArray(new java.lang.CharSequence[0]), new com.aide.common.Z(this));     // Catch: java.lang.Throwable -> L11
        if (this.EQ == null) goto L9;
        r2.setTitle(this.EQ);     // Catch: java.lang.Throwable -> L11
    L9:
        android.app.AlertDialog r3 = r2.create();     // Catch: java.lang.Throwable -> L11
        r3.setCanceledOnTouchOutside(this.gn);     // Catch: java.lang.Throwable -> L11
        return r3;
    }
}
