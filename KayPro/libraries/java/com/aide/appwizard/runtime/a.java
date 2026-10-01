package com.aide.appwizard.runtime;

@abcd.Interfacexu
class a extends android.support.v4.app.Fragment {

    @abcd.Interfacetu
    private static boolean Qq;

    @abcd.Interfaceuu
    private static boolean sy;
    final com.aide.appwizard.runtime.i.c aj;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity lp;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.a.class, 4889396902212038425L, 1275361779258238672L);
    }

    a(com.aide.appwizard.runtime.AppWizardActivity r1, com.aide.appwizard.runtime.i.c r2) {
        this.lp = r1;
        this.aj = r2;
    }

    @Override
    @abcd.Interfacesu(method = 439866003850080525L)
    public android.view.View j6(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (sy == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 655660715125653801L, this, r9, r10, r11);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Qq == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(655660715125653801L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (this.aj.Hw() == null) { $pc0 = 10; continue $sw0; }
                    return r9.inflate(com.aide.appwizard.runtime.AppWizardActivity.j6(this.lp, "layout", this.aj.Hw()), r10, false);
                }
                case 10: {
                    return new android.widget.LinearLayout(this.lp);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
