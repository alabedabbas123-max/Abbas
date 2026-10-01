package com.aide.common;

@abcd.Interfacexu
class Sa implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    static {
        abcd.wu.j6(com.aide.common.Sa.class, 1991841546302420120L, -5453190372600529752L);
    }

    Sa(android.app.Activity r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -4158398700277072211L)
    private java.lang.String DW() {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -1612750355503795260L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 16; continue $sw0; }
                    try {
                        abcd.wu.j6(-1612750355503795260L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    return this.FH.getPackageManager().getPackageInfo(this.FH.getPackageName(), 0).versionName;
                }
                case 8: {
                    e = $ex0;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return "(version unknown)";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @abcd.Interfacesu(method = 3825986702556139180L)
    private java.lang.String j6() {
        long r0 = 0L;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 3509514631334873775L;
                    $pc1 = 18; continue $sw1;
                }
                case 14: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 18; continue $sw1; }
                    abcd.wu.j6(th, r0, this);
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3509514631334873775L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 14; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = android.os.Build.MODEL;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 14; continue $sw1;
                    }
                    if (r2 != null) { $pc1 = 9; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return "";
                }
                case 9: {
                    if (r2.length() > 40) { $pc1 = 12; continue $sw1; }
                    try {
                        r0 = "on my " + r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 14; continue $sw1;
                    }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1794388573208594625L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -3970204642281089625L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3970204642281089625L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        com.aide.common.Ha.j6(this.FH, "support@appfour.com", "AIDE Feedback", "With AIDE " + DW() + " " + j6() + " (SDK " + android.os.Build.VERSION.SDK_INT + ")...\n\n[Write text here]");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
