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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -1453401522910802091L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-1453401522910802091L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.activities.ShopExpertPopupActivity.FH(this.Hw.FH) == false) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    try {
                        abcd.F.j6("ExpertShopOKShown");
                        com.aide.ui.activities.ShopExpertPopupActivity.j6(this.Hw.FH, this.FH);
                        com.aide.ui.activities.ShopExpertPopupActivity.Hw(this.Hw.FH);
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
