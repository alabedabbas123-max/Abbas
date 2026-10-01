package com.crashlytics.android;

public class CrashlyticsInitProvider extends android.content.ContentProvider {

    interface a {
        boolean j6(android.content.Context r1);
    }

    public CrashlyticsInitProvider() {
    }

    private io.fabric.sdk.android.Kit[] j6(android.content.Context r7) {
        android.os.Bundle r8 = null;
        boolean r9 = false;
        com.crashlytics.android.Crashlytics r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r8 = r7.getPackageManager().getApplicationInfo(r7.getPackageName(), 128).metaData;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 == null) { $pc0 = 10; continue $sw0; }
                    if (r8.getBoolean("firebase_crashlytics_ndk_enabled", false) == false) { $pc0 = 10; continue $sw0; }
                    r9 = true;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3 = new com.crashlytics.android.Crashlytics();
                    if (r9 == false) { $pc0 = 18; continue $sw0; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().v5("Fabric", "Crashlytics is initializing NDK crash reporter.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return new io.fabric.sdk.android.Kit[]{r3, new com.crashlytics.android.ndk.CrashlyticsNdk()};
                }
                case 15: {
                    th = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK...", th);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    return new io.fabric.sdk.android.Kit[]{r3};
                }
                case 10: {
                    r9 = false;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to get PackageManager while determining if Crashlytics NDK should be initialized", e);
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
        return 0;
    }

    @Override
    public java.lang.String getType(android.net.Uri r1) {
        return null;
    }

    @Override
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
        return null;
    }

    boolean j6(android.content.Context r2, io.fabric.sdk.android.services.common.u r3, com.crashlytics.android.CrashlyticsInitProvider.a r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.v5(r2) == false) { $pc1 = 7; continue $sw1; }
                    return r4.j6(r2);
                }
                case 7: {
                    return r3.Hw(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onCreate() {
        android.content.Context r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = getContext();
                    if (j6(r0, new io.fabric.sdk.android.services.common.u(), new com.crashlytics.android.a()) == true) { $pc2 = 11; continue $sw2; }
                    io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider skipping initialization");
                    return true;
                }
                case 11: {
                    try {
                        io.fabric.sdk.android.Fabric.with(r0, j6(r0.getApplicationContext()));
                        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.IllegalStateException) { $pc2 = 6; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 6: {
                    io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
        return null;
    }

    @Override
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
        return 0;
    }
}
