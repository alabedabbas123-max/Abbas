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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, 734938092376181088L, this);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(734938092376181088L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.activities.ShopLearningPopupActivity.Hw(this.Hw.FH) == false) { $pc0 = 10; continue $sw0; }
                    return;
                }
                case 10: {
                    if (com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH) == false) { $pc0 = 13; continue $sw0; }
                    try {
                        this.Hw.FH.setResult(-1);
                        this.Hw.FH.finish();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    try {
                        abcd.F.j6("LearningShopErrorShown: " + this.FH);
                        this.Hw.FH.Hw.setCanceledOnTouchOutside(true);
                        com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
