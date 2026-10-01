package abcd;

class Gv implements android.app.Application.ActivityLifecycleCallbacks {
    private java.lang.Class DW;
    private long j6;

    Gv() {
    }

    @Override
    public void onActivityCreated(android.app.Activity r7, android.os.Bundle r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                case 3: {
                    if (abcd.Iv.j6(r7, r7.getIntent()) == false) { $pc0 = 5; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        abcd.kv.j6(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    return;
                }
                case 5: {
                    if (abcd.Hv.j6(r7.getIntent()) == false) { $pc0 = 11; continue $sw0; }
                    if (this.DW == r7.getClass()) { $pc0 = 9; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        abcd.kv.j6(new com.appfour.backbone.api.objects.UserLaunchAction(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    { $pc0 = 11; continue $sw0; }
                }
                case 9: {
                    if (this.j6 >= (java.lang.System.currentTimeMillis() - 1000)) { $pc0 = 11; continue $sw0; }
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onActivityDestroyed(android.app.Activity r3) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.j6 = java.lang.System.currentTimeMillis();
                        this.DW = r3.getClass();
                        abcd.iw.j6(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 4; continue $sw1;
                    }
                    return;
                }
                case 4: {
                    th = $ex1;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onActivityPaused(android.app.Activity r3) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                case 3: {
                    if (r3 != abcd.Hv.VH()) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.Hv.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        abcd.iw.j6(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onActivityResumed(android.app.Activity r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        abcd.Hv.Zo();
                        abcd.ow.VH();
                        abcd.sw.DW();
                        abcd.Hv.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 4; continue $sw3;
                    }
                    return;
                }
                case 4: {
                    th = $ex3;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
    }

    @Override
    public void onActivityStarted(android.app.Activity r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        abcd.kv.DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 4; continue $sw4;
                    }
                    return;
                }
                case 4: {
                    th = $ex4;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onActivityStopped(android.app.Activity r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        abcd.kv.FH(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 4; continue $sw5;
                    }
                    return;
                }
                case 4: {
                    th = $ex5;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
