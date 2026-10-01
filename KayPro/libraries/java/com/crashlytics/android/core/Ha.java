package com.crashlytics.android.core;

class Ha implements io.fabric.sdk.android.services.common.z.c {
    final int[] DW;
    final com.crashlytics.android.core.Ia FH;
    final byte[] j6;

    Ha(com.crashlytics.android.core.Ia r1, byte[] r2, int[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void j6(java.io.InputStream r4, int r5) {
        r4.read(this.j6, this.DW[0], r5);     // Catch: java.lang.Throwable -> L5
        int[] r0 = this.DW;     // Catch: java.lang.Throwable -> L5
        r0[0] = r0[0] + r5;     // Catch: java.lang.Throwable -> L5
        r4.close();
        return;
    L5:
        th = move-exception;
        r4.close();
        throw th;
    }
}
