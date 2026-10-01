package com.aide.uidesigner;

@abcd.Interfacexu
class O implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;
    final android.app.Activity v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.O.class, 2051778340695604592L, -3476757842972596567L);
    }

    O(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, android.app.Activity r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 4195710493438311392L)
    public void j62(java.lang.String r8) {
    L23:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, 300942786749748933L, this, r8);
    L27:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(300942786749748933L, this, r8);     // Catch: java.lang.Throwable -> L23
    L8:
        if (r8.equals("Wrap Content") == false) goto L12;
        this.FH.j6(this.Hw, "wrap_content");     // Catch: java.lang.Throwable -> L23
        return;
    L12:
        if (r8.equals("Match Parent") == false) goto L16;
        this.FH.j6(this.Hw, "match_parent");     // Catch: java.lang.Throwable -> L23
        return;
    L16:
        if ("match_parent".equals(this.Hw.Hw) == false) goto L18;
    L20:
        java.lang.String r2 = "10dp";
    L21:
        com.aide.uidesigner.ka.j6(this.v5, this.FH, this.Hw, r2, "10dp");     // Catch: java.lang.Throwable -> L23
        return;
    L18:
        if ("wrap_content".equals(this.Hw.Hw) == true) goto L20;
        r2 = this.Hw.Hw;     // Catch: java.lang.Throwable -> L23
        goto L21
    }
}
