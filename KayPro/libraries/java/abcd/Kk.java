package abcd;

@abcd.Interfacexu
public class Kk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Kk.class, -495786187121037287L, -495786187121037287L);
    }

    public Kk() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1322339339664368060L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1322339339664368060L, null);
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

    @abcd.Interfacesu(method = -2207084599969325960L)
    private void j6(android.content.Context r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1911362321980657488L, this, r10);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1911362321980657488L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        j6(r10, "engine", "Code Analysis Notifications", "Notifications showing error checking progress and statistics.", 2);
                        j6(r10, "other", "Other Notifications", "All other notifications.", 3);
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

    @abcd.Interfacesu(method = 1445762437662561304L)
    private void j6(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
        android.app.NotificationManager r0 = null;
        android.app.NotificationChannel r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 10: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 14; continue $sw2; }
                    abcd.wu.j6(th, -1405744868706864096L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-1405744868706864096L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (android.os.Build.VERSION.SDK_INT >= 26) { $pc2 = 8; continue $sw2; }
                    return;
                }
                case 8: {
                    try {
                        r0 = (android.app.NotificationManager) r11.getSystemService("notification");
                        r1 = new android.app.NotificationChannel(r12, r13, r15);
                        r1.setDescription(r14);
                        r0.createNotificationChannel(r1);
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

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 2465520606808208779L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2465520606808208779L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        j6(com.aide.ui.U.Zo());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
