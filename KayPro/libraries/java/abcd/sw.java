package abcd;

public class sw {
    private static final java.lang.Object DW = null;
    private static java.lang.Boolean j6;

    static {
        DW = new java.lang.Object();
    }

    public static void DW() {
        synchronized (DW) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = DW;
                        try {
                            j6 = null;
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private static boolean FH() {
        return "true".equals(j6("debug.backbone"));
    }

    private static java.lang.String j6(java.lang.String r7) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", new java.lang.Class[]{java.lang.String.class}).invoke(null, new java.lang.Object[]{r7});
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6() {
        synchronized (DW) {
            java.lang.Object r0 = null;
            boolean r1 = false;
            boolean r2 = false;
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = DW;
                        $pc2 = 5; continue $sw2;
                    }
                    case 18: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (j6 == null) { $pc2 = 9; continue $sw2; }
                        try {
                            r1 = j6.booleanValue();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 18; continue $sw2;
                        }
                        return r1;
                    }
                    case 9: {
                        try {
                            j6 = java.lang.Boolean.valueOf(FH());
                            r2 = abcd.rw.v5();
                            abcd.rw.j6(j6.booleanValue());
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 18; continue $sw2;
                        }
                        if (r2 != j6.booleanValue()) { $pc2 = 12; continue $sw2; }
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        try {
                            r3 = j6.booleanValue();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 18; continue $sw2;
                        }
                        return r3;
                    }
                    case 12: {
                        if (j6.booleanValue() == false) { $pc2 = 14; continue $sw2; }
                        try {
                            abcd.xw.j6(694086856, 17301629, "backbone developer mode enabled");
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 18; continue $sw2;
                        }
                        { $pc2 = 15; continue $sw2; }
                    }
                    case 14: {
                        try {
                            abcd.xw.j6(694086856, 17301642, "backbone developer mode disabled");
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 18; continue $sw2;
                        }
                        { $pc2 = 15; continue $sw2; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
