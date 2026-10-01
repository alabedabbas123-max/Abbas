package io.fabric.sdk.android.services.common;

public class u {
    public u() {
    }

    boolean DW(android.content.Context r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.f().DW(r3)) == true) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return !android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.f().FH(r3));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean FH(android.content.Context r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = io.fabric.sdk.android.services.common.i.j6(r3, "google_app_id", "string");
                    if (r0 != 0) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return !android.text.TextUtils.isEmpty(r3.getResources().getString(r0));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw(android.content.Context r4) {
        int r0 = 0;
        boolean r5 = false;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = io.fabric.sdk.android.services.common.i.j6(r4, "io.fabric.auto_initialize", "bool");
                    if (r0 != 0) { $pc2 = 6; continue $sw2; }
                    return false;
                }
                case 6: {
                    r5 = r4.getResources().getBoolean(r0);
                    if (r5 == false) { $pc2 = 9; continue $sw2; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.lang.String j6(android.content.Context r5) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = io.fabric.sdk.android.services.common.i.j6(r5, "google_app_id", "string");
                    if (r0 == 0) { $pc3 = 6; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
                    return j6(r5.getResources().getString(r0));
                }
                case 6: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.lang.String j6(java.lang.String r3) {
        return io.fabric.sdk.android.services.common.i.Hw(r3).substring(0, 40);
    }

    public boolean v5(android.content.Context r4) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (io.fabric.sdk.android.services.common.i.j6(r4, "com.crashlytics.useFirebaseAppId", false) == false) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    if (FH(r4) == true) { $pc4 = 8; continue $sw4; }
                    return false;
                }
                case 8: {
                    if (DW(r4) == true) { $pc4 = 12; continue $sw4; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
