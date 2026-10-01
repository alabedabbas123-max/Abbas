package com.aide.ui;

@abcd.Interfacexu
class hb extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 3164909993861141616L)
    private android.app.AlertDialog gn;

    @abcd.Interfaceru(field = -988021708659045048L)
    private boolean u7;

    static {
        abcd.wu.j6(com.aide.ui.hb.class, -1144715414290518888L, -5082352772425214503L);
    }

    hb() {
        this.u7 = true;
    }

    static android.app.AlertDialog j6(com.aide.ui.hb r0) {
        return r0.gn;
    }

    @abcd.Interfacesu(method = -2767068283982644797L)
    private void j6(android.app.Activity r11, android.widget.LinearLayout r12) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -530578913367934144L, this, r11, r12);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-530578913367934144L, this, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.trainer.n.j6(r12, com.aide.ui.U.SI().DW(), this.u7, false, new com.aide.ui.eb(this, r11), new com.aide.ui.fb(this, r11, r12), null, new com.aide.ui.gb(this, r11), null);     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.ui.hb r0, android.app.Activity r1, android.widget.LinearLayout r2) {
        r0.j6(r1, r2);
    }

    static boolean j6(com.aide.ui.hb r0, boolean r1) {
        r0.u7 = r1;
        return r1;
    }

    @Override
    @abcd.Interfacesu(method = -982706334512133296L)
    protected android.app.Dialog j6(android.app.Activity r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -1588154207801548053L, this, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1588154207801548053L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r6).inflate(com.almlkaide.kaypro.R.layout.trainer_dialog, null);     // Catch: java.lang.Throwable -> L8
        j6(r6, (android.widget.LinearLayout) r2.findViewById(com.almlkaide.kaypro.R.id.trainerDialogLayout));     // Catch: java.lang.Throwable -> L8
        this.gn = new android.app.AlertDialog.Builder(r6).setTitle(com.almlkaide.kaypro.R.string.trainer_option_question).setView(r2).setCancelable(false).create();     // Catch: java.lang.Throwable -> L8
        this.gn.setOnShowListener(new com.aide.ui.db(this, r6));     // Catch: java.lang.Throwable -> L8
        return this.gn;
    }
}
