package com.aide.ui.activities;

@abcd.Interfacexu
class Q implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final com.aide.ui.activities.S Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.Q.class, -1644854612305552056L, 1022890260827003888L);
    }

    Q(com.aide.ui.activities.S r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1867954418734885983L)
    public void run() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 734938092376181088L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(734938092376181088L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (com.aide.ui.activities.ShopLearningPopupActivity.Hw(this.Hw.FH) == false) goto L10;
        return;
    L10:
        if (com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH) == false) goto L13;
        this.Hw.FH.setResult(-1);     // Catch: java.lang.Throwable -> L15
        this.Hw.FH.finish();     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        abcd.F.j6("LearningShopErrorShown: " + this.FH);     // Catch: java.lang.Throwable -> L15
        this.Hw.FH.Hw.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L15
        com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH, this.FH);     // Catch: java.lang.Throwable -> L15
    }
}
