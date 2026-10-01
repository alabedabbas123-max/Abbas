package com.crashlytics.android.answers;

class K implements sz<com.crashlytics.android.answers.I> {
    K() {
    }

    public byte[] DW(com.crashlytics.android.answers.I r2) {
        return j6(r2).toString().getBytes("UTF-8");
    }

    @android.annotation.TargetApi(9)
    public org.json.JSONObject j6(com.crashlytics.android.answers.I r5) {
        org.json.JSONObject r0 = null;
        com.crashlytics.android.answers.J r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = new org.json.JSONObject();
                        r1 = r5.j6;
                        r0.put("appBundleId", r1.j6);
                        r0.put("executionId", r1.DW);
                        r0.put("installationId", r1.FH);
                        r0.put("limitAdTrackingEnabled", r1.Hw);
                        r0.put("betaDeviceToken", r1.v5);
                        r0.put("buildId", r1.Zo);
                        r0.put("osVersion", r1.VH);
                        r0.put("deviceModel", r1.gn);
                        r0.put("appVersionCode", r1.u7);
                        r0.put("appVersionName", r1.tp);
                        r0.put("timestamp", r5.DW);
                        r0.put("type", r5.FH.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.Hw == null) { $pc0 = 5; continue $sw0; }
                    try {
                        r0.put("details", new org.json.JSONObject(r5.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0.put("customType", r5.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.Zo == null) { $pc0 = 8; continue $sw0; }
                    try {
                        r0.put("customAttributes", new org.json.JSONObject(r5.Zo));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    try {
                        r0.put("predefinedType", r5.VH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.gn == null) { $pc0 = 11; continue $sw0; }
                    try {
                        r0.put("predefinedAttributes", new org.json.JSONObject(r5.gn));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return r0;
                }
                case 12: {
                    e = $ex0;
                    if (android.os.Build.VERSION.SDK_INT < 9) { $pc0 = 18; continue $sw0; }
                    throw new java.io.IOException(e.getMessage(), e);
                }
                case 18: {
                    throw new java.io.IOException(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6(java.lang.Object r1) {
        return DW((com.crashlytics.android.answers.I) r1);
    }
}
