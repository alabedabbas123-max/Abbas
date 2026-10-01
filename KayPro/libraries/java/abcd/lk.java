package abcd;

@abcd.Interfacexu
public class lk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 996150106863176160L)
    private boolean FH;

    @abcd.Interfaceru(field = 3542630941687810280L)
    private boolean Hw;

    static {
        abcd.wu.j6(abcd.lk.class, -843596403928054707L, -843596403928054707L);
    }

    public lk() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2673701869623466392L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2673701869623466392L, null);
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

    @abcd.Interfacesu(method = 489121587868889915L)
    private void DW(java.lang.String r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -5478772013821762951L, this, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-5478772013821762951L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        abcd.F.j6("Run app with root");
                        new java.lang.Thread(new abcd.RunnableC0965kk(this, r8, r9)).start();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.lk r0, java.lang.String r1) {
        r0.j6(r1);
    }

    static void j6(abcd.lk r0, java.lang.String r1, java.lang.String r2) {
        r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = 5317307856483046095L)
    private void j6(java.lang.String r8) {
        android.content.Intent r2 = null;
        android.net.Uri r3 = null;
        java.util.List<android.content.pm.ResolveInfo> r4 = null;
        java.util.Iterator<android.content.pm.ResolveInfo> r5 = null;
        android.content.pm.ActivityInfo r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 32; continue $sw2; }
                    abcd.wu.j6(th, -5404124222150917387L, this, r8);
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-5404124222150917387L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (com.aide.ui.U.dx() == true) { $pc2 = 9; continue $sw2; }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    try {
                        r2 = new android.content.Intent("android.intent.action.VIEW");
                        r2.addFlags(268435456);
                        r2.addFlags(4096);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (android.os.Build.VERSION.SDK_INT < 24) { $pc2 = 14; continue $sw2; }
                    try {
                        r3 = android.support.v4.content.FileProvider.j6(com.aide.ui.U.Zo(), abcd.Vl.Hw(), new java.io.File(r8));
                        r2.addFlags(1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    try {
                        r2.setDataAndType(r3, "application/vnd.android.package-archive");
                        r4 = com.aide.ui.U.Zo().getPackageManager().queryIntentActivities(r2, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (r4 != null) { $pc2 = 18; continue $sw2; }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    try {
                        com.aide.ui.U.Zo().startActivity(r2);
                        abcd.F.j6("Run app without root");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    return;
                }
                case 18: {
                    if (r4.size() <= 1) { $pc2 = 25; continue $sw2; }
                    try {
                        r5 = r4.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r5.hasNext() == false) { $pc2 = 25; continue $sw2; }
                    try {
                        r6 = r5.next().activityInfo;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if ("com.android.packageinstaller".equals(r6.applicationInfo.packageName) == false) { $pc2 = 21; continue $sw2; }
                    try {
                        r2.setComponent(new android.content.ComponentName(r6.applicationInfo.packageName, r6.name));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 25; continue $sw2; }
                }
                case 14: {
                    try {
                        r3 = android.net.Uri.fromFile(new java.io.File(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 15; continue $sw2; }
                }
                case 9: {
                    if (com.aide.ui.U.ei().FH() == true) { $pc2 = 11; continue $sw2; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 50355060517135400L)
    private void j6(boolean r9, java.lang.Runnable r10, java.lang.Runnable r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 15: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 19; continue $sw3; }
                    abcd.wu.j6(th, 3154158015646723140L, this, new java.lang.Boolean(r9), r10, r11);
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(3154158015646723140L, this, new java.lang.Boolean(r9), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r9 == true) { $pc3 = 8; continue $sw3; }
                    try {
                        r11.run();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    return;
                }
                case 8: {
                    if (this.Hw == true) { $pc3 = 10; continue $sw3; }
                    try {
                        this.Hw = true;
                        new java.lang.Thread(new abcd.Runnablegk(this, r10, r11)).start();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    return;
                }
                case 10: {
                    if (this.FH == false) { $pc3 = 12; continue $sw3; }
                    try {
                        r10.run();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    return;
                }
                case 12: {
                    try {
                        r11.run();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(abcd.lk r0) {
        return r0.FH;
    }

    static boolean j6(abcd.lk r0, boolean r1) {
        r0.FH = r1;
        return r1;
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, -112108143730738111L, this, r8, r9);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-112108143730738111L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        com.aide.ui.U.gn().Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    if (com.aide.ui.U.U2().Zo() == true) { $pc4 = 8; continue $sw4; }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    r0 = false;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    try {
                        j6(r0, new abcd.Runnabledk(this, r8, r9), new abcd.Runnableek(this, r8));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    return;
                }
                case 8: {
                    if (com.aide.ui.aa.SI() == false) { $pc4 = 10; continue $sw4; }
                    r0 = true;
                    { $pc4 = 11; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
