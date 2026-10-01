package com.aide.licensing;

@abcd.Interfacexu
public class LicenseUpdateAlarmReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.LicenseUpdateAlarmReceiver.class, -1214724525099987816L, -1214724525099987816L);
    }

    public LicenseUpdateAlarmReceiver() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 242723384064248805L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(242723384064248805L, null);
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

    public static void DW(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -7397548022290710592L, null, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-7397548022290710592L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        j6(r5, 120000, false);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -236552509058634860L, null, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-236552509058634860L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        j6(r5, 3600000, true);
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

    @abcd.Interfacesu(method = -341753287749332060L)
    private static void j6(android.content.Context r8, int r9, boolean r10) {
        com.aide.licensing.d r0 = null;
        android.app.AlarmManager r1 = null;
        android.app.PendingIntent r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 12: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 16; continue $sw3; }
                    abcd.wu.j6(th, 1162441539074843508L, null, r8, new java.lang.Integer(r9), new java.lang.Boolean(r10));
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(1162441539074843508L, null, r8, new java.lang.Integer(r9), new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        r0 = new com.aide.licensing.d();
                        r0.j6(r8, true);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    if (r0.j6() == false) { $pc3 = 18; continue $sw3; }
                    try {
                        abcd.ue.j6("Restarting timer.");
                        r1 = (android.app.AlarmManager) r8.getSystemService("alarm");
                        r7 = android.app.PendingIntent.getBroadcast(r8, 0, new android.content.Intent(r8, com.aide.licensing.LicenseUpdateAlarmReceiver.class), 0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    if (r10 == false) { $pc3 = 10; continue $sw3; }
                    try {
                        r1.setInexactRepeating(0, java.lang.System.currentTimeMillis() + ((long) r9), 3600000, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    return;
                }
                case 10: {
                    try {
                        r1.setRepeating(0, java.lang.System.currentTimeMillis() + ((long) r9), 3600000, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, -934271877848022180L, this, r8, r9);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-934271877848022180L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        abcd.ue.j6("Timer broadcast received.");
                        r8.startService(new android.content.Intent(r8, com.aide.licensing.LicenseUpdateService.class));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
