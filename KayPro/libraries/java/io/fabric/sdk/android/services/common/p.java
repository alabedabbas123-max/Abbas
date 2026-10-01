package io.fabric.sdk.android.services.common;

class p implements java.util.concurrent.ThreadFactory {
    final java.util.concurrent.atomic.AtomicLong DW;
    final java.lang.String j6;

    p(java.lang.String r1, java.util.concurrent.atomic.AtomicLong r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public java.lang.Thread newThread(java.lang.Runnable r4) {
        java.lang.Thread r5 = java.util.concurrent.Executors.defaultThreadFactory().newThread(new io.fabric.sdk.android.services.common.o(this, r4));
        r5.setName(this.j6 + this.DW.getAndIncrement());
        return r5;
    }
}
