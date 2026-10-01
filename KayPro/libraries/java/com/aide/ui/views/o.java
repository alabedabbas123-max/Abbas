package com.aide.ui.views;

@abcd.Interfacexu
class o extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditTextScrollView FH;
    final com.aide.ui.views.CodeEditTextScrollView.a Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.o.class, -1411785762941269443L, -4372523855922039040L);
    }

    o(com.aide.ui.views.CodeEditTextScrollView.a r1, com.aide.ui.views.CodeEditTextScrollView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -3546821365743434445L)
    public void onAnimationEnd(android.animation.Animator r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 1866879545032684000L, this, r5);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(1866879545032684000L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.Hw.isVisible() == true) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    if (com.aide.ui.views.CodeEditTextScrollView.a.j6(this.Hw) == true) { $pc0 = 20; continue $sw0; }
                    try {
                        r5.start();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
