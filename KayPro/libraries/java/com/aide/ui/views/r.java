package com.aide.ui.views;

@abcd.Interfacexu
class r extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.SplitView FH;

    static {
        abcd.wu.j6(com.aide.ui.views.r.class, 786228931312646151L, 5732171316550764988L);
    }

    r(com.aide.ui.views.SplitView r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -4667583895997088085L)
    public void onAnimationEnd(android.animation.Animator r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2834547301221155835L, this, r7);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2834547301221155835L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.views.SplitView.access$002(this.FH, -1);
                        this.FH.postDelayed(new com.aide.ui.views.q(this), 50);
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
