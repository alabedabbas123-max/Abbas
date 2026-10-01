package com.aide.common;

@abcd.Interfacexu
class da extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.util.List gn;
    final com.aide.common.ab tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.common.da.class, 5024868934807443193L, -3958375239309538611L);
    }

    da(java.util.List r1, java.lang.String r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 2304848254897192840L)
    public android.app.Dialog j6(android.app.Activity r9) {
        android.app.AlertDialog.Builder r2 = null;
        int r3 = 0;
        android.app.AlertDialog r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 456209340131499376L, this, r9);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(456209340131499376L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r9);
                        r3 = this.gn.indexOf(this.u7);
                        r2.setCancelable(true).setSingleChoiceItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), r3, new com.aide.common.DialogInterfaceOnClickListenerca(this)).setPositiveButton(r9.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.DialogInterfaceOnClickListenerba(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (this.EQ == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setTitle(this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r4 = r2.create();
                        r4.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
