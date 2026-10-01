package com.aide.common;

@abcd.Interfacexu
class aa extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final java.lang.String EQ;
    final boolean gn;
    final com.aide.common.ab tp;
    final java.util.List u7;

    static {
        abcd.wu.j6(com.aide.common.aa.class, 5024868934807443193L, -3958279937422720800L);
    }

    aa(boolean r1, java.util.List r2, com.aide.common.ab r3, java.lang.String r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = 1010893011337355800L)
    public android.app.Dialog j6(android.app.Activity r7) {
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
                    abcd.wu.j6(th, -1758519470366775573L, this, r7);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1758519470366775573L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r7);
                        r2.setCancelable(this.gn).setItems((java.lang.CharSequence[]) this.u7.toArray(new java.lang.CharSequence[0]), new com.aide.common.Z(this));
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
                        r3 = r2.create();
                        r3.setCanceledOnTouchOutside(this.gn);
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
