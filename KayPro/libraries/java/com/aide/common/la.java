package com.aide.common;

@abcd.Interfacexu
class la extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.Runnable EQ;
    final java.util.List gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;
    final java.lang.String we;

    static {
        abcd.wu.j6(com.aide.common.la.class, 5024868934807443193L, -3958661144945612280L);
    }

    la(java.util.List r1, com.aide.common.ab r2, java.lang.String r3, java.lang.Runnable r4, java.lang.String r5) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
    }

    @Override
    @abcd.Interfacesu(method = -2296044638408974725L)
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
                    abcd.wu.j6(th, 595647118095645911L, this, r8);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(595647118095645911L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r8);
                        r2.setCancelable(true).setItems((java.lang.CharSequence[]) this.gn.toArray(new java.lang.CharSequence[0]), new com.aide.common.DialogInterfaceOnClickListenerka(this)).setPositiveButton(this.tp, new com.aide.common.DialogInterfaceOnClickListenerja(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (this.we == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setTitle(this.we);
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
