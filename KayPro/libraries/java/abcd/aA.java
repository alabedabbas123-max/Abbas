package abcd;

class aA implements abcd.Zz {
    private final io.fabric.sdk.android.Kit j6;

    public aA(io.fabric.sdk.android.Kit r1) {
        this.j6 = r1;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:21:0x0059 */
    @Override
    public org.json.JSONObject j6() {
        java.io.FileInputStream r1 = null;
        java.io.File r3 = null;
        java.io.FileInputStream r4 = null;
        org.json.JSONObject r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Reading cached settings...");
                    r1 = null;
                    try {
                        r3 = new java.io.File(new abcd.Pz(this.j6).j6(), "com.crashlytics.settings.json");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 15; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    if (r3.exists() == false) { $pc0 = 10; continue $sw0; }
                    try {
                        r4 = new java.io.FileInputStream(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 15; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    try {
                        r5 = new org.json.JSONObject(io.fabric.sdk.android.services.common.i.DW(r4));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        $pc0 = 20; continue $sw0;
                    }
                    r1 = r4;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Error while closing settings cache file.");
                    return r5;
                }
                case 8: {
                    e = e;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to fetch cached settings", e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 20; continue $sw0;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r4, "Error while closing settings cache file.");
                    return null;
                }
                case 10: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "No cached settings found.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 15; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    r5 = null;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    th = $ex0;
                    th = th;
                    r1 = r4;
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Error while closing settings cache file.");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    e = e;
                    r4 = null;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    th = th;
                    { $pc0 = 22; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(long r6, org.json.JSONObject r8) {
        java.io.FileWriter r1 = null;
        java.io.FileWriter r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Writing settings to cache file...");
                    if (r8 == null) { $pc1 = 26; continue $sw1; }
                    r1 = null;
                    try {
                        r8.put("expires_at", r6);
                        r7 = new java.io.FileWriter(new java.io.File(new abcd.Pz(this.j6).j6(), "com.crashlytics.settings.json"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        $pc1 = 12; continue $sw1;
                    }
                    try {
                        r7.write(r8.toString());
                        r7.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 10; continue $sw1; }
                        $pc1 = 8; continue $sw1;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r7, "Failed to close settings writer.");
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    return;
                }
                case 10: {
                    e = e;
                    r1 = r7;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to cache settings", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close settings writer.");
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    th = th;
                    r1 = r7;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close settings writer.");
                    throw th;
                }
                case 12: {
                    th = th;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    e = e;
                    { $pc1 = 15; continue $sw1; }
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
