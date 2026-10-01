package com.aide.ui;

@abcd.Interfacexu
public class ThemedGotoActivity extends android.app.Activity {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.ThemedGotoActivity.class, 4247642077307360501L, 4247642077307360501L);
    }

    public ThemedGotoActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3340893428054152485L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3340893428054152485L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 411990763470359000L)
    protected void onCreate(android.os.Bundle r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-354388216425018699L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        super.onCreate(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (com.aide.ui.aa.lg() == false) { $pc1 = 9; continue $sw1; }
                    try {
                        com.b.light(this, com.almlkaide.kaypro.R.style.ActivityGotoThemeLight);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                case 9: {
                    try {
                        com.b.dark(this, com.almlkaide.kaypro.R.style.ActivityGotoThemeDark);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, -354388216425018699L, this, r10);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
