package com.aide.ui.activities;

@abcd.Interfacexu
class P implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Map FH;
    final com.aide.ui.activities.S Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.P.class, -1644854612305552056L, 1022767388239156173L);
    }

    P(com.aide.ui.activities.S r1, java.util.Map r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -113970927176049669L)
    public void run() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 731623696426836669L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(731623696426836669L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.ui.activities.ShopLearningPopupActivity.Hw(this.Hw.FH) == false) goto L9;
        return;
    L9:
        abcd.F.j6("LerningShopOKShown");     // Catch: java.lang.Throwable -> L11
        com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH, this.FH);     // Catch: java.lang.Throwable -> L11
        com.aide.ui.activities.ShopLearningPopupActivity.v5(this.Hw.FH);     // Catch: java.lang.Throwable -> L11
    }
}
