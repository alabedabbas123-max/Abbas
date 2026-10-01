package com.aide.ui.activities;

@abcd.Interfacexu
class O extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfacevu
    final com.aide.ui.activities.ShopLearningPopupActivity gn;

    static {
        abcd.wu.j6(com.aide.ui.activities.O.class, -1644854612305552056L, -6899074879925825271L);
    }

    O(com.aide.ui.activities.ShopLearningPopupActivity r1) {
        this.gn = r1;
    }

    @Override
    @abcd.Interfacesu(method = -3012497828281985069L)
    protected android.app.Dialog j6(android.app.Activity r12) {
        android.app.AlertDialog.Builder r2 = null;
        android.view.LayoutInflater r3 = null;
        android.view.View r4 = null;
        android.widget.TextView r5 = null;
        android.widget.ImageView r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, -513168812878931375L, this, r12);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-513168812878931375L, this, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r12);
                        r3 = android.view.LayoutInflater.from(r12);
                        this.gn.FH = r3.inflate(com.almlkaide.kaypro.R.layout.shop_learning_popup, null);
                        r2.setView(this.gn.FH).setOnCancelListener(new com.aide.ui.activities.K(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (com.aide.ui.activities.ShopLearningPopupActivity.j6(this.gn) == false) { $pc0 = 9; continue $sw0; }
                    try {
                        r4 = this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFreeButton);
                        r4.setVisibility(0);
                        r4.setOnClickListener(new com.aide.ui.activities.L(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningMonthlyButton).setOnClickListener(new com.aide.ui.activities.M(this));
                        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningYearlyButton).setOnClickListener(new com.aide.ui.activities.N(this));
                        r5 = (android.widget.TextView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningPopupTitle);
                        r6 = (android.widget.ImageView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningSpecialYearly);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (com.aide.ui.Ha.gn() == false) { $pc0 = 12; continue $sw0; }
                    try {
                        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_learning_title_promo_upgrade, new java.lang.Object[]{"20%"}));
                        r6.setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    try {
                        this.gn.Hw = r2.create();
                        this.gn.Hw.setCancelable(true);
                        this.gn.Hw.setCanceledOnTouchOutside(false);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return this.gn.Hw;
                }
                case 12: {
                    try {
                        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_learning_title));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    { $pc0 = 13; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
