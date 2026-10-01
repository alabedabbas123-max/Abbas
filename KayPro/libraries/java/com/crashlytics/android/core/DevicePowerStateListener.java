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
        boolean r1 = true;
        if (this.Hw.getAndSet(true) == false) goto L5;
        return;
    L5:
        android.content.Intent r0 = this.v5.registerReceiver(null, j6);
        int r2 = -1;
        if (r0 == null) goto L9;
        r2 = r0.getIntExtra("status", -1);
    L9:
        if (r2 != 2) goto L11;
    L14:
        this.gn = r1;
        this.v5.registerReceiver(this.VH, DW);
        this.v5.registerReceiver(this.Zo, FH);
        return;
    L11:
        if (r2 == 5) goto L14;
        r1 = false;
        goto L14
    }

    public boolean FH() {
        return this.gn;
    }

    public void j6() {
        if (this.Hw.getAndSet(false) == true) goto L5;
        return;
    L5:
        this.v5.unregisterReceiver(this.VH);
        this.v5.unregisterReceiver(this.Zo);
    }
}
