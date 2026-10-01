package com.aide.ui.views;

@abcd.Interfacexu
class m implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.n FH;

    static {
        abcd.wu.j6(com.aide.ui.views.m.class, -40137164092015200L, 774387395373054276L);
    }

    m(com.aide.ui.views.n r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 616720526027729960L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5479020585264629259L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5479020585264629259L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.CodeEditTextScrollView.DragHandle.access$702(this.FH.FH, false);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.views.CodeEditTextScrollView.DragHandle.access$802(this.FH.FH, false);     // Catch: java.lang.Throwable -> L8
        this.FH.FH.this$0.invalidate();     // Catch: java.lang.Throwable -> L8
    }
}
