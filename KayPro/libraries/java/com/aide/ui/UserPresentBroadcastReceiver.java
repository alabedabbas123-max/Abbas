package com.aide.ui;

@abcd.Interfacexu
public class UserPresentBroadcastReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 17552612737408700L)
    private static java.util.List<com.aide.ui.Interfaceba> j6;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.UserPresentBroadcastReceiver.class, 1770983406591680232L, 1770983406591680232L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5857911290733309L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5857911290733309L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public UserPresentBroadcastReceiver() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (FH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -563835753548286363L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-563835753548286363L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, com.aide.ui.Interfaceba r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 10: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 14; continue $sw2; }
                    abcd.wu.j6(th, 556530166429518396L, null, r7, r8);
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(556530166429518396L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (j6(r7) == false) { $pc2 = 8; continue $sw2; }
                    try {
                        r8.j6(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    try {
                        j6.add(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2543163155347239376L)
    private static boolean j6(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (FH == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, 543601946910737892L, null, r6);
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc3 = 8; continue $sw3; }
                    try {
                        abcd.wu.j6(543601946910737892L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (android.os.Build.VERSION.SDK_INT < 20) { $pc3 = 12; continue $sw3; }
                    return ((android.os.PowerManager) r6.getSystemService("power")).isInteractive();
                }
                case 12: {
                    return ((android.os.PowerManager) r6.getSystemService("power")).isScreenOn();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        java.util.Iterator<com.aide.ui.Interfaceba> r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 18; continue $sw4; }
                    abcd.wu.j6(th, 858345034516721504L, this, r8, r9);
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(858345034516721504L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r9.getAction().equals("android.intent.action.USER_PRESENT") == false) { $pc4 = 23; continue $sw4; }
                    try {
                        r0 = j6.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if (r0.hasNext() == false) { $pc4 = 11; continue $sw4; }
                    try {
                        r0.next().j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    { $pc4 = 9; continue $sw4; }
                }
                case 11: {
                    try {
                        j6.clear();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
