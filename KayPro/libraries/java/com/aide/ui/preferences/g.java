package com.aide.ui.preferences;

@abcd.Interfacexu
class g implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.KeyBindingsPreferencesFragment FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.g.class, 341889297030401769L, 159513137324753568L);
    }

    g(com.aide.ui.preferences.KeyBindingsPreferencesFragment r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1328183033938220000L)
    public void run() {
        android.view.View r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -851003983592724299L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-851003983592724299L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.U.j3().DW();
                        r2 = this.FH.getView();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    if ((r2 instanceof com.aide.ui.preferences.KeyBindingsView) == false) { $pc0 = 17; continue $sw0; }
                    try {
                        ((com.aide.ui.preferences.KeyBindingsView) r2).j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
