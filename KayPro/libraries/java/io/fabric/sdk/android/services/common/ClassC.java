package io.fabric.sdk.android.services.common;

class ClassC extends io.fabric.sdk.android.services.common.g {
    final io.fabric.sdk.android.services.common.AdvertisingInfoProvider DW;
    final io.fabric.sdk.android.services.common.ClassB j6;

    ClassC(io.fabric.sdk.android.services.common.AdvertisingInfoProvider r1, io.fabric.sdk.android.services.common.ClassB r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void j6() {
        io.fabric.sdk.android.services.common.ClassB r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = io.fabric.sdk.android.services.common.AdvertisingInfoProvider.j6(this.DW);
                    if (this.j6.equals(r0) == true) { $pc0 = 6; continue $sw0; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    io.fabric.sdk.android.services.common.AdvertisingInfoProvider.j6(this.DW, r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
