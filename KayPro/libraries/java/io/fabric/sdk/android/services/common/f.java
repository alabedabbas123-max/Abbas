package io.fabric.sdk.android.services.common;

public class f {
    public f() {
    }

    protected java.lang.String DW(android.content.Context r6) {
        java.lang.String r1 = null;
        android.os.Bundle r7 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = null;
                    try {
                        r7 = r6.getPackageManager().getApplicationInfo(r6.getPackageName(), 128).metaData;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 16; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 == null) { $pc0 = 23; continue $sw0; }
                    try {
                        r2 = r7.getString("io.fabric.ApiKey");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 16; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    e = e;
                    r1 = r2;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
                    return r1;
                }
                case 7: {
                    if ("@string/twitter_consumer_secret".equals(r2) == false) { $pc0 = 10; continue $sw0; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r1 != null) { $pc0 = 24; continue $sw0; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 16; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r7.getString("com.crashlytics.ApiKey");
                }
                case 24: {
                    return r1;
                }
                case 10: {
                    r1 = r2;
                    { $pc0 = 11; continue $sw0; }
                }
                case 23: {
                    return null;
                }
                case 16: {
                    e = e;
                    { $pc0 = 17; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected java.lang.String FH(android.content.Context r5) {
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = io.fabric.sdk.android.services.common.i.j6(r5, "io.fabric.ApiKey", "string");
                    if (r1 != 0) { $pc1 = 5; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Falling back to Crashlytics key lookup from Strings");
                    r1 = io.fabric.sdk.android.services.common.i.j6(r5, "com.crashlytics.ApiKey", "string");
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r1 != 0) { $pc1 = 9; continue $sw1; }
                    return null;
                }
                case 9: {
                    return r5.getResources().getString(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Hw(android.content.Context r3) {
        java.lang.String r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW(r3);
                    if (android.text.TextUtils.isEmpty(r0) == false) { $pc2 = 6; continue $sw2; }
                    r0 = FH(r3);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (android.text.TextUtils.isEmpty(r0) == false) { $pc2 = 9; continue $sw2; }
                    r0 = j6(r3);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (android.text.TextUtils.isEmpty(r0) == false) { $pc2 = 11; continue $sw2; }
                    v5(r3);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected java.lang.String j6() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    protected java.lang.String j6(android.content.Context r2) {
        return new io.fabric.sdk.android.services.common.u().j6(r2);
    }

    protected void v5(android.content.Context r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (io.fabric.sdk.android.Fabric.isDebuggable() == true) { $pc3 = 9; continue $sw3; }
                    if (io.fabric.sdk.android.services.common.i.tp(r3) == true) { $pc3 = 9; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", j6());
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
