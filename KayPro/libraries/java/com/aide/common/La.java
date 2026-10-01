package com.aide.common;

@abcd.Interfacexu
class La implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.Wa FH;

    static {
        abcd.wu.j6(com.aide.common.La.class, 1991841546302420120L, 4295814352200809480L);
    }

    La(com.aide.common.Wa r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1344767388138720175L)
    public void onCancel(android.content.DialogInterface r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -5555600766420419235L, this, r5);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-5555600766420419235L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.common.Wa.j6(this.FH) == null) { $pc0 = 17; continue $sw0; }
                    try {
                        com.aide.common.Wa.j6(this.FH).run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
