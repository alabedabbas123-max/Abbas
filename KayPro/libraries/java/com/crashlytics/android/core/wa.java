package com.crashlytics.android.core;

class wa extends org.json.JSONObject {
    final com.crashlytics.android.core.Ta j6;

    wa(com.crashlytics.android.core.Ta r2) {
        this.j6 = r2;
        put("userId", this.j6.DW);
        put("userName", this.j6.FH);
        put("userEmail", this.j6.Hw);
    }
}
