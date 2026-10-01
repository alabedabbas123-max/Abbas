package io.fabric.sdk.android.services.common;

public class f {
    public f() {
    }

    protected java.lang.String DW(android.content.Context r6) {
        java.lang.String r1 = null;
        android.os.Bundle r7 = r6.getPackageManager().getApplicationInfo(r6.getPackageName(), 128).metaData;     // Catch: java.lang.Exception -> L16
        if (r7 == null) goto L23;
        java.lang.String r2 = r7.getString("io.fabric.ApiKey");     // Catch: java.lang.Exception -> L16
    L14:
        e = e;
        r1 = r2;
    L17:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
        return r1;
    L7:
        if ("@string/twitter_consumer_secret".equals(r2) == false) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");     // Catch: java.lang.Exception -> L14
    L11:
        if (r1 != null) goto L24;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Falling back to Crashlytics key lookup from Manifest");     // Catch: java.lang.Exception -> L16
        return r7.getString("com.crashlytics.ApiKey");
    L24:
        return r1;
    L10:
        r1 = r2;
        goto L11
    L23:
        return null;
    L16:
        e = e;
        goto L17
    }

    protected java.lang.String FH(android.content.Context r5) {
        int r1 = io.fabric.sdk.android.services.common.i.j6(r5, "io.fabric.ApiKey", "string");
        if (r1 != 0) goto L5;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Falling back to Crashlytics key lookup from Strings");
        r1 = io.fabric.sdk.android.services.common.i.j6(r5, "com.crashlytics.ApiKey", "string");
    L5:
        if (r1 != 0) goto L9;
        return null;
    L9:
        return r5.getResources().getString(r1);
    }

    public java.lang.String Hw(android.content.Context r3) {
        java.lang.String r0 = DW(r3);
        if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
        r0 = FH(r3);
    L6:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L9;
        r0 = j6(r3);
    L9:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
        v5(r3);
    L11:
        return r0;
    }

    protected java.lang.String j6() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    protected java.lang.String j6(android.content.Context r2) {
        return new io.fabric.sdk.android.services.common.u().j6(r2);
    }

    protected void v5(android.content.Context r3) {
        if (io.fabric.sdk.android.Fabric.isDebuggable() == true) goto L9;
        if (io.fabric.sdk.android.services.common.i.tp(r3) == true) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", j6());
        return;
    L9:
        throw new java.lang.IllegalArgumentException(j6());
    }
}
