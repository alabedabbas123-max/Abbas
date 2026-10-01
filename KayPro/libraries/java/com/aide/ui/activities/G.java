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
    L19:
        th = move-exception;
        if (VH == false) goto L23;
        abcd.wu.j6(th, 100567841152874905L, this, r12);
    L23:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(100567841152874905L, this, r12);     // Catch: java.lang.Throwable -> L19
    L6:
        android.app.AlertDialog.Builder r2 = new android.app.AlertDialog.Builder(r12);     // Catch: java.lang.Throwable -> L19
        android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r12);     // Catch: java.lang.Throwable -> L19
        this.gn.FH = r3.inflate(com.almlkaide.kaypro.R.layout.shop_expert_popup, null);     // Catch: java.lang.Throwable -> L19
        r2.setView(this.gn.FH).setOnCancelListener(new com.aide.ui.activities.D(this));     // Catch: java.lang.Throwable -> L19
        if (com.aide.ui.activities.ShopExpertPopupActivity.j6(this.gn) == false) goto L9;
        android.view.View r4 = this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupFreeButton);     // Catch: java.lang.Throwable -> L19
        r4.setVisibility(0);     // Catch: java.lang.Throwable -> L19
        r4.setOnClickListener(new com.aide.ui.activities.E(this));     // Catch: java.lang.Throwable -> L19
    L9:
        this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupBuyButton).setOnClickListener(new com.aide.ui.activities.F(this));     // Catch: java.lang.Throwable -> L19
        android.widget.TextView r5 = (android.widget.TextView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupTitle);     // Catch: java.lang.Throwable -> L19
        android.widget.ImageView r6 = (android.widget.ImageView) this.gn.FH.findViewById(com.almlkaide.kaypro.R.id.shopExpertPopupEntrySpecialImage);     // Catch: java.lang.Throwable -> L19
        if (com.aide.ui.Ha.Zo() == false) goto L14;
        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title_promo_upgrade, new java.lang.Object[]{"33%"}));     // Catch: java.lang.Throwable -> L19
        r6.setVisibility(0);     // Catch: java.lang.Throwable -> L19
    L17:
        this.gn.Hw = r2.create();     // Catch: java.lang.Throwable -> L19
        this.gn.Hw.setCancelable(true);     // Catch: java.lang.Throwable -> L19
        this.gn.Hw.setCanceledOnTouchOutside(false);     // Catch: java.lang.Throwable -> L19
        return this.gn.Hw;
    L14:
        if (com.aide.ui.Ha.v5() == false) goto L16;
        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title_promo, new java.lang.Object[]{"33%"}));     // Catch: java.lang.Throwable -> L19
        r6.setVisibility(0);     // Catch: java.lang.Throwable -> L19
        goto L17
    L16:
        r5.setText(this.gn.getString(com.almlkaide.kaypro.R.string.shop_expert_title));     // Catch: java.lang.Throwable -> L19
        goto L17
    }
}
