package com.aide.common;

@abcd.Interfacexu
class Y extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final com.aide.common.ClassU gn;
    final java.lang.String tp;
    final com.aide.common.ab u7;

    static {
        abcd.wu.j6(com.aide.common.Y.class, 5024868934807443193L, -3958184635531839695L);
    }

    Y(com.aide.common.ClassU r1, com.aide.common.ab r2, java.lang.String r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 2538487364002070459L)
    public android.app.Dialog j6(android.app.Activity r8) {
        com.aide.common.KeyStrokeEditText r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        android.app.AlertDialog r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -4965164946137233320L, this, r8);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4965164946137233320L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new com.aide.common.KeyStrokeEditText(r8);
                        r2.setKeyStroke(this.gn);
                        r2.setOnEditorActionListener(new com.aide.common.T(this, r8, r2));
                        r3 = new android.app.AlertDialog.Builder(r8);
                        r3.setView(r2).setMessage(this.tp).setCancelable(true).setPositiveButton(r8.getResources().getString(com.aide.ui.Ra.dialog_ok), new com.aide.common.W(this, r8, r2)).setNegativeButton(r8.getResources().getString(com.aide.ui.Ra.dialog_cancel), new com.aide.common.V(this, r8, r2)).setNeutralButton("Default", new com.aide.common.U(this, r8, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (this.EQ == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r3.setTitle(this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r4 = r3.create();
                        r4.setOnShowListener(new com.aide.common.X(this, r8, r2));
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
