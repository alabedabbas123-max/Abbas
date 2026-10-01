package com.aide.ui.activities;

@abcd.Interfacexu
class H implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Map FH;
    final com.aide.ui.activities.J Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.H.class, 2736360516742849000L, 1815046107540967513L);
    }

    H(com.aide.ui.activities.J r1, java.util.Map r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -53301859524500776L)
    public void run() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1453401522910802091L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1453401522910802091L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (com.aide.ui.activities.ShopExpertPopupActivity.FH(this.Hw.FH) == false) goto L9;
        return;
    L9:
        abcd.F.j6("ExpertShopOKShown");     // Catch: java.lang.Throwable -> L11
        com.aide.ui.activities.ShopExpertPopupActivity.j6(this.Hw.FH, this.FH);     // Catch: java.lang.Throwable -> L11
        com.aide.ui.activities.ShopExpertPopupActivity.Hw(this.Hw.FH);     // Catch: java.lang.Throwable -> L11
    }
}
