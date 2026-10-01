package com.aide.ui.views;

@abcd.Interfacexu
class p implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditTextScrollView.a FH;

    static {
        abcd.wu.j6(com.aide.ui.views.p.class, -1411785762941269443L, -4372656609407605911L);
    }

    p(com.aide.ui.views.CodeEditTextScrollView.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 757606261454987264L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3976983868377191397L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3976983868377191397L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.hide();     // Catch: java.lang.Throwable -> L8
    }
}
