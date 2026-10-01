package com.aide.uidesigner;

@abcd.Interfacexu
class ViewOnFocusChangeListenerl implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.TextView FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ViewOnFocusChangeListenerl.class, -2761603648942096159L, 1467829115778169480L);
    }

    ViewOnFocusChangeListenerl(com.aide.uidesigner.XmlLayoutDesignActivity r1, android.widget.TextView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3813137624418866304L)
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
                    abcd.wu.j6(th, 1656020100838463897L, this, r13, new java.lang.Boolean(r14));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1656020100838463897L, this, r13, new java.lang.Boolean(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r14 == false) { $pc0 = 8; continue $sw0; }
                    try {
                        r11 = new android.view.animation.ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.0f, 1, 0.5f);
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
                        r12 = new android.view.animation.ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.0f, 1, 0.5f);
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
