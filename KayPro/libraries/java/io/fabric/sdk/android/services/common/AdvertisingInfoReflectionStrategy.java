package io.fabric.sdk.android.services.common;

class AdvertisingInfoReflectionStrategy implements io.fabric.sdk.android.services.common.e {
    private final android.content.Context j6;

    public AdvertisingInfoReflectionStrategy(android.content.Context r1) {
        this.j6 = r1.getApplicationContext();
    }

    private java.lang.String DW() {
        return (java.lang.String) java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new java.lang.Class[0]).invoke(FH(), new java.lang.Object[0]);
    L5:
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
        return null;
    }

    private java.lang.Object FH() {
        return java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new java.lang.Class[]{android.content.Context.class}).invoke(null, new java.lang.Object[]{this.j6});
    L5:
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
        return null;
    }

    private boolean Hw() {
        return ((java.lang.Boolean) java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new java.lang.Class[0]).invoke(FH(), new java.lang.Object[0])).booleanValue();
    L5:
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
        return false;
    }

    @Override
    public io.fabric.sdk.android.services.common.ClassB j6() {
        if (j6(this.j6) == true) goto L5;
        return null;
    L5:
        return new io.fabric.sdk.android.services.common.ClassB(DW(), Hw());
    }

    boolean j6(android.content.Context r7) {
        if (((java.lang.Integer) java.lang.Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new java.lang.Class[]{android.content.Context.class}).invoke(null, new java.lang.Object[]{r7})).intValue() != 0) goto L10;
        return true;
    L10:
        return false;
    L11:
        return false;
    }
}
