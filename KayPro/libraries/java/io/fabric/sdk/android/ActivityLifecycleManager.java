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
            java.util.Iterator<android.app.Application.ActivityLifecycleCallbacks> r0 = null;
            android.app.Application.ActivityLifecycleCallbacks r1 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.j6.iterator();
                        $pc0 = 4; continue $sw0;
                    }
                    case 4: {
                        if (r0.hasNext() == false) { $pc0 = 6; continue $sw0; }
                        r1 = r0.next();
                        this.DW.unregisterActivityLifecycleCallbacks(r1);
                        { $pc0 = 4; continue $sw0; }
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static void j6(io.fabric.sdk.android.ActivityLifecycleManager.a r0) {
            r0.j6();
        }

        static boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.a r0, io.fabric.sdk.android.ActivityLifecycleManager.b r1) {
            return r0.j6(r1);
        }

        @android.annotation.TargetApi(14)
        private boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.b r2) {
            io.fabric.sdk.android.a r0 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW == null) { $pc1 = 6; continue $sw1; }
                        r0 = new io.fabric.sdk.android.a(this, r2);
                        this.DW.registerActivityLifecycleCallbacks(r0);
                        this.j6.add(r0);
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.j6 = (android.app.Application) r2.getApplicationContext();
                    if (android.os.Build.VERSION.SDK_INT < 14) { $pc2 = 6; continue $sw2; }
                    this.DW = new io.fabric.sdk.android.ActivityLifecycleManager.a(this.j6);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        io.fabric.sdk.android.ActivityLifecycleManager.a r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW;
                    if (r0 == null) { $pc3 = 6; continue $sw3; }
                    io.fabric.sdk.android.ActivityLifecycleManager.a.j6(r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(io.fabric.sdk.android.ActivityLifecycleManager.b r2) {
        io.fabric.sdk.android.ActivityLifecycleManager.a r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (io.fabric.sdk.android.ActivityLifecycleManager.a.j6(r0, r2) == false) { $pc4 = 7; continue $sw4; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
