package io.fabric.sdk.android.services.common;

public class l {
    private static java.lang.Object DW;
    private static io.fabric.sdk.android.services.common.l j6;
    private final android.content.SharedPreferences FH;
    private volatile boolean Hw;
    private boolean VH;
    private final io.fabric.sdk.android.services.common.s Zo;
    private volatile boolean v5;

    static {
        DW = new java.lang.Object();
    }

    private l(android.content.Context r7) {
        boolean r0 = false;
        boolean r1 = false;
        boolean r2 = false;
        android.content.pm.PackageManager r3 = null;
        android.content.pm.ApplicationInfo r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = false;
                    this.VH = false;
                    if (r7 == null) { $pc0 = 27; continue $sw0; }
                    this.FH = r7.getSharedPreferences("com.google.firebase.crashlytics.prefs", 0);
                    this.Zo = io.fabric.sdk.android.services.common.t.j6(r7);
                    if (this.FH.contains("firebase_crashlytics_collection_enabled") == false) { $pc0 = 29; continue $sw0; }
                    r1 = this.FH.getBoolean("firebase_crashlytics_collection_enabled", true);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r2 = true;
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    this.v5 = r1;
                    this.Hw = r2;
                    if (io.fabric.sdk.android.services.common.i.Ws(r7) == null) { $pc0 = 24; continue $sw0; }
                    r0 = true;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    this.VH = r0;
                    return;
                }
                case 29: {
                    try {
                        r3 = r7.getPackageManager();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == null) { $pc0 = 20; continue $sw0; }
                    try {
                        r4 = r3.getApplicationInfo(r7.getPackageName(), 128);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc0 = 20; continue $sw0; }
                    if (r4.metaData == null) { $pc0 = 20; continue $sw0; }
                    if (r4.metaData.containsKey("firebase_crashlytics_collection_enabled") == false) { $pc0 = 20; continue $sw0; }
                    try {
                        r1 = r4.metaData.getBoolean("firebase_crashlytics_collection_enabled");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r1 = true;
                    r2 = false;
                    $pc0 = 27; continue $sw0;
                }
                case 18: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to get PackageManager. Falling through", e);
                    { $pc0 = 20; continue $sw0; }
                }
                case 27: {
                    throw new java.lang.RuntimeException("null context");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static io.fabric.sdk.android.services.common.l j6(android.content.Context r2) {
        synchronized (DW) {
            java.lang.Object r0 = null;
            io.fabric.sdk.android.services.common.l r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = DW;
                        $pc1 = 5; continue $sw1;
                    }
                    case 10: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (j6 != null) { $pc1 = 7; continue $sw1; }
                        try {
                            j6 = new io.fabric.sdk.android.services.common.l(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        try {
                            r3 = j6;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 10; continue $sw1;
                        }
                        return r3;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public boolean DW() {
        return this.v5;
    }

    @android.annotation.SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    public void j6(boolean r3) {
        this.v5 = r3;
        this.Hw = true;
        this.FH.edit().putBoolean("firebase_crashlytics_collection_enabled", r3).commit();
    }

    public boolean j6() {
        io.fabric.sdk.android.services.common.s r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.VH == true) { $pc2 = 5; continue $sw2; }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r0 = this.Zo;
                    if (r0 != null) { $pc2 = 11; continue $sw2; }
                    return true;
                }
                case 11: {
                    return r0.j6();
                }
                case 5: {
                    if (this.Hw == false) { $pc2 = 8; continue $sw2; }
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
