package com.aide.appwizard;

@abcd.Interfacexu
class ViewOnClickListenerb implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.AppWizardDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.ViewOnClickListenerb.class, 2913940607094183125L, -4801949061737521743L);
    }

    ViewOnClickListenerb(com.aide.appwizard.AppWizardDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 422404864575850176L)
    public void onClick(android.view.View r5) {
        com.aide.appwizard.AppWizardDesignActivity r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, -535812570207302256L, this, r5);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-535812570207302256L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    if (this.FH.QX() == true) { $pc0 = 9; continue $sw0; }
                    r3 = true;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        com.aide.appwizard.AppWizardDesignActivity.j6(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    r3 = false;
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
