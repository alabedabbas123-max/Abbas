package com.aide.common;

@abcd.Interfacexu
class N extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.Runnable EQ;
    final java.lang.Runnable J0;
    final java.lang.String J8;
    final java.lang.String gn;
    final java.lang.String tp;
    final boolean u7;
    final java.lang.String we;

    static {
        abcd.wu.j6(com.aide.common.N.class, 5024868934807443193L, -3957994031737887603L);
    }

    N(java.lang.String r1, boolean r2, java.lang.String r3, java.lang.Runnable r4, java.lang.String r5, java.lang.Runnable r6, java.lang.String r7) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
        this.J0 = r6;
        this.J8 = r7;
    }

    @Override
    @abcd.Interfacesu(method = -2376518919812464035L)
    public android.app.Dialog j6(android.app.Activity r6) {
        android.app.AlertDialog.Builder r2 = null;
        android.app.AlertDialog r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 16: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 20; continue $sw0; }
                    abcd.wu.j6(th, 386175114217446220L, this, r6);
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(386175114217446220L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r6);
                        r2.setMessage(this.gn).setCancelable(this.u7);
                        r2.setPositiveButton(this.tp, new com.aide.common.K(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (this.we == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setNegativeButton(this.we, new com.aide.common.L(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r2.setOnCancelListener(new com.aide.common.M(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (this.J8 == null) { $pc0 = 12; continue $sw0; }
                    try {
                        r2.setTitle(this.J8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        r3 = r2.create();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (this.u7 == false) { $pc0 = 15; continue $sw0; }
                    try {
                        r3.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
