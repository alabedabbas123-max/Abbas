package com.aide.ui.views;

@abcd.Interfacexu
class s extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    @abcd.Interfacevu
    final com.aide.ui.views.SplitView Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.s.class, 786228931312646151L, 5732301071884813023L);
    }

    s(com.aide.ui.views.SplitView r1, java.lang.Runnable r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3731465117122560333L)
    public void onAnimationEnd(android.animation.Animator r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -2777247055128298063L, this, r5);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2777247055128298063L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.views.SplitView.access$202(this.Hw, false);
                        com.aide.ui.views.SplitView.access$300(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if (com.aide.ui.views.SplitView.access$100(this.Hw) == null) { $pc0 = 10; continue $sw0; }
                    try {
                        com.aide.ui.views.SplitView.access$100(this.Hw).j6(com.aide.ui.views.SplitView.access$200(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (this.FH == null) { $pc0 = 20; continue $sw0; }
                    try {
                        this.FH.run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
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
