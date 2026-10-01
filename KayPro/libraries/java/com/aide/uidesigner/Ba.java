package com.aide.uidesigner;

@abcd.Interfacexu
class Ba implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.Ba.class, -6184905212679667120L, 70651269002692932L);
    }

    Ba() {
    }

    @Override
    @abcd.Interfacesu(method = -243719923107383723L)
    public android.view.View j6(android.content.Context r6) {
        android.widget.ProgressBar r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5573954536003023424L, this, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5573954536003023424L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.widget.ProgressBar(r6, null, 16842872);
                        r2.setMax(100);
                        r2.setProgress(50);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
