package com.aide.ui.views;

@abcd.Interfacexu
class t implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final boolean FH;

    @abcd.Interfacevu
    final com.aide.ui.views.SplitView Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.t.class, 786228931312646151L, 5732430827222924352L);
    }

    t(com.aide.ui.views.SplitView r1, boolean r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2167800954766248385L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -738479633260704200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-738479633260704200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.openSplit(this.FH, true);     // Catch: java.lang.Throwable -> L8
    }
}
