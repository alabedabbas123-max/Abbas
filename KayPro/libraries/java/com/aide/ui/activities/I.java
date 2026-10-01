package com.aide.ui.activities;

@abcd.Interfacexu
class I implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final com.aide.ui.activities.J Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.I.class, 2736360516742849000L, 1815074663496550080L);
    }

    I(com.aide.ui.activities.J r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -716300338700315784L)
    public void run() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -1450362515632573248L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1450362515632573248L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (com.aide.ui.activities.ShopExpertPopupActivity.FH(this.Hw.FH) == false) goto L10;
        return;
    L10:
        if (com.aide.ui.activities.ShopExpertPopupActivity.j6(this.Hw.FH) == false) goto L13;
        this.Hw.FH.setResult(-1);     // Catch: java.lang.Throwable -> L15
        this.Hw.FH.finish();     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        abcd.F.j6("ExpertShopErrorShown: " + this.FH);     // Catch: java.lang.Throwable -> L15
        this.Hw.FH.Hw.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L15
        com.aide.ui.activities.ShopExpertPopupActivity.j6(this.Hw.FH, this.FH);     // Catch: java.lang.Throwable -> L15
    }
}
