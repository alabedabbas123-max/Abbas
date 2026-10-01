package com.aide.ui.debugger;

@abcd.Interfacexu
public class ADRTReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.debugger.ADRTReceiver.class, 6932572682887363125L, 6932572682887363125L);
    }

    public ADRTReceiver() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2023906095643802075L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2023906095643802075L, null);
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
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        java.lang.String[] r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r4 = null;
        java.util.ArrayList<java.lang.String> r8 = null;
        java.util.ArrayList<java.lang.String> r9 = null;
        java.util.ArrayList<java.lang.String> r10 = null;
        java.util.ArrayList<java.lang.String> r5 = null;
        java.util.ArrayList<java.lang.String> r6 = null;
        java.util.ArrayList<java.lang.String> r7 = null;
        java.util.ArrayList<java.lang.String> r11 = null;
        java.util.ArrayList<java.lang.String> r14 = null;
        java.util.ArrayList<java.lang.String> r15 = null;
        java.lang.String r16 = null;
        java.lang.String r17 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 24: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 28; continue $sw1; }
                    abcd.wu.j6(th, -792867024760012752L, this, r12, r13);
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-792867024760012752L, this, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r13.getExtras() != null) { $pc1 = 8; continue $sw1; }
                    return;
                }
                case 8: {
                    if ("com.adrt.LOGCAT_ENTRIES".equals(r13.getAction()) == false) { $pc1 = 12; continue $sw1; }
                    try {
                        r0 = r13.getStringArrayExtra("lines");
                        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 12: {
                    if ("com.adrt.CONNECT".equals(r13.getAction()) == false) { $pc1 = 15; continue $sw1; }
                    try {
                        r1 = r13.getExtras().getString("package");
                        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 15: {
                    if ("com.adrt.STOP".equals(r13.getAction()) == false) { $pc1 = 18; continue $sw1; }
                    try {
                        r2 = r13.getExtras().getString("package");
                        com.aide.ui.debugger.Debugger.j6(r12).DW(r12, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 18: {
                    if ("com.adrt.BREAKPOINT_HIT".equals(r13.getAction()) == false) { $pc1 = 21; continue $sw1; }
                    try {
                        r4 = r13.getExtras().getString("package");
                        r8 = r13.getExtras().getStringArrayList("variables");
                        r9 = r13.getExtras().getStringArrayList("variableValues");
                        r10 = r13.getExtras().getStringArrayList("variableKinds");
                        r5 = r13.getExtras().getStringArrayList("stackMethods");
                        r6 = r13.getExtras().getStringArrayList("stackLocations");
                        r7 = r13.getExtras().getStringArrayList("stackLocationKinds");
                        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r4, r5, r6, r7, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 21: {
                    if ("com.adrt.FIELDS".equals(r13.getAction()) == false) { $pc1 = 35; continue $sw1; }
                    try {
                        r11 = r13.getExtras().getStringArrayList("fields");
                        r14 = r13.getExtras().getStringArrayList("fieldValues");
                        r15 = r13.getExtras().getStringArrayList("fieldKinds");
                        r16 = r13.getExtras().getString("package");
                        r17 = r13.getExtras().getString("path");
                        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r16, r17, r11, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 35: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
