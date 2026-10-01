package com.aide.ui.views;

@abcd.Interfacexu
class k implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final int Hw;

    @abcd.Interfacevu
    final com.aide.ui.views.CodeEditTextScrollView v5;

    static {
        abcd.wu.j6(com.aide.ui.views.k.class, 1527178060401062972L, -2222965217968661424L);
    }

    k(com.aide.ui.views.CodeEditTextScrollView r1, int r2, int r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1521310037490889240L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2066584472879788192L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2066584472879788192L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.v5.scrollTo(this.v5.getScrollX(), this.FH);
                        com.aide.ui.views.CodeEditTextScrollView.DW(this.v5).scrollTo(this.Hw, com.aide.ui.views.CodeEditTextScrollView.DW(this.v5).getScrollY());
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
