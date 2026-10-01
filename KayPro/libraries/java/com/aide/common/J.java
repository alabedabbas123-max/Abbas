package com.aide.common;

@abcd.Interfacexu
class J extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.lang.String gn;
    final java.lang.Runnable tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.common.J.class, 5024868934807443193L, -3957898729834816616L);
    }

    J(java.lang.String r1, java.lang.String r2, java.lang.Runnable r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -864884099276615355L)
    public android.app.Dialog j6(android.app.Activity r8) {
        android.app.AlertDialog.Builder r2 = null;
        android.app.AlertDialog r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, 400819676430452160L, this, r8);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(400819676430452160L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r8);
                        r2.setMessage(this.gn).setCancelable(true).setPositiveButton(r8.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenery(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (this.u7 == null) { $pc0 = 10; continue $sw0; }
                    try {
                        r2 = r2.setNegativeButton(this.u7, new com.aide.common.DialogInterfaceOnClickListenerz(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (this.EQ == null) { $pc0 = 12; continue $sw0; }
                    try {
                        r2 = r2.setTitle(this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        r3 = r2.create();
                        r3.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
