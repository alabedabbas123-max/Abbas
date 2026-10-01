package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class f implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.f.class, -3499094272017024501L, -3746511678706667805L);
    }

    f(com.aide.ui.htmluidesigner.WebDesignActivity r1, java.lang.Runnable r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 448738181764005987L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1659046243243505772L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1659046243243505772L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.run();     // Catch: java.lang.Throwable -> L8
    }
}
