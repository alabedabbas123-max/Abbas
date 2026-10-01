package com.aide.common;

@abcd.Interfacexu
class ViewOnClickListenerva implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final com.aide.common.ua.b Hw;

    static {
        abcd.wu.j6(com.aide.common.ViewOnClickListenerva.class, -2051543434084569271L, 222824875113239592L);
    }

    ViewOnClickListenerva(com.aide.common.ua.b r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 630976205589365376L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4408689612193054751L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4408689612193054751L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        ((com.aide.uidesigner.XmlLayoutDesignActivity) this.Hw.getContext()).DW(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
