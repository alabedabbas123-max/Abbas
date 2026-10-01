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
        java.io.File r0 = new java.io.File(r2);
        if (r0.exists() == false) goto L5;
        return r0;
    L5:
        return j6(r0);
    }

    private static java.lang.String DW(org.json.JSONArray r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L7;
        r0.append(r3.getString(r1));
        r1 = r1 + 1;
        goto L4
    L7:
        return r0.toString();
    }

    private org.json.JSONArray DW(java.io.BufferedReader r3) {
        org.json.JSONArray r0 = new org.json.JSONArray();
    L3:
        java.lang.String r1 = r3.readLine();
        if (r1 == null) goto L8;
        org.json.JSONObject r2 = FH(r1);
        if (r2 == null) goto L3;
        r0.put(r2);
        goto L3
    L8:
        return r0;
    }

    private org.json.JSONObject FH(java.lang.String r7) {
        com.crashlytics.android.core.Fa r8 = com.crashlytics.android.core.Ga.j6(r7);
        if (r8 != null) goto L5;
    L16:
        return null;
    L5:
        if (j6(r8) == false) goto L16;
        return j6(this.DW.j6(DW(r8.Hw)), r8);
    L11:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not create a binary image json string", e);
        return null;
    L14:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not generate ID for file " + r8.Hw, e);
        goto L16
    }

    private org.json.JSONArray Hw(java.lang.String r5) {
        org.json.JSONArray r0 = new org.json.JSONArray();
        java.lang.String[] r6 = DW(new org.json.JSONObject(r5).getJSONArray("maps")).split("\\|");
        int r1 = 0;
    L6:
        if (r1 >= r6.length) goto L11;
        org.json.JSONObject r2 = FH(r6[r1]);
        if (r2 == null) goto L10;
        r0.put(r2);
    L10:
        r1 = r1 + 1;
        goto L6
    L11:
        return r0;
    L12:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Unable to parse proc maps string", e);
        return r0;
    }

    private java.io.File j6(java.io.File r5) {
        if (android.os.Build.VERSION.SDK_INT >= 9) goto L6;
        return r5;
    L6:
        if (r5.getAbsolutePath().startsWith("/data") == false) goto L14;
        return new java.io.File(this.j6.getPackageManager().getApplicationInfo(this.j6.getPackageName(), 0).nativeLibraryDir, r5.getName());
    L9:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error getting ApplicationInfo", e);
        return r5;
    L14:
        return r5;
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
        if (r2.FH.indexOf(120) != (-1)) goto L5;
    L7:
        return false;
    L5:
        if (r2.Hw.indexOf(47) == (-1)) goto L7;
        return true;
    }

    private static byte[] j6(org.json.JSONArray r3) {
        org.json.JSONObject r0 = new org.json.JSONObject();
        r0.put("binary_images", r3);     // Catch: org.json.JSONException -> L6
        return r0.toString().getBytes();
    L6:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Binary images string is null", e);
        return new byte[0];
    }

    byte[] j6(java.io.BufferedReader r1) {
        return j6(DW(r1));
    }

    byte[] j6(java.lang.String r1) {
        return j6(Hw(r1));
    }
}
