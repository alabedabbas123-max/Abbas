package abcd;

class Gv implements android.app.Application.ActivityLifecycleCallbacks {
    private java.lang.Class DW;
    private long j6;

    Gv() {
    }

    @Override
    public void onActivityCreated(android.app.Activity r7, android.os.Bundle r8) {
    L13:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Iv.j6(r7, r7.getIntent()) == false) goto L5;
    L11:
        abcd.kv.j6(r7);     // Catch: java.lang.Throwable -> L13
        return;
    L5:
        if (abcd.Hv.j6(r7.getIntent()) == false) goto L11;
        if (this.DW == r7.getClass()) goto L9;
    L10:
        abcd.kv.j6(new com.appfour.backbone.api.objects.UserLaunchAction(r7));     // Catch: java.lang.Throwable -> L13
        goto L11
    L9:
        if (this.j6 >= (java.lang.System.currentTimeMillis() - 1000)) goto L11;
        goto L10
    }

    @Override
    public void onActivityDestroyed(android.app.Activity r3) {
        this.j6 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L4
        this.DW = r3.getClass();     // Catch: java.lang.Throwable -> L4
        abcd.iw.j6(-1);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    @Override
    public void onActivityPaused(android.app.Activity r3) {
    L7:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (r3 != abcd.Hv.VH()) goto L5;
        abcd.Hv.j6(null);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.iw.j6(-1);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public void onActivityResumed(android.app.Activity r2) {
        abcd.Hv.Zo();     // Catch: java.lang.Throwable -> L4
        abcd.ow.VH();     // Catch: java.lang.Throwable -> L4
        abcd.sw.DW();     // Catch: java.lang.Throwable -> L4
        abcd.Hv.j6(r2);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    @Override
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
    }

    @Override
    public void onActivityStarted(android.app.Activity r2) {
        abcd.kv.DW(r2);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    @Override
    public void onActivityStopped(android.app.Activity r2) {
        abcd.kv.FH(r2);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }
}
