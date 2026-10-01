package io.fabric.sdk.android.services.common;

class o extends io.fabric.sdk.android.services.common.g {
    final io.fabric.sdk.android.services.common.p DW;
    final java.lang.Runnable j6;

    o(io.fabric.sdk.android.services.common.p r1, java.lang.Runnable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void j6() {
        this.j6.run();
    }
}
