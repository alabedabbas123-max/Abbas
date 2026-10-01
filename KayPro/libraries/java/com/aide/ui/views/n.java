package com.aide.ui.views;

@abcd.Interfacexu
class n extends java.util.TimerTask {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditTextScrollView.DragHandle FH;

    static {
        abcd.wu.j6(com.aide.ui.views.n.class, -40137164092015200L, 701969676214042275L);
    }

    n(com.aide.ui.views.CodeEditTextScrollView.DragHandle r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1012806782771515511L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5480919630671517760L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5480919630671517760L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.this$0.post(new com.aide.ui.views.m(this));     // Catch: java.lang.Throwable -> L8
    }
}
