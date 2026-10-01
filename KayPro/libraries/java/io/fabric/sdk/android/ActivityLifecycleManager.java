package io.fabric.sdk.android;

public class ActivityLifecycleManager {
    private io.fabric.sdk.android.ActivityLifecycleManager.a DW;
    private final android.app.Application j6;

    private static class a {
        private final android.app.Application DW;
        private final java.util.Set<android.app.Application.ActivityLifecycleCallbacks> j6;

        a(android.app.Application r2) {
            this.j6 = new java.util.HashSet();
            this.DW = r2;
        }

        @android.annotation.TargetApi(14)
        private void j6() {
            java.util.Iterator<android.app.Application.ActivityLifecycleCallbacks> r0 = this.j6.iterator();
        L4:
            if (r0.hasNext() == false) goto L6;
            android.app.Application.ActivityLifecycleCallbacks r1 = r0.next();
            this.DW.unregisterActivityLifecycleCallbacks(r1);
            goto L4
        }

        static void j6(io.fabric.sdk.android.ActivityLifecycleManager.a r0) {
            r0.j6();
        }

        static boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.a r0, io.fabric.sdk.android.ActivityLifecycleManager.b r1) {
            return r0.j6(r1);
        }

        @android.annotation.TargetApi(14)
        private boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.b r2) {
            if (this.DW == null) goto L6;
            io.fabric.sdk.android.a r0 = new io.fabric.sdk.android.a(this, r2);
            this.DW.registerActivityLifecycleCallbacks(r0);
            this.j6.add(r0);
            return true;
        L6:
            return false;
        }
    }

    public static abstract class b {
        public b() {
        }

        public void DW(android.app.Activity r1) {
        }

        public void DW(android.app.Activity r1, android.os.Bundle r2) {
        }

        public abstract void FH(android.app.Activity r1);

        public abstract void Hw(android.app.Activity r1);

        public void j6(android.app.Activity r1) {
        }

        public abstract void j6(android.app.Activity r1, android.os.Bundle r2);

        public void v5(android.app.Activity r1) {
        }
    }

    public ActivityLifecycleManager(android.content.Context r2) {
        this.j6 = (android.app.Application) r2.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT < 14) goto L6;
        this.DW = new io.fabric.sdk.android.ActivityLifecycleManager.a(this.j6);
        return;
    }

    public void j6() {
        io.fabric.sdk.android.ActivityLifecycleManager.a r0 = this.DW;
        if (r0 == null) goto L6;
        io.fabric.sdk.android.ActivityLifecycleManager.a.j6(r0);
        return;
    }

    public boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.b r2) {
        io.fabric.sdk.android.ActivityLifecycleManager.a r0 = this.DW;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (io.fabric.sdk.android.ActivityLifecycleManager.a.j6(r0, r2) == false) goto L7;
        return true;
    }
}
