package com.aide.ui.activities;

@abcd.Interfacexu
class V implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.V.class, 3404442532748635224L, -4321179414784815483L);
    }

    V(com.aide.ui.activities.TrainerCourseActivity r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 5325654333745505067L)
    public void onFocusChange(android.view.View r13, boolean r14) {
        android.view.animation.ScaleAnimation r11 = null;
        android.view.animation.ScaleAnimation r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 3612437317759635144L, this, r13, new java.lang.Boolean(r14));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3612437317759635144L, this, r13, new java.lang.Boolean(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r14 == false) { $pc0 = 8; continue $sw0; }
                    try {
                        r11 = new android.view.animation.ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);
                        r11.setDuration(400);
                        r11.setFillAfter(true);
                        this.FH.startAnimation(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    try {
                        r12 = new android.view.animation.ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
                        r12.setDuration(400);
                        r12.setFillAfter(true);
                        this.FH.startAnimation(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
