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
        abcd.Qz r0 = null;
        abcd.Qz r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6(r6) == false) { $pc0 = 5; continue $sw0; }
                    r0 = this.DW;
                    r0.j6(r0.edit().putString("advertising_id", r6.j6).putBoolean("limit_ad_tracking_enabled", r6.DW));
                    return;
                }
                case 5: {
                    r7 = this.DW;
                    r7.j6(r7.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static io.fabric.sdk.android.services.common.ClassB j6(io.fabric.sdk.android.services.common.AdvertisingInfoProvider r0) {
        return r0.v5();
    }

    static void j6(io.fabric.sdk.android.services.common.AdvertisingInfoProvider r0, io.fabric.sdk.android.services.common.ClassB r1) {
        r0.FH(r1);
    }

    private boolean j6(io.fabric.sdk.android.services.common.ClassB r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != null) { $pc1 = 4; continue $sw1; }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return false;
                }
                case 4: {
                    if (android.text.TextUtils.isEmpty(r1.j6) == true) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private io.fabric.sdk.android.services.common.ClassB v5() {
        io.fabric.sdk.android.services.common.ClassB r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = FH().j6();
                    if (j6(r0) == true) { $pc2 = 8; continue $sw2; }
                    r0 = Hw().j6();
                    if (j6(r0) == true) { $pc2 = 7; continue $sw2; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "AdvertisingInfo not present");
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return r0;
                }
                case 7: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Service Provider");
                    { $pc2 = 9; continue $sw2; }
                }
                case 8: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Reflection Provider");
                    { $pc2 = 9; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        io.fabric.sdk.android.services.common.ClassB r0 = null;
        io.fabric.sdk.android.services.common.ClassB r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = DW();
                    if (j6(r0) == false) { $pc3 = 6; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Using AdvertisingInfo from Preference Store");
                    DW(r0);
                    return r0;
                }
                case 6: {
                    r1 = v5();
                    FH(r1);
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
