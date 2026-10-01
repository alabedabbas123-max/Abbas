package com.aide.ui;

@abcd.Interfacexu
class I implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;

    @abcd.Interfacevu
    final com.aide.ui.AIDEEditorPager Hw;

    static {
        abcd.wu.j6(com.aide.ui.I.class, -3968052299060732145L, 5818179166017709392L);
    }

    I(com.aide.ui.AIDEEditorPager r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1399991022045178552L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3338197272073846300L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3338197272073846300L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.setCurrentItem(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
