package com.crashlytics.android.answers;

public class o implements com.crashlytics.android.answers.u {
    private final java.lang.Object DW;
    private final java.lang.reflect.Method j6;

    public o(java.lang.Object r1, java.lang.reflect.Method r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    private static java.lang.Class DW(android.content.Context r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return r1.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.reflect.Method DW(android.content.Context r3, java.lang.Class r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return r4.getDeclaredMethod("logEventInternal", new java.lang.Class[]{java.lang.String.class, java.lang.String.class, android.os.Bundle.class});
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.crashlytics.android.answers.u j6(android.content.Context r3) {
        java.lang.Class r0 = null;
        java.lang.Object r2 = null;
        java.lang.reflect.Method r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW(r3);
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    r2 = j6(r3, r0);
                    if (r2 != null) { $pc2 = 8; continue $sw2; }
                    return null;
                }
                case 8: {
                    r4 = DW(r3, r0);
                    if (r4 != null) { $pc2 = 12; continue $sw2; }
                    return null;
                }
                case 12: {
                    return new com.crashlytics.android.answers.o(r2, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.Object j6(android.content.Context r5, java.lang.Class r6) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    return r6.getDeclaredMethod("getInstance", new java.lang.Class[]{android.content.Context.class}).invoke(r6, new java.lang.Object[]{r5});
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r2, android.os.Bundle r3) {
        j6("fab", r2, r3);
    }

    @Override
    public void j6(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        this.j6.invoke(this.DW, new java.lang.Object[]{r5, r6, r7});     // Catch: java.lang.Exception -> L4
        return;
    }
}
