package com.crashlytics.android.core;

class oa extends android.content.BroadcastReceiver {
    final com.crashlytics.android.core.DevicePowerStateListener j6;

    oa(com.crashlytics.android.core.DevicePowerStateListener r1) {
        this.j6 = r1;
    }

    @Override
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
        com.crashlytics.android.core.DevicePowerStateListener.j6(this.j6, true);
    }
}
