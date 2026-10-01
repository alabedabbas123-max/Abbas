package com.aide.ui.marketing;

@abcd.Interfacexu
public class d {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.marketing.d.class, 2573400133095991248L, 2573400133095991248L);
    }

    public d() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4430980824286472003L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4430980824286472003L, null);
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

    public static void j6(android.content.Context r10, int r11, int r12, java.lang.String r13, java.lang.String r14, android.app.PendingIntent r15) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    abcd.wu.j6(80035777607334780L, null, new java.lang.Object[]{r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14, r15});
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    com.aide.ui.PackageUpgradedBroadcastReceiver.j6(new com.aide.ui.marketing.c(r13, r14, r12, r15, r11));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
