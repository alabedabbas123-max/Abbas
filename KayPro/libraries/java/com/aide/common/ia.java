package com.aide.common;

@abcd.Interfacexu
class ia extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.util.List gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;

    static {
        abcd.wu.j6(com.aide.common.ia.class, 5024868934807443193L, -3958565843070984351L);
    }

    ia(java.util.List r1, com.aide.common.ab r2, java.lang.String r3) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
    }

    @Override
    @abcd.Interfacesu(method = -3021180994019088999L)
    public android.app.Dialog j6(android.app.Activity r8) {
        android.app.AlertDialog.Builder r2 = null;
        android.app.AlertDialog r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -2548067668697914160L, this, r8);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2548067668697914160L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r8);
                        r2.setCancelable(true).setItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), new com.aide.common.DialogInterfaceOnClickListenerha(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (this.tp == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setTitle(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r3 = r2.create();
                        r3.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
