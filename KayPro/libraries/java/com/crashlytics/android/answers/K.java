package com.crashlytics.android.answers;

class K implements sz<com.crashlytics.android.answers.I> {
    K() {
    }

    public byte[] DW(com.crashlytics.android.answers.I r2) {
        return j6(r2).toString().getBytes("UTF-8");
    }

    @android.annotation.TargetApi(9)
    public org.json.JSONObject j6(com.crashlytics.android.answers.I r5) {
        org.json.JSONObject r0 = new org.json.JSONObject();     // Catch: org.json.JSONException -> L12
        com.crashlytics.android.answers.J r1 = r5.j6;     // Catch: org.json.JSONException -> L12
        r0.put("appBundleId", r1.j6);     // Catch: org.json.JSONException -> L12
        r0.put("executionId", r1.DW);     // Catch: org.json.JSONException -> L12
        r0.put("installationId", r1.FH);     // Catch: org.json.JSONException -> L12
        r0.put("limitAdTrackingEnabled", r1.Hw);     // Catch: org.json.JSONException -> L12
        r0.put("betaDeviceToken", r1.v5);     // Catch: org.json.JSONException -> L12
        r0.put("buildId", r1.Zo);     // Catch: org.json.JSONException -> L12
        r0.put("osVersion", r1.VH);     // Catch: org.json.JSONException -> L12
        r0.put("deviceModel", r1.gn);     // Catch: org.json.JSONException -> L12
        r0.put("appVersionCode", r1.u7);     // Catch: org.json.JSONException -> L12
        r0.put("appVersionName", r1.tp);     // Catch: org.json.JSONException -> L12
        r0.put("timestamp", r5.DW);     // Catch: org.json.JSONException -> L12
        r0.put("type", r5.FH.toString());     // Catch: org.json.JSONException -> L12
        if (r5.Hw == null) goto L5;
        r0.put("details", new org.json.JSONObject(r5.Hw));     // Catch: org.json.JSONException -> L12
    L5:
        r0.put("customType", r5.v5);     // Catch: org.json.JSONException -> L12
        if (r5.Zo == null) goto L8;
        r0.put("customAttributes", new org.json.JSONObject(r5.Zo));     // Catch: org.json.JSONException -> L12
    L8:
        r0.put("predefinedType", r5.VH);     // Catch: org.json.JSONException -> L12
        if (r5.gn == null) goto L11;
        r0.put("predefinedAttributes", new org.json.JSONObject(r5.gn));     // Catch: org.json.JSONException -> L12
    L11:
        return r0;
    L12:
        e = move-exception;
        if (android.os.Build.VERSION.SDK_INT < 9) goto L18;
        throw new java.io.IOException(e.getMessage(), e);
    L18:
        throw new java.io.IOException(e.getMessage());
    }

    public byte[] j6(java.lang.Object r1) {
        return DW((com.crashlytics.android.answers.I) r1);
    }
}
