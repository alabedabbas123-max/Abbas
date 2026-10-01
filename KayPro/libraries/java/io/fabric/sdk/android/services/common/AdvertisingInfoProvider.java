package io.fabric.sdk.android.services.common;

class AdvertisingInfoProvider {
    private final abcd.Qz DW;
    private final android.content.Context j6;

    public AdvertisingInfoProvider(android.content.Context r3) {
        this.j6 = r3.getApplicationContext();
        this.DW = new abcd.Rz(r3, "TwitterAdvertisingInfoPreferences");
    }

    private void DW(io.fabric.sdk.android.services.common.ClassB r3) {
        new java.lang.Thread(new io.fabric.sdk.android.services.common.ClassC(this, r3)).start();
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private void FH(io.fabric.sdk.android.services.common.ClassB r6) {
        if (j6(r6) == false) goto L5;
        abcd.Qz r0 = this.DW;
        r0.j6(r0.edit().putString("advertising_id", r6.j6).putBoolean("limit_ad_tracking_enabled", r6.DW));
        return;
    L5:
        abcd.Qz r7 = this.DW;
        r7.j6(r7.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    static io.fabric.sdk.android.services.common.ClassB j6(io.fabric.sdk.android.services.common.AdvertisingInfoProvider r0) {
        return r0.v5();
    }

    static void j6(io.fabric.sdk.android.services.common.AdvertisingInfoProvider r0, io.fabric.sdk.android.services.common.ClassB r1) {
        r0.FH(r1);
    }

    private boolean j6(io.fabric.sdk.android.services.common.ClassB r1) {
        if (r1 != null) goto L4;
    L6:
        return false;
    L4:
        if (android.text.TextUtils.isEmpty(r1.j6) == true) goto L6;
        return true;
    }

    private io.fabric.sdk.android.services.common.ClassB v5() {
        io.fabric.sdk.android.services.common.ClassB r0 = FH().j6();
        if (j6(r0) == true) goto L8;
        r0 = Hw().j6();
        if (j6(r0) == true) goto L7;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "AdvertisingInfo not present");
    L9:
        return r0;
    L7:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Service Provider");
        goto L9
    L8:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Reflection Provider");
        goto L9
    }

    protected io.fabric.sdk.android.services.common.ClassB DW() {
        return new io.fabric.sdk.android.services.common.ClassB(this.DW.get().getString("advertising_id", ""), this.DW.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    public io.fabric.sdk.android.services.common.e FH() {
        return new io.fabric.sdk.android.services.common.AdvertisingInfoReflectionStrategy(this.j6);
    }

    public io.fabric.sdk.android.services.common.e Hw() {
        return new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy(this.j6);
    }

    public io.fabric.sdk.android.services.common.ClassB j6() {
        io.fabric.sdk.android.services.common.ClassB r0 = DW();
        if (j6(r0) == false) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Preference Store");
        DW(r0);
        return r0;
    L6:
        io.fabric.sdk.android.services.common.ClassB r1 = v5();
        FH(r1);
        return r1;
    }
}
