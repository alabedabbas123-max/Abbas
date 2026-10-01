package com.aide.ui.views;

@abcd.Interfacexu
class k implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final int Hw;

    @abcd.Interfacevu
    final com.aide.ui.views.CodeEditTextScrollView v5;

    static {
        abcd.wu.j6(com.aide.ui.views.k.class, 1527178060401062972L, -2222965217968661424L);
    }

    k(com.aide.ui.views.CodeEditTextScrollView r1, int r2, int r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1521310037490889240L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2066584472879788192L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2066584472879788192L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.scrollTo(this.v5.getScrollX(), this.FH);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.views.CodeEditTextScrollView.DW(this.v5).scrollTo(this.Hw, com.aide.ui.views.CodeEditTextScrollView.DW(this.v5).getScrollY());     // Catch: java.lang.Throwable -> L8
    }
}
