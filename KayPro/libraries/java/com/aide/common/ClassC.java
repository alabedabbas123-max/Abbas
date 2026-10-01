package com.aide.common;

@abcd.Interfacexu
public class ClassC {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.ClassC.class, -1052730398773059792L, -1052730398773059792L);
    }

    public ClassC() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2962499628609957195L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2962499628609957195L, null);
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

    public static void j6(android.app.Activity r10, int r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, -4398990657079797208L, null, r10, new java.lang.Integer(r11), r12, r13, new java.lang.Boolean(r14));
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-4398990657079797208L, null, r10, new java.lang.Integer(r11), r12, r13, new java.lang.Boolean(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.putExtra("EXTRA_LINKID", r13);
                        r0.putExtra("EXTRA_IS_OPTIONAL_OFFER", r14);
                        r0.setComponent(new android.content.ComponentName(r10, "com.aide.ui.activities.ShopLearningPopupActivity"));
                        r0.putExtra("EXTRA_FEATURE", r12);
                        r0.putExtra("EXTRA_SHOW_PRIME_MONTHLY", true);
                        r0.putExtra("EXTRA_SHOW_PRIME_YEARLY", true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    if (r11 != 0) { $pc1 = 8; continue $sw1; }
                    try {
                        r10.startActivity(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                case 8: {
                    try {
                        r10.startActivityForResult(r0, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r10, int r11, java.lang.String r12, boolean r13, boolean r14) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 10: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 14; continue $sw2; }
                    abcd.wu.j6(th, -1613045651623607565L, null, r10, new java.lang.Integer(r11), r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-1613045651623607565L, null, r10, new java.lang.Integer(r11), r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.putExtra("EXTRA_LINKID", r12);
                        r0.putExtra("EXTRA_HILIGHT_ADS", r13);
                        r0.putExtra("EXTRA_IS_OPTIONAL_OFFER", r14);
                        r0.setComponent(new android.content.ComponentName(r10, "com.aide.ui.activities.ShopExpertPopupActivity"));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    if (r11 != 0) { $pc2 = 8; continue $sw2; }
                    try {
                        r10.startActivity(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    try {
                        r10.startActivityForResult(r0, r11);
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
}
