package abcd;

class bA implements abcd.InterfacelA {
    private final abcd.InterfaceoA DW;
    private final io.fabric.sdk.android.services.common.k FH;
    private final abcd.Zz Hw;
    private final abcd.Qz VH;
    private final io.fabric.sdk.android.Kit Zo;
    private final io.fabric.sdk.android.services.common.l gn;
    private final abcd.pA j6;
    private final abcd.InterfaceqA v5;

    public bA(io.fabric.sdk.android.Kit r1, abcd.pA r2, io.fabric.sdk.android.services.common.k r3, abcd.InterfaceoA r4, abcd.Zz r5, abcd.InterfaceqA r6, io.fabric.sdk.android.services.common.l r7) {
        this.Zo = r1;
        this.j6 = r2;
        this.FH = r3;
        this.DW = r4;
        this.Hw = r5;
        this.v5 = r6;
        this.gn = r7;
        this.VH = new abcd.Rz(this.Zo);
    }

    private abcd.mA DW(abcd.EnumkA r7) {
        abcd.mA r1 = null;
        org.json.JSONObject r2 = null;
        abcd.mA r3 = null;
        long r4 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = null;
                    $pc0 = 24; continue $sw0;
                }
                case 23: {
                    e = e;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to get cached settings", e);
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    return r1;
                }
                case 4: {
                    if (abcd.EnumkA.DW.equals(r7) == true) { $pc0 = 28; continue $sw0; }
                    try {
                        r2 = this.Hw.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == null) { $pc0 = 21; continue $sw0; }
                    try {
                        r3 = this.DW.j6(this.FH, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == null) { $pc0 = 20; continue $sw0; }
                    try {
                        j6(r2, "Loaded cached settings: ");
                        r4 = this.FH.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (abcd.EnumkA.FH.equals(r7) == false) { $pc0 = 12; continue $sw0; }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Returning cached settings.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r3;
                    $pc0 = 12; continue $sw0;
                }
                case 18: {
                    e = e;
                    r1 = r3;
                    { $pc0 = 24; continue $sw0; }
                }
                case 12: {
                    if (r3.j6(r4) == false) { $pc0 = 26; continue $sw0; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Cached settings have expired.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 28; continue $sw0; }
                }
                case 20: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to transform cached settings data.", null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 28; continue $sw0; }
                }
                case 21: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "No cached settings data found.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    { $pc0 = 25; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(org.json.JSONObject r3, java.lang.String r4) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", r4 + r3.toString());
    }

    boolean DW() {
        return !Hw().equals(FH());
    }

    java.lang.String FH() {
        return io.fabric.sdk.android.services.common.i.j6(new java.lang.String[]{io.fabric.sdk.android.services.common.i.J8(this.Zo.getContext())});
    }

    java.lang.String Hw() {
        return this.VH.get().getString("existing_instance_identifier", "");
    }

    @Override
    public abcd.mA j6() {
        return j6(abcd.EnumkA.j6);
    }

    @Override
    public abcd.mA j6(abcd.EnumkA r6) {
        abcd.mA r2 = null;
        org.json.JSONObject r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = null;
                    if (this.gn.j6() == true) { $pc1 = 21; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Not fetching settings, because data collection is disabled by Firebase.");
                    return null;
                }
                case 21: {
                    $pc1 = 7; continue $sw1;
                }
                case 18: {
                    e = $ex1;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
                    return null;
                }
                case 7: {
                    if (io.fabric.sdk.android.Fabric.isDebuggable() == false) { $pc1 = 9; continue $sw1; }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r2 != null) { $pc1 = 15; continue $sw1; }
                    try {
                        r7 = this.v5.j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 18; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 == null) { $pc1 = 15; continue $sw1; }
                    try {
                        r2 = this.DW.j6(this.FH, r7);
                        this.Hw.j6(r2.VH, r7);
                        j6(r7, "Loaded settings: ");
                        j6(FH());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 18; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    if (r2 != null) { $pc1 = 23; continue $sw1; }
                    return DW(abcd.EnumkA.FH);
                }
                case 23: {
                    return r2;
                }
                case 9: {
                    if (DW() == true) { $pc1 = 11; continue $sw1; }
                    try {
                        r2 = DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 18; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 11; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    boolean j6(java.lang.String r3) {
        android.content.SharedPreferences.Editor r0 = this.VH.edit();
        r0.putString("existing_instance_identifier", r3);
        return this.VH.j6(r0);
    }
}
