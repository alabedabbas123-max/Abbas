package com.crashlytics.android.core;

class A extends java.util.HashMap<java.lang.String, java.lang.Object> {
    final com.crashlytics.android.core.B j6;

    A(com.crashlytics.android.core.B r3) {
        this.j6 = r3;
        put("session_id", this.j6.j6);
        put("generator", this.j6.DW);
        put("started_at_seconds", java.lang.Long.valueOf(this.j6.FH));
    }
}
