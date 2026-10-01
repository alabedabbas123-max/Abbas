package com.crashlytics.android.core;

class DevicePowerStateListener {
    private static final android.content.IntentFilter DW = null;
    private static final android.content.IntentFilter FH = null;
    private static final android.content.IntentFilter j6 = null;
    private final java.util.concurrent.atomic.AtomicBoolean Hw;
    private final android.content.BroadcastReceiver VH;
    private final android.content.BroadcastReceiver Zo;
    private boolean gn;
    private final android.content.Context v5;

    static {
        j6 = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        DW = new android.content.IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        FH = new android.content.IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    }

    public DevicePowerStateListener(android.content.Context r2) {
        this.v5 = r2;
        this.VH = new com.crashlytics.android.core.oa(this);
        this.Zo = new com.crashlytics.android.core.pa(this);
        this.Hw = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    static boolean j6(com.crashlytics.android.core.DevicePowerStateListener r0, boolean r1) {
        r0.gn = r1;
        return r1;
    }

    public void DW() {
        boolean r1 = false;
        android.content.Intent r0 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = true;
                    if (this.Hw.getAndSet(true) == false) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    r0 = this.v5.registerReceiver(null, j6);
                    r2 = -1;
                    if (r0 == null) { $pc0 = 9; continue $sw0; }
                    r2 = r0.getIntExtra("status", -1);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r2 != 2) { $pc0 = 11; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    this.gn = r1;
                    this.v5.registerReceiver(this.VH, DW);
                    this.v5.registerReceiver(this.Zo, FH);
                    return;
                }
                case 11: {
                    if (r2 == 5) { $pc0 = 14; continue $sw0; }
                    r1 = false;
                    { $pc0 = 14; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        return this.gn;
    }

    public void j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw.getAndSet(false) == true) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    this.v5.unregisterReceiver(this.VH);
                    this.v5.unregisterReceiver(this.Zo);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
