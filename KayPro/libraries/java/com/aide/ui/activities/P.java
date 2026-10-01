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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 731623696426836669L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(731623696426836669L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.activities.ShopLearningPopupActivity.Hw(this.Hw.FH) == false) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    try {
                        abcd.F.j6("LerningShopOKShown");
                        com.aide.ui.activities.ShopLearningPopupActivity.j6(this.Hw.FH, this.FH);
                        com.aide.ui.activities.ShopLearningPopupActivity.v5(this.Hw.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
