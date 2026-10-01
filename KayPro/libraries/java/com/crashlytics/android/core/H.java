package com.crashlytics.android.core;

class H extends java.util.HashMap<java.lang.String, java.lang.Object> {
    final com.crashlytics.android.core.I j6;

    H(com.crashlytics.android.core.I r2) {
        this.j6 = r2;
        put("version", android.os.Build.VERSION.RELEASE);
        put("build_version", android.os.Build.VERSION.CODENAME);
        put("is_rooted", java.lang.Boolean.valueOf(this.j6.j6));
    }
}
