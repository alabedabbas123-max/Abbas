package com.aide.ui;

@abcd.Interfacexu
class T implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;
    final android.app.ProgressDialog Hw;
    final java.lang.Runnable v5;

    static {
        abcd.wu.j6(com.aide.ui.T.class, -453326632858448869L, 457071312915294115L);
    }

    T(java.lang.Runnable r1, android.app.ProgressDialog r2, java.lang.Runnable r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    @abcd.Interfacesu(method = -502197465834385985L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, -116600052537112547L, this);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 17; continue $sw0; }
                    try {
                        abcd.wu.j6(-116600052537112547L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    try {
                        this.FH.run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    try {
                        com.aide.ui.U.j6(new com.aide.ui.S(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    th = $ex0;
                    try {
                        com.aide.ui.U.j6(new com.aide.ui.S(this));
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
