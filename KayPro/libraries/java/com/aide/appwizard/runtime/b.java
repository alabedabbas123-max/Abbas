package com.aide.appwizard.runtime;

@abcd.Interfacexu
class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.b.class, 4889396902212038425L, 1275389846248850589L);
    }

    b(com.aide.appwizard.runtime.AppWizardActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2853826181146614912L)
    public void onSystemUiVisibilityChange(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 733485695407567424L, this, new java.lang.Integer(r5));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(733485695407567424L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.getWindow().getDecorView().setSystemUiVisibility(4);
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
