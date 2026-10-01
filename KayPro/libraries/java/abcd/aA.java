package abcd;

class aA implements abcd.Zz {
    private final io.fabric.sdk.android.Kit j6;

    public aA(io.fabric.sdk.android.Kit r1) {
        this.j6 = r1;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:21:0x0059 */
    @Override
    public org.json.JSONObject j6() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Reading cached settings...");
        java.io.FileInputStream r1 = null;
        java.io.File r3 = new java.io.File(new abcd.Pz(this.j6).j6(), "com.crashlytics.settings.json");     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        if (r3.exists() == false) goto L10;
        java.io.FileInputStream r4 = new java.io.FileInputStream(r3);     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        org.json.JSONObject r5 = new org.json.JSONObject(io.fabric.sdk.android.services.common.i.DW(r4));     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L20
        r1 = r4;
    L12:
        io.fabric.sdk.android.services.common.i.j6(r1, "Error while closing settings cache file.");
        return r5;
    L8:
        e = e;
    L17:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to fetch cached settings", e);     // Catch: java.lang.Throwable -> L20
        io.fabric.sdk.android.services.common.i.j6(r4, "Error while closing settings cache file.");
        return null;
    L10:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "No cached settings found.");     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r5 = null;
    L20:
        th = move-exception;
        th = th;
        r1 = r4;
    L22:
        io.fabric.sdk.android.services.common.i.j6(r1, "Error while closing settings cache file.");
        throw th;
    L15:
        e = e;
        r4 = null;
    L13:
        th = th;
        goto L22
    }

    @Override
    public void j6(long r6, org.json.JSONObject r8) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Writing settings to cache file...");
        if (r8 == null) goto L26;
        java.io.FileWriter r1 = null;
        r8.put("expires_at", r6);     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
        java.io.FileWriter r7 = new java.io.FileWriter(new java.io.File(new abcd.Pz(this.j6).j6(), "com.crashlytics.settings.json"));     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
        r7.write(r8.toString());     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> L10
        r7.flush();     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> L10
        io.fabric.sdk.android.services.common.i.j6(r7, "Failed to close settings writer.");
    L20:
        return;
    L10:
        e = e;
        r1 = r7;
    L15:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to cache settings", e);     // Catch: java.lang.Throwable -> L12
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close settings writer.");
    L8:
        th = th;
        r1 = r7;
    L17:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close settings writer.");
        throw th;
    L12:
        th = th;
    L14:
        e = e;
        goto L15
    }
}
