package com.aide.ui.views;

@abcd.Interfacexu
class e implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditText.c FH;

    static {
        abcd.wu.j6(com.aide.ui.views.e.class, 2358818556014640983L, 157055811690113679L);
    }

    e(com.aide.ui.views.CodeEditText.c r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 234803935760915021L)
    public void run() {
        int r9 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -1268670401927613468L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1268670401927613468L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.views.CodeEditText.c.j6(this.FH, true);
                        r9 = com.aide.ui.views.CodeEditText.c.j6(this.FH, com.aide.ui.views.CodeEditText.c.DW(this.FH), com.aide.ui.views.CodeEditText.c.FH(this.FH));
                        r2 = com.aide.ui.views.CodeEditText.c.DW(this.FH, com.aide.ui.views.CodeEditText.c.DW(this.FH), com.aide.ui.views.CodeEditText.c.FH(this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (r9 <= 0) { $pc0 = 18; continue $sw0; }
                    if (r2 <= 0) { $pc0 = 19; continue $sw0; }
                    try {
                        this.FH.performHapticFeedback(0, 1);
                        com.aide.ui.views.CodeEditText.j6(this.FH.PH, r9, com.aide.ui.views.CodeEditText.c.j6(this.FH, r9, r2), r9, com.aide.ui.views.CodeEditText.c.DW(this.FH, r9, r2), com.aide.ui.views.CodeEditText.v5(this.FH.PH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                case 19: {
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
