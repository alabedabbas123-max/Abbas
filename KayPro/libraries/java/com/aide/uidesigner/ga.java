package com.aide.uidesigner;

@abcd.Interfacexu
class ga implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.uidesigner.ClassS Hw;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ga.class, 2051778340695604592L, 2148826478770275736L);
    }

    ga(android.app.Activity r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -5358581029720838976L)
    public void j62(java.lang.String r6) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 7957711318513413560L, this, r6);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(7957711318513413560L, this, r6);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r6.equals("Color...") == false) goto L10;
        com.aide.uidesigner.ka.DW(this.FH, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (r6.equals("Drawable...") == false) goto L12;
        com.aide.uidesigner.ka.FH(this.FH, this.Hw, this.v5);     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        this.Hw.j6(this.v5, null);     // Catch: java.lang.Throwable -> L14
    }
}
