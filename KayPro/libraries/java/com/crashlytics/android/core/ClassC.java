package com.crashlytics.android.core;

class ClassC {
    private final com.crashlytics.android.core.ClassC.a DW;
    private final android.content.Context j6;

    interface a {
        java.lang.String j6(java.io.File r1);
    }

    ClassC(android.content.Context r1, com.crashlytics.android.core.ClassC.a r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private java.io.File DW(java.lang.String r2) {
        java.io.File r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.io.File(r2);
                    if (r0.exists() == false) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    return j6(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String DW(org.json.JSONArray r3) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r3.length()) { $pc1 = 7; continue $sw1; }
                    r0.append(r3.getString(r1));
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 7: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private org.json.JSONArray DW(java.io.BufferedReader r3) {
        org.json.JSONArray r0 = null;
        java.lang.String r1 = null;
        org.json.JSONObject r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new org.json.JSONArray();
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r1 = r3.readLine();
                    if (r1 == null) { $pc2 = 8; continue $sw2; }
                    r2 = FH(r1);
                    if (r2 == null) { $pc2 = 3; continue $sw2; }
                    r0.put(r2);
                    { $pc2 = 3; continue $sw2; }
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private org.json.JSONObject FH(java.lang.String r7) {
        com.crashlytics.android.core.Fa r8 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r8 = com.crashlytics.android.core.Ga.j6(r7);
                    if (r8 != null) { $pc3 = 5; continue $sw3; }
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    return null;
                }
                case 5: {
                    if (j6(r8) == false) { $pc3 = 16; continue $sw3; }
                    return j6(this.DW.j6(DW(r8.Hw)), r8);
                }
                case 11: {
                    e = $ex3;
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not create a binary image json string", e);
                    return null;
                }
                case 14: {
                    e = $ex3;
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not generate ID for file " + r8.Hw, e);
                    { $pc3 = 16; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private org.json.JSONArray Hw(java.lang.String r5) {
        org.json.JSONArray r0 = null;
        java.lang.String[] r6 = null;
        int r1 = 0;
        org.json.JSONObject r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new org.json.JSONArray();
                    r6 = DW(new org.json.JSONObject(r5).getJSONArray("maps")).split("\\|");
                    r1 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r1 >= r6.length) { $pc4 = 11; continue $sw4; }
                    r2 = FH(r6[r1]);
                    if (r2 == null) { $pc4 = 10; continue $sw4; }
                    r0.put(r2);
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    r1 = r1 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 11: {
                    return r0;
                }
                case 12: {
                    e = $ex4;
                    io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Unable to parse proc maps string", e);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.io.File j6(java.io.File r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (android.os.Build.VERSION.SDK_INT >= 9) { $pc5 = 6; continue $sw5; }
                    return r5;
                }
                case 6: {
                    if (r5.getAbsolutePath().startsWith("/data") == false) { $pc5 = 14; continue $sw5; }
                    return new java.io.File(this.j6.getPackageManager().getApplicationInfo(this.j6.getPackageName(), 0).nativeLibraryDir, r5.getName());
                }
                case 9: {
                    e = $ex5;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error getting ApplicationInfo", e);
                    return r5;
                }
                case 14: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static org.json.JSONObject j6(java.lang.String r4, com.crashlytics.android.core.Fa r5) {
        org.json.JSONObject r0 = new org.json.JSONObject();
        r0.put("base_address", r5.j6);
        r0.put("size", r5.DW);
        r0.put("name", r5.Hw);
        r0.put("uuid", r4);
        return r0;
    }

    private static boolean j6(com.crashlytics.android.core.Fa r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2.FH.indexOf(120) != (-1)) { $pc6 = 5; continue $sw6; }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r2.Hw.indexOf(47) == (-1)) { $pc6 = 7; continue $sw6; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] j6(org.json.JSONArray r3) {
        org.json.JSONObject r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new org.json.JSONObject();
                    try {
                        r0.put("binary_images", r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof org.json.JSONException) { $pc7 = 6; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.toString().getBytes();
                }
                case 6: {
                    e = $ex7;
                    io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Binary images string is null", e);
                    return new byte[0];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] j6(java.io.BufferedReader r1) {
        return j6(DW(r1));
    }

    byte[] j6(java.lang.String r1) {
        return j6(Hw(r1));
    }
}
