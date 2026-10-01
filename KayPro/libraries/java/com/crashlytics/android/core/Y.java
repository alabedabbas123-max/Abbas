package com.crashlytics.android.core;

class Y implements java.lang.Runnable {
    final com.crashlytics.android.core.W.h DW;
    final com.crashlytics.android.core.ClassN j6;

    Y(com.crashlytics.android.core.W.h r1, com.crashlytics.android.core.ClassN r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        this.j6.FH();
    }
}
