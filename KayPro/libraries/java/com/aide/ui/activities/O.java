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
    L15:
        th = move-exception;
        if (VH == false) goto L19;
        abcd.wu.j6(th, -513168812878931375L, this, r12);
    L19:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-513168812878931375L, this, r12);     // Catch: java.lang.Throwable -> L15
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r12);     // Catch: java.lang.Throwable -> L15
        android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r12);     // Catch: java.lang.Throwable -> L15
        this.gn.FH = r3.inflate(com.almlkaide.kaypro.R.layout.shop_learning_popup, null);     // Catch: java.lang.Throwable -> L15
        r2.setView(this.gn.FH).setOnCancelListener(new com.aide.ui.activities.K(this));     // Catch: java.lang.Throwable -> L15
        if (com.aide.ui.activities.ShopLearningPopupActivity.j6(this.gn) == false) goto L9;
        android.view.View r4 = this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningFreeButton);     // Catch: java.lang.Throwable -> L15
        r4.setVisibility(0);     // Catch: java.lang.Throwable -> L15
        r4.setOnClickListener(new com.aide.ui.activities.L(this));     // Catch: java.lang.Throwable -> L15
    L9:
        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningMonthlyButton).setOnClickListener(new com.aide.ui.activities.M(this));     // Catch: java.lang.Throwable -> L15
        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningYearlyButton).setOnClickListener(new com.aide.ui.activities.N(this));     // Catch: java.lang.Throwable -> L15
        android.widget.TextView r5 = (android.widget.TextView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningPopupTitle);     // Catch: java.lang.Throwable -> L15
        android.widget.ImageView r6 = (android.widget.ImageView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopLearningSpecialYearly);     // Catch: java.lang.Throwable -> L15
        if (com.aide.ui.Ha.gn() == false) goto L12;
        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_learning_title_promo_upgrade, new java.lang.Object[]{"20%"}));     // Catch: java.lang.Throwable -> L15
        r6.setVisibility(0);     // Catch: java.lang.Throwable -> L15
    L13:
        this.gn.Hw = r2.create();     // Catch: java.lang.Throwable -> L15
        this.gn.Hw.setCancelable(true);     // Catch: java.lang.Throwable -> L15
        this.gn.Hw.setCanceledOnTouchOutside(false);     // Catch: java.lang.Throwable -> L15
        return this.gn.Hw;
    L12:
        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_learning_title));     // Catch: java.lang.Throwable -> L15
        goto L13
    }
}
