package com.aide.common;

@abcd.Interfacexu
class Runnablem implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ClassN FH;

    static {
        abcd.wu.j6(com.aide.common.Runnablem.class, 1009115569069974369L, 4951476194642365813L);
    }

    Runnablem(com.aide.common.ClassN r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1761068182524048525L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 1222688143799863455L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(1222688143799863455L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.common.ClassN.j6(this.FH) == false) { $pc0 = 17; continue $sw0; }
                    try {
                        com.aide.common.ClassN.j6(this.FH, false);
                        com.aide.common.ClassN.DW(this.FH);
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
