package com.crashlytics.android.core;

class pa extends android.content.BroadcastReceiver {
    final com.crashlytics.android.core.DevicePowerStateListener j6;

    pa(com.crashlytics.android.core.DevicePowerStateListener r1) {
        this.j6 = r1;
    }

    @Override
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
        com.crashlytics.android.core.DevicePowerStateListener.j6(this.j6, false);
    }
}
