package com.aide.ui.activities;

@abcd.Interfacexu
class G extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfacevu
    final com.aide.ui.activities.ShopExpertPopupActivity gn;

    static {
        abcd.wu.j6(com.aide.ui.activities.G.class, 2736360516742849000L, -3849641621144310915L);
    }

    G(com.aide.ui.activities.ShopExpertPopupActivity r1) {
        this.gn = r1;
    }

    @Override
    @abcd.Interfacesu(method = 79991885865469897L)
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
                case 19: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, 100567841152874905L, this, r12);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(100567841152874905L, this, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r12);
                        r3 = android.view.LayoutInflater.from(r12);
                        this.gn.FH = r3.inflate(com.almlkaide.kaypro.R.layout.shop_expert_popup, null);
                        r2.setView(this.gn.FH).setOnCancelListener(new com.aide.ui.activities.D(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.ui.activities.ShopExpertPopupActivity.j6(this.gn) == false) { $pc0 = 9; continue $sw0; }
                    try {
                        r4 = this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupFreeButton);
                        r4.setVisibility(0);
                        r4.setOnClickListener(new com.aide.ui.activities.E(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupBuyButton).setOnClickListener(new com.aide.ui.activities.F(this));
                        r5 = (android.widget.TextView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupTitle);
                        r6 = (android.widget.ImageView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupEntrySpecialImage);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.ui.Ha.Zo() == false) { $pc0 = 14; continue $sw0; }
                    try {
                        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title_promo_upgrade, new java.lang.Object[]{"33%"}));
                        r6.setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    try {
                        this.gn.Hw = r2.create();
                        this.gn.Hw.setCancelable(true);
                        this.gn.Hw.setCanceledOnTouchOutside(false);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return this.gn.Hw;
                }
                case 14: {
                    if (com.aide.ui.Ha.v5() == false) { $pc0 = 16; continue $sw0; }
                    try {
                        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title_promo, new java.lang.Object[]{"33%"}));
                        r6.setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    { $pc0 = 17; continue $sw0; }
                }
                case 16: {
                    try {
                        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    { $pc0 = 17; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
