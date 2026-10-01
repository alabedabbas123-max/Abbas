package com.aide.uidesigner;

@abcd.Interfacexu
class W implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final android.app.Activity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.W.class, 2051778340695604592L, -3477136262422547992L);
    }

    W(com.aide.uidesigner.ClassS r1, android.app.Activity r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -2307519777298019328L)
    public void j62(java.lang.String r11) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 6573503237724167056L, this, r11);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6573503237724167056L, this, r11);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r11.equals("none") == false) goto L10;
        this.FH.setStyle(null);     // Catch: java.lang.Throwable -> L14
    L10:
        if (r11.equals("other...") == false) goto L12;
        com.aide.common.Abstractma.j6(this.Hw, "Style", null, "None", this.FH.getStyle(), new com.aide.uidesigner.U(this), new com.aide.uidesigner.V(this));     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        this.FH.setStyle(r11);     // Catch: java.lang.Throwable -> L14
    }
}
