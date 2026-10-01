package com.crashlytics.android.answers;

class ClassL extends io.fabric.sdk.android.ActivityLifecycleManager.b {
    private final com.crashlytics.android.answers.q DW;
    private final com.crashlytics.android.answers.F j6;

    public ClassL(com.crashlytics.android.answers.F r1, com.crashlytics.android.answers.q r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void DW(android.app.Activity r3) {
        this.j6.j6(r3, com.crashlytics.android.answers.I.b.FH);
        this.DW.j6();
    }

    @Override
    public void DW(android.app.Activity r1, android.os.Bundle r2) {
    }

    @Override
    public void FH(android.app.Activity r3) {
        this.j6.j6(r3, com.crashlytics.android.answers.I.b.DW);
        this.DW.DW();
    }

    @Override
    public void Hw(android.app.Activity r3) {
        this.j6.j6(r3, com.crashlytics.android.answers.I.b.j6);
    }

    @Override
    public void j6(android.app.Activity r1) {
    }

    @Override
    public void j6(android.app.Activity r1, android.os.Bundle r2) {
    }

    @Override
    public void v5(android.app.Activity r3) {
        this.j6.j6(r3, com.crashlytics.android.answers.I.b.Hw);
    }
}
