package abcd;

public class uw {
    private static final java.lang.Object j6 = null;

    static {
        j6 = new java.lang.Object();
    }

    private static java.io.File DW(android.content.Context r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (android.os.Build.VERSION.SDK_INT < 21) { $pc0 = 7; continue $sw0; }
                    return new java.io.File(r2.getNoBackupFilesDir(), "backbone");
                }
                case 7: {
                    return new java.io.File(r2.getApplicationInfo().dataDir, "no_backup/backbone");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.io.File DW(android.content.Context r4, java.lang.String r5) {
        java.lang.String[] r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r6 = new java.net.URL(r5).getPath().split("/");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc1 = 10; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6.length <= 3) { $pc1 = 9; continue $sw1; }
                    if (r6[3].length() <= 0) { $pc1 = 9; continue $sw1; }
                    return new java.io.File(j6(r4, "gone"), r6[3]);
                }
                case 9: {
                    return null;
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.io.File j6(android.content.Context r0) {
        return j6(DW(r0));
    }

    public static java.io.File j6(android.content.Context r1, java.lang.String r2) {
        return j6(new java.io.File(DW(r1), r2));
    }

    private static java.io.File j6(java.io.File r2) {
        synchronized (j6) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (r2.exists() == true) { $pc2 = 22; continue $sw2; }
                        r0 = j6;
                        $pc2 = 7; continue $sw2;
                    }
                    case 19: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 7: {
                        if (r2.exists() == false) { $pc2 = 9; continue $sw2; }
                        $pc2 = 17; continue $sw2;
                    }
                    case 17: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        { $pc2 = 22; continue $sw2; }
                    }
                    case 9: {
                        if (r2.mkdirs() == true) { $pc2 = 17; continue $sw2; }
                        if (r2.exists() == false) { $pc2 = 15; continue $sw2; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        return r2;
                    }
                    case 15: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        return null;
                    }
                    case 22: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
