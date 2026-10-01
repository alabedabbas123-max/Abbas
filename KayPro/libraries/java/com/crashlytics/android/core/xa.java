package com.crashlytics.android.core;

class xa {
    private static final java.nio.charset.Charset j6 = null;
    private final java.io.File DW;

    static {
        j6 = java.nio.charset.Charset.forName("UTF-8");
    }

    public xa(java.io.File r1) {
        this.DW = r1;
    }

    private static com.crashlytics.android.core.Ta Hw(java.lang.String r3) {
        org.json.JSONObject r0 = new org.json.JSONObject(r3);
        return new com.crashlytics.android.core.Ta(j6(r0, "userId"), j6(r0, "userName"), j6(r0, "userEmail"));
    }

    private static java.lang.String j6(com.crashlytics.android.core.Ta r1) {
        return new com.crashlytics.android.core.wa(r1).toString();
    }

    private static java.lang.String j6(java.util.Map<java.lang.String, java.lang.String> r1) {
        return new org.json.JSONObject(r1).toString();
    }

    private static java.lang.String j6(org.json.JSONObject r2, java.lang.String r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.isNull(r3) == false) { $pc0 = 5; continue $sw0; }
                    return null;
                }
                case 5: {
                    return r2.optString(r3, null);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File DW(java.lang.String r4) {
        return new java.io.File(this.DW, r4 + "user.meta");
    }

    public com.crashlytics.android.core.Ta FH(java.lang.String r6) {
        java.io.File r7 = null;
        java.io.FileInputStream r1 = null;
        java.io.FileInputStream r2 = null;
        com.crashlytics.android.core.Ta r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r7 = DW(r6);
                    if (r7.exists() == false) { $pc1 = 5; continue $sw1; }
                    r1 = null;
                    try {
                        r2 = new java.io.FileInputStream(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 17; continue $sw1; }
                        $pc1 = 15; continue $sw1;
                    }
                    try {
                        r8 = Hw(io.fabric.sdk.android.services.common.i.DW(r2));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 13; continue $sw1; }
                        $pc1 = 11; continue $sw1;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close user metadata file.");
                    return r8;
                }
                case 13: {
                    e = e;
                    r1 = r2;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error deserializing user metadata.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 15; continue $sw1;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
                    return com.crashlytics.android.core.Ta.j6;
                }
                case 11: {
                    th = th;
                    r1 = r2;
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
                    throw th;
                }
                case 17: {
                    e = e;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    th = th;
                    { $pc1 = 21; continue $sw1; }
                }
                case 5: {
                    return com.crashlytics.android.core.Ta.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File j6(java.lang.String r4) {
        return new java.io.File(this.DW, r4 + "keys.meta");
    }

    public void j6(java.lang.String r6, com.crashlytics.android.core.Ta r7) {
        java.io.File r8 = null;
        java.io.BufferedWriter r1 = null;
        java.lang.String r9 = null;
        java.io.BufferedWriter r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r8 = DW(r6);
                    r1 = null;
                    try {
                        r9 = j6(r7);
                        r2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8), j6));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 12; continue $sw2; }
                        $pc2 = 10; continue $sw2;
                    }
                    try {
                        r2.write(r9);
                        r2.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 8; continue $sw2; }
                        $pc2 = 6; continue $sw2;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close user metadata file.");
                    return;
                }
                case 8: {
                    e = e;
                    r1 = r2;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error serializing user metadata.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
                    return;
                }
                case 6: {
                    th = th;
                    r1 = r2;
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
                    throw th;
                }
                case 12: {
                    e = e;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    th = th;
                    { $pc2 = 16; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        java.io.File r8 = null;
        java.io.BufferedWriter r1 = null;
        java.lang.String r9 = null;
        java.io.BufferedWriter r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r8 = j6(r6);
                    r1 = null;
                    try {
                        r9 = j6(r7);
                        r2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8), j6));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 12; continue $sw3; }
                        $pc3 = 10; continue $sw3;
                    }
                    try {
                        r2.write(r9);
                        r2.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 8; continue $sw3; }
                        $pc3 = 6; continue $sw3;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close key/value metadata file.");
                    return;
                }
                case 8: {
                    e = e;
                    r1 = r2;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error serializing key/value metadata.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 10; continue $sw3;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close key/value metadata file.");
                    return;
                }
                case 6: {
                    th = th;
                    r1 = r2;
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close key/value metadata file.");
                    throw th;
                }
                case 12: {
                    e = e;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    th = th;
                    { $pc3 = 16; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
