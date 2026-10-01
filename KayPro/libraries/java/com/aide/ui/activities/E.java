package com.aide.ui.activities;

@abcd.Interfacexu
class E implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.G FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.E.class, 2736360516742849000L, 1814864725867134105L);
    }

    E(com.aide.ui.activities.G r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 7877548614721583804L)
    public void onClick(android.view.View r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2013892394173628535L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2013892394173628535L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        abcd.F.j6("Clicked on Free Version in expert shop.");
                        this.FH.gn.Hw.dismiss();
                        this.FH.gn.setResult(-1);
                        this.FH.gn.finish();
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
