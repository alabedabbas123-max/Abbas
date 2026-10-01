package com.aide.common;

@abcd.Interfacexu
class S extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final java.lang.Runnable J0;
    final java.lang.String J8;
    final java.lang.String gn;
    final java.lang.Runnable tp;
    final java.lang.String u7;
    final java.lang.Runnable we;

    static {
        abcd.wu.j6(com.aide.common.S.class, 5024868934807443193L, -3958089333636895296L);
    }

    S(java.lang.String r1, java.lang.String r2, java.lang.Runnable r3, java.lang.String r4, java.lang.Runnable r5, java.lang.Runnable r6, java.lang.String r7) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
        this.J0 = r6;
        this.J8 = r7;
    }

    @Override
    @abcd.Interfacesu(method = 2456860913533244495L)
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
                    abcd.wu.j6(th, -2248646446936728765L, this, r8);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2248646446936728765L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r8);
                        r2.setMessage(this.gn).setCancelable(true).setPositiveButton(this.u7, new com.aide.common.P(this)).setNegativeButton(this.EQ, new com.aide.common.O(this));
                        r2.setOnCancelListener(new com.aide.common.Q(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (this.J8 == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setTitle(this.J8);
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
