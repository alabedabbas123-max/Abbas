package com.aide.appwizard;

@abcd.Interfacexu
class i implements com.aide.common.ab<java.lang.Boolean> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.appwizard.runtime.i.b FH;

    @abcd.Interfacevu
    final com.aide.appwizard.B Hw;

    static {
        abcd.wu.j6(com.aide.appwizard.i.class, 3947348440358438304L, -5959149736594528825L);
    }

    i(com.aide.appwizard.B r1, com.aide.appwizard.runtime.i.b r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @abcd.Interfacesu(method = -5988553370174489448L)
    public void j62(java.lang.Boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 6875799961447635392L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(6875799961447635392L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.DW(r5);
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

    @Override
    public void j6(java.lang.Boolean r1) {
        j62(r1);
    }
}
