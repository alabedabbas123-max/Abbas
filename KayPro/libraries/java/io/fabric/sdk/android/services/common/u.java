package io.fabric.sdk.android.services.common;

public class u {
    public u() {
    }

    boolean DW(android.content.Context r3) {
        if (android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.f().DW(r3)) == true) goto L6;
        return true;
    L6:
        return !android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.f().FH(r3));
    }

    boolean FH(android.content.Context r3) {
        int r0 = io.fabric.sdk.android.services.common.i.j6(r3, "google_app_id", "string");
        if (r0 != 0) goto L7;
        return false;
    L7:
        return !android.text.TextUtils.isEmpty(r3.getResources().getString(r0));
    }

    public boolean Hw(android.content.Context r4) {
        int r0 = io.fabric.sdk.android.services.common.i.j6(r4, "io.fabric.auto_initialize", "bool");
        if (r0 != 0) goto L6;
        return false;
    L6:
        boolean r5 = r4.getResources().getBoolean(r0);
        if (r5 == false) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
    L9:
        return r5;
    }

    java.lang.String j6(android.content.Context r5) {
        int r0 = io.fabric.sdk.android.services.common.i.j6(r5, "google_app_id", "string");
        if (r0 == 0) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return j6(r5.getResources().getString(r0));
    L6:
        return null;
    }

    java.lang.String j6(java.lang.String r3) {
        return io.fabric.sdk.android.services.common.i.Hw(r3).substring(0, 40);
    }

    public boolean v5(android.content.Context r4) {
        if (io.fabric.sdk.android.services.common.i.j6(r4, "com.crashlytics.useFirebaseAppId", false) == false) goto L6;
        return true;
    L6:
        if (FH(r4) == true) goto L8;
        return false;
    L8:
        if (DW(r4) == true) goto L12;
        return true;
    L12:
        return false;
    }
}
