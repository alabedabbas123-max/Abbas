package io.fabric.sdk.android;

class c extends io.fabric.sdk.android.ActivityLifecycleManager.b {
    final io.fabric.sdk.android.Fabric j6;

    c(io.fabric.sdk.android.Fabric r1) {
        this.j6 = r1;
    }

    @Override
    public void FH(android.app.Activity r2) {
        this.j6.setCurrentActivity(r2);
    }

    @Override
    public void Hw(android.app.Activity r2) {
        this.j6.setCurrentActivity(r2);
    }

    @Override
    public void j6(android.app.Activity r1, android.os.Bundle r2) {
        this.j6.setCurrentActivity(r1);
    }
}
