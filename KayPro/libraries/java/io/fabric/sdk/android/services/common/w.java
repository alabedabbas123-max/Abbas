package io.fabric.sdk.android.services.common;

class w implements Sy<java.lang.String> {
    final io.fabric.sdk.android.services.common.x j6;

    w(io.fabric.sdk.android.services.common.x r1) {
        this.j6 = r1;
    }

    public java.lang.Object j6(android.content.Context r1) {
        return m43j6(r1);
    }

    public java.lang.String m43j6(android.content.Context r2) {
        java.lang.String r3 = r2.getPackageManager().getInstallerPackageName(r2.getPackageName());
        if (r3 != null) goto L6;
        return "";
    L6:
        return r3;
    }
}
