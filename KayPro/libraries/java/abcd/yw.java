package abcd;

public class yw {
    private static java.lang.reflect.Method DW;
    private static java.lang.reflect.Method j6;

    static {
        java.lang.Class<?> r0 = null;
        java.lang.reflect.Method r1 = null;
        android.app.Application r2 = null;
        java.lang.Object r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.sw.j6() == false) { $pc0 = 15; continue $sw0; }
                    return;
                }
                case 15: {
                    try {
                        r0 = java.lang.Class.forName("com.crashlytics.android.Crashlytics");
                        j6 = r0.getMethod("log", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class});
                        DW = r0.getMethod("logException", new java.lang.Class[]{java.lang.Throwable.class});
                        r1 = java.lang.Class.forName("io.fabric.sdk.android.Fabric").getMethod("with", new java.lang.Class[]{android.content.Context.class, java.lang.Class.forName("[Labcd/io.fabric.sdk.android.Kit;")});
                        r2 = abcd.wu.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 12; continue $sw0; }
                    try {
                        r3 = java.lang.reflect.Array.newInstance(java.lang.Class.forName("io.fabric.sdk.android.Kit"), 1);
                        java.lang.reflect.Array.set(r3, 0, r0.newInstance());
                        r1.invoke(null, new java.lang.Object[]{r2, r3});
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    try {
                        throw new java.lang.NullPointerException();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (DW == null) { $pc1 = 10; continue $sw1; }
                    j6(7, r3);
                    try {
                        DW.invoke(null, new java.lang.Object[]{r4});
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                case 11: {
                    return;
                }
                case 7: {
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(int r4, java.lang.String r5) {
        java.lang.reflect.Method r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6;
                    if (r0 != null) { $pc2 = 8; continue $sw2; }
                    return;
                }
                case 8: {
                    try {
                        r0.invoke(null, new java.lang.Object[]{java.lang.Integer.valueOf(r4), "BACKBONE", r5});
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(int r2, java.lang.String r3, java.lang.Throwable r4) {
        java.io.StringWriter r0 = new java.io.StringWriter();
        java.io.PrintWriter r1 = new java.io.PrintWriter(r0);
        r4.printStackTrace(r1);
        r1.flush();
        j6(r2, r3);
        j6(r2, r0.toString());
    }

    public static void j6(java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (abcd.sw.j6() == false) { $pc3 = 5; continue $sw3; }
                    android.util.Log.d("BACKBONE", r3 + ": " + r4);
                    return;
                }
                case 5: {
                    j6(3, r3 + ": " + r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (abcd.sw.j6() == false) { $pc4 = 5; continue $sw4; }
                    android.util.Log.d("BACKBONE", r3 + ": " + r4, r5);
                    return;
                }
                case 5: {
                    j6(3, r3 + ": " + r4, r5);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r1, java.lang.Throwable r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    android.util.Log.e("BACKBONE", r1, r2);
                    if (abcd.sw.j6() == true) { $pc5 = 6; continue $sw5; }
                    DW(r1, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
