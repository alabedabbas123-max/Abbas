package com.aide.common;

@abcd.Interfacexu
class ga extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.util.List gn;
    final com.aide.common.ab tp;
    final java.util.List u7;

    static {
        abcd.wu.j6(com.aide.common.ga.class, 5024868934807443193L, -3958470541192293128L);
    }

    ga(java.util.List r1, java.util.List r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -3537804853451679195L)
    public android.app.Dialog j6(android.app.Activity r9) {
        android.app.AlertDialog.Builder r2 = null;
        boolean[] r3 = null;
        int r5 = 0;
        android.app.AlertDialog r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 20; continue $sw0; }
                    abcd.wu.j6(th, -76967748890346780L, this, r9);
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-76967748890346780L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r9);
                        r3 = new boolean[this.gn.size()];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    r5 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r5 >= r3.length) { $pc0 = 10; continue $sw0; }
                    try {
                        r3[r5] = ((java.lang.Boolean) this.gn.get(r5)).booleanValue();
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    try {
                        r2.setCancelable(true).setMultiChoiceItems((java.lang.CharSequence[]) this.u7.toArray(new java.lang.CharSequence[0]), r3, new com.aide.common.DialogInterfaceOnMultiChoiceClickListenerfa(this)).setPositiveButton(r9.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenerea(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (this.EQ == null) { $pc0 = 13; continue $sw0; }
                    try {
                        r2.setTitle(this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    try {
                        r4 = r2.create();
                        r4.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
