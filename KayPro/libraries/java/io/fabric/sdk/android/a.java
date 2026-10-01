package io.fabric.sdk.android;

class a implements android.app.Application.ActivityLifecycleCallbacks {
    final io.fabric.sdk.android.ActivityLifecycleManager.a DW;
    final io.fabric.sdk.android.ActivityLifecycleManager.b j6;

    a(io.fabric.sdk.android.ActivityLifecycleManager.a r1, io.fabric.sdk.android.ActivityLifecycleManager.b r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
        this.j6.j6(r2, r3);
    }

    @Override
    public void onActivityDestroyed(android.app.Activity r2) {
        this.j6.j6(r2);
    }

    @Override
    public void onActivityPaused(android.app.Activity r2) {
        this.j6.DW(r2);
    }

    @Override
    public void onActivityResumed(android.app.Activity r2) {
        this.j6.FH(r2);
    }

    @Override
    public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
        this.j6.DW(r2, r3);
    }

    @Override
    public void onActivityStarted(android.app.Activity r2) {
        this.j6.Hw(r2);
    }

    @Override
    public void onActivityStopped(android.app.Activity r2) {
        this.j6.v5(r2);
    }
}
