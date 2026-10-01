package com.aide.ui.activities;

@abcd.Interfacexu
class Runnablef implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.AndroidTrainerActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnablef.class, 309968735317025088L, -727466108285928357L);
    }

    Runnablef(com.aide.ui.activities.AndroidTrainerActivity r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -800958751669565573L)
    public void run() {
        android.view.animation.AlphaAnimation r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, 5323450954276543200L, this);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(5323450954276543200L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.U.sh() == true) { $pc0 = 20; continue $sw0; }
                    try {
                        com.aide.ui.U.SI().er();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if (this.Hw.getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false) == false) { $pc0 = 11; continue $sw0; }
                    return;
                }
                case 11: {
                    try {
                        r2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                        r2.setDuration(500);
                        this.FH.startAnimation(r2);
                        this.FH.setVisibility(0);
                        r2.setAnimationListener(new com.aide.ui.activities.AnimationAnimationListenerc(this));
                        new android.os.Handler().postDelayed(new com.aide.ui.activities.Runnablee(this), this.Hw.getIntent().getIntExtra("EXTRA_DURATION", 10) * 1000);
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
