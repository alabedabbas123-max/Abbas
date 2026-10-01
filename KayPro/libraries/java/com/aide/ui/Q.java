package com.aide.ui;

@abcd.Interfacexu
class Q implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    static {
        abcd.wu.j6(com.aide.ui.Q.class, -453326632858448869L, 457042280351436384L);
    }

    Q(java.lang.Runnable r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 745571020612975260L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, -6989045231720881980L, this);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-6989045231720881980L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.U.sh() == false) { $pc0 = 20; continue $sw0; }
                    return;
                }
                case 20: {
                    try {
                        this.FH.run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    return;
                }
                case 11: {
                    th = $ex0;
                    try {
                        com.aide.common.ClassH.DW(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
