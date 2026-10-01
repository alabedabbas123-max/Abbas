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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -530578913367934144L, this, r11, r12);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-530578913367934144L, this, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        com.aide.ui.trainer.n.j6(r12, com.aide.ui.U.SI().DW(), this.u7, false, new com.aide.ui.eb(this, r11), new com.aide.ui.fb(this, r11, r12), null, new com.aide.ui.gb(this, r11), null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.view.View r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1588154207801548053L, this, r6);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1588154207801548053L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r6).inflate(com.almlkaide.kaypro.R.layout.trainer_dialog, null);
                        j6(r6, (android.widget.LinearLayout) r2.findViewById(com.almlkaide.kaypro.R.id.trainerDialogLayout));
                        this.gn = new android.app.AlertDialog.Builder(r6).setTitle(com.almlkaide.kaypro.R.string.trainer_option_question).setView(r2).setCancelable(false).create();
                        this.gn.setOnShowListener(new com.aide.ui.db(this, r6));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
