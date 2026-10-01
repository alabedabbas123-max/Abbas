package io.fabric.sdk.android.services.common;

class AdvertisingInfoReflectionStrategy implements io.fabric.sdk.android.services.common.e {
    private final android.content.Context j6;

    public AdvertisingInfoReflectionStrategy(android.content.Context r1) {
        this.j6 = r1.getApplicationContext();
    }

    private java.lang.String DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return (java.lang.String) java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new java.lang.Class[0]).invoke(FH(), new java.lang.Object[0]);
                }
                case 5: {
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.Object FH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new java.lang.Class[]{android.content.Context.class}).invoke(null, new java.lang.Object[]{this.j6});
                }
                case 5: {
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Hw() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return ((java.lang.Boolean) java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new java.lang.Class[0]).invoke(FH(), new java.lang.Object[0])).booleanValue();
                }
                case 5: {
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public io.fabric.sdk.android.services.common.ClassB j6() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6(this.j6) == true) { $pc3 = 5; continue $sw3; }
                    return null;
                }
                case 5: {
                    return new io.fabric.sdk.android.services.common.ClassB(DW(), Hw());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(android.content.Context r7) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (((java.lang.Integer) java.lang.Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new java.lang.Class[]{android.content.Context.class}).invoke(null, new java.lang.Object[]{r7})).intValue() != 0) { $pc4 = 10; continue $sw4; }
                    return true;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
