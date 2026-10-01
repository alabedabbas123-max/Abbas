package com.aide.ui.scm;

@abcd.Interfacexu
class fa implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.scm.ua.a FH;

    static {
        abcd.wu.j6(com.aide.ui.scm.fa.class, 873297534694796477L, -1032853904369646267L);
    }

    fa(com.aide.ui.scm.ua.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 278401736259541449L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4867927610150907477L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4867927610150907477L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.scm.ua.a.Zo(this.FH);
                        com.aide.ui.scm.ua.a.FH(this.FH, com.aide.ui.scm.ua.a.v5(this.FH));
                        com.aide.ui.scm.ua.a.Hw(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
