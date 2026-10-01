package com.aide.ui.browsers;

@abcd.Interfacexu
class m implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ImageView FH;

    @abcd.Interfacevu
    final com.aide.ui.browsers.LogCatBrowser Hw;

    static {
        abcd.wu.j6(com.aide.ui.browsers.m.class, 7477716827155690953L, -153627786828878808L);
    }

    m(com.aide.ui.browsers.LogCatBrowser r1, android.widget.ImageView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 412114772980334500L)
    public void onClick(android.view.View r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3171283024174060605L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3171283024174060605L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.browsers.LogCatBrowser.j6(this.Hw).j6(this.FH, false);     // Catch: java.lang.Throwable -> L8
    }
}
