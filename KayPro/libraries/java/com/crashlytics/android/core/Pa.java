package com.crashlytics.android.core;

class Pa implements com.crashlytics.android.core.ClassC.a {
    Pa() {
    }

    private static java.lang.String j6(java.lang.String r3) {
        java.io.BufferedInputStream r0 = null;
        java.io.BufferedInputStream r1 = new java.io.BufferedInputStream(new java.io.FileInputStream(r3));     // Catch: java.lang.Throwable -> L9
        java.lang.String r4 = io.fabric.sdk.android.services.common.i.j6(r1);     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r1);
        return r4;
    L7:
        th = th;
        r0 = r1;
    L10:
        io.fabric.sdk.android.services.common.i.j6(r0);
        throw th;
    L9:
        th = th;
        goto L10
    }

    @Override
    public java.lang.String j6(java.io.File r1) {
        return j6(r1.getPath());
    }
}
