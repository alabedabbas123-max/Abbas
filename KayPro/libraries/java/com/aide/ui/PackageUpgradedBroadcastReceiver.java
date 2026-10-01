package com.aide.ui;

@abcd.Interfacexu
public class PackageUpgradedBroadcastReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 492666457109862000L)
    private static com.aide.ui.Interfaceba j6;

    static {
        abcd.wu.j6(com.aide.ui.PackageUpgradedBroadcastReceiver.class, -2569420533032304756L, -2569420533032304756L);
    }

    public PackageUpgradedBroadcastReceiver() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4292635513943861888L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4292635513943861888L, null);
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

    public static void j6(com.aide.ui.Interfaceba r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (FH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 3240913113762591704L, null, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3240913113762591704L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        j6 = r5;
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

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 9: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 13; continue $sw2; }
                    abcd.wu.j6(th, -581107202848467105L, this, r8, r9);
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-581107202848467105L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (j6 == null) { $pc2 = 16; continue $sw2; }
                    try {
                        com.aide.ui.UserPresentBroadcastReceiver.j6(r8, j6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
