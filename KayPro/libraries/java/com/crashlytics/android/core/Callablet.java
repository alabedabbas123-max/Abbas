package com.crashlytics.android.core;

class Callablet implements java.util.concurrent.Callable<java.lang.Void> {
    final com.crashlytics.android.core.W DW;
    final java.util.Map j6;

    Callablet(com.crashlytics.android.core.W r1, java.util.Map r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public java.lang.Void call() {
        return call2();
    }

    @Override
    public java.lang.Void call2() {
        java.lang.String r0 = com.crashlytics.android.core.W.DW(this.DW);
        new com.crashlytics.android.core.xa(this.DW.Hw()).j6(r0, this.j6);
        return null;
    }
}
