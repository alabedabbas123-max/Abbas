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
    L23:
        e = e;
    L24:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to get cached settings", e);
    L25:
        return r1;
    L4:
        if (abcd.EnumkA.DW.equals(r7) == true) goto L28;
        org.json.JSONObject r2 = this.Hw.j6();     // Catch: java.lang.Exception -> L23
        if (r2 == null) goto L21;
        abcd.mA r3 = this.DW.j6(this.FH, r2);     // Catch: java.lang.Exception -> L23
        if (r3 == null) goto L20;
        j6(r2, "Loaded cached settings: ");     // Catch: java.lang.Exception -> L23
        long r4 = this.FH.j6();     // Catch: java.lang.Exception -> L23
        if (abcd.EnumkA.FH.equals(r7) == false) goto L12;
    L26:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Returning cached settings.");     // Catch: java.lang.Exception -> L18
        r1 = r3;
    L18:
        e = e;
        r1 = r3;
        goto L24
    L12:
        if (r3.j6(r4) == false) goto L26;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Cached settings have expired.");     // Catch: java.lang.Exception -> L23
        goto L28
    L20:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to transform cached settings data.", null);     // Catch: java.lang.Exception -> L23
        goto L28
    L21:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "No cached settings data found.");     // Catch: java.lang.Exception -> L23
    L28:
        goto L25
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
        if (this.gn.j6() == true) goto L21;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Not fetching settings, because data collection is disabled by Firebase.");
        return null;
    L21:
    L18:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
        return null;
    L7:
        if (io.fabric.sdk.android.Fabric.isDebuggable() == false) goto L9;
    L11:
        if (r2 != null) goto L15;
        org.json.JSONObject r7 = this.v5.j6(this.j6);     // Catch: java.lang.Exception -> L18
        if (r7 == null) goto L15;
        r2 = this.DW.j6(this.FH, r7);     // Catch: java.lang.Exception -> L18
        this.Hw.j6(r2.VH, r7);     // Catch: java.lang.Exception -> L18
        j6(r7, "Loaded settings: ");     // Catch: java.lang.Exception -> L18
        j6(FH());     // Catch: java.lang.Exception -> L18
    L15:
        if (r2 != null) goto L23;
        return DW(abcd.EnumkA.FH);
    L23:
        return r2;
    L9:
        if (DW() == true) goto L11;
        r2 = DW(r6);     // Catch: java.lang.Exception -> L18
        goto L11
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    boolean j6(java.lang.String r3) {
        android.content.SharedPreferences.Editor r0 = this.VH.edit();
        r0.putString("existing_instance_identifier", r3);
        return this.VH.j6(r0);
    }
}
