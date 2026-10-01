package com.aide.ui.activities;

@abcd.Interfacexu
class Runnablee implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.Runnablef FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnablee.class, 309968735317025088L, -2463022478269158845L);
    }

    Runnablee(com.aide.ui.activities.Runnablef r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1992263547788468235L)
    public void run() {
        android.view.animation.AlphaAnimation r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5326613179874860365L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5326613179874860365L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                        r2.setAnimationListener(new com.aide.ui.activities.AnimationAnimationListenerd(this));
                        r2.setDuration(500);
                        this.FH.FH.startAnimation(r2);
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
