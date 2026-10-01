package com.crashlytics.android.core;

class Callableu implements java.util.concurrent.Callable<java.lang.Void> {
    final com.crashlytics.android.core.W j6;

    Callableu(com.crashlytics.android.core.W r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.Void call() {
        return call2();
    }

    @Override
    public java.lang.Void call2() {
        com.crashlytics.android.core.W.VH(this.j6);
        return null;
    }
}
