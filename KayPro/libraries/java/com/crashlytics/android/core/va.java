package com.crashlytics.android.core;

class va implements com.crashlytics.android.core.Sa {
    private final java.lang.String DW;
    private final android.content.Context j6;

    public va(android.content.Context r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public java.lang.String j6() {
        android.content.pm.PackageManager r0 = this.j6.getPackageManager();
        android.os.Bundle r1 = r0.getApplicationInfo(this.DW, 128).metaData;     // Catch: java.lang.Exception -> L8
        if (r1 == null) goto L11;
        return r1.getString("io.fabric.unity.crashlytics.version");
    L11:
        return null;
    L12:
        return null;
    }
}
